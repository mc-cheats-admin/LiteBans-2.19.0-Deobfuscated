package litebans;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AllHandler_3 {
        public static boolean LiteBansModule_31(@NotNull LiteBansModule_83 ch2) {
        return !ch2.LiteBansModule_31();
    }

    public static DatabaseMonitorService BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2) {
        return (DatabaseMonitorService)ch2.e().BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public static /* synthetic */ LiteBansModule_298 BaseCoreGenericHandler(LiteBansModule_83 ch2, LiteBansModule_298 iA2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(iA2, flag);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, String string2, String string3, boolean flag, boolean flag2, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 8) != 0) {
            flag = true;
        }
        if ((n & 0x10) != 0) {
            flag2 = true;
        }
        ch2.BaseCoreGenericHandler(string, string2, string3, flag, flag2);
    }

    public static /* synthetic */ ResultSet BaseCoreGenericHandler(LiteBansModule_83 ch2, UUID uUID, int n, int n2, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return ch2.BaseCoreGenericHandler(uUID, n);
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(LiteBansModule_83 ch2, UUID uUID, BanHandler a_2, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            a_2 = BanHandler.LiteBansModule_241;
        }
        return ch2.BaseCoreGenericHandler(uUID, a_2);
    }

    public static /* synthetic */ List LiteBansModule_31(LiteBansModule_83 ch2, String string, int n, int n2, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            n = 256;
        }
        return ch2.BaseCoreGenericHandler(string, n);
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            flag = false;
        }
        return ch2.BaseCoreGenericHandler(dZ2, flag);
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, String string2, BanHandler a_2, boolean flag, boolean flag2, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            a_2 = BanHandler.LiteBansModule_241;
        }
        if ((n & 8) != 0) {
            flag = false;
        }
        if ((n & 0x10) != 0) {
            flag2 = false;
        }
        return ch2.BaseCoreGenericHandler(string, string2, a_2, flag, flag2);
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, String string2, BanHandler a_2, String string3, boolean flag, boolean flag2, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            a_2 = BanHandler.LiteBansModule_241;
        }
        if ((n & 0x10) != 0) {
            flag = false;
        }
        if ((n & 0x20) != 0) {
            flag2 = false;
        }
        return ch2.BaseCoreGenericHandler(string, string2, a_2, string3, flag, flag2);
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, BanHandler a_2, String string2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 4) != 0) {
            string2 = "__ALL__";
        }
        if ((n & 8) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(string, a_2, string2, flag);
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, long l3, BanHandler a_2, String string, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 8) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(l3, a_2, string, flag);
    }

    public static /* synthetic */ long BaseCoreGenericHandler(LiteBansModule_83 ch2, BansHandler_2 kL2, String string, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string = "__ALL__";
        }
        if ((n & 4) != 0) {
            flag = false;
        }
        return ch2.BaseCoreGenericHandler(kL2, string, flag);
    }

    public static /* synthetic */ SilentHandler BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, String string2, String string3, BanHandler a_2, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 8) != 0) {
            a_2 = BanHandler.LiteBansModule_241;
        }
        return ch2.BaseCoreGenericHandler(string, string2, string3, a_2);
    }

    public static /* synthetic */ List BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, int n, int n2, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n2 & 2) != 0) {
            n = 8;
        }
        return ch2.LiteBansModule_31(string, n);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, String string, String string2, CharSequence charSequence, SilentHandler dZ2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 0x10) != 0) {
            flag = false;
        }
        ch2.BaseCoreGenericHandler(string, string2, charSequence, dZ2, flag);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, String string, String string2, CharSequence charSequence, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            string = null;
        }
        if ((n & 4) != 0) {
            string2 = null;
        }
        if ((n & 8) != 0) {
            charSequence = "";
        }
        if ((n & 0x10) != 0) {
            flag = false;
        }
        ch2.BaseCoreGenericHandler(dZ2, string, string2, charSequence, flag);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_83 ch2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 1) != 0) {
            flag = false;
        }
        ch2.BaseCoreGenericHandler(flag);
    }

    public static List BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull ResultSet resultSet, @NotNull BanHandler a_2) {
        ArrayList arrayList;
        if (!resultSet.next()) {
            return CollectionUtilities.e();
        }
        ArrayList arrayList2 = arrayList = new ArrayList();
        do {
            ((Collection)arrayList2).add(ch2.BaseCoreGenericHandler(resultSet, a_2));
        } while (resultSet.next());
        return arrayList;
    }

    public static List BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull LiteBansModule_298 iA2, @NotNull BanHandler a_2, @NotNull String string, boolean flag, int n) {
        return ch2.BaseCoreGenericHandler(iA2.LiteBansModule_31(), iA2.i(), a_2, string, flag, n);
    }

    public static List BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, int n) {
        SilentHandler dZ3 = dZ2;
        return ch2.BaseCoreGenericHandler(dZ3.DatabaseMonitorService(), dZ3.PunishmentTableService(), dZ3.ServerSyncService(), dZ3.m(), dZ3.AsyncBackgroundTask_22(), n);
    }

    public static List BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CommandSenderWrapper sender, @NotNull BanHandler a_2, boolean flag, int n) {
        CommandSenderWrapper senderWrapper = sender;
        String string = senderWrapper.BaseCoreGenericHandler();
        String string2 = senderWrapper.LiteBansModule_31();
        String string3 = senderWrapper.LiteBansModule_241();
        if (string3 == null) {
            string3 = ch2.AsyncBackgroundTask_5().ServerSyncService();
        }
        return ch2.BaseCoreGenericHandler(string, string2, a_2, string3, flag, n);
    }

    public static String BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CommandSenderWrapper sender) {
        DiscordWebhookClient eG2 = ((ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195();
        return sender.LiteBansModule_195() ? eG2.SQLiteDriverHandler() : (eG2.SetHandler() ? sender.g() : sender.i());
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @NotNull CommandSenderWrapper sender) {
        return AllHandler_3.BaseCoreGenericHandler(ch2, charSequence, ch2.BaseCoreGenericHandler(sender), sender.BaseCoreGenericHandler(), false, 4, null);
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, boolean flag) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        CharSequence charSequence2 = charSequence;
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        String string3 = string;
        String string4 = "";
        String string5 = "";
        if (string2 != null && (GeoIPLookupService.LiteBansModule_31(charSequence2, "executorPrefix") || GeoIPLookupService.LiteBansModule_31(charSequence2, "executorSuffix"))) {
            byte by2 = ch2.e().AsyncBackgroundTask_22();
            if (by2 == 0) {
                LiteBansModule_159 ec_02 = ch2.e().i();
                ObjectUtilities.LiteBansModule_31(ec_02, "");
                DefaultHandler e12 = ((BungeecordHandler_2)ec_02).LiteBansModule_31();
                CommandSenderWrapper sender = o2.BaseCoreGenericHandler(string2);
                if (sender != null) {
                    string4 = e12.BaseCoreGenericHandler(sender.c());
                    string5 = e12.LiteBansModule_31(sender.c());
                } else if (LiteBansModule_346.BaseCoreGenericHandler(string2)) {
                    try {
                        UUID uUID = UUID.fromString(string2);
                        string4 = e12.BaseCoreGenericHandler(uUID);
                        string5 = e12.LiteBansModule_31(uUID);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        configService.BaseCoreGenericHandler(illegalArgumentException, 0);
                    }
                }
            } else {
                LiteBansModule_356 jT2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, string2);
                string4 = (String)jT2.LiteBansModule_31();
                string5 = (String)jT2.e();
            }
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"null")) {
            string4 = "";
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string5, (Object)"null")) {
            string5 = "";
        }
        if (flag) {
            string4 = MessageKey.BaseCoreGenericHandler(string4, true);
            string5 = MessageKey.BaseCoreGenericHandler(string5, true);
            string3 = string3 + BlackHandler.PunishmentTableService;
        }
        return GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler(charSequence2, (CharSequence)"executorUUID", (Object)string2), (CharSequence)"executorPrefix", (Object)string4), (CharSequence)"executorSuffix", (Object)string5), (CharSequence)"executor", (Object)string3);
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_83 ch2, CharSequence charSequence, String string, String string2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 4) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(charSequence, string, string2, flag);
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence) {
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, charSequence);
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @Nullable LiteBansModule_298 iA2, boolean flag) {
        if (iA2 == null) {
            return charSequence;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, iA2, charSequence, flag);
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_83 ch2, CharSequence charSequence, LiteBansModule_298 iA2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(charSequence, iA2, flag);
    }

    public static CharSequence LiteBansModule_31(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @Nullable CommandSenderWrapper sender) {
        if (sender != null) {
            return GeoIPLookupService.BaseCoreGenericHandler(ch2, sender, charSequence, false, 4, null);
        }
        return charSequence;
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @NotNull LiteBansModule_114 d92) {
        return d92.e() == null ? ch2.BaseCoreGenericHandler(charSequence, d92.AsyncBackgroundTask_5(), d92.LiteBansModule_195(), d92.BaseCoreGenericHandler(), d92.c(), null) : ch2.BaseCoreGenericHandler(charSequence, d92.e());
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, string, string2, string3, string4, string5, new Date(), charSequence, false, 128, null);
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, boolean flag) {
        if (dZ2 == null || StringUtilities.LiteBansModule_31(charSequence)) {
            return charSequence;
        }
        return GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, charSequence, 0L, flag, 4, null);
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_83 ch2, CharSequence charSequence, SilentHandler dZ2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(charSequence, dZ2, flag);
    }

    public static CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, @Nullable SilentHandler dZ2, @Nullable LiteBansModule_298 iA2, boolean flag) {
        return ch2.BaseCoreGenericHandler(ch2.BaseCoreGenericHandler(charSequence, dZ2, false), iA2, flag);
    }

    public static /* synthetic */ CharSequence BaseCoreGenericHandler(LiteBansModule_83 ch2, CharSequence charSequence, SilentHandler dZ2, LiteBansModule_298 iA2, boolean flag, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 4) != 0) {
            flag = true;
        }
        return ch2.BaseCoreGenericHandler(charSequence, dZ2, iA2, flag);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull CommandSenderWrapper sender) {
        String string;
        DatabaseMonitorService w2 = (DatabaseMonitorService)ch2.e().BaseCoreGenericHandler(DatabaseMonitorService.class);
        if (!dZ2.BaseCoreGenericHandler(sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), DatabaseMonitorService.BaseCoreGenericHandler(w2, false, 1, null))) return false;
        String string2 = dZ2.m();
        if (string2 == null) {
            string2 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
        }
        if ((string = sender.LiteBansModule_241()) == null) {
            string = w2.ServerSyncService();
        }
        if (!LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(string2, string)) return false;
        return true;
    }

    public static boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @Nullable SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        return dZ3 != null ? dZ3.BaseCoreGenericHandler(dZ2.DatabaseMonitorService(), dZ2.PunishmentTableService(), DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null)) : false;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "", "", "", "", "", "", "", "", "", "__ALL__", "", "", "__ALL__", "", "", "", "", "", "", "", "", "executorPrefix", "executorSuffix", "", "null", "", "null", "", "executorUUID", "executorPrefix", "executorSuffix", "executor", "", "", "", ""};
    }

    static {
        AllHandler_3.BaseCoreGenericHandler();
    }
}

