package net.luckystudio.cozyhome.screen.drawer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.luckystudio.cozyhome.CozyHome;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class DrawerScreen extends HandledScreen<DrawerScreenHandler> {
    private static final Identifier TEXTURE = CozyHome.id("textures/gui/container/drawer.png");

    public DrawerScreen(DrawerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(RenderLayer::getGuiTextured, TEXTURE, x, y, 0f, 0f,
                backgroundWidth, backgroundHeight, 256, 256);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void init() {
        super.init();
        // Move the title 36 pixels down
        titleX = 8; // Left alignment, same as "Inventory"
        titleY = 6 + 36; // Default titleY is 6, so add 36 to move it down
    }
}