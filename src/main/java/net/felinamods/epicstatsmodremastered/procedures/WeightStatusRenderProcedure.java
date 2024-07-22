package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.ExpManagerConfiguration;

public class WeightStatusRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String textw = "";
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("epicfight:weight"))) != null) {
			if (((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("epicfight:weight"))).getValue() == (double) ExpManagerConfiguration.EF_WEIGHT_AT_THE_START.get()
					&& ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("epicfight:weight")))
							.getValue() < (entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).current_weight_limit) {
				textw = "Normal";
			} else {
				textw = "Overweight";
			}
		}
		return textw;
	}
}
