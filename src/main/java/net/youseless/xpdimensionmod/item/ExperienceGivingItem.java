package net.youseless.xpdimensionmod.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;


public class ExperienceGivingItem extends Item {
    public ExperienceGivingItem(Properties pProperties) {
        super(pProperties.food(new FoodProperties.Builder()
                .alwaysEat()
                .nutrition(0)
                .saturationMod(0)
                .build()));
    }

    // gives experience when eating
    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, net.minecraft.world.level.Level worldIn, LivingEntity entityLiving) {
        if (!worldIn.isClientSide && entityLiving instanceof net.minecraft.world.entity.player.Player player) {
            int experienceToAdd = 5; // Number of experience points added
            player.giveExperiencePoints(experienceToAdd);
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
}