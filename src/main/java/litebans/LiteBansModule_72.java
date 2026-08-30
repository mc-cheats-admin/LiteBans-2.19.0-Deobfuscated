package litebans;

public final class LiteBansModule_72
implements Comparable {
    public static final LiteBansModule_413 e;
    private final int LiteBansModule_31;
    public static final int c;
    public static final int AsyncBackgroundTask_5;
    public static final int LiteBansModule_194;
    public static final int BaseCoreGenericHandler;

    public static String c(int n) {
        return String.valueOf((long)n & 0xFFFFFFFFL);
    }

    public String toString() {
        return LiteBansModule_72.c(this.LiteBansModule_31);
    }

    public static int AsyncBackgroundTask_5(int n) {
        return Integer.hashCode(n);
    }

    public int hashCode() {
        return LiteBansModule_72.AsyncBackgroundTask_5(this.LiteBansModule_31);
    }

    public static boolean BaseCoreGenericHandler(int n, Object object) {
        if (!(object instanceof LiteBansModule_72)) {
            return false;
        }
        int n2 = ((LiteBansModule_72)object).BaseCoreGenericHandler();
        return n == n2;
    }

    public boolean equals(Object object) {
        return LiteBansModule_72.BaseCoreGenericHandler(this.LiteBansModule_31, object);
    }

    private /* synthetic */ LiteBansModule_72(int n) {
        this.LiteBansModule_31 = n;
    }

    public static int LiteBansModule_31(int n) {
        return n;
    }

    public static final /* synthetic */ LiteBansModule_72 BaseCoreGenericHandler(int n) {
        return new LiteBansModule_72(n);
    }

    public final /* synthetic */ int BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public int compareTo(Object object) {
        LiteBansModule_72 c_02 = this;
        int n = ((LiteBansModule_72)object).BaseCoreGenericHandler();
        return LiteBansModule_150.BaseCoreGenericHandler(c_02.BaseCoreGenericHandler(), n);
    }

    static {
        BaseCoreGenericHandler = 32;
        LiteBansModule_194 = 4;
        AsyncBackgroundTask_5 = -1;
        c = 0;
        e = new LiteBansModule_413(null);
    }
}

