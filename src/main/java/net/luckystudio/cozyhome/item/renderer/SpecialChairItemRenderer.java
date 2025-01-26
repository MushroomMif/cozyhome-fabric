package net.luckystudio.cozyhome.item.renderer;

import com.mojang.serialization.MapCodec;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.block.custom.ChairBlock;
import net.luckystudio.cozyhome.block.renderer.blockrenders.ChairBlockEntityRenderer;
import net.luckystudio.cozyhome.block.renderer.models.ChairModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.LoadedEntityModels;
import net.minecraft.client.render.item.model.special.SimpleSpecialModelRenderer;
import net.minecraft.client.render.item.model.special.SpecialModelRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class SpecialChairItemRenderer implements SimpleSpecialModelRenderer {
    public static final Identifier ID = Identifier.of(CozyHome.MOD_ID, "chair");

    private final ModelPart chair;
    private final BlockState chairBlockState;
    private final ChairBlock.ChairType chairType;

    public SpecialChairItemRenderer(ChairBlock chairBlock) {
        this.chair = ChairModel.getTexturedModelData().createModel();
        this.chairBlockState = chairBlock.getDefaultState();
        this.chairType = chairBlock.getChairType();
    }

    @Override
    public void render(ModelTransformationMode modelTransformationMode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, boolean glint) {
        matrices.push();

        matrices.translate(0.5, 0.95, 0.5);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(60));
        matrices.scale(.55f, .55f, .55f);

        RenderLayer chairRenderLayer = ChairBlockEntityRenderer.getChairRenderLayer(chairType, chairBlockState);
        VertexConsumer chairVertexConsumer = vertexConsumers.getBuffer(chairRenderLayer);
        chair.render(matrices, chairVertexConsumer, light, overlay);

        matrices.pop();
    }

    @Environment(EnvType.CLIENT)
    public record Unbaked(Identifier chairBlockId) implements SpecialModelRenderer.Unbaked {

        public static final MapCodec<Unbaked> CODEC = Identifier.CODEC.fieldOf("chair_block_id")
                .xmap(Unbaked::new, Unbaked::chairBlockId);

        @Override
        public @Nullable SpecialModelRenderer<?> bake(LoadedEntityModels entityModels) {
            Block block = Registries.BLOCK.get(chairBlockId);
            if (block instanceof ChairBlock chairBlock) {
                return new SpecialChairItemRenderer(chairBlock);
            }
            return null;
        }

        @Override
        public MapCodec<? extends SpecialModelRenderer.Unbaked> getCodec() {
            return CODEC;
        }
    }
}
