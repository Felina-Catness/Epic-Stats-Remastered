package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat5ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_5_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_5_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_5_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT5_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_5_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E1_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_5_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E2_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_5_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E3_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_5_E3_MAX;
	public static final ForgeConfigSpec.ConfigValue<Double> IRONS_MANA;
	public static final ForgeConfigSpec.ConfigValue<Boolean> IRON_MANA_T;
	static {
		BUILDER.push("Stat 5");
		STAT_5_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 5", true);
		STAT_5_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 5 Name ", "Magic");
		STAT_5_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 5 ID", "modid:attribute");
		STAT_5_V = BUILDER.comment("The value added to the attribute per level").define("Stat 5 Value", (double) 0.1);
		STAT5_MAX = BUILDER.define("Stat 5 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_5_E1_ID = BUILDER.define("Stat 5 Extra 1 ID ", "irons_spellbooks:max_mana");
		STAT_5_E1_V = BUILDER.define("Stat 5 Extra 1 Value", (double) 1);
		STAT_5_E1_LVL_REQ = BUILDER.define("Stat 5 Extra 1 LVL Req", (double) 1);
		STAT_5_E1_MAX = BUILDER.define("Stat 5 Extra 1 Max", (double) 500);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_5_E2_ID = BUILDER.define("Stat 5 Extra 2 ID", "irons_spellbooks:spell_resist");
		STAT_5_E2_V = BUILDER.define("Stat 5 Extra 2 Value", (double) 0.1);
		STAT_5_E2_LVL_REQ = BUILDER.define("Stat 5 Extra 2 LVL Req", (double) 40);
		STAT_5_E2_MAX = BUILDER.define("Stat 5 Extra 2 Max", (double) 3);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_5_E3_ID = BUILDER.define("Stat 5 Extra 3 ID", "modid:attribute");
		STAT_5_E3_V = BUILDER.define("Stat 5 Extra 3 Value", (double) 0.1);
		STAT_5_E3_LVL_REQ = BUILDER.define("Stat 5 Extra 3 LVL Req", (double) 1);
		STAT_5_E3_MAX = BUILDER.define("Stat 5 Extra 3 Max", (double) 3);
		BUILDER.pop();
		BUILDER.push("Custom Mana");
		IRONS_MANA = BUILDER.define("Custom Mana", (double) 0);
		IRON_MANA_T = BUILDER.define("Have you custom mana at the start?", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
