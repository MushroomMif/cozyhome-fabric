package net.luckystudio.cozyhome.item;

import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.item.custom.CushionItem;
import net.luckystudio.cozyhome.item.custom.DyeableCushionItem;
import net.luckystudio.cozyhome.item.custom.PaintBrushItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ModItems {

    // Register Items Here
    public static final Item PAINT_BRUSH = registerItem("paint_brush", PaintBrushItem::new);
    public static final Item CUSHION = registerItem("cushion", DyeableCushionItem::new);
    public static final Item HAY_CUSHION = registerItem("hay_cushion", CushionItem::new);
    public static final Item TRADER_CUSHION = registerItem("trader_cushion", CushionItem::new,
            settings -> settings.rarity(Rarity.UNCOMMON));

    // Helper Method to register items
    private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory) {
        return registerItem(name, itemFactory, settings -> settings);
    }

    private static Item registerItem(
            String name, Function<Item.Settings, Item> itemFactory,
            UnaryOperator<Item.Settings> settingsModifier
    ) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CozyHome.MOD_ID, name));
        Item.Settings settings = settingsModifier.apply(new Item.Settings().registryKey(key));
        Item item = itemFactory.apply(settings);
        return Registry.register(Registries.ITEM, key, item);
    }

    private static RegistryKey<Item> key(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CozyHome.MOD_ID, id));
    }

    public static void registerModItems() {
        CozyHome.LOGGER.info("Registering Mod Items for " + CozyHome.MOD_ID);
    }
}
