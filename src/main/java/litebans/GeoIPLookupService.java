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
    public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @Nullable Object object) {
        CharSequence charSequence3 = charSequence2;
        boolean flag = false;
        return LiteBansModule_433.LiteBansModule_31.BaseCoreGenericHandler((Object)charSequence, (Object)("" + '$' + charSequence3), object);
    }

    public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull LiteBansModule_146 messageSupplier) {
        return GeoIPLookupService.BaseCoreGenericHandler(charSequence, charSequence2) ? GeoIPLookupService.BaseCoreGenericHandler(charSequence, charSequence2, messageSupplier.BaseCoreGenericHandler()) : ((Object)charSequence).toString();
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, int n, int n2) {
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        Object object = dZ2;
        boolean flag = false;
        if (object != null && ((SilentHandler)object).r() != -1 && (object = configService.AsyncBackgroundTask_21().BaseCoreGenericHandler(dZ2)) != null) {
            Object object2;
            LiteBansModule_174 eM2 = configService.AsyncBackgroundTask_21().BaseCoreGenericHandler(dZ2.ServerSyncService(), (LiteBansModule_65)object);
            int n3 = n;
            LiteBansModule_66 c52 = null;
            if (eM2 != null) {
                if (n3 == -1) {
                    String string = dZ2.DatabaseMonitorService();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    object2 = ch2.BaseCoreGenericHandler(string, dZ2.PunishmentTableService(), eM2, (LiteBansModule_65)object);
                    n3 = (int)Math.floor(((Number)((LiteBansModule_354)object2).e()).doubleValue()) + n2;
                }
                c52 = eM2.BaseCoreGenericHandler(n3);
            } else {
                if (n3 == -1) {
                    String string = dZ2.DatabaseMonitorService();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    n3 = ch2.BaseCoreGenericHandler((LiteBansModule_65)object, string, dZ2.PunishmentTableService()) + n2;
                }
                c52 = ((LiteBansModule_65)object).BaseCoreGenericHandler(n3);
            }
            String string = c52.e();
            Object object3 = object2 = string != null ? (CharSequence)string : (CharSequence)((LiteBansModule_65)object).LiteBansModule_240().e();
            if (object2 == null) {
                return null;
            }
            return GeoIPLookupService.BaseCoreGenericHandler(ch2, (CharSequence)object2, (LiteBansModule_65)object, n3);
        }
        return null;
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_82 ch2, SilentHandler dZ2, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = -1;
        }
        if ((n3 & 4) != 0) {
            n2 = -1;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, n2);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence, @NotNull NoneHandler_2 cz2) {
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, charSequence, cz2.g(), cz2.D());
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence, @NotNull LiteBansModule_65 c12, int n) {
        LiteBansModule_65 c13 = c12;
        boolean flag = false;
        CharSequence charSequence2 = ObjectUtilities.BaseCoreGenericHandler(c13.LiteBansModule_194() & 0xFF, 0xFFFFFFFF & 0xFF) < 0 ? c12.g() : MessageKey.ay;
        int n2 = n + 1;
        CharSequence[] charSequenceArray = new CharSequence[]{"templateName", charSequence2};
        return LiteBansModule_242.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler(charSequence, (CharSequence)"templateStep", n2), charSequenceArray);
    }

    public static final LiteBansModule_354 BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable String string) {
        Object object;
        if (string == null) {
            return new LiteBansModule_354("", "");
        }
        Object object2 = null;
        if (ch2.e().i().c("LuckPerms") != null) {
            object2 = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler();
        }
        if (object2 != null && (object = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object2, string)) != null) {
            String string2;
            String string3 = LiteBansModule_48.LiteBansModule_31.AsyncBackgroundTask_5(object);
            if (string3 == null) {
                string3 = "";
            }
            if ((string2 = LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler(object)) == null) {
                string2 = "";
            }
            return new LiteBansModule_354(string3, string2);
        }
        return new LiteBansModule_354("", "");
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender, int n) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, -1);
        if (charSequence == null) {
            charSequence = dZ2.HoverTextFormatter() ? (CharSequence)MessageKey.F : (CharSequence)MessageKey.bS;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, 0L, 8, null);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        String string = ((Object)dZ2.LiteBansModule_31()).toString();
        CharSequence charSequence = ((CharSequence)string).length() == 0 ? (CharSequence)MessageKey.InitializerHandler : (CharSequence)MessageKey.bf;
        CharSequence[] charSequenceArray = new CharSequence[]{"reason", string};
        charSequence = LiteBansModule_242.BaseCoreGenericHandler(charSequence, charSequenceArray);
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, 0L, 8, null);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull String string, @NotNull String string2) {
        CharSequence[] charSequenceArray = new CharSequence[]{"serverOrigin", string2};
        String string3 = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_116.BaseCoreGenericHandler("geoip", (Object)string), charSequenceArray);
        return MessageKey.BaseCoreGenericHandler(string3, true);
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, int n) {
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, -1);
        if (charSequence == null) {
            charSequence = dZ2.HoverTextFormatter() ? (CharSequence)MessageKey.F : (CharSequence)MessageKey.bS;
        }
        charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, 0L, false, 12, null);
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string, string2, string3, string4, new Date(System.currentTimeMillis()), charSequence, false, 128, null);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence, long l3) {
        CharSequence charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, l3, false, 8, null);
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender, charSequence2, false, 4, null);
    }

    public static /* synthetic */ String BaseCoreGenericHandler(LiteBansModule_82 ch2, SilentHandler dZ2, CommandSenderWrapper sender, CharSequence charSequence, long l3, int n, Object object) {
        if ((n & 8) != 0) {
            l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, l3);
    }

    public static final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull CharSequence charSequence, long l3, boolean flag) {
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
        CharSequence charSequence5 = flag2 ? (CharSequence)MessageKey.LiteBansModule_60 : o2.BaseCoreGenericHandler(dZ2.LiteBansModule_401(), false);
        long l5 = dZ2.LiteBansModule_194();
        CharSequence charSequence6 = l5 <= 0L ? (CharSequence)MessageKey.ay : o2.BaseCoreGenericHandler(l5, true);
        long l7 = l3 - dZ2.BroadcastService();
        long l8 = dZ2.LiteBansModule_401() - l3;
        if (l7 - (long)999 <= 999L) {
            l8 += l7 + (long)450;
        }
        if (l8 <= 999L) {
            l8 += (long)999;
        }
        CharSequence charSequence7 = dZ2.LiteBansModule_31(l3) ? (CharSequence)MessageKey.HikariConfig : (CharSequence)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l8, false, 2, null);
        charSequence2 = GeoIPLookupService.LiteBansModule_31(charSequence2);
        Object object = new CharSequence[]{"duration", charSequence7};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, (CharSequence[])object);
        charSequence2 = ch2.BaseCoreGenericHandler(charSequence2, o2.BaseCoreGenericHandler(dZ2.LiteBansModule_433(), string), string, flag);
        object = configService;
        boolean flag3 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{"removalReason", charSequence4};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"serverScope", ((ConfigService)object).LiteBansModule_31((Object)string2)};
        CharSequence charSequence8 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"serverOrigin", ((ConfigService)object).LiteBansModule_31((Object)string4)};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence8, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateStart", charSequence3};
        CharSequence charSequence9 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateEnd", charSequence5};
        CharSequence charSequence10 = LiteBansModule_242.BaseCoreGenericHandler(charSequence9, charSequenceArray);
        charSequenceArray = new CharSequence[]{"dateRemoved", charSequence6};
        CharSequence charSequence11 = LiteBansModule_242.BaseCoreGenericHandler(charSequence10, charSequenceArray);
        charSequenceArray = new CharSequence[]{"date", charSequence3};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence11, charSequenceArray);
        charSequenceArray = new CharSequence[]{"originalDuration", flag2 ? MessageKey.LiteBansModule_60 : PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, dZ2.LiteBansModule_401() - dZ2.BroadcastService(), false, 2, null)};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"timeSince", PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l7, false, 2, null)};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"uuid", (Object)dZ2.DatabaseMonitorService());
        charSequenceArray = new CharSequence[]{"permanent", ((ConfigService)object).LiteBansModule_31(flag2)};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"ipban", ((ConfigService)object).LiteBansModule_31(dZ2.LiteBansModule_240())};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"silent", ((ConfigService)object).LiteBansModule_31(dZ2.AsyncBackgroundTask_5())};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequenceArray = new CharSequence[]{"type", string3};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, charSequence2);
        object = new CharSequence[]{"active", configService.LiteBansModule_31(dZ2.AsyncBackgroundTask_22() && !dZ2.LiteBansModule_31(l3))};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, (CharSequence[])object);
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"geoip", () -> GeoIPLookupService.BaseCoreGenericHandler(configService, dZ2));
        object = new CharSequence[]{"reason", dZ2.LiteBansModule_31()};
        charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence2, (CharSequence[])object);
        if (flag) {
            charSequence2 = MessageKey.BaseCoreGenericHandler(charSequence2, true);
        }
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"idRandom", () -> GeoIPLookupService.LiteBansModule_31(configService, dZ2));
        charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"SQLiteDriverHandler_4", dZ2.BaseCoreGenericHandler());
        return charSequence2;
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_82 ch2, SilentHandler dZ2, CharSequence charSequence, long l3, boolean flag, int n, Object object) {
        if ((n & 4) != 0) {
            l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        }
        if ((n & 8) != 0) {
            flag = true;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, l3, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull LiteBansModule_297 iA2, @NotNull CharSequence charSequence, boolean flag) {
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, iA2.BaseCoreGenericHandler(), iA2.BaseCoreGenericHandler(), iA2.LiteBansModule_31(), iA2.i(), null, iA2.LiteBansModule_194(), charSequence, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence, boolean flag) {
        String string = ((Object)charSequence).toString();
        if (GeoIPLookupService.LiteBansModule_31(string, "player")) {
            if (ch2.e().AsyncBackgroundTask_22() == 0) {
                LiteBansModule_158 ec_02 = ch2.e().i();
                ObjectUtilities.LiteBansModule_31(ec_02, "");
                DefaultHandler e12 = ((BungeecordHandler_2)ec_02).LiteBansModule_31();
                string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler(e12, sender)), (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31(e12, sender));
            } else {
                LiteBansModule_354 jT2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, sender.BaseCoreGenericHandler());
                string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler(jT2)), (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31(jT2));
            }
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender.i(), sender.g(), sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), sender.LiteBansModule_240(), new java.util.Date(), string, flag);
    }

    public static /* synthetic */ String BaseCoreGenericHandler(LiteBansModule_82 ch2, CommandSenderWrapper sender, CharSequence charSequence, boolean flag, int n, Object object) {
        if ((n & 4) != 0) {
            flag = true;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender, charSequence, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable java.util.Date date, @NotNull CharSequence charSequence, boolean flag) {
        String string6;
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        LiteBansModule_144 dy_02 = new LiteBansModule_144();
        Object object = string5;
        if (object == null) {
            object = dy_02.BaseCoreGenericHandler = configService.LiteBansModule_194().LiteBansModule_25();
        }
        if (StringUtilities.LiteBansModule_31((CharSequence)(string6 = ((Object)charSequence).toString()))) {
            return string6;
        }
        string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"geoip", () -> GeoIPLookupService.BaseCoreGenericHandler(configService, string4));
        string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"name", (Object)string), (CharSequence)"target", (Object)string);
        if (GeoIPLookupService.LiteBansModule_31(string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"uuid", (Object)string3), "player")) {
            CharSequence[] charSequenceArray;
            Object object2 = configService;
            boolean flag2 = false;
            String string7 = ((ConfigService)object2).LiteBansModule_194().SetHandler() ? string2 : string;
            object2 = new LiteBansModule_144();
            ((LiteBansModule_144)object2).BaseCoreGenericHandler = "";
            LiteBansModule_144 dy_03 = new LiteBansModule_144();
            dy_03.BaseCoreGenericHandler = "";
            byte by2 = ch2.e().AsyncBackgroundTask_22();
            if (string3 != null && HexEncodingHelper.BaseCoreGenericHandler(string3)) {
                if (by2 == 0) {
                    LiteBansModule_158 ec_02 = ch2.e().i();
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
                    ((LiteBansModule_144)object2).BaseCoreGenericHandler = charSequenceArray.LiteBansModule_31();
                    dy_03.BaseCoreGenericHandler = charSequenceArray.e();
                }
            }
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerPrefix", () -> GeoIPLookupService.BaseCoreGenericHandler((LiteBansModule_144)object2));
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerSuffix", () -> GeoIPLookupService.LiteBansModule_31(dy_03));
            charSequenceArray = new CharSequence[]{"playerServer", dy_02.BaseCoreGenericHandler};
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)LiteBansModule_242.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerDisplayName", (Object)string7), (CharSequence)"playerName", (Object)string), (CharSequence)"playerUUID", (Object)string3), (CharSequence)"playerIP", (Object)string4), charSequenceArray), (CharSequence)"playerLoginDate", () -> GeoIPLookupService.BaseCoreGenericHandler(ch2, date));
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"playerBans", () -> GeoIPLookupService.LiteBansModule_31(ch2, string3, dy_02)), (CharSequence)"playerMutes", () -> GeoIPLookupService.BaseCoreGenericHandler(ch2, string3, dy_02)), (CharSequence)"playerWarnings", () -> GeoIPLookupService.c(ch2, string3, dy_02)), (CharSequence)"playerKicks", () -> GeoIPLookupService.AsyncBackgroundTask_5(ch2, string3, dy_02));
            string6 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string6, (CharSequence)"player", (Object)string7);
        }
        if (!flag) {
            return ((Object)ch2.BaseCoreGenericHandler((CharSequence)string6)).toString();
        }
        return MessageKey.BaseCoreGenericHandler(ch2.BaseCoreGenericHandler((CharSequence)string6), true);
    }

    public static /* synthetic */ String BaseCoreGenericHandler(LiteBansModule_82 ch2, String string, String string2, String string3, String string4, String string5, java.util.Date date, CharSequence charSequence, boolean flag, int n, Object object) {
        if ((n & 0x80) != 0) {
            flag = true;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string2, string3, string4, string5, date, charSequence, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence) {
        String string = ((Object)charSequence).toString();
        try {
            string = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"activeBans", () -> GeoIPLookupService.LiteBansModule_31(ch2)), (CharSequence)"activeMutes", () -> GeoIPLookupService.g(ch2)), (CharSequence)"activeWarnings", () -> GeoIPLookupService.e(ch2)), (CharSequence)"totalBans", () -> GeoIPLookupService.AsyncBackgroundTask_5(ch2)), (CharSequence)"totalMutes", () -> GeoIPLookupService.BaseCoreGenericHandler(ch2)), (CharSequence)"totalWarnings", () -> GeoIPLookupService.LiteBansModule_194(ch2)), (CharSequence)"totalKicks", () -> GeoIPLookupService.c(ch2));
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
        Object object;
        CharSequence charSequence3 = "executor";
        boolean flag2 = false;
        CharSequence charSequence4 = "" + '$' + charSequence3;
        charSequence3 = null;
        Object object2 = new CharSequence[]{"bannerDisplayName", charSequence4};
        CharSequence charSequence5 = LiteBansModule_242.BaseCoreGenericHandler(charSequence, (CharSequence[])object2);
        object2 = new CharSequence[]{"banningPlayer", charSequence4};
        CharSequence charSequence6 = LiteBansModule_242.BaseCoreGenericHandler(charSequence5, (CharSequence[])object2);
        object2 = new CharSequence[]{"bannerName", charSequence4};
        CharSequence charSequence7 = LiteBansModule_242.BaseCoreGenericHandler(charSequence6, (CharSequence[])object2);
        object2 = new CharSequence[]{"bannedBy", charSequence4};
        CharSequence charSequence8 = LiteBansModule_242.BaseCoreGenericHandler(charSequence7, (CharSequence[])object2);
        object2 = new CharSequence[]{"mutedBy", charSequence4};
        CharSequence charSequence9 = LiteBansModule_242.BaseCoreGenericHandler(charSequence8, (CharSequence[])object2);
        object2 = new CharSequence[]{"warnedBy", charSequence4};
        CharSequence charSequence10 = LiteBansModule_242.BaseCoreGenericHandler(charSequence9, (CharSequence[])object2);
        object2 = new CharSequence[]{"kickedBy", charSequence4};
        CharSequence charSequence11 = LiteBansModule_242.BaseCoreGenericHandler(charSequence10, (CharSequence[])object2);
        object2 = new CharSequence[]{"kicker", charSequence4};
        CharSequence charSequence12 = LiteBansModule_242.BaseCoreGenericHandler(charSequence11, (CharSequence[])object2);
        object2 = new CharSequence[]{"displayName", charSequence4};
        CharSequence charSequence13 = LiteBansModule_242.BaseCoreGenericHandler(charSequence12, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = "bannedFrom";
        CharSequence charSequence14 = "dateStart";
        boolean flag3 = false;
        object2[1] = "" + '$' + charSequence14;
        CharSequence charSequence15 = LiteBansModule_242.BaseCoreGenericHandler(charSequence13, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = "bannedUntil";
        charSequence14 = "dateEnd";
        flag3 = false;
        object2[1] = "" + '$' + charSequence14;
        CharSequence charSequence16 = LiteBansModule_242.BaseCoreGenericHandler(charSequence15, (CharSequence[])object2);
        object2 = new CharSequence[2];
        object2[0] = "banTimeLeft";
        charSequence14 = "duration";
        flag3 = false;
        object2[1] = "" + '$' + charSequence14;
        charSequence3 = LiteBansModule_242.BaseCoreGenericHandler(charSequence16, (CharSequence[])object2);
        object2 = BanHandler.LiteBansModule_401.BaseCoreGenericHandler();
        boolean flag4 = false;
        Object object3 = object2;
        Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object2, 10));
        boolean flag5 = false;
        Iterator iterator = object3.iterator();
        while (iterator.hasNext()) {
            String string;
            object = iterator.next();
            charSequence2 = (BanHandler)object;
            Collection collection2 = collection;
            flag = false;
            BanHandler a_2 = charSequence2;
            boolean flag6 = false;
            switch (LiteBansModule_274.BaseCoreGenericHandler[a_2.c().ordinal()]) {
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
        object2 = (List)collection;
        flag4 = false;
        object3 = object2.iterator();
        while (object3.hasNext()) {
            collection = object3.next();
            String string = (String)((Object)collection);
            boolean flag7 = false;
            object = new CharSequence[2];
            object[0] = string + "Player";
            charSequence2 = "playerDisplayName";
            flag = false;
            object[1] = "" + '$' + charSequence2;
            charSequence3 = LiteBansModule_242.BaseCoreGenericHandler(charSequence3, object);
            object = new CharSequence[2];
            object[0] = string + "IP";
            charSequence2 = "playerDisplayName";
            flag = false;
            object[1] = "" + '$' + charSequence2;
            charSequence3 = LiteBansModule_242.BaseCoreGenericHandler(charSequence3, object);
        }
        return charSequence3;
    }

    public static final String LiteBansModule_31(@NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{"base", MessageKey.LiteBansModule_66};
        CharSequence charSequence2 = LiteBansModule_242.BaseCoreGenericHandler(charSequence, charSequenceArray);
        charSequenceArray = new CharSequence[]{"appealMessage", MessageKey.CommandThrottleService};
        return LiteBansModule_242.BaseCoreGenericHandler(charSequence2, charSequenceArray);
    }

    public static final CharSequence c(@NotNull CharSequence charSequence) {
        boolean flag = false;
        return "" + '$' + charSequence;
    }

    public static final boolean LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence2;
        boolean flag = false;
        return StringUtilities.BaseCoreGenericHandler(charSequence, (CharSequence)("" + '$' + charSequence3), false, 2, null);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        return StringUtilities.BaseCoreGenericHandler(charSequence, charSequence2, false, 2, null) && GeoIPLookupService.LiteBansModule_31(charSequence, charSequence2);
    }

    private static final Object BaseCoreGenericHandler(ConfigService configService, SilentHandler dZ2) {
        GeoIPLookupService_2 fv_02 = configService.LiteBansModule_240();
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

    private static final Object BaseCoreGenericHandler(LiteBansModule_354 jT2) {
        return jT2.LiteBansModule_31();
    }

    private static final Object LiteBansModule_31(LiteBansModule_354 jT2) {
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

    private static final Object BaseCoreGenericHandler(LiteBansModule_144 dy_02) {
        return dy_02.BaseCoreGenericHandler;
    }

    private static final Object LiteBansModule_31(LiteBansModule_144 dy_02) {
        return dy_02.BaseCoreGenericHandler;
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_82 ch2, java.util.Date date) {
        java.util.Date date2 = date;
        return ((BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(date2 != null ? date2.getTime() : 0L, true);
    }

    private static final Object LiteBansModule_31(LiteBansModule_82 ch2, String string, LiteBansModule_144 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_121.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.LiteBansModule_240);
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_82 ch2, String string, LiteBansModule_144 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_121.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.GnuSparseMapHandler);
    }

    private static final Object c(LiteBansModule_82 ch2, String string, LiteBansModule_144 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_121.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.c);
    }

    private static final Object AsyncBackgroundTask_5(LiteBansModule_82 ch2, String string, LiteBansModule_144 dy_02) {
        return ch2.BaseCoreGenericHandler(LiteBansModule_121.BaseCoreGenericHandler(DescHandler.GnuSparseMapHandler, ch2, string, (String)dy_02.BaseCoreGenericHandler, null, false, null, false, null, null, 252, null), BanHandler.g);
    }

    private static final Object LiteBansModule_31(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.Utf8Handler_2, null, true, 2, null);
    }

    private static final Object g(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.m, null, true, 2, null);
    }

    private static final Object e(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.LiteBansModule_31, null, true, 2, null);
    }

    private static final Object AsyncBackgroundTask_5(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.Utf8Handler_2, null, false, 6, null);
    }

    private static final Object BaseCoreGenericHandler(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.m, null, false, 6, null);
    }

    private static final Object LiteBansModule_194(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.LiteBansModule_31, null, false, 6, null);
    }

    private static final Object c(LiteBansModule_82 ch2) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, BansHandler_2.GnuSparseMapHandler, null, false, 6, null);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"templateStep", "templateName", "", "", "LuckPerms", "", "", "", "", "reason", "geoip", "serverOrigin", "", "", "duration", "removalReason", "serverScope", "serverOrigin", "dateStart", "dateEnd", "dateRemoved", "date", "originalDuration", "timeSince", "uuid", "permanent", "ipban", "silent", "type", "active", "geoip", "reason", "idRandom", "SQLiteDriverHandler_4", "player", "", "playerPrefix", "playerSuffix", "playerPrefix", "playerSuffix", "geoip", "name", "target", "uuid", "player", "", "", "", "playerPrefix", "playerSuffix", "playerPrefix", "playerSuffix", "playerDisplayName", "playerName", "playerUUID", "playerIP", "playerServer", "playerLoginDate", "playerBans", "playerMutes", "playerWarnings", "playerKicks", "player", "activeBans", "activeMutes", "activeWarnings", "totalBans", "totalMutes", "totalWarnings", "totalKicks", "executor", "bannerDisplayName", "banningPlayer", "bannerName", "bannedBy", "mutedBy", "warnedBy", "kickedBy", "kicker", "displayName", "bannedFrom", "dateStart", "bannedUntil", "dateEnd", "banTimeLeft", "duration", "banned", "muted", "warned", "kicked", "Player", "playerDisplayName", "IP", "playerDisplayName", "base", "appealMessage"};
    }

    }

