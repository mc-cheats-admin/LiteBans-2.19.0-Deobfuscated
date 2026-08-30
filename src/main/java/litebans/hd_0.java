package litebans;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class hd_0
extends Enum
implements CharSequence {
    public static final hd_0 f;
    public static final hd_0 h;
    public static final hd_0 v;
    public static final hd_0 y;
    public static final hd_0 F;
    public static final hd_0 C;
    public static final hd_0 m;
    public static final hd_0 o;
    public static final hd_0 g;
    public static final hd_0 n;
    public static final hd_0 i;
    public static final hd_0 w;
    public static final hd_0 c;
    public static final hd_0 d;
    public static final hd_0 u;
    public static final hd_0 k;
    public static final hd_0 x;
    public static final hd_0 E;
    public static final hd_0 z;
    public static final hd_0 r;
    public static final hd_0 l;
    public static final hd_0 p;
    public static final hd_0 t;
    public static final char j;
    public static final String D;
    public static final Pattern b;
    private static final Map a;
    private final char q;
    private final String B;
    private final String A;
    private static final /* synthetic */ hd_0[] e;
    private static /* synthetic */ String[] s;

    public static hd_0[] values() {
        return (hd_0[])e.clone();
    }

    public static hd_0 b(String string) {
        return Enum.valueOf(hd_0.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private hd_0() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.q = var3_1;
        this.A = var4_2;
        this.B = new String(new char[]{'\u00a7', var3_1});
    }

    public static String a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return b.matcher(charSequence).replaceAll("");
    }

    public static String a(char c, String string) {
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

    public static String f(String string) {
        return c + string;
    }

    public static String a(String string) {
        return d + string;
    }

    public static String d(String string) {
        return u + string;
    }

    public static String e(String string) {
        return r + string;
    }

    private static final /* synthetic */ hd_0[] b() {
        return new hd_0[]{f, h, v, y, F, C, m, o, g, n, i, w, c, d, u, k, x, E, z, r, l, p, t};
    }

    static {
        D = "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx";
        j = (char)167;
        hd_0.a();
        f = new hd_0("BLACK", 0, '0', "black");
        h = new hd_0("DARK_BLUE", 1, '1', "dark_blue");
        v = new hd_0("DARK_GREEN", 2, '2', "dark_green");
        y = new hd_0("DARK_AQUA", 3, '3', "dark_aqua");
        F = new hd_0("DARK_RED", 4, '4', "dark_red");
        C = new hd_0("DARK_PURPLE", 5, '5', "dark_purple");
        m = new hd_0("GOLD", 6, '6', "gold");
        o = new hd_0("GRAY", 7, '7', "gray");
        g = new hd_0("DARK_GRAY", 8, '8', "dark_gray");
        n = new hd_0("BLUE", 9, '9', "blue");
        i = new hd_0("GREEN", 10, 'a', "green");
        w = new hd_0("AQUA", 11, 'b', "aqua");
        c = new hd_0("RED", 12, 'c', "red");
        d = new hd_0("LIGHT_PURPLE", 13, 'd', "light_purple");
        u = new hd_0("YELLOW", 14, 'e', "yellow");
        k = new hd_0("WHITE", 15, 'f', "white");
        x = new hd_0("OBFUSCATED", 16, 'k', "obfuscated");
        E = new hd_0("BOLD", 17, 'l', "bold");
        z = new hd_0("STRIKETHROUGH", 18, 'm', "strikethrough");
        r = new hd_0("UNDERLINE", 19, 'n', "underline");
        l = new hd_0("ITALIC", 20, 'o', "italic");
        p = new hd_0("RESET", 21, 'r', "reset");
        t = new hd_0("MAGIC", 22, 'x', "magic");
        e = hd_0.b();
        b = Pattern.compile("(?i)(?<!<@)[&\u00a7][0-9A-FK-ORX]");
        a = new HashMap();
        for (hd_0 hd_02 : hd_0.values()) {
            a.put(Character.valueOf(hd_02.q), hd_02);
        }
    }

    private static final void a() {
        s = new String[]{"", "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx", "BLACK", "black", "DARK_BLUE", "dark_blue", "DARK_GREEN", "dark_green", "DARK_AQUA", "dark_aqua", "DARK_RED", "dark_red", "DARK_PURPLE", "dark_purple", "GOLD", "gold", "GRAY", "gray", "DARK_GRAY", "dark_gray", "BLUE", "blue", "GREEN", "green", "AQUA", "aqua", "RED", "red", "LIGHT_PURPLE", "light_purple", "YELLOW", "yellow", "WHITE", "white", "OBFUSCATED", "obfuscated", "BOLD", "bold", "STRIKETHROUGH", "strikethrough", "UNDERLINE", "underline", "ITALIC", "italic", "RESET", "reset", "MAGIC", "magic", "(?i)(?<!<@)[&\u00a7][0-9A-FK-ORX]"};
    }
}

