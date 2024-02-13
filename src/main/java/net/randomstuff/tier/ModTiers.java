package net.randomstuff.tier;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

import static net.randomstuff.util.ModTags.Blocks.CAN_MINE_BEDROCK;

public class ModTiers {
    public static final Tier CURSE_STONE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1, 1500, 0, 0, CAN_MINE_BEDROCK, () -> Ingredient.of(Items.IRON_BLOCK)),
            new ResourceLocation("randomstuff", "sapphire"), List.of(Tiers.NETHERITE), List.of());
}