package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat2ConfigConfiguration;

public class Stat2NameProcedure {
	public static String execute() {
		return Stat2ConfigConfiguration.STAT_2_NAME.get();
	}
}
