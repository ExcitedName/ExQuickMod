package com.excitedname.exq.vanilla;

import com.excitedname.exq.gelatin.Gelatin;
import com.excitedname.exq.ingredients.Ingredients;
import com.excitedname.exq.storage.Storage;
import com.excitedname.exq.utilities.Utilities;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class VanillaRecipes {
	

public static void VanillaBlocks() {
		
//Cob Web
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.web), new Object []{
		"SSS",
		"SPS",
		"SSS",
		
			'S', Items.string, 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.web, 2), new Object []{
		"SSS",
		"SGS",
		"SSS",
		
			'S', Items.string, 'G', Utilities.GChamberT3
	});
		
		
//Command Block
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.command_block), new Object []{
		"DTD",
		"SGS",
		"DTD",
		
			'D', "shardDiamond", 'T', Blocks.crafting_table, 'S', Ingredients.GelatinShard, 'G', Utilities.GChamberT3
	}));	
		
		
//End Stone		
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.end_stone, 2), new Object []{
		"NSN",
		"SGS",
		"NSN",
		
			'N', Blocks.netherrack, 'G', Utilities.GChamberT3, 'S', Ingredients.GelatinShard
	});
		
		
//End Frame
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.end_portal_frame), new Object []{
		"ECE",
		"CGC",
		"ECE",
		
			'E', Blocks.end_stone, 'G', Utilities.GChamberT3, 'C', Ingredients.GelatinCrystalVibrant
	});
		
				
//Grass Block
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.grass), new Object []{
		" S ",
		" T ",
		" D ",
		
			'S', Items.wheat_seeds, 'D', Blocks.dirt, 'T', Utilities.Terrarium
	});
		
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.grass, 2), new Object []{
		" S ",
		" G ",
		" D ",
		
			'S', Items.wheat_seeds, 'D', Blocks.dirt, 'G', Utilities.GChamberT3
	});
		
		
//Gravel
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel), new Object [] {
		"CCC",
		"CSC",
		"CCC",
			
			'S', Utilities.StampMill, 'C', Blocks.cobblestone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel), new Object [] {
		"CCC",
		"CGC",
		"CCC",
			
			'G', Utilities.GChamberT1, 'C', Blocks.cobblestone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel), new Object [] {
		"CCC",
		"CGC",
		"CCC",
			
			'G', Utilities.GChamberT2, 'C', Blocks.cobblestone
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.gravel), new Object [] {
		"CCC",
		"CGC",
		"CCC",
			
			'G', Utilities.GChamberT3, 'C', Blocks.cobblestone
	});
		
		
//Ice Block
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice, 1), new Object []{
		"JJJ",
		" S ",
		"JJJ",
		
			'S', Utilities.Solidifier, 'J', Storage.H2OCoolJar				
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice, 2), new Object []{
		"JJJ",
		" G ",
		"JJJ",
		
			'G', Utilities.GChamberT2, 'J', Storage.H2OCoolJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice, 3), new Object []{
		"JJJ",
		" G ",
		"JJJ",
		
			'G', Utilities.GChamberT3, 'J', Storage.H2OCoolJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice), new Object []{
		"SSS",
		"SPS",
		"SSS",
		
			'P', Utilities.PackUlater, 'S', Ingredients.IceShard
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice, 2), new Object []{
		"SSS",
		"SGS",
		"SSS",
		
			'G', Utilities.GChamberT3, 'S', Ingredients.IceShard
	});
		
		
//Lily Pad
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.waterlily), new Object []{
		"S S",
		"SPS",
		"SSS",
		
			'S', Items.wheat_seeds, 'P', Utilities.PackUlater
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.waterlily, 2), new Object []{
		"S S",
		"SGS",
		"SSS",
		
			'S', Items.wheat_seeds, 'G', Utilities.GChamberT3
	});
		
		
//Mossy Cobble
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.mossy_cobblestone, 2), new Object []{
		"CCC",
		"VPV",
		"CCC",
		
			'C', Blocks.cobblestone, 'V', Blocks.vine, 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.mossy_cobblestone, 4), new Object []{
		"CCC",
		"VGV",
		"CCC",
		
			'C', Blocks.cobblestone, 'V', Blocks.vine, 'G', Utilities.GChamberT3
	});
		
		
