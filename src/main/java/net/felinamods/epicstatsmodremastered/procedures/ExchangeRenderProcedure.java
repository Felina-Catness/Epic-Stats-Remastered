package net.felinamods.epicstatsmodremastered.procedures;

import net.felinamods.epicstatsmodremastered.configuration.ExpManagerConfiguration;

public class ExchangeRenderProcedure {
	public static boolean execute() {
		if (ExpManagerConfiguration.EXP_EXCHANGE_T.get() == true) {
			return true;
		}
		return false;
	}
}
