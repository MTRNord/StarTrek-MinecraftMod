package mtrnord.StarTreckMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import mtrnord.StarTreckMod.Proxies.StarTreckModCommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.Configuration;

@Mod(modid = "startreckmod", name = "The StarTreck modification", version = "0.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class StarTreckMod {
	
	
	
	//CONFIG_VARIABLEN
	int titaniumBlockConfigID;
	int titaniumPouderConfigID;
	String titaniumBlockName;
	String titaniumPouderName;
	int titaniumIngotConfigID;
	String titaniumIngotName;
	int cutterConfigID;
	String cutterName;
	int titaniumStickConfigID;
	String titaniumStickName;
	int titaniumShovelConfigID;
	String titaniumShovelName;
	int titaniumPickaxeConfigID;
	String titaniumPickaxeName;
	int titaniumAxeConfigID;
	String titaniumAxeName;
	
	
	
	@Instance("StartTreckMod")
	public static StarTreckMod instance;
	
	@SidedProxy(clientSide="mtrnord.StarTreckMod.Proxies.StarTreckModClientProxy", serverSide="mtrnord.StarTreckMod.Proxies.StarTreckModCommonProxy")
	public static StarTreckModCommonProxy proxy;
	
	//---------------------------------------------------
	
	public static Item titaniumPouder;
	public int titaniumPouderID = 3200;
	
	public static Item titaniumIngot;
	public static int titaniumIngotID = 3201;
	
	public static Item cutter;
	public int cutterID = 3202;
	
	
	public static Item titaniumStick;
	public int titaniumStickID = 3203;
	
	//---------------------------------------------------
	
	public static Block titaniumOre;
	public int titaniumOreID = 3000;
	
	//---------------------------------------------------
	
	public static ItemPickaxeStarTreckMod titaniumPickaxe;
	public int titaniumPickaxeID = 3205;
	
	//----------------------------------------------------
	
	public static ItemShovelStarTreckMod titaniumShovel;
	public int titaniumShovelID = 3204;
	

	//----------------------------------------------------
	
	public static ItemAxeStarTreckMod titaniumAxe;
	public int titaniumAxeID = 3206;
	
	//----------------------------------------------------
	
	public static CreativeTabs StarTreckBlocks = new CreativeTabs("StarTreckBlocks"){
		public ItemStack getIconItemStack(){
			return new ItemStack(titaniumOre, 1, 0);
		}
	};
	
	public static CreativeTabs StarTreckDrops = new CreativeTabs("StarTreckDrops"){
		public ItemStack getIconItemStack(){
			return new ItemStack(titaniumPouder, 1, 0);
		}
	};

	public static CreativeTabs StarTreckIngots = new CreativeTabs("StarTreckIngots"){
		public ItemStack getIconItemStack(){
			return new ItemStack(titaniumIngot, 1, 0);
		}
	};
	
	public static CreativeTabs StarTreckTools = new CreativeTabs("StarTreckTools"){
		public ItemStack getIconItemStack(){
			return new ItemStack(titaniumPickaxe, 1, 0);
		}
	};
	
	//---------------------------------------------------

	
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		//--------------------
		// titaniumBlock
		//--------------------
		
		titaniumBlockName = config.get(Configuration.CATEGORY_BLOCK, "titaniumBlockName", "Titanium Ore").getString();
		titaniumOreID = config.get(Configuration.CATEGORY_BLOCK, "titaniumBlockConfigID", 3000).getInt();

		//--------------------
		// titaniumPouder
		//--------------------
		
		titaniumPouderName = config.get(Configuration.CATEGORY_ITEM, "titaniumPouderName", "Titanium Pouder").getString();
		titaniumPouderID = config.get(Configuration.CATEGORY_ITEM, "titaniumPouderConfigID", 3200).getInt();
		
		//--------------------
		// titaniumIngot
		//--------------------
		
		titaniumIngotName = config.get(Configuration.CATEGORY_ITEM, "titaniumIngotName", "Titanium Ingot").getString();
		titaniumIngotID = config.get(Configuration.CATEGORY_ITEM, "titaniumIngotConfigID", 3201).getInt();
		
		//--------------------
		// Cutter
		//--------------------
		
		cutterName = config.get(Configuration.CATEGORY_ITEM, "titaniumCutterName", "Cutter").getString();
		cutterID = config.get(Configuration.CATEGORY_ITEM, "titaniumCutterConfigID", 3202).getInt();
		
		//--------------------
		// titaniumShovel
		//--------------------
		
		titaniumShovelName = config.get(Configuration.CATEGORY_ITEM, "titaniumShovelName", "Titanium Shovel").getString();
		titaniumShovelID = config.get(Configuration.CATEGORY_ITEM, "titaniumShovelConfigID", 3204).getInt();

		//--------------------
		// titaniumPickaxe
		//--------------------
		
		titaniumPickaxeName = config.get(Configuration.CATEGORY_ITEM, "titaniumPickaxeName", "Titanium Pickaxe").getString();
		titaniumPickaxeID = config.get(Configuration.CATEGORY_ITEM, "titaniumPickaxeConfigID", 3205).getInt();
		
		//--------------------
		// titaniumAxe
		//--------------------
		
		titaniumAxeName = config.get(Configuration.CATEGORY_ITEM, "titaniumAxeName", "Titanium Axe").getString();
		titaniumAxeID = config.get(Configuration.CATEGORY_ITEM, "titaniumAxeConfigID", 3206).getInt();
		
		//--------------------
		// titaniumStick
		//--------------------
		
		titaniumStickName = config.get(Configuration.CATEGORY_ITEM, "titaniumStickName", "Titanium Stick").getString();
		titaniumStickID = config.get(Configuration.CATEGORY_ITEM, "titaniumStickConfigID", 3203).getInt();
		

		
		config.save();
		
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		
		titaniumPouder = new Items(titaniumPouderID).setUnlocalizedName("titaniumPouder").setCreativeTab(StarTreckDrops);
		titaniumIngot = new Items(titaniumIngotID).setUnlocalizedName("titaniumIngot").setCreativeTab(StarTreckIngots);
		cutter = new Items(cutterID).setUnlocalizedName("cutter").setCreativeTab(StarTreckTools);
		titaniumStick = new Items(titaniumStickID).setUnlocalizedName("titaniumStick").setCreativeTab(StarTreckTools);
		titaniumPickaxe = (ItemPickaxeStarTreckMod) new ItemPickaxeStarTreckMod(titaniumPickaxeID, EnumToolMaterialStarTreck.TITANIUM).setUnlocalizedName(titaniumPickaxeName).setCreativeTab(StarTreckTools);
		titaniumShovel = (ItemShovelStarTreckMod) new ItemShovelStarTreckMod(titaniumShovelID, EnumToolMaterialStarTreck.TITANIUM).setUnlocalizedName(titaniumShovelName).setCreativeTab(StarTreckTools);
		titaniumAxe = (ItemAxeStarTreckMod) new ItemAxeStarTreckMod(titaniumAxeID, EnumToolMaterialStarTreck.TITANIUM).setUnlocalizedName(titaniumAxeName).setCreativeTab(StarTreckTools);

		
		
		titaniumOre = new Blocks(titaniumOreID, Material.rock).setCreativeTab(StarTreckBlocks).setLightValue(0.02F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("titaniumOre").setResistance(5.0F);
	
	initCraftingRecipes();
	registerItems();
	registerBlocks();
	updateLanguage();
	GameRegistry.registerWorldGenerator(new Generator());
	InitSmeltingRecipes();
	
	
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	

	private void registerBlocks(){
		GameRegistry.registerBlock(titaniumOre, "Titanium Ore");
	}
	private void updateLanguage(){
		LanguageRegistry.addName(titaniumOre, titaniumBlockName);
		LanguageRegistry.addName(titaniumPouder, titaniumPouderName);
		LanguageRegistry.addName(titaniumIngot, titaniumIngotName);
		LanguageRegistry.addName(cutter, cutterName);
		LanguageRegistry.addName(titaniumStick, titaniumStickName);
		LanguageRegistry.addName(titaniumShovel, titaniumShovelName);
		LanguageRegistry.addName(titaniumPickaxe, titaniumPickaxeName);
		LanguageRegistry.addName(titaniumAxe, titaniumAxeName);
		
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.StarTreckBlocks", "StarTreck Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.StarTreckDrops", "StarTreck Drops");
		LanguageRegistry.instance().addStringLocalization("itemGroup.StarTreckIngots", "StarTreck Ingots");
		LanguageRegistry.instance().addStringLocalization("itemGroup.StarTreckTools", "StarTreck Tools");
		
		}
	
	private void registerItems(){
		
		GameRegistry.registerItem(titaniumPouder, "Titanium Pouder");
		GameRegistry.registerItem(titaniumIngot, "Titanium Ingot");
		GameRegistry.registerItem(cutter, "Cutter");
		GameRegistry.registerItem(titaniumStick, "Titanium Stick");
		GameRegistry.registerItem(titaniumShovel, "Titanium Shovel");
		GameRegistry.registerItem(titaniumPickaxe, "Titanium Pickaxe");
		GameRegistry.registerItem(titaniumAxe, "Titanium Axe");
		
	}
	
	private void initCraftingRecipes(){
		
		GameRegistry.addShapelessRecipe(new ItemStack(this.titaniumPouder), new ItemStack(this.titaniumOre), new ItemStack(this.cutter));
		
	}
	
	private void InitSmeltingRecipes(){
		
		GameRegistry.addSmelting(titaniumPouder.itemID, new ItemStack(this.titaniumIngot), 0.5F);
		
		
		//-------------------
		//| titaniumStick
		//-------------------
		GameRegistry.addRecipe(new ItemStack(this.titaniumStick), "#X#", 
																  "#X#", 
																  "#X#",
								'#', this.titaniumIngot, 'X', Item.stick);
		
		//-------------------
		//| titaniumPickaxe
		//-------------------
		
		GameRegistry.addRecipe(new ItemStack(this.titaniumPickaxe), "###", 
																  "UXU", 
																  "UXU",
								'#', this.titaniumIngot, 'X', this.titaniumPickaxe);
		
		//-------------------
		//| titaniumAxe
		//-------------------
		
		GameRegistry.addRecipe(new ItemStack(this.titaniumAxe), "##U", 
																  "#XU", 
																  "UXU",
								'#', this.titaniumIngot, 'X', this.titaniumStick);
		
		//-------------------
		//| titaniumAxe2
		//-------------------
		
		GameRegistry.addRecipe(new ItemStack(this.titaniumAxe), "U##", 
																  "UX#", 
																  "UXU",
								'#', this.titaniumIngot, 'X', this.titaniumStick);
		
		//-------------------
		//| titaniumShovel
		//-------------------
		
		GameRegistry.addRecipe(new ItemStack(this.titaniumShovel), "U#U", 
																  "UXU", 
																  "UXU",
								'#', this.titaniumIngot, 'X', this.titaniumStick);
		
	}
	}
