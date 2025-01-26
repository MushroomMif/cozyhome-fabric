package net.luckystudio.cozyhome.block.renderer.models;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;

public class SofaCushionModel extends Model {
	public SofaCushionModel(ModelPart root) {
        super(root, RenderLayer::getEntityCutout);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(40, 0).cuboid(-5.0F, -10.0F, -1.0F, 10.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 2.0F, -0.2618F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
}