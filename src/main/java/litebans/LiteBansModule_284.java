package litebans;

public final class LiteBansModule_284
implements Comparable {
    public static final LiteBansModule_9 e;
    private final byte c;
    public static final byte LiteBansModule_31;
    public static final byte BaseCoreGenericHandler;
    public static final int LiteBansModule_195;
    public static final int AsyncBackgroundTask_5;

    public static String LiteBansModule_31(byte by2) {
        return String.valueOf(by2 & 0xFF);
    }

    public String toString() {
        return LiteBansModule_284.LiteBansModule_31(this.c);
    }

    public static int c(byte by2) {
        return Byte.hashCode(by2);
    }

    public int hashCode() {
        return LiteBansModule_284.c(this.c);
    }

    public static boolean BaseCoreGenericHandler(byte by2, Object targetObj) {
        if (!(targetObj instanceof LiteBansModule_284)) {
            return false;
        }
        byte by3 = ((LiteBansModule_284)targetObj).BaseCoreGenericHandler();
        return by2 == by3;
    }

    public boolean equals(Object targetObj) {
        return LiteBansModule_284.BaseCoreGenericHandler(this.c, targetObj);
    }

    private /* synthetic */ LiteBansModule_284(byte by2) {
        this.c = by2;
    }

    public static byte BaseCoreGenericHandler(byte by2) {
        return by2;
    }

    public static final /* synthetic */ LiteBansModule_284 AsyncBackgroundTask_5(byte by2) {
        return new LiteBansModule_284(by2);
    }

    public final /* synthetic */ byte BaseCoreGenericHandler() {
        return this.c;
    }

    public int compareTo(Object targetObj) {
        LiteBansModule_284 hy_02 = this;
        byte by2 = ((LiteBansModule_284)targetObj).BaseCoreGenericHandler();
        return ObjectUtilities.BaseCoreGenericHandler(hy_02.BaseCoreGenericHandler() & 0xFF, by2 & 0xFF);
    }

    static {
        AsyncBackgroundTask_5 = 8;
        LiteBansModule_195 = 1;
        BaseCoreGenericHandler = (byte)-1;
        LiteBansModule_31 = 0;
        e = new LiteBansModule_9(null);
    }
}

