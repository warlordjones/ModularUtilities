package xyz.brassgoggledcoders.modularutilities.modules.miscellaneous;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import xyz.brassgoggledcoders.boilerplate.blocks.BlockBase;
import xyz.brassgoggledcoders.boilerplate.module.Module;
import xyz.brassgoggledcoders.boilerplate.module.ModuleBase;
import xyz.brassgoggledcoders.modularutilities.ModularUtilities;

@Module(mod = ModularUtilities.MODID)
public class MiscellaneousModule extends ModuleBase {
	
	public static BlockBase blockFeathers; 
	
	@Override
	public String getName() {
		return "Miscellaneous";
	}
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		blockFeathers = new BlockFeathers();
		this.getBlockRegistry().registerBlock(blockFeathers);
		/*
		 * TODO:
		 * - Dungeon loot extension
		 * - Villager trade & house type (Stable) extension
		 * - Enchantments
		 * - Commands
		 * - Achievement Extension
		 * - Jump Pad: Increases Jump height, slime block + piston 
		 * - Sticky Slime Block: Slime Block + water. No Jumping. 
		 * - Enchanting water bottle = Bottle of Enchanting? 
		 * - Bedroll from Hay Bales/Feather Block. Durability, somehow? Won't set spawn. 
		 * - Splash Water bottle for fire extinguishing.
		 * - Desert Golem that throws sand, giving you blindness? 
		 * - Use for rotten flesh
		 * - Tool/Armour breakdown
		 */
	}
	@Override
	public void init(FMLInitializationEvent event)
	{
		OreDictionary.registerOre("wool", blockFeathers);
		OreDictionary.registerOre("wool", Blocks.WOOL);
	}
}