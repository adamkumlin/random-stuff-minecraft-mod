package net.randomstuff.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CAN_MINE_BEDROCK = BlockTags.create(new ResourceLocation("randomstuff", "can_mine_bedrock"));
    }
}