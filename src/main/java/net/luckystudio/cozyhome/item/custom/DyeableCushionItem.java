package net.luckystudio.cozyhome.item.custom;

import net.luckystudio.cozyhome.util.ModColorHandler;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class DyeableCushionItem extends CushionItem {
    public DyeableCushionItem(Settings settings) {
        super(settings);
    }

    @Override
    public Text getName(ItemStack stack) {
        int color = DyedColorComponent.getColor(stack, -393218); // Using 'this' as the BlockEntity
        Text colorName = ModColorHandler.getColorName(color);
        return colorName.copy().append(Text.literal(" ")).append(super.getName(stack));
    }
}
