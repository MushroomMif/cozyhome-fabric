package net.luckystudio.cozyhome.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.luckystudio.cozyhome.block.ModBlocks;
import net.luckystudio.cozyhome.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipe.RecipeGenerator.hasItem;

// Criterion is the necessary function needed to unlock the recipe.

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerCounterRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("@@@")
                .pattern("# #")
                .pattern("###")
                .input('@', input1)
                .input('#', input2)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    public static void offerStorageCounterRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("@@@")
                .pattern("#C#")
                .pattern("###")
                .input('@', input1)
                .input('#', input2)
                .input('C', Items.CHEST)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    public static void offerSinkCounterRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("@@@")
                .pattern("#C#")
                .pattern("###")
                .input('@', input1)
                .input('#', input2)
                .input('C', Items.CAULDRON)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    public static void offerTableRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("###")
                .pattern("@ @")
                .pattern("@ @")
                .input('@', input1)
                .input('#', input2)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    public static void offerChairRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("#  ")
                .pattern("@@@")
                .pattern("# #")
                .input('#', input1)
                .input('@', input2)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    public static void offerWallClockRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern(" # ")
                .pattern("#C#")
                .pattern(" # ")
                .input('#', input)
                .input('C', Items.CLOCK)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerGrandfatherClockRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern(" @ ")
                .pattern(" # ")
                .pattern(" # ")
                .input('@', input)
                .input('#', input2)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerLampRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible input2, ItemConvertible input3) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("#")
                .pattern("@")
                .pattern("C")
                .input('#', input)
                .input('@', input2)
                .input('C', input3)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerSofaRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("@@")
                .pattern("@@")
                .pattern("##")
                .input('@', Items.WHITE_WOOL)
                .input('#', input)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerCouchRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern("@@")
                .pattern("##")
                .input('@', Items.WHITE_WOOL)
                .input('#', input)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerDeskRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("@@@")
                .pattern("# #")
                .pattern("# #")
                .input('@', input1)
                .input('#', input2)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    public static void offerDrawerRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("@@@")
                .pattern("#C#")
                .pattern("# #")
                .input('@', input1)
                .input('#', input2)
                .input('C', Items.CHEST)
                .criterion(hasItem(input1), generator.conditionsFromItem(input1))
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerWallMirrorRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('@', input1)
                .input('#', input2)
                .criterion(hasItem(input2), generator.conditionsFromItem(input2))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerLargeStumpRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("###")
                .pattern(" # ")
                .pattern(" # ")
                .input('#', input)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerChimneyRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .pattern("# #")
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), generator.conditionsFromItem(input))
                .offerTo(exporter);
    }


    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerCushionRecipe(RecipeGenerator generator, RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible input2) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .input('@', input)
                .input('#', input2)
                .criterion(hasItem(Items.SPYGLASS), generator.conditionsFromItem(Items.SPYGLASS))
                .offerTo(exporter);
    }

    // Criterion needs to be fixed to take in a tag instead of a singular item, instead it should be tag planks
    public static void offerTelescopeRecipe(RecipeGenerator generator, RecipeExporter exporter) {
        generator.createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TELESCOPE, 1)
                .pattern(" # ")
                .pattern(" @ ")
                .pattern("@ @")
                .input('#', Items.SPYGLASS)
                .input('@', Items.COPPER_INGOT)
                .criterion(hasItem(Items.SPYGLASS), generator.conditionsFromItem(Items.SPYGLASS))
                .offerTo(exporter);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                // Counters
                offerCounterRecipe(this, exporter, ModBlocks.OAK_COUNTER, Blocks.BRICKS, Blocks.OAK_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.SPRUCE_COUNTER, Blocks.POLISHED_ANDESITE, Blocks.SPRUCE_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.BIRCH_COUNTER, Blocks.POLISHED_GRANITE, Blocks.BIRCH_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.JUNGLE_COUNTER, Blocks.POLISHED_GRANITE, Blocks.JUNGLE_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.ACACIA_COUNTER, Blocks.POLISHED_DIORITE, Blocks.ACACIA_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.DARK_OAK_COUNTER, Blocks.DEEPSLATE_TILES, Blocks.DARK_OAK_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.MANGROVE_COUNTER, Blocks.PACKED_MUD, Blocks.MANGROVE_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.BAMBOO_COUNTER, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.CRIMSON_COUNTER, Blocks.NETHER_WART_BLOCK, Blocks.CRIMSON_PLANKS);
                offerCounterRecipe(this, exporter, ModBlocks.WARPED_COUNTER, Blocks.WARPED_WART_BLOCK, Blocks.WARPED_PLANKS);

                // Storage Counters
                offerStorageCounterRecipe(this, exporter, ModBlocks.OAK_STORAGE_COUNTER, Blocks.BRICKS, Blocks.OAK_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.SPRUCE_STORAGE_COUNTER, Blocks.POLISHED_ANDESITE, Blocks.SPRUCE_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.BIRCH_STORAGE_COUNTER, Blocks.POLISHED_GRANITE, Blocks.BIRCH_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.JUNGLE_STORAGE_COUNTER, Blocks.POLISHED_GRANITE, Blocks.JUNGLE_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.ACACIA_STORAGE_COUNTER, Blocks.POLISHED_DIORITE, Blocks.ACACIA_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.DARK_OAK_STORAGE_COUNTER, Blocks.DEEPSLATE_TILES, Blocks.DARK_OAK_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.MANGROVE_STORAGE_COUNTER, Blocks.PACKED_MUD, Blocks.MANGROVE_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.BAMBOO_STORAGE_COUNTER, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.CRIMSON_STORAGE_COUNTER, Blocks.NETHER_WART_BLOCK, Blocks.CRIMSON_PLANKS);
                offerStorageCounterRecipe(this, exporter, ModBlocks.WARPED_STORAGE_COUNTER, Blocks.WARPED_WART_BLOCK, Blocks.WARPED_PLANKS);

                // Sink Counters
                offerSinkCounterRecipe(this, exporter, ModBlocks.OAK_SINK_COUNTER, Blocks.BRICKS, Blocks.OAK_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.SPRUCE_SINK_COUNTER, Blocks.POLISHED_ANDESITE, Blocks.SPRUCE_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.BIRCH_SINK_COUNTER, Blocks.POLISHED_GRANITE, Blocks.BIRCH_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.JUNGLE_SINK_COUNTER, Blocks.POLISHED_GRANITE, Blocks.JUNGLE_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.ACACIA_SINK_COUNTER, Blocks.POLISHED_DIORITE, Blocks.ACACIA_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.DARK_OAK_SINK_COUNTER, Blocks.DEEPSLATE_TILES, Blocks.DARK_OAK_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.MANGROVE_SINK_COUNTER, Blocks.PACKED_MUD, Blocks.MANGROVE_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.BAMBOO_SINK_COUNTER, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.CRIMSON_SINK_COUNTER, Blocks.NETHER_WART_BLOCK, Blocks.CRIMSON_PLANKS);
                offerSinkCounterRecipe(this, exporter, ModBlocks.WARPED_SINK_COUNTER, Blocks.WARPED_WART_BLOCK, Blocks.WARPED_PLANKS);

                // Tables
                offerTableRecipe(this, exporter, ModBlocks.OAK_TABLE, Blocks.OAK_PLANKS, Blocks.OAK_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.SPRUCE_TABLE, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.BIRCH_TABLE, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.JUNGLE_TABLE, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.ACACIA_TABLE, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.DARK_OAK_TABLE, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.MANGROVE_TABLE, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.BAMBOO_TABLE, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.CRIMSON_TABLE, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.WARPED_TABLE, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB);
                offerTableRecipe(this, exporter, ModBlocks.IRON_TABLE, Items.IRON_INGOT, Items.IRON_NUGGET);
                offerTableRecipe(this, exporter, ModBlocks.GLASS_TABLE, Blocks.GLASS, Blocks.GLASS_PANE);

                // Chairs
                offerChairRecipe(this, exporter, ModBlocks.OAK_CHAIR, Blocks.OAK_PLANKS, Blocks.OAK_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.SPRUCE_CHAIR, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.BIRCH_CHAIR, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.JUNGLE_CHAIR, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.ACACIA_CHAIR, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.DARK_OAK_CHAIR, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.MANGROVE_CHAIR, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.CHERRY_CHAIR, Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.BAMBOO_CHAIR, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.CRIMSON_CHAIR, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB);
                offerChairRecipe(this, exporter, ModBlocks.WARPED_CHAIR, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB);

                // Wall Clocks
                offerWallClockRecipe(this, exporter, ModBlocks.OAK_WALL_CLOCK, Blocks.OAK_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.SPRUCE_WALL_CLOCK, Blocks.SPRUCE_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.BIRCH_WALL_CLOCK, Blocks.BIRCH_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.JUNGLE_WALL_CLOCK, Blocks.JUNGLE_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.ACACIA_WALL_CLOCK, Blocks.ACACIA_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.DARK_OAK_WALL_CLOCK, Blocks.DARK_OAK_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.MANGROVE_WALL_CLOCK, Blocks.MANGROVE_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.BAMBOO_WALL_CLOCK, Blocks.BAMBOO_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.CRIMSON_WALL_CLOCK, Blocks.CRIMSON_SLAB);
                offerWallClockRecipe(this, exporter, ModBlocks.WARPED_WALL_CLOCK, Blocks.WARPED_SLAB);

                // Grandfather Clocks
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.OAK_GRANDFATHER_CLOCK, ModBlocks.OAK_WALL_CLOCK, Blocks.OAK_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.SPRUCE_GRANDFATHER_CLOCK, ModBlocks.SPRUCE_WALL_CLOCK, Blocks.SPRUCE_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.BIRCH_GRANDFATHER_CLOCK, ModBlocks.BIRCH_WALL_CLOCK, Blocks.BIRCH_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.JUNGLE_GRANDFATHER_CLOCK, ModBlocks.JUNGLE_WALL_CLOCK, Blocks.JUNGLE_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.ACACIA_GRANDFATHER_CLOCK, ModBlocks.ACACIA_WALL_CLOCK, Blocks.ACACIA_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.DARK_OAK_GRANDFATHER_CLOCK, ModBlocks.DARK_OAK_WALL_CLOCK, Blocks.DARK_OAK_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.MANGROVE_GRANDFATHER_CLOCK, ModBlocks.MANGROVE_WALL_CLOCK, Blocks.MANGROVE_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.BAMBOO_GRANDFATHER_CLOCK, ModBlocks.BAMBOO_WALL_CLOCK, Blocks.BAMBOO_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.CRIMSON_GRANDFATHER_CLOCK, ModBlocks.CRIMSON_WALL_CLOCK, Blocks.CRIMSON_PLANKS);
                offerGrandfatherClockRecipe(this, exporter, ModBlocks.WARPED_GRANDFATHER_CLOCK, ModBlocks.WARPED_WALL_CLOCK, Blocks.WARPED_PLANKS);

                // Lamps
                offerLampRecipe(this, exporter, ModBlocks.OAK_LAMP, Blocks.WHITE_WOOL, Blocks.LANTERN, Blocks.OAK_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.SPRUCE_LAMP, Blocks.WHITE_WOOL, Blocks.LANTERN, Blocks.SPRUCE_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.BIRCH_LAMP, Blocks.WHITE_WOOL, Blocks.LANTERN, Blocks.BIRCH_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.JUNGLE_LAMP, Blocks.WHITE_WOOL, Blocks.CANDLE, Blocks.JUNGLE_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.ACACIA_LAMP, Blocks.WHITE_WOOL, Blocks.LANTERN, Blocks.ACACIA_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.DARK_OAK_LAMP, Blocks.WHITE_WOOL, Blocks.LANTERN, Blocks.DARK_OAK_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.MANGROVE_LAMP, Items.PAPER, Blocks.CANDLE, Blocks.MANGROVE_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.CHERRY_LAMP, Blocks.WHITE_WOOL, Blocks.LANTERN, Blocks.CHERRY_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.BAMBOO_LAMP, Blocks.BAMBOO_PLANKS, Blocks.CANDLE, Blocks.BAMBOO_PLANKS);
                offerLampRecipe(this, exporter, ModBlocks.CRIMSON_LAMP, Blocks.CRIMSON_FUNGUS, Blocks.CRIMSON_NYLIUM, Blocks.FLOWER_POT);
                offerLampRecipe(this, exporter, ModBlocks.WARPED_LAMP, Blocks.WARPED_FUNGUS, Blocks.WARPED_NYLIUM, Blocks.FLOWER_POT);

                // Sofas
                offerSofaRecipe(this, exporter, ModBlocks.OAK_SOFA, Blocks.OAK_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.SPRUCE_SOFA, Blocks.SPRUCE_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.BIRCH_SOFA, Blocks.BIRCH_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.JUNGLE_SOFA, Blocks.JUNGLE_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.ACACIA_SOFA, Blocks.ACACIA_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.DARK_OAK_SOFA, Blocks.DARK_OAK_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.MANGROVE_SOFA, Blocks.MANGROVE_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.CHERRY_SOFA, Blocks.CHERRY_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.BAMBOO_SOFA, Blocks.BAMBOO_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.CRIMSON_SOFA, Blocks.CRIMSON_SLAB);
                offerSofaRecipe(this, exporter, ModBlocks.WARPED_SOFA, Blocks.WARPED_SLAB);

                // Couches
                offerCouchRecipe(this, exporter, ModBlocks.OAK_COUCH, Blocks.OAK_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.SPRUCE_COUCH, Blocks.SPRUCE_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.BIRCH_COUCH, Blocks.BIRCH_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.JUNGLE_COUCH, Blocks.JUNGLE_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.ACACIA_COUCH, Blocks.ACACIA_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.DARK_OAK_COUCH, Blocks.DARK_OAK_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.MANGROVE_COUCH, Blocks.MANGROVE_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.CHERRY_COUCH, Blocks.CHERRY_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.BAMBOO_COUCH, Blocks.BAMBOO_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.CRIMSON_COUCH, Blocks.CRIMSON_SLAB);
                offerCouchRecipe(this, exporter, ModBlocks.WARPED_COUCH, Blocks.WARPED_SLAB);

                // Desks
                offerDeskRecipe(this, exporter, ModBlocks.OAK_DESK, Blocks.OAK_SLAB, Blocks.OAK_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.SPRUCE_DESK, Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.BIRCH_DESK, Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.JUNGLE_DESK, Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.ACACIA_DESK, Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.DARK_OAK_DESK, Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.MANGROVE_DESK, Blocks.MANGROVE_SLAB, Blocks.MANGROVE_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.BAMBOO_DESK, Blocks.BAMBOO_SLAB, Blocks.BAMBOO_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.CRIMSON_DESK, Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
                offerDeskRecipe(this, exporter, ModBlocks.WARPED_DESK, Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS);

                // Drawers
                offerDrawerRecipe(this, exporter, ModBlocks.OAK_DRAWER, Blocks.OAK_SLAB, Blocks.OAK_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.SPRUCE_DRAWER, Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.BIRCH_DRAWER, Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.JUNGLE_DRAWER, Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.ACACIA_DRAWER, Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.DARK_OAK_DRAWER, Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.MANGROVE_DRAWER, Blocks.MANGROVE_SLAB, Blocks.MANGROVE_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.BAMBOO_DRAWER, Blocks.BAMBOO_SLAB, Blocks.BAMBOO_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.CRIMSON_DRAWER, Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
                offerDrawerRecipe(this, exporter, ModBlocks.WARPED_DRAWER, Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS);

                // Wall Mirrors
                offerWallMirrorRecipe(this, exporter, ModBlocks.OAK_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.OAK_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.SPRUCE_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.SPRUCE_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.BIRCH_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.BIRCH_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.ACACIA_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.ACACIA_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.DARK_OAK_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.DARK_OAK_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.MANGROVE_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.MANGROVE_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.CHERRY_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.CHERRY_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.BAMBOO_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.BAMBOO_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.CRIMSON_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.CRIMSON_PLANKS);
                offerWallMirrorRecipe(this, exporter, ModBlocks.WARPED_WALL_MIRROR, Items.AMETHYST_SHARD, Blocks.WARPED_PLANKS);

                // Large Stumps
                offerLargeStumpRecipe(this, exporter, ModBlocks.OAK_LARGE_STUMP, Blocks.OAK_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.SPRUCE_LARGE_STUMP, Blocks.SPRUCE_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.BIRCH_LARGE_STUMP, Blocks.BIRCH_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.JUNGLE_LARGE_STUMP, Blocks.JUNGLE_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.ACACIA_LARGE_STUMP, Blocks.ACACIA_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.DARK_OAK_LARGE_STUMP, Blocks.DARK_OAK_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.MANGROVE_LARGE_STUMP, Blocks.MANGROVE_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.CHERRY_LARGE_STUMP, Blocks.CHERRY_LOG);
                offerLargeStumpRecipe(this, exporter, ModBlocks.BAMBOO_LARGE_STUMP, Blocks.BAMBOO);
                offerLargeStumpRecipe(this, exporter, ModBlocks.CRIMSON_LARGE_STUMP, Blocks.CRIMSON_STEM);
                offerLargeStumpRecipe(this, exporter, ModBlocks.WARPED_LARGE_STUMP, Blocks.WARPED_STEM);

                // Chimneys
                offerChimneyRecipe(this, exporter, ModBlocks.STONE_BRICK_CHIMNEY, Blocks.STONE_BRICKS);
                offerChimneyRecipe(this, exporter, ModBlocks.TUFF_CHIMNEY, Blocks.TUFF);
                offerChimneyRecipe(this, exporter, ModBlocks.BRICK_CHIMNEY, Blocks.BRICKS);
                offerChimneyRecipe(this, exporter, ModBlocks.NETHER_BRICK_CHIMNEY, Blocks.NETHER_BRICKS);
                offerChimneyRecipe(this, exporter, ModBlocks.PURPUR_CHIMNEY, Blocks.PURPUR_BLOCK);

                offerCushionRecipe(this, exporter, ModItems.CUSHION, Blocks.WHITE_WOOL, Items.STRING);
                offerCushionRecipe(this, exporter, ModItems.HAY_CUSHION, Blocks.HAY_BLOCK, Items.STRING);

                offerTelescopeRecipe(this, exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "CozyHomeRecipeProvider";
    }
}
