package block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.sounds.SoundSource;

public class PinkstoneDustBlock extends RedStoneWireBlock {

    public PinkstoneDustBlock(final Properties properties) {
        super(Properties.copy(Blocks.REDSTONE_WIRE));
    }

    private void playSound(SoundEvent sound, float volume, float pitch) {
        playSound(sound, 0.3f, 0.6f);
    }
}
