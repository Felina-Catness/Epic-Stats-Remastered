package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat4ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_4_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_4_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_4_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT4_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_4_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E1_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_4_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E2_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_4_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E3_LVL_REQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_4_E3_MAX;
	static {
		BUILDER.push("Stat 4");
		STAT_4_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 4", true);
		STAT_4_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 4 Name ", "Intelligence");
		STAT_4_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 4 ID", "modid:attribute");
		STAT_4_V = BUILDER.comment("The value added to the attribute per level").define("Stat 4 Value", (double) 0.1);
		STAT4_MAX = BUILDER.define("Stat 4 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_4_E1_ID = BUILDER.define("Stat 4 Extra 1 ID ", "irons_spellbooks:cast_time_reduction");
		STAT_4_E1_V = BUILDER.define("Stat 4 Extra 1 Value", (double) 0.1);
		STAT_4_E1_LVL_REQ = BUILDER.define("Stat 4 Extra 1 LVL Req", (double) 80);
		STAT_4_E1_MAX = BUILDER.define("Stat 4 Extra 1 Max", (double) 3);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_4_E2_ID = BUILDER.define("Stat 4 Extra 2 ID", "irons_spellbooks:cooldown_reduction");
		STAT_4_E2_V = BUILDER.define("Stat 4 Extra 2 Value", (double) 0.1);
		STAT_4_E2_LVL_REQ = BUILDER.define("Stat 4 Extra 2 LVL Req", (double) 40);
		STAT_4_E2_MAX = BUILDER.define("Stat 4 Extra 2 Max", (double) 3);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_4_E3_ID = BUILDER.define("Stat 4 Extra 3 ID", "irons_spellbooks:spell_power");
		STAT_4_E3_V = BUILDER.define("Stat 4 Extra 3 Value", (double) 0.1);
		STAT_4_E3_LVL_REQ = BUILDER.define("Stat 4 Extra 3 LVL Req", (double) 1);
		STAT_4_E3_MAX = BUILDER.define("Stat 4 Extra 3 Max", (double) 3);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
