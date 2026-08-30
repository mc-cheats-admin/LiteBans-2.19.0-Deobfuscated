package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.function.Function;
public final class UnbanHandler
implements Function {
    final /* synthetic */ ConfigService LiteBansModule_31;
    final /* synthetic */ BanHandler_4 c;
    public UnbanHandler(ConfigService configService, BanHandler_4 g) {
        this.LiteBansModule_31 = configService;
        this.c = g;
    }

    public final void BaseCoreGenericHandler(Object v1) {
        v2 = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(this.LiteBansModule_31);
        v3 = this.c;
        var4_4 = false;
        var6_6 = v2.length;
        for (var5_5 = 0; var5_5 < var6_6; ++var5_5) {
            block36: {
                block34: {
                    block35: {
                        block33: {
                            block29: {
                                block31: {
                                    block30: {
                                        block32: {
                                            var8_8 = var7_7 = v2[var5_5];
                                            var9_9 = false;
                                            var10_10 = v3;
                                            var11_11 = null;
                                            ObjectUtilities.LiteBansModule_31(v1, "");
                                            var12_12 = (CommandDispatcher)v1;
                                            var13_13 = false;
                                            v0 = new StringBuilder().append("litebans + ");
                                            var14_14 = AbstractCommand.AsyncBackgroundTask_5;
                                            var15_16 = false;
                                            var16_17 = var8_8;
                                            switch (var16_17.hashCode()) {
                                                case -1396405339: {
                                                    if (!var16_17.equals("ban-ip")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case 111426262: {
                                                    if (var16_17.equals("unban")) break;
                                                    ** break;
                                                }
                                                case -840127329: {
                                                    if (!var16_17.equals("unwarn")) {
                                                        ** break;
                                                    }
                                                    break block30;
                                                }
                                                case 1972486690: {
                                                    if (!var16_17.equals("tempbanip")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case 93503862: {
                                                    if (!var16_17.equals("banip")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case -1062781696: {
                                                    if (!var16_17.equals("muteip")) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case -840405966: {
                                                    if (!var16_17.equals("unmute")) {
                                                        ** break;
                                                    }
                                                    break block32;
                                                }
                                                case 1351111124: {
                                                    if (!var16_17.equals("tempmuteip")) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case 1231784084: {
                                                    if (!var16_17.equals("tempipmute")) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case 1979386420: {
                                                    if (!var16_17.equals("tempipban")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                            }
                                            v1 = "unban.own";
                                            break block33;
                                        }
                                        v1 = "unmute.own";
                                        break block33;
                                    }
                                    v1 = "unwarn.own";
                                    break block33;
                                }
                                v1 = "ipmute";
                                break block33;
                            }
                            v1 = "ipban";
                            break block33;
lbl71:
                            // 11 sources

                            v1 = var8_8;
                        }
                        var17_18 = v0.append(v1).toString();
                        var14_14 = new ClearChatCommand(var8_8, var8_8, var11_11, var17_18, var10_10);
                        var15_15 = var10_10;
                        var16_17 = AbstractCommand.AsyncBackgroundTask_5;
                        var18_20 = var14_14.getName();
                        var19_21 = false;
                        var20_22 = var18_20;
                        switch (var20_22.hashCode()) {
                            case -1320563219: {
                                if (var20_22.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var20_22.equals("staffhistory")) {
                                    ** break;
                                }
                                break block34;
                            }
                            case 926934164: {
                                if (!var20_22.equals("history")) {
                                    ** break;
                                }
                                break block35;
                            }
                        }
                        var21_23 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = var21_23;
                        break block36;
                    }
                    var21_23 = new String[]{"hist", "litebans:history"};
                    v2 = var21_23;
                    break block36;
                }
                var21_23 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = var21_23;
                break block36;
lbl104:
                // 4 sources

                var21_23 = new String[]{"litebans:" + var18_20};
                v2 = var21_23;
            }
            var16_17 = v2;
            var18_19 = false;
            var10_10.BaseCoreGenericHandler(new LiteBansModule_352((LiteCommand)var14_14, ((LiteCommand)var14_14).getPermission(), var15_15.BaseCoreGenericHandler, var16_17), var12_12);
        }
    }

    public Object apply(Object object) {
        this.plugin(object);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:"};
    }

    }

