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

        // Register all blocks in the "BLOCKS" registry
        Registration.BLOCKS.register(modEventBus);

        // Register all items in the "ITEMS" registry
        Registration.ITEMS.register(modEventBus);

        // Register all recipes in the "RECIPE_SERIALIZERS" registry
        Registration.RECIPE_SERIALIZERS.register(modEventBus);

        // Register the blocks in the creative menu
        modEventBus.addListener(Registration::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
