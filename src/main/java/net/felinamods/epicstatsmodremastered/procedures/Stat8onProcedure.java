package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.Stat8ConfigConfiguration;

public class Stat8onProcedure {
	public static boolean execute() {
		return Stat8ConfigConfiguration.STAT_8_T.get();
	}
}
