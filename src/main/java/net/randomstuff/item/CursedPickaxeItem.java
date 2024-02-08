package net.randomstuff.item;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class CursedPickaxeItem extends PickaxeItem {

    public CursedPickaxeItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
}
