package net.luckystudio.cozyhome.item.renderer;

import com.mojang.serialization.MapCodec;
import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.block.custom.WallClockBlock;
import net.luckystudio.cozyhome.block.renderer.blockrenders.WallClockBlockEntityRenderer;
import net.luckystudio.cozyhome.block.renderer.models.WallClockModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.LoadedEntityModels;
import net.minecraft.client.render.item.model.special.SimpleSpecialModelRenderer;
import net.minecraft.client.render.item.model.special.SpecialModelRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.Nullable;

public class SpecialWallClockItemRenderer implements SimpleSpecialModelRenderer, SpecialModelRenderer.Unbaked {
    public static final Identifier ID = Identifier.of(CozyHome.MOD_ID, "wall_clock");
    public static final MapCodec<SpecialWallClockItemRenderer> CODEC = WallClockBlock.ClockType.CODEC.fieldOf("wall_clock_type")
            .xmap(SpecialWallClockItemRenderer::new, SpecialWallClockItemRenderer::getClockType);

    private final ModelPart wall_clock;

    public WallClockBlock.ClockType getClockType() {
        return clockType;
    }

    private final WallClockBlock.ClockType clockType;

    public SpecialWallClockItemRenderer(WallClockBlock.ClockType clockType) {
        this.wall_clock = WallClockModel.getTexturedModelData().createModel();
        this.clockType = clockType;
    }

    @Override
    public void render(ModelTransformationMode modelTransformationMode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, boolean glint) {
        matrices.push();

        matrices.translate(0.5, 1.5, 0.5);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));

        RenderLayer clockRenderLayer = WallClockBlockEntityRenderer.getClockRenderLayer(clockType);
        VertexConsumer clockVertexConsumer = vertexConsumers.getBuffer(clockRenderLayer);
        wall_clock.render(matrices, clockVertexConsumer, light, overlay);

        matrices.pop();
    }

    @Override
    public @Nullable SpecialModelRenderer<?> bake(LoadedEntityModels entityModels) {
        return this;
    }

    @Override
    public MapCodec<? extends Unbaked> getCodec() {
        return CODEC;
    }
}
