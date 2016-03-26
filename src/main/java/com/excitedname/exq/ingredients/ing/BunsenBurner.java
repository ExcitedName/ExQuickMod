package com.excitedname.exq.ingredients.ing;

import java.util.List;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class BunsenBurner extends Item {

	private static final String[] Meta = new String[] {"T1", "T2"};
	@SideOnly(Side.CLIENT)
	private IIcon[] IIcons;

	public BunsenBurner() {
	
	this.setUnlocalizedName("Bunsen Burner");
	this.setHasSubtypes(true);
	this.setCreativeTab(Tabs.IngTab);
	this.setMaxStackSize(1);
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		return false;
	}
	
	public boolean hasContainerItem(){
		return true;
	} 
	
	public ItemStack getContainerItem(ItemStack itemStack){
		itemStack.attemptDamageItem(0, itemRand);	
		
       return itemStack;
   	}

@SideOnly(Side.CLIENT)
public IIcon getIconFromDamage(int par1Icons)
	{
	int j = MathHelper.clamp_int(par1Icons, 0, 1);
	return this.IIcons[j];
	}

public String getUnlocalizedName(ItemStack par1Dist)
	{
	int i = MathHelper.clamp_int(par1Dist.getItemDamage(), 0, 1);
	return super.getUnlocalizedName() + Meta[i];
	}

@SideOnly(Side.CLIENT)
public void getSubItems(Item par1Vat, CreativeTabs par2Tabs, List par3List)
	{
	    for (int i = 0; i < 2; ++i)
	    {
	    	par3List.add(new ItemStack(par1Vat, 1, i));
	    }
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1Icons)
	{
	this.IIcons = new IIcon[Meta.length];
	
	for (int i = 0; i < IIcons.length; ++i)
	{
	this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "Bunsen Burner" + Meta[i]);
	}
}
}
