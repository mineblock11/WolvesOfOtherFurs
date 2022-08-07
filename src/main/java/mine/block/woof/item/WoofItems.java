package mine.block.woof.item;

import mine.block.woof.block.WoofBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WoofItems {
    public static final BlockItem DOG_BOWL_BLOCK;

    static {
        DOG_BOWL_BLOCK = Registry.register(Registry.ITEM, new Identifier("woof:dog_bowl_block"), new BlockItem(WoofBlocks.DOG_BOWL_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

    public static void init() {
    }
}
