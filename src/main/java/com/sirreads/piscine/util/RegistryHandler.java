package com.sirreads.piscine.util;

import com.sirreads.piscine.PiscineSRAL;
import com.sirreads.piscine.blocks.BlockItemBase;
import com.sirreads.piscine.blocks.LockdownBlock;
import com.sirreads.piscine.items.ItemBaseFOOD;
import com.sirreads.piscine.items.ItemBaseMATERIAL;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.items.wrapper.EntityEquipmentInvWrapper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PiscineSRAL.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PiscineSRAL.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // items
    public static final RegistryObject<Item> FUNKY_FISH = ITEMS.register("funky_fish", ItemBaseFOOD::new);
    public static final RegistryObject<Item> LUXONITE = ITEMS.register("luxonite", ItemBaseMATERIAL::new);
    // blocks
    public static final RegistryObject<Block> LOCKDOWN = BLOCKS.register("lockdown", LockdownBlock::new);
    // block items
    public static final RegistryObject<Item> LOCKDOWN_INGOT = ITEMS.register("lockdown", () -> new BlockItemBase(LOCKDOWN.get()));

    public static class Foods {
        public static final Food FUNKY_FISH = (new Food.Builder().nutrition(2).meat().saturationMod(12.8f).build());
    }
}
