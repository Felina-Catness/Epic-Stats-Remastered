package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat1ConfigConfiguration;

public class Stat1onProcedure {
	public static boolean execute() {
		return Stat1ConfigConfiguration.STAT_1_T.get();
	}
}
