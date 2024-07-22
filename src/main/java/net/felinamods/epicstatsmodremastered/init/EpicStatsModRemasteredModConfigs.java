package net.felinamods.epicstatsmodremastered.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.felinamods.epicstatsmodremastered.configuration.Stat8ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat7ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat6ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat5ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat4ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat3ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat2ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.Stat1ConfigConfiguration;
import net.felinamods.epicstatsmodremastered.configuration.ExpManagerConfiguration;
import net.felinamods.epicstatsmodremastered.EpicStatsModRemasteredMod;

@Mod.EventBusSubscriber(modid = EpicStatsModRemasteredMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicStatsModRemasteredModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ExpManagerConfiguration.SPEC, "es_general.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat1ConfigConfiguration.SPEC, "es_stat1.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat2ConfigConfiguration.SPEC, "es_stat2.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat3ConfigConfiguration.SPEC, "es_stat3.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat4ConfigConfiguration.SPEC, "es_stat4.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat5ConfigConfiguration.SPEC, "es_stat5.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat6ConfigConfiguration.SPEC, "es_stat6.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat7ConfigConfiguration.SPEC, "es_stat7.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Stat8ConfigConfiguration.SPEC, "es_stat8.toml");
		});
	}
}
