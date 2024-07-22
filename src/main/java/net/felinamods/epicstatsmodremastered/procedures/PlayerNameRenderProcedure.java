package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraft.world.entity.Entity;

public class PlayerNameRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getDisplayName().getString();
	}
}
