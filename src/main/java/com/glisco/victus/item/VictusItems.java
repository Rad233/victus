package com.glisco.victus.item;

import com.glisco.victus.Victus;
import com.glisco.victus.hearts.content.*;
import net.minecraft.item.Item;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.TextColor;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.registry.Registry;

public class VictusItems {

    public static final Item GRILLED_HEART_ASPECT = new HeartAspectItem(GrilledAspect.TYPE);
    public static final Item BUNDLE_HEART_ASPECT = new HeartAspectItem(BundleAspect.TYPE);
    public static final Item CREEPER_HEART_ASPECT = new HeartAspectItem(CreeperAspect.TYPE);
    public static final Item DIAMOND_HEART_ASPECT = new HeartAspectItem(DiamondAspect.TYPE);
    public static final Item LIGHT_HEART_ASPECT = new HeartAspectItem(LightAspect.TYPE);
    public static final Item OCEAN_HEART_ASPECT = new HeartAspectItem(OceanAspect.TYPE);
    public static final Item TOTEM_HEART_ASPECT = new HeartAspectItem(TotemAspect.TYPE);
    public static final Item POTION_HEART_ASPECT = new HeartAspectItem(PotionAspect.TYPE);
    public static final Item ARCHERY_HEART_ASPECT = new HeartAspectItem(ArcheryAspect.TYPE);
    public static final Item BLAZING_HEART_ASPECT = new HeartAspectItem(BlazingAspect.TYPE);
    public static final Item DRACONIC_HEART_ASPECT = new HeartAspectItem(DraconicAspect.TYPE);
    public static final Item EMERALD_HEART_ASPECT = new HeartAspectItem(EmeraldAspect.TYPE);
    public static final Item EVOKING_HEART_ASPECT = new HeartAspectItem(EvokingAspect.TYPE);
    public static final Item GOLDEN_HEART_ASPECT = new HeartAspectItem(GoldenAspect.TYPE);
    public static final Item ICY_HEART_ASPECT = new HeartAspectItem(IcyAspect.TYPE);
    public static final Item IRON_HEART_ASPECT = new HeartAspectItem(IronAspect.TYPE);
    public static final Item LAPIS_HEART_ASPECT = new HeartAspectItem(LapisAspect.TYPE);
    public static final Item SWEET_HEART_ASPECT = new HeartAspectItem(SweetAspect.TYPE);

    public static final Item VOID_HEART_ASPECT = new VoidAspectItem();
    public static final Item BROKEN_HEART = new BrokenHeartItem();
    public static final Item BLANK_HEART_ASPECT = new BlankAspectItem();

    public static final Item VICTUS_JOURNAL = new VictusJournalItem();

    public static MutableText coloredTranslationWithPrefix(String key, int color) {
        return new TranslatableText("victus.aspect_item_prefix").append(new TranslatableText(key).setStyle(Style.EMPTY.withColor(TextColor.fromRgb(color))));
    }
    
    public static void register(){
        Registry.register(Registry.ITEM, Victus.id("grilled_heart_aspect"), GRILLED_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("bundle_heart_aspect"), BUNDLE_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("creeper_heart_aspect"), CREEPER_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("diamond_heart_aspect"), DIAMOND_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("light_heart_aspect"), LIGHT_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("ocean_heart_aspect"), OCEAN_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("totem_heart_aspect"), TOTEM_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("potion_heart_aspect"), POTION_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("archery_heart_aspect"), ARCHERY_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("blazing_heart_aspect"), BLAZING_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("draconic_heart_aspect"), DRACONIC_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("emerald_heart_aspect"), EMERALD_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("evoking_heart_aspect"), EVOKING_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("golden_heart_aspect"), GOLDEN_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("icy_heart_aspect"), ICY_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("iron_heart_aspect"), IRON_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("lapis_heart_aspect"), LAPIS_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("sweet_heart_aspect"), SWEET_HEART_ASPECT);

        Registry.register(Registry.ITEM, Victus.id("void_heart_aspect"), VOID_HEART_ASPECT);
        Registry.register(Registry.ITEM, Victus.id("broken_heart"), BROKEN_HEART);
        Registry.register(Registry.ITEM, Victus.id("blank_heart_aspect"), BLANK_HEART_ASPECT);

        Registry.register(Registry.ITEM, Victus.id("victus_journal"), VICTUS_JOURNAL);
    }
}
