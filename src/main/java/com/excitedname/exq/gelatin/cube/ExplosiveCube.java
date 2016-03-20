package com.excitedname.exq.gelatin.cube;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.entities.EntityExplosiveCube;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ExplosiveCube extends Item {

	
		public ExplosiveCube() {
			
			this.setUnlocalizedName("Explosive Cube");
			this.setTextureName("Explosive Cube");
			this.setCreativeTab(Tabs.GelatinTab);
		}
		
		public ItemStack onItemRightClick(ItemStack par1ExplosiveCube, World par2World, EntityPlayer par3Player)
	    {
	        if (!par3Player.capabilities.isCreativeMode)
	        {
	            --par1ExplosiveCube.stackSize;
	        }

	        par2World.playSoundAtEntity(par3Player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!par2World.isRemote)
	        {
	        	par2World.spawnEntityInWorld(new EntityExplosiveCube(par2World, par3Player));
	        }

	        return par1ExplosiveCube;
	    }
		
		
		
	
	//Texture Icon	

		@Override
		@SideOnly(Side.CLIENT)
			
		public void registerIcons(IIconRegister iconReg){
			itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
				.substring(this.getUnlocalizedName().indexOf(".")+1));
		}
	}
