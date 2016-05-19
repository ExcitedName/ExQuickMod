package com.excitedname.exq;

import org.apache.logging.log4j.core.Logger;

import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.oredictionary.exqOreDictionary;
import com.excitedname.exq.proxies.ClientProxy;
import com.excitedname.exq.proxies.CommonProxy;
import com.excitedname.exq.ref.Ref;
import com.excitedname.exq.storage.Storage;
import com.excitedname.exq.utilities.Utilities;
import com.excitedname.exq.vanilla.VanillaRecipes;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

@Mod(name = Ref.MOD_NAME, modid = Ref.MOD_ID, version = Ref.MOD_VER)

public class exqMain {	
		
	@SidedProxy(clientSide="com.excitedname.exq.proxies.ClientProxy",
				serverSide="com.excitedname.exq.proxies.CommonProxy")
	public static ClientProxy proxy;
	public static CommonProxy cproxy;
	
	public static Logger Log = (Logger) FMLLog.getLogger();
		

	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event){
		
	//Inititializtion
		Utilities.Lamp();
		Utilities.Util();
		Utilities.GChamber();
		Gelatin.Cube();
		Gelatin.Dish();		
		Ingredients.Solution();
		Gelatin.Juice();
		Ingredients.Distilleries();
		Gelatin.Pearls();
		Ingredients.Orb();
		Ingredients.UtilIng();
		Ingredients.Glassware();
		Ingredients.Material();
		Ingredients.Medallion();
		Ingredients.Ground();		
		Storage.Jar();
		Storage.Barrel();
		Storage.Vat();
				
		
	//Logger
		Log.info("ExQuickMod preInit");
	}
	

	
@Mod.EventHandler
public void Init(FMLInitializationEvent event){
		
	//Renders	
		proxy.registerGelatinRenders();
	
		
	//Ore Dictionary
		exqOreDictionary.InitexqOreDictionary();
		
	
	//Recipes
		Utilities.LampRecipes();
		Gelatin.GelatinRecipes();
		Gelatin.MinerRecipes();
		Gelatin.TravellerRecipes();
		Gelatin.IronSkinRecipes();
		Gelatin.WarriorRecipes();
		Gelatin.HealthRecipes();
		Gelatin.NightVisionRecipes();
		Gelatin.TorchRecipes();
		Gelatin.ExplosiveRecipes();
		Gelatin.KrackenRecipes();
		Gelatin.DragonRecipes();
		Gelatin.HotSauceRecipes();
		Gelatin.JuiceRecipes();
		Gelatin.PearlRecipes();
		Ingredients.DistRecipes();
		Ingredients.OrbRecipes();
		Ingredients.SolutionRecipes();
		Ingredients.IngRecipes();
		Ingredients.GlasswareRecipes();
		Ingredients.MaterialRecipes();
		Ingredients.GroundRecipes();
		Storage.GelatinJarRecipes();
		Storage.MinerJarRecipes();
		Storage.TravellerJarRecipes();
		Storage.IronSkinJarRecipes();
		Storage.WarriorJarRecipes();
		Storage.HealthJarRecipes();
		Storage.HotSauceJarRecipes();
		Storage.NVisionJarRecipes();
		Storage.TorchJarRecipes();
		Storage.ExplosiveJarRecipes();
		Storage.KrackenJarRecipes();
		Storage.DragonJarRecipes();
		Storage.CreeperJarRecipes();		
		Storage.SkeletonJarRecipes();		
		Storage.ZombieJarRecipes();
		Utilities.UtilRecipes();
		Utilities.GChamberRecipes();
		Storage.BarrelRecipes();
		Storage.VatRecipes();
		VanillaRecipes.VanillaBlocks();
		VanillaRecipes.VanillaHeads();
		VanillaRecipes.VanillaMaterial();
		VanillaRecipes.VanillaSaplings();
		VanillaRecipes.VanillaUtil();
		
		
		
	//Logger
		Log.info("ExQuickMod Init");
	}
	

	
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event){		
		
	//Logger		
		Log.info("ExQuickMod postInit");
	}
}
