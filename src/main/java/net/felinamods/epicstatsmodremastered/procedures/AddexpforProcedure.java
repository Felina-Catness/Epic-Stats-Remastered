package net.felinamods.epicstatsmodremastered.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.felinamods.epicstatsmodremastered.network.EpicStatsModRemasteredModVariables;
import net.felinamods.epicstatsmodremastered.configuration.ExpManagerConfiguration;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class AddexpforProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		{
			double _setval = ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "setexpent");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl + DoubleArgumentType.getDouble(arguments, "setexpnum");
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "setexpent");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EXP_lvl = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "setexpent");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
		if (((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "setexpent");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).player_lvl < (double) ExpManagerConfiguration.MAX_PLAYER_LEVEL.get()) {
			while (((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "setexpent");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl >= ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "setexpent");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max) {
				{
					double _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "setexpent");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).SP + (double) ExpManagerConfiguration.SP_PER_LEVEL.get();
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "setexpent");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SP = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "setexpent");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
				if (ExpManagerConfiguration.OLD_EXP.get() == false) {
					if (ExpManagerConfiguration.EXP_DIVISION_T.get() == false) {
						{
							double _setval = ((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ (double) ExpManagerConfiguration.EXP_BASE.get() + Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get());
							(new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables((new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "setexpent");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()));
							});
						}
					} else if (ExpManagerConfiguration.EXP_DIVISION_T.get() == true) {
						{
							double _setval = ((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ ((double) ExpManagerConfiguration.EXP_BASE.get() + Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get()))
											/ (double) ExpManagerConfiguration.EXP_DIVISION_V.get();
							(new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables((new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "setexpent");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()));
							});
						}
					}
				} else if (ExpManagerConfiguration.OLD_EXP.get() == true) {
					if (ExpManagerConfiguration.EXP_DIVISION_T.get() == false) {
						{
							double _setval = ((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max + ((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get());
							(new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables((new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "setexpent");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()));
							});
						}
					} else if (ExpManagerConfiguration.EXP_DIVISION_T.get() == true) {
						{
							double _setval = ((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max + (((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).EXP_lvl_max
									+ Mth.nextDouble(RandomSource.create(), (double) ExpManagerConfiguration.EXP_MIN.get(), (double) ExpManagerConfiguration.EXP_MAX.get())) / (double) ExpManagerConfiguration.EXP_DIVISION_V.get();
							(new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "setexpent");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.EXP_lvl_max = _setval;
								capability.syncPlayerVariables((new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "setexpent");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()));
							});
						}
					}
				}
				{
					double _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "setexpent");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).player_lvl + 1;
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "setexpent");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_lvl = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "setexpent");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
				if ((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "setexpent");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()) instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("chat.text.lvlup").getString() + "" + ExpManagerConfiguration.LETTER_LEVEL_UP.get())), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				{
					double _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "setexpent");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModRemasteredModVariables.PlayerVariables())).total_sp + 1;
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "setexpent");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(EpicStatsModRemasteredModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.total_sp = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "setexpent");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
	}
}
