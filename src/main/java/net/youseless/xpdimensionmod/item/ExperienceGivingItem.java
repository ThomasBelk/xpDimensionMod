package net.youseless.xpdimensionmod.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


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
    public ItemStack finishUsingItem(ItemStack stack, net.minecraft.world.level.Level worldIn, LivingEntity entityLiving) {
        if (!worldIn.isClientSide && entityLiving instanceof net.minecraft.world.entity.player.Player player) {
            // Add the desired amount of experience points here
            int experienceToAdd = 5; // For example, adding 5 experience points
            player.giveExperiencePoints(experienceToAdd);
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }



//    @Override
//    public @Nullable FoodProperties getFoodProperties(ItemStack stack, @Nullable LivingEntity entity) {
//        return Items.COOKED_BEEF.getFoodProperties();
//    }
}
