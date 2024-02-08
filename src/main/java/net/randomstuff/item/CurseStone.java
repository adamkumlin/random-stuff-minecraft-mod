package net.randomstuff.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class CurseStone implements Tier {

    @Override
    public int getUses() {
        return 1;
    }

    @Override
    public float getSpeed() {
        return 5;
    }

    @Override
    public float getAttackDamageBonus() {
        return 10;
    }

    @Override
    public int getLevel() {
        return 4;
    }

    @Override
    public int getEnchantmentValue() {
        return 100;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.IRON_BLOCK);
    }

    @Override
    public @Nullable TagKey<Block> getTag() {
        return Tier.super.getTag();
    }
}