package net.felinamods.epicstatsmodremastered.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class Stat3ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STAT_3_T;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_3_NAME;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT3_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_3_E1_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E1_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E1_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E1_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_3_E2_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E2_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E2_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E2_MAX;
	public static final ForgeConfigSpec.ConfigValue<String> STAT_3_E3_ID;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E3_V;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E3_LVLREQ;
	public static final ForgeConfigSpec.ConfigValue<Double> STAT_3_E3_MAX;
	static {
		BUILDER.push("Stat 3");
		STAT_3_T = BUILDER.comment("Defines if the stat is on or off").define("Stat 3", true);
		STAT_3_NAME = BUILDER.comment("Defines which name do you want to use for this stat in the menu").define("Stat 3 Name ", "Endurance");
		STAT_3_ID = BUILDER.comment("Defines the ID of the attribute, example: minecraft:generic.attack_speed").define("Stat 3 ID", "minecraft:generic.armor");
		STAT_3_V = BUILDER.comment("The value added to the attribute per level").define("Stat 3 Value", (double) 0.1);
		STAT3_MAX = BUILDER.define("Stat 3 Max", (double) 100);
		BUILDER.pop();
		BUILDER.push("Extra 1");
		STAT_3_E1_ID = BUILDER.define("Stat 3 Extra 1 ID", "aaa:ffg");
		STAT_3_E1_V = BUILDER.define("Stat 3 Extra 1 Value", (double) 33);
		STAT_3_E1_LVLREQ = BUILDER.define("Stat 3 Extra 1 LVL Req", (double) 44);
		STAT_3_E1_MAX = BUILDER.define("Stat 3 Extra 1 Max", (double) 55);
		BUILDER.pop();
		BUILDER.push("Extra 2");
		STAT_3_E2_ID = BUILDER.define("Stat 3 Extra 2 ID", "adad:aaaa");
		STAT_3_E2_V = BUILDER.define("Stat 3 Extra 2 Value", (double) 3);
		STAT_3_E2_LVLREQ = BUILDER.define("Stat 3 Extra 2 LVL Req", (double) 56);
		STAT_3_E2_MAX = BUILDER.define("Stat 3 Extra 2 Max", (double) 555);
		BUILDER.pop();
		BUILDER.push("Extra 3");
		STAT_3_E3_ID = BUILDER.define("Stat 3 Extra 3 ID", "aaa:aafg");
		STAT_3_E3_V = BUILDER.define("Stat 3 Extra 3 Value", (double) 444);
		STAT_3_E3_LVLREQ = BUILDER.define("Stat 3 Extra 3 LVL Req", (double) 44);
		STAT_3_E3_MAX = BUILDER.define("Stat 3 Extra 3 Max", (double) 333);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
