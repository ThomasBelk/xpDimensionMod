package net.youseless.xpdimensionmod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.youseless.xpdimensionmod.XpDimensionMod;
import net.youseless.xpdimensionmod.worldgen.biome.custom.ModOverworldRegion;
import terrablender.api.Regions;

public class ModTerraBlenderAPI {
    public static void registerRegions() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(XpDimensionMod.MOD_ID, "overworld"), 5));
    }
}
