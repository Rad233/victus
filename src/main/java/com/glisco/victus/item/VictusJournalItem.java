package com.glisco.victus.item;

import com.glisco.victus.Victus;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import vazkii.patchouli.api.PatchouliAPI;
import vazkii.patchouli.common.base.PatchouliSounds;
import vazkii.patchouli.common.book.Book;
import vazkii.patchouli.common.book.BookRegistry;

public class VictusJournalItem extends Item {

    private static final Identifier VICTUS_GUIDE = Victus.id("victus_guide");

    public VictusJournalItem() {
        super(new Settings().maxCount(1).group(Victus.VICTUS_GROUP));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        Book book = BookRegistry.INSTANCE.books.get(VICTUS_GUIDE);

        if (!world.isClient()) {
            PatchouliAPI.get().openBookGUI((ServerPlayerEntity) player, book.id);
            player.playSound(PatchouliSounds.getSound(book.openSound, PatchouliSounds.BOOK_OPEN), 1, (float) (0.7 + Math.random() * 0.4));
        }

        return TypedActionResult.success(stack);
    }
}
