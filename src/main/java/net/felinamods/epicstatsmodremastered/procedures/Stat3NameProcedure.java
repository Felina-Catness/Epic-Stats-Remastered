package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat3ConfigConfiguration;

public class Stat3NameProcedure {
	public static String execute() {
		return Stat3ConfigConfiguration.STAT_3_NAME.get();
	}
}
