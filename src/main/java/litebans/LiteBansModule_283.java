package litebans;

public final class LiteBansModule_283
implements Comparable {
    public static final LiteBansModule_9 e;
    private final byte c;
    public static final byte LiteBansModule_31;
    public static final byte BaseCoreGenericHandler;
    public static final int LiteBansModule_194;
    public static final int AsyncBackgroundTask_5;

    public static String LiteBansModule_31(byte by2) {
        return String.valueOf(by2 & 0xFF);
    }

    public String toString() {
        return LiteBansModule_283.LiteBansModule_31(this.c);
    }

    public static int c(byte by2) {
        return Byte.hashCode(by2);
    }

    public int hashCode() {
        return LiteBansModule_283.c(this.c);
    }

    public static boolean BaseCoreGenericHandler(byte by2, Object object) {
        if (!(object instanceof LiteBansModule_283)) {
            return false;
        }
        byte by3 = ((LiteBansModule_283)object).BaseCoreGenericHandler();
        return by2 == by3;
    }

    public boolean equals(Object object) {
        return LiteBansModule_283.BaseCoreGenericHandler(this.c, object);
    }

    private /* synthetic */ LiteBansModule_283(byte by2) {
        this.c = by2;
    }

    public static byte BaseCoreGenericHandler(byte by2) {
        return by2;
    }

    public static final /* synthetic */ LiteBansModule_283 AsyncBackgroundTask_5(byte by2) {
        return new LiteBansModule_283(by2);
    }

    public final /* synthetic */ byte BaseCoreGenericHandler() {
        return this.c;
    }

    public int compareTo(Object object) {
        LiteBansModule_283 hy_02 = this;
        byte by2 = ((LiteBansModule_283)object).BaseCoreGenericHandler();
        return ObjectUtilities.BaseCoreGenericHandler(hy_02.BaseCoreGenericHandler() & 0xFF, by2 & 0xFF);
    }

    static {
        AsyncBackgroundTask_5 = 8;
        LiteBansModule_194 = 1;
        BaseCoreGenericHandler = (byte)-1;
        LiteBansModule_31 = 0;
        e = new LiteBansModule_9(null);
    }
}

