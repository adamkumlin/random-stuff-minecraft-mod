package net.randomstuff;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.randomstuff.tier.ModTiers;

public class Registration {

    // Create three different deferred registers to store the blocks, items, blockentities and recipes
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuff.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStuff.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RandomStuff.MODID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, RandomStuff.MODID);

    // Create new block, and link it to a blockitem
    public static final RegistryObject<Block> PINKSTONE_BLOCK = BLOCKS.register("pinkstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Item> PINKSTONE_BLOCK_ITEM = ITEMS.register("pinkstone_block", () -> new BlockItem(PINKSTONE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> CURSED_STONE_ITEM = ITEMS.register("cursed_stone", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CURSED_PICKAXE = ITEMS.register("cursed_pickaxe", () -> new PickaxeItem(ModTiers.CURSE_STONE,10, -2.8F, new Item.Properties()));

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(PINKSTONE_BLOCK_ITEM);
        } else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(CURSED_STONE_ITEM);
        } else if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(CURSED_PICKAXE);
        }
    }
}