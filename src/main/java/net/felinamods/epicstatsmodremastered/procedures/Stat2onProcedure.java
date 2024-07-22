package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat2ConfigConfiguration;

public class Stat2onProcedure {
	public static boolean execute() {
		return Stat2ConfigConfiguration.STAT_2_T.get();
	}
}
