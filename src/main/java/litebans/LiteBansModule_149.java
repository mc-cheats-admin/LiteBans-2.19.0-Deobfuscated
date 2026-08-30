package litebans;

import java.util.concurrent.TimeUnit;
public interface LiteBansModule_149 {
    public static final LiteBansModule_149 LiteBansModule_31 = OsNameHandler.LiteBansModule_31();
    public static final TimeUnit[] c = new TimeUnit[]{TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MINUTES, TimeUnit.SECONDS, TimeUnit.MILLISECONDS, TimeUnit.MICROSECONDS, TimeUnit.NANOSECONDS};
    public static final String[] BaseCoreGenericHandler = new String[]{"ns", "\u00b5s", "ms", "AsyncBackgroundTask_21", "m", "LiteBansModule_240", "AsyncBackgroundTask_5"};

    public static long LiteBansModule_31() {
        return LiteBansModule_31.BaseCoreGenericHandler();
    }

    public long BaseCoreGenericHandler();

    public static long AsyncBackgroundTask_5(long a10) {
        return LiteBansModule_31.c(a10);
    }

    public long c(long var1);

    public static long g(long a10, long a11) {
        return LiteBansModule_31.LiteBansModule_194(a10, a11);
    }

    public long LiteBansModule_194(long var1, long var3);

    public static long LiteBansModule_31(long a10) {
        return LiteBansModule_31.BaseCoreGenericHandler(a10);
    }

    public long BaseCoreGenericHandler(long var1);

    public long LiteBansModule_31(long var1, long var3);

    public static long BaseCoreGenericHandler(long a10, long a11) {
        return LiteBansModule_31.AsyncBackgroundTask_5(a10, a11);
    }

    public long AsyncBackgroundTask_5(long var1, long var3);

    public static String e(long a10, long a11) {
        return LiteBansModule_31.c(a10, a11);
    }

    default public String c(long a10, long a11) {
        LiteBansModule_149 a12;
        long a13 = a12.LiteBansModule_31(a10, a11);
        StringBuilder a14 = new StringBuilder(a13 < 0L ? "-" : "");
        a13 = Math.abs(a13);
        for (TimeUnit a15 : c) {
            long a16 = a15.convert(a13, TimeUnit.NANOSECONDS);
            if (a16 <= 0L) continue;
            a14.append(a16).append(BaseCoreGenericHandler[a15.ordinal()]);
            a13 -= TimeUnit.NANOSECONDS.convert(a16, a15);
        }
        return a14.toString();
}

