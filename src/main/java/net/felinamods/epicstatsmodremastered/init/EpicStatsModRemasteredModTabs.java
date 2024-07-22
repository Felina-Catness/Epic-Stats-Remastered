
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPIC_STATS = REGISTRY.register("epic_stats",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.epic_stats_mod_remastered.epic_stats")).icon(() -> new ItemStack(EpicStatsModRemasteredModItems.THE_LOST_BOOK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EpicStatsModRemasteredModItems.FORBBIDEN_APPLE.get());
				tabData.accept(EpicStatsModRemasteredModItems.THE_LOST_BOOK.get());
				tabData.accept(EpicStatsModRemasteredModBlocks.ENGIRU.get().asItem());
			})

					.build());
}
