package net.youseless.xpdimensionmod.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;

public class ExperienceGivingItem extends Item {
    public ExperienceGivingItem(Properties pProperties) {
        super(pProperties.food(Items.COOKED_BEEF.getFoodProperties()));
    }

//    @Override
//    public @Nullable FoodProperties getFoodProperties(ItemStack stack, @Nullable LivingEntity entity) {
//        return Items.COOKED_BEEF.getFoodProperties();
//    }
}
