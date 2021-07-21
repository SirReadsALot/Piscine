package com.sirreads.piscine.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LockdownBlock extends Block {

    public LockdownBlock() {
        super(Block.Properties.of(Material.WOOD)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.ANVIL)
                .harvestLevel(2)
                .strength(5.0f, 6.0f)
        );
    }
}

