package net.randomstuff;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandomStuff.MODID)
public class RandomStuff
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "randomstuff";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public RandomStuff()
    {
        // Declare modEventBus to register items/blocks/etc.
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register all block/item registries
        Registration.MOD_BLOCKS.register(modEventBus);

        Registration.VANILLA_BLOCKS.register(modEventBus);

        Registration.VANILLA_ITEMS.register(modEventBus);

        Registration.MOD_ITEMS.register(modEventBus);

        Registration.RECIPE_SERIALIZERS.register(modEventBus);

        // Register the blocks in the creative menu
        modEventBus.addListener(Registration::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
