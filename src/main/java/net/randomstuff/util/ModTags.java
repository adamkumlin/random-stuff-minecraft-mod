package net.randomstuff.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_CURSESTONE_TOOL = BlockTags.create(new ResourceLocation("assets", "needs_cursestone_tool"));
    }
}