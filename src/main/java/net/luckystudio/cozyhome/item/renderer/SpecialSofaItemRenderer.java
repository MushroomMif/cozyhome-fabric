package net.luckystudio.cozyhome.item.renderer;

import com.mojang.serialization.MapCodec;
import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.block.custom.SofaBlock;
import net.luckystudio.cozyhome.block.renderer.blockrenders.SofaBlockEntityRenderer;
import net.luckystudio.cozyhome.block.renderer.models.SofaModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.LoadedEntityModels;
import net.minecraft.client.render.item.model.special.SpecialModelRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.Nullable;

public class SpecialSofaItemRenderer implements SpecialModelRenderer<DyedColorComponent>, SpecialModelRenderer.Unbaked {
    public static final Identifier ID = Identifier.of(CozyHome.MOD_ID, "sofa");
    public static final MapCodec<SpecialSofaItemRenderer> CODEC = SofaBlock.SofaType.CODEC.fieldOf("sofa_type")
            .xmap(SpecialSofaItemRenderer::new, SpecialSofaItemRenderer::getSofaType);

    private final ModelPart sofa;

    public SofaBlock.SofaType getSofaType() {
        return sofaType;
    }

    private final SofaBlock.SofaType sofaType;

    public SpecialSofaItemRenderer(SofaBlock.SofaType sofaType) {
        this.sofa = SofaModel.getTexturedModelData().createModel();
        this.sofaType = sofaType;
    }


    @Override
    public void render(
            @Nullable DyedColorComponent data,
            ModelTransformationMode modelTransformationMode,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light, int overlay, boolean glint
    ) {
        matrices.push();
        int color = data != null ? data.rgb() : -17170434;
        matrices.translate(0.5, 0.75, 0.5);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(60));
        matrices.scale(.45f, .45f, .45f);

        RenderLayer chairRenderLayer = SofaBlockEntityRenderer.getSofaRenderLayer(sofaType);
        VertexConsumer chairVertexConsumer = vertexConsumers.getBuffer(chairRenderLayer);
        sofa.render(matrices, chairVertexConsumer, light, overlay, color);

        matrices.pop();
    }

    @Override
    public @Nullable DyedColorComponent getData(ItemStack stack) {
        return stack.get(DataComponentTypes.DYED_COLOR);
    }

    @Override
    public @Nullable SpecialModelRenderer<?> bake(LoadedEntityModels entityModels) {
        return this;
    }

    @Override
    public MapCodec<? extends SpecialModelRenderer.Unbaked> getCodec() {
        return CODEC;
    }
}
