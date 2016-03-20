package com.excitedname.exq.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityExplosiveCube extends EntityThrowable {
	
	public int fuse;
		
	public EntityExplosiveCube(World par1World)
    {
        super(par1World);
    }

    public EntityExplosiveCube(World par1World, EntityLivingBase par2LivingBase)
    {
        super(par1World, par2LivingBase);
    }

    @SideOnly(Side.CLIENT)
    public EntityExplosiveCube(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    
    protected void onImpact(MovingObjectPosition par1Position) {
    	    	
    	for (int i = 0; i < 500; ++i)
        {
            this.worldObj.spawnParticle("portal", this.posX, this.posY + this.rand.nextDouble() * 0.5D, this.posZ, this.rand.nextGaussian(), 5.0D, this.rand.nextGaussian());
        }  
        this.worldObj.spawnParticle("smoke", this.posX, this.posY + 1D, this.posZ, 0.0D, 0.0D, 0.0D);
        if (!this.worldObj.isRemote)
        {
            this.explode();
            //Void out "this.setDead();" to prevent entity from stopping
            this.setDead();
        }
    }

    
    private void explode()
    {
        float f = 4.0F;
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
        
    }
    
    public void inWaterEffects()
	{
		for (int i = 0; i < 4; ++i)
		{
			float f4 = 0.25F;
			this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
		}
	}
    
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }
    
    @SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 2.0F;
    }
}
    	
    	
    	      
     

