package litebans;

public final class LiteBansModule_73
implements Comparable {
    public static final LiteBansModule_415 e;
    private final int LiteBansModule_31;
    public static final int c;
    public static final int AsyncBackgroundTask_5;
    public static final int LiteBansModule_195;
    public static final int BaseCoreGenericHandler;

    public static String c(int n) {
        return String.valueOf((long)n & 0xFFFFFFFFL);
    }

    public String toString() {
        return LiteBansModule_73.c(this.LiteBansModule_31);
    }

    public static int AsyncBackgroundTask_5(int n) {
        return Integer.hashCode(n);
    }

    public int hashCode() {
        return LiteBansModule_73.AsyncBackgroundTask_5(this.LiteBansModule_31);
    }

    public static boolean BaseCoreGenericHandler(int n, Object targetObj) {
        if (!(targetObj instanceof LiteBansModule_73)) {
            return false;
        }
        int n2 = ((LiteBansModule_73)targetObj).BaseCoreGenericHandler();
        return n == n2;
    }

    public boolean equals(Object targetObj) {
        return LiteBansModule_73.BaseCoreGenericHandler(this.LiteBansModule_31, targetObj);
    }

    private /* synthetic */ LiteBansModule_73(int n) {
        this.LiteBansModule_31 = n;
    }

    public static int LiteBansModule_31(int n) {
        return n;
    }

    public static final /* synthetic */ LiteBansModule_73 BaseCoreGenericHandler(int n) {
        return new LiteBansModule_73(n);
    }

    public final /* synthetic */ int BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public int compareTo(Object targetObj) {
        LiteBansModule_73 c_02 = this;
        int n = ((LiteBansModule_73)targetObj).BaseCoreGenericHandler();
        return LiteBansModule_151.BaseCoreGenericHandler(c_02.BaseCoreGenericHandler(), n);
    }

    static {
        BaseCoreGenericHandler = 32;
        LiteBansModule_195 = 4;
        AsyncBackgroundTask_5 = -1;
        c = 0;
        e = new LiteBansModule_415(null);
    }
}

