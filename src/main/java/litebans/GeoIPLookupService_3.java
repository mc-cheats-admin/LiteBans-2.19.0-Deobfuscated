package litebans;

import java.sql.SQLException;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GeoIPLookupService_3
extends MessageHandler {
    public GeoIPLookupService_3(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void LiteBansModule_31(@NotNull Object v1) {
        try {
            block19: {
                var3_2 = this;
                var4_6 = false;
                var2_11 = ((ConfigService)var3_2.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BroadcastService();
                var3_2 = this.plugin(v1);
                var4_7 = var3_2.LiteBansModule_194();
                var5_15 = var3_2.e();
                var6_17 = var3_2.AsyncBackgroundTask_5();
                var7_19 = var2_11.LiteBansModule_194().be();
                var8_20 = this.c(v1);
                var9_21 = false;
                var10_22 = false;
                var11_23 = this;
                var12_24 = false;
                var11_23 = (DatabaseMonitorService)var11_23.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
                var12_24 = false;
                try {
                    var13_25 = var11_23.LiteBansModule_194();
                    var14_27 = var13_25;
                    var15_28 = null;
                    try {
                        block21: {
                            block20: {
                                var16_29 = (LiteBansModule_82)var14_27;
                                var17_30 = false;
                                var18_33 = var13_25;
                                var19_34 = false;
                                var20_35 = var4_7.length();
                                var21_37 = false;
                                if (ObjectUtilities.BaseCoreGenericHandler(var20_35, var7_19 & 255) <= 0) break block20;
                                this.plugin(var18_33, var4_7, var7_19);
                                if (!this.plugin(var18_33, v1, var5_15, var4_7, LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.c, "Invalid username.\nMaximum " + BlackHandler.i + LiteBansModule_283.LiteBansModule_31(var7_19) + ' ' + BlackHandler.LiteBansModule_194("characters") + ", found " + BlackHandler.AsyncBackgroundTask_5(BlackHandler.e(String.valueOf(var4_7.length())))), null, "KICK_OTHER", false)) break block20;
                                var10_22 = true;
                                break block21;
                            }
                            if (!this.LiteBansModule_31(var8_20)) break block21;
                            var20_36 = AllHandler_3.BaseCoreGenericHandler(var18_33, var5_15, var6_17, null, var8_20, false, false, 52, null);
                            var21_38 = var2_11;
                            var22_39 = 3;
                            var23_42 = false;
                            if (var21_38.BaseCoreGenericHandler(var22_39)) {
                                var24_44 = var21_38;
                                var25_45 = false;
                                var24_44.BaseCoreGenericHandler((Object)("Ban for " + var4_7 + " (uuid: '" + var5_15 + "') on " + var8_20 + ": " + var20_36));
                            }
                            var21_38 = this.plugin(var6_17);
                            if (var21_38 != null) {
                                var9_21 = this.plugin(var18_33, v1, (String)var21_38, var8_20, var5_15, var4_7);
                            }
                            if (var9_21 || var20_36 == null) ** GOTO lbl-1000
                            var22_40 = this;
                            var23_42 = false;
                            if (!((BroadcastService)var22_40.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(var20_36, var4_7)) {
                                var9_21 = this.plugin(var18_33, v1, var5_15, var4_7, var6_17, var8_20, var20_36);
                            } else if (!var9_21 && var2_11.LiteBansModule_194().NullHandler() && (var22_41 = AllHandler_3.BaseCoreGenericHandler(var18_33, var4_7, var5_15, var8_20, null, 8, null)) != null) {
                                var23_43 = this;
                                var25_45 = false;
                                if (!((BroadcastService)var23_43.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(var22_41, var4_7) && (var9_21 = this.plugin(var18_33, v1, var5_15, var4_7, var6_17, var8_20, var22_41))) {
                                    var10_22 = true;
                                }
                            }
                        }
                        var16_29 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable var17_31) {
                        var15_28 = var17_31;
                        throw var17_31;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(var14_27, var15_28);
                    }
                }
                catch (SQLException var13_26) {
                    if (var11_23.LiteBansModule_31(var13_26)) break block19;
                    throw var13_26;
                }
            }
            if (var10_22) {
                return;
            }
            var11_23 = this;
            var12_24 = false;
            ((BroadcastService)var11_23.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(var4_7, var6_17, var5_15, var8_20, var9_21);
        }
        catch (LiteBansException_2 var2_12) {
            v3 = this;
            var4_8 = false;
            ConfigService.BaseCoreGenericHandler((ConfigService)v3.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), var2_12, 0, 2, null);
        }
        catch (NullPointerException var2_13) {
            var3_4 = this.LiteBansModule_240();
            var4_9 = false;
            var5_16 = var3_4;
            var6_18 = false;
            if (var5_16.isEnabled() == false != false || var3_4.AsyncBackgroundTask_21() != false) {
                var3_4 = this;
                var4_9 = false;
                ConfigService.BaseCoreGenericHandler((ConfigService)var3_4.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), var2_13, 0, 2, null);
            }
            throw var2_13;
        }
        catch (SQLException var2_14) {
            var3_5 = this;
            var4_10 = false;
            ((DatabaseMonitorService)var3_5.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(var2_14);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, byte by2) {
        ch2.e().getLogger().warning("User \"" + string + "\" length > " + LiteBansModule_283.LiteBansModule_31(by2) + " (invalid username); blocking ");
    }

    public final String BaseCoreGenericHandler(@Nullable String string) {
        MessageHandler messageHandler = this;
        boolean flag = false;
        GeoIPLookupService_2 fv_02 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_240();
        return fv_02 != null ? fv_02.BaseCoreGenericHandler(string) : null;
    }

    public final boolean LiteBansModule_31(@NotNull String string) {
        boolean flag;
        if (this.LiteBansModule_240().LiteBansModule_401()) {
            Object object = this;
            boolean flag2 = false;
            flag = !((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ap().contains(((String)(object = string)).toLowerCase(Locale.ENGLISH));
        } else {
            MessageHandler messageHandler = this;
            boolean flag3 = false;
            flag = !((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().PlayerQuitListener();
        }
        return flag;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, @NotNull String string3, boolean flag) {
        UUID uUID = 0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.GnuSparseMapHandler(string);
        if ((dZ2 == null || !ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)string)) && uUID != null && ch2.BaseCoreGenericHandler(uUID, BanHandler.LiteBansModule_240) && flag) {
            ch2.e().getLogger().info(string2 + " was permitted to join the ");
            return false;
        }
        this.plugin(object, charSequence, string3);
        return true;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(GeoIPLookupService_3 gu2, LiteBansModule_82 ch2, Object object, String string, String string2, CharSequence charSequence, SilentHandler dZ2, String string3, boolean flag, int n, Object object2) {
        if (object2 != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 0x20) != 0) {
            string3 = "KICK_BANNED";
        }
        if ((n & 0x40) != 0) {
            flag = true;
        }
        return gu2.BaseCoreGenericHandler(ch2, object, string, string2, charSequence, dZ2, string3, flag);
    }

    public final LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object object) {
        MessageHandler messageHandler = this;
        boolean flag = false;
        return this.LiteBansModule_240().i().BaseCoreGenericHandler(object, ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_240());
    }

    public final void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), object, charSequence, null, false, string, 12, null);
    }

    public String c(@NotNull Object object) {
        return this.LiteBansModule_240().i().BaseCoreGenericHandler(object);
    }

    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull LiteBansModule_178 eo_02) {
        MessageHandler messageHandler = this;
        boolean flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(object, eo_02, arg_0));
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4) {
        if (GeoIPLookupService_3.BaseCoreGenericHandler(this, ch2, object, string3, string4, GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string2), null, null, false, 96, null)) {
            CharSequence[] charSequenceArray = (CharSequence[])this;
            boolean flag = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            boolean flag2 = false;
            if (((ConfigService)charSequenceArray2.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aM()) {
                charSequenceArray = this;
                flag = false;
                BroadcastService o2 = (BroadcastService)charSequenceArray.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                charSequenceArray = new CharSequence[]{"geoip", string, "player", string4};
                o2.LiteBansModule_31(string3, LiteBansModule_242.BaseCoreGenericHandler((CharSequence)MessageKey.PlayerJoinListener, charSequenceArray), true);
                return true;
            }
        }
        return false;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull SilentHandler dZ2) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, string2, string, string3, string4, -1);
        if (GeoIPLookupService_3.BaseCoreGenericHandler(this, ch2, object, string, string2, charSequence, dZ2, null, false, 96, null)) {
            MessageHandler messageHandler = this;
            boolean flag = false;
            if (((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aM()) {
                ch2.AsyncBackgroundTask_5().BaseCoreGenericHandler(arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(dZ2, string2, string, string3, string4, this, arg_0));
            }
            if (ch2.e().LiteBansModule_401()) {
                this.plugin(object, arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(this, dZ2, charSequence, arg_0));
            }
            return true;
        }
        return false;
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SilentHandler dZ3 = dZ2;
        boolean flag = false;
        if (!(dZ3 != null && dZ3.r() != -1)) {
            charSequence2 = dZ2.HoverTextFormatter() ? (CharSequence)MessageKey.AsyncBackgroundTask_5 : (CharSequence)MessageKey.aj;
        }
        return AllHandler_3.BaseCoreGenericHandler(ch2, charSequence2, dZ2, false, 2, null);
    }

    public Void LiteBansModule_31() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(Object object, LiteBansModule_178 eo_02, LiteBansModule_82 ch2) {
        ch2.e().i().BaseCoreGenericHandler(object, (CharSequence)eo_02.BaseCoreGenericHandler(ch2));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(SilentHandler dZ2, String string, String string2, String string3, String string4, GeoIPLookupService_3 gu2, LiteBansModule_82 ch2) {
        CharSequence charSequence = ch2.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_240, dZ2, false, 2, null), string, string, string2, string3, string4);
        MessageHandler messageHandler = gu2;
        boolean flag = false;
        ((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_31(string2, charSequence, true);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final CharSequence BaseCoreGenericHandler(GeoIPLookupService_3 gu2, SilentHandler dZ2, CharSequence charSequence, LiteBansModule_82 ch2) {
        return gu2.BaseCoreGenericHandler(ch2, dZ2, charSequence);
    }

    @Override
    public void run() {
        this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"Invalid username.\nMaximum ", "characters", ", found ", "KICK_OTHER", "Ban for ", " (uuid: '", "') on ", ": ", "User \"", "\" length > ", " (invalid username); blocking ", " was permitted to join the ", "", "KICK_BANNED", "geoip", "player"};
    }

    }

