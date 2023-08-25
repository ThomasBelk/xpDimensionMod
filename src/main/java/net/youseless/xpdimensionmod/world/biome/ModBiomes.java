//package net.youseless.xpdimensionmod.world.biome;
//
//import net.minecraft.core.HolderGetter;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.worldgen.BiomeDefaultFeatures;
//import net.minecraft.data.worldgen.BootstapContext;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.sounds.Musics;
//import net.minecraft.world.level.biome.Biome;
//import net.minecraft.sounds.Music;
//import net.minecraft.world.level.biome.BiomeGenerationSettings;
//import net.minecraft.world.level.biome.Biomes;
//import net.minecraft.world.level.biome.MobSpawnSettings;
//import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
//import net.minecraft.world.level.levelgen.placement.PlacedFeature;
//import net.youseless.xpdimensionmod.XpDimensionMod;
//
//import static net.minecraft.data.worldgen.biome.OverworldBiomes.biome;
//import static net.minecraft.world.level.levelgen.placement.BiomeFilter.biome;
//
//public class ModBiomes {
//    public static final ResourceKey<Biome> TEST_BIOME = register("newbiome");
//
//    public static void bootstrap(BootstapContext<Biome> context) {
//        context.register(TEST_BIOME, new Biome.BiomeBuilder().build());
//    }
//
//    public static final ResourceKey<Biome> register(String name) {
//        return ResourceKey.create(Registries.BIOME, new ResourceLocation(XpDimensionMod.MOD_ID, name));
//    }
//
//    public static Biome custom(HolderGetter<PlacedFeature> placedFeatureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
//        BiomeGenerationSettings.Builder biomeBuilder =
//                new BiomeGenerationSettings.Builder(placedFeatureGetter, carverGetter);
//        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
//        BiomeDefaultFeatures.caveSpawns(spawnBuilder);
//        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
//
//        return null;
//    }
//}
