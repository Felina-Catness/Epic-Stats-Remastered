package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat8ConfigConfiguration;

public class Stat8NameProcedure {
	public static String execute() {
		return Stat8ConfigConfiguration.STAT_8_NAME.get();
	}
}
