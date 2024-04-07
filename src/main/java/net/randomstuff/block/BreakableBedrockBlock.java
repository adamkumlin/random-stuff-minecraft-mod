package net.randomstuff.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world

public class BreakableBedrockBlock extends Block {
    public BreakableBedrockBlock (BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public float getBlockHardness(BlockState blockState, BlockPos pos) {

    }
}
