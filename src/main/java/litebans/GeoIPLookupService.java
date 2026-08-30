package litebans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GeoIPLookupService {
        public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @Nullable Object targetObj) {
        CharSequence charSequence3 = charSequence2;
        return LiteBansModule_435.LiteBansModule_31.BaseCoreGenericHandler((Object)charSequence, (Object)("" + '$' + charSequence3), targetObj);
    }

    public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull LiteBansModule_147 messageSupplier) {
        return GeoIPLookupService.BaseCoreGenericHandler(charSequence, charSequence2) ? GeoIPLookupService.BaseCoreGenericHandler(charSequence, charSequence2, messageSupplier.BaseCoreGenericHandler()) : ((Object)charSequence).toString();
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, int n, int n2) {
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        Object targetObj = dZ2;
        if (targetObj != null && ((SilentHandler)targetObj).r() != -1 && (targetObj = configService.AsyncBackgroundTask_21().BaseCoreGenericHandler(dZ2)) != null) {
            LiteBansModule_175 eM2 = configService.AsyncBackgroundTask_21().BaseCoreGenericHandler(dZ2.ServerSyncService(), (LiteBansModule_65)targetObj);
            int n3 = n;
            LiteBansModule_67 c52 = null;
            if (eM2 != null) {
                if (n3 == -1) {
                    String string = dZ2.DatabaseMonitorService();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    contextObj = ch2.BaseCoreGenericHandler(string, dZ2.PunishmentTableService(), eM2, (LiteBansModule_65)targetObj);
                    n3 = (int)Math.floor(((Number)((LiteBansModule_356)contextObj).e()).doubleValue()) + n2;
                }
                c52 = eM2.BaseCoreGenericHandler(n3);
            } else {
                if (n3 == -1) {
                    String string = dZ2.DatabaseMonitorService();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    n3 = ch2.BaseCoreGenericHandler((LiteBansModule_65)targetObj, string, dZ2.PunishmentTableService()) + n2;
                }
                c52 = ((LiteBansModule_65)targetObj).BaseCoreGenericHandler(n3);
            }
            String string = c52.e();
            Object resultObj = contextObj = string != null ? (CharSequence)string : (CharSequence)((LiteBansModule_65)targetObj).LiteBansModule_241().e();
            if (contextObj == null) {
                return null;
            }
            return GeoIPLookupService.BaseCoreGenericHandler(ch2, (CharSequence)contextObj, (LiteBansModule_65)targetObj, n3);
        }
        return null;
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, int n, int n2, int n3, Object targetObj) {
        if ((n3 & 2) != 0) {
            n = -1;
        }
        if ((n3 & 4) != 0) {
            n2 = -1;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, n2);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @NotNull NoneHandler_2 cz2) {
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, charSequence, cz2.g(), cz2.D());
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @NotNull LiteBansModule_65 c12, int n) {
        LiteBansModule_65 c13 = c12;
        CharSequence charSequence2 = ObjectUtilities.BaseCoreGenericHandler(c13.LiteBansModule_195() & 0xFF, 0xFFFFFFFF & 0xFF) < 0 ? c12.g() : MessageKey.ay;
        int n2 = n + 1;
        CharSequence[] charSequenceArray = new CharSequence[]{"templateName", charSequence2};
        return LiteBansModule_243.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler(charSequence, (CharSequence)"templateStep", n2), charSequenceArray);
    }

    public static final LiteBansModule_356 BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @Nullable String string) {
        if (string == null) {
            return new LiteBansModule_356("", "");
        }
        Object contextObj = null;
        if (ch2.e().i().c("LuckPerms") != null) {
            contextObj = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler();
        }
        if (contextObj != null && (targetObj = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(contextObj, string)) != null) {
            String string2;
            String string3 = LiteBansModule_48.LiteBansModule_31.AsyncBackgroundTask_5(targetObj);
            if (string3 == null) {
                string3 = "";
            }
            if ((string2 = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(targetObj)) == null) {
                string2 = "";
            }
            return new LiteBansModule_356(string3, string2);
        }
        return new LiteBansModule_356("", "");
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender, int n) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, -1);
        if (charSequence == null) {
            charSequence = dZ2.HoverTextFormatter() ? (CharSequence)MessageKey.F : (CharSequence)MessageKey.bS;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, 0L, 8, null);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        String string = ((Object)dZ2.LiteBansModule_31()).toString();
        CharSequence charSequence = ((CharSequence)string).length() == 0 ? (CharSequence)MessageKey.InitializerHandler : (CharSequence)MessageKey.bf;
        CharSequence[] charSequenceArray = new CharSequence[]{"reason", string};
        charSequence = LiteBansModule_243.BaseCoreGenericHandler(charSequence, charSequenceArray);
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, 0L, 8, null);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull String string, @NotNull String string2) {
        CharSequence[] charSequenceArray = new CharSequence[]{"serverOrigin", string2};
        String string3 = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_117.BaseCoreGenericHandler("geoip", (Object)string), charSequenceArray);
        return MessageKey.BaseCoreGenericHandler(string3, true);
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, int n) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, -1);
        if (charSequence == null) {
            charSequence = dZ2.HoverTextFormatter() ? (CharSequence)MessageKey.F : (CharSequence)MessageKey.bS;
        }
        charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, 0L, false, 12, null);
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string, string2, string3, string4, new Date(System.currentTimeMillis()), charSequence, false, 128, null);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence, long l3) {
        CharSequence charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, l3, false, 8, null);
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender, charSequence2, false, 4, null);
    }

    public static /* synthetic */ String BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, CommandSenderWrapper sender, CharSequence charSequence, long l3, int n, Object targetObj) {
        if ((n & 8) != 0) {
            l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, l3);
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CharSequence charSequence, long l3, boolean flag) {
        if (charSequence.length() == 0) {
            return "";
        }
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        CharSequence charSequence2 = null;
        charSequence2 = charSequence;
        boolean flag2 = dZ2.HoverTextFormatter();
        String string = dZ2.e();
        String string2 = dZ2.ServerSyncService().name();
        String string3 = string2.toLowerCase(Locale.ENGLISH);
        string2 = dZ2.m();
        String string4 = dZ2.GnuSparseMapHandler();
        CharSequence charSequence3 = o2.BaseCoreGenericHandler(dZ2.BroadcastService(), false);
        CharSequence charSequence4 = null;
        charSequence4 = dZ2.CommandThrottleService();
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = flag2 ? (CharSequence)MessageKey.LiteBansModule_60 : o2.BaseCoreGenericHandler(dZ2.LiteBansModule_403(), false);
        long l5 = dZ2.LiteBansModule_195();
        CharSequence charSequence6 = l5 <= 0L ? (CharSequence)MessageKey.ay : o2.BaseCoreGenericHandler(l5, true);
        long l7 = l3 - dZ2.BroadcastService();
        long l8 = dZ2.LiteBansModule_403() - l3;
        if (l7 - (long)999 <= 999L) {
            l8 += l7 + (long)450;
        }
        if (l8 <= 999L) {
            l8 += (long)999;
        }
        CharSequence charSequence7 = dZ2.LiteBansModule_31(l3) ? (CharSequence)MessageKey.HikariConfig : (CharSequence)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l8, false, 2, null);
        charSequence2 = GeoIPLookupService.LiteBansModule_31(charSequence2);
        Object targetObj = new CharSequence[]{"duration", charSequence7};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, (CharSequence[])targetObj);
        charSequence2 = ch2.BaseCoreGenericHandler(charSequence2, o2.BaseCoreGenericHandler(dZ2.LiteBansModule_435(), string), string, flag);
        targetObj = configService;
        CharSequence[] charSequenceArray = new CharSequence[]{"removalReason", charSequence4};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"serverScope", ((ConfigService)targetObj).LiteBansModule_31((Object)string2)};
        CharSequence charSequence8 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"serverOrigin", ((ConfigService)targetObj).LiteBansModule_31((Object)string4)};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence8, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateStart", charSequence3};
        CharSequence charSequence9 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateEnd", charSequence5};
        CharSequence charSequence10 = LiteBansModule_243.BaseCoreGenericHandler(charSequence9, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateRemoved", charSequence6};
        CharSequence charSequence11 = LiteBansModule_243.BaseCoreGenericHandler(charSequence10, charSequenceArray);
        charSequenceArray = new CharSequence[]{"date", charSequence3};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence11, charSequenceArray);
        charSequenceArray = new CharSequence[]{"originalDuration", flag2 ? MessageKey.LiteBansModule_60 : PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, dZ2.LiteBansModule_403() - dZ2.BroadcastService(), false, 2, null)};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"timeSince", PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l7, false, 2, null)};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"uuid", (Object)dZ2.DatabaseMonitorService());
        charSequenceArray = new CharSequence[]{"permanent", ((ConfigService)targetObj).LiteBansModule_31(flag2)};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"ipban", ((ConfigService)targetObj).LiteBansModule_31(dZ2.LiteBansModule_241())};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"silent", ((ConfigService)targetObj).LiteBansModule_31(dZ2.AsyncBackgroundTask_5())};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"type", string3};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, charSequence2);
        targetObj = new CharSequence[]{"active", configService.LiteBansModule_31(dZ2.AsyncBackgroundTask_22() && !dZ2.LiteBansModule_31(l3))};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, (CharSequence[])targetObj);
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"geoip", () -> GeoIPLookupService.BaseCoreGenericHandler(configService, dZ2));
        targetObj = new CharSequence[]{"reason", dZ2.LiteBansModule_31()};
        charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence2, (CharSequence[])targetObj);
        if (flag) {
            charSequence2 = MessageKey.BaseCoreGenericHandler(charSequence2, true);
        }
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"idRandom", () -> GeoIPLookupService.LiteBansModule_31(configService, dZ2));
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"SQLiteDriverHandler_4", dZ2.BaseCoreGenericHandler());
        return charSequence2;
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, CharSequence charSequence, long l3, boolean flag, int n, Object targetObj) {
        if ((n & 4) != 0) {
            l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        }
        if ((n & 8) != 0) {
            flag = true;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, l3, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull LiteBansModule_298 iA2, @NotNull CharSequence charSequence, boolean flag) {
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, iA2.BaseCoreGenericHandler(), iA2.BaseCoreGenericHandler(), iA2.LiteBansModule_31(), iA2.i(), null, iA2.LiteBansModule_195(), charSequence, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence, boolean flag) {
        String string = ((Object)charSequence).toString();
        if (GeoIPLookupService.LiteBansModule_31(string, "player")) {
            if (ch2.e().AsyncBackgroundTask_22() == 0) {
                LiteBansModule_159 ec_02 = ch2.e().i();
                ObjectUtilities.LiteBansModule_31(ec_02, "");
                DefaultHandler e12 = ((BungeecordHandler_2)ec_02).LiteBansModule_31();
                string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler(e12, sender)), (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31(e12, sender));
            } else {
                LiteBansModule_356 jT2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, sender.BaseCoreGenericHandler());
                string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler(jT2)), (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31(jT2));
            }
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender.i(), sender.g(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), sender.LiteBansModule_241(), new java.util.Date(), string, flag);
    }

    public static /* synthetic */ String BaseCoreGenericHandler(LiteBansModule_83 ch2, CommandSenderWrapper sender, CharSequence charSequence, boolean flag, int n, Object targetObj) {
        if ((n & 4) != 0) {
            flag = true;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender, charSequence, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable java.util.Date date, @NotNull CharSequence charSequence, boolean flag) {
        String string6;
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        LiteBansModule_145 dy_02 = new LiteBansModule_145();
        Object targetObj = string5;
        if (targetObj == null) {
            targetObj = dy_02.BaseCoreGenericHandler = configService.LiteBansModule_195().LiteBansModule_25();
        }
        if (StringUtilities.LiteBansModule_31((CharSequence)(string6 = ((Object)charSequence).toString()))) {
            return string6;
        }
        string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"geoip", () -> GeoIPLookupService.BaseCoreGenericHandler(configService, string4));
        string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"name", (Object)string), (CharSequence)"target", (Object)string);
        if (GeoIPLookupService.LiteBansModule_31(string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"uuid", (Object)string3), "player")) {
            CharSequence[] charSequenceArray;
            Object contextObj = configService;
            String string7 = ((ConfigService)contextObj).LiteBansModule_195().SetHandler() ? string2 : string;
            contextObj = new LiteBansModule_145();
            ((LiteBansModule_145)contextObj).BaseCoreGenericHandler = "";
            LiteBansModule_145 dy_03 = new LiteBansModule_145();
            dy_03.BaseCoreGenericHandler = "";
            byte by2 = ch2.e().AsyncBackgroundTask_22();
            if (string3 != null && LiteBansModule_346.BaseCoreGenericHandler(string3)) {
                if (by2 == 0) {
                    LiteBansModule_159 ec_02 = ch2.e().i();
                    ObjectUtilities.LiteBansModule_31(ec_02, "");
                    charSequenceArray = ((BungeecordHandler_2)ec_02).LiteBansModule_31();
                    try {
                        UUID uUID = UUID.fromString(string3);
                        string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler((DefaultHandler)charSequenceArray, uUID));
                        string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31((DefaultHandler)charSequenceArray, uUID));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        ConfigService.BaseCoreGenericHandler(configService, illegalArgumentException, 0, 2, null);
                    }
                } else {
                    charSequenceArray = GeoIPLookupService.BaseCoreGenericHandler(ch2, string3);
                    ((LiteBansModule_145)contextObj).BaseCoreGenericHandler = charSequenceArray.LiteBansModule_31();
                    dy_03.BaseCoreGenericHandler = charSequenceArray.e();
                }
            }
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler((LiteBansModule_145)contextObj));
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31(dy_03));
            charSequenceArray = new CharSequence[]{"playerServer", dy_02.BaseCoreGenericHandler};
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)LiteBansModule_243.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerDisplayName", (Object)string7), (CharSequence)"playerName", (Object)string), (CharSequence)"playerUUID", (Object)string3), (CharSequence)"playerIP", (Object)string4), charSequenceArray), (CharSequence)"playerLoginDate", () -> GeoIPLookupService.BaseCoreGenericHandler(ch2, date));
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerBans", () -> GeoIPLookupService.LiteBansModule_31(ch2, string3, dy_02)), (CharSequence)"playerMutes", () -> GeoIPLookupService.BaseCoreGenericHandler(ch2, string3, dy_02)), (CharSequence)"playerWarnings", () -> GeoIPLookupService.c(ch2, string3, dy_02)), (CharSequence)"playerKicks", () -> GeoIPLookupService.AsyncBackgroundTask_5(ch2, string3, dy_02));
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"player", (Object)string7);
        }
        if (!flag) {
            return ((Object)ch2.BaseCoreGenericHandler((CharSequence)string6)).toString();
        }
        return MessageKey.BaseCoreGenericHandler(ch2.BaseCoreGenericHandler((CharSequence)string6), true);
    }

    public static /* synthetic */ String BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, String string2, String string3, String string4, String string5, java.util.Date date, CharSequence charSequence, boolean flag, int n, Object targetObj) {
        if ((n & 0x80) != 0) {
            flag = true;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string2, string3, string4, string5, date, charSequence, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence) {
        String string = ((Object)charSequence).toString();
        try {
            string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"activeBans", () -> GeoIPLookupService.LiteBansModule_31(ch2)), (CharSequence)"activeMutes", () -> GeoIPLookupService.g(ch2)), (CharSequence)"activeWarnings", () -> GeoIPLookupService.e(ch2)), (CharSequence)"totalBans", () -> GeoIPLookupService.AsyncBackgroundTask_5(ch2)), (CharSequence)"totalMutes", () -> GeoIPLookupService.BaseCoreGenericHandler(ch2)), (CharSequence)"totalWarnings", () -> GeoIPLookupService.LiteBansModule_195(ch2)), (CharSequence)"totalKicks", () -> GeoIPLookupService.c(ch2));
        }
        catch (Exception exception) {
            DatabaseMonitorService w2 = (DatabaseMonitorService)ch2.e().BaseCoreGenericHandler(DatabaseMonitorService.class);
            w2.BaseCoreGenericHandler(exception);
        }
        return string;
    }

    public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        boolean flag;
        CharSequence charSequence2;
        CharSequence charSequence3 = "executor";
        CharSequence charSequence4 = "" + '$' + charSequence3;
        charSequence3 = null;
        Object contextObj = new CharSequence[]{"bannerDisplayName", charSequence4};
        CharSequence charSequence5 = LiteBansModule_243.BaseCoreGenericHandler(charSequence, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"banningPlayer", charSequence4};
        CharSequence charSequence6 = LiteBansModule_243.BaseCoreGenericHandler(charSequence5, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"bannerName", charSequence4};
        CharSequence charSequence7 = LiteBansModule_243.BaseCoreGenericHandler(charSequence6, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"bannedBy", charSequence4};
        CharSequence charSequence8 = LiteBansModule_243.BaseCoreGenericHandler(charSequence7, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"mutedBy", charSequence4};
        CharSequence charSequence9 = LiteBansModule_243.BaseCoreGenericHandler(charSequence8, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"warnedBy", charSequence4};
        CharSequence charSequence10 = LiteBansModule_243.BaseCoreGenericHandler(charSequence9, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"kickedBy", charSequence4};
        CharSequence charSequence11 = LiteBansModule_243.BaseCoreGenericHandler(charSequence10, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"kicker", charSequence4};
        CharSequence charSequence12 = LiteBansModule_243.BaseCoreGenericHandler(charSequence11, (CharSequence[])contextObj);
        contextObj = new CharSequence[]{"displayName", charSequence4};
        CharSequence charSequence13 = LiteBansModule_243.BaseCoreGenericHandler(charSequence12, (CharSequence[])contextObj);
        contextObj = new CharSequence[2];
        contextObj[0] = "bannedFrom";
        CharSequence charSequence14 = "dateStart";
        contextObj[1] = "" + '$' + charSequence14;
        CharSequence charSequence15 = LiteBansModule_243.BaseCoreGenericHandler(charSequence13, (CharSequence[])contextObj);
        contextObj = new CharSequence[2];
        contextObj[0] = "bannedUntil";
        charSequence14 = "dateEnd";
        flag3 = false;
        contextObj[1] = "" + '$' + charSequence14;
        CharSequence charSequence16 = LiteBansModule_243.BaseCoreGenericHandler(charSequence15, (CharSequence[])contextObj);
        contextObj = new CharSequence[2];
        contextObj[0] = "banTimeLeft";
        charSequence14 = "duration";
        flag3 = false;
        contextObj[1] = "" + '$' + charSequence14;
        charSequence3 = LiteBansModule_243.BaseCoreGenericHandler(charSequence16, (CharSequence[])contextObj);
        contextObj = BanHandler.LiteBansModule_403.BaseCoreGenericHandler();
        Object resultObj = contextObj;
        Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)contextObj, 10));
        Iterator iterator = resultObj.iterator();
        while (iterator.hasNext()) {
            String string;
            targetObj = iterator.next();
            charSequence2 = (BanHandler)targetObj;
            Collection collection2 = collection;
            flag = false;
            BanHandler a_2 = charSequence2;
            switch (LiteBansModule_275.BaseCoreGenericHandler[a_2.c().ordinal()]) {
                case 1: {
                    string = "banned";
                    break;
                }
                case 2: {
                    string = "muted";
                    break;
                }
                case 3: {
                    string = "warned";
                    break;
                }
                case 4: {
                    string = "kicked";
                    break;
                }
                default: {
                    AssertionUtilities.BaseCoreGenericHandler();
                    throw new CommandExitException();
                }
            }
            collection2.add(string);
        }
        contextObj = (List)collection;
        flag4 = false;
        resultObj = contextObj.iterator();
        while (resultObj.hasNext()) {
            collection = resultObj.next();
            String string = (String)((Object)collection);
            targetObj = new CharSequence[2];
            targetObj[0] = string + "Player";
            charSequence2 = "playerDisplayName";
            flag = false;
            targetObj[1] = "" + '$' + charSequence2;
            charSequence3 = LiteBansModule_243.BaseCoreGenericHandler(charSequence3, targetObj);
            targetObj = new CharSequence[2];
            targetObj[0] = string + "IP";
            charSequence2 = "playerDisplayName";
            flag = false;
            targetObj[1] = "" + '$' + charSequence2;
            charSequence3 = LiteBansModule_243.BaseCoreGenericHandler(charSequence3, targetObj);
        }
        return charSequence3;
    }

    public static final String LiteBansModule_31(@NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{"base", MessageKey.LiteBansModule_67};
        CharSequence charSequence2 = LiteBansModule_243.BaseCoreGenericHandler(charSequence, charSequenceArray);
        charSequenceArray = new CharSequence[]{"appealMessage", MessageKey.CommandThrottleService};
        return LiteBansModule_243.BaseCoreGenericHandler(charSequence2, charSequenceArray);
    }

    public static final CharSequence c(@NotNull CharSequence charSequence) {
        return "" + '$' + charSequence;
    }

    public static final boolean LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence2;
        return StringUtilities.BaseCoreGenericHandler(charSequence, (CharSequence)("" + '$' + charSequence3), false, 2, null);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        return StringUtilities.BaseCoreGenericHandler(charSequence, charSequence2, false, 2, null) && GeoIPLookupService.LiteBansModule_31(charSequence, charSequence2);
    }

    private static final Object BaseCoreGenericHandler(ConfigService configService, SilentHandler dZ2) {
        GeoIPLookupService_2 fv_02 = configService.LiteBansModule_241();
        return fv_02 != null ? fv_02.LiteBansModule_31(dZ2.PunishmentTableService()) : null;
    }

    private static final Object LiteBansModule_31(ConfigService configService, SilentHandler dZ2) {
        return configService.Utf8Handler_2().BaseCoreGenericHandler(dZ2.BaseCoreGenericHandler());
    }

    private static final Object BaseCoreGenericHandler(DefaultHandler e12, CommandSenderWrapper sender) {
        return MessageKey.BaseCoreGenericHandler(e12.BaseCoreGenericHandler(sender.c()), true);
    }

    private static final Object LiteBansModule_31(DefaultHandler e12, CommandSenderWrapper sender) {
        return MessageKey.BaseCoreGenericHandler(e12.LiteBansModule_31(sender.c()), true);
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_356 jT2) {
        return jT2.LiteBansModule_31();
    }

    private static final Object LiteBansModule_31(LiteBansModule_356 jT2) {
        return jT2.e();
    }

    private static final Object BaseCoreGenericHandler(ConfigService configService, String string) {
        return configService.LiteBansModule_31(string);
    }

    private static final Object BaseCoreGenericHandler(DefaultHandler e12, UUID uUID) {
        return e12.BaseCoreGenericHandler(uUID);
    }

    private static final Object LiteBansModule_31(DefaultHandler e12, UUID uUID) {
        return e12.LiteBansModule_31(uUID);
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_145 dy_02) {
        return dy_02.BaseCoreGenericHandler;
    }

    private static final Object LiteBansModule_31(LiteBansModule_145 dy_02) {
        return dy_02.BaseCoreGenericHandler;
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_83 ch2, java.util.Date date) {
        java.util.Date date2 = date;
        return ((BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(date2 != null ? date2.getTime() : 0L, true);
    }

    private static final Object LiteBansModule_31(LiteBansModule_83 ch2, String string, LiteBansModule_145 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_122.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.LiteBansModule_241);
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, LiteBansModule_145 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_122.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.GnuSparseMapHandler);
    }

    private static final Object c(LiteBansModule_83 ch2, String string, LiteBansModule_145 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_122.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.c);
    }

    private static final Object AsyncBackgroundTask_5(LiteBansModule_83 ch2, String string, LiteBansModule_145 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_122.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.g);
    }

    private static final Object LiteBansModule_31(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.Utf8Handler_2, null, true, 2, null);
    }

    private static final Object g(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.m, null, true, 2, null);
    }

    private static final Object e(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.LiteBansModule_31, null, true, 2, null);
    }

    private static final Object AsyncBackgroundTask_5(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.Utf8Handler_2, null, false, 6, null);
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.m, null, false, 6, null);
    }

    private static final Object LiteBansModule_195(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.LiteBansModule_31, null, false, 6, null);
    }

    private static final Object c(LiteBansModule_83 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.GnuSparseMapHandler, null, false, 6, null);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"templateStep", "templateName", "", "", "LuckPerms", "", "", "", "", "reason", "geoip", "serverOrigin", "", "", "duration", "removalReason", "serverScope", "serverOrigin", "dateStart", "dateEnd", "dateRemoved", "date", "originalDuration", "timeSince", "uuid", "permanent", "ipban", "silent", "type", "active", "geoip", "reason", "idRandom", "SQLiteDriverHandler_4", "player", "", "playerPrefix", "playerSuffix", "playerPrefix", "playerSuffix", "geoip", "name", "target", "uuid", "player", "", "", "", "playerPrefix", "playerSuffix", "playerPrefix", "playerSuffix", "playerDisplayName", "playerName", "playerUUID", "playerIP", "playerServer", "playerLoginDate", "playerBans", "playerMutes", "playerWarnings", "playerKicks", "player", "activeBans", "activeMutes", "activeWarnings", "totalBans", "totalMutes", "totalWarnings", "totalKicks", "executor", "bannerDisplayName", "banningPlayer", "bannerName", "bannedBy", "mutedBy", "warnedBy", "kickedBy", "kicker", "displayName", "bannedFrom", "dateStart", "bannedUntil", "dateEnd", "banTimeLeft", "duration", "banned", "muted", "warned", "kicked", "Player", "playerDisplayName", "IP", "playerDisplayName", "base", "appealMessage"};
    }

    static {
        GeoIPLookupService.BaseCoreGenericHandler();
    }
}

