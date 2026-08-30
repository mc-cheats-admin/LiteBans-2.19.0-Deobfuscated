package litebans;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public final class LitebansNotifyHandler {
    private final NoneHandler_2 BaseCoreGenericHandler;
    public LitebansNotifyHandler(@NotNull NoneHandler_2 cz2) {
        this.plugin = cz2;
    }

    public final void BaseCoreGenericHandler(@NotNull String[] v1, boolean v2, boolean v3) {
        arg1 = this.plugin;
        arg2 = v1.length;
for (arg3 = 0; arg3 < arg2; ++arg3) {
{
                                                        arg4 = arg5 = v1[arg3];
                                                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)arg4, '-', false, 2, null) || arg4.length() <= 1 || arg6) break;
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)arg4, (Object)"--")) {
                                                            continue;
                                                        }
                                                        arg7   = new char[]{'-'};
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)(arg4 = StringUtilities.BaseCoreGenericHandler(arg4, arg7  )), (Object)"AsyncBackgroundTask_21") || ObjectUtilities.BaseCoreGenericHandler((Object)arg4, (Object)"AsyncBackgroundTask_21:true") || ObjectUtilities.BaseCoreGenericHandler((Object)arg4, (Object)("AsyncBackgroundTask_21:" + MessageKey.ap))) {
                                                            if (!v3) {
{
                                                                    arg7   = (char[])arg1.BaseCoreGenericHandler();
                                                                    arg8 = new String[]{"litebans.notify", "litebans.notify.silent"};
                                                                    arg9 = arg8;
                                                                    for (String arg10 : arg9) {
                                                                        arg11 = arg10;
                                                                        if (!arg7  .e((String)arg11)) continue;
                                                                        break;
}
                                                                if (!v0) continue;
                                                            }
                                                            arg1.Utf8Handler_2(true);
                                                            continue;
                                                        }
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)arg4, (Object)"AsyncBackgroundTask_21:false") || ObjectUtilities.BaseCoreGenericHandler((Object)arg4, (Object)("AsyncBackgroundTask_21:" + MessageKey.OutHandler))) {
                                                            arg1.Utf8Handler_2(false);
                                                            arg1.LiteBansModule_240(false);
                                                            continue;
                                                        }
                                                        if (!StringUtilities.LiteBansModule_31(arg4, "sender", false, 2, null) && !StringUtilities.LiteBansModule_31(arg4, "server-origin", false, 2, null)) break;
                                                        if (v3) break;
                                                        arg7   = arg1.BaseCoreGenericHandler();
                                                        arg12 = "litebans.admin";
                                                        if (!arg7  .e(arg12)) break;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(arg4, "sender=", false, 2, null)) {
                                                        arg1.c(arg4.substring(7));
                                                        arg1.i(true);
                                                        continue;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(arg4, "sender-name=", false, 2, null)) {
                                                        arg1.c(arg4.substring(12));
                                                        arg1.i(true);
                                                        continue;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(arg4, "sender-uuid=", false, 2, null)) {
                                                        arg1.BaseCoreGenericHandler(HexEncodingHelper.LiteBansModule_194(arg4.substring(12)));
                                                        arg1.i(true);
                                                        continue;
                                                    }
                                                    if (!StringUtilities.LiteBansModule_31(arg4, "server-origin=", false, 2, null)) continue;
                                                    arg1.e(arg4.substring(14));
                                                    continue;
                                                }
                                                if (StringUtilities.LiteBansModule_31(arg4, "stack=", false, 2, null)) {
                                                    arg1.BaseCoreGenericHandler(Byte.parseByte(StringUtilities.BaseCoreGenericHandler(arg4, "stack=", null, 2, null)));
                                                    if (arg1.r() <= 32) continue;
                                                    MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.LiteBansModule_433);
                                                    throw new CommandExitException();
                                                }
                                                arg7   = arg4;
                                                switch (arg7  .hashCode()) {
                                                    case 951117504: {
                                                        if (!arg7  .equals("confirm")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -1068795718: {
                                                        if (arg7  .equals("modify")) break;
                                                        break;
                                                    }
                                                    case 3202370: {
                                                        if (!arg7  .equals("hide")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 3532159: {
                                                        if (!arg7  .equals("skip")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -439474683: {
                                                        if (!arg7  .equals("no-queue")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -1335458389: {
                                                        if (!arg7  .equals("delete")) {
                                                            break;
                                                        }
                                                        break;
}
                                                arg1.LiteBansModule_31(true);
                                                break;
                                            }
                                            arg1.g(true);
                                            break;
                                        }
                                        arg1.e(true);
                                        break;
                                    }
                                    arg1.AsyncBackgroundTask_5(true);
                                    break;
                                }
                                if (v3) break;
                                arg13 = arg1.BaseCoreGenericHandler();
                                arg14 = "litebans.admin";
                                if (!arg13.e(arg14)) break;
                            }
                            arg1.c(true);
                            break;
                        }
                        if (v3) break;
                        arg15 = arg1.BaseCoreGenericHandler();
                        arg16 = "litebans.admin";
                        if (!arg15.e(arg16)) break;
                    }
                    arg1.GnuSparseMapHandler(true);
                    break;
                }
                if (arg17) continue;
                arg7   = arg4.toCharArray();
                arg18 = arg7  .length;
for (arg19 = 0; arg19 < arg18; ++arg19) {
                    arg20 = arg7  [arg19];
                    switch (arg20) {
                        case 'BanHandler_5':
                        case 'PlayerQuitListener':
                        case 'LiteBansModule_430':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'W':
                        case 'AsyncBackgroundTask_5':
                        case 'm':
                        case 'PunishmentTableService': {
                            continue;
                        }
                        default: {
                            if (!v2) continue;
                            ((Collection)arg1.A()).add(arg5);
                            continue;
}
                arg21   = arg7  ;
                arg22 = arg21  .length;
for (arg23 = 0; arg23 < arg22; ++arg23) {
                    arg24 = arg25 = arg21  [arg23];
                    switch (arg24) {
                        case 77: {
                            arg1.BaseCoreGenericHandler(BanHandler.GnuSparseMapHandler);
                            continue;
                        }
                        case 87: {
                            arg1.BaseCoreGenericHandler(BanHandler.c);
                            arg1.LiteBansModule_401(false);
                            continue;
                        }
                        case 84: {
                            arg1.LiteBansModule_401(true);
                            continue;
                        }
                        case 73: {
                            arg1.m(true);
                            continue;
                        }
                        case 85: {
                            arg1.BanHandler_4();
                            continue;
                        }
                        case 83: {
                            if (!v3) {
                                arg11 = arg1.BaseCoreGenericHandler();
                                arg26 = "litebans.extrasilent";
                                if (!arg11.e(arg26)) continue;
                            }
                            arg1.Utf8Handler_2(true);
                            arg1.LiteBansModule_240(true);
                            continue;
                        }
                        case 78: {
                            arg1.LiteBansModule_194(true);
                            continue;
                        }
                        case 112: {
                            if (!v3) {
                                arg11 = arg1.BaseCoreGenericHandler();
                                arg26 = "litebans.public";
                                if (!arg11.e(arg26)) continue;
                            }
                            arg1.Utf8Handler_2(false);
                            arg1.LiteBansModule_240(false);
                            continue;
                        }
                        case 109: {
                            arg1.LiteBansModule_31(true);
                            continue;
                        }
                        case 100: {
                            arg1.g(true);
                            continue;
}
                continue;
            }
            if (!v2) continue;
            ((Collection)arg1.A()).add(arg5);
        }
        if (arg1.F()) {
            arg1.BanHandler_4();
}

    public static /* synthetic */ void BaseCoreGenericHandler(LitebansNotifyHandler bL2, String[] args, boolean flag, boolean flag2, int n, Object object) {
        if ((n & 1) != 0) {
            args = bL2.BaseCoreGenericHandler.z();
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        if ((n & 4) != 0) {
            flag2 = false;
        }
        bL2.BaseCoreGenericHandler(args, flag, flag2);
    }

    public final boolean BaseCoreGenericHandler(@NotNull String string) {
        return StringUtilities.BaseCoreGenericHandler((CharSequence)string, '*', false, 2, null) && !StringUtilities.LiteBansModule_31((CharSequence)string, '*', false, 2, null) && string.length() > 3 && !StringUtilities.c((CharSequence)string, '.', false, 2, null) && !StringUtilities.c((CharSequence)string, ':', false, 2, null);
}

