package litebans;

import com.google.common.base.Preconditions;
import java.awt.Color;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
public final class LiteBansType {
    public static final char BaseCoreGenericHandler;
    public static final String z;
    public static final Pattern D;
    private static final Map e;
    private static final Map AsyncBackgroundTask_5;
    public static final LiteBansType HoverTextFormatter;
    public static final LiteBansType LiteBansModule_194;
    public static final LiteBansType i;
    public static final LiteBansType m;
    public static final LiteBansType BanHandler_4;
    public static final LiteBansType LiteBansModule_401;
    public static final LiteBansType AsyncBackgroundTask_21;
    public static final LiteBansType q;
    public static final LiteBansType PunishmentTableService;
    public static final LiteBansType B;
    public static final LiteBansType PunishmentService;
    public static final LiteBansType n;
    public static final LiteBansType r;
    public static final LiteBansType g;
    public static final LiteBansType F;
    public static final LiteBansType LiteBansModule_433;
    public static final LiteBansType LiteBansModule_31;
    public static final LiteBansType AsyncBackgroundTask_22;
    public static final LiteBansType c;
    public static final LiteBansType A;
    public static final LiteBansType Utf8Handler_2;
    public static final LiteBansType ServerSyncService;
    private static int CommandThrottleService;
    private final String BanHandler_2;
    private final String DatabaseMonitorService;
    private final int LiteBansModule_240;
    private final Color GnuSparseMapHandler;
    private LiteBansType(char c, String string) {
        this(c, string, null);
    }

    private LiteBansType(char c, String string, Color color) {
        this.DatabaseMonitorService = string;
        this.BanHandler_2 = new String(new char[]{'\u00a7', c});
        this.LiteBansModule_240 = CommandThrottleService++;
        this.GnuSparseMapHandler = color;
        e.put(Character.valueOf(c), this);
        AsyncBackgroundTask_5.put(string.toUpperCase(Locale.ROOT), this);
    }

    private LiteBansType(String string, String string2, int n) {
        this.DatabaseMonitorService = string;
        this.BanHandler_2 = string2;
        this.LiteBansModule_240 = -1;
        this.GnuSparseMapHandler = new Color(n);
    }

    public int hashCode() {
        int n = 7;
        n = 53 * n + Objects.hashCode(this.BanHandler_2);
        return n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        LiteBansType gq2 = (LiteBansType)object;
        return Objects.equals(this.BanHandler_2, gq2.BanHandler_2);
    }

    public String toString() {
        return this.BanHandler_2;
    }

    public static LiteBansType BaseCoreGenericHandler(char c) {
        return (LiteBansType)e.get(Character.valueOf(c));
    }

    public static LiteBansType BaseCoreGenericHandler(String string) {
        Preconditions.checkArgument((string != null ? 1 : 0) != 0, (Object)"string cannot be null");
        if (string.length() == 7 && string.charAt(0) == '#') {
            int n;
            try {
                n = Integer.parseInt(string.substring(1), 16);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException("Illegal hex string " + string);
            }
            StringBuilder stringBuilder = new StringBuilder("\u00a7x");
            for (char c : string.substring(1).toCharArray()) {
                stringBuilder.append('\u00a7').append(c);
            }
            return new LiteBansType(string, stringBuilder.toString(), n);
        }
        LiteBansType gq2 = (LiteBansType)AsyncBackgroundTask_5.get(string.toUpperCase(Locale.ROOT));
        if (gq2 != null) {
            return gq2;
        }
        throw new IllegalArgumentException("Could not parse ChatColor " + string);
    }

    public String BaseCoreGenericHandler() {
        return this.DatabaseMonitorService;
    }

    public Color c() {
        return this.GnuSparseMapHandler;
    }

    static {
        z = "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx";
        BaseCoreGenericHandler = (char)167;
        LiteBansType.LiteBansModule_31();
        D = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-ORX]");
        e = new HashMap();
        AsyncBackgroundTask_5 = new HashMap();
        HoverTextFormatter = new LiteBansType('0', "black", new Color(0));
        LiteBansModule_194 = new LiteBansType('1', "dark_blue", new Color(170));
        i = new LiteBansType('2', "dark_green", new Color(43520));
        m = new LiteBansType('3', "dark_aqua", new Color(43690));
        BanHandler_4 = new LiteBansType('4', "dark_red", new Color(0xAA0000));
        LiteBansModule_401 = new LiteBansType('5', "dark_purple", new Color(0xAA00AA));
        AsyncBackgroundTask_21 = new LiteBansType('6', "gold", new Color(0xFFAA00));
        q = new LiteBansType('7', "gray", new Color(0xAAAAAA));
        PunishmentTableService = new LiteBansType('8', "dark_gray", new Color(0x555555));
        B = new LiteBansType('9', "blue", new Color(0x5555FF));
        PunishmentService = new LiteBansType('BaseCoreGenericHandler', "green", new Color(0x55FF55));
        n = new LiteBansType('LiteBansModule_31', "aqua", new Color(0x55FFFF));
        r = new LiteBansType('c', "red", new Color(0xFF5555));
        g = new LiteBansType('AsyncBackgroundTask_5', "light_purple", new Color(0xFF55FF));
        F = new LiteBansType('e', "yellow", new Color(0xFFFF55));
        LiteBansModule_433 = new LiteBansType('LiteBansModule_194', "white", new Color(0xFFFFFF));
        LiteBansModule_31 = new LiteBansType('Utf8Handler_2', "obfuscated");
        AsyncBackgroundTask_22 = new LiteBansType('LiteBansModule_401', "bold");
        c = new LiteBansType('m', "strikethrough");
        A = new LiteBansType('n', "underline");
        Utf8Handler_2 = new LiteBansType('BroadcastService', "italic");
        ServerSyncService = new LiteBansType('r', "\u71b5\u71a2\u71b4\u71a2\u71b3");
        CommandThrottleService = 0;
    }

    private static final void LiteBansModule_31() {
        BroadcastService = new String[]{"", "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx", "#", "%08x", "string cannot be null", "Illegal hex string ", "\u00a7x", "Could not parse ChatColor ", "Name is null", "No enum constant ", " + ", "Cannot get ordinal of hex color", "(?i)", "[0-9A-FK-ORX]", "black", "dark_blue", "dark_green", "dark_aqua", "dark_red", "dark_purple", "gold", "gray", "dark_gray", "blue", "green", "aqua", "red", "light_purple", "yellow", "white", "obfuscated", "bold", "strikethrough", "underline", "italic", StringDecryptor.BaseCoreGenericHandler("\u71b5\u71a2\u71b4\u71a2\u71b3", 0x111C71C7)};
}

