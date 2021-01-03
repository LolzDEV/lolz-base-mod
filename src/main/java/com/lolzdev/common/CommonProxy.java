package com.lolzdev.common;

import com.lolzdev.block.Blocks;
import com.lolzdev.blockentity.BlockEntities;
import com.lolzdev.item.Items;
import net.fabricmc.api.ModInitializer;

public class CommonProxy implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockEntities.initializeBlockEntities();
        Blocks.initializeBlocks();
        Items.initializeItems();
    }
}
