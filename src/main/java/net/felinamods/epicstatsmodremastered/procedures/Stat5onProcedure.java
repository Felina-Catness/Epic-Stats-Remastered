package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat5ConfigConfiguration;

public class Stat5onProcedure {
	public static boolean execute() {
		return Stat5ConfigConfiguration.STAT_5_T.get();
	}
}
