package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat5ConfigConfiguration;

public class Stat5NameProcedure {
	public static String execute() {
		return Stat5ConfigConfiguration.STAT_5_NAME.get();
	}
}
