package litebans;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public final class LitebansNotifyHandler {
    private final NoneHandler_2 BaseCoreGenericHandler;
        public LitebansNotifyHandler(@NotNull NoneHandler_2 cz2) {
        this.plugin = cz2;
    }

    public final void BaseCoreGenericHandler(@NotNull String[] v1, boolean v2, boolean v3) {
        v4 = this.plugin;
        v5 = v1.length;
        block23: for (v6 = 0; v6 < v5; ++v6) {
            block53: {
                block61: {
                    block63: {
                        block57: {
                            block62: {
                                block58: {
                                    block59: {
                                        block56: {
                                            block60: {
                                                block54: {
                                                    block55: {
                                                        v7 = v8 = v1[v6];
                                                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)v7, '-', false, 2, null) || v7.length() <= 1 || v9) break block53;
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)v7, (Object)"--")) {
                                                            continue;
                                                        }
                                                        v10   = new char[]{'-'};
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)(v7 = StringUtilities.BaseCoreGenericHandler(v7, v10  )), (Object)"AsyncBackgroundTask_21") || ObjectUtilities.BaseCoreGenericHandler((Object)v7, (Object)"AsyncBackgroundTask_21:true") || ObjectUtilities.BaseCoreGenericHandler((Object)v7, (Object)("AsyncBackgroundTask_21:" + MessageKey.ap))) {
                                                            if (!v3) {
                                                                block52: {
                                                                    v10   = (char[])v4.BaseCoreGenericHandler();
                                                                    v11 = new String[]{"litebans.notify", "litebans.notify.silent"};
                                                                    v12 = v11;
                                                                    for (String v13 : v12) {
                                                                        v14 = v13;
                                                                        if (!v10  .e((String)v14)) continue;
                                                                        v0 = true;
                                                                        break block52;
                                                                    }
                                                                    v0 = false;
                                                                }
                                                                if (!v0) continue;
                                                            }
                                                            v4.Utf8Handler_2(true);
                                                            continue;
                                                        }
                                                        if (ObjectUtilities.BaseCoreGenericHandler((Object)v7, (Object)"AsyncBackgroundTask_21:false") || ObjectUtilities.BaseCoreGenericHandler((Object)v7, (Object)("AsyncBackgroundTask_21:" + MessageKey.OutHandler))) {
                                                            v4.Utf8Handler_2(false);
                                                            v4.LiteBansModule_241(false);
                                                            continue;
                                                        }
                                                        if (!StringUtilities.LiteBansModule_31(v7, "sender", false, 2, null) && !StringUtilities.LiteBansModule_31(v7, "server-origin", false, 2, null)) break block54;
                                                        if (v3) break block55;
                                                        v10   = v4.BaseCoreGenericHandler();
                                                        v15 = "litebans.admin";
                                                        if (!v10  .e(v15)) break block54;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(v7, "sender=", false, 2, null)) {
                                                        v4.c(v7.substring(7));
                                                        v4.i(true);
                                                        continue;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(v7, "sender-name=", false, 2, null)) {
                                                        v4.c(v7.substring(12));
                                                        v4.i(true);
                                                        continue;
                                                    }
                                                    if (StringUtilities.LiteBansModule_31(v7, "sender-uuid=", false, 2, null)) {
                                                        v4.BaseCoreGenericHandler(LiteBansModule_346.LiteBansModule_195(v7.substring(12)));
                                                        v4.i(true);
                                                        continue;
                                                    }
                                                    if (!StringUtilities.LiteBansModule_31(v7, "server-origin=", false, 2, null)) continue;
                                                    v4.e(v7.substring(14));
                                                    continue;
                                                }
                                                if (StringUtilities.LiteBansModule_31(v7, "stack=", false, 2, null)) {
                                                    v4.BaseCoreGenericHandler(Byte.parseByte(StringUtilities.BaseCoreGenericHandler(v7, "stack=", null, 2, null)));
                                                    if (v4.r() <= 32) continue;
                                                    MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.LiteBansModule_435);
                                                    throw new CommandExitException();
                                                }
                                                v10   = v7;
                                                switch (v10  .hashCode()) {
                                                    case 951117504: {
                                                        if (!v10  .equals("confirm")) {
                                                            break;
                                                        }
                                                        break block56;
                                                    }
                                                    case -1068795718: {
                                                        if (v10  .equals("modify")) break;
                                                        break;
                                                    }
                                                    case 3202370: {
                                                        if (!v10  .equals("hide")) {
                                                            break;
                                                        }
                                                        break block57;
                                                    }
                                                    case 3532159: {
                                                        if (!v10  .equals("skip")) {
                                                            break;
                                                        }
                                                        break block58;
                                                    }
                                                    case -439474683: {
                                                        if (!v10  .equals("no-queue")) {
                                                            break;
                                                        }
                                                        break block59;
                                                    }
                                                    case -1335458389: {
                                                        if (!v10  .equals("delete")) {
                                                            break;
                                                        }
                                                        break block60;
                                                    }
                                                }
                                                v4.LiteBansModule_31(true);
                                                break block61;
                                            }
                                            v4.g(true);
                                            break block61;
                                        }
                                        v4.e(true);
                                        break block61;
                                    }
                                    v4.AsyncBackgroundTask_5(true);
                                    break block61;
                                }
                                if (v3) break block62;
                                v16 = v4.BaseCoreGenericHandler();
                                v17 = "litebans.admin";
                                if (!v16.e(v17)) break block61;
                            }
                            v4.c(true);
                            break block61;
                        }
                        if (v3) break block63;
                        v18 = v4.BaseCoreGenericHandler();
                        v19 = "litebans.admin";
                        if (!v18.e(v19)) break block61;
                    }
                    v4.GnuSparseMapHandler(true);
                    break block61;
                }
                if (v20) continue;
                v10   = v7.toCharArray();
                v21 = v10  .length;
                block25: for (v22 = 0; v22 < v21; ++v22) {
                    v23 = v10  [v22];
                    switch (v23) {
                        case 'BanHandler_5': 
                        case 'PlayerQuitListener': 
                        case 'LiteBansModule_432': 
                        case 'S': 
                        case 'T': 
                        case 'U': 
                        case 'W': 
                        case 'AsyncBackgroundTask_5': 
                        case 'm': 
                        case 'PunishmentTableService': {
                            continue block25;
                        }
                        default: {
                            if (!v2) continue block23;
                            ((Collection)v4.A()).add(v8);
                            continue block23;
                        }
                    }
                }
                v24   = v10  ;
                v25 = v24  .length;
                block26: for (v26 = 0; v26 < v25; ++v26) {
                    v27 = v28 = v24  [v26];
                    switch (v27) {
                        case 77: {
                            v4.BaseCoreGenericHandler(BanHandler.GnuSparseMapHandler);
                            continue block26;
                        }
                        case 87: {
                            v4.BaseCoreGenericHandler(BanHandler.c);
                            v4.LiteBansModule_403(false);
                            continue block26;
                        }
                        case 84: {
                            v4.LiteBansModule_403(true);
                            continue block26;
                        }
                        case 73: {
                            v4.m(true);
                            continue block26;
                        }
                        case 85: {
                            v4.BanHandler_4();
                            continue block26;
                        }
                        case 83: {
                            if (!v3) {
                                v14 = v4.BaseCoreGenericHandler();
                                v29 = "litebans.extrasilent";
                                if (!v14.e(v29)) continue block26;
                            }
                            v4.Utf8Handler_2(true);
                            v4.LiteBansModule_241(true);
                            continue block26;
                        }
                        case 78: {
                            v4.LiteBansModule_195(true);
                            continue block26;
                        }
                        case 112: {
                            if (!v3) {
                                v14 = v4.BaseCoreGenericHandler();
                                v29 = "litebans.public";
                                if (!v14.e(v29)) continue block26;
                            }
                            v4.Utf8Handler_2(false);
                            v4.LiteBansModule_241(false);
                            continue block26;
                        }
                        case 109: {
                            v4.LiteBansModule_31(true);
                            continue block26;
                        }
                        case 100: {
                            v4.g(true);
                            continue block26;
                        }
                    }
                }
                continue;
            }
            if (!v2) continue;
            ((Collection)v4.A()).add(v8);
        }
        if (v4.F()) {
            v4.BanHandler_4();
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LitebansNotifyHandler bL2, String[] args, boolean flag, boolean flag2, int n, Object targetObj) {
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

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"--", "AsyncBackgroundTask_21", "AsyncBackgroundTask_21:true", "AsyncBackgroundTask_21:", "litebans.notify", "litebans.notify.silent", "AsyncBackgroundTask_21:false", "AsyncBackgroundTask_21:", "sender", "server-origin", "litebans.admin", "sender=", "sender-name=", "sender-uuid=", "server-origin=", "stack=", "stack=", "confirm", "modify", "hide", "skip", "no-queue", "delete", "litebans.admin", "litebans.admin", "litebans.extrasilent", "litebans.public"};
    }

    static {
        LitebansNotifyHandler.BaseCoreGenericHandler();
    }
}

