
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.felinamods.epicstatsmodremastered.block.EngiruBlock;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<Block> ENGIRU = REGISTRY.register("engiru", () -> new EngiruBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
