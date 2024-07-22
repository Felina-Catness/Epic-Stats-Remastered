package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraft.network.chat.Component;

public class BookdescProcedure {
	public static String execute() {
		return "" + Component.translatable("book.desc").getString();
	}
}
