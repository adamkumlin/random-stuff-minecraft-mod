package net.randomstuff;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.randomstuff.block.BuildersAccordionBlock;
import net.randomstuff.tier.ModTiers;

public class Registration {

    // Create three different deferred registers to store the blocks, items, blockentities and recipes

    // Create registries for vanilla blocks/items
    public static final DeferredRegister<Block> VANILLA_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    // Create registries for mod blocks/items
    public static final DeferredRegister<Block> MOD_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuff.MODID);
    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStuff.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RandomStuff.MODID);

    // Register registry to keep track of recipes
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, RandomStuff.MODID);

    // Create new block, and link it to a blockitem
    public static final RegistryObject<Block> PINKSTONE_BLOCK = MOD_BLOCKS.register("pinkstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> PINKSTONE_BLOCK_ITEM = MOD_ITEMS.register("pinkstone_block", () -> new BlockItem(PINKSTONE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> CURSED_STONE_ITEM = MOD_ITEMS.register("cursed_stone", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CURSED_PICKAXE = MOD_ITEMS.register("cursed_pickaxe", () -> new PickaxeItem(ModTiers.CURSE_STONE,10, -2.8F, new Item.Properties()));

    // Replace vanilla bedrock item with a custom one with a strength value of 100000
    // This makes the block breakable, technically with any tool, it will however take a long long time if a cursed pickaxe is not used
    public static final RegistryObject<Block> BEDROCK_BLOCK = VANILLA_BLOCKS.register("bedrock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).strength(100000)));
    public static final RegistryObject<Item> BEDROCK_ITEM = VANILLA_ITEMS.register("bedrock", () -> new BlockItem(BEDROCK_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Block> BUILDERS_ACCORDION_BLOCK = MOD_BLOCKS.register("builders_accordion", () -> new BuildersAccordionBlock(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Item> BUILDERS_ACCORDION_ITEM = MOD_ITEMS.register("builders_accordion", () -> new BlockItem(BUILDERS_ACCORDION_BLOCK.get(), new Item.Properties()));
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Add items to creative mode tabs
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(PINKSTONE_BLOCK_ITEM);
        } else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(CURSED_STONE_ITEM);
        } else if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(CURSED_PICKAXE);
            event.accept(BUILDERS_ACCORDION_ITEM);
        } else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(BEDROCK_ITEM);
        }
    }
}