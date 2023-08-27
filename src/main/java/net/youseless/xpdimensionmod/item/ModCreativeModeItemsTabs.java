package net.youseless.xpdimensionmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.youseless.xpdimensionmod.XpDimensionMod;
import net.youseless.xpdimensionmod.block.ModBlocks;

public class ModCreativeModeItemsTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, XpDimensionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> XP_DIMENSION_TAB =
            CREATIVE_MODE_TABS.register("xp_dimension_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                            .title(Component.translatable("creativetab.xp_dimension_tab"))
                            .displayItems(((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                                pOutput.accept(ModItems.SAPPHIRE.get());
                                pOutput.accept(ModItems.RAW_EXPERIENCE.get());

                                pOutput.accept(ModBlocks.AIR_CURRENT_BLOCK.get());
                                pOutput.accept(ModBlocks.EXPERIENCE_ORE.get());
                                pOutput.accept(ModBlocks.XP_MUD.get());

                            }))
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
