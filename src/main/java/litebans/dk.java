package litebans;

import litebans.am;
import litebans.db_0;
import litebans.e3;
import litebans.eZ;
import litebans.hN;
import litebans.hl;
import litebans.iC;
import litebans.kd;
import org.jetbrains.annotations.NotNull;

public final class dk
extends Enum {
    public static final db_0 d;
    private final String[] o;
    public static final double m;
    private static final hN c;
    private static final hN e;
    public static final dk f;
    public static final dk i;
    public static final dk n;
    public static final dk a;
    public static final dk j;
    public static final dk g;
    public static final dk h;
    private static final /* synthetic */ dk[] l;
    private static final /* synthetic */ kd k;
    private static /* synthetic */ String[] b;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dk() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.o = var3_1;
    }

    public final long b(double d10) {
        double d11;
        double d12 = d10 * 1000.0;
        switch (eZ.a[this.ordinal()]) {
            case 1: {
                d11 = d12;
                break;
            }
            case 2: {
                d11 = d12 * 60.0;
                break;
            }
            case 3: {
                d11 = d12 * 60.0 * 60.0;
                break;
            }
            case 4: {
                d11 = d12 * 60.0 * 60.0 * 24.0;
                break;
            }
            case 5: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 7.0;
                break;
            }
            case 6: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 30.0;
                break;
            }
            case 7: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 365.0;
                break;
            }
            default: {
                throw new e3();
            }
        }
        return (long)d11;
    }

    public final boolean b(@NotNull String string) {
        boolean bl;
        switch (eZ.a[this.ordinal()]) {
            case 1: {
                bl = db_0.a(d, string, am.dC, am.bu);
                break;
            }
            case 2: {
                bl = db_0.a(d, string, am.r, am.cB);
                break;
            }
            case 3: {
                bl = db_0.a(d, string, am.cH, am.bh);
                break;
            }
            case 4: {
                bl = db_0.a(d, string, am.dJ, am.aq);
                break;
            }
            case 5: {
                bl = db_0.a(d, string, am.cc, am.aU);
                break;
            }
            case 6: {
                bl = db_0.a(d, string, am.ae, am.aT);
                break;
            }
            case 7: {
                bl = db_0.a(d, string, am.de, am.q);
                break;
            }
            default: {
                throw new e3();
            }
        }
        return bl;
    }

    public final CharSequence a(double d10) {
        CharSequence charSequence;
        switch (eZ.a[this.ordinal()]) {
            case 1: {
                charSequence = d.a(d10, (Object)am.dC, (Object)am.bu);
                break;
            }
            case 2: {
                charSequence = d.a(d10, (Object)am.r, (Object)am.cB);
                break;
            }
            case 3: {
                charSequence = d.a(d10, (Object)am.cH, (Object)am.bh);
                break;
            }
            case 4: {
                charSequence = d.a(d10, (Object)am.dJ, (Object)am.aq);
                break;
            }
            case 5: {
                charSequence = d.a(d10, (Object)am.cc, (Object)am.aU);
                break;
            }
            case 6: {
                charSequence = d.a(d10, (Object)am.ae, (Object)am.aT);
                break;
            }
            case 7: {
                charSequence = d.a(d10, (Object)am.de, (Object)am.q);
                break;
            }
            default: {
                throw new e3();
            }
        }
        return charSequence;
    }

    public static dk[] values() {
        return (dk[])l.clone();
    }

    public static dk a(String string) {
        return Enum.valueOf(dk.class, string);
    }

    public static final /* synthetic */ String[] a(dk dk2) {
        return dk2.o;
    }

    public static final /* synthetic */ hN d() {
        return c;
    }

    public static final /* synthetic */ hN a() {
        return e;
    }

    static {
        m = 0.0;
        dk.b();
        String[] stringArray = new String[]{"s", "se", "sc", "sec", "secs", "second", "seconds"};
        f = new dk("SECONDS", 0, stringArray);
        stringArray = new String[]{"m", "mi", "min", "mins", "minute", "minutes"};
        i = new dk("MINUTES", 1, stringArray);
        stringArray = new String[]{"h", "hr", "hrs", "hour", "hours"};
        n = new dk("HOURS", 2, stringArray);
        stringArray = new String[]{"d", "da", "dy", "day", "days"};
        a = new dk("DAYS", 3, stringArray);
        stringArray = new String[]{"w", "we", "wk", "wks", "week", "weeks"};
        j = new dk("WEEKS", 4, stringArray);
        stringArray = new String[]{"mo", "mh", "mon", "month", "months"};
        g = new dk("MONTHS", 5, stringArray);
        stringArray = new String[]{"y", "ye", "yr", "yrs", "year", "years"};
        h = new dk("YEARS", 6, stringArray);
        l = dkArray = new dk[]{dk.f, dk.i, dk.n, dk.a, dk.j, dk.g, dk.h};
        k = iC.a(l);
        d = new db_0(null);
        c = new hN("[0-9.]");
        e = new hN("[^0-9.]");
    }

    private static final void b() {
        b = new String[]{"SECONDS", "s", "se", "sc", "sec", "secs", "second", "seconds", "MINUTES", "m", "mi", "min", "mins", "minute", "minutes", "HOURS", "h", "hr", "hrs", "hour", "hours", "DAYS", "d", "da", "dy", "day", "days", "WEEKS", "w", "we", "wk", "wks", "week", "weeks", "MONTHS", "mo", "mh", "mon", "month", "months", "YEARS", "y", "ye", "yr", "yrs", "year", "years", "[0-9.]", "[^0-9.]"};
    }
}

