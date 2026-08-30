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
        v4 = v2.length;
        for (v5 = 0; v5 < v4; ++v5) {
            block36: {
                block34: {
                    block35: {
                        block33: {
                            block29: {
                                block31: {
                                    block30: {
                                        block32: {
                                            v6 = v7 = v2[v5];
                                            v8 = v3;
                                            ObjectUtilities.LiteBansModule_31(v1, "");
                                            v9 = (CommandDispatcher)v1;
                                            v0 = new StringBuilder().append("litebans + ");
                                            v10 = AbstractCommand.AsyncBackgroundTask_5;
                                            v11 = v6;
                                            switch (v11.hashCode()) {
                                                case -1396405339: {
                                                    if (!v11.equals("ban-ip")) {
                                                        break;
                                                    }
                                                    break block29;
                                                }
                                                case 111426262: {
                                                    if (v11.equals("unban")) break;
                                                    break;
                                                }
                                                case -840127329: {
                                                    if (!v11.equals("unwarn")) {
                                                        break;
                                                    }
                                                    break block30;
                                                }
                                                case 1972486690: {
                                                    if (!v11.equals("tempbanip")) {
                                                        break;
                                                    }
                                                    break block29;
                                                }
                                                case 93503862: {
                                                    if (!v11.equals("banip")) {
                                                        break;
                                                    }
                                                    break block29;
                                                }
                                                case -1062781696: {
                                                    if (!v11.equals("muteip")) {
                                                        break;
                                                    }
                                                    break block31;
                                                }
                                                case -840405966: {
                                                    if (!v11.equals("unmute")) {
                                                        break;
                                                    }
                                                    break block32;
                                                }
                                                case 1351111124: {
                                                    if (!v11.equals("tempmuteip")) {
                                                        break;
                                                    }
                                                    break block31;
                                                }
                                                case 1231784084: {
                                                    if (!v11.equals("tempipmute")) {
                                                        break;
                                                    }
                                                    break block31;
                                                }
                                                case 1979386420: {
                                                    if (!v11.equals("tempipban")) {
                                                        break;
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
                                                        v1 = v6;
                        }
                        v12 = v0.append(v1).toString();
                        v10 = new ClearChatCommand(v6, v6, v13, v12, v8);
                        v14 = v8;
                        v11 = AbstractCommand.AsyncBackgroundTask_5;
                        v15 = v10.getName();
                        v16 = v15;
                        switch (v16.hashCode()) {
                            case -1320563219: {
                                if (v16.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!v16.equals("staffhistory")) {
                                    break;
                                }
                                break block34;
                            }
                            case 926934164: {
                                if (!v16.equals("history")) {
                                    break;
                                }
                                break block35;
                            }
                        }
                        v17 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = v17;
                        break block36;
                    }
                    v17 = new String[]{"hist", "litebans:history"};
                    v2 = v17;
                    break block36;
                }
                v17 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = v17;
                break block36;
                                v17 = new String[]{"litebans:" + v15};
                v2 = v17;
            }
            v11 = v2;
            v8.BaseCoreGenericHandler(new LiteBansModule_354((LiteCommand)v10, ((LiteCommand)v10).getPermission(), v14.BaseCoreGenericHandler, v11), v9);
        }
    }

    public Object apply(Object targetObj) {
        this.plugin(targetObj);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:"};
    }

    static {
        UnbanHandler.BaseCoreGenericHandler();
    }
}

