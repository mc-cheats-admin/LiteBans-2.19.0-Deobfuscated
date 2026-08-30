package litebans;

import java.text.DecimalFormat;
import litebans.hl;

public static class i1 {
    public static final DecimalFormat b;
    public static final DecimalFormat a;
    public static final DecimalFormat d;
    private static /* synthetic */ String[] c;

    public static String b(double d10) {
        return b.format(d10);
    }

    public static String a(double d10) {
        return a.format(d10);
    }

    static {
        i1.a();
        b = new DecimalFormat(c[0]);
        a = new DecimalFormat(c[1]);
        d = new DecimalFormat(c[2]);
    }

    private static final void a() {
        c = new String[]{hl.a("\u7a6c\u7a61\u7a6c", -1920173489), hl.a("\u23c4\u23c9\u23c4\u23c4", 461513703), hl.a("\u93d6\u93db\u93d6\u93d6\u93d6", -498428939)};
    }
}

