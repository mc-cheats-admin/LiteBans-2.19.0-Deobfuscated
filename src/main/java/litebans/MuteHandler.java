package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MuteHandler {
        private MuteHandler() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, @Nullable String string) {
        ConfigService configService = (ConfigService)plugin.BaseCoreGenericHandler(ConfigService.class);
        if (configService.LiteBansModule_195().GnuSparseMapHandler()) return false;
        List list = configService.LiteBansModule_195().aj();
        String string2 = string;
        if (string2 == null) {
            string2 = configService.LiteBansModule_195().LiteBansModule_25();
        }
        if (list.contains(string2)) return false;
        return true;
    }

    public final String[] BaseCoreGenericHandler(@NotNull ConfigService configService) {
                String[] args = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
        targetObj = args;
        flag = false;
        args = targetObj;
        Collection collection = new ArrayList();
        int n = args.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = args[i];
            if (!configService.e(string2)) continue;
            collection.add(string);
        }
        targetObj = (List)collection;
        flag = false;
        args = targetObj;
        return args.toArray(new String[0]);
    }

    public final void BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, int n) {
        ServerSyncService u2 = (ServerSyncService)plugin.BaseCoreGenericHandler(ServerSyncService.class);
        ((Collection)u2.LiteBansModule_241().LiteBansModule_31()).add((byte)n);
        if (u2.LiteBansModule_241().c().compareAndSet(false, true)) {
            plugin.LiteBansModule_31(u2.LiteBansModule_241());
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(MuteHandler et2, PlatformPlugin plugin, int n, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        et2.BaseCoreGenericHandler(plugin, n);
    }

    public final List BaseCoreGenericHandler(@Nullable LiteCommand v1, @NotNull String v2, @NotNull CommandSenderWrapper v3, @NotNull PlatformPlugin v4, @NotNull String[] v5) {
        try {
            block28: {
                block26: {
                    block29: {
                        block27: {
                            MuteHandler.BaseCoreGenericHandler(this, v4, 0, 2, null);
                            v6 = (ConfigService)v4.BaseCoreGenericHandler(ConfigService.class);
                            v7 = 8;
                            v8 = new ArrayList<String>();
                            v9 = (String)ArrayUtilities.c(v5);
                            v10 = v5;
                            v11 = v5.length;
                            v12 = ((String[])v10).length;
                            for (v13 = 0; v13 < v12; ++v13) {
                                v14 = v15 = v10[v13];
                                if (!StringUtilities.BaseCoreGenericHandler((CharSequence)v14, '-', false, 2, null)) continue;
                                ++v16;
                            }
                            v17 = v16;
                            v18 = v11 - v17;
                            if (v4.AsyncBackgroundTask_22() == 3) {
                                --v18;
                            }
                            if (v18 > 1) break block27;
                            v10 = ArrayHandler.BaseCoreGenericHandler(v4.q());
                            while (v10.hasNext()) {
                                v19 = (CommandSenderWrapper)v10.next();
                                if (!StringUtilities.c(v19.i(), v9, true)) continue;
                                v8.add(v19.i());
                                if (v8.size() < v7) continue;
                                return v8;
                            }
                            if (v6.LiteBansModule_195().NullHandler_8() > 0) {
                                v0 = (String)ArrayUtilities.e(v5);
                                if (v0 == null || (v0 = (v20 = v0).toLowerCase(Locale.ENGLISH)) == null) {
                                    return v8;
                                }
                                v10 = v0;
                                v21 = "";
                                v1 = v16 = StringUtilities.BaseCoreGenericHandler((CharSequence)v10, '.', false, 2, null) != false || StringUtilities.BaseCoreGenericHandler((CharSequence)v10, '*', false, 2, null) != false ? 1 : 0;
                                if (v16 != 0) {
                                    v21 = String.valueOf(StringUtilities.BaseCoreGenericHandler((CharSequence)v10));
                                    v10 = v10.substring(1);
                                }
                                if (StringUtilities.LiteBansModule_31((CharSequence)v10) == false) {
                                    v20 = (ServerSyncService)v4.BaseCoreGenericHandler(ServerSyncService.class);
                                    v15 = v20.LiteBansModule_31(v12 = v20.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler((CharSequence)v10)));
                                    if (v15 == null) {
                                        this.plugin(v4, v12);
                                        return v8;
                                    }
                                    for (Object v22 : (Object)v20.BaseCoreGenericHandler((String)v10)) {
                                        if ((Iterable)v15.BaseCoreGenericHandler().get((int)v22) == null) continue;
                                        v23 = v24;
                                        for (T v25 : v23) {
                                            block25: {
                                                v26 = (String)v25;
                                                if (!StringUtilities.LiteBansModule_31(v26, (String)v10, false, 2, null)) continue;
                                                v27 = v8;
                                                if (v27 instanceof Collection && ((Collection)v27).isEmpty()) {
                                                    v2 = true;
                                                } else {
                                                    for (T v28 : v27) {
                                                        v29 = (String)v28;
                                                        if (!StringUtilities.BaseCoreGenericHandler(v29, v26, true)) continue;
                                                        v2 = false;
                                                        break block25;
                                                    }
                                                    v2 = true;
                                                }
                                            }
                                            if (!v2) continue;
                                            v8.add(v21 + v26);
                                            if (v8.size() < v7) continue;
                                            return v8;
                                        }
                                    }
                                }
                            }
                            break block28;
                        }
                        if (!StringUtilities.LiteBansModule_31(v9, "server:", false, 2, null)) break block29;
                        v10 = StringUtilities.BaseCoreGenericHandler(v9, "server:", null, 2, null);
                        MuteHandler.BaseCoreGenericHandler(this, v4, (String)v10, v8, 0, 8, null);
                        break block28;
                    }
                    if (v18 != 2 || StringUtilities.LiteBansModule_31(v2, "un", false, 2, null)) break block28;
                    v30 = BanHandler.values();
                    v12 = ((BanHandler[])v30).length;
                    for (v13 = 0; v13 < v12; ++v13) {
                        v14 = v15 = v30[v13];
                        v31   = v2;
                        if (StringUtilities.LiteBansModule_31(v31  , ((Enum)v14).toString(), false, 2, null)) ** GOTO lbl-1000
                        v31   = v2;
                        if (StringUtilities.BaseCoreGenericHandler(v31  , ((Enum)v14).toString(), false, 2, null)) ** GOTO lbl-1000
                        if (StringUtilities.BaseCoreGenericHandler(v2, "ip", false, 2, null)) {
                            v31   = (CharSequence)v14;
                            v32 = "ip";
                            ** if (!StringUtilities.LiteBansModule_31((CharSequence)((CharSequence)v2), (CharSequence)((CharSequence)(v31   + v32)), (boolean)false, (int)2, null)) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                                                {
                            v3 = true;
                            ** GOTO lbl106
                        }
lbl-1000:
                                                {
                            v3 = false;
                        }
                                                if (!v3) continue;
                        v4 = v15;
                        break block26;
                    }
                    v4 = v10 = null;
                }
                if (v10 != null) {
                    v30 = v6.AsyncBackgroundTask_21().AsyncBackgroundTask_5();
                    v33 = v30;
                    v15 = new ArrayList<PunishmentService>();
                    v34 = v33.iterator();
                    while (v34.hasNext()) {
                        v31   = v34.next();
                        v35 = (LiteBansModule_65)v31  ;
                        if (!(v35.AsyncBackgroundTask_5() == v10)) continue;
                        v15.add(v31  );
                    }
                    v36 = (List)v15;
                    for (LiteBansModule_65 v37 : v36) {
                        if (!StringUtilities.c(v37.g(), v9, true)) continue;
                        if (v8.size() >= v7) {
                            return v8;
                        }
                        v33 = v37.LiteBansModule_241().c();
                        if (v33 != null) {
                            v15 = v3;
                            v34 = v15;
                            if (v34.e((String)v33) == false) continue;
                        }
                        v8.add(v37.g());
                    }
                }
            }
            v10 = v6;
            if (v10.g()) {
                v38 = v10;
                v39 = v8;
                v15 = v39;
                v38.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler((CharSequence)v2, (CharSequence)Arrays.toString(v15.toArray(new String[0]))));
            }
            return v8;
        }
        catch (LiteBansException_4 v40) {
            return CollectionUtilities.e();
        }
    }

    private final void BaseCoreGenericHandler(PlatformPlugin plugin, String string, ArrayList arrayList, int n) {
        LiteBansModule_15 aK2;
        String string2;
        DatabaseMonitorService w2 = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Object targetObj = new String[]{"global", "local"};
        String[] args = targetObj;
        targetObj = plugin.i().BaseCoreGenericHandler();
        Collection collection = w2.e().values();
        HashSet hashSet = new HashSet();
        for (String string3 : args) {
            if (this.plugin(string3, string, hashSet, n)) break;
        }
        Iterator<Object> iterator = targetObj.iterator();
        while (iterator.hasNext() && !this.plugin(string2 = (String)iterator.next(), string, hashSet, n)) {
        }
        iterator = collection.iterator();
        while (iterator.hasNext() && !this.plugin((aK2 = (LiteBansModule_15)iterator.next()).e(), string, hashSet, n)) {
        }
        arrayList.addAll(hashSet);
    }

    static /* synthetic */ void BaseCoreGenericHandler(MuteHandler et2, PlatformPlugin plugin, String string, ArrayList arrayList, int n, int n2, Object targetObj) {
        if ((n2 & 8) != 0) {
            n = 5;
        }
        et2.BaseCoreGenericHandler(plugin, string, arrayList, n);
    }

    private final boolean BaseCoreGenericHandler(String string, String string2, HashSet hashSet, int n) {
        if (string == null) {
            return false;
        }
        if (StringUtilities.LiteBansModule_31((CharSequence)string2) || StringUtilities.c(string, string2, true)) {
            hashSet.add("server:" + string);
        }
        return hashSet.size() >= n;
    }

    public /* synthetic */ MuteHandler(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "sort", "00", "01:", "mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip", "", "server:", "server:", "un", "ip", "ip", "global", "local", "server:"};
    }

    static {
        MuteHandler.BaseCoreGenericHandler();
    }
}

