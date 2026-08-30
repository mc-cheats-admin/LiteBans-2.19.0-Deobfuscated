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

    public static /* synthetic */ int BaseCoreGenericHandler(LiteBansModule_359 jW2, PlatformPlugin plugin, String[] args, Collection collection, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 8) != 0) {
            n = ((ConfigService)plugin.BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aT();
        }
        return jW2.BaseCoreGenericHandler(plugin, args, collection, n);
    }

    public static void BaseCoreGenericHandler(@NotNull LiteBansModule_359 var0, @NotNull LiteBansModule_82 v1, @NotNull Collection v2, @Nullable LiteBansModule_297 v3, @Nullable String[] var4_4, @NotNull AbstractCommand var5_5, int var6_6) {
        var7_7 = var5_5;
        var8_8 = false;
        var9_9 = var7_7;
        var10_10 = false;
        var11_12 = DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)var9_9.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class), false, 1, null);
        var9_9 = new HashMap<K, V>();
        if (StringUtilities.LiteBansModule_31(var0.BaseCoreGenericHandler()) == false && v3 != null) {
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)var7_7, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(v1, var0.BaseCoreGenericHandler(), v3, false, 2, null), (CharSequence)"limit", var6_6), (CharSequence)"total", v2.size()));
        }
        for (SilentHandler var13_13 : CollectionUtilities.BaseCoreGenericHandler((Iterable)v2, var6_6)) {
            block19: {
                var14_14 = var13_13.DatabaseMonitorService();
                v0 = v3;
                if (v0 == null) {
                    v0 = var0.BaseCoreGenericHandler(v1, (HashMap)var9_9, var14_14);
                }
                if ((var15_15 = v0) == null) break block19;
                var16_17 = false;
                var17_19 = var13_13;
                var18_20 = false;
                if (!var17_19.LiteBansModule_240()) ** GOTO lbl-1000
                v1 = var17_19.PunishmentTableService();
                v2 = v1 != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)v1, '#', false, 2, null) : false;
                if (v2 && !ObjectUtilities.BaseCoreGenericHandler((Object)var17_19.DatabaseMonitorService(), (Object)var15_15.LiteBansModule_31())) {
                    v3 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v3 = false;
                }
                if (v3) {
                    var16_16 = var7_7;
                    var17_18 = 0;
                    var16_16 = (ConfigService)var16_16.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                    var17_18 = 100;
                    var18_20 = false;
                    if (!var16_16.BaseCoreGenericHandler(var17_18)) continue;
                    var19_22 = var16_16;
                    var20_23 = false;
                    var19_22.BaseCoreGenericHandler((Object)("r0 " + var13_13));
                    continue;
                }
            }
            var16_16 = null;
            var17_18 = var14_14 == null || StringUtilities.BaseCoreGenericHandler((CharSequence)var14_14, '#', false, 2, null) != false ? 1 : 0;
            var18_21 = var13_13.PunishmentTableService();
            if (var17_18 != 0 && !var7_7.AsyncBackgroundTask_5().LiteBansModule_194()) {
                var20_24 = var7_7;
                var21_26 = false;
                if (((ConfigService)var20_24.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aa()) {
                    var18_21 = MessageKey.SecHandler.toString();
                }
            }
            var20_25 = MessageKey.BaseCoreGenericHandler(var13_13.ServerSyncService());
            v4 = var16_16 = var17_18 == 0 ? var0.BaseCoreGenericHandler(v1, (HashMap)var9_9, var14_14) : new LiteBansModule_297(var18_21, null, var18_21, new Date(var13_13.BroadcastService()));
            if (var16_16 == null) {
                var21_27 = var7_7;
                var22_28 = 0;
                var21_27 = (ConfigService)var21_27.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                var22_28 = 100;
                var23_31 = false;
                if (!var21_27.BaseCoreGenericHandler(var22_28)) continue;
                var19_22 = var21_27;
                var24_35 = false;
                var19_22.BaseCoreGenericHandler((Object)("r2 " + var13_13));
                continue;
            }
            var21_26 = v1.BaseCoreGenericHandler(var13_13);
            if (var21_26 && var13_13.ServerSyncService() != BanHandler.g) {
                var22_29 = var20_25;
                var23_32 = var13_13.HoverTextFormatter() != false ? MessageKey.LiteBansModule_89 : MessageKey.MessageKey;
                var24_35 = false;
                var20_25 = "" + var22_29 + var23_32;
            }
            if (ObjectUtilities.BaseCoreGenericHandler((Object)"#expired", (Object)(var22_30 = var13_13.q())) || !var21_26 && var13_13.LiteBansModule_31(var11_12)) {
                var23_33 = var20_25;
                var24_36 = MessageKey.dm;
                var25_38 = false;
                var20_25 = "" + var23_33 + var24_36;
            }
            var20_25 = AllHandler_3.BaseCoreGenericHandler(v1, var20_25, var13_13, (LiteBansModule_297)var16_16, false, 4, null);
            var23_34 = null;
            var24_37 = var22_30;
            if (!(var24_37 == null || StringUtilities.LiteBansModule_31((CharSequence)var24_37) != false) && !StringUtilities.BaseCoreGenericHandler((CharSequence)var22_30, '#', false, 2, null)) {
                var24_37 = var7_7;
                var25_38 = false;
                var22_30 = ((BroadcastService)var24_37.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v1, var13_13);
                if (var22_30 != null) {
                    switch (LiteBansModule_282.BaseCoreGenericHandler[var13_13.ServerSyncService().ordinal()]) {
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
                            v5 = null;
                        }
                    }
                    var23_34 = v5;
                    if (var23_34 != null) {
                        var26_39 = var7_7;
                        var27_40 = false;
                        var30_42 = var28_41 = ((DatabaseMonitorService)var26_39.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).LiteBansModule_31(true) - var13_13.LiteBansModule_194();
                        var32_43 = false;
                        var23_34 = ((MessageKey)var23_34).BaseCoreGenericHandler("timeSince", (Object)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var30_42, false, 2, null));
                        var23_34 = AllHandler_3.BaseCoreGenericHandler(v1, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(v1, var23_34, var22_30, var13_13.AsyncBackgroundTask_21(), false, 4, null), (CharSequence)"displayName", (Object)var22_30), var13_13, (LiteBansModule_297)var16_16, false, 4, null);
                    }
                }
            }
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)var7_7, var20_25);
            if (var23_34 == null) continue;
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)var7_7, var23_34);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_359 jW2, LiteBansModule_82 ch2, Collection collection, LiteBansModule_297 iA2, String[] args, AbstractCommand abstractCommand, int n, int n2, Object object) {
        if (object != null) {
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

    public static LiteBansModule_297 BaseCoreGenericHandler(@NotNull LiteBansModule_359 jW2, @NotNull LiteBansModule_82 ch2, @NotNull HashMap hashMap, @Nullable String string) {
        Object object;
        Map map = hashMap;
        String string2 = string;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        String string3 = string2;
        boolean flag = false;
        Object v2 = map.get(string3);
        if (v2 == null) {
            boolean flag2 = false;
            LiteBansModule_297 iA2 = ch2.c(string);
            map.put(string3, iA2);
            object = iA2;
        } else {
            object = v2;
        }
        return (LiteBansModule_297)object;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "limit", "total", "r0 ", "r2 ", "#expired", "timeSince", "displayName", "", ""};
    }

    }

