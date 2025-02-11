package net.luckystudio.cozyhome.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.block.ModBlocks;
import net.luckystudio.cozyhome.block.custom.SofaBlock;
import net.luckystudio.cozyhome.block.custom.WallClockBlock;
import net.luckystudio.cozyhome.block.util.ModProperties;
import net.luckystudio.cozyhome.block.util.enums.AdvancedHorizontalLinearConnectionBlock;
import net.luckystudio.cozyhome.block.util.enums.ContainsBlock;
import net.luckystudio.cozyhome.block.util.enums.HorizontalLinearConnectionBlock;
import net.luckystudio.cozyhome.block.util.enums.VerticalLinearConnectionBlock;
import net.luckystudio.cozyhome.datagen.util.*;
import net.luckystudio.cozyhome.item.ModItems;
import net.luckystudio.cozyhome.item.renderer.SpecialChairItemRenderer;
import net.luckystudio.cozyhome.item.renderer.SpecialSofaItemRenderer;
import net.luckystudio.cozyhome.item.renderer.SpecialWallClockItemRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.enums.StairShape;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.DyeTintSource;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    // Even though it states "blockstate", these will generate blockstates, models, and item models.
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerGenerals(blockStateModelGenerator);

        registerCounter(blockStateModelGenerator, ModBlocks.OAK_COUNTER, CozyHome.id("block/break/oak_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.SPRUCE_COUNTER, CozyHome.id("block/break/spruce_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.BIRCH_COUNTER, CozyHome.id("block/break/birch_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.JUNGLE_COUNTER, CozyHome.id("block/break/jungle_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.ACACIA_COUNTER, CozyHome.id("block/break/acacia_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.DARK_OAK_COUNTER, CozyHome.id("block/break/dark_oak_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.MANGROVE_COUNTER, CozyHome.id("block/break/mangrove_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.CHERRY_COUNTER, CozyHome.id("block/break/cherry_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.BAMBOO_COUNTER, CozyHome.id("block/break/bamboo_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.CRIMSON_COUNTER, CozyHome.id("block/break/crimson_furniture"));
        registerCounter(blockStateModelGenerator, ModBlocks.WARPED_COUNTER, CozyHome.id("block/break/warped_furniture"));

        registerStorageCounter(blockStateModelGenerator, ModBlocks.OAK_STORAGE_COUNTER, CozyHome.id("block/break/oak_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.SPRUCE_STORAGE_COUNTER, CozyHome.id("block/break/spruce_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.BIRCH_STORAGE_COUNTER, CozyHome.id("block/break/birch_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.JUNGLE_STORAGE_COUNTER, CozyHome.id("block/break/jungle_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.ACACIA_STORAGE_COUNTER, CozyHome.id("block/break/acacia_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.DARK_OAK_STORAGE_COUNTER, CozyHome.id("block/break/dark_oak_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.MANGROVE_STORAGE_COUNTER, CozyHome.id("block/break/mangrove_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.CHERRY_STORAGE_COUNTER, CozyHome.id("block/break/cherry_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.BAMBOO_STORAGE_COUNTER, CozyHome.id("block/break/bamboo_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.CRIMSON_STORAGE_COUNTER, CozyHome.id("block/break/crimson_furniture"));
        registerStorageCounter(blockStateModelGenerator, ModBlocks.WARPED_STORAGE_COUNTER, CozyHome.id("block/break/warped_furniture"));

        registerSinkCounter(blockStateModelGenerator, ModBlocks.OAK_SINK_COUNTER, CozyHome.id("block/break/oak_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.SPRUCE_SINK_COUNTER, CozyHome.id("block/break/spruce_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.BIRCH_SINK_COUNTER, CozyHome.id("block/break/birch_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.JUNGLE_SINK_COUNTER, CozyHome.id("block/break/jungle_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.ACACIA_SINK_COUNTER, CozyHome.id("block/break/acacia_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.DARK_OAK_SINK_COUNTER, CozyHome.id("block/break/dark_oak_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.MANGROVE_SINK_COUNTER, CozyHome.id("block/break/mangrove_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.CHERRY_SINK_COUNTER, CozyHome.id("block/break/cherry_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.BAMBOO_SINK_COUNTER, CozyHome.id("block/break/bamboo_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.CRIMSON_SINK_COUNTER, CozyHome.id("block/break/crimson_furniture"));
        registerSinkCounter(blockStateModelGenerator, ModBlocks.WARPED_SINK_COUNTER, CozyHome.id("block/break/warped_furniture"));

        registerTable(blockStateModelGenerator, ModBlocks.OAK_TABLE, TableTypes.GENERIC, Identifier.of("block/oak_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.SPRUCE_TABLE, TableTypes.GENERIC, Identifier.of("block/spruce_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.BIRCH_TABLE, TableTypes.GENERIC, Identifier.of("block/birch_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.JUNGLE_TABLE, TableTypes.GENERIC, Identifier.of("block/jungle_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.ACACIA_TABLE, TableTypes.GENERIC, Identifier.of("block/acacia_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.DARK_OAK_TABLE, TableTypes.GENERIC, Identifier.of("block/dark_oak_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.MANGROVE_TABLE, TableTypes.GENERIC, Identifier.of("block/mangrove_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.CHERRY_TABLE, TableTypes.GENERIC, Identifier.of("block/cherry_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.BAMBOO_TABLE, TableTypes.GENERIC, Identifier.of("block/bamboo_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.CRIMSON_TABLE, TableTypes.GENERIC, Identifier.of("block/crimson_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.WARPED_TABLE, TableTypes.GENERIC, Identifier.of("block/warped_planks"));
        registerTable(blockStateModelGenerator, ModBlocks.IRON_TABLE, TableTypes.SHELF, CozyHome.id("block/break/iron_furniture"));
        registerTable(blockStateModelGenerator, ModBlocks.GLASS_TABLE, TableTypes.SHELF, CozyHome.id("block/break/glass_furniture"));
        registerTable(blockStateModelGenerator, ModBlocks.UNDEAD_TABLE, TableTypes.GENERIC, CozyHome.id("block/break/undead_furniture"));
        registerTable(blockStateModelGenerator, ModBlocks.OMINOUS_TABLE, TableTypes.GENERIC, CozyHome.id("block/break/ominous_furniture"));

        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.OAK_CHAIR, Identifier.of("block/oak_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.SPRUCE_CHAIR, Identifier.of("block/spruce_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.BIRCH_CHAIR, Identifier.of("block/birch_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.JUNGLE_CHAIR, Identifier.of("block/jungle_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.ACACIA_CHAIR, Identifier.of("block/acacia_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.DARK_OAK_CHAIR, Identifier.of("block/dark_oak_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.MANGROVE_CHAIR, Identifier.of("block/mangrove_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.CHERRY_CHAIR, Identifier.of("block/cherry_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.BAMBOO_CHAIR, Identifier.of("block/bamboo_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.CRIMSON_CHAIR, Identifier.of("block/crimson_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.WARPED_CHAIR, Identifier.of("block/warped_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.IRON_CHAIR, CozyHome.id("block/break/iron_furniture"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.GLASS_CHAIR, CozyHome.id("block/break/glass_furniture"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.UNDEAD_CHAIR, CozyHome.id("block/break/undead_furniture"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.OMINOUS_CHAIR, CozyHome.id("block/break/ominous_furniture"));

        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.OAK_WALL_CLOCK, Identifier.of("block/oak_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.SPRUCE_WALL_CLOCK, Identifier.of("block/spruce_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.BIRCH_WALL_CLOCK, Identifier.of("block/birch_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.JUNGLE_WALL_CLOCK, Identifier.of("block/jungle_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.ACACIA_WALL_CLOCK, Identifier.of("block/acacia_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.DARK_OAK_WALL_CLOCK, Identifier.of("block/dark_oak_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.MANGROVE_WALL_CLOCK, Identifier.of("block/mangrove_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.CHERRY_WALL_CLOCK, Identifier.of("block/cherry_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.BAMBOO_WALL_CLOCK, Identifier.of("block/bamboo_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.CRIMSON_WALL_CLOCK, Identifier.of("block/crimson_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.WARPED_WALL_CLOCK, Identifier.of("block/warped_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.IRON_WALL_CLOCK, CozyHome.id("block/break/iron_furniture"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.GLASS_WALL_CLOCK, CozyHome.id("block/break/glass_furniture"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.UNDEAD_WALL_CLOCK, CozyHome.id("block/break/undead_furniture"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.OMINOUS_WALL_CLOCK, CozyHome.id("block/break/ominous_furniture"));

        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.OAK_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/oak_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.SPRUCE_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/spruce_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.BIRCH_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/birch_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.JUNGLE_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/jungle_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.ACACIA_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/acacia_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.DARK_OAK_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/dark_oak_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.MANGROVE_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/mangrove_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.CHERRY_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/cherry_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.BAMBOO_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/bamboo_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.CRIMSON_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/crimson_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.WARPED_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, Identifier.of("block/warped_planks"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.IRON_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, CozyHome.id("block/break/iron_furniture"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.GLASS_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, CozyHome.id("block/break/glass_furniture"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.UNDEAD_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, CozyHome.id("block/break/undead_furniture"));
        registerBuiltinWithParticleAndGeneratedItemModel(blockStateModelGenerator, ModBlocks.OMINOUS_GRANDFATHER_CLOCK, ModBlockTypes.GRANDFATHER_CLOCK, CozyHome.id("block/break/ominous_furniture"));

        registerLamp(blockStateModelGenerator, ModBlocks.OAK_LAMP, Identifier.of("block/oak_planks"), true, true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.SPRUCE_LAMP, Identifier.of("block/spruce_planks"), false,true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.BIRCH_LAMP, Identifier.of("block/birch_planks"), true, true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.JUNGLE_LAMP, Identifier.of("block/jungle_planks"), false, true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.ACACIA_LAMP, Identifier.of("block/acacia_planks"), true, true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.DARK_OAK_LAMP, Identifier.of("block/dark_oak_planks"), false, true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.MANGROVE_LAMP, Identifier.of("block/mangrove_planks"), false, false, false);
        registerLamp(blockStateModelGenerator, ModBlocks.CHERRY_LAMP, Identifier.of("block/cherry_planks"), true, true, true);
        registerLamp(blockStateModelGenerator, ModBlocks.BAMBOO_LAMP, Identifier.of("block/bamboo_planks"), false, true, false);
        registerLamp(blockStateModelGenerator, ModBlocks.CRIMSON_LAMP, Identifier.of("block/crimson_planks"), false, false, false);
        registerLamp(blockStateModelGenerator, ModBlocks.WARPED_LAMP, Identifier.of("block/warped_planks"), false, false, false);
        registerLamp(blockStateModelGenerator, ModBlocks.IRON_LAMP, CozyHome.id("block/break/iron_furniture"), false, false, false);
        registerLamp(blockStateModelGenerator, ModBlocks.GLASS_LAMP, CozyHome.id("block/break/glass_furniture"), false, false, false);
        registerLamp(blockStateModelGenerator, ModBlocks.UNDEAD_LAMP, CozyHome.id("block/break/undead_furniture"), false, false, false);
        registerLamp(blockStateModelGenerator, ModBlocks.OMINOUS_LAMP, CozyHome.id("block/break/ominous_furniture"), false, false, false);

        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.OAK_SOFA, Identifier.of("block/oak_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.SPRUCE_SOFA, Identifier.of("block/spruce_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.BIRCH_SOFA, Identifier.of("block/birch_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.JUNGLE_SOFA, Identifier.of("block/jungle_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.ACACIA_SOFA, Identifier.of("block/acacia_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.DARK_OAK_SOFA, Identifier.of("block/dark_oak_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.MANGROVE_SOFA, Identifier.of("block/mangrove_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.CHERRY_SOFA, Identifier.of("block/cherry_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.BAMBOO_SOFA, Identifier.of("block/bamboo_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.CRIMSON_SOFA, Identifier.of("block/crimson_planks"));
        registerBuiltinWithParticle(blockStateModelGenerator, ModBlocks.WARPED_SOFA, Identifier.of("block/warped_planks"));

        registerCouch(blockStateModelGenerator, ModBlocks.OAK_COUCH, Identifier.of("block/oak_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.SPRUCE_COUCH, Identifier.of("block/spruce_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.BIRCH_COUCH, Identifier.of("block/birch_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.JUNGLE_COUCH, Identifier.of("block/jungle_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.ACACIA_COUCH, Identifier.of("block/acacia_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.DARK_OAK_COUCH, Identifier.of("block/dark_oak_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.MANGROVE_COUCH, Identifier.of("block/mangrove_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.CHERRY_COUCH, Identifier.of("block/cherry_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.BAMBOO_COUCH, Identifier.of("block/bamboo_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.CRIMSON_COUCH, Identifier.of("block/crimson_planks"));
        registerCouch(blockStateModelGenerator, ModBlocks.WARPED_COUCH, Identifier.of("block/warped_planks"));

        registerDesk(blockStateModelGenerator, ModBlocks.OAK_DESK, Identifier.of("block/oak_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.SPRUCE_DESK, Identifier.of("block/spruce_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.BIRCH_DESK, Identifier.of("block/birch_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.JUNGLE_DESK, Identifier.of("block/jungle_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.ACACIA_DESK, Identifier.of("block/acacia_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.DARK_OAK_DESK, Identifier.of("block/dark_oak_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.MANGROVE_DESK, Identifier.of("block/mangrove_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.CHERRY_DESK, Identifier.of("block/cherry_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.BAMBOO_DESK, Identifier.of("block/bamboo_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.CRIMSON_DESK, Identifier.of("block/crimson_planks"));
        registerDesk(blockStateModelGenerator, ModBlocks.WARPED_DESK, Identifier.of("block/warped_planks"));

        registerDrawer(blockStateModelGenerator, ModBlocks.OAK_DRAWER, Identifier.of("block/oak_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.SPRUCE_DRAWER, Identifier.of("block/spruce_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.BIRCH_DRAWER, Identifier.of("block/birch_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.JUNGLE_DRAWER, Identifier.of("block/jungle_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.ACACIA_DRAWER, Identifier.of("block/acacia_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.DARK_OAK_DRAWER, Identifier.of("block/dark_oak_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.MANGROVE_DRAWER, Identifier.of("block/mangrove_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.CHERRY_DRAWER, Identifier.of("block/cherry_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.BAMBOO_DRAWER, Identifier.of("block/bamboo_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.CRIMSON_DRAWER, Identifier.of("block/crimson_planks"));
        registerDrawer(blockStateModelGenerator, ModBlocks.WARPED_DRAWER, Identifier.of("block/warped_planks"));

        registerWallMirror(blockStateModelGenerator, ModBlocks.OAK_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.SPRUCE_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.BIRCH_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.JUNGLE_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.ACACIA_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.DARK_OAK_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.MANGROVE_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.CHERRY_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.BAMBOO_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.CRIMSON_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/nether_mirror"));
        registerWallMirror(blockStateModelGenerator, ModBlocks.WARPED_WALL_MIRROR, Identifier.of(CozyHome.MOD_ID, "block/mirror/nether_mirror"));

        registerLargeStump(blockStateModelGenerator, ModBlocks.OAK_LARGE_STUMP, Identifier.of("oak_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.SPRUCE_LARGE_STUMP, Identifier.of("spruce_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.BIRCH_LARGE_STUMP, Identifier.of("birch_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.JUNGLE_LARGE_STUMP, Identifier.of("jungle_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.ACACIA_LARGE_STUMP, Identifier.of("acacia_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.DARK_OAK_LARGE_STUMP, Identifier.of("dark_oak_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.MANGROVE_LARGE_STUMP, Identifier.of("mangrove_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.CHERRY_LARGE_STUMP, Identifier.of("cherry_log"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.BAMBOO_LARGE_STUMP, Identifier.of("bamboo_block"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.CRIMSON_LARGE_STUMP, Identifier.of("crimson_stem"));
        registerLargeStump(blockStateModelGenerator, ModBlocks.WARPED_LARGE_STUMP, Identifier.of("warped_stem"));

        registerFountain(blockStateModelGenerator, ModBlocks.STONE_BRICK_FOUNTAIN, Identifier.of("block/stone_bricks"));
        registerFountain(blockStateModelGenerator, ModBlocks.MOSSY_STONE_BRICK_FOUNTAIN, Identifier.of("block/mossy_stone_bricks"));
        registerFountain(blockStateModelGenerator, ModBlocks.GRANITE_FOUNTAIN, Identifier.of("block/granite"));
        registerFountain(blockStateModelGenerator, ModBlocks.DIORITE_FOUNTAIN, Identifier.of("block/diorite"));
        registerFountain(blockStateModelGenerator, ModBlocks.ANDESITE_FOUNTAIN, Identifier.of("block/andesite"));
        registerFountain(blockStateModelGenerator, ModBlocks.DEEPSLATE_FOUNTAIN, Identifier.of("block/deepslate"));
        registerFountain(blockStateModelGenerator, ModBlocks.TUFF_FOUNTAIN, Identifier.of("block/tuff"));
        registerFountain(blockStateModelGenerator, ModBlocks.BRICK_FOUNTAIN, Identifier.of("block/bricks"));
        registerFountain(blockStateModelGenerator, ModBlocks.MUD_FOUNTAIN, Identifier.of("block/mud"));
        registerFountain(blockStateModelGenerator, ModBlocks.SANDSTONE_FOUNTAIN, Identifier.of("block/sandstone"));
        registerFountain(blockStateModelGenerator, ModBlocks.RED_SANDSTONE_FOUNTAIN, Identifier.of("block/red_sandstone"));
        registerFountain(blockStateModelGenerator, ModBlocks.PRISMARINE_FOUNTAIN, Identifier.of("block/prismarine_bricks"));
        registerFountain(blockStateModelGenerator, ModBlocks.NETHER_BRICK_FOUNTAIN, Identifier.of("block/nether_bricks"));
        registerFountain(blockStateModelGenerator, ModBlocks.RED_NETHER_BRICK_FOUNTAIN, Identifier.of("block/red_nether_bricks"));
        registerFountain(blockStateModelGenerator, ModBlocks.BLACKSTONE_FOUNTAIN, Identifier.of("block/blackstone"));
        registerFountain(blockStateModelGenerator, ModBlocks.ENDSTONE_FOUNTAIN, Identifier.of("block/end_stone"));
        registerFountain(blockStateModelGenerator, ModBlocks.PURPUR_FOUNTAIN, Identifier.of("block/purpur_block"));

        registerChimney(blockStateModelGenerator, ModBlocks.STONE_BRICK_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.MOSSY_STONE_BRICK_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.GRANITE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.DIORITE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.ANDESITE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.DEEPSLATE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.TUFF_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.BRICK_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.MUD_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.SANDSTONE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.RED_SANDSTONE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.PRISMARINE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.NETHER_BRICK_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.RED_NETHER_BRICK_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.BLACKSTONE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.ENDSTONE_CHIMNEY);
        registerChimney(blockStateModelGenerator, ModBlocks.PURPUR_CHIMNEY);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        registerDyeableItem(ModItems.PAINT_BRUSH, generator.output);
        registerDyeableItem(ModItems.CUSHION, generator.output);
        generator.register(ModItems.HAY_CUSHION);
        generator.register(ModItems.TRADER_CUSHION);
        generator.register(ModBlocks.TELESCOPE.asItem());

        registerDyeableBlockItem(ModBlocks.OAK_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.SPRUCE_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.BIRCH_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.JUNGLE_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.ACACIA_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.DARK_OAK_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.MANGROVE_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.CHERRY_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.BAMBOO_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.CRIMSON_COUCH, generator.output);
        registerDyeableBlockItem(ModBlocks.WARPED_COUCH, generator.output);

        registerSofa(ModBlocks.OAK_SOFA, generator.output);
        registerSofa(ModBlocks.SPRUCE_SOFA, generator.output);
        registerSofa(ModBlocks.BIRCH_SOFA, generator.output);
        registerSofa(ModBlocks.JUNGLE_SOFA, generator.output);
        registerSofa(ModBlocks.ACACIA_SOFA, generator.output);
        registerSofa(ModBlocks.DARK_OAK_SOFA, generator.output);
        registerSofa(ModBlocks.MANGROVE_SOFA, generator.output);
        registerSofa(ModBlocks.CHERRY_SOFA, generator.output);
        registerSofa(ModBlocks.BAMBOO_SOFA, generator.output);
        registerSofa(ModBlocks.CRIMSON_SOFA, generator.output);
        registerSofa(ModBlocks.WARPED_SOFA, generator.output);

        registerDyeableBlockItem(ModBlocks.OAK_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.SPRUCE_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.BIRCH_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.JUNGLE_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.ACACIA_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.DARK_OAK_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.MANGROVE_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.CHERRY_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.BAMBOO_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.IRON_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.GLASS_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.UNDEAD_LAMP, generator.output);
        registerDyeableBlockItem(ModBlocks.OMINOUS_LAMP, generator.output);

        registerChair(ModBlocks.OAK_CHAIR, generator.output);
        registerChair(ModBlocks.SPRUCE_CHAIR, generator.output);
        registerChair(ModBlocks.BIRCH_CHAIR, generator.output);
        registerChair(ModBlocks.JUNGLE_CHAIR, generator.output);
        registerChair(ModBlocks.ACACIA_CHAIR, generator.output);
        registerChair(ModBlocks.DARK_OAK_CHAIR, generator.output);
        registerChair(ModBlocks.MANGROVE_CHAIR, generator.output);
        registerChair(ModBlocks.CHERRY_CHAIR, generator.output);
        registerChair(ModBlocks.BAMBOO_CHAIR, generator.output);
        registerChair(ModBlocks.CRIMSON_CHAIR, generator.output);
        registerChair(ModBlocks.WARPED_CHAIR, generator.output);
        registerChair(ModBlocks.IRON_CHAIR, generator.output);
        registerChair(ModBlocks.GLASS_CHAIR, generator.output);
        registerChair(ModBlocks.UNDEAD_CHAIR, generator.output);
        registerChair(ModBlocks.OMINOUS_CHAIR, generator.output);

        registerWallClock(ModBlocks.OAK_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.SPRUCE_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.BIRCH_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.JUNGLE_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.ACACIA_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.DARK_OAK_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.MANGROVE_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.CHERRY_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.BAMBOO_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.CRIMSON_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.WARPED_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.IRON_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.GLASS_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.UNDEAD_WALL_CLOCK, generator.output);
        registerWallClock(ModBlocks.OMINOUS_WALL_CLOCK, generator.output);

        generator.register(ModBlocks.OAK_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.SPRUCE_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.BIRCH_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.JUNGLE_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.ACACIA_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.DARK_OAK_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.MANGROVE_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.CHERRY_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.BAMBOO_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.CRIMSON_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.WARPED_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.IRON_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.GLASS_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.UNDEAD_GRANDFATHER_CLOCK.asItem());
        generator.register(ModBlocks.OMINOUS_GRANDFATHER_CLOCK.asItem());
    }

    private void registerDyeableItem(Item item, ItemModelOutput output) {
        output.accept(item, ItemModels.tinted(ModelIds.getItemModelId(item), new DyeTintSource(-17170434)));
    }

    private void registerDyeableBlockItem(Block block, ItemModelOutput output) {
        Item asItem = block.asItem();
        Identifier blockModelId = ModelIds.getItemModelId(asItem)
                .withPath(path -> "block" + path.substring(4));
        output.accept(asItem, ItemModels.tinted(blockModelId, new DyeTintSource(-17170434)));
    }

    private void registerChair(Block chair, ItemModelOutput output) {
        Item chairItem = chair.asItem();
        Identifier chairId = chair.getRegistryEntry().registryKey().getValue();
        output.accept(chairItem, ItemModels.special(SpecialChairItemRenderer.ID,
                new SpecialChairItemRenderer.Unbaked(chairId)));
    }

    private void registerSofa(Block sofa, ItemModelOutput output) {
        Item sofaItem = sofa.asItem();
        output.accept(sofaItem, ItemModels.special(SpecialSofaItemRenderer.ID,
                new SpecialSofaItemRenderer(((SofaBlock) sofa).getSofaType())));
    }

    private void registerWallClock(Block wallClock, ItemModelOutput output) {
        Item sofaItem = wallClock.asItem();
        output.accept(sofaItem, ItemModels.special(SpecialSofaItemRenderer.ID,
                new SpecialWallClockItemRenderer(((WallClockBlock) wallClock).getClockType())));
    }

    /**
     * Many blocks share models in them, but we can't register the shared models in the blockstate generator because it will cause a duplicate model error.
     * So we create a separate method to generate them here and call it at the beginning, for all to use.
     */
    public final void registerGenerals(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier waterModelId = ModModels.INSET_WATER_PANE.upload(
                CozyHome.id("block/inset_water_pane"), new TextureMap().put(TextureKey.UP, Identifier.ofVanilla("block/water_still")).put(TextureKey.PARTICLE, Identifier.ofVanilla("block/water_still")), blockStateModelGenerator.modelCollector);
        Identifier lavaModelId = ModModels.INSET_LAVA_PANE.upload(
                CozyHome.id("block/inset_lava_pane"), new TextureMap().put(TextureKey.UP, Identifier.ofVanilla("block/lava_still")).put(TextureKey.PARTICLE, Identifier.ofVanilla("block/lava_still")), blockStateModelGenerator.modelCollector);
        Identifier iceModelId = ModModels.INSET_ICE_PANE.upload(
                CozyHome.id("block/inset_ice_pane"), new TextureMap().put(TextureKey.UP, Identifier.ofVanilla("block/ice")).put(TextureKey.PARTICLE, Identifier.ofVanilla("block/ice")), blockStateModelGenerator.modelCollector);
    }

    public final void registerBuiltinWithParticleAndParentedItemModel(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier particleSource, Identifier modelPath) {
        blockStateModelGenerator.registerBuiltinWithParticle(block, particleSource);
        blockStateModelGenerator.registerParentedItemModel(block, modelPath);
    }

    private void registerBuiltinWithParticle(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier particleSource) {
        blockStateModelGenerator.registerBuiltinWithParticle(block, particleSource);
    }

    public final void registerBuiltinWithParticleAndGeneratedItemModel(BlockStateModelGenerator blockStateModelGenerator, Block block, ModBlockTypes modBlockTypes, Identifier particleSource) {
        blockStateModelGenerator.registerBuiltinWithParticle(block, particleSource);
        Item item = block.asItem();
        Identifier textureId = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/" + modBlockTypes + "/" + Registries.BLOCK.getId(block).getPath() + "_item");
        Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(textureId), blockStateModelGenerator.modelCollector);
    }

    public final void registerCounter(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        TextureMap counter = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_bottom"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_front"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_back"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap counterInner = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_inner_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_inner_bottom"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_front"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_back"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap counterOuter = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_outer_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_outer_bottom"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath() + "_outer_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier counterModelId = ModModels.COUNTER.upload(block, counter, blockStateModelGenerator.modelCollector);
        Identifier counterInnerModelId = ModModels.COUNTER_INNER.upload(block, counterInner, blockStateModelGenerator.modelCollector);
        Identifier counterOuterModelId = ModModels.COUNTER_OUTER.upload(block, counterOuter, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, Properties.STAIR_SHAPE)
                        .register(Direction.NORTH, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))

                        .register(Direction.SOUTH, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterModelId))
                        .register(Direction.SOUTH, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId))
                        .register(Direction.SOUTH, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId))
                        .register(Direction.SOUTH, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        .register(Direction.WEST, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))

                        .register(Direction.EAST, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterInnerModelId))
                        .register(Direction.EAST, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, counterOuterModelId))
                ));
    }

    public final void registerStorageCounter(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        Identifier top = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_storage", "") + "_top");
        Identifier side = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_storage", "") + "_side");
        Identifier bottom = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_storage", "") + "_bottom");
        Identifier open = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_storage", "") + "_open");
        Identifier closed = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_storage", "") + "_closed");
        Identifier back = Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_storage", "") + "_back");

        TextureMap storageCounter = new TextureMap()
                .put(TextureKey.TOP, top)
                .put(TextureKey.SIDE, side)
                .put(TextureKey.BOTTOM, bottom)
                .put(TextureKey.FRONT, closed)
                .put(TextureKey.BACK, back)
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap storageCounterOpen = new TextureMap()
                .put(TextureKey.TOP, top)
                .put(TextureKey.SIDE, side)
                .put(TextureKey.BOTTOM, bottom)
                .put(ModTextureKey.OPEN, open)
                .put(ModTextureKey.CLOSED, closed)
                .put(TextureKey.BACK, back)
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier storageCounterModelId = ModModels.COUNTER.upload(block, storageCounter, blockStateModelGenerator.modelCollector);
        Identifier storageCounterOpenModelId = ModModels.STORAGE_COUNTER.upload(block, storageCounterOpen, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, Properties.OPEN)
                        .register(Direction.NORTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.EAST,false,  BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.SOUTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterModelId))
                        .register(Direction.WEST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        .register(Direction.NORTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterOpenModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.EAST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterOpenModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.SOUTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterOpenModelId))
                        .register(Direction.WEST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, storageCounterOpenModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                ));
    }

    public final void registerSinkCounter(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        TextureMap baseTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_sink_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_bottom"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_front"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_back"))
                .put(ModTextureKey.EXTRA, CozyHome.id("block/dye_vat/dye_vat_faucet"))
                .put(ModTextureKey.INNER_SIDE, CozyHome.id("block/dye_vat/dye_vat_inner_side"))
                .put(ModTextureKey.INNER_BOTTOM, CozyHome.id("block/dye_vat/dye_vat_inner_bottom"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap waterTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_sink_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_bottom"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_front"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/counter/" + Registries.BLOCK.getId(block).getPath().replace("_sink", "") + "_back"))
                .put(ModTextureKey.EXTRA, CozyHome.id("block/dye_vat/dye_vat_faucet"))
                .put(ModTextureKey.INNER_SIDE, CozyHome.id("block/dye_vat/dye_vat_inner_side"))
                .put(ModTextureKey.INNER_BOTTOM, CozyHome.id("block/dye_vat/dye_vat_inner_bottom"))
                .put(ModTextureKey.LIQUID, CozyHome.id("block/small_water_still"))
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier sinkCounterModelID = ModModels.SINK_COUNTER.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        Identifier water1CounterModelID = ModModels.SINK_COUNTER_1.upload(block, waterTexture, blockStateModelGenerator.modelCollector);
        Identifier water2CounterModelID = ModModels.SINK_COUNTER_2.upload(block, waterTexture, blockStateModelGenerator.modelCollector);
        Identifier water3CounterModelID = ModModels.SINK_COUNTER_3.upload(block, waterTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, ModProperties.FILLED_LEVEL_0_3)
                        .register(Direction.NORTH, 0, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, sinkCounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.EAST, 0, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, sinkCounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.SOUTH, 0, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, sinkCounterModelID))
                        .register(Direction.WEST, 0, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, sinkCounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        .register(Direction.NORTH, 1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water1CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.EAST, 1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water1CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.SOUTH, 1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water1CounterModelID))
                        .register(Direction.WEST, 1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water1CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        .register(Direction.NORTH, 2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water2CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.EAST, 2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water2CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.SOUTH, 2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water2CounterModelID))
                        .register(Direction.WEST, 2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water2CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        .register(Direction.NORTH, 3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water3CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.EAST, 3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water3CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.SOUTH, 3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water3CounterModelID))
                        .register(Direction.WEST, 3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, water3CounterModelID)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                ));
    }

    public final void registerTable(BlockStateModelGenerator blockStateModelGenerator, Block block, TableTypes tableTypes, Identifier breakParticle) {
        // Define texture maps
        String blockNamespace = Registries.BLOCK.getId(block).getNamespace();
        String blockPath = Registries.BLOCK.getId(block).getPath();
        String baseTexturePath = "block/table/" + blockPath;

        TextureMap baseTexture = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(blockNamespace, baseTexturePath))
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier tableModelID;
        Identifier tableCornerModelID;
        Identifier tableCornerPieceModelID;
        Identifier tableDoubleModelID;
        Identifier tableInnerCornerPieceModelID;
        Identifier tableMiddleModelID;
        Identifier tableSideModelID;

        if (tableTypes == TableTypes.SHELF) {
            // Upload models for various table states
            tableModelID = ModModels.SHELF_TABLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableCornerModelID = ModModels.SHELF_TABLE_CORNER.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableCornerPieceModelID = ModModels.SHELF_TABLE_CORNER_PIECE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableDoubleModelID = ModModels.SHELF_TABLE_DOUBLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableInnerCornerPieceModelID = ModModels.SHELF_TABLE_INNER_CORNER_PIECE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableMiddleModelID = ModModels.SHELF_TABLE_MIDDLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableSideModelID = ModModels.SHELF_TABLE_SIDE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        } else {
            // Upload models for various table states
            tableModelID = ModModels.TABLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableCornerModelID = ModModels.TABLE_CORNER.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableCornerPieceModelID = ModModels.TABLE_CORNER_PIECE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableDoubleModelID = ModModels.TABLE_DOUBLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableInnerCornerPieceModelID = ModModels.TABLE_INNER_CORNER_PIECE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableMiddleModelID = ModModels.TABLE_MIDDLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
            tableSideModelID = ModModels.TABLE_SIDE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        }

        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableDoubleModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableMiddleModelID))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableMiddleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(ModProperties.SOUTH_EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableInnerCornerPieceModelID))
                .with(When.create().set(ModProperties.SOUTH_WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(ModProperties.NORTH_WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(ModProperties.NORTH_EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.SOUTH, true).set(Properties.EAST, true).set(ModProperties.SOUTH_EAST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerPieceModelID))
                .with(When.create().set(Properties.SOUTH, true).set(Properties.WEST, true).set(ModProperties.SOUTH_WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.WEST, true).set(ModProperties.NORTH_WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(ModProperties.NORTH_EAST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableSideModelID))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, tableSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
        );
    }

    public final void registerLamp(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle, boolean useGenericLampModel, boolean useGenericMiddleModel, boolean useGenericBaseModel) {
        TextureMap lamp = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/lamp/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap lampOn = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/lamp/" + Registries.BLOCK.getId(block).getPath() + "_on"))
                .put(TextureKey.PARTICLE, breakParticle);

        Identifier lampModelId;
        Identifier lampOnModelId;

        Identifier lampTopModelId;
        Identifier lampTopOnModelId;

        Identifier lampMiddleModelId;
        Identifier lampMiddleOnModelId;

        Identifier lampBaseModelId;
        Identifier lampBaseOnModelId;

        if (useGenericLampModel) {
            lampModelId = ModModels.GENERIC_LAMP.upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampOnModelId = ModModels.GENERIC_LAMP_ON.upload(block, lampOn, blockStateModelGenerator.modelCollector);
            lampTopModelId = ModModels.GENERIC_LAMP_HEAD.upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampTopOnModelId = ModModels.GENERIC_LAMP_HEAD_ON.upload(block, lampOn, blockStateModelGenerator.modelCollector);
        } else {
            lampModelId = ModModels.modBlockWithType(String.valueOf(Registries.BLOCK.getId(block).getPath()), ModBlockTypes.LAMP, TextureKey.ALL, TextureKey.PARTICLE).upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampOnModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath(), ModBlockTypes.LAMP, "_on", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lampOn, blockStateModelGenerator.modelCollector);
            lampTopModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath() + "_head", ModBlockTypes.LAMP, "_head", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampTopOnModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath() + "_head", ModBlockTypes.LAMP, "_head_on", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lampOn, blockStateModelGenerator.modelCollector);
        }

        if (useGenericMiddleModel) {
            lampMiddleModelId = ModModels.GENERIC_LAMP_MIDDLE.upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampMiddleOnModelId = ModModels.GENERIC_LAMP_MIDDLE_ON.upload(block, lampOn, blockStateModelGenerator.modelCollector);
        } else {
            lampMiddleModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath() + "_middle", ModBlockTypes.LAMP, "_middle", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampMiddleOnModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath() + "_middle", ModBlockTypes.LAMP, "_middle_on", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lampOn, blockStateModelGenerator.modelCollector);
        }

        if (useGenericBaseModel) {
            lampBaseModelId = ModModels.GENERIC_LAMP_BASE.upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampBaseOnModelId = ModModels.GENERIC_LAMP_BASE_ON.upload(block, lampOn, blockStateModelGenerator.modelCollector);
        } else {
            lampBaseModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath() + "_base", ModBlockTypes.LAMP, "_base", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lamp, blockStateModelGenerator.modelCollector);
            lampBaseOnModelId = ModModels.modBlockWithTypeAndVariant(Registries.BLOCK.getId(block).getPath() + "_base", ModBlockTypes.LAMP, "_base_on", TextureKey.ALL, TextureKey.PARTICLE).upload(block, lampOn, blockStateModelGenerator.modelCollector);
        }

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(ModProperties.VERTICAL_CONNECTION, Properties.HORIZONTAL_FACING, Properties.LIT)
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.NORTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampModelId))
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.NORTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampOnModelId))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.NORTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopModelId))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.NORTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopOnModelId))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.NORTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleModelId))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.NORTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleOnModelId))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.NORTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseModelId))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.NORTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseOnModelId))

                        // EAST
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.EAST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.EAST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.EAST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.EAST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.EAST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.EAST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.EAST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.EAST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        // SOUTH
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.SOUTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.SOUTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.SOUTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.SOUTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.SOUTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.SOUTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.SOUTH, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.SOUTH, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))

                        // WEST
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.WEST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.SINGLE, Direction.WEST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.WEST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.HEAD, Direction.WEST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampTopOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.WEST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.MIDDLE, Direction.WEST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampMiddleOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.WEST, false, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(VerticalLinearConnectionBlock.TAIL, Direction.WEST, true, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, lampBaseOnModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                ));

    }

    public final void registerFountain(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        // Define texture maps
        String blockNamespace = Registries.BLOCK.getId(block).getNamespace();
        String blockPath = Registries.BLOCK.getId(block).getPath();
        String baseTexturePath = "block/fountain/" + blockPath;

        TextureMap baseTexture = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(blockNamespace, baseTexturePath))
                .put(TextureKey.PARTICLE, breakParticle);

        Identifier fountainModelID;
        Identifier fountainCornerModelID;
        Identifier fountainCornerPieceModelID;
        Identifier fountainDoubleModelID;
        Identifier fountainInnerCornerPieceModelID;
        Identifier fountainMiddleModelID;
        Identifier fountainSideModelID;

        // Upload models for various fountain states
        fountainModelID = ModModels.FOUNTAIN.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        fountainCornerModelID = ModModels.FOUNTAIN_CORNER.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        fountainCornerPieceModelID = ModModels.FOUNTAIN_CORNER_PIECE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        fountainDoubleModelID = ModModels.FOUNTAIN_DOUBLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        fountainInnerCornerPieceModelID = ModModels.FOUNTAIN_INNER_CORNER_PIECE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        fountainMiddleModelID = ModModels.FOUNTAIN_MIDDLE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        fountainSideModelID = ModModels.FOUNTAIN_SIDE.upload(block, baseTexture, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainDoubleModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainMiddleModelID))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainMiddleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(ModProperties.SOUTH_EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainInnerCornerPieceModelID))
                .with(When.create().set(ModProperties.SOUTH_WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(ModProperties.NORTH_WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(ModProperties.NORTH_EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.SOUTH, true).set(Properties.EAST, true).set(ModProperties.SOUTH_EAST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerPieceModelID))
                .with(When.create().set(Properties.SOUTH, true).set(Properties.WEST, true).set(ModProperties.SOUTH_WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.WEST, true).set(ModProperties.NORTH_WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(ModProperties.NORTH_EAST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainSideModelID))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, fountainSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(ModProperties.CONTAINS, ContainsBlock.WATER),
                        BlockStateVariant.create().put(VariantSettings.MODEL, CozyHome.id("block/inset_water_pane")))
                .with(When.create().set(ModProperties.CONTAINS, ContainsBlock.LAVA),
                        BlockStateVariant.create().put(VariantSettings.MODEL, CozyHome.id("block/inset_lava_pane")))
                .with(When.create().set(ModProperties.CONTAINS, ContainsBlock.ICE),
                        BlockStateVariant.create().put(VariantSettings.MODEL, CozyHome.id("block/inset_ice_pane")))
        );
    }

    public final void registerChimney(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        TextureMap chimney_single = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_single"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_intake_bottom"))
                .put(TextureKey.PARTICLE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_top"));
        TextureMap chimney_top = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_bottom"))
                .put(TextureKey.PARTICLE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_top"));
        TextureMap chimney_middle = new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_middle"))
                .put(TextureKey.PARTICLE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_top"));
        TextureMap chimney_intake = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_intake_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_intake_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_intake_bottom"))
                .put(TextureKey.PARTICLE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/chimney/" + Registries.BLOCK.getId(block).getPath() + "_top"));
        Identifier singleModelId = ModModels.CHIMNEY_SINGLE.upload(block, chimney_single, blockStateModelGenerator.modelCollector);
        Identifier headModelId = ModModels.CHIMNEY_TOP.upload(block, chimney_top, blockStateModelGenerator.modelCollector);
        Identifier middleModelId = ModModels.CHIMNEY_MIDDLE.upload(block, chimney_middle, blockStateModelGenerator.modelCollector);
        Identifier tailModelId = ModModels.CHIMNEY_INTAKE.upload(block, chimney_intake, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(ModProperties.VERTICAL_CONNECTION)
                        .register(VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, headModelId))
                        .register(VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, middleModelId))
                        .register(VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, tailModelId))
                        .register(VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, singleModelId))
                )
        );
    }

    public final void registerDesk(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        TextureMap desk = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_bottom"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_side_inner"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap desk_left = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_top_side"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_bottom_side"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_side_inner"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap desk_middle = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_top_middle"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_bottom_middle"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_back_middle"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap desk_right = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_top_side"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_bottom_side"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_side_inner"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath().replace("desk", "drawer") + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier deskModelId = ModModels.DESK.upload(block, desk, blockStateModelGenerator.modelCollector);
        Identifier deskLeftModelId = ModModels.DESK_LEFT.upload(block, desk_left, blockStateModelGenerator.modelCollector);
        Identifier deskMiddleModelId = ModModels.DESK_MIDDLE.upload(block, desk_middle, blockStateModelGenerator.modelCollector);
        Identifier deskRightModelId = ModModels.DESK_RIGHT.upload(block, desk_right, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, ModProperties.ADVANCED_HORIZONTAL_CONNECTION)
                        // North
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))

                        // Repeat for SOUTH
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId))

                        // Repeat for EAST
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))

                        // Repeat for WEST
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, deskMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                )
        );
    }

    public final void registerDrawer(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        TextureMap drawer = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_left = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_side"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom_side"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front_side"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_left_diff = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_side"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_left_diff_left = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_middle"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom_side"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front_side"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_middle = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_middle"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom_middle"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front_middle"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_middle"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_middle_diff = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_middle"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_right = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_side"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom_side"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front_side_right"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_right_diff = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_side"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap drawer_right_diff_right = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_top_middle"))
                .put(TextureKey.SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side"))
                .put(TextureKey.BOTTOM, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_bottom_side"))
                .put(ModTextureKey.INNER_SIDE, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_side_inner"))
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_front_side_right"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/drawer/" + Registries.BLOCK.getId(block).getPath() + "_back_side"))
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier drawerModelId = ModModels.DRAWER.upload(block, drawer, blockStateModelGenerator.modelCollector);
        Identifier drawerLeftModelId = ModModels.DRAWER_LEFT.upload(block, drawer_left, blockStateModelGenerator.modelCollector);
        Identifier drawerLeftDiffModelId = ModModels.DRAWER_LEFT_DIFF.upload(block, drawer_left_diff, blockStateModelGenerator.modelCollector);
        Identifier drawerLeftDiffLeftModelId = ModModels.DRAWER_LEFT_DIFF_LEFT.upload(block, drawer_left_diff_left, blockStateModelGenerator.modelCollector);
        Identifier drawerMiddleModelId = ModModels.DRAWER_MIDDLE.upload(block, drawer_middle, blockStateModelGenerator.modelCollector);
        Identifier drawerMiddleDiffModelId = ModModels.DRAWER_MIDDLE_DIFF.upload(block, drawer_middle_diff, blockStateModelGenerator.modelCollector);
        Identifier drawerRightModelId = ModModels.DRAWER_RIGHT.upload(block, drawer_right, blockStateModelGenerator.modelCollector);
        Identifier drawerRightDiffModelId = ModModels.DRAWER_RIGHT_DIFF.upload(block, drawer_right_diff, blockStateModelGenerator.modelCollector);
        Identifier drawerRightDiffRightModelId = ModModels.DRAWER_RIGHT_DIFF_RIGHT.upload(block, drawer_right_diff_right, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, ModProperties.ADVANCED_HORIZONTAL_CONNECTION)
                        // North
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))

                        // Repeat for SOUTH
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffLeftModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffRightModelId))
                        .register(Direction.SOUTH, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleDiffModelId))

                        // Repeat for EAST
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))

                        // Repeat for WEST
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.LEFT_DIFF_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerLeftDiffLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.RIGHT_DIFF_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerRightDiffRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, AdvancedHorizontalLinearConnectionBlock.MIDDLE_DIFF, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, drawerMiddleDiffModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                )
        );
    }

    public final void registerWallMirror(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier mirrorTexture) {
        TextureMap wall_mirror = new TextureMap()
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_frame"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_board"))
                .put(TextureKey.PARTICLE, mirrorTexture);
        TextureMap wall_mirror_top = new TextureMap()
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_frame_top"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_back_top"))
                .put(TextureKey.PARTICLE, mirrorTexture);
        TextureMap wall_mirror_middle = new TextureMap()
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_frame_middle"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_board_middle"))
                .put(TextureKey.PARTICLE, mirrorTexture);
        TextureMap wall_mirror_bottom = new TextureMap()
                .put(TextureKey.FRONT, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_frame_bottom"))
                .put(TextureKey.BACK, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/shared/" + Registries.BLOCK.getId(block).getPath().replace("_wall_mirror", "") + "_board_bottom"))
                .put(TextureKey.PARTICLE, mirrorTexture);
        Identifier wallMirrorModelId = ModModels.WALL_MIRROR.upload(block, wall_mirror, blockStateModelGenerator.modelCollector);
        Identifier wallMirrorTopModelId = ModModels.WALL_MIRROR_TOP.upload(block, wall_mirror_top, blockStateModelGenerator.modelCollector);
        Identifier wallMirrorMiddleModelId = ModModels.WALL_MIRROR_MIDDLE.upload(block, wall_mirror_middle, blockStateModelGenerator.modelCollector);
        Identifier wallMirrorBottomModelId = ModModels.WALL_MIRROR_BOTTOM.upload(block, wall_mirror_bottom, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, ModProperties.VERTICAL_CONNECTION)
                        .register(Direction.NORTH, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorModelId))
                        .register(Direction.NORTH, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorTopModelId))
                        .register(Direction.NORTH, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorMiddleModelId))
                        .register(Direction.NORTH, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorBottomModelId))

                        // Repeat for SOUTH
                        .register(Direction.SOUTH, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.SOUTH, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorTopModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.SOUTH, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.SOUTH, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorBottomModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))

                        // Repeat for EAST
                        .register(Direction.EAST, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.EAST, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorTopModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.EAST, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.EAST, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorBottomModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))

                        // Repeat for WEST
                        .register(Direction.WEST, VerticalLinearConnectionBlock.SINGLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.WEST, VerticalLinearConnectionBlock.HEAD, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorTopModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.WEST, VerticalLinearConnectionBlock.MIDDLE, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.WEST, VerticalLinearConnectionBlock.TAIL, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, wallMirrorBottomModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                ));
    }

    public final void registerLargeStump(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier baseBlock) {
        // Define texture maps
        String blockNamespace = baseBlock.getNamespace();
        String blockPath = baseBlock.getPath();
        String baseTexturePath = "block/" + blockPath;

        TextureMap baseTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(blockNamespace, baseTexturePath + "_top"))
                .put(TextureKey.SIDE, Identifier.of(blockNamespace, baseTexturePath));

        TextureMap cornerTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/large_stump/" + Registries.BLOCK.getId(block).getPath() + "_corner_top"))
                .put(TextureKey.SIDE, Identifier.of(blockNamespace, baseTexturePath));

        TextureMap doubleTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/large_stump/" + Registries.BLOCK.getId(block).getPath() + "_double_top"))
                .put(TextureKey.SIDE, Identifier.of(blockNamespace, baseTexturePath));

        TextureMap innerCornerPieceTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/large_stump/" + Registries.BLOCK.getId(block).getPath() + "_corner_inner_top"))
                .put(TextureKey.SIDE, Identifier.of(blockNamespace, baseTexturePath));

        TextureMap middleTexture = new TextureMap()
                .put(TextureKey.TOP, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/large_stump/" + Registries.BLOCK.getId(block).getPath() + "_middle_top"))
                .put(TextureKey.SIDE, Identifier.of(blockNamespace, baseTexturePath));

        // Upload models for various stump states
        Identifier stumpModelID = ModModels.LARGE_STUMP.upload(block, baseTexture, blockStateModelGenerator.modelCollector);
        Identifier stumpCornerModelID = ModModels.LARGE_STUMP_CORNER.upload(block, cornerTexture, blockStateModelGenerator.modelCollector);
        Identifier stumpCornerPieceModelID = ModModels.LARGE_STUMP_CORNER_PIECE.upload(block, cornerTexture, blockStateModelGenerator.modelCollector);
        Identifier stumpDoubleModelID = ModModels.LARGE_STUMP_DOUBLE.upload(block, doubleTexture, blockStateModelGenerator.modelCollector);
        Identifier stumpInnerCornerPieceModelID = ModModels.LARGE_STUMP_INNER_CORNER_PIECE.upload(block, innerCornerPieceTexture, blockStateModelGenerator.modelCollector);
        Identifier stumpMiddleModelID = ModModels.LARGE_STUMP_MIDDLE.upload(block, middleTexture, blockStateModelGenerator.modelCollector);
        Identifier stumpSideModelID = ModModels.LARGE_STUMP_SIDE.upload(block, middleTexture, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpDoubleModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpDoubleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpMiddleModelID))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpMiddleModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(ModProperties.SOUTH_EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpInnerCornerPieceModelID))
                .with(When.create().set(ModProperties.SOUTH_WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(ModProperties.NORTH_WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(ModProperties.NORTH_EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpInnerCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.SOUTH, true).set(Properties.EAST, true).set(ModProperties.SOUTH_EAST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerPieceModelID))
                .with(When.create().set(Properties.SOUTH, true).set(Properties.WEST, true).set(ModProperties.SOUTH_WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.WEST, true).set(ModProperties.NORTH_WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(ModProperties.NORTH_EAST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerPieceModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerModelID))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpCornerModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpSideModelID))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, true).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, stumpSideModelID).put(VariantSettings.Y, VariantSettings.Rotation.R270))
        );
    }

    public final void registerCouch(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier breakParticle) {
        TextureMap couch = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/couch/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap couchLeft = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/couch/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap couchRight = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/couch/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap couchMiddle = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/couch/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap couchInner = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/couch/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        TextureMap couchOuter = new TextureMap()
                .put(TextureKey.ALL, Identifier.of(Registries.BLOCK.getId(block).getNamespace(), "block/couch/" + Registries.BLOCK.getId(block).getPath()))
                .put(TextureKey.PARTICLE, breakParticle);
        Identifier couchModelId = ModModels.COUCH.upload(block, couch, blockStateModelGenerator.modelCollector);
        Identifier couchLeftModelId = ModModels.COUCH_LEFT.upload(block, couchLeft, blockStateModelGenerator.modelCollector);
        Identifier couchRightModelId = ModModels.COUCH_RIGHT.upload(block, couchRight, blockStateModelGenerator.modelCollector);
        Identifier couchMiddleModelId = ModModels.COUCH_MIDDLE.upload(block, couchMiddle, blockStateModelGenerator.modelCollector);
        Identifier couchInnerModelId = ModModels.COUCH_INNER.upload(block, couchInner, blockStateModelGenerator.modelCollector);
        Identifier couchOuterModelId = ModModels.COUCH_OUTER.upload(block, couchOuter, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, ModProperties.HORIZONTAL_CONNECTION, Properties.STAIR_SHAPE)
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.LEFT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.NORTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))

                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.LEFT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchLeftModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.MIDDLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchMiddleModelId))
                        .register(Direction.SOUTH, HorizontalLinearConnectionBlock.RIGHT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchRightModelId))

                        .register(Direction.WEST, HorizontalLinearConnectionBlock.SINGLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.LEFT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.RIGHT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.WEST, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))

                        .register(Direction.EAST, HorizontalLinearConnectionBlock.SINGLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.SINGLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.SINGLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.LEFT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchLeftModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.LEFT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.LEFT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchMiddleModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.MIDDLE, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.RIGHT, StairShape.STRAIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchRightModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.RIGHT, StairShape.INNER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchInnerModelId))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_LEFT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(Direction.EAST, HorizontalLinearConnectionBlock.RIGHT, StairShape.OUTER_RIGHT, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, couchOuterModelId))
                ));
    }
}
