package net.youseless.xpdimensionmod.world.dimension;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.youseless.xpdimensionmod.XpDimensionMod;

public class ModDimensions {
    public static final ResourceKey<Level> KJDIMS_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(XpDimensionMod.MOD_ID, "kjdim"));
    public static final ResourceKey<DimensionType> KJDIMS_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, KJDIMS_KEY.location());


    public static void register() {
        System.out.println("Registering ModDimensions for " + XpDimensionMod.MOD_ID);
    }
}
