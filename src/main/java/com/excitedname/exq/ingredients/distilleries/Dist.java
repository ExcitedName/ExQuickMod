package com.excitedname.exq.ingredients.distilleries;

import com.excitedname.exq.creativetabs.Tabs;
import com.excitedname.exq.ref.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class Dist extends Item {

	private static final String[] Meta = new String[] {"Min", "Tra", "Iro", "War", "Hea", "Hot", "NiV",
													   "Tor", "Exp", "Kra", "Dra"};
	@SideOnly(Side.CLIENT)
    private IIcon[] IIcons;

	public Dist() {
		
		this.setUnlocalizedName("Dist");
		this.setHasSubtypes(true);
	}
	
@SideOnly(Side.CLIENT)
public IIcon getIconFromDamage(int par1Icons)
	{
	    int j = MathHelper.clamp_int(par1Icons, 0, 10);
	    return this.IIcons[j];
	}

public String getUnlocalizedName(ItemStack par1Dist)
	{
	    int i = MathHelper.clamp_int(par1Dist.getItemDamage(), 0, 10);
	    return super.getUnlocalizedName() + Meta[i];
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1Icons)
	{
		this.IIcons = new IIcon[Meta.length];
	
	    for (int i = 0; i < IIcons.length; ++i)
	    {
	        this.IIcons[i] = par1Icons.registerIcon(Ref.MOD_ID + ":" + "Dist" + Meta[i]);
	    }
	}
}
