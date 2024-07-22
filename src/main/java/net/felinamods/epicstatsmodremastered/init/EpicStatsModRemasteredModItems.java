
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.felinamods.epicstatsmodremastered.item.TheLostBookItem;
import net.felinamods.epicstatsmodremastered.item.ForbbidenAppleItem;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<Item> FORBBIDEN_APPLE = REGISTRY.register("forbbiden_apple", () -> new ForbbidenAppleItem());
	public static final RegistryObject<Item> THE_LOST_BOOK = REGISTRY.register("the_lost_book", () -> new TheLostBookItem());
	public static final RegistryObject<Item> ENGIRU = block(EpicStatsModRemasteredModBlocks.ENGIRU);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
