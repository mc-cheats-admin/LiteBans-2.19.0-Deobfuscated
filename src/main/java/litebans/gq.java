package litebans;

import com.google.common.base.Preconditions;
import java.awt.Color;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import litebans.hl;

public final class gq {
    public static final char a;
    public static final String z;
    public static final Pattern D;
    private static final Map e;
    private static final Map d;
    public static final gq y;
    public static final gq f;
    public static final gq i;
    public static final gq m;
    public static final gq G;
    public static final gq l;
    public static final gq s;
    public static final gq q;
    public static final gq p;
    public static final gq B;
    public static final gq E;
    public static final gq n;
    public static final gq r;
    public static final gq g;
    public static final gq F;
    public static final gq x;
    public static final gq b;
    public static final gq t;
    public static final gq c;
    public static final gq A;
    public static final gq k;
    public static final gq u;
    private static int v;
    private final String C;
    private final String w;
    private final int h;
    private final Color j;
    private static /* synthetic */ String[] o;

    private gq(char c, String string) {
        this(c, string, null);
    }

    private gq(char c, String string, Color color) {
        this.w = string;
        this.C = new String(new char[]{'\u00a7', c});
        this.h = v++;
        this.j = color;
        e.put(Character.valueOf(c), this);
        d.put(string.toUpperCase(Locale.ROOT), this);
    }

    private gq(String string, String string2, int n) {
        this.w = string;
        this.C = string2;
        this.h = -1;
        this.j = new Color(n);
    }

    public int hashCode() {
        int n = 7;
        n = 53 * n + Objects.hashCode(this.C);
        return n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        gq gq2 = (gq)object;
        return Objects.equals(this.C, gq2.C);
    }

    public String toString() {
        return this.C;
    }

    public static gq a(char c) {
        return (gq)e.get(Character.valueOf(c));
    }

    public static gq a(String string) {
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
            return new gq(string, stringBuilder.toString(), n);
        }
        gq gq2 = (gq)d.get(string.toUpperCase(Locale.ROOT));
        if (gq2 != null) {
            return gq2;
        }
        throw new IllegalArgumentException("Could not parse ChatColor " + string);
    }

    public String a() {
        return this.w;
    }

    public Color c() {
        return this.j;
    }

    static {
        z = "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx";
        a = (char)167;
        gq.b();
        D = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-ORX]");
        e = new HashMap();
        d = new HashMap();
        y = new gq('0', "black", new Color(0));
        f = new gq('1', "dark_blue", new Color(170));
        i = new gq('2', "dark_green", new Color(43520));
        m = new gq('3', "dark_aqua", new Color(43690));
        G = new gq('4', "dark_red", new Color(0xAA0000));
        l = new gq('5', "dark_purple", new Color(0xAA00AA));
        s = new gq('6', "gold", new Color(0xFFAA00));
        q = new gq('7', "gray", new Color(0xAAAAAA));
        p = new gq('8', "dark_gray", new Color(0x555555));
        B = new gq('9', "blue", new Color(0x5555FF));
        E = new gq('a', "green", new Color(0x55FF55));
        n = new gq('b', "aqua", new Color(0x55FFFF));
        r = new gq('c', "red", new Color(0xFF5555));
        g = new gq('d', "light_purple", new Color(0xFF55FF));
        F = new gq('e', "yellow", new Color(0xFFFF55));
        x = new gq('f', "white", new Color(0xFFFFFF));
        b = new gq('k', "obfuscated");
        t = new gq('l', "bold");
        c = new gq('m', "strikethrough");
        A = new gq('n', "underline");
        k = new gq('o', "italic");
        u = new gq('r', "\u71b5\u71a2\u71b4\u71a2\u71b3");
        v = 0;
    }

    private static final void b() {
        o = new String[]{"", "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx", "#", "%08x", "string cannot be null", "Illegal hex string ", "\u00a7x", "Could not parse ChatColor ", "Name is null", "No enum constant ", " + ", "Cannot get ordinal of hex color", "(?i)", "[0-9A-FK-ORX]", "black", "dark_blue", "dark_green", "dark_aqua", "dark_red", "dark_purple", "gold", "gray", "dark_gray", "blue", "green", "aqua", "red", "light_purple", "yellow", "white", "obfuscated", "bold", "strikethrough", "underline", "italic", hl.a("\u71b5\u71a2\u71b4\u71a2\u71b3", 0x111C71C7)};
    }
}

