package litebans;

public final class LiteBansModule_193
implements Comparable {
    public static final ProxyResultSet LiteBansModule_31;
    private final short c;
    public static final short e;
    public static final short AsyncBackgroundTask_5;
    public static final int LiteBansModule_194;
    public static final int BaseCoreGenericHandler;

    public static String LiteBansModule_31(short s2) {
        return String.valueOf(s2 & 0xFFFF);
    }

    public String toString() {
        return LiteBansModule_193.LiteBansModule_31(this.c);
    }

    public static int c(short s2) {
        return Short.hashCode(s2);
    }

    public int hashCode() {
        return LiteBansModule_193.c(this.c);
    }

    public static boolean BaseCoreGenericHandler(short s2, Object object) {
        if (!(object instanceof LiteBansModule_193)) {
            return false;
        }
        short s3 = ((LiteBansModule_193)object).BaseCoreGenericHandler();
        return s2 == s3;
    }

    public boolean equals(Object object) {
        return LiteBansModule_193.BaseCoreGenericHandler(this.c, object);
    }

    private /* synthetic */ LiteBansModule_193(short s2) {
        this.c = s2;
    }

    public static short BaseCoreGenericHandler(short s2) {
        return s2;
    }

    public static final /* synthetic */ LiteBansModule_193 AsyncBackgroundTask_5(short s2) {
        return new LiteBansModule_193(s2);
    }

    public final /* synthetic */ short BaseCoreGenericHandler() {
        return this.c;
    }

    public int compareTo(Object object) {
        LiteBansModule_193 ez_02 = this;
        short s2 = ((LiteBansModule_193)object).BaseCoreGenericHandler();
        return ObjectUtilities.BaseCoreGenericHandler(ez_02.BaseCoreGenericHandler() & 0xFFFF, s2 & 0xFFFF);
    }

    static {
        BaseCoreGenericHandler = 16;
        LiteBansModule_194 = 2;
        AsyncBackgroundTask_5 = (short)-1;
        e = 0;
        LiteBansModule_31 = new ProxyResultSet(null);
    }
}

