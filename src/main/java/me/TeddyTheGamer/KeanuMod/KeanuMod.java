package me.TeddyTheGamer.KeanuMod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.TeddyTheGamer.KeanuMod.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("keanumod")
public class KeanuMod
{
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger("keanumod");
    public static final String MOD_ID = "keanumod";
    public static KeanuMod instance;
    

    public KeanuMod() {
     
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        RegistryHandler.init();
    }

    private void setup(final FMLCommonSetupEvent event)
    { }

    private void doClientStuff(final FMLClientSetupEvent event) {}
    

}
