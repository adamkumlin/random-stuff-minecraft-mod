package net.randomstuff;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.randomstuff.RandomStuff;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuff.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStuff.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RandomStuff.MODID);

    public static final RegistryObject<Block> PINKSTONE_BLOCK = BLOCKS.register("pinkstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Item> PINKSTONE_BLOCK_ITEM = ITEMS.register("pinkstone_block", () -> new BlockItem(PINKSTONE_BLOCK.get(), new Item.Properties()));

    public static void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

            event.accept(Registration.PINKSTONE_BLOCK_ITEM);
        }
    }
}