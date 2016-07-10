package xyz.brassgoggledcoders.modularutilities.modules.villages;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import xyz.brassgoggledcoders.boilerplate.module.Module;
import xyz.brassgoggledcoders.boilerplate.module.ModuleBase;
import xyz.brassgoggledcoders.boilerplate.utils.VillagerUtils;
import xyz.brassgoggledcoders.modularutilities.ModularUtilities;

@Module(mod = ModularUtilities.MODID)
public class VillagesModule extends ModuleBase {

	@Override
	public String getName() {
		return "Villages";
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		/*
		 * TODO
		 * Custom 'house'.
		 * Random spawns outside of villages.
		 * Travelling?
		 * Nether/End Variants
		 */
		VillagerProfession explorer =
				new VillagerProfession("modularutilities:explorer", "modularutilities:textures/entity/explorer.png",
						"minecraft:textures/entity/zombie_villager/zombie_villager.png");
		VillagerCareer explorer_career = new VillagerCareer(explorer, "modularutilities:explorer");
		VillagerUtils.addSellTrade(explorer_career, new ItemStack(Blocks.SAND, 6, 1), 2, 4);
		VillagerUtils.addSellTrade(explorer_career, new ItemStack(Blocks.DIRT, 3, 1), 1, 2);
		VillagerUtils.addSellTrade(explorer_career, new ItemStack(Blocks.STONEBRICK, 3, 1), 1, 2);
		VillagerUtils.addSellTrade(explorer_career, new ItemStack(Blocks.STONEBRICK, 3, 2), 1, 2);
		VillagerUtils.addSellTrade(explorer_career, new ItemStack(Blocks.STONEBRICK, 3, 3), 1, 2);
		VillagerUtils.addSellTrade(2, explorer_career, new ItemStack(Blocks.PACKED_ICE, 2), 3, 6);
		VillagerUtils.addSellTrade(2, explorer_career, new ItemStack(Blocks.DIRT, 1, 2), 1, 2);
		VillagerUtils.addSellTrade(2, explorer_career, new ItemStack(Blocks.PACKED_ICE, 2), 3, 6);
		VillagerUtils.addSellTrade(2, explorer_career, new ItemStack(Blocks.DIRT, 1, 2), 1, 2);
		VillagerUtils.addSellTrade(3, explorer_career, new ItemStack(Blocks.MYCELIUM), 3, 4);
		VillagerRegistry.instance().register(explorer);
	}

}