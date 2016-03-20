package com.excitedname.exq.gelatin;

import com.excitedname.exq.entities.EntityExplosiveCube;
import com.excitedname.exq.entities.EntityGelatinPearl;
import com.excitedname.exq.entities.EntityGelatinPearlEnhanced;
import com.excitedname.exq.gelatin.Juice.GelatinJuice;
import com.excitedname.exq.gelatin.Juice.GelatinJuiceHealing;
import com.excitedname.exq.gelatin.Juice.GelatinPearl;
import com.excitedname.exq.gelatin.Juice.GelatinPearlEnhanced;
import com.excitedname.exq.gelatin.cube.DragonCube;
import com.excitedname.exq.gelatin.cube.ExplosiveCube;
import com.excitedname.exq.gelatin.cube.GelatinCube;
import com.excitedname.exq.gelatin.cube.HealthCube;
import com.excitedname.exq.gelatin.cube.HotSauceCube;
import com.excitedname.exq.gelatin.cube.IronSkinCube;
import com.excitedname.exq.gelatin.cube.KrackenCube;
import com.excitedname.exq.gelatin.cube.MinerCube;
import com.excitedname.exq.gelatin.cube.NightVisionCube;
import com.excitedname.exq.gelatin.cube.TorchCube;
import com.excitedname.exq.gelatin.cube.TravellerCube;
import com.excitedname.exq.gelatin.cube.WarriorCube;
import com.excitedname.exq.gelatin.dish.DragonDish;
import com.excitedname.exq.gelatin.dish.ExplosiveDish;
import com.excitedname.exq.gelatin.dish.HealthDish;
import com.excitedname.exq.gelatin.dish.HotSauceDish;
import com.excitedname.exq.gelatin.dish.IronSkinDish;
import com.excitedname.exq.gelatin.dish.KrackenDish;
import com.excitedname.exq.gelatin.dish.MinerDish;
import com.excitedname.exq.gelatin.dish.NightVisionDish;
import com.excitedname.exq.gelatin.dish.TorchDish;
import com.excitedname.exq.gelatin.dish.TravellerDish;
import com.excitedname.exq.gelatin.dish.WarriorDish;
import com.excitedname.exq.gelatin.lamp.GelatinLamp;
import com.excitedname.exq.gelatin.lamp.GelatinLampLuminant;
import com.excitedname.exq.gelatin.lamp.GelatinLampSpectral;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.storage.Storage;
import com.excitedname.exq.utilities.Utilities;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Gelatin {		
	
	
public static void Cube() {
	
		GelatinCube = new GelatinCube(2, 1.2F, true);
		GameRegistry.registerItem(GelatinCube, "Gelatin Cube");
		
		MinerCube = new MinerCube();
		GameRegistry.registerItem(MinerCube, "Miner Cube");
		
		TravellerCube = new TravellerCube();
		GameRegistry.registerItem(TravellerCube, "Traveller Cube");
		
		IronSkinCube = new IronSkinCube();
		GameRegistry.registerItem(IronSkinCube, "Iron Skin Cube");
		
		WarriorCube = new WarriorCube();
		GameRegistry.registerItem(WarriorCube, "Warrior Cube");
		
		HealthCube = new HealthCube();
		GameRegistry.registerItem(HealthCube, "Health Cube");
		
		HotSauceCube = new HotSauceCube();
		GameRegistry.registerItem(HotSauceCube, "HotSauceCube");
		
		NightVisionCube = new NightVisionCube();
		GameRegistry.registerItem(NightVisionCube, "Night Vision Cube");
		
		TorchCube = new TorchCube();
		GameRegistry.registerItem(TorchCube, "Torch Cube");
		
		ExplosiveCube = new ExplosiveCube();
		GameRegistry.registerItem(ExplosiveCube, "Explosive Cube");
		EntityRegistry.registerModEntity(EntityExplosiveCube.class, "EntityExplosiveCube", 1, Ref.MOD_ID, 80, 3, true);
		
		KrackenCube = new KrackenCube();
		GameRegistry.registerItem(KrackenCube, "Kracken Cube");
		
		DragonCube = new DragonCube();
		GameRegistry.registerItem(DragonCube, "Dragon Cube");	
	}
	
	public static Item GelatinCube;
	public static Item MinerCube;
	public static Item TravellerCube;
	public static Item IronSkinCube;
	public static Item WarriorCube;
	public static Item HealthCube;
	public static Item HotSauceCube;
	public static Item NightVisionCube;
	public static Item TorchCube;
	public static Item ExplosiveCube;
	public static Item KrackenCube;
	public static Item DragonCube;
		

public static void Dish() {
		
		MinerDish = new MinerDish();
		GameRegistry.registerItem(MinerDish, "Miner Dish");
		
		TravellerDish = new TravellerDish();
		GameRegistry.registerItem(TravellerDish, "Traveller Dish");
		
		IronSkinDish = new IronSkinDish();
		GameRegistry.registerItem(IronSkinDish, "Iron Skin Dish");
		
		WarriorDish = new WarriorDish();
		GameRegistry.registerItem(WarriorDish, "Warrior Dish");
		
		HealthDish = new HealthDish();
		GameRegistry.registerItem(HealthDish, "Health Dish");
		
		HotSauceDish = new HotSauceDish();
		GameRegistry.registerItem(HotSauceDish, "Hot Sauce Dish");
		
		NightVisionDish = new NightVisionDish();
		GameRegistry.registerItem(NightVisionDish, "Night Vision Dish");
		
		TorchDish = new TorchDish();
		GameRegistry.registerItem(TorchDish, "Torch Dish");
		
		ExplosiveDish = new ExplosiveDish();
		GameRegistry.registerItem(ExplosiveDish, "Explosive Dish");
		
		KrackenDish = new KrackenDish();
		GameRegistry.registerItem(KrackenDish, "Kracken Dish");
		
		DragonDish = new DragonDish();
		GameRegistry.registerItem(DragonDish, "Dragon Dish");	
	}
	
	public static Item MinerDish;
	public static Item TravellerDish;
	public static Item IronSkinDish;
	public static Item WarriorDish;
	public static Item HealthDish;
	public static Item HotSauceDish;
	public static Item NightVisionDish;
	public static Item TorchDish;
	public static Item ExplosiveDish;
	public static Item KrackenDish;
	public static Item DragonDish;
		
	
public static void Juice() {
		
		GelatinJuice = new GelatinJuice();
		GameRegistry.registerItem(GelatinJuice, "Gelatin Juice");
		
		GelatinJuiceHealing = new GelatinJuiceHealing();
		GameRegistry.registerItem(GelatinJuiceHealing, "Gelatin Juice Healing");
		
		GelatinPearl = new GelatinPearl();
		GameRegistry.registerItem(GelatinPearl, "Gelatin Pearl");
		EntityRegistry.registerModEntity(EntityGelatinPearl.class, "EntityGelatinPearl", 0, Ref.MOD_ID, 80, 3, true);
		
		GelatinPearlEnhanced = new GelatinPearlEnhanced();
		GameRegistry.registerItem(GelatinPearlEnhanced, "Gelatin Pearl Enhanced");
		EntityRegistry.registerModEntity(EntityGelatinPearlEnhanced.class, "EntityGelatinPearl", 0, Ref.MOD_ID, 80, 3, true);
	
	}
	
	public static Item GelatinJuice;
	public static Item GelatinJuiceHealing;
	public static Item GelatinPearl;
	public static Item GelatinPearlEnhanced;
		
	
public static void Lamp() {		
		
		GelatinLamp = new GelatinLamp(Material.iron);
		GameRegistry.registerBlock(GelatinLamp, "Gelatin Lamp");

		GelatinLampLuminant = new GelatinLampLuminant(Material.iron);
		GameRegistry.registerBlock(GelatinLampLuminant, "Gelatin Lamp(Luminant)");
		
		GelatinLampSpectral = new GelatinLampSpectral(Material.iron);
		GameRegistry.registerBlock(GelatinLampSpectral, "Gelatin Lamp(Spectral)");
		
		//ThrowableGelatinLampLuminant = new ThrowableGelatinLampLuminant();
		//GameRegistry.registerItem(ThrowableGelatinLampLuminant, "ThrowableGelatinLamp.ID");
		//EntityRegistry.registerModEntity(EntityThrowableGelatinLampLuminant.class, "Throwable Gelatin Lamp Luminant", 2, exqReference.MOD_ID, 80, 10, true);
	}

	public static Block GelatinLamp;
	public static Block GelatinLampLuminant;
	public static Block GelatinLampSpectral;
	//public static Item ThrowableGelatinLampLuminant;




//Recipes

public static void GelatinRecipes() {
	
//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.GelatinCube, 8), new Object []{
		"SM",
		"CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar,
			'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.GelatinCube, 16), new Object []{
		"GM",
		"CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar,
			'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.GelatinCube, 24), new Object []{
		"GM",
		"CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar,
			'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.GelatinJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.GelatinJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinCube), new Object []{
		"P",
		"D",
		
			'D', Ingredients.GroundGelatin, 'P', Utilities.PackUlater
		});
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinCube), new Object []{
		"G",
		"D",
		
			'D', Ingredients.GroundGelatin, 'G', Utilities.GChamberT3
		});
		
}

	
public static void MinerRecipes() {
	
	//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.MinerCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.MinerSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.MinerCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.MinerSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.MinerCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.MinerSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.MinerCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.MinerJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.MinerCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.MinerJar
	});

	//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.MinerDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.MinerJar, 'D', Ingredients.GlassDish
	});
		
}


