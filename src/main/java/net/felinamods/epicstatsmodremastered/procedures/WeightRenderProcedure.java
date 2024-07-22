package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;

public class WeightRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("epicfight:weight"))) != null) {
			return new java.text.DecimalFormat("##").format(((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("epicfight:weight"))).getValue()) + " / "
					+ new java.text.DecimalFormat("##").format((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).current_weight_limit);
		}
		return "";
	}
}
