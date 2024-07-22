package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat4ConfigConfiguration;

public class Stat4NameProcedure {
	public static String execute() {
		return Stat4ConfigConfiguration.STAT_4_NAME.get();
	}
}
