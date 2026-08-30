package litebans;

import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class ah_0 {
    public static final ah_0 b;
    private static String d;
    private static String c;
    private static String e;
    private static String g;
    private static String a;
    private static /* synthetic */ String[] f;

    private ah_0() {
    }

    public final String d() {
        return d;
    }

    public final void c(@NotNull String string) {
        d = string;
    }

    public final String c() {
        return c;
    }

    public final void b(@NotNull String string) {
        c = string;
    }

    public final String e() {
        return e;
    }

    public final void a(@NotNull String string) {
        e = string;
    }

    public final String a() {
        return g;
    }

    public final void d(@NotNull String string) {
        g = string;
    }

    public final String f() {
        return a;
    }

    public final void e(@NotNull String string) {
        a = string;
    }

    static {
        ah_0.b();
        b = new ah_0();
        d = "litebans";
        c = "?resourceId=";
        e = "redacted";
        g = "&pluginVersion=";
        a = "&v=";
    }

    private static final void b() {
        f = new String[]{"litebans", "?resourceId=", "redacted", "&pluginVersion=", "&v="};
    }
}

