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
        if (configService.LiteBansModule_194().GnuSparseMapHandler()) return false;
        List list = configService.LiteBansModule_194().aj();
        String string2 = string;
        if (string2 == null) {
            string2 = configService.LiteBansModule_194().LiteBansModule_25();
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
        ((Collection)u2.LiteBansModule_240().LiteBansModule_31()).add((byte)n);
        if (u2.LiteBansModule_240().c().compareAndSet(false, true)) {
            plugin.LiteBansModule_31(u2.LiteBansModule_240());
}

    public static /* synthetic */ void BaseCoreGenericHandler(MuteHandler et2, PlatformPlugin plugin, int n, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        et2.BaseCoreGenericHandler(plugin, n);
    }

    public final List BaseCoreGenericHandler(@Nullable LiteCommand v1, @NotNull String v2, @NotNull CommandSenderWrapper v3, @NotNull PlatformPlugin arg1, @NotNull String[] arg2) {
        try {
{
                            MuteHandler.BaseCoreGenericHandler(this, arg1, 0, 2, null);
                            arg3 = (ConfigService)arg1.BaseCoreGenericHandler(ConfigService.class);
                            arg4 = 8;
                            arg5 = new ArrayList<String>();
                            arg6 = (String)ArrayUtilities.c(arg2);
                            arg7 = arg2;
                            arg8 = arg2.length;
                            arg9 = ((String[])arg7).length;
                            for (arg10 = 0; arg10 < arg9; ++arg10) {
                                arg11 = arg12 = arg7[arg10];
                                if (!StringUtilities.BaseCoreGenericHandler(arg11, '-', false, 2, null)) continue;
                                ++arg13;
                            }
                            arg14 = arg13;
                            arg15 = arg8 - arg14;
                            if (arg1.AsyncBackgroundTask_22() == 3) {
                                --arg15;
                            }
                            if (arg15 > 1) break;
                            arg7 = ArrayHandler.BaseCoreGenericHandler(arg1.q());
                            while (arg7.hasNext()) {
                                arg16 = (CommandSenderWrapper)arg7.next();
                                if (!StringUtilities.c(arg16.i(), arg6, true)) continue;
                                arg5.add(arg16.i());
                                if (arg5.size() < arg4) continue;
                                return arg5;
                            }
                            if (arg3.LiteBansModule_194().NullHandler_8() > 0) {
                                v0 = (String)ArrayUtilities.e(arg2);
                                if (v0 == null || (v0 = (arg17 = v0).toLowerCase(Locale.ENGLISH)) == null) {
                                    return arg5;
                                }
                                arg7 = v0;
                                arg18 = "";
                                v1 = arg13 = StringUtilities.BaseCoreGenericHandler(arg7, '.', false, 2, null) != false || StringUtilities.BaseCoreGenericHandler(arg7, '*', false, 2, null) != false ? 1 : 0;
                                if (arg13 != 0) {
                                    arg18 = String.valueOf(StringUtilities.BaseCoreGenericHandler(arg7));
                                    arg7 = arg7.substring(1);
                                }
                                if (StringUtilities.LiteBansModule_31(arg7) == false) {
                                    arg17 = (ServerSyncService)arg1.BaseCoreGenericHandler(ServerSyncService.class);
                                    arg12 = arg17.LiteBansModule_31(arg9 = arg17.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(arg7)));
                                    if (arg12 == null) {
                                        this.plugin(arg1, arg9);
                                        return arg5;
                                    }
                                    for (Object arg19 : arg17.BaseCoreGenericHandler((String)arg7)) {
                                        if ((Iterable)arg12.BaseCoreGenericHandler().get((int)arg19) == null) continue;
                                        arg20 = arg21;
                                        for (T arg22 : arg20) {
{
                                                arg23 = (String)arg22;
                                                if (!StringUtilities.LiteBansModule_31(arg23, (String)arg7, false, 2, null)) continue;
                                                arg24 = arg5;
                                                if (arg24 instanceof Collection && ((Collection)arg24).isEmpty()) {
                                                } else {
                                                    for (T arg25 : arg24) {
                                                        arg26 = (String)arg25;
                                                        if (!StringUtilities.BaseCoreGenericHandler(arg26, arg23, true)) continue;
                                                        break;
}
                                            if (!v2) continue;
                                            arg5.add(arg18 + arg23);
                                            if (arg5.size() < arg4) continue;
                                            return arg5;
}
                            break;
                        }
                        if (!StringUtilities.LiteBansModule_31(arg6, "server:", false, 2, null)) break;
                        arg7 = StringUtilities.BaseCoreGenericHandler(arg6, "server:", null, 2, null);
                        MuteHandler.BaseCoreGenericHandler(this, arg1, (String)arg7, arg5, 0, 8, null);
                        break;
                    }
                    if (arg15 != 2 || StringUtilities.LiteBansModule_31(v2, "un", false, 2, null)) break;
                    arg27 = BanHandler.values();
                    arg9 = ((BanHandler[])arg27).length;
                    for (arg10 = 0; arg10 < arg9; ++arg10) {
                        arg11 = arg12 = arg27[arg10];
                        arg28   = v2;
                        if (StringUtilities.LiteBansModule_31(arg28  , ((Enum)arg11).toString(), false, 2, null)) ** GOTO lbl-1000
                        arg28   = v2;
                        if (StringUtilities.BaseCoreGenericHandler(arg28  , ((Enum)arg11).toString(), false, 2, null)) ** GOTO lbl-1000
                        if (StringUtilities.BaseCoreGenericHandler(v2, "ip", false, 2, null)) {
                            arg28   = arg11;
                            arg29 = "ip";
                            ** if (!StringUtilities.LiteBansModule_31((CharSequence)(v2), (CharSequence)((CharSequence)(arg28   + arg29)), (boolean)false, (int)2, null)) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                                                {
                            ** GOTO lbl106
                        }
lbl-1000:
                                                {
                        }
                                                if (!v3) continue;
                        v4 = arg12;
                        break;
                    }
                    v4 = arg7 = null;
                }
                if (arg7 != null) {
                    arg27 = arg3.AsyncBackgroundTask_21().AsyncBackgroundTask_5();
                    arg30 = arg27;
                    arg12 = new ArrayList<PunishmentService>();
                    arg31 = arg30.iterator();
                    while (arg31.hasNext()) {
                        arg28   = arg31.next();
                        arg32 = (LiteBansModule_65)arg28  ;
                        if (!(arg32.AsyncBackgroundTask_5() == arg7)) continue;
                        arg12.add(arg28  );
                    }
                    arg33 = (List)arg12;
                    for (LiteBansModule_65 arg34 : arg33) {
                        if (!StringUtilities.c(arg34.g(), arg6, true)) continue;
                        if (arg5.size() >= arg4) {
                            return arg5;
                        }
                        arg30 = arg34.LiteBansModule_240().c();
                        if (arg30 != null) {
                            arg12 = v3;
                            arg31 = arg12;
                            if (arg31.e((String)arg30) == false) continue;
                        }
                        arg5.add(arg34.g());
}
            arg7 = arg3;
            if (arg7.g()) {
                arg35 = arg7;
                arg36 = arg5;
                arg12 = arg36;
                arg35.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(v2, Arrays.toString(arg12.toArray(new String[0]))));
            }
            return arg5;
        }
        catch (LiteBansException_4 arg37) {
            return CollectionUtilities.e();
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
        if (StringUtilities.LiteBansModule_31(string2) || StringUtilities.c(string, string2, true)) {
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

