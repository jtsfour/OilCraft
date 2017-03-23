package com.jtsfour.oilcraft.block;

import com.jtsfour.oilcraft.tileentity.SeismicWaveGenEntity;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SeismicWaveGenBlock extends OilCraftBlock implements ITileEntityProvider {

	public SeismicWaveGenBlock() {
		super(Material.ROCK, "seismicwavegenerator");
		this.setCreativeTab(OilCraftBlockHandler.OilCraftTab);
		this.isBlockContainer = true;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new SeismicWaveGenEntity();
	}
	
	@Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }
	
	@Override
	@Deprecated
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param){
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }
}
