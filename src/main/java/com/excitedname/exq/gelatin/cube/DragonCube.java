package com.excitedname.exq.gelatin.cube;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.gelatin.dish.DragonDish;
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

public class DragonCube extends Item {

	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;

	public int SecondPotionid;
	public int SecondPotionDuration;
	public int SecondPotionAmplifier;
	public float SecondPotionEffectProbability;
	
	public int ThirdPotionid;
	public int ThirdPotionDuration;
	public int ThirdPotionAmplifier;
	public float ThirdPotionEffectProbability;
	
	public int FourthPotionid;
	public int FourthPotionDuration;
	public int FourthPotionAmplifier;
	public float FourthPotionEffectProbability;
	

		public DragonCube() {
			
			this.setUnlocalizedName("Dragon Cube");
			this.setTextureName("Dragon Cube");
			this.setCreativeTab(Tabs.GelatinTab);
			this.setFirstPotionEffect(Potion.regeneration.id, 20, 1, 1F);
			this.setSecondPotionEffect(Potion.fireResistance.id, 20, 1, 1F);
			this.setThirdPotionEffect(Potion.resistance.id, 20, 1, 1F);
			this.setFourthPotionEffect(Potion.damageBoost.id, 20, 1, 1F);
			
		}
		
		//public boolean hasEffect(ItemStack par1GelatinCrystal, int pass){
		//	return true;
		//}
		
		public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
			super.onEaten(par1ItemStack,  par2World,  par3EntityPlayer);
			
			if (!par3EntityPlayer.capabilities.isCreativeMode)
	        {
	            --par1ItemStack.stackSize;
	        }
			
			if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 300, this.FirstPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.SecondPotionid > 0 && par2World.rand.nextFloat() < this.SecondPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.SecondPotionid, this.SecondPotionDuration * 300, this.SecondPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.ThirdPotionid > 0 && par2World.rand.nextFloat() < this.ThirdPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.ThirdPotionid, this.ThirdPotionDuration * 300, this.ThirdPotionAmplifier));
			}
			
			if (!par2World.isRemote && this.FourthPotionid > 0 && par2World.rand.nextFloat() < this.FourthPotionEffectProbability){
				par3EntityPlayer.addPotionEffect(new PotionEffect(this.FourthPotionid, this.FourthPotionDuration * 300, this.FourthPotionAmplifier));
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
	    
	    public DragonCube setFirstPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FirstPotionid = par1;
			this.FirstPotionDuration = par2;
			this.FirstPotionAmplifier = par3;
			this.FirstPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonCube setSecondPotionEffect(int par1, int par2, int par3, float par4){
			
			this.SecondPotionid = par1;
			this.SecondPotionDuration = par2;
			this.SecondPotionAmplifier = par3;
			this.SecondPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonCube setThirdPotionEffect(int par1, int par2, int par3, float par4){
			
			this.ThirdPotionid = par1;
			this.ThirdPotionDuration = par2;
			this.ThirdPotionAmplifier = par3;
			this.ThirdPotionEffectProbability = par4;
			return this;			
		}
		
		public DragonCube setFourthPotionEffect(int par1, int par2, int par3, float par4){
			
			this.FourthPotionid = par1;
			this.FourthPotionDuration = par2;
			this.FourthPotionAmplifier = par3;
			this.FourthPotionEffectProbability = par4;
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
