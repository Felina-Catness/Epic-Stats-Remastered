package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat4ConfigConfiguration;

public class Stat4onProcedure {
	public static boolean execute() {
		return Stat4ConfigConfiguration.STAT_4_T.get();
	}
}
