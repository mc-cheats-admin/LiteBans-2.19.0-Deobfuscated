package litebans;

import java.io.Serializable;
public final class LiteBansModule_85
implements Cloneable,
Serializable {
    private static final long AsyncBackgroundTask_5 = 1L;
    private final long LiteBansModule_195;
    public static final LiteBansModule_85 BaseCoreGenericHandler = new LiteBansModule_85(33639248L);
    public static final LiteBansModule_85 c = new LiteBansModule_85(67324752L);
    public static final LiteBansModule_85 e = new LiteBansModule_85(134695760L);
    static final LiteBansModule_85 LiteBansModule_241 = new LiteBansModule_85(0xFFFFFFFFL);
    public static final LiteBansModule_85 LiteBansModule_31 = new LiteBansModule_85(808471376L);
    public static final LiteBansModule_85 g = new LiteBansModule_85(134630224L);

    public LiteBansModule_85(long l3) {
        this.LiteBansModule_195 = l3;
    }

    public LiteBansModule_85(byte[] byArray) {
        this(byArray, 0);
    }

    public LiteBansModule_85(byte[] byArray, int n) {
        this.LiteBansModule_195 = LiteBansModule_85.BaseCoreGenericHandler(byArray, n);
    }

    public byte[] c() {
        return LiteBansModule_85.BaseCoreGenericHandler(this.LiteBansModule_195);
    }

    public long BaseCoreGenericHandler() {
        return this.LiteBansModule_195;
    }

    public int LiteBansModule_31() {
        return (int)this.LiteBansModule_195;
    }

    public static final byte[] BaseCoreGenericHandler(long l3) {
        byte[] byArray = new byte[4];
        LiteBansModule_85.BaseCoreGenericHandler(l3, byArray, 0);
        return byArray;
    }

    public static final void BaseCoreGenericHandler(long l3, byte[] byArray, int n) {
        LiteBansModule_268.BaseCoreGenericHandler(byArray, l3, n, 4);
    }

    public static final long BaseCoreGenericHandler(byte[] byArray, int n) {
        return LiteBansModule_268.BaseCoreGenericHandler(byArray, n, 4);
    }

    public static final long BaseCoreGenericHandler(byte[] byArray) {
        return LiteBansModule_85.BaseCoreGenericHandler(byArray, 0);
    }

    public boolean equals(Object targetObj) {
        if (targetObj == null || !(targetObj instanceof LiteBansModule_85)) {
            return false;
        }
        return this.LiteBansModule_195 == ((LiteBansModule_85)targetObj).BaseCoreGenericHandler();
    }

    public int hashCode() {
        return (int)this.LiteBansModule_195;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String toString() {
        return "ZipLong value: " + this.LiteBansModule_195;
    }
}

