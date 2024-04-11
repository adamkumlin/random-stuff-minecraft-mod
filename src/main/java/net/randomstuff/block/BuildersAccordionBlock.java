package net.randomstuff.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BuildersAccordionBlock extends Block {
    public BuildersAccordionBlock(Properties properties) {
        super(properties.sound(SoundType.METAL));
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, InteractionHand hand, BlockHitResult result) {

        level.explode(null, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, 2f, false, Level.ExplosionInteraction.MOB);
        return InteractionResult.PASS;
    }


}
