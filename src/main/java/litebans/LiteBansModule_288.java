package litebans;

import java.io.Serializable;
public final class LiteBansModule_288
implements Cloneable,
Serializable {
    public static final LiteBansModule_288 c;
    private static final long LiteBansModule_31;
    private final int BaseCoreGenericHandler;

    public LiteBansModule_288(int n) {
        this.plugin = n;
    }

    public LiteBansModule_288(byte[] byArray, int n) {
        this.plugin = LiteBansModule_288.BaseCoreGenericHandler(byArray, n);
    }

    public byte[] LiteBansModule_31() {
        byte[] byArray = new byte[2];
        LiteBansModule_267.BaseCoreGenericHandler(byArray, this.plugin, 0, 2);
        return byArray;
    }

    public int BaseCoreGenericHandler() {
        return this.plugin;
    }

    public static final byte[] BaseCoreGenericHandler(int n) {
        byte[] byArray = new byte[2];
        LiteBansModule_288.BaseCoreGenericHandler(n, byArray, 0);
        return byArray;
    }

    public static final void BaseCoreGenericHandler(int n, byte[] byArray, int n2) {
        LiteBansModule_267.BaseCoreGenericHandler(byArray, n, n2, 2);
    }

    public static final int BaseCoreGenericHandler(byte[] byArray, int n) {
        return (int)LiteBansModule_267.BaseCoreGenericHandler(byArray, n, 2);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof LiteBansModule_288)) {
            return false;
        }
        return this.plugin == ((LiteBansModule_288)object).BaseCoreGenericHandler();
    }

    public int hashCode() {
        return this.plugin;
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
        return "ZipShort value: " + this.plugin;
    }

    static {
        LiteBansModule_31 = 1L;
        c = new LiteBansModule_288(0);
    }
}

