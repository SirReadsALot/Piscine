package com.sirreads.piscine.init;

import com.sirreads.piscine.PiscineSRAL;
import com.sirreads.piscine.entities.SpineLurkEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, PiscineSRAL.MOD_ID);

    // Entity Types
    public static final RegistryObject<EntityType<SpineLurkEntity>> SpineLurk = ENTITY_TYPES.register("spinelurk",
            () -> EntityType.Builder.of(SpineLurkEntity::new, EntityClassification.CREATURE)
                    .sized(1.5f, 1.5f)
                    .build(String.valueOf(new ResourceLocation(PiscineSRAL.MOD_ID, "assets/piscine/entity/spinelurk.png"))));
}
