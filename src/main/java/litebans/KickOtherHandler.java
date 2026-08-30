package litebans;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KickOtherHandler
extends GeoIPLookupService_3 {
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final ConcurrentHashMap e = new ConcurrentHashMap();
    public KickOtherHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final ConcurrentHashMap LiteBansModule_31() {
        return this.g;
    }

    public final ConcurrentHashMap BaseCoreGenericHandler() {
        return this.e;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, @NotNull UUID uUID, @Nullable String string2, @NotNull String string3, @NotNull Collection collection) {
        Object object = this;
        boolean flag = false;
        int n = (int)uUID.getMostSignificantBits();
        object = (Collection)this.g.get(n);
        if (!collection.isEmpty()) {
            Iterable iterable = collection;
            boolean flag2 = false;
            for (Object t2 : iterable) {
                SilentHandler dZ2 = (SilentHandler)t2;
                boolean flag3 = false;
                ((Map)this.e).put(dZ2, GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, string, uUID.toString(), string2, string3, -1));
            }
            Integer n2 = n;
            ((Map)this.g).put(n2, this.plugin(collection, (Collection)object));
        }
    }

    private final Collection BaseCoreGenericHandler(Collection collection, Collection collection2) {
        Collection collection3 = collection2;
        if (collection3 == null || collection3.isEmpty()) {
            return collection;
        }
        collection3 = CollectionUtilities.BaseCoreGenericHandler(collection2);
        for (SilentHandler dZ2 : collection) {
            boolean flag;
            block5: {
                Iterable iterable = collection2;
                boolean flag2 = false;
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    flag = true;
                } else {
                    for (Object t2 : iterable) {
                        SilentHandler dZ3 = (SilentHandler)t2;
                        boolean flag3 = false;
                        if (!(dZ3.BaseCoreGenericHandler() == dZ2.BaseCoreGenericHandler())) continue;
                        flag = false;
                        break block5;
                    }
                    flag = true;
                }
            }
            if (!flag) continue;
            collection3.add(dZ2);
        }
        return collection3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void BaseCoreGenericHandler(@NotNull LoginEvent v1) {
        block24: {
            v0 = this.LiteBansModule_240().i();
            ObjectUtilities.LiteBansModule_31(v0, "");
            v2 = (GetcancelreasoncomponentsHandler)v0;
            v3 = v1.getConnection();
            var4_4 = v3.getUniqueId();
            var5_5 = var4_4.toString();
            var6_6 = v3.getName();
            v1 = v3.getAddress();
            var7_7 = v1 != null && (v1 = v1.getAddress()) != null ? v1.getHostAddress() : null;
            ObjectUtilities.BaseCoreGenericHandler(v3);
            v2 = v2.BaseCoreGenericHandler(v3);
            if (v2 == null) {
                throw new AssertionError((Object)"No default server");
            }
            var8_8 = v2;
            var9_9 = new LiteBansModule_144();
            var10_10 = var8_8.getName();
            var11_11 = this;
            var12_12 = false;
            var11_11 = (DatabaseMonitorService)var11_11.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            var12_12 = false;
            try {
                var13_13 = var11_11.LiteBansModule_194();
                var14_15 = var13_13;
                var15_16 = null;
                try {
                    block26: {
                        block23: {
                            block25: {
                                var16_17 = (LiteBansModule_82)var14_15;
                                var17_18 = false;
                                var18_21 = var13_13;
                                var19_22 = false;
                                var20_23 = this;
                                var21_27 = 0;
                                var22_31 = ((ConfigService)var20_23.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().be();
                                var20_24 = var6_6.length();
                                var21_27 = 0;
                                if (ObjectUtilities.BaseCoreGenericHandler(var20_24, var22_31 & 255) <= 0) break block25;
                                ObjectUtilities.BaseCoreGenericHandler((Object)var6_6);
                                this.plugin(var18_21, var6_6, var22_31);
                                if (this.plugin(var18_21, v1, var5_5, var6_6, LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.c, "Invalid username.\nMaximum " + BlackHandler.i + LiteBansModule_283.LiteBansModule_31(var22_31) + ' ' + BlackHandler.c + "characters, found " + BlackHandler.ServerSyncService + BlackHandler.r + var6_6.length()), null, "KICK_OTHER", false)) break block26;
                            }
                            var9_9.BaseCoreGenericHandler = var18_21.BaseCoreGenericHandler(var5_5, var7_7, BanHandler.LiteBansModule_240, "__ALL__", true, 0);
                            var20_25 = this;
                            var21_27 = 0;
                            if (((ConfigService)var20_25.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().NullHandler()) {
                                ObjectUtilities.BaseCoreGenericHandler((Object)var6_6);
                                var20_25 = var18_21.BaseCoreGenericHandler(var6_6, var5_5, "__ALL__", BanHandler.LiteBansModule_240, true);
                                if (((Collection)var20_25).isEmpty() == false) {
                                    v3 = var9_9.BaseCoreGenericHandler;
                                    ObjectUtilities.LiteBansModule_31(v3, "");
                                    NullHandler_6.c(v3).addAll((Collection)var20_25);
                                }
                            }
                            var20_25 = this;
                            var21_27 = 0;
                            var20_25 = (ConfigService)var20_25.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                            var21_27 = 3;
                            var23_32 = false;
                            if (var20_25.BaseCoreGenericHandler(var21_27)) {
                                var24_34 = var20_25;
                                var25_35 = false;
                                var24_34.BaseCoreGenericHandler((Object)("Found " + ((List)var9_9.BaseCoreGenericHandler).size() + " ban(AsyncBackgroundTask_21) for " + var6_6 + " (uuid: '" + var4_4 + "') + "));
                            }
                            var20_25 = this;
                            var21_27 = 0;
                            if (((ConfigService)var20_25.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10)) {
                                var20_25 = (Iterable)var9_9.BaseCoreGenericHandler;
                                var21_28 = this;
                                var23_32 = false;
                                var21_28 = (ConfigService)var21_28.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                                var23_32 = false;
                                var25_36 = var20_25.iterator();
                                while (var25_36.hasNext()) {
                                    var27_41 = var26_39 = var25_36.next();
                                    var28_45 = false;
                                    var21_28.BaseCoreGenericHandler(var27_41);
                                }
                            }
                            if (!(((Collection)var9_9.BaseCoreGenericHandler).isEmpty() == false)) ** GOTO lbl-1000
                            ObjectUtilities.BaseCoreGenericHandler(var4_4);
                            if (var18_21.BaseCoreGenericHandler(var4_4, BanHandler.LiteBansModule_240)) {
                                v4 = true;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v4 = var20_26 = false;
                            }
                            if (var20_26) {
                                var21_29 = (Iterable)var9_9.BaseCoreGenericHandler;
                                var24_34 = var9_9;
                                var23_32 = false;
                                var25_37 = var21_29;
                                var26_39 = new ArrayList<PunishmentService>();
                                var27_42 = false;
                                var28_46 = var25_37.iterator();
                                while (var28_46.hasNext()) {
                                    var30_50 = var29_49 = var28_46.next();
                                    var31_52 = false;
                                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)var30_50.DatabaseMonitorService(), (Object)var5_5)) continue;
                                    var26_39.add(var29_49);
                                }
                                var24_34.BaseCoreGenericHandler = (List)var26_39;
                            }
                            if ((var21_30 = this.plugin(var7_7)) != null && !var20_26) {
                                ObjectUtilities.BaseCoreGenericHandler((Object)var10_10);
                                ObjectUtilities.BaseCoreGenericHandler((Object)var6_6);
                                this.plugin(var18_21, v1, var21_30, var10_10, var5_5, var6_6);
                            }
                            var25_38 = (Iterable)var9_9.BaseCoreGenericHandler;
                            var26_40 = 0;
                            var27_43 = var25_38.iterator();
                            while (var27_43.hasNext()) {
                                var28_47 = var27_43.next();
                                var29_49 = (SilentHandler)var28_47;
                                var30_51 = false;
                                ObjectUtilities.BaseCoreGenericHandler((Object)var10_10);
                                v5 = var29_49.m();
                                if (v5 == null) {
                                    v5 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                                }
                                if (!(LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(var10_10, v5) != false && this.LiteBansModule_31(var10_10) != false)) continue;
                                v6 = var28_47;
                                break block23;
                            }
                            v6 = null;
                        }
                        var23_33 = v6;
                        var25_38 = this;
                        var26_40 = 0;
                        var25_38 = (ConfigService)var25_38.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                        var26_40 = 3;
                        var27_44 = false;
                        if (var25_38.BaseCoreGenericHandler(var26_40)) {
                            var24_34 = var25_38;
                            var28_48 = false;
                            var24_34.BaseCoreGenericHandler((Object)("Ban for " + var10_10 + " (uncached): " + var23_33));
                        }
                        if (var23_33 != null) {
                            ObjectUtilities.BaseCoreGenericHandler((Object)var6_6);
                            this.plugin(var18_21, v1, var5_5, var6_6, var7_7, var10_10, var23_33);
                        } else {
                            ObjectUtilities.BaseCoreGenericHandler((Object)var6_6);
                            ObjectUtilities.BaseCoreGenericHandler(var4_4);
                            ObjectUtilities.BaseCoreGenericHandler((Object)var10_10);
                            this.plugin(var18_21, var6_6, var4_4, var7_7, var10_10, (Collection)var9_9.BaseCoreGenericHandler);
                        }
                    }
                    var16_17 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable var17_19) {
                    var15_16 = var17_19;
                    throw var17_19;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(var14_15, var15_16);
                }
            }
            catch (SQLException var13_14) {
                if (var11_11.LiteBansModule_31(var13_14)) break block24;
                throw var13_14;
            }
        }
    }

    @Override
    public void LiteBansModule_31(@NotNull Object v1) {
        try {
            block12: {
                block14: {
                    block13: {
                        block11: {
                            v2 = this.plugin(v1);
                            var3_6 = v2.LiteBansModule_194();
                            var4_10 = v2.e();
                            var5_14 = v2.AsyncBackgroundTask_5();
                            var6_16 = this.c(v1);
                            var7_18 = false;
                            if (!this.LiteBansModule_31(var6_16)) break block12;
                            v0 = (Collection)this.g.get(this.plugin(var4_10));
                            if (v0 == null) break block13;
                            var10_19 = v0;
                            var11_21 = false;
                            for (T var13_23 : var10_19) {
                                var14_24 = (SilentHandler)var13_23;
                                var15_25 = false;
                                if (!var14_24.BaseCoreGenericHandler(var4_10, var5_14, System.currentTimeMillis())) ** GOTO lbl-1000
                                v1 = var14_24.m();
                                if (v1 == null) {
                                    v1 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                                }
                                if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(var6_16, v1)) {
                                    v2 = true;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    v2 = false;
                                }
                                if (!v2) continue;
                                v3 = var13_23;
                                break block11;
                            }
                            v3 = null;
                        }
                        v4 = v3;
                        break block14;
                    }
                    v4 = var8_26 = null;
                }
                if (var8_26 != null) {
                    var9_27 = this;
                    var10_20 = false;
                    if (!((BroadcastService)var9_27.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler((SilentHandler)var8_26, var3_6)) {
                        var7_18 = this.plugin(v1, var4_10, var3_6, var5_14, var6_16, (SilentHandler)var8_26);
                    }
                }
            }
            var8_26 = this;
            var9_28 = false;
            ((BroadcastService)var8_26.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(var3_6, var5_14, var4_10, var6_16, var7_18);
        }
        catch (LiteBansException_2 var2_3) {
            var3_7 = this;
            var4_11 = false;
            ConfigService.BaseCoreGenericHandler((ConfigService)var3_7.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), var2_3, 0, 2, null);
        }
        catch (NullPointerException var2_4) {
            var3_8 = this.LiteBansModule_240();
            var4_12 = false;
            var5_15 = var3_8;
            var6_17 = false;
            if (var5_15.isEnabled() == false != false || var3_8.AsyncBackgroundTask_21() != false) {
                var3_8 = this;
                var4_12 = false;
                ConfigService.BaseCoreGenericHandler((ConfigService)var3_8.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), var2_4, 0, 2, null);
            }
            throw var2_4;
        }
        catch (SQLException var2_5) {
            var3_9 = this;
            var4_13 = false;
            ((DatabaseMonitorService)var3_9.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(var2_5);
        }
    }

    public final int BaseCoreGenericHandler(@NotNull String string) {
        KickOtherHandler gx_02 = this;
        UUID uUID = UUID.fromString(string);
        boolean flag = false;
        return (int)uUID.getMostSignificantBits();
    }

    public final boolean BaseCoreGenericHandler(@NotNull Object object, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull SilentHandler dZ2) {
        CharSequence charSequence = (CharSequence)this.e.get(dZ2);
        if (charSequence == null) {
            charSequence = "null";
        }
        CharSequence charSequence2 = charSequence;
        Object object2 = this;
        int n = 0;
        object2 = (ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        n = 3;
        boolean flag = false;
        if (((ConfigService)object2).BaseCoreGenericHandler(n)) {
            Object object3 = object2;
            boolean flag2 = false;
            ((ConfigService)object3).BaseCoreGenericHandler((Object)("Ban for " + string4 + " (cached): " + dZ2));
        }
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), object, charSequence2, null, false, null, 28, null);
        object2 = this;
        n = 0;
        if (((ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aM()) {
            object2 = this;
            n = 0;
            ((DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> KickOtherHandler.BaseCoreGenericHandler(dZ2, string2, string, string3, string4, this, arg_0));
        }
        this.plugin(object, arg_0 -> KickOtherHandler.BaseCoreGenericHandler(this, dZ2, charSequence2, arg_0));
        return true;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull LiteBansModule_178 eo_02) {
        if (object instanceof LoginEvent) {
            return;
        }
        super.BaseCoreGenericHandler(object, eo_02);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(SilentHandler dZ2, String string, String string2, String string3, String string4, KickOtherHandler gx_02, LiteBansModule_82 ch2) {
        CharSequence charSequence = ch2.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_240, dZ2, false, 2, null), string, string, string2, string3, string4);
        MessageHandler messageHandler = gx_02;
        boolean flag = false;
        ((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_31(string2, charSequence, true);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final CharSequence BaseCoreGenericHandler(KickOtherHandler gx_02, SilentHandler dZ2, CharSequence charSequence, LiteBansModule_82 ch2) {
        return gx_02.BaseCoreGenericHandler(ch2, dZ2, charSequence);
    }

    }

