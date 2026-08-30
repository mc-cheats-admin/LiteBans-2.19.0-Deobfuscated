package litebans;

import java.text.DecimalFormat;
import litebans.hl;

public class i1 {
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
        b = new DecimalFormat("#.#");
        a = new DecimalFormat("#.##");
        d = new DecimalFormat("#.###");
    }

    private static final void a() {
        c = new String[]{"#.#", "#.##", "#.###"};
    }
}

