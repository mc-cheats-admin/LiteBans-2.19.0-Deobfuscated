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
                v2 = this;
                v3 = ((ConfigService)v2.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).BroadcastService();
                v2 = this.plugin(v1);
                v4 = v2.LiteBansModule_195();
                v5 = v2.e();
                v6 = v2.AsyncBackgroundTask_5();
                v7 = v3.LiteBansModule_195().be();
                v8 = this.c(v1);
                v9 = this;
                v9 = (DatabaseMonitorService)v9.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
                try {
                    v10 = v9.LiteBansModule_195();
                    v11 = v10;
                    try {
                        block21: {
                            block20: {
                                v12 = (LiteBansModule_83)v11;
                                v13 = v10;
                                v14 = v4.length();
                                if (ObjectUtilities.BaseCoreGenericHandler(v14, v7 & 255) <= 0) break block20;
                                this.plugin(v13, v4, v7);
                                if (!this.plugin(v13, v1, v5, v4, LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.c, "Invalid username.\nMaximum " + BlackHandler.i + LiteBansModule_284.LiteBansModule_31(v7) + ' ' + BlackHandler.LiteBansModule_195("characters") + ", found " + BlackHandler.AsyncBackgroundTask_5(BlackHandler.e(String.valueOf(v4.length())))), null, "KICK_OTHER", false)) break block20;
                                break block21;
                            }
                            if (!this.LiteBansModule_31(v8)) break block21;
                            v15 = AllHandler_3.BaseCoreGenericHandler(v13, v5, v6, null, v8, false, false, 52, null);
                            v16 = v3;
                            v17 = 3;
                            if (v16.BaseCoreGenericHandler(v17)) {
                                v18 = v16;
                                v18.BaseCoreGenericHandler((Object)("Ban for " + v4 + " (uuid: '" + v5 + "') on " + v8 + ": " + v15));
                            }
                            v16 = this.plugin(v6);
                            if (v16 != null) {
                                v19 = this.plugin(v13, v1, (String)v16, v8, v5, v4);
                            }
                            if (v19 || v15 == null) ** GOTO lbl-1000
                            v20 = this;
                            if (!((BroadcastService)v20.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v15, v4)) {
                                v19 = this.plugin(v13, v1, v5, v4, v6, v8, v15);
                            } else if (!v19 && v3.LiteBansModule_195().NullHandler() && (v21 = AllHandler_3.BaseCoreGenericHandler(v13, v4, v5, v8, null, 8, null)) != null) {
                                v22 = this;
                                if (!((BroadcastService)v22.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v21, v4) && (v19 = this.plugin(v13, v1, v5, v4, v6, v8, v21))) {
                                }
                            }
                        }
                        v12 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable v23) {
                        v24 = v23;
                        throw v23;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(v11, v24);
                    }
                }
                catch (SQLException v25) {
                    if (v9.LiteBansModule_31(v25)) break block19;
                    throw v25;
                }
            }
            if (v26) {
                return;
            }
            v9 = this;
            ((BroadcastService)v9.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(v4, v6, v5, v8, v19);
        }
        catch (LiteBansException_2 v27) {
            v28 = this;
            ConfigService.BaseCoreGenericHandler((ConfigService)v28.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), v27, 0, 2, null);
        }
        catch (NullPointerException v29) {
            v30 = this.LiteBansModule_241();
            v31 = v30;
            if (v31.isEnabled() == false != false || v30.AsyncBackgroundTask_21() != false) {
                v30 = this;
                ConfigService.BaseCoreGenericHandler((ConfigService)v30.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class), v29, 0, 2, null);
            }
            throw v29;
        }
        catch (SQLException v32) {
            v33 = this;
            ((DatabaseMonitorService)v33.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(v32);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull String string, byte by2) {
        ch2.e().getLogger().warning("User \"" + string + "\" length > " + LiteBansModule_284.LiteBansModule_31(by2) + " (invalid username); blocking ");
    }

    public final String BaseCoreGenericHandler(@Nullable String string) {
        MessageHandler messageHandler = this;
        GeoIPLookupService_2 fv_02 = ((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_241();
        return fv_02 != null ? fv_02.BaseCoreGenericHandler(string) : null;
    }

    public final boolean LiteBansModule_31(@NotNull String string) {
        boolean flag;
        if (this.LiteBansModule_241().LiteBansModule_403()) {
                        flag = !((ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().ap().contains(((String)(targetObj = string)).toLowerCase(Locale.ENGLISH));
        } else {
            MessageHandler messageHandler = this;
            flag = !((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().PlayerQuitListener();
        }
        return flag;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull Object targetObj, @NotNull String string, @NotNull String string2, @NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, @NotNull String string3, boolean flag) {
        UUID uUID = LiteBansModule_346.BaseCoreGenericHandler.GnuSparseMapHandler(string);
        if ((dZ2 == null || !ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)string)) && uUID != null && ch2.BaseCoreGenericHandler(uUID, BanHandler.LiteBansModule_241) && flag) {
            ch2.e().getLogger().info(string2 + " was permitted to join the ");
            return false;
        }
        this.plugin(targetObj, charSequence, string3);
        return true;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(GeoIPLookupService_3 gu2, LiteBansModule_83 ch2, Object targetObj, String string, String string2, CharSequence charSequence, SilentHandler dZ2, String string3, boolean flag, int n, Object contextObj) {
        if (contextObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 0x20) != 0) {
            string3 = "KICK_BANNED";
        }
        if ((n & 0x40) != 0) {
            flag = true;
        }
        return gu2.BaseCoreGenericHandler(ch2, targetObj, string, string2, charSequence, dZ2, string3, flag);
    }

    public final LiteBansModule_96 BaseCoreGenericHandler(@NotNull Object targetObj) {
        MessageHandler messageHandler = this;
        return this.LiteBansModule_241().i().BaseCoreGenericHandler(targetObj, ((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_241());
    }

    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence, @NotNull String string) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_241().i(), targetObj, charSequence, null, false, string, 12, null);
    }

    public String c(@NotNull Object targetObj) {
        return this.LiteBansModule_241().i().BaseCoreGenericHandler(targetObj);
    }

    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull LiteBansModule_179 eo_02) {
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(targetObj, eo_02, arg_0));
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull Object targetObj, @NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4) {
        if (GeoIPLookupService_3.BaseCoreGenericHandler(this, ch2, targetObj, string3, string4, GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string2), null, null, false, 96, null)) {
            CharSequence[] charSequenceArray = (CharSequence[])this;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            if (((ConfigService)charSequenceArray2.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().aM()) {
                charSequenceArray = this;
                flag = false;
                BroadcastService o2 = (BroadcastService)charSequenceArray.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                charSequenceArray = new CharSequence[]{"geoip", string, "player", string4};
                o2.LiteBansModule_31(string3, LiteBansModule_243.BaseCoreGenericHandler((CharSequence)MessageKey.PlayerJoinListener, charSequenceArray), true);
                return true;
            }
        }
        return false;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull Object targetObj, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull SilentHandler dZ2) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, string2, string, string3, string4, -1);
        if (GeoIPLookupService_3.BaseCoreGenericHandler(this, ch2, targetObj, string, string2, charSequence, dZ2, null, false, 96, null)) {
            MessageHandler messageHandler = this;
            if (((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().aM()) {
                ch2.AsyncBackgroundTask_5().BaseCoreGenericHandler(arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(dZ2, string2, string, string3, string4, this, arg_0));
            }
            if (ch2.e().LiteBansModule_403()) {
                this.plugin(targetObj, arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(this, dZ2, charSequence, arg_0));
            }
            return true;
        }
        return false;
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SilentHandler dZ3 = dZ2;
        if (!(dZ3 != null && dZ3.r() != -1)) {
            charSequence2 = dZ2.HoverTextFormatter() ? (CharSequence)MessageKey.AsyncBackgroundTask_5 : (CharSequence)MessageKey.aj;
        }
        return AllHandler_3.BaseCoreGenericHandler(ch2, charSequence2, dZ2, false, 2, null);
    }

    public Void LiteBansModule_31() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(Object targetObj, LiteBansModule_179 eo_02, LiteBansModule_83 ch2) {
        ch2.e().i().BaseCoreGenericHandler(targetObj, (CharSequence)eo_02.BaseCoreGenericHandler(ch2));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(SilentHandler dZ2, String string, String string2, String string3, String string4, GeoIPLookupService_3 gu2, LiteBansModule_83 ch2) {
        CharSequence charSequence = ch2.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_241, dZ2, false, 2, null), string, string, string2, string3, string4);
        MessageHandler messageHandler = gu2;
        ((BroadcastService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).LiteBansModule_31(string2, charSequence, true);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final CharSequence BaseCoreGenericHandler(GeoIPLookupService_3 gu2, SilentHandler dZ2, CharSequence charSequence, LiteBansModule_83 ch2) {
        return gu2.BaseCoreGenericHandler(ch2, dZ2, charSequence);
    }

    @Override
    public void run() {
        this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"Invalid username.\nMaximum ", "characters", ", found ", "KICK_OTHER", "Ban for ", " (uuid: '", "') on ", ": ", "User \"", "\" length > ", " (invalid username); blocking ", " was permitted to join the ", "", "KICK_BANNED", "geoip", "player"};
    }

    static {
        GeoIPLookupService_3.BaseCoreGenericHandler();
    }
}

