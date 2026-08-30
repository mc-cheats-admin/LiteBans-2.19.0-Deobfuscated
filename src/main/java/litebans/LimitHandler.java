package litebans;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LimitHandler {
        public static int BaseCoreGenericHandler(@NotNull LiteBansModule_361 jW2, @NotNull PlatformPlugin plugin, @Nullable String[] args, @NotNull Collection collection, int n) {
        if (args == null) {
            return Integer.MAX_VALUE;
        }
        int n2 = LiteBansModule_391.LiteBansModule_31(args, n);
        if (!collection.isEmpty()) {
            n2 = Math.min(n2, collection.size());
        }
        n2 = Math.max(1, n2);
        return n2;
    }

    public static /* synthetic */ int BaseCoreGenericHandler(LiteBansModule_361 jW2, PlatformPlugin plugin, String[] args, Collection collection, int n, int n2, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 8) != 0) {
            n = ((ConfigService)plugin.BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().aT();
        }
        return jW2.BaseCoreGenericHandler(plugin, args, collection, n);
    }

    public static void BaseCoreGenericHandler(@NotNull LiteBansModule_361 var0, @NotNull LiteBansModule_83 v1, @NotNull Collection v2, @Nullable LiteBansModule_298 v3, @Nullable String[] v4, @NotNull AbstractCommand v5, int v6) {
        v7 = v5;
        v8 = v7;
        v9 = DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)v8.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class), false, 1, null);
        v8 = new HashMap<K, V>();
        if (StringUtilities.LiteBansModule_31(var0.BaseCoreGenericHandler()) == false && v3 != null) {
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)v7, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(v1, var0.BaseCoreGenericHandler(), v3, false, 2, null), (CharSequence)"limit", v6), (CharSequence)"total", v2.size()));
        }
        for (SilentHandler v10 : CollectionUtilities.BaseCoreGenericHandler((Iterable)v2, v6)) {
            block19: {
                v11 = v10.DatabaseMonitorService();
                v0 = v3;
                if (v0 == null) {
                    v0 = var0.BaseCoreGenericHandler(v1, (HashMap)v8, v11);
                }
                if ((v12 = v0) == null) break block19;
                v13 = v10;
                if (!v13.LiteBansModule_241()) ** GOTO lbl-1000
                v1 = v13.PunishmentTableService();
                v2 = v1 != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)v1, '#', false, 2, null) : false;
                if (v2 && !ObjectUtilities.BaseCoreGenericHandler((Object)v13.DatabaseMonitorService(), (Object)v12.LiteBansModule_31())) {
                    v3 = true;
                } else lbl-1000:
                                {
                    v3 = false;
                }
                if (v3) {
                    v14 = v7;
                    v14 = (ConfigService)v14.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                    v15 = 100;
                    if (!v14.BaseCoreGenericHandler(v15)) continue;
                    v16 = v14;
                    v16.BaseCoreGenericHandler((Object)("r0 " + v10));
                    continue;
                }
            }
            v15 = v11 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)v11, '#', false, 2, null) != false ? 1 : 0;
            v17 = v10.PunishmentTableService();
            if (v15 != 0 && !v7.AsyncBackgroundTask_5().LiteBansModule_195()) {
                v18 = v7;
                if (((ConfigService)v18.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().aa()) {
                    v17 = MessageKey.SecHandler.toString();
                }
            }
            v19 = MessageKey.BaseCoreGenericHandler(v10.ServerSyncService());
            v4 = v14 = v15 == 0 ? var0.BaseCoreGenericHandler(v1, (HashMap)v8, v11) : new LiteBansModule_298(v17, null, v17, new Date(v10.BroadcastService()));
            if (v14 == null) {
                v20 = v7;
                v20 = (ConfigService)v20.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
                v21 = 100;
                if (!v20.BaseCoreGenericHandler(v21)) continue;
                v16 = v20;
                v16.BaseCoreGenericHandler((Object)("r2 " + v10));
                continue;
            }
            v22 = v1.BaseCoreGenericHandler(v10);
            if (v22 && v10.ServerSyncService() != BanHandler.g) {
                v23 = v19;
                v24 = v10.HoverTextFormatter() != false ? MessageKey.LiteBansModule_90 : MessageKey.MessageKey;
                v19 = "" + v23 + v24;
            }
            if (ObjectUtilities.BaseCoreGenericHandler((Object)"#expired", (Object)(v25 = v10.q())) || !v22 && v10.LiteBansModule_31(v9)) {
                v26 = v19;
                v27 = MessageKey.dm;
                v19 = "" + v26 + v27;
            }
            v19 = AllHandler_3.BaseCoreGenericHandler(v1, v19, v10, (LiteBansModule_298)v14, false, 4, null);
            v28 = v25;
            if (!(v28 == null || StringUtilities.LiteBansModule_31((CharSequence)v28) != false) && !StringUtilities.BaseCoreGenericHandler((CharSequence)v25, '#', false, 2, null)) {
                v28 = v7;
                v25 = ((BroadcastService)v28.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v1, v10);
                if (v25 != null) {
                    switch (LiteBansModule_283.BaseCoreGenericHandler[v10.ServerSyncService().ordinal()]) {
                        case 1: {
                            v5 = MessageKey.LiteBansModule_94;
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
                            v5 = null;
                        }
                    }
                    v29 = v5;
                    if (v29 != null) {
                        v30 = v7;
                        v31 = v32 = ((DatabaseMonitorService)v30.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).LiteBansModule_31(true) - v10.LiteBansModule_195();
                        v29 = ((MessageKey)v29).BaseCoreGenericHandler("timeSince", (Object)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v31, false, 2, null));
                        v29 = AllHandler_3.BaseCoreGenericHandler(v1, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(v1, v29, v25, v10.AsyncBackgroundTask_21(), false, 4, null), (CharSequence)"displayName", (Object)v25), v10, (LiteBansModule_298)v14, false, 4, null);
                    }
                }
            }
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)v7, v19);
            if (v29 == null) continue;
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)v7, v29);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_361 jW2, LiteBansModule_83 ch2, Collection collection, LiteBansModule_298 iA2, String[] args, AbstractCommand abstractCommand, int n, int n2, Object targetObj) {
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
            abstractCommand = (AbstractCommand)((Object)jW2);
        }
        if ((n2 & 0x10) != 0) {
            n = LimitHandler.BaseCoreGenericHandler(jW2, ch2.e(), args, collection, 0, 8, null);
        }
        jW2.BaseCoreGenericHandler(ch2, collection, iA2, args, abstractCommand, n);
    }

    public static LiteBansModule_298 BaseCoreGenericHandler(@NotNull LiteBansModule_361 jW2, @NotNull LiteBansModule_83 ch2, @NotNull HashMap hashMap, @Nullable String string) {
        Map map = hashMap;
        String string2 = string;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        String string3 = string2;
        Object v2 = map.get(string3);
        if (v2 == null) {
            LiteBansModule_298 iA2 = ch2.c(string);
            map.put(string3, iA2);
            targetObj = iA2;
        } else {
            targetObj = v2;
        }
        return (LiteBansModule_298)targetObj;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "limit", "total", "r0 ", "r2 ", "#expired", "timeSince", "displayName", "", ""};
    }

    static {
        LimitHandler.BaseCoreGenericHandler();
    }
}

