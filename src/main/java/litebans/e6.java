package litebans;

import java.util.concurrent.TimeUnit;
import litebans.ig;

public static interface e6 {
    public static final e6 b = ig.b();
    public static final TimeUnit[] c = new TimeUnit[]{TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MINUTES, TimeUnit.SECONDS, TimeUnit.MILLISECONDS, TimeUnit.MICROSECONDS, TimeUnit.NANOSECONDS};
    public static final String[] a = new String[]{"ns", "\u00b5s", "ms", "s", "m", "h", "d"};

    public static long b() {
        return b.a();
    }

    public long a();

    public static long d(long a10) {
        return b.c(a10);
    }

    public long c(long var1);

    public static long g(long a10, long a11) {
        return b.f(a10, a11);
    }

    public long f(long var1, long var3);

    public static long b(long a10) {
        return b.a(a10);
    }

    public long a(long var1);

    public long b(long var1, long var3);

    public static long a(long a10, long a11) {
        return b.d(a10, a11);
    }

    public long d(long var1, long var3);

    public static String e(long a10, long a11) {
        return b.c(a10, a11);
    }

    default public String c(long a10, long a11) {
        e6 a12;
        long a13 = a12.b(a10, a11);
        StringBuilder a14 = new StringBuilder(a13 < 0L ? "-" : "");
        a13 = Math.abs(a13);
        for (TimeUnit a15 : c) {
            long a16 = a15.convert(a13, TimeUnit.NANOSECONDS);
            if (a16 <= 0L) continue;
            a14.append(a16).append(a[a15.ordinal()]);
            a13 -= TimeUnit.NANOSECONDS.convert(a16, a15);
        }
        return a14.toString();
    }
}