//Mycellium
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.mycelium), new Object []{
		" M ",
		" T ",
		" D ",
		
			'M', Blocks.red_mushroom, 'D', Blocks.dirt, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.mycelium), new Object []{
		" M ",
		" T ",
		" D ",
		
			'M', Blocks.brown_mushroom, 'D', Blocks.dirt, 'T', Utilities.Terrarium 
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.mycelium, 2), new Object []{
		" M ",
		" G ",
		" D ",
		
			'M', Blocks.red_mushroom, 'D', Blocks.dirt, 'G', Utilities.GChamberT3
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.mycelium, 2), new Object []{
		" M ",
		" G ",
		" D ",
		
			'M', Blocks.brown_mushroom, 'D', Blocks.dirt, 'G', Utilities.GChamberT3 
	});
		
		
//Oak Leaves
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves), new Object []{
		"SSS",
		"SPS",
		"SSS",
		
			'S', Items.wheat_seeds, 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.leaves, 2), new Object []{
		"SSS",
		"SGS",
		"SSS",
		
			'S', Items.wheat_seeds, 'G', Utilities.GChamberT3
	});
		
		
//Obsidian		
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.obsidian, 2), new Object [] {
		"   ",
		" G ",
		" L ",
			
			'G', Utilities.GChamberT3, 'L', Storage.LavaJar
	});
		
		
//Packed Ice
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice), new Object []{
		"III",
		"ISI",
		"III",
		
			'I', Blocks.ice, 'S', Utilities.Solidifier
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice, 2), new Object []{
		"III",
		"IGI",
		"III",
		
			'I', Blocks.ice, 'G', Utilities.GChamberT2
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice, 3), new Object []{
		"III",
		"IGI",
		"III",
		
			'I', Blocks.ice, 'G', Utilities.GChamberT3
	});
		
		
//Podzal Block
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.dirt, 1, 2), new Object []{
		" S ",
		" T ",
		" D ",
		
			'S', Items.wheat_seeds, 'D', Blocks.grass, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.dirt, 2, 2), new Object []{
		" S ",
		" G ",
		" D ",
		
			'S', Items.wheat_seeds, 'D', Blocks.grass, 'G', Utilities.GChamberT3
	});
		
		
//Red Sand
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sand, 4, 1), new Object []{
		"SSS",
		"DPD",
		"SSS",
		
			'S', Blocks.sand, 'D', new ItemStack(Items.dye, 1, 1), 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sand, 6, 1), new Object []{
		"SSS",
		"DGD",
		"SSS",
		
			'S', Blocks.sand, 'D', new ItemStack(Items.dye, 1, 1), 'G', Utilities.GChamberT3
	});
			
		
//Vines
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.vine, 4), new Object []{
		"L L",
		"LTL",
		"L L",
		
			'L', Blocks.leaves, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.vine, 6), new Object []{
		"L L",
		"LGL",
		"L L",
		
			'L', Blocks.leaves, 'G', Utilities.GChamberT3
	});	
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.vine, 4), new Object []{
		"L L",
		"LTL",
		"L L",
		
			'L', Blocks.leaves2, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.vine, 6), new Object []{
		"L L",
		"LGL",
		"L L",
		
			'L', Blocks.leaves2, 'G', Utilities.GChamberT3
	});
		
		
//Wood Plank
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 2), new Object []{
		"S S",
		" P ",
		"S S",
		
			'S', Items.stick, 'P', Utilities.PackUlater
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 2), new Object []{
		"S S",
		" G ",
		"S S",
		
			'S', Items.stick, 'G', Utilities.GChamberT3
	});
				
	}


public static void VanillaHeads() {
		
//Creeper
	GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 1, 4), new Object [] {
		"CSC",
		"CPC",
		"CSC",
			
			'S', Storage.CreeperJar, 'P', Utilities.PackUlater, 'C', Storage.PurifiedCollagenSolutionJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 2, 4), new Object [] {
		"CSC",
		"CGC",
		"CSC",
			
			'S', Storage.CreeperJar, 'G', Utilities.GChamberT3, 'C', Storage.PurifiedCollagenSolutionJar
	});
	
//Skeleton
	GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 1, 0), new Object [] {
		"CSC",
		"CPC",
		"CSC",
			
			'S', Storage.SkeletonJar, 'P', Utilities.PackUlater, 'C', Storage.PurifiedCollagenSolutionJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 2, 0), new Object [] {
		"CSC",
		"CGC",
		"CSC",
			
			'S', Storage.SkeletonJar, 'G', Utilities.GChamberT3, 'C', Storage.PurifiedCollagenSolutionJar
	});
	
//Zombie
	GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 1, 2), new Object [] {
		"CSC",
		"CPC",
		"CSC",
			
			'S', Storage.ZombieJar, 'P', Utilities.PackUlater, 'C', Storage.PurifiedCollagenSolutionJar
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 2, 2), new Object [] {
		"CSC",
		"CGC",
		"CSC",
			
			'S', Storage.ZombieJar, 'G', Utilities.GChamberT3, 'C', Storage.PurifiedCollagenSolutionJar
	});
	
	}


