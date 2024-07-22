
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuRemasteredMenu;
import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuMenu;
import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuInfoRMenu;
import net.felinamods.epicstatsmodremastered.world.inventory.StatsMenuInfoMenu;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

public class EpicStatsModRemasteredModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EpicStatsModRemasteredMod.MODID);
	public static final RegistryObject<MenuType<StatsMenuMenu>> STATS_MENU = REGISTRY.register("stats_menu", () -> IForgeMenuType.create(StatsMenuMenu::new));
	public static final RegistryObject<MenuType<StatsMenuRemasteredMenu>> STATS_MENU_REMASTERED = REGISTRY.register("stats_menu_remastered", () -> IForgeMenuType.create(StatsMenuRemasteredMenu::new));
	public static final RegistryObject<MenuType<StatsMenuInfoMenu>> STATS_MENU_INFO = REGISTRY.register("stats_menu_info", () -> IForgeMenuType.create(StatsMenuInfoMenu::new));
	public static final RegistryObject<MenuType<StatsMenuInfoRMenu>> STATS_MENU_INFO_R = REGISTRY.register("stats_menu_info_r", () -> IForgeMenuType.create(StatsMenuInfoRMenu::new));
}