public static void TravellerRecipes() {
	
	//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.TravellerCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.TravellerSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.TravellerCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.TravellerSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.TravellerCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.TravellerSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.TravellerCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.TravellerJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.TravellerCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.TravellerJar
	});
		
	//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.TravellerDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.TravellerJar, 'D', Ingredients.GlassDish
	});
		
	}


public static void IronSkinRecipes() {
	
	//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.IronSkinCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.IronSkinSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.IronSkinCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.IronSkinSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.IronSkinCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.IronSkinSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.IronSkinCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.IronSkinJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.IronSkinCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.IronSkinJar
	});
		
	//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.IronSkinDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.IronSkinJar, 'D', Ingredients.GlassDish
	});
		
}


public static void WarriorRecipes() {
	
	//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.WarriorCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.WarriorSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.WarriorCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.WarriorSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.WarriorCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.WarriorSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.WarriorCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.WarriorJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.WarriorCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.WarriorJar
	});
		
	//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.WarriorDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.WarriorJar, 'D', Ingredients.GlassDish
	});
		
}


public static void HealthRecipes () {
	
	//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.HealthCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.HealthSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.HealthCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.HealthSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.HealthCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.HealthSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.HealthCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.HealthJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.HealthCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.HealthJar
	});
		
	//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.HealthDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.HealthJar, 'D', Ingredients.GlassDish
	});
		
}


