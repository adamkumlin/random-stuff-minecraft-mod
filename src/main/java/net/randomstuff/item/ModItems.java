package net.randomstuff.item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.randomstuff.RandomStuff;
import net.randomstuff.block.ModBlocks;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStuff.MODID);

    public static final RegistryObject<BlockItem> PINKSTONE_BLOCK_ITEM = ITEMS.register("pinkstone_block_item", () -> new BlockItem(ModBlocks.PINKSTONE_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
