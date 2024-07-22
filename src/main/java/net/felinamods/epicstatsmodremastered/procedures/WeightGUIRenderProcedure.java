package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.felinamods.epicstatsmodremastered.configuration.ExpManagerConfiguration;

public class WeightGUIRenderProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean localtr = false;
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("epicfight:weight"))) != null) {
			if (ExpManagerConfiguration.EF_WEIGHT.get() == true) {
				localtr = true;
			}
		}
		if (localtr == true) {
			return true;
		}
		return false;
	}
}
