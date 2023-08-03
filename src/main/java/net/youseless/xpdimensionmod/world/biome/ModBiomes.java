package net.youseless.xpdimensionmod.world.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.youseless.xpdimensionmod.XpDimensionMod;

public class ModBiomes {
    public static final ResourceKey<Biome> TEST_BIOME = register("newbiome");

    public static void bootstrap(BootstapContext<Biome> context) {
        context.register(TEST_BIOME, new Biome.BiomeBuilder().build());
    }

    public static final ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(XpDimensionMod.MOD_ID, name));
    }
}
