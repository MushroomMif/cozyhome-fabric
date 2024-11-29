package net.luckystudio.cozyhome.block.renderer.models;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

public class HelmetStandModel extends Model {
	private final ModelPart head;
	private final ModelPart bb_main;
	public HelmetStandModel(ModelPart root) {
        super(RenderLayer::getEntityCutout);
        this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, 20.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 25).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		head.render(matrices, vertices, light, overlay);
		bb_main.render(matrices, vertices, light, overlay);
	}
}