public static void VanillaMaterial() {
		
//Blaze Rod		
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.blaze_rod), new Object [] {
		"RRR",
		"RGR",
		"CCC",
			
			'G', Utilities.GChamberT2, 'C', Storage.GroundCharcoalJar, 'R', Ingredients.IronRod
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.blaze_rod, 2), new Object [] {
		"RRR",
		"RGR",
		"C C",
			
			'G', Utilities.GChamberT3, 'C', Storage.GroundCharcoalJar, 'R', Ingredients.IronRod
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.blaze_rod, 3), new Object [] {
		"RRR",
		"RGR",
		" L ",
			
			'G', Utilities.GChamberT3, 'L', Storage.LavaJar, 'R', Ingredients.IronRod
	});
		
		
//Bone
	GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 8),
			Storage.BoneBarrel);
		
		
//Bucket Water
	GameRegistry.addShapedRecipe(new ItemStack(Items.water_bucket), new Object [] {
		"   ",
		" B ",
		" J ",
			
			'J', Storage.H2OCoolJar, 'B', Items.bucket
	});		
		
//Bucket Lava
	GameRegistry.addShapedRecipe(new ItemStack(Items.lava_bucket), new Object [] {
		"   ",
		" B ",
		" J ",
			
			'J', Storage.LavaJar, 'B', Items.bucket
	});
		
	
//Clay Ball
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.clay_ball, 3), new Object [] {
		"SFS",
		"FVF",
		"SFS",
			
			'S', Blocks.sand, 'J', Storage.H2OHotJar, 'F', "foodFlour"
	}));
		
		
//Dragon Egg
	//GameRegistry.addShapedRecipe(new ItemStack(Blocks.dragon_egg), new Object []{
		//"ODO",
		//"SGS",
		//"ODO",
		
			//'O', Blocks.obsidian, 'D', exqGelatin.DragonCubeVibrant, 'G', Utilities.GChamberT3, 'S', Utilities.GelatinShard
	//});
		
		
//Diamond
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond), new Object []{
		"SSS",
		"SSS",
		"SSS",
		
			'S', "shardDiamond"
	}));
		
		
//Emerald
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.emerald), new Object []{
		"SSS",
		"SSS",
		"SSS",
		
			'S', "shardEmerald"
	}));
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.emerald), new Object []{
		"PPP",
		"PMP",
		"PPP",
		
			'P', Items.baked_potato, 'M', Ingredients.PotatoMedallion
	});
		
		
//Feather
	GameRegistry.addShapelessRecipe(new ItemStack(Items.feather, 8),
			Storage.FeatherBarrel);
		
		
//Glass
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 2), new Object [] {
		"   ",
		" P ",
		" G ",
						
			'P', Utilities.PackUlater, 'G', Blocks.glass
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass), new Object [] {
		" G ",
		" P ",
		" G ",
						
			'P', Utilities.PackUlater, 'G', Blocks.glass_pane
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 2), new Object [] {
		"   ",
		" P ",
		" G ",
						
			'P', Utilities.GChamberT3, 'G', Blocks.glass
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass), new Object [] {
		" G ",
		" P ",
		" G ",
						
			'P', Utilities.GChamberT3, 'G', Blocks.glass_pane
	});
		
//Paper
	GameRegistry.addShapedRecipe(new ItemStack(Items.paper), new Object [] {
		"PPP",
		"PJP",
		"PPP",
						
			'P', Ingredients.WoodPulp, 'J', Storage.H2OHotJar
	});
	
		
//Slime Ball
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.slime_ball), new Object [] {
		"   ",
		" SB",
		" CP",
			
			'S', Utilities.Smeltry, 'C', "dustCharcoal", 'B', Items.clay_ball, 
			'P', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.slime_ball), new Object [] {
		"   ",
		" GB",
		" CP",
			
			'G', Utilities.GChamberT2, 'C', "dustCharcoal", 'B', Items.clay_ball, 
			'P', Storage.PurifiedCollagenSolutionJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.slime_ball, 2), new Object [] {
		"   ",
		" GB",
		" CP",
			
			'G', Utilities.GChamberT3, 'C', "dustCharcoal", 'B', Items.clay_ball, 
			'P', Storage.PurifiedCollagenSolutionJar
	}));
		
		
//String
	GameRegistry.addShapedRecipe(new ItemStack(Items.string, 4), new Object [] {
		"   ",
		" C ",
		" W ",
		
			'C', Ingredients.CraftingMedallion, 'W', new ItemStack(Blocks.wool)
	});
		
		
