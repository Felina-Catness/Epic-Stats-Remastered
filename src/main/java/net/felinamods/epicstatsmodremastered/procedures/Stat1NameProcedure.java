package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat1ConfigConfiguration;

public class Stat1NameProcedure {
	public static String execute() {
		return Stat1ConfigConfiguration.STAT_1_NAME.get();
	}
}
