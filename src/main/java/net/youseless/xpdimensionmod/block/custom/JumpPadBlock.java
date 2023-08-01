package net.youseless.xpdimensionmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class JumpPadBlock extends Block {

    public JumpPadBlock(Properties properties) {
        super(properties);
    }

//    @Override
//    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState, @Nullable BlockEntity pBlockEntity, ItemStack pTool) {
//        pPlayer.setNoGravity(true);
//    }

//    @Override
//    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
//        //if (entityIn instanceof ServerPlayer player) {
//            // Add upwards motion to the player
//            pEntity.setDeltaMovement(pEntity.getDeltaMovement().multiply(1f, 5f, 1f));
//            // Play a sound or particle effect if desired
//            // player.playSound(...);
//        //}
//    }


//    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
//        double d0 = Math.abs(pEntity.getDeltaMovement().y);
//        //if (d0 < 0.1D && !pEntity.isSteppingCarefully()) {
//            //double d1 = 0.4D + d0 * 0.2D;
//            pEntity.setDeltaMovement(pEntity.getDeltaMovement().x, 5D, pEntity.getDeltaMovement().z);
//        //}
//
//        super.stepOn(pLevel, pPos, pState, pEntity);
//    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Shapes.empty();
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.setDeltaMovement(pEntity.getDeltaMovement().x,
                5D, pEntity.getDeltaMovement().z);
    }

    @Override
    public float getShadeBrightness(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return 1.0f;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return true;
    }
}

