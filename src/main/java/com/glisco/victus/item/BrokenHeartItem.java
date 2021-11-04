package com.glisco.victus.item;

import com.glisco.victus.Victus;
import com.glisco.victus.hearts.HeartAspectComponent;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BrokenHeartItem extends EdibleItem {

    public BrokenHeartItem() {
        super(new Settings().group(Victus.VICTUS_GROUP).food(new FoodComponent.Builder().alwaysEdible().build()).maxCount(1));
    }

    @Override
    void onEaten(ItemStack stack, World world, PlayerEntity eater) {
        HeartAspectComponent aspects = Victus.ASPECTS.get(eater);
        while (!aspects.empty()) {
            eater.dropItem(Victus.ASPECTS.get(eater).removeAspect());
        }

        eater.damage(DamageSource.MAGIC, 15f);
    }
}
