package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat7ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_7_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_7_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_7_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT7_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_7_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E1_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_7_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E2_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_7_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E3_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_7_E3_MAX;
	static {
		BUILDER.push("Stat 7");
		STAT_7_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 7", true);
		STAT_7_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 7 Name ", "Stamina");
		STAT_7_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 7 ID", "modid:attribute");
		STAT_7_V = BUILDER.comment("The value added to the attribute per level").define("Stat 7 Value", (double) 0.1);
		STAT7_MAX = BUILDER.define("Stat 7 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_7_E1_ID = BUILDER.define("Stat 7 Extra 1 ID ", "epicfight:staminar");
		STAT_7_E1_V = BUILDER.define("Stat 7 Extra 1 Value", (double) 1);
		STAT_7_E1_LVL_REQ = BUILDER.define("Stat 7 Extra 1 LVL Req", (double) 1);
		STAT_7_E1_MAX = BUILDER.define("Stat 7 Extra 1 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_7_E2_ID = BUILDER.define("Stat 7 Extra 2 ID", "paraglider:max_stamina");
		STAT_7_E2_V = BUILDER.define("Stat 7 Extra 2 Value", (double) 5);
		STAT_7_E2_LVL_REQ = BUILDER.define("Stat 7 Extra 2 LVL Req", (double) 1);
		STAT_7_E2_MAX = BUILDER.define("Stat 7 Extra 2 Max", (double) 4000);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_7_E3_ID = BUILDER.define("Stat 7 Extra 3 ID", "modid:attribute");
		STAT_7_E3_V = BUILDER.define("Stat 7 Extra 3 Value", (double) 0.1);
		STAT_7_E3_LVL_REQ = BUILDER.define("Stat 7 Extra 3 LVL Req", (double) 1);
		STAT_7_E3_MAX = BUILDER.define("Stat 7 Extra 3 Max", (double) 3);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
