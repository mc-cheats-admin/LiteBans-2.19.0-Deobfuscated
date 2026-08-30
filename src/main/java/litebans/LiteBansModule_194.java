package litebans;

public final class LiteBansModule_194
implements Comparable {
    public static final ProxyResultSet LiteBansModule_31;
    private final short c;
    public static final short e;
    public static final short AsyncBackgroundTask_5;
    public static final int LiteBansModule_195;
    public static final int BaseCoreGenericHandler;

    public static String LiteBansModule_31(short s2) {
        return String.valueOf(s2 & 0xFFFF);
    }

    public String toString() {
        return LiteBansModule_194.LiteBansModule_31(this.c);
    }

    public static int c(short s2) {
        return Short.hashCode(s2);
    }

    public int hashCode() {
        return LiteBansModule_194.c(this.c);
    }

    public static boolean BaseCoreGenericHandler(short s2, Object targetObj) {
        if (!(targetObj instanceof LiteBansModule_194)) {
            return false;
        }
        short s3 = ((LiteBansModule_194)targetObj).BaseCoreGenericHandler();
        return s2 == s3;
    }

    public boolean equals(Object targetObj) {
        return LiteBansModule_194.BaseCoreGenericHandler(this.c, targetObj);
    }

    private /* synthetic */ LiteBansModule_194(short s2) {
        this.c = s2;
    }

    public static short BaseCoreGenericHandler(short s2) {
        return s2;
    }

    public static final /* synthetic */ LiteBansModule_194 AsyncBackgroundTask_5(short s2) {
        return new LiteBansModule_194(s2);
    }

    public final /* synthetic */ short BaseCoreGenericHandler() {
        return this.c;
    }

    public int compareTo(Object targetObj) {
        LiteBansModule_194 ez_02 = this;
        short s2 = ((LiteBansModule_194)targetObj).BaseCoreGenericHandler();
        return ObjectUtilities.BaseCoreGenericHandler(ez_02.BaseCoreGenericHandler() & 0xFFFF, s2 & 0xFFFF);
    }

    static {
        BaseCoreGenericHandler = 16;
        LiteBansModule_195 = 2;
        AsyncBackgroundTask_5 = (short)-1;
        e = 0;
        LiteBansModule_31 = new ProxyResultSet(null);
    }
}

