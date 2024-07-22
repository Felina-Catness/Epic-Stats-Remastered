package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat3ConfigConfiguration;

public class Stat3onProcedure {
	public static boolean execute() {
		return Stat3ConfigConfiguration.STAT_3_T.get();
	}
}
