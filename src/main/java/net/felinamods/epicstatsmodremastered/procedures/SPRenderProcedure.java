package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;

public class SPRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Component.translatable("gui.sp").getString() + ": "
				+ new java.text.DecimalFormat("##").format((entity.getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).SP);
	}
}
