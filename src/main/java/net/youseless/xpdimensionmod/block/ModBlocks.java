package net.youseless.xpdimensionmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.youseless.xpdimensionmod.XpDimensionMod;
import net.youseless.xpdimensionmod.block.custom.JumpPadBlock;
import net.youseless.xpdimensionmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, XpDimensionMod.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK =
            registerBlock("sapphire_block", () -> new JumpPadBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> EXPERIENCE_ORE =
            registerBlock("experience_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.IRON_ORE),
                    UniformInt.of(5, 8)));

    public static final RegistryObject<Block> AIR_BLOCK =
            registerBlock("air_block", () -> new JumpPadBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    private static  <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
