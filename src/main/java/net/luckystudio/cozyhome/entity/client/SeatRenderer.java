package net.luckystudio.cozyhome.entity.client;

import net.luckystudio.cozyhome.entity.custom.SeatEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;

public class SeatRenderer extends EntityRenderer<SeatEntity, EntityRenderState> {
    public SeatRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }
}
