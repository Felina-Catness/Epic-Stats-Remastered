package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraft.world.entity.Entity;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;

public class Frame3RProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).bookanimreversed == 3) {
			return true;
		}
		return false;
	}
}
