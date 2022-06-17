package net.kale.bareoutdoors.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab BARE_OUTDOORS_TAB = new CreativeModeTab("bare_outdoors_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NEWT_BUCKET.get());
        }
    };
}
