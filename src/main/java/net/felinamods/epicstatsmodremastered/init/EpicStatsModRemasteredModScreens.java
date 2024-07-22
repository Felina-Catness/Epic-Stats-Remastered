
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.felinamods.epicstatsmodremastered.client.gui.StatsMenuScreen;
import net.felinamods.epicstatsmodremastered.client.gui.StatsMenuRemasteredScreen;
import net.felinamods.epicstatsmodremastered.client.gui.StatsMenuInfoScreen;
import net.felinamods.epicstatsmodremastered.client.gui.StatsMenuInfoRScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EpicStatsModRemasteredModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EpicStatsModRemasteredModMenus.STATS_MENU.get(), StatsMenuScreen::new);
			MenuScreens.register(EpicStatsModRemasteredModMenus.STATS_MENU_REMASTERED.get(), StatsMenuRemasteredScreen::new);
			MenuScreens.register(EpicStatsModRemasteredModMenus.STATS_MENU_INFO.get(), StatsMenuInfoScreen::new);
			MenuScreens.register(EpicStatsModRemasteredModMenus.STATS_MENU_INFO_R.get(), StatsMenuInfoRScreen::new);
		});
	}
}
