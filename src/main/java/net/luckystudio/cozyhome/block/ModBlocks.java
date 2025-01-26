package net.luckystudio.cozyhome.block;

import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.block.custom.*;
import net.luckystudio.cozyhome.block.custom.counters.CounterBlock;
import net.luckystudio.cozyhome.block.custom.counters.SinkCounterBlock;
import net.luckystudio.cozyhome.block.custom.counters.StorageCounterBlock;
import net.luckystudio.cozyhome.block.custom.lamps.*;
import net.luckystudio.cozyhome.block.util.ModBlockUtilities;
import net.luckystudio.cozyhome.item.custom.DyedBlockItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {

    private static AbstractBlock.Settings createCounterBlockSettings(Block block, Boolean requiresTool, Boolean burnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(block);
        if (requiresTool) settings.requiresTool();
        if (burnable) settings.burnable();
        return settings;
    }

    private static AbstractBlock.Settings createStorageCounterBlockSettings(Block block, Boolean requiresTool, Boolean burnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(block);
        if (requiresTool) settings.requiresTool();
        if (burnable) settings.burnable();
        return settings;
    }

    private static AbstractBlock.Settings createChairSettings(float hardness, float resistance, BlockSoundGroup soundGroup, Boolean requiresTool, Boolean burnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create();
        if (requiresTool) settings.requiresTool();
        if (burnable) settings.burnable();
        settings.hardness(hardness).resistance(resistance).sounds(soundGroup).dynamicBounds();
        return settings;
    }

    private static AbstractBlock.Settings createTableSettings(Block block) {
        return AbstractBlock.Settings.copy(block).dynamicBounds();
    }

    private static AbstractBlock.Settings createShelfTableSettings(Block block) {
        return AbstractBlock.Settings.copy(block).dynamicBounds();
    }

    private static AbstractBlock.Settings createWallClockSettings(Block block) {
        return AbstractBlock.Settings.copy(block)
                .breakInstantly()
                .dynamicBounds();
    }

    private static AbstractBlock.Settings createGrandfatherClockSettings( BlockSoundGroup soundGroup) {
        return AbstractBlock.Settings.create()
                .hardness(2)
                .strength(3)
                .burnable()
                .sounds(soundGroup)
                .dynamicBounds();
    }

    private static AbstractBlock.Settings createGenericLampSettings() {
        return AbstractBlock.Settings.create()
                .luminance(createLightLevelFromLitBlockState(10))
                .emissiveLighting((state, world, pos) -> state.get(Properties.LIT))
                .breakInstantly()
                .dynamicBounds()
                .sounds(BlockSoundGroup.LANTERN);
    }

    private static AbstractBlock.Settings createSofaSettings(Block block) {
        return AbstractBlock.Settings.copy(block).dynamicBounds();
    }

    private static AbstractBlock.Settings createCouchSettings(Block block) {
        return AbstractBlock.Settings.copy(block).dynamicBounds();
    }

    private static AbstractBlock.Settings createDeskSettings(Block block) {
        return AbstractBlock.Settings.copy(block);
    }

    private static AbstractBlock.Settings createDrawerSettings(Block block) {
        return AbstractBlock.Settings.copy(block);
    }

    private static AbstractBlock.Settings createFountainSettings(float hardness, float resistance, BlockSoundGroup soundGroup) {
        return AbstractBlock.Settings.create()
                .ticksRandomly()
                .luminance(ModBlockUtilities.createLightLevelFromContainsBlockState(15))
                .solid()
                .requiresTool()
                .hardness(hardness)
                .strength(resistance)
                .sounds(soundGroup)
                .dynamicBounds();
    }

    private static AbstractBlock.Settings createFountainSproutSettings(float hardness, float resistance, BlockSoundGroup soundGroup) {
        return AbstractBlock.Settings.create()
                .luminance(ModBlockUtilities.createLightLevelFromContainsBlockState(15))
                .solid()
                .hardness(hardness)
                .strength(resistance)
                .sounds(soundGroup)
                .dynamicBounds();
    }

    private static AbstractBlock.Settings createChimneySettings(float hardness, float resistance, BlockSoundGroup soundGroup) {
        return AbstractBlock.Settings.create()
                .solid()
                .requiresTool()
                .hardness(hardness)
                .strength(resistance)
                .sounds(soundGroup)
                .dynamicBounds();
    }

    private static AbstractBlock.Settings createLargeStumpSettings(BlockSoundGroup soundGroup) {
        return AbstractBlock.Settings.create()
                .solid()
                .requiresTool()
                .hardness(2)
                .strength(2)
                .sounds(soundGroup)
                .dynamicBounds();
    }

    // Counters
    public static final Block OAK_COUNTER = registerBlock("oak_counter", CounterBlock::new, createCounterBlockSettings(Blocks.OAK_PLANKS, false, true));
    public static final Block SPRUCE_COUNTER = registerBlock("spruce_counter", CounterBlock::new, createCounterBlockSettings(Blocks.SPRUCE_PLANKS, false, true));
    public static final Block BIRCH_COUNTER = registerBlock("birch_counter", CounterBlock::new, createCounterBlockSettings(Blocks.BIRCH_PLANKS, false, true));
    public static final Block JUNGLE_COUNTER = registerBlock("jungle_counter", CounterBlock::new, createCounterBlockSettings(Blocks.JUNGLE_PLANKS, false, true));
    public static final Block ACACIA_COUNTER = registerBlock("acacia_counter", CounterBlock::new, createCounterBlockSettings(Blocks.ACACIA_PLANKS, false, true));
    public static final Block DARK_OAK_COUNTER = registerBlock("dark_oak_counter", CounterBlock::new, createCounterBlockSettings(Blocks.DARK_OAK_PLANKS, false, true));
    public static final Block MANGROVE_COUNTER = registerBlock("mangrove_counter", CounterBlock::new, createCounterBlockSettings(Blocks.MANGROVE_PLANKS, false, true));
    public static final Block CHERRY_COUNTER = registerBlock("cherry_counter", CounterBlock::new, createCounterBlockSettings(Blocks.CHERRY_PLANKS, false, true));
    public static final Block BAMBOO_COUNTER = registerBlock("bamboo_counter", CounterBlock::new, createCounterBlockSettings(Blocks.BAMBOO_PLANKS, false, true));
    public static final Block CRIMSON_COUNTER = registerBlock("crimson_counter", CounterBlock::new, createCounterBlockSettings(Blocks.CRIMSON_PLANKS, false, false));
    public static final Block WARPED_COUNTER = registerBlock("warped_counter", CounterBlock::new, createCounterBlockSettings(Blocks.WARPED_PLANKS, false, false));

    // Storage Counters
    public static final Block OAK_STORAGE_COUNTER = registerBlock("oak_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.OAK_PLANKS, false, true));
    public static final Block SPRUCE_STORAGE_COUNTER = registerBlock("spruce_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.SPRUCE_PLANKS, false, true));
    public static final Block BIRCH_STORAGE_COUNTER = registerBlock("birch_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.BIRCH_PLANKS, false, true));
    public static final Block JUNGLE_STORAGE_COUNTER = registerBlock("jungle_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.JUNGLE_PLANKS, false, true));
    public static final Block ACACIA_STORAGE_COUNTER = registerBlock("acacia_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.ACACIA_PLANKS, false, true));
    public static final Block DARK_OAK_STORAGE_COUNTER = registerBlock("dark_oak_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.DARK_OAK_PLANKS, false, true));
    public static final Block MANGROVE_STORAGE_COUNTER = registerBlock("mangrove_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.MANGROVE_PLANKS, false, true));
    public static final Block CHERRY_STORAGE_COUNTER = registerBlock("cherry_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.CHERRY_PLANKS, false, true));
    public static final Block BAMBOO_STORAGE_COUNTER = registerBlock("bamboo_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.BAMBOO_PLANKS, false, true));
    public static final Block CRIMSON_STORAGE_COUNTER = registerBlock("crimson_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.CRIMSON_PLANKS, false, false));
    public static final Block WARPED_STORAGE_COUNTER = registerBlock("warped_storage_counter", StorageCounterBlock::new, createStorageCounterBlockSettings(Blocks.WARPED_PLANKS, false, false));

    // Sink Counters
    public static final Block OAK_SINK_COUNTER = registerCounter("oak_sink_counter");
    public static final Block SPRUCE_SINK_COUNTER = registerCounter("spruce_sink_counter");
    public static final Block BIRCH_SINK_COUNTER = registerCounter("birch_sink_counter");
    public static final Block JUNGLE_SINK_COUNTER = registerCounter("jungle_sink_counter");
    public static final Block ACACIA_SINK_COUNTER = registerCounter("acacia_sink_counter");
    public static final Block DARK_OAK_SINK_COUNTER = registerCounter("dark_oak_sink_counter");
    public static final Block MANGROVE_SINK_COUNTER = registerCounter("mangrove_sink_counter");
    public static final Block CHERRY_SINK_COUNTER = registerCounter("cherry_sink_counter");
    public static final Block BAMBOO_SINK_COUNTER = registerCounter("bamboo_sink_counter");
    public static final Block CRIMSON_SINK_COUNTER = registerCounter("crimson_sink_counter");
    public static final Block WARPED_SINK_COUNTER = registerCounter("warped_sink_counter");
    
    private static Block registerCounter(String name) {
        return registerBlock(name, SinkCounterBlock::new, AbstractBlock.Settings.copy(Blocks.CAULDRON));
    }

    // Tables
    public static final Block OAK_TABLE = registerBlock("oak_table", TableBlock::new, createTableSettings(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_TABLE = registerBlock("spruce_table", TableBlock::new, createTableSettings(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_TABLE = registerBlock("birch_table", TableBlock::new, createTableSettings(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_TABLE = registerBlock("jungle_table", TableBlock::new, createTableSettings(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_TABLE = registerBlock("acacia_table", TableBlock::new, createTableSettings(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table", TableBlock::new, createTableSettings(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_TABLE = registerBlock("mangrove_table", TableBlock::new, createTableSettings(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_TABLE = registerBlock("cherry_table", TableBlock::new, createTableSettings(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_TABLE = registerBlock("bamboo_table", TableBlock::new, createTableSettings(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_TABLE = registerBlock("crimson_table", TableBlock::new, createTableSettings(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_TABLE = registerBlock("warped_table", TableBlock::new, createTableSettings(Blocks.WARPED_PLANKS));
    public static final Block IRON_TABLE = registerBlock("iron_table", ShelfTableBlock::new, createShelfTableSettings(Blocks.IRON_BLOCK));
    public static final Block GLASS_TABLE = registerBlock("glass_table", ShelfTableBlock::new, createShelfTableSettings(Blocks.IRON_BLOCK));
    public static final Block UNDEAD_TABLE = registerBlock("undead_table", TableBlock::new, AbstractBlock.Settings.create()
            .hardness(5)
            .resistance(5)
            .sounds(BlockSoundGroup.VAULT)
            .dynamicBounds());

    public static final Block OMINOUS_TABLE = registerBlock("ominous_table", TableBlock::new, AbstractBlock.Settings.create()
            .hardness(5)
            .resistance(5)
            .sounds(BlockSoundGroup.TRIAL_SPAWNER)
            .dynamicBounds());

    // Chairs
    public static final Block OAK_CHAIR = registerBlock("oak_chair", settings -> new ChairBlock(ChairBlock.Type.OAK, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair", settings -> new ChairBlock(ChairBlock.Type.SPRUCE, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair", settings -> new ChairBlock(ChairBlock.Type.BIRCH, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair", settings -> new ChairBlock(ChairBlock.Type.JUNGLE, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair", settings -> new ChairBlock(ChairBlock.Type.ACACIA, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair", settings -> new ChairBlock(ChairBlock.Type.DARK_OAK, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair", settings -> new ChairBlock(ChairBlock.Type.MANGROVE, settings), createChairSettings(2, 3, BlockSoundGroup.WOOD, false, true));
    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair", settings -> new ChairBlock(ChairBlock.Type.CHERRY, settings), createChairSettings(2, 3, BlockSoundGroup.CHERRY_WOOD, false, true));
    public static final Block BAMBOO_CHAIR = registerBlock("bamboo_chair", settings -> new ChairBlock(ChairBlock.Type.BAMBOO, settings), createChairSettings(2, 3, BlockSoundGroup.BAMBOO_WOOD, false, true));
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair", settings -> new ChairBlock(ChairBlock.Type.CRIMSON, settings), createChairSettings(2, 3, BlockSoundGroup.NETHER_WOOD, false, false));
    public static final Block WARPED_CHAIR = registerBlock("warped_chair", settings -> new ChairBlock(ChairBlock.Type.WARPED, settings), createChairSettings(2, 3, BlockSoundGroup.NETHER_WOOD, false, false));
    public static final Block IRON_CHAIR = registerBlock("iron_chair", settings -> new ChairBlock(ChairBlock.Type.IRON, settings), createChairSettings(2, 3, BlockSoundGroup.METAL, true, false));
    public static final Block GLASS_CHAIR = registerBlock("glass_chair", settings -> new ChairBlock(ChairBlock.Type.GLASS, settings), createChairSettings(2, 3, BlockSoundGroup.GLASS, true, false));
    public static final Block UNDEAD_CHAIR = registerBlock("undead_chair", settings -> new ChairBlock(ChairBlock.Type.UNDEAD, settings), createChairSettings(2, 3, BlockSoundGroup.VAULT, true, false));
    public static final Block OMINOUS_CHAIR = registerBlock("ominous_chair", settings -> new ChairBlock(ChairBlock.Type.OMINOUS, settings), createChairSettings(2, 3, BlockSoundGroup.TRIAL_SPAWNER, true, false));

    // Wall Clocks
    public static final Block OAK_WALL_CLOCK = registerBlock("oak_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.OAK, settings),  createWallClockSettings(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_WALL_CLOCK = registerBlock("spruce_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.SPRUCE, settings), createWallClockSettings(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_WALL_CLOCK = registerBlock("birch_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.BIRCH, settings), createWallClockSettings(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_WALL_CLOCK = registerBlock("jungle_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.JUNGLE, settings), createWallClockSettings(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_WALL_CLOCK = registerBlock("acacia_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.ACACIA, settings), createWallClockSettings(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_WALL_CLOCK = registerBlock("dark_oak_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.DARK_OAK, settings), createWallClockSettings(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_WALL_CLOCK = registerBlock("mangrove_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.MANGROVE, settings), createWallClockSettings(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_WALL_CLOCK = registerBlock("cherry_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.CHERRY, settings), createWallClockSettings( Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_WALL_CLOCK = registerBlock("bamboo_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.BAMBOO, settings), createWallClockSettings(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_WALL_CLOCK = registerBlock("crimson_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.CRIMSON, settings), createWallClockSettings(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_WALL_CLOCK = registerBlock("warped_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.WARPED, settings), createWallClockSettings(Blocks.WARPED_PLANKS));
    public static final Block IRON_WALL_CLOCK = registerBlock("iron_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.IRON, settings), createWallClockSettings(Blocks.IRON_BLOCK));
    public static final Block GLASS_WALL_CLOCK = registerBlock("glass_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.GLASS, settings), createWallClockSettings(Blocks.GLASS));
    public static final Block UNDEAD_WALL_CLOCK = registerBlock("undead_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.UNDEAD, settings),
            AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.VAULT));
    public static final Block OMINOUS_WALL_CLOCK = registerBlock("ominous_wall_clock", settings -> new WallClockBlock(WallClockBlock.Type.OMINOUS, settings),
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.TRIAL_SPAWNER));

    // Grandfather Clocks
    public static final Block OAK_GRANDFATHER_CLOCK = registerBlock("oak_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.OAK, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_GRANDFATHER_CLOCK = registerBlock("spruce_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.SPRUCE, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block BIRCH_GRANDFATHER_CLOCK = registerBlock("birch_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.BIRCH, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_GRANDFATHER_CLOCK = registerBlock("jungle_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.JUNGLE, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block ACACIA_GRANDFATHER_CLOCK = registerBlock("acacia_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.ACACIA, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_GRANDFATHER_CLOCK = registerBlock("dark_oak_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.DARK_OAK, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_GRANDFATHER_CLOCK = registerBlock("mangrove_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.MANGROVE, settings), createGrandfatherClockSettings(BlockSoundGroup.WOOD));
    public static final Block CHERRY_GRANDFATHER_CLOCK = registerBlock("cherry_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.CHERRY, settings), createGrandfatherClockSettings(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BAMBOO_GRANDFATHER_CLOCK = registerBlock("bamboo_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.BAMBOO, settings), createGrandfatherClockSettings(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block CRIMSON_GRANDFATHER_CLOCK = registerBlock("crimson_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.CRIMSON, settings), createGrandfatherClockSettings(BlockSoundGroup.NETHER_WOOD));
    public static final Block WARPED_GRANDFATHER_CLOCK = registerBlock("warped_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.WARPED, settings), createGrandfatherClockSettings(BlockSoundGroup.NETHER_WOOD));
    public static final Block IRON_GRANDFATHER_CLOCK = registerBlock("iron_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.IRON, settings), createGrandfatherClockSettings(BlockSoundGroup.METAL));
    public static final Block GLASS_GRANDFATHER_CLOCK = registerBlock("glass_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.GLASS, settings), createGrandfatherClockSettings(BlockSoundGroup.GLASS));
    public static final Block UNDEAD_GRANDFATHER_CLOCK = registerBlock("undead_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.UNDEAD, settings), createGrandfatherClockSettings(BlockSoundGroup.VAULT));
    public static final Block OMINOUS_GRANDFATHER_CLOCK = registerBlock("ominous_grandfather_clock", settings -> new GrandfatherClockBlock(GrandfatherClockBlock.Type.OMINOUS, settings), createGrandfatherClockSettings(BlockSoundGroup.TRIAL_SPAWNER));

    // Lamps
    public static final Block OAK_LAMP = registerBlock("oak_lamp", GenericLampBlock::new, createGenericLampSettings(), true);
    public static final Block SPRUCE_LAMP = registerBlock("spruce_lamp", SpruceLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block BIRCH_LAMP = registerBlock("birch_lamp", GenericLampBlock::new, createGenericLampSettings(), true);
    public static final Block JUNGLE_LAMP = registerBlock("jungle_lamp", JungleLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block ACACIA_LAMP = registerBlock("acacia_lamp", GenericLampBlock::new, createGenericLampSettings(), true);
    public static final Block DARK_OAK_LAMP = registerBlock("dark_oak_lamp", DarkOakLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block MANGROVE_LAMP = registerBlock("mangrove_lamp", MangroveLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block CHERRY_LAMP = registerBlock("cherry_lamp", GenericLampBlock::new, createGenericLampSettings(), true);
    public static final Block BAMBOO_LAMP = registerBlock("bamboo_lamp", BambooLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block CRIMSON_LAMP = registerBlock("crimson_lamp", CrimsonLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP));
    public static final Block WARPED_LAMP = registerBlock("warped_lamp", WarpedLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP));
    public static final Block IRON_LAMP = registerBlock("iron_lamp", IronLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block GLASS_LAMP = registerBlock("glass_lamp", GlassLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block UNDEAD_LAMP = registerBlock("undead_lamp", UndeadLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);
    public static final Block OMINOUS_LAMP = registerBlock("ominous_lamp", OminousLampBlock::new, AbstractBlock.Settings.copy(ModBlocks.OAK_LAMP), true);;

    // Sofas
    public static final Block OAK_SOFA = registerBlock("oak_sofa", settings -> new SofaBlock(SofaBlock.Type.OAK, settings), createSofaSettings(Blocks.OAK_PLANKS), true);
    public static final Block SPRUCE_SOFA = registerBlock("spruce_sofa", settings -> new SofaBlock(SofaBlock.Type.SPRUCE, settings), createSofaSettings(Blocks.SPRUCE_PLANKS), true);
    public static final Block BIRCH_SOFA = registerBlock("birch_sofa", settings -> new SofaBlock(SofaBlock.Type.BIRCH, settings), createSofaSettings(Blocks.BIRCH_PLANKS), true);
    public static final Block JUNGLE_SOFA = registerBlock("jungle_sofa", settings -> new SofaBlock(SofaBlock.Type.JUNGLE, settings), createSofaSettings(Blocks.JUNGLE_PLANKS), true);
    public static final Block ACACIA_SOFA = registerBlock("acacia_sofa", settings -> new SofaBlock(SofaBlock.Type.ACACIA, settings), createSofaSettings(Blocks.ACACIA_PLANKS), true);
    public static final Block DARK_OAK_SOFA = registerBlock("dark_oak_sofa", settings -> new SofaBlock(SofaBlock.Type.DARK_OAK, settings), createSofaSettings(Blocks.DARK_OAK_PLANKS), true);
    public static final Block MANGROVE_SOFA = registerBlock("mangrove_sofa", settings -> new SofaBlock(SofaBlock.Type.MANGROVE, settings), createSofaSettings(Blocks.MANGROVE_PLANKS), true);
    public static final Block CHERRY_SOFA = registerBlock("cherry_sofa", settings -> new SofaBlock(SofaBlock.Type.CHERRY, settings), createSofaSettings(Blocks.CHERRY_PLANKS), true);
    public static final Block BAMBOO_SOFA = registerBlock("bamboo_sofa", settings -> new SofaBlock(SofaBlock.Type.BAMBOO, settings), createSofaSettings(Blocks.BAMBOO_PLANKS), true);
    public static final Block CRIMSON_SOFA = registerBlock("crimson_sofa", settings -> new SofaBlock(SofaBlock.Type.CRIMSON, settings), createSofaSettings(Blocks.CRIMSON_PLANKS), true);
    public static final Block WARPED_SOFA = registerBlock("warped_sofa", settings -> new SofaBlock(SofaBlock.Type.WARPED, settings), createSofaSettings(Blocks.WARPED_PLANKS), true);

    // Couches
    public static final Block OAK_COUCH = registerBlock("oak_couch", CouchBlock::new, createCouchSettings(Blocks.OAK_PLANKS), true);
    public static final Block SPRUCE_COUCH = registerBlock("spruce_couch", CouchBlock::new, createCouchSettings(Blocks.SPRUCE_PLANKS), true);
    public static final Block BIRCH_COUCH = registerBlock("birch_couch", CouchBlock::new, createCouchSettings(Blocks.BIRCH_PLANKS), true);
    public static final Block JUNGLE_COUCH = registerBlock("jungle_couch", CouchBlock::new, createCouchSettings(Blocks.JUNGLE_PLANKS), true);
    public static final Block ACACIA_COUCH = registerBlock("acacia_couch", CouchBlock::new, createCouchSettings(Blocks.ACACIA_PLANKS), true);
    public static final Block DARK_OAK_COUCH = registerBlock("dark_oak_couch", CouchBlock::new, createCouchSettings(Blocks.DARK_OAK_PLANKS), true);
    public static final Block MANGROVE_COUCH = registerBlock("mangrove_couch", CouchBlock::new, createCouchSettings(Blocks.MANGROVE_PLANKS), true);
    public static final Block CHERRY_COUCH = registerBlock("cherry_couch", CouchBlock::new, createCouchSettings(Blocks.CHERRY_PLANKS), true);
    public static final Block BAMBOO_COUCH = registerBlock("bamboo_couch", CouchBlock::new, createCouchSettings(Blocks.BAMBOO_PLANKS), true);
    public static final Block CRIMSON_COUCH = registerBlock("crimson_couch", CouchBlock::new, createCouchSettings(Blocks.CRIMSON_PLANKS), true);
    public static final Block WARPED_COUCH = registerBlock("warped_couch", CouchBlock::new, createCouchSettings(Blocks.WARPED_PLANKS), true);

    // Desks
    public static final Block OAK_DESK = registerBlock("oak_desk", DeskBlock::new, createDeskSettings(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_DESK = registerBlock("spruce_desk", DeskBlock::new, createDeskSettings(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_DESK = registerBlock("birch_desk", DeskBlock::new, createDeskSettings(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_DESK = registerBlock("jungle_desk", DeskBlock::new, createDeskSettings(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_DESK = registerBlock("acacia_desk", DeskBlock::new, createDeskSettings(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_DESK = registerBlock("dark_oak_desk", DeskBlock::new, createDeskSettings(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_DESK = registerBlock("mangrove_desk", DeskBlock::new, createDeskSettings(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_DESK = registerBlock("cherry_desk", DeskBlock::new, createDeskSettings(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_DESK = registerBlock("bamboo_desk", DeskBlock::new, createDeskSettings(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_DESK = registerBlock("crimson_desk", DeskBlock::new, createDeskSettings(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_DESK = registerBlock("warped_desk", DeskBlock::new, createDeskSettings(Blocks.WARPED_PLANKS));

    // Drawers
    public static final Block OAK_DRAWER = registerBlock("oak_drawer", settings -> new DrawerBlock(Blocks.OAK_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_DRAWER = registerBlock("spruce_drawer", settings -> new DrawerBlock(Blocks.SPRUCE_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer", settings -> new DrawerBlock(Blocks.BIRCH_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_DRAWER = registerBlock("jungle_drawer", settings -> new DrawerBlock(Blocks.JUNGLE_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_DRAWER = registerBlock("acacia_drawer", settings -> new DrawerBlock(Blocks.ACACIA_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_DRAWER = registerBlock("dark_oak_drawer", settings -> new DrawerBlock(Blocks.DARK_OAK_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.DARK_OAK_PLANKS));
    public static final Block MANGROVE_DRAWER = registerBlock("mangrove_drawer", settings -> new DrawerBlock(Blocks.MANGROVE_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.MANGROVE_PLANKS));
    public static final Block CHERRY_DRAWER = registerBlock("cherry_drawer", settings -> new DrawerBlock(Blocks.CHERRY_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.CHERRY_PLANKS));
    public static final Block BAMBOO_DRAWER = registerBlock("bamboo_drawer", settings -> new DrawerBlock(Blocks.BAMBOO_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.BAMBOO_PLANKS));
    public static final Block CRIMSON_DRAWER = registerBlock("crimson_drawer", settings -> new DrawerBlock(Blocks.CRIMSON_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_DRAWER = registerBlock("warped_drawer", settings -> new DrawerBlock(Blocks.WARPED_PLANKS.getDefaultState(), settings), createDrawerSettings(Blocks.WARPED_PLANKS));

    // Wall Mirrors
    private static Block registerWallMirror(String name) {
        return registerBlock(name, WallMirrorBlock::new, AbstractBlock.Settings.copy(Blocks.GLASS));
    }
    
    public static final Block OAK_WALL_MIRROR = registerWallMirror("oak_wall_mirror");
    public static final Block SPRUCE_WALL_MIRROR = registerWallMirror("spruce_wall_mirror");
    public static final Block BIRCH_WALL_MIRROR = registerWallMirror("birch_wall_mirror");
    public static final Block JUNGLE_WALL_MIRROR = registerWallMirror("jungle_wall_mirror");
    public static final Block ACACIA_WALL_MIRROR = registerWallMirror("acacia_wall_mirror");
    public static final Block DARK_OAK_WALL_MIRROR = registerWallMirror("dark_oak_wall_mirror");
    public static final Block MANGROVE_WALL_MIRROR = registerWallMirror("mangrove_wall_mirror");
    public static final Block CHERRY_WALL_MIRROR = registerWallMirror("cherry_wall_mirror");
    public static final Block BAMBOO_WALL_MIRROR = registerWallMirror("bamboo_wall_mirror");
    public static final Block CRIMSON_WALL_MIRROR = registerWallMirror("crimson_wall_mirror");
    public static final Block WARPED_WALL_MIRROR = registerWallMirror("warped_wall_mirror");

    // Fountains
    public static final Block STONE_BRICK_FOUNTAIN = registerBlock("stone_brick_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block MOSSY_STONE_BRICK_FOUNTAIN = registerBlock("mossy_stone_brick_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block GRANITE_FOUNTAIN = registerBlock("granite_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block DIORITE_FOUNTAIN = registerBlock("diorite_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block ANDESITE_FOUNTAIN = registerBlock("andesite_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_FOUNTAIN = registerBlock("deepslate_fountain", FountainBlock::new, createFountainSettings(3,6, BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block TUFF_FOUNTAIN = registerBlock("tuff_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.POLISHED_TUFF));
    public static final Block BRICK_FOUNTAIN = registerBlock("brick_fountain", FountainBlock::new, createFountainSettings(2,6, BlockSoundGroup.STONE));
    public static final Block MUD_FOUNTAIN = registerBlock("mud_fountain", FountainBlock::new, createFountainSettings(1.5f,3, BlockSoundGroup.MUD_BRICKS));
    public static final Block SANDSTONE_FOUNTAIN = registerBlock("sandstone_fountain", FountainBlock::new, createFountainSettings(2,6, BlockSoundGroup.STONE));
    public static final Block RED_SANDSTONE_FOUNTAIN = registerBlock("red_sandstone_fountain", FountainBlock::new, createFountainSettings(2,6, BlockSoundGroup.STONE));
    public static final Block PRISMARINE_FOUNTAIN = registerBlock("prismarine_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block NETHER_BRICK_FOUNTAIN = registerBlock("nether_brick_fountain", FountainBlock::new, createFountainSettings(2,6, BlockSoundGroup.NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_FOUNTAIN = registerBlock("red_nether_brick_fountain", FountainBlock::new, createFountainSettings(2,6, BlockSoundGroup.NETHER_BRICKS));
    public static final Block BLACKSTONE_FOUNTAIN = registerBlock("blackstone_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.GILDED_BLACKSTONE));
    public static final Block ENDSTONE_FOUNTAIN = registerBlock("endstone_fountain", FountainBlock::new, createFountainSettings(3,9, BlockSoundGroup.STONE));
    public static final Block PURPUR_FOUNTAIN = registerBlock("purpur_fountain", FountainBlock::new, createFountainSettings(1.5f,6, BlockSoundGroup.STONE));

    // Fountains Sprouts
    public static final Block STONE_BRICK_FOUNTAIN_SPROUT = registerBlock("stone_brick_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block MOSSY_STONE_BRICK_FOUNTAIN_SPROUT = registerBlock("mossy_stone_brick_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block GRANITE_FOUNTAIN_SPROUT = registerBlock("granite_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block DIORITE_FOUNTAIN_SPROUT = registerBlock("diorite_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block ANDESITE_FOUNTAIN_SPROUT = registerBlock("andesite_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_FOUNTAIN_SPROUT = registerBlock("deepslate_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(3,6, BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block TUFF_FOUNTAIN_SPROUT = registerBlock("tuff_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.POLISHED_TUFF));
    public static final Block BRICK_FOUNTAIN_SPROUT = registerBlock("brick_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(2,6, BlockSoundGroup.STONE));
    public static final Block MUD_FOUNTAIN_SPROUT = registerBlock("mud_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,3, BlockSoundGroup.MUD_BRICKS));
    public static final Block SANDSTONE_FOUNTAIN_SPROUT = registerBlock("sandstone_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(2,6, BlockSoundGroup.STONE));
    public static final Block RED_SANDSTONE_FOUNTAIN_SPROUT = registerBlock("red_sandstone_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(2,6, BlockSoundGroup.STONE));
    public static final Block PRISMARINE_FOUNTAIN_SPROUT = registerBlock("prismarine_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block NETHER_BRICK_FOUNTAIN_SPROUT = registerBlock("nether_brick_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(2,6, BlockSoundGroup.NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_FOUNTAIN_SPROUT = registerBlock("red_nether_brick_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(2,6, BlockSoundGroup.NETHER_BRICKS));
    public static final Block BLACKSTONE_FOUNTAIN_SPROUT = registerBlock("blackstone_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.GILDED_BLACKSTONE));
    public static final Block ENDSTONE_FOUNTAIN_SPROUT = registerBlock("endstone_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(3,9, BlockSoundGroup.STONE));
    public static final Block PURPUR_FOUNTAIN_SPROUT = registerBlock("purpur_fountain_sprout", FountainSproutBlock::new, createFountainSproutSettings(1.5f,6, BlockSoundGroup.STONE));

    public static final Block FALLING_LIQUID = registerBlock("falling_liquid", FallingLiquidBlock::new, AbstractBlock.Settings.create()
            .replaceable()
            .luminance(ModBlockUtilities.createLightLevelFromContainsBlockState(15)));

    // Large Stumps
    public static final Block OAK_LARGE_STUMP = registerBlock("oak_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_LARGE_STUMP = registerBlock("spruce_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block BIRCH_LARGE_STUMP = registerBlock("birch_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_LARGE_STUMP = registerBlock("jungle_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block ACACIA_LARGE_STUMP = registerBlock("acacia_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_LARGE_STUMP = registerBlock("dark_oak_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_LARGE_STUMP = registerBlock("mangrove_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.WOOD));
    public static final Block CHERRY_LARGE_STUMP = registerBlock("cherry_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BAMBOO_LARGE_STUMP = registerBlock("bamboo_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.BAMBOO_WOOD));
    public static final Block CRIMSON_LARGE_STUMP = registerBlock("crimson_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.NETHER_WOOD));
    public static final Block WARPED_LARGE_STUMP = registerBlock("warped_large_stump", LargeStump::new, createLargeStumpSettings(BlockSoundGroup.NETHER_WOOD));

    // CHIMNEYS
    public static final Block STONE_BRICK_CHIMNEY = registerBlock("stone_brick_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block MOSSY_STONE_BRICK_CHIMNEY = registerBlock("mossy_stone_brick_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block GRANITE_CHIMNEY = registerBlock("granite_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block DIORITE_CHIMNEY = registerBlock("diorite_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block ANDESITE_CHIMNEY = registerBlock("andesite_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_CHIMNEY = registerBlock("deepslate_chimney",  ChimneyBlock::new, createChimneySettings(3,6, BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block TUFF_CHIMNEY = registerBlock("tuff_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.POLISHED_TUFF));
    public static final Block BRICK_CHIMNEY = registerBlock("brick_chimney",  ChimneyBlock::new, createChimneySettings(2,6, BlockSoundGroup.STONE));
    public static final Block MUD_CHIMNEY = registerBlock("mud_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,3, BlockSoundGroup.MUD_BRICKS));
    public static final Block SANDSTONE_CHIMNEY = registerBlock("sandstone_chimney",  ChimneyBlock::new, createChimneySettings(2,6, BlockSoundGroup.STONE));
    public static final Block RED_SANDSTONE_CHIMNEY = registerBlock("red_sandstone_chimney",  ChimneyBlock::new, createChimneySettings(2,6, BlockSoundGroup.STONE));
    public static final Block PRISMARINE_CHIMNEY = registerBlock("prismarine_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));
    public static final Block NETHER_BRICK_CHIMNEY = registerBlock("nether_brick_chimney",  ChimneyBlock::new, createChimneySettings(2,6, BlockSoundGroup.NETHER_BRICKS));
    public static final Block RED_NETHER_BRICK_CHIMNEY = registerBlock("red_nether_brick_chimney",  ChimneyBlock::new, createChimneySettings(2,6, BlockSoundGroup.NETHER_BRICKS));
    public static final Block BLACKSTONE_CHIMNEY = registerBlock("blackstone_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.GILDED_BLACKSTONE));
    public static final Block ENDSTONE_CHIMNEY = registerBlock("endstone_chimney",  ChimneyBlock::new, createChimneySettings(3,9, BlockSoundGroup.STONE));
    public static final Block PURPUR_CHIMNEY = registerBlock("purpur_chimney",  ChimneyBlock::new, createChimneySettings(1.5f,6, BlockSoundGroup.STONE));

    public static final Block TELESCOPE = registerBlock("telescope", TelescopeBlock::new, AbstractBlock.Settings.create()
            .breakInstantly()
            .mapColor(DyeColor.ORANGE)
            .sounds(BlockSoundGroup.COPPER));

    // Register Block Method
    private static Block registerBlock(
            String name,
            Function<AbstractBlock.Settings, Block> blockFactory,
            AbstractBlock.Settings settings
    ) {
        return registerBlock(name, blockFactory, settings, false);
    }
    
    private static Block registerBlock(
            String name,
            Function<AbstractBlock.Settings, Block> blockFactory,
            AbstractBlock.Settings settings,
            boolean dyeable
    ) {
        Identifier id = Identifier.of(CozyHome.MOD_ID, name);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = blockFactory.apply(settings.registryKey(blockKey));
        
        if (dyeable) {
            registerDyedBlockItem(id, block);
        } else {
            registerBlockItem(id, block);
        }
        
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    // Helper Method for Register Block Method (Handles rarity dynamically)
    private static void registerBlockItem(Identifier id, Block block) {
        registerBlockItem(id, block, BlockItem::new);
    }

    // Helper Method for Register Block Method (Handles rarity dynamically)
    private static void registerDyedBlockItem(Identifier id, Block block) {
        registerBlockItem(id, block, DyedBlockItem::new);
    }

    private static void registerBlockItem(Identifier id, Block block, BlockItemFactory blockItemFactory) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Registry.register(Registries.ITEM, key,
                blockItemFactory.create(block, new Item.Settings()
                        .registryKey(key).useBlockPrefixedTranslationKey()));
    }

    // Registering Blocks
    public static void registerModBlocks(){
        CozyHome.LOGGER.info("Registering ModBlocks for " + CozyHome.MOD_ID);
    }

    @FunctionalInterface
    private interface BlockItemFactory {
        BlockItem create(Block block, Item.Settings itemSettings);
    }
}

