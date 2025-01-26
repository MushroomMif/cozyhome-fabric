package net.luckystudio.cozyhome.entity.model;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;

public class TelescopeModel extends EntityModel<EntityRenderState> {
	public TelescopeModel(ModelPart root) {
		super(root);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(-1.5F, -5.5F, -10.2F, 3.0F, 3.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.5F, -6.5F, -0.3F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F))
		.uv(21, -10).cuboid(0.0F, -2.5F, -4.8F, 0.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.5F, -0.2F));

		ModelPartData holder = modelPartData.addChild("holder", ModelPartBuilder.create().uv(0, 29).cuboid(-3.0F, -2.5F, -1.5F, 6.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(16, 19).cuboid(-1.5F, 0.5F, -1.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 19.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
}