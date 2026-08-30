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
{
                arg1 = this;
                arg2 = ((ConfigService)arg1.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BroadcastService();
                arg1 = this.plugin(v1);
                arg3 = arg1.LiteBansModule_194();
                arg4 = arg1.e();
                arg5 = arg1.AsyncBackgroundTask_5();
                arg6 = arg2.LiteBansModule_194().be();
                arg7 = this.c(v1);
                arg8 = this;
                arg8 = (DatabaseMonitorService)arg8.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
                try {
                    arg9 = arg8.LiteBansModule_194();
                    arg10 = arg9;
                    try {
{
                                arg11 = (LiteBansModule_82)arg10;
                                arg12 = arg9;
                                arg13 = arg3.length();
                                if (ObjectUtilities.BaseCoreGenericHandler(arg13, arg6 & 255) <= 0) break;
                                this.plugin(arg12, arg3, arg6);
                                if (!this.plugin(arg12, v1, arg4, arg3, LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.c, "Invalid username.\nMaximum " + BlackHandler.i + LiteBansModule_283.LiteBansModule_31(arg6) + ' ' + BlackHandler.LiteBansModule_194("characters") + ", found " + BlackHandler.AsyncBackgroundTask_5(BlackHandler.e(String.valueOf(arg3.length())))), null, "KICK_OTHER", false)) break;
                                break;
                            }
                            if (!this.LiteBansModule_31(arg7)) break;
                            arg14 = AllHandler_3.BaseCoreGenericHandler(arg12, arg4, arg5, null, arg7, false, false, 52, null);
                            arg15 = arg2;
                            arg16 = 3;
                            if (arg15.BaseCoreGenericHandler(arg16)) {
                                arg17 = arg15;
                                arg17.BaseCoreGenericHandler((Object)("Ban for " + arg3 + " (uuid: '" + arg4 + "') on " + arg7 + ": " + arg14));
                            }
                            arg15 = this.plugin(arg5);
                            if (arg15 != null) {
                                arg18 = this.plugin(arg12, v1, (String)arg15, arg7, arg4, arg3);
                            }
                            if (arg18 || arg14 == null) ** GOTO lbl-1000
                            arg19 = this;
                            if (!((BroadcastService)arg19.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(arg14, arg3)) {
                                arg18 = this.plugin(arg12, v1, arg4, arg3, arg5, arg7, arg14);
                            } else if (!arg18 && arg2.LiteBansModule_194().NullHandler() && (arg20 = AllHandler_3.BaseCoreGenericHandler(arg12, arg3, arg4, arg7, null, 8, null)) != null) {
                                arg21 = this;
                                if (!((BroadcastService)arg21.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(arg20, arg3) && (arg18 = this.plugin(arg12, v1, arg4, arg3, arg5, arg7, arg20))) {
}
                        arg11 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable arg22) {
                        arg23 = arg22;
                        throw arg22;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(arg10, arg23);
}
                catch (SQLException arg24) {
                    if (arg8.LiteBansModule_31(arg24)) break;
                    throw arg24;
}
            if (arg25) {
                return;
            }
            arg8 = this;
            ((BroadcastService)arg8.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(arg3, arg5, arg4, arg7, arg18);
        }
        catch (LiteBansException_2 arg26) {
            v3 = this;
            ConfigService.BaseCoreGenericHandler((ConfigService)v3.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), arg26, 0, 2, null);
        }
        catch (NullPointerException arg27) {
            arg28 = this.LiteBansModule_240();
            arg29 = arg28;
            if (arg29.isEnabled() == false != false || arg28.AsyncBackgroundTask_21() != false) {
                arg28 = this;
                ConfigService.BaseCoreGenericHandler((ConfigService)arg28.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class), arg27, 0, 2, null);
            }
            throw arg27;
        }
        catch (SQLException arg30) {
            arg31 = this;
            ((DatabaseMonitorService)arg31.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg30);
}

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, byte by2) {
        ch2.e().getLogger().warning("User \"" + string + "\" length > " + LiteBansModule_283.LiteBansModule_31(by2) + " (invalid username); blocking ");
    }

    public final String BaseCoreGenericHandler(@Nullable String string) {
        MessageHandler messageHandler = this;
        GeoIPLookupService_2 fv_02 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_240();
        return fv_02 != null ? fv_02.BaseCoreGenericHandler(string) : null;
    }

    public final boolean LiteBansModule_31(@NotNull String string) {
        boolean flag;
        if (this.LiteBansModule_240().LiteBansModule_401()) {
            Object object = this;
            flag = !((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ap().contains(((String)(object = string)).toLowerCase(Locale.ENGLISH));
        } else {
            MessageHandler messageHandler = this;
            flag = !((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().PlayerQuitListener();
        }
        return flag;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, @NotNull String string3, boolean flag) {
        UUID uUID = HexEncodingHelper.BaseCoreGenericHandler.GnuSparseMapHandler(string);
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
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> GeoIPLookupService_3.BaseCoreGenericHandler(object, eo_02, arg_0));
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4) {
        if (GeoIPLookupService_3.BaseCoreGenericHandler(this, ch2, object, string3, string4, GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string2), null, null, false, 96, null)) {
            CharSequence[] charSequenceArray = (CharSequence[])this;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            if (((ConfigService)charSequenceArray2.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().aM()) {
                charSequenceArray = this;
                flag = false;
                BroadcastService o2 = (BroadcastService)charSequenceArray.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                charSequenceArray = new CharSequence[]{"geoip", string, "player", string4};
                o2.LiteBansModule_31(string3, LiteBansModule_242.BaseCoreGenericHandler((CharSequence)MessageKey.PlayerJoinListener, charSequenceArray), true);
                return true;
}
        return false;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull SilentHandler dZ2) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, string2, string, string3, string4, -1);
        if (GeoIPLookupService_3.BaseCoreGenericHandler(this, ch2, object, string, string2, charSequence, dZ2, null, false, 96, null)) {
            MessageHandler messageHandler = this;
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

