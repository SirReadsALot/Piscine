package com.sirreads.piscine.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.sirreads.piscine.entities.SpineLurkEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpineLurkModel<T extends SpineLurkEntity> extends EntityModel<T> {
    private ModelRenderer Body;
    private ModelRenderer Leg;
    private ModelRenderer LowerSpines;
    private ModelRenderer SpineCollection;
    private ModelRenderer Spines3;
    private ModelRenderer Spines4;
    private ModelRenderer Spines5;
    private ModelRenderer SpineCollection2;
    private ModelRenderer Spines6;
    private ModelRenderer Spines7;
    private ModelRenderer Spines8;
    private ModelRenderer SpineCollection3;
    private ModelRenderer Spines9;
    private ModelRenderer Spines10;
    private ModelRenderer Spines11;
    private ModelRenderer SpineCollection4;
    private ModelRenderer Spines12;
    private ModelRenderer Spines13;
    private ModelRenderer Spines14;
    private ModelRenderer OutwardSpines;
    private ModelRenderer Spines;
    private ModelRenderer Spines2;
    private ModelRenderer OutwardSpines2;
    private ModelRenderer Spines15;
    private ModelRenderer Spines16;
    private ModelRenderer UpperSpines;
    private ModelRenderer UpSpines;
    private ModelRenderer UpSpines2;
    private ModelRenderer Leg2;
    private ModelRenderer Leg3;
    private ModelRenderer Leg4;


    public SpineLurkModel() {
        int textureWidth = 256;
        int textureHeight = 256;

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, 22.0F, 0.0F);
        Body.texOffs(0, 0).addBox(-5.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
        Body.texOffs(48, 0).addBox(-5.0F, 0.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);

        Leg = new ModelRenderer(this);
        Leg.setPos(-4.0F, -3.0F, 5.0F);
        Body.addChild(Leg);
        Leg.texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        LowerSpines = new ModelRenderer(this);
        LowerSpines.setPos(0.0F, 0.0F, 0.0F);
        Body.addChild(LowerSpines);


        SpineCollection = new ModelRenderer(this);
        SpineCollection.setPos(0.0F, 0.0F, 0.0F);
        LowerSpines.addChild(SpineCollection);


        Spines3 = new ModelRenderer(this);
        Spines3.setPos(7.0F, 0.0F, -6.0F);
        SpineCollection.addChild(Spines3);
        Spines3.texOffs(0, 93).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines4 = new ModelRenderer(this);
        Spines4.setPos(-5.0F, 0.0F, -6.0F);
        SpineCollection.addChild(Spines4);
        Spines4.texOffs(80, 90).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines5 = new ModelRenderer(this);
        Spines5.setPos(1.0F, 0.0F, -6.0F);
        SpineCollection.addChild(Spines5);
        Spines5.texOffs(80, 75).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        SpineCollection2 = new ModelRenderer(this);
        SpineCollection2.setPos(1.0F, 0.0F, -1.0F);
        LowerSpines.addChild(SpineCollection2);
        setRotationAngle(SpineCollection2, 0.0F, -1.5708F, 0.0F);


        Spines6 = new ModelRenderer(this);
        Spines6.setPos(7.0F, 0.0F, -6.0F);
        SpineCollection2.addChild(Spines6);
        Spines6.texOffs(80, 60).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines7 = new ModelRenderer(this);
        Spines7.setPos(-5.0F, 0.0F, -6.0F);
        SpineCollection2.addChild(Spines7);
        Spines7.texOffs(80, 45).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines8 = new ModelRenderer(this);
        Spines8.setPos(1.0F, 0.0F, -6.0F);
        SpineCollection2.addChild(Spines8);
        Spines8.texOffs(40, 78).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        SpineCollection3 = new ModelRenderer(this);
        SpineCollection3.setPos(2.0F, 0.0F, 0.0F);
        LowerSpines.addChild(SpineCollection3);
        setRotationAngle(SpineCollection3, -3.1416F, 0.0F, 3.1416F);


        Spines9 = new ModelRenderer(this);
        Spines9.setPos(7.0F, 0.0F, -6.0F);
        SpineCollection3.addChild(Spines9);
        Spines9.texOffs(0, 78).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines10 = new ModelRenderer(this);
        Spines10.setPos(-5.0F, 0.0F, -6.0F);
        SpineCollection3.addChild(Spines10);
        Spines10.texOffs(40, 63).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines11 = new ModelRenderer(this);
        Spines11.setPos(1.0F, 0.0F, -6.0F);
        SpineCollection3.addChild(Spines11);
        Spines11.texOffs(0, 63).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        SpineCollection4 = new ModelRenderer(this);
        SpineCollection4.setPos(1.0F, 0.0F, 1.0F);
        LowerSpines.addChild(SpineCollection4);
        setRotationAngle(SpineCollection4, 0.0F, 1.5708F, 0.0F);


        Spines12 = new ModelRenderer(this);
        Spines12.setPos(7.0F, 0.0F, -6.0F);
        SpineCollection4.addChild(Spines12);
        Spines12.texOffs(60, 30).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines13 = new ModelRenderer(this);
        Spines13.setPos(-5.0F, 0.0F, -6.0F);
        SpineCollection4.addChild(Spines13);
        Spines13.texOffs(60, 15).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines14 = new ModelRenderer(this);
        Spines14.setPos(1.0F, 0.0F, -6.0F);
        SpineCollection4.addChild(Spines14);
        Spines14.texOffs(60, 0).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        OutwardSpines = new ModelRenderer(this);
        OutwardSpines.setPos(0.0F, 0.0F, 0.0F);
        LowerSpines.addChild(OutwardSpines);


        Spines = new ModelRenderer(this);
        Spines.setPos(-5.0F, 0.0F, -6.0F);
        OutwardSpines.addChild(Spines);
        setRotationAngle(Spines, 0.0F, 0.7854F, 0.0F);
        Spines.texOffs(100, 0).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines2 = new ModelRenderer(this);
        Spines2.setPos(7.0F, 0.0F, -6.0F);
        OutwardSpines.addChild(Spines2);
        setRotationAngle(Spines2, 0.0F, -0.7854F, 0.0F);
        Spines2.texOffs(40, 93).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        OutwardSpines2 = new ModelRenderer(this);
        OutwardSpines2.setPos(2.0F, 0.0F, 0.0F);
        LowerSpines.addChild(OutwardSpines2);
        setRotationAngle(OutwardSpines2, -3.1416F, 0.0F, 3.1416F);


        Spines15 = new ModelRenderer(this);
        Spines15.setPos(-5.0F, 0.0F, -6.0F);
        OutwardSpines2.addChild(Spines15);
        setRotationAngle(Spines15, 0.0F, 0.7854F, 0.0F);
        Spines15.texOffs(40, 48).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        Spines16 = new ModelRenderer(this);
        Spines16.setPos(7.0F, 0.0F, -6.0F);
        OutwardSpines2.addChild(Spines16);
        setRotationAngle(Spines16, 0.0F, -0.7854F, 0.0F);
        Spines16.texOffs(0, 48).addBox(0.0F, -15.0F, -20.0F, 0.0F, 15.0F, 20.0F, 0.0F, false);

        UpperSpines = new ModelRenderer(this);
        UpperSpines.setPos(1.0F, -12.0F, 0.0F);
        Body.addChild(UpperSpines);


        UpSpines = new ModelRenderer(this);
        UpSpines.setPos(-1.0F, 1.0F, 0.0F);
        UpperSpines.addChild(UpSpines);
        UpSpines.texOffs(0, 19).addBox(1.0F, -19.0F, -15.0F, 0.0F, 19.0F, 30.0F, 0.0F, false);

        UpSpines2 = new ModelRenderer(this);
        UpSpines2.setPos(0.0F, 1.0F, -1.0F);
        UpperSpines.addChild(UpSpines2);
        setRotationAngle(UpSpines2, 0.0F, -1.5708F, 0.0F);
        UpSpines2.texOffs(0, 0).addBox(1.0F, -19.0F, -15.0F, 0.0F, 19.0F, 30.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setPos(6.0F, -3.0F, 5.0F);
        Body.addChild(Leg2);
        Leg2.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);

        Leg3 = new ModelRenderer(this);
        Leg3.setPos(6.0F, -3.0F, -5.0F);
        Body.addChild(Leg3);
        setRotationAngle(Leg3, -3.1416F, 0.0F, 3.1416F);
        Leg3.texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        Leg4 = new ModelRenderer(this);
        Leg4.setPos(-4.0F, -3.0F, -5.0F);
        Body.addChild(Leg4);
        setRotationAngle(Leg4, -3.1416F, 0.0F, -3.1416F);
        Leg4.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
    }

    public SpineLurkModel(ModelRenderer body, ModelRenderer leg, ModelRenderer lowerSpines, ModelRenderer spineCollection, ModelRenderer spines3, ModelRenderer spines4, ModelRenderer spines5, ModelRenderer spineCollection2, ModelRenderer spines6, ModelRenderer spines7, ModelRenderer spines8, ModelRenderer spineCollection3, ModelRenderer spines9, ModelRenderer spines10, ModelRenderer spines11, ModelRenderer spineCollection4, ModelRenderer spines12, ModelRenderer spines13, ModelRenderer spines14, ModelRenderer outwardSpines, ModelRenderer spines, ModelRenderer spines2, ModelRenderer outwardSpines2, ModelRenderer spines15, ModelRenderer spines16, ModelRenderer upperSpines, ModelRenderer upSpines, ModelRenderer upSpines2, ModelRenderer leg2, ModelRenderer leg3, ModelRenderer leg4) {
        Body = body;
        Leg = leg;
        LowerSpines = lowerSpines;
        SpineCollection = spineCollection;
        Spines3 = spines3;
        Spines4 = spines4;
        Spines5 = spines5;
        SpineCollection2 = spineCollection2;
        Spines6 = spines6;
        Spines7 = spines7;
        Spines8 = spines8;
        SpineCollection3 = spineCollection3;
        Spines9 = spines9;
        Spines10 = spines10;
        Spines11 = spines11;
        SpineCollection4 = spineCollection4;
        Spines12 = spines12;
        Spines13 = spines13;
        Spines14 = spines14;
        OutwardSpines = outwardSpines;
        Spines = spines;
        Spines2 = spines2;
        OutwardSpines2 = outwardSpines2;
        Spines15 = spines15;
        Spines16 = spines16;
        UpperSpines = upperSpines;
        UpSpines = upSpines;
        UpSpines2 = upSpines2;
        Leg2 = leg2;
        Leg3 = leg3;
        Leg4 = leg4;
    }

    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

    }
}
