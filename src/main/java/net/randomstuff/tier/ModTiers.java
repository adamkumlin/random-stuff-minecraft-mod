package net.randomstuff.tier;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.randomstuff.util.ModTags;

import java.util.List;


public class ModTiers {
    public static final Tier CURSE_STONE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1, 3000F, 3F, 5, ModTags.Blocks.NEEDS_CURSESTONE_TOOL, () -> Ingredient.of(Items.IRON_BLOCK)),
            new ResourceLocation("assets", "curse_stone"), List.of(Tiers.NETHERITE), List.of());
}

