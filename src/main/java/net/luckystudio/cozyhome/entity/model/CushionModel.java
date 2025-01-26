package net.luckystudio.cozyhome.entity.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;

public class CushionModel extends EntityModel<EntityRenderState> {
	public CushionModel(ModelPart root) {
        super(root);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -11.0F, -5.0F, 10.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(-12, 11).cuboid(-6.0F, -10.01F, -6.0F, 12.0F, 0.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData front_r1 = bb_main.addChild("front_r1", ModelPartBuilder.create().uv(0, 23).cuboid(-6.0F, 0.0F, 0.0F, 12.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, -6.0F, -0.0436F, 0.0F, 0.0F));

		ModelPartData east_r1 = bb_main.addChild("east_r1", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, 0.0F, -6.0F, 0.0F, 10.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		ModelPartData west_r1 = bb_main.addChild("west_r1", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, 0.0F, -6.0F, 0.0F, 10.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		ModelPartData south_r1 = bb_main.addChild("south_r1", ModelPartBuilder.create().uv(0, 43).cuboid(-6.0F, 0.0F, 0.0F, 12.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 6.0F, 0.0436F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
}