//Sponge
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge), new Object [] {
		"WWW",
		"WJW",
		"WWW",
			
			'W', Blocks.wool, 'J', Storage.H2OHotJar
	});
		
		
//Sugar
	GameRegistry.addShapedRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT1, 'C', Items.reeds
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', Items.reeds
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', Items.reeds
	});
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropBeet"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropBeet"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropBeet"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropBeet"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropCranberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropCranberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropCranberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropCranberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropBlackberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropBlackberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropBlackberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropBlackberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropCandleberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropCandleberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropCandleberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropCandleberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropRaspberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropRaspberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropRaspberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropRaspberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropStrawberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropStrawberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropStrawberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropStrawberry"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropGrape"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropGrape"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropGrape"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropGrape"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropPineapple"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropPineapple"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropPineapple"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropPineapple"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.MortarandPestel, 'C', "cropKiwi"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
		
			'G', Utilities.GChamberT1, 'C', "cropKiwi"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 2), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT2, 'C', "cropKiwi"
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 3), new Object [] {
		"   ",
		" G ",
		" C ",
			
			'G', Utilities.GChamberT3, 'C', "cropKiwi"
	}));		
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 8), new Object [] {
		"   ",
		" P ",
		" J ",
			
			'G', Utilities.PackUlater, 'J', Storage.GroundSugarJar
	}));
	
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sugar, 8), new Object [] {
		"   ",
		" G ",
		" J ",
			
			'G', Utilities.GChamberT3, 'J', Storage.GroundSugarJar
	}));
		
	}
	

public static void VanillaSaplings() {	
	
//Oak Sapling
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 0), new Object []{
		" L ",
		" T ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 0), 'S', Items.stick, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 2, 0), new Object []{
		" L ",
		" G ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 0), 'S', Items.stick, 'G', Utilities.GChamberT3
	});
		
//Spruce Sapling
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 1), new Object []{
		" L ",
		" T ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 1), 'S', Items.stick, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 2, 1), new Object []{
		" L ",
		" G ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 1), 'S', Items.stick, 'G', Utilities.GChamberT3
	});

//Birch Sapling
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 2), new Object []{
		" L ",
		" T ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 2), 'S', Items.stick, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 2, 2), new Object []{
		" L ",
		" G ",
		" S ",
					
			'L', new ItemStack(Blocks.leaves, 1, 2), 'S', Items.stick, 'G', Utilities.GChamberT3
	});
	
//Jungle Sapling
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 3), new Object []{
		" L ",
		" T ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 3), 'S', Items.stick, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 2, 3), new Object []{
		" L ",
		" G ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves, 1, 3), 'S', Items.stick, 'G', Utilities.GChamberT3
	});
		
//Acacia Sapling
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 4), new Object []{
		" L ",
		" T ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves2, 1, 0), 'S', Items.stick, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 2, 4), new Object []{
		" L ",
		" G ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves2, 1, 0), 'S', Items.stick, 'G', Utilities.GChamberT3
	});
		
//Dark Oak Sapling
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 1, 5), new Object []{
		" L ",
		" T ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves2, 1, 1), 'S', Items.stick, 'T', Utilities.Terrarium
	});
	
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.sapling, 2, 5), new Object []{
		" L ",
		" G ",
		" S ",
						
			'L', new ItemStack(Blocks.leaves2, 1, 1), 'S', Items.stick, 'G', Utilities.GChamberT3
	});
		
	}


public static void VanillaUtil() {
		
//Name Tag
	GameRegistry.addShapedRecipe(new ItemStack(Items.name_tag), new Object [] {
		" S ",
		" P ",
		" P ",
			
			'S', Items.string, 'P', Items.paper
	});
		
//Saddle
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.saddle), new Object [] {
		"LLL",
		"L L",
		"SNS",
			
			'S', Items.string, 'L', Items.leather, 'N', "nuggetIron"
	}));
		
//Iron Horse Armor
	GameRegistry.addShapedRecipe(new ItemStack(Items.iron_horse_armor), new Object [] {
		" SI",
		"IsS",
		"II ",
			
			'S', Items.string, 's', Items.saddle, 'I', Items.iron_ingot
	});
		
//Gold Horse Armor
	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_horse_armor), new Object [] {
		" SI",
		"IsS",
		"II ",
			
			'S', Items.string, 's', Items.saddle, 'I', Items.gold_ingot
	});
		
//Diamond Horse Armor
	GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_horse_armor), new Object [] {
		" SD",
		"DsS",
		"DD ",
			
			'S', Items.string, 's', Items.saddle, 'D', Items.diamond
	});
	
	}
	
}





























