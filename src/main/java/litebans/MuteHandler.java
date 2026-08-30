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
        Object object = this;
        boolean flag = false;
        String[] args = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
        object = args;
        flag = false;
        args = object;
        Collection collection = new ArrayList();
        boolean flag2 = false;
        int n = args.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = args[i];
            boolean flag3 = false;
            if (!configService.e(string2)) continue;
            collection.add(string);
        }
        object = (List)collection;
        flag = false;
        args = object;
        return args.toArray(new String[0]);
    }

    public final void BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, int n) {
        ServerSyncService u2 = (ServerSyncService)plugin.BaseCoreGenericHandler(ServerSyncService.class);
        ((Collection)u2.LiteBansModule_240().LiteBansModule_31()).add((byte)n);
        if (u2.LiteBansModule_240().c().compareAndSet(false, true)) {
            plugin.LiteBansModule_31(u2.LiteBansModule_240());
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(MuteHandler et2, PlatformPlugin plugin, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        et2.BaseCoreGenericHandler(plugin, n);
    }

    public final List BaseCoreGenericHandler(@Nullable LiteCommand v1, @NotNull String v2, @NotNull CommandSenderWrapper v3, @NotNull PlatformPlugin var4_4, @NotNull String[] var5_5) {
        try {
            block28: {
                block26: {
                    block29: {
                        block27: {
                            MuteHandler.BaseCoreGenericHandler(this, var4_4, 0, 2, null);
                            var6_6 = (ConfigService)var4_4.BaseCoreGenericHandler(ConfigService.class);
                            var7_7 = 8;
                            var8_9 = new ArrayList<String>();
                            var9_10 = (String)ArrayUtilities.c(var5_5);
                            var11_11 = var5_5;
                            var34_12 = var5_5.length;
                            var12_14 = false;
                            var13_18 = 0;
                            var15_25 = ((String[])var11_11).length;
                            for (var14_21 = 0; var14_21 < var15_25; ++var14_21) {
                                var17_29 = var16_28 = var11_11[var14_21];
                                var18_31 = 0;
                                if (!StringUtilities.BaseCoreGenericHandler((CharSequence)var17_29, '-', false, 2, null)) continue;
                                ++var13_18;
                            }
                            var35_33 = var13_18;
                            var10_34 = var34_12 - var35_33;
                            if (var4_4.AsyncBackgroundTask_22() == 3) {
                                --var10_34;
                            }
                            if (var10_34 > 1) break block27;
                            var11_11 = ArrayHandler.BaseCoreGenericHandler(var4_4.q());
                            while (var11_11.hasNext()) {
                                var12_15 = (CommandSenderWrapper)var11_11.next();
                                if (!StringUtilities.c(var12_15.i(), var9_10, true)) continue;
                                var8_9.add(var12_15.i());
                                if (var8_9.size() < var7_7) continue;
                                return var8_9;
                            }
                            if (var6_6.LiteBansModule_194().NullHandler_8() > 0) {
                                var11_11 = null;
                                v0 = (String)ArrayUtilities.e(var5_5);
                                if (v0 == null || (v0 = (var14_22 = v0).toLowerCase(Locale.ENGLISH)) == null) {
                                    return var8_9;
                                }
                                var11_11 = v0;
                                var12_16 = null;
                                var12_16 = "";
                                v1 = var13_18 = StringUtilities.BaseCoreGenericHandler((CharSequence)var11_11, '.', false, 2, null) != false || StringUtilities.BaseCoreGenericHandler((CharSequence)var11_11, '*', false, 2, null) != false ? 1 : 0;
                                if (var13_18 != 0) {
                                    var12_16 = String.valueOf(StringUtilities.BaseCoreGenericHandler((CharSequence)var11_11));
                                    var11_11 = var11_11.substring(1);
                                }
                                if (StringUtilities.LiteBansModule_31((CharSequence)var11_11) == false) {
                                    var14_22 = (ServerSyncService)var4_4.BaseCoreGenericHandler(ServerSyncService.class);
                                    var16_28 = var14_22.LiteBansModule_31(var15_25 = var14_22.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler((CharSequence)var11_11)));
                                    if (var16_28 == null) {
                                        this.plugin(var4_4, var15_25);
                                        return var8_9;
                                    }
                                    for (Object var20_38 : (Object)var14_22.BaseCoreGenericHandler((String)var11_11)) {
                                        if ((Iterable)var16_28.BaseCoreGenericHandler().get((int)var20_38) == null) continue;
                                        var22_44 = var21_42;
                                        var23_45 = false;
                                        for (T var25_47 : var22_44) {
                                            block25: {
                                                var26_48 = (String)var25_47;
                                                var27_49 = false;
                                                if (!StringUtilities.LiteBansModule_31(var26_48, (String)var11_11, false, 2, null)) continue;
                                                var28_50 = var8_9;
                                                var29_51 = false;
                                                if (var28_50 instanceof Collection && ((Collection)var28_50).isEmpty()) {
                                                    v2 = true;
                                                } else {
                                                    for (T var31_53 : var28_50) {
                                                        var32_54 = (String)var31_53;
                                                        var33_55 = false;
                                                        if (!StringUtilities.BaseCoreGenericHandler(var32_54, var26_48, true)) continue;
                                                        v2 = false;
                                                        break block25;
                                                    }
                                                    v2 = true;
                                                }
                                            }
                                            if (!v2) continue;
                                            var8_9.add(var12_16 + var26_48);
                                            if (var8_9.size() < var7_7) continue;
                                            return var8_9;
                                        }
                                    }
                                }
                            }
                            break block28;
                        }
                        if (!StringUtilities.LiteBansModule_31(var9_10, "server:", false, 2, null)) break block29;
                        var11_11 = StringUtilities.BaseCoreGenericHandler(var9_10, "server:", null, 2, null);
                        MuteHandler.BaseCoreGenericHandler(this, var4_4, (String)var11_11, var8_9, 0, 8, null);
                        break block28;
                    }
                    if (var10_34 != 2 || StringUtilities.LiteBansModule_31(v2, "un", false, 2, null)) break block28;
                    var13_19 = BanHandler.values();
                    var15_25 = ((BanHandler[])var13_19).length;
                    for (var14_21 = 0; var14_21 < var15_25; ++var14_21) {
                        var17_29 = var16_28 = var13_19[var14_21];
                        var18_31 = 0;
                        var19_36 /* !! */  = v2;
                        var20_39 = false;
                        if (StringUtilities.LiteBansModule_31(var19_36 /* !! */ , ((Enum)var17_29).toString(), false, 2, null)) ** GOTO lbl-1000
                        var19_36 /* !! */  = v2;
                        var20_39 = false;
                        if (StringUtilities.BaseCoreGenericHandler(var19_36 /* !! */ , ((Enum)var17_29).toString(), false, 2, null)) ** GOTO lbl-1000
                        if (StringUtilities.BaseCoreGenericHandler(v2, "ip", false, 2, null)) {
                            var19_36 /* !! */  = (CharSequence)var17_29;
                            var20_40 = "ip";
                            var21_43 = false;
                            ** if (!StringUtilities.LiteBansModule_31((CharSequence)((CharSequence)v2), (CharSequence)((CharSequence)(var19_36 /* !! */  + var20_40)), (boolean)false, (int)2, null)) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 3 sources

                        {
                            v3 = true;
                            ** GOTO lbl106
                        }
lbl-1000:
                        // 2 sources

                        {
                            v3 = false;
                        }
lbl106:
                        // 2 sources

                        if (!v3) continue;
                        v4 = var16_28;
                        break block26;
                    }
                    v4 = var11_11 = null;
                }
                if (var11_11 != null) {
                    var13_19 = var6_6.AsyncBackgroundTask_21().AsyncBackgroundTask_5();
                    var14_21 = 0;
                    var15_26 = var13_19;
                    var16_28 = new ArrayList<PunishmentService>();
                    var17_30 = false;
                    var18_32 = var15_26.iterator();
                    while (var18_32.hasNext()) {
                        var19_36 /* !! */  = var18_32.next();
                        var20_41 = (LiteBansModule_65)var19_36 /* !! */ ;
                        var21_43 = false;
                        if (!(var20_41.AsyncBackgroundTask_5() == var11_11)) continue;
                        var16_28.add(var19_36 /* !! */ );
                    }
                    var12_17 = (List)var16_28;
                    for (LiteBansModule_65 var14_23 : var12_17) {
                        if (!StringUtilities.c(var14_23.g(), var9_10, true)) continue;
                        if (var8_9.size() >= var7_7) {
                            return var8_9;
                        }
                        var15_26 = var14_23.LiteBansModule_240().c();
                        if (var15_26 != null) {
                            var16_28 = v3;
                            var17_30 = false;
                            var18_32 = var16_28;
                            var19_37 = false;
                            if (var18_32.e((String)var15_26) == false) continue;
                        }
                        var8_9.add(var14_23.g());
                    }
                }
            }
            var11_11 = var6_6;
            var12_14 = false;
            if (var11_11.g()) {
                var34_13 = var11_11;
                var13_20 = false;
                var14_24 = var8_9;
                var15_27 = false;
                var16_28 = var14_24;
                var34_13.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler((CharSequence)v2, (CharSequence)Arrays.toString(var16_28.toArray(new String[0]))));
            }
            return var8_9;
        }
        catch (LiteBansException_4 var7_8) {
            return CollectionUtilities.e();
        }
    }

    private final void BaseCoreGenericHandler(PlatformPlugin plugin, String string, ArrayList arrayList, int n) {
        LiteBansModule_15 aK2;
        String string2;
        DatabaseMonitorService w2 = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        Object object = new String[]{"global", "local"};
        String[] args = object;
        object = plugin.i().BaseCoreGenericHandler();
        Collection collection = w2.e().values();
        HashSet hashSet = new HashSet();
        for (String string3 : args) {
            if (this.plugin(string3, string, hashSet, n)) break;
        }
        Iterator<Object> iterator = object.iterator();
        while (iterator.hasNext() && !this.plugin(string2 = (String)iterator.next(), string, hashSet, n)) {
        }
        iterator = collection.iterator();
        while (iterator.hasNext() && !this.plugin((aK2 = (LiteBansModule_15)iterator.next()).e(), string, hashSet, n)) {
        }
        arrayList.addAll(hashSet);
    }

    static /* synthetic */ void BaseCoreGenericHandler(MuteHandler et2, PlatformPlugin plugin, String string, ArrayList arrayList, int n, int n2, Object object) {
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

    }

