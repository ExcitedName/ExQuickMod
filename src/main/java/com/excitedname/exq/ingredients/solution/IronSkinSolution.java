package com.excitedname.exq.ingredients.solution;

import java.util.List;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.gelatin.cube.IronSkinCube;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class IronSkinSolution extends Item {
	
	public int FirstPotionid;
	public int FirstPotionDuration;
	public int FirstPotionAmplifier;
	public float FirstPotionEffectProbability;
	
	 
	public IronSkinSolution() {
				
		this.setUnlocalizedName("Iron Skin Solution");
		this.setTextureName("Iron Skin Solution");
		this.setCreativeTab(Tabs.GelatinTab);
		this.setFirstPotionEffect(Potion.resistance.id, 20, 0, 1F);		
	}
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		super.onEaten(par1ItemStack,  par2World,  par3EntityPlayer);
		
		if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }
		
		if (!par2World.isRemote && this.FirstPotionid > 0 && par2World.rand.nextFloat() < this.FirstPotionEffectProbability){
			par3EntityPlayer.addPotionEffect(new PotionEffect(this.FirstPotionid, this.FirstPotionDuration * 180, this.FirstPotionAmplifier));
		}
		
		return par1ItemStack;
    }
	
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 12;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
		
	}
	
	public IronSkinSolution setFirstPotionEffect(int par1, int par2, int par3, float par4){
		
		this.FirstPotionid = par1;
		this.FirstPotionDuration = par2;
		this.FirstPotionAmplifier = par3;
		this.FirstPotionEffectProbability = par4;
		return this;			
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ref.MOD_ID + ":" + this.getUnlocalizedName()
			.substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
