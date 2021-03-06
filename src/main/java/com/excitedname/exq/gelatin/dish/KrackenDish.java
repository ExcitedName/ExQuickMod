package com.excitedname.exq.gelatin.dish;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.gelatin.cube.HealthCube;
import com.excitedname.exq.gelatin.cube.KrackenCube;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class KrackenDish extends Item {
	
	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;

	public int SecondPotionid;
	public int SecondPotionDuration;
	public int SecondPotionAmplifier;
	public float SecondPotionEffectProbability;


		public KrackenDish() {
			
			this.setUnlocalizedName("Kracken Dish");
			this.setTextureName("Kracken Dish");
			this.setCreativeTab(Tabs.GelatinTab);
			this.setContainerItem(Ingredients.GlassDish);
			this.setFirstPotionEffect(Potion.waterBreathing.id, 20, 2, 1F);
			this.setSecondPotionEffect(Potion.nightVision.id, 20, 2, 1F);
		}
		
		public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
			super.onEaten(par1ItemStack,  par2World,  par3EntityPlayer);
			
			if (!par3EntityPlayer.capabilities.isCreativeMode)
	        {
	            --par1ItemStack.stackSize;
	        }
			
			if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 480, this.FirstPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.SecondPotionid > 0 && par2World.rand.nextFloat() < this.SecondPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.SecondPotionid, this.SecondPotionDuration * 480, this.SecondPotionAmplifier));
			}
			
			return par1ItemStack;
	    }
		
		public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 12;
	    }

	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.eat;
	    }

	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        return par1ItemStack;
			
	    }
				
	    public KrackenDish setFirstPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FirstPotionid = par1;
			this.FirstPotionDuration = par2;
			this.FirstPotionAmplifier = par3;
			this.FirstPotionEffectProbability = par4;
			return this;			
		}
		
		public KrackenDish setSecondPotionEffect(int par1, int par2, int par3, float par4){
			
			this.SecondPotionid = par1;
			this.SecondPotionDuration = par2;
			this.SecondPotionAmplifier = par3;
			this.SecondPotionEffectProbability = par4;
			return this;			
		}

	//Texture Icon	

		@Override
		@SideOnly(Side.CLIENT)
			
		public void registerIcons(IIconRegister iconReg){
			itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
				.substring(this.getUnlocalizedName().indexOf(".")+1));
		}
	}