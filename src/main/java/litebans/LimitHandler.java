package litebans;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LimitHandler {
    public static int BaseCoreGenericHandler(@NotNull LiteBansModule_359 jW2, @NotNull PlatformPlugin plugin, @Nullable String[] args, @NotNull Collection collection, int n) {
        if (args == null) {
            return Integer.MAX_VALUE;
        }
        int n2 = LiteBansModule_389.LiteBansModule_31(args, n);
        if (!collection.isEmpty()) {
            n2 = Math.min(n2, collection.size());
        }
        n2 = Math.max(1, n2);
        return n2;
    }

    public static /* synthetic */ int BaseCoreGenericHandler(LiteBansModule_359 jW2, PlatformPlugin plugin, String[] args, Collection collection, int n, int n2, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 8) != 0) {
            n = ((ConfigService)plugin.BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aT();
        }
        return jW2.BaseCoreGenericHandler(plugin, args, collection, n);
    }

    public static void BaseCoreGenericHandler(@NotNull LiteBansModule_359 var0, @NotNull LiteBansModule_82 v1, @NotNull Collection v2, @Nullable LiteBansModule_297 v3, @Nullable String[] arg1, @NotNull AbstractCommand arg2, int arg3) {
        arg4 = arg2;
        arg5 = arg4;
        arg6 = DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)arg5.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class), false, 1, null);
        arg5 = new HashMap<K, V>();
        if (StringUtilities.LiteBansModule_31(var0.BaseCoreGenericHandler()) == false && v3 != null) {
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)arg4, GeoIPLookupService.BaseCoreGenericHandler(GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(v1, var0.BaseCoreGenericHandler(), v3, false, 2, null), (CharSequence)"limit", arg3), (CharSequence)"total", v2.size()));
        }
        for (SilentHandler arg7 : CollectionUtilities.BaseCoreGenericHandler((Iterable)v2, arg3)) {
{
                arg8 = arg7.DatabaseMonitorService();
                v0 = v3;
                if (v0 == null) {
                    v0 = var0.BaseCoreGenericHandler(v1, (HashMap)arg5, arg8);
                }
                if ((arg9 = v0) == null) break;
                arg10 = arg7;
                if (!arg10.LiteBansModule_240()) ** GOTO lbl-1000
                v1 = arg10.PunishmentTableService();
                v2 = v1 != null ? StringUtilities.BaseCoreGenericHandler(v1, '#', false, 2, null) : false;
                if (v2 && !ObjectUtilities.BaseCoreGenericHandler(arg10.DatabaseMonitorService(), arg9.LiteBansModule_31())) {
                } else lbl-1000:
                                {
                }
                if (v3) {
                    arg11 = arg4;
                    arg11 = (ConfigService)arg11.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                    arg12 = 100;
                    if (!arg11.BaseCoreGenericHandler(arg12)) continue;
                    arg13 = arg11;
                    arg13.BaseCoreGenericHandler((Object)("r0 " + arg7));
                    continue;
}
            arg12 = arg8 == null || StringUtilities.BaseCoreGenericHandler(arg8, '#', false, 2, null) != false ? 1 : 0;
            arg14 = arg7.PunishmentTableService();
            if (arg12 != 0 && !arg4.AsyncBackgroundTask_5().LiteBansModule_194()) {
                arg15 = arg4;
                if (((ConfigService)arg15.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aa()) {
                    arg14 = MessageKey.SecHandler.toString();
}
            arg16 = MessageKey.BaseCoreGenericHandler(arg7.ServerSyncService());
            v4 = arg11 = arg12 == 0 ? var0.BaseCoreGenericHandler(v1, (HashMap)arg5, arg8) : new LiteBansModule_297(arg14, null, arg14, new Date(arg7.BroadcastService()));
            if (arg11 == null) {
                arg17 = arg4;
                arg17 = (ConfigService)arg17.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                arg18 = 100;
                if (!arg17.BaseCoreGenericHandler(arg18)) continue;
                arg13 = arg17;
                arg13.BaseCoreGenericHandler((Object)("r2 " + arg7));
                continue;
            }
            arg19 = v1.BaseCoreGenericHandler(arg7);
            if (arg19 && arg7.ServerSyncService() != BanHandler.g) {
                arg20 = arg16;
                arg21 = arg7.HoverTextFormatter() != false ? MessageKey.LiteBansModule_89 : MessageKey.MessageKey;
                arg16 = "" + arg20 + arg21;
            }
            if (ObjectUtilities.BaseCoreGenericHandler((Object)"#expired", (Object)(arg22 = arg7.q())) || !arg19 && arg7.LiteBansModule_31(arg6)) {
                arg23 = arg16;
                arg24 = MessageKey.dm;
                arg16 = "" + arg23 + arg24;
            }
            arg16 = AllHandler_3.BaseCoreGenericHandler(v1, arg16, arg7, (LiteBansModule_297)arg11, false, 4, null);
            arg25 = arg22;
            if (!(arg25 == null || StringUtilities.LiteBansModule_31(arg25) != false) && !StringUtilities.BaseCoreGenericHandler(arg22, '#', false, 2, null)) {
                arg25 = arg4;
                arg22 = ((BroadcastService)arg25.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v1, arg7);
                if (arg22 != null) {
                    switch (LiteBansModule_282.BaseCoreGenericHandler[arg7.ServerSyncService().ordinal()]) {
                        case 1: {
                            v5 = MessageKey.LiteBansModule_93;
                            break;
                        }
                        case 2: {
                            v5 = MessageKey.V;
                            break;
                        }
                        case 3: {
                            v5 = MessageKey.aG;
                            break;
                        }
                        default: {
}
                    arg26 = v5;
                    if (arg26 != null) {
                        arg27 = arg4;
                        arg28 = arg29 = ((DatabaseMonitorService)arg27.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).LiteBansModule_31(true) - arg7.LiteBansModule_194();
                        arg26 = ((MessageKey)arg26).BaseCoreGenericHandler("timeSince", PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg28, false, 2, null));
                        arg26 = AllHandler_3.BaseCoreGenericHandler(v1, GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(v1, arg26, arg22, arg7.AsyncBackgroundTask_21(), false, 4, null), (CharSequence)"displayName", arg22), arg7, (LiteBansModule_297)arg11, false, 4, null);
}
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)arg4, arg16);
            if (arg26 == null) continue;
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)arg4, arg26);
}

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_359 jW2, LiteBansModule_82 ch2, Collection collection, LiteBansModule_297 iA2, String[] args, AbstractCommand abstractCommand, int n, int n2, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            iA2 = null;
        }
        if ((n2 & 4) != 0) {
            args = null;
        }
        if ((n2 & 8) != 0) {
            ObjectUtilities.LiteBansModule_31(jW2, "");
            abstractCommand = (AbstractCommand)(jW2);
        }
        if ((n2 & 0x10) != 0) {
            n = LimitHandler.BaseCoreGenericHandler(jW2, ch2.e(), args, collection, 0, 8, null);
        }
        jW2.BaseCoreGenericHandler(ch2, collection, iA2, args, abstractCommand, n);
    }

    public static LiteBansModule_297 BaseCoreGenericHandler(@NotNull LiteBansModule_359 jW2, @NotNull LiteBansModule_82 ch2, @NotNull HashMap hashMap, @Nullable String string) {
        Map map = hashMap;
        String string2 = string;
        ObjectUtilities.BaseCoreGenericHandler(string2);
        String string3 = string2;
        Object v2 = map.get(string3);
        if (v2 == null) {
            LiteBansModule_297 iA2 = ch2.c(string);
            map.put(string3, iA2);
            targetObj = iA2;
        } else {
            targetObj = v2;
        }
        return (LiteBansModule_297)targetObj;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "limit", "total", "r0 ", "r2 ", "#expired", "timeSince", "displayName", "", ""};
}

