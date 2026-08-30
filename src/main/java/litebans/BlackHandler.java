package litebans;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public final class BlackHandler
extends Enum
implements CharSequence {
    public static final BlackHandler LiteBansModule_195;
    public static final BlackHandler LiteBansModule_241;
    public static final BlackHandler CommandThrottleService;
    public static final BlackHandler HoverTextFormatter;
    public static final BlackHandler F;
    public static final BlackHandler BanHandler_2;
    public static final BlackHandler m;
    public static final BlackHandler BroadcastService;
    public static final BlackHandler g;
    public static final BlackHandler n;
    public static final BlackHandler i;
    public static final BlackHandler DatabaseMonitorService;
    public static final BlackHandler c;
    public static final BlackHandler AsyncBackgroundTask_5;
    public static final BlackHandler ServerSyncService;
    public static final BlackHandler Utf8Handler_2;
    public static final BlackHandler LiteBansModule_435;
    public static final BlackHandler PunishmentService;
    public static final BlackHandler z;
    public static final BlackHandler r;
    public static final BlackHandler LiteBansModule_403;
    public static final BlackHandler PunishmentTableService;
    public static final BlackHandler AsyncBackgroundTask_22;
    public static final char GnuSparseMapHandler;
    public static final String D;
    public static final Pattern LiteBansModule_31;
    private static final Map BaseCoreGenericHandler;
    private final char q;
    private final String B;
    private final String A;
    private static final /* synthetic */ BlackHandler[] e;
        public static BlackHandler[] values() {
        return (BlackHandler[])e.clone();
    }

    public static BlackHandler LiteBansModule_31(String string) {
        return Enum.valueOf(BlackHandler.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private BlackHandler() {
        void v1;
        void v2;
        void var2_-1;
        void var1_-1;
        this.q = v2;
        this.A = v1;
        this.B = new String(new char[]{'\u00a7', v2});
    }

    public static String BaseCoreGenericHandler(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return LiteBansModule_31.matcher(charSequence).replaceAll("");
    }

    public static String BaseCoreGenericHandler(char c, String string) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length - 1; ++i) {
            if (cArray[i] != c || "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx".indexOf(cArray[i + 1]) <= -1) continue;
            cArray[i] = 167;
            cArray[i + 1] = Character.toLowerCase(cArray[i + 1]);
        }
        return new String(cArray);
    }

    @Override
    public char charAt(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public int length() {
        return this.toString().length();
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    @Override
    public @NotNull String toString() {
        return this.B;
    }

    public static String g(String string) {
        return m + string;
    }

    public static String c(String string) {
        return i + string;
    }

    public static String LiteBansModule_195(String string) {
        return c + string;
    }

    public static String BaseCoreGenericHandler(String string) {
        return AsyncBackgroundTask_5 + string;
    }

    public static String AsyncBackgroundTask_5(String string) {
        return ServerSyncService + string;
    }

    public static String e(String string) {
        return r + string;
    }

    private static final /* synthetic */ BlackHandler[] LiteBansModule_31() {
        return new BlackHandler[]{LiteBansModule_195, LiteBansModule_241, CommandThrottleService, HoverTextFormatter, F, BanHandler_2, m, BroadcastService, g, n, i, DatabaseMonitorService, c, AsyncBackgroundTask_5, ServerSyncService, Utf8Handler_2, LiteBansModule_435, PunishmentService, z, r, LiteBansModule_403, PunishmentTableService, AsyncBackgroundTask_22};
    }

    static {
        D = "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx";
        GnuSparseMapHandler = (char)167;
        BlackHandler.BaseCoreGenericHandler();
        LiteBansModule_195 = new BlackHandler("BLACK", 0, '0', "black");
        LiteBansModule_241 = new BlackHandler("DARK_BLUE", 1, '1', "dark_blue");
        CommandThrottleService = new BlackHandler("DARK_GREEN", 2, '2', "dark_green");
        HoverTextFormatter = new BlackHandler("DARK_AQUA", 3, '3', "dark_aqua");
        F = new BlackHandler("DARK_RED", 4, '4', "dark_red");
        BanHandler_2 = new BlackHandler("DARK_PURPLE", 5, '5', "dark_purple");
        m = new BlackHandler("GOLD", 6, '6', "gold");
        BroadcastService = new BlackHandler("GRAY", 7, '7', "gray");
        g = new BlackHandler("DARK_GRAY", 8, '8', "dark_gray");
        n = new BlackHandler("BLUE", 9, '9', "blue");
        i = new BlackHandler("GREEN", 10, 'BaseCoreGenericHandler', "green");
        DatabaseMonitorService = new BlackHandler("AQUA", 11, 'LiteBansModule_31', "aqua");
        c = new BlackHandler("RED", 12, 'c', "red");
        AsyncBackgroundTask_5 = new BlackHandler("LIGHT_PURPLE", 13, 'AsyncBackgroundTask_5', "light_purple");
        ServerSyncService = new BlackHandler("YELLOW", 14, 'e', "yellow");
        Utf8Handler_2 = new BlackHandler("WHITE", 15, 'LiteBansModule_195', "white");
        LiteBansModule_435 = new BlackHandler("OBFUSCATED", 16, 'Utf8Handler_2', "obfuscated");
        PunishmentService = new BlackHandler("BOLD", 17, 'LiteBansModule_403', "bold");
        z = new BlackHandler("STRIKETHROUGH", 18, 'm', "strikethrough");
        r = new BlackHandler("UNDERLINE", 19, 'n', "underline");
        LiteBansModule_403 = new BlackHandler("ITALIC", 20, 'BroadcastService', "italic");
        PunishmentTableService = new BlackHandler("RESET", 21, 'r', "reset");
        AsyncBackgroundTask_22 = new BlackHandler("MAGIC", 22, 'LiteBansModule_435', "magic");
        e = BlackHandler.LiteBansModule_31();
        LiteBansModule_31 = Pattern.compile("(?i)(?<!<@)[&\u00a7][0-9A-FK-ORX]");
        BaseCoreGenericHandler = new HashMap();
        for (BlackHandler hd_02 : BlackHandler.values()) {
            BaseCoreGenericHandler.put(Character.valueOf(hd_02.q), hd_02);
        }
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_21 = new String[]{"", "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx", "BLACK", "black", "DARK_BLUE", "dark_blue", "DARK_GREEN", "dark_green", "DARK_AQUA", "dark_aqua", "DARK_RED", "dark_red", "DARK_PURPLE", "dark_purple", "GOLD", "gold", "GRAY", "gray", "DARK_GRAY", "dark_gray", "BLUE", "blue", "GREEN", "green", "AQUA", "aqua", "RED", "red", "LIGHT_PURPLE", "light_purple", "YELLOW", "yellow", "WHITE", "white", "OBFUSCATED", "obfuscated", "BOLD", "bold", "STRIKETHROUGH", "strikethrough", "UNDERLINE", "underline", "ITALIC", "italic", "RESET", "reset", "MAGIC", "magic", "(?i)(?<!<@)[&\u00a7][0-9A-FK-ORX]"};
    }
}

