package com.sirreads.piscine;

import com.sirreads.piscine.entities.SpineLurkEntity;
import com.sirreads.piscine.init.ModEntityType;
import com.sirreads.piscine.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("piscine")
public class PiscineSRAL
{
    public static final ItemGroup TAB = new ItemGroup("piscineTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.LUXONITE.get());
            // return new ItemStack(RegistryHandler.FUNKY_FISH.get());
        }
    };
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "piscine";

    public PiscineSRAL() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        //ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityType.SpineLurk.get(), SpineLurkEntity.setCustomAttributes().build());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {}
}

