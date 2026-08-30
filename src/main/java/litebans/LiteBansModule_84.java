package litebans;

import java.io.Serializable;
public final class LiteBansModule_84
implements Cloneable,
Serializable {
    private static final long AsyncBackgroundTask_5 = 1L;
    private final long LiteBansModule_194;
    public static final LiteBansModule_84 BaseCoreGenericHandler = new LiteBansModule_84(33639248L);
    public static final LiteBansModule_84 c = new LiteBansModule_84(67324752L);
    public static final LiteBansModule_84 e = new LiteBansModule_84(134695760L);
    static final LiteBansModule_84 LiteBansModule_240 = new LiteBansModule_84(0xFFFFFFFFL);
    public static final LiteBansModule_84 LiteBansModule_31 = new LiteBansModule_84(808471376L);
    public static final LiteBansModule_84 g = new LiteBansModule_84(134630224L);

    public LiteBansModule_84(long l3) {
        this.LiteBansModule_194 = l3;
    }

    public LiteBansModule_84(byte[] byArray) {
        this(byArray, 0);
    }

    public LiteBansModule_84(byte[] byArray, int n) {
        this.LiteBansModule_194 = LiteBansModule_84.BaseCoreGenericHandler(byArray, n);
    }

    public byte[] c() {
        return LiteBansModule_84.BaseCoreGenericHandler(this.LiteBansModule_194);
    }

    public long BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    public int LiteBansModule_31() {
        return (int)this.LiteBansModule_194;
    }

    public static final byte[] BaseCoreGenericHandler(long l3) {
        byte[] byArray = new byte[4];
        LiteBansModule_84.BaseCoreGenericHandler(l3, byArray, 0);
        return byArray;
    }

    public static final void BaseCoreGenericHandler(long l3, byte[] byArray, int n) {
        LiteBansModule_267.BaseCoreGenericHandler(byArray, l3, n, 4);
    }

    public static final long BaseCoreGenericHandler(byte[] byArray, int n) {
        return LiteBansModule_267.BaseCoreGenericHandler(byArray, n, 4);
    }

    public static final long BaseCoreGenericHandler(byte[] byArray) {
        return LiteBansModule_84.BaseCoreGenericHandler(byArray, 0);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof LiteBansModule_84)) {
            return false;
        }
        return this.LiteBansModule_194 == ((LiteBansModule_84)object).BaseCoreGenericHandler();
    }

    public int hashCode() {
        return (int)this.LiteBansModule_194;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
}

    public String toString() {
        return "ZipLong value: " + this.LiteBansModule_194;
}

