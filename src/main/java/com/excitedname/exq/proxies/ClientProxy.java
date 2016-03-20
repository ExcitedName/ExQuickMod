package com.excitedname.exq.proxies;

import com.excitedname.exq.entities.EntityExplosiveCube;
import com.excitedname.exq.entities.EntityGelatinPearl;
import com.excitedname.exq.entities.EntityGelatinPearlEnhanced;
//import com.excitedname.exq.entities.EntityThrowableGelatinLampDim;
//import com.excitedname.exq.entities.EntityThrowableGelatinLampLuminant;
//import com.excitedname.exq.entities.EntityThrowableGelatinLampRadiant;
import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.Ingredients;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy {
	
	
	
	@Override
	public void registerGelatinRenders() {
		
				
		RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveCube.class, 
				new RenderSnowball(Gelatin.ExplosiveCube));

		RenderingRegistry.registerEntityRenderingHandler(EntityGelatinPearl.class, 
				new RenderSnowball(Gelatin.GelatinPearl));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGelatinPearlEnhanced.class, 
				new RenderSnowball(Gelatin.GelatinPearlEnhanced));
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityThrowableGelatinLampDim.class,
         //       new RenderSnowball(exqGChamber.ThrowableGelatinLampDim));

       // RenderingRegistry.registerEntityRenderingHandler(EntityThrowableGelatinLampLuminant.class, 
        	//	new RenderSnowball(exqGChamber.ThrowableGelatinLampLuminant));

       // RenderingRegistry.registerEntityRenderingHandler(EntityThrowableGelatinLampRadiant.class,
               // new RenderSnowball(exqGChamber.ThrowableGelatinLampRadiant));
	}
}
