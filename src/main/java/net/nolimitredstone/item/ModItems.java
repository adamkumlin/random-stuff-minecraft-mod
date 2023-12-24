package net.nolimitredstone.item;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nolimitredstone.NoLimitRedstone;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NoLimitRedstone.MODID);

    public static final RegistryObject<Item> PINKSTONE_DUST = ITEMS.register("pinkstone_dust", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NAM = ITEMS.register("nam", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
