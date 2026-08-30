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
        arg1 = v2.length;
        for (arg2 = 0; arg2 < arg1; ++arg2) {
{
                                            arg3 = arg4 = v2[arg2];
                                            arg5 = v3;
                                            ObjectUtilities.LiteBansModule_31(v1, "");
                                            arg6 = (CommandDispatcher)v1;
                                            v0 = new StringBuilder().append("litebans + ");
                                            arg7 = AbstractCommand.AsyncBackgroundTask_5;
                                            arg8 = arg3;
                                            switch (arg8.hashCode()) {
                                                case -1396405339: {
                                                    if (!arg8.equals("ban-ip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 111426262: {
                                                    if (arg8.equals("unban")) break;
                                                    break;
                                                }
                                                case -840127329: {
                                                    if (!arg8.equals("unwarn")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1972486690: {
                                                    if (!arg8.equals("tempbanip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 93503862: {
                                                    if (!arg8.equals("banip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1062781696: {
                                                    if (!arg8.equals("muteip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -840405966: {
                                                    if (!arg8.equals("unmute")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1351111124: {
                                                    if (!arg8.equals("tempmuteip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1231784084: {
                                                    if (!arg8.equals("tempipmute")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1979386420: {
                                                    if (!arg8.equals("tempipban")) {
                                                        break;
                                                    }
                                                    break;
}
                                            v1 = "unban.own";
                                            break;
                                        }
                                        v1 = "unmute.own";
                                        break;
                                    }
                                    v1 = "unwarn.own";
                                    break;
                                }
                                v1 = "ipmute";
                                break;
                            }
                            v1 = "ipban";
                            break;
                                                        v1 = arg3;
                        }
                        arg9 = v0.append(v1).toString();
                        arg7 = new ClearChatCommand(arg3, arg3, arg10, arg9, arg5);
                        arg11 = arg5;
                        arg8 = AbstractCommand.AsyncBackgroundTask_5;
                        arg12 = arg7.getName();
                        arg13 = arg12;
                        switch (arg13.hashCode()) {
                            case -1320563219: {
                                if (arg13.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!arg13.equals("staffhistory")) {
                                    break;
                                }
                                break;
                            }
                            case 926934164: {
                                if (!arg13.equals("history")) {
                                    break;
                                }
                                break;
}
                        arg14 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = arg14;
                        break;
                    }
                    arg14 = new String[]{"hist", "litebans:history"};
                    v2 = arg14;
                    break;
                }
                arg14 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = arg14;
                break;
                                arg14 = new String[]{"litebans:" + arg12};
                v2 = arg14;
            }
            arg8 = v2;
            arg5.BaseCoreGenericHandler(new LiteBansModule_352((LiteCommand)arg7, ((LiteCommand)arg7).getPermission(), arg11.BaseCoreGenericHandler, arg8), arg6);
}

    public Object apply(Object object) {
        this.plugin(object);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:"};
}

