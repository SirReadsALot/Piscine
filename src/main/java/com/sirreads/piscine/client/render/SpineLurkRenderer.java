package com.sirreads.piscine.client.render;

import com.sirreads.piscine.PiscineSRAL;
import com.sirreads.piscine.client.model.SpineLurkModel;
import com.sirreads.piscine.entities.SpineLurkEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SpineLurkRenderer extends MobRenderer<SpineLurkEntity, SpineLurkModel<SpineLurkEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(PiscineSRAL.MOD_ID, "assets/piscine/entity/spinelurk.png");

    public SpineLurkRenderer(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new SpineLurkModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(SpineLurkEntity entity) {
        return TEXTURE;
    }
}
