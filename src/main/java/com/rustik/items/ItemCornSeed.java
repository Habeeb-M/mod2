package com.rustik.items;

import com.rustik.ItemModelProvider;
import com.rustik.blocks.ModBlocks;
import com.rustik.rustikssecondmod;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {

    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("corn_seed");
        setRegistryName("corn_seed");
    }
    public void registerItemModel() {
        rustikssecondmod.proxy.registerItemRenderer(this, 0, "corn_seed");
    }

}