public static void NightVisionRecipes()	{
	
//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.NightVisionCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.NightVisionSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.NightVisionCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.NightVisionSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.NightVisionCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.NightVisionSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.NightVisionCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.NightVisionJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.NightVisionCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.NightVisionJar
	});
		
//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.NightVisionDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.NightVisionJar, 'D', Ingredients.GlassDish
	});	
	
}


public static void TorchRecipes() {
	
//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.TorchCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.TorchSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.TorchCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.TorchSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.TorchCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.TorchSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.TorchCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.TorchJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.TorchCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.TorchJar
	});
		
//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.TorchDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.TorchJar, 'D', Ingredients.GlassDish
	});	
	
}


public static void ExplosiveRecipes() {
	
//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.ExplosiveCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.CompBSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.ExplosiveCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.CompBSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.ExplosiveCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.CompBSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.ExplosiveCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.ExplosiveJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.ExplosiveCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.ExplosiveJar
	});
		
//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.ExplosiveDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.ExplosiveJar, 'D', Ingredients.GlassDish
	});
		
}


public static void KrackenRecipes()	{
	
//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.KrackenCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.KrackenSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.KrackenCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.KrackenSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.KrackenCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.KrackenSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.KrackenCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.KrackenJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.KrackenCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.KrackenJar
	});
		
//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.KrackenDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.KrackenJar, 'D', Ingredients.GlassDish
	});	
		
}


public static void DragonRecipes()	{
	
	//Cube
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.DragonCube, 8), new Object []{
		"HSM",
		" CG",
		
			'S', Utilities.Solidifier, 'M', Ingredients.GlassGelatinMold, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.DragonSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.DragonCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT2, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.DragonSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.DragonCube, 8), new Object []{
		"HGM",
		" CS",
		
			'G', Utilities.GChamberT3, 'M', Ingredients.GlassGelatinMold, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.DragonSolution, 'C', "dustCharcoal"
	}));

	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.DragonCube, 8), new Object []{
		"P",
		"J",
		
			'P', Utilities.PackUlater, 'J', Storage.DragonJar
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.DragonCube, 8), new Object []{
		"G",
		"J",
		
			'G', Utilities.GChamberT3, 'J', Storage.DragonJar
	});
		
	//Dish		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.DragonDish, 8), new Object []{
		"GD",
		"J ",
		
			'G', Utilities.GChamberT3, 'J', Storage.DragonJar, 'D', Ingredients.GlassDish
	});	
		
	GameRegistry.addSmelting(Storage.DragonJar, new ItemStack(Items.experience_bottle, 8),  0.0F);

}


public static void HotSauceRecipes() {
	
	//HotSauce
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.HotSauceCube, 8), new Object []{
		"HSB",
		" CG",
		
			'S', Utilities.Solidifier, 'B', Ingredients.GlassBottle, 'G', Storage.GelatinSolutionJar, 
			'H', Ingredients.HotSauceSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.HotSauceCube, 8), new Object []{
		"HGB",
		" CS",
		
			'G', Utilities.GChamberT2, 'B', Ingredients.GlassBottle, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.HotSauceSolution, 'C', "dustCharcoal"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Gelatin.HotSauceCube, 8), new Object []{
		"HGB",
		" CS",
		
			'G', Utilities.GChamberT3, 'B', Ingredients.GlassBottle, 'S', Storage.GelatinSolutionJar, 
			'H', Ingredients.HotSauceSolution, 'C', "dustCharcoal"
	}));
	

//Apple Juice
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinJuice), new Object []{
		"ACA",
		"AJA",
		"ACA",
		
			'J', Utilities.CeramicJuicer, 'A', Items.apple, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinJuice), new Object []{
		"ACA",
		"AGA",
		"ACA",
		
			'G', Utilities.GChamberT2, 'A', Items.apple, 'C', Gelatin.GelatinCube
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinJuice, 2), new Object []{
		"ACA",
		"AGA",
		"ACA",
		
			'G', Utilities.GChamberT3, 'A', Items.apple, 'C', Gelatin.GelatinCube
	});
		
		
//Healing Apple Juice		
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinJuiceHealing, 6), new Object []{
		"JHJ",
		"JGJ",
		"JHJ",
		
			'G', Utilities.GChamberT3, 'J', Gelatin.GelatinJuice, 'H', Gelatin.HealthDish
	});
	
//Gelatin Pearl
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinPearl), new Object []{
		"GGG",
		"SGS",
		"GGG",
		
			'S', Ingredients.GelatinShard, 'G', Gelatin.GelatinCube			
	});	
	
//Gelatin Pearl Enhanced
	GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinPearlEnhanced), new Object []{
		"GGG",
		"SGS",
		"GGG",
		
			'S', Ingredients.GelatinShard, 'G', Gelatin.IronSkinCube			
	});
}


public static void LampRecipes() {
	//Gelatin Lamp
		GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinLamp), new Object []{
			"T",
			"G",
			
				'G', Gelatin.GelatinCube, 'T', Blocks.torch
		});	
		
	//Gelatin Lamp Luminant
		GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinLampLuminant), new Object []{
			"D",
			"G",
			
				'G', Gelatin.GelatinCube, 'D', Items.glowstone_dust
		});
		
	//Spectral Gelatin Lamp
		GameRegistry.addShapedRecipe(new ItemStack(Gelatin.GelatinLampSpectral), new Object []{
			"D",
			"G",
			
				'G', Gelatin.GelatinCube, 'D', Blocks.glowstone
		});
	}
	
}





















