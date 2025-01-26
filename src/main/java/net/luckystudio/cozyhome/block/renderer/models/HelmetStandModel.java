package net.luckystudio.cozyhome.block.renderer.models;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;

public class HelmetStandModel extends Model {
	public HelmetStandModel(ModelPart root) {
        super(root, RenderLayer::getEntityCutout);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, 20.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 25).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
}