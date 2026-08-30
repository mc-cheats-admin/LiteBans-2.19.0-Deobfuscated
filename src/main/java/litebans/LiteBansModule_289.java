package litebans;

import java.io.Serializable;
public final class LiteBansModule_289
implements Cloneable,
Serializable {
    public static final LiteBansModule_289 c;
    private static final long LiteBansModule_31;
    private final int BaseCoreGenericHandler;

    public LiteBansModule_289(int n) {
        this.plugin = n;
    }

    public LiteBansModule_289(byte[] byArray, int n) {
        this.plugin = LiteBansModule_289.BaseCoreGenericHandler(byArray, n);
    }

    public byte[] LiteBansModule_31() {
        byte[] byArray = new byte[2];
        LiteBansModule_268.BaseCoreGenericHandler(byArray, this.plugin, 0, 2);
        return byArray;
    }

    public int BaseCoreGenericHandler() {
        return this.plugin;
    }

    public static final byte[] BaseCoreGenericHandler(int n) {
        byte[] byArray = new byte[2];
        LiteBansModule_289.BaseCoreGenericHandler(n, byArray, 0);
        return byArray;
    }

    public static final void BaseCoreGenericHandler(int n, byte[] byArray, int n2) {
        LiteBansModule_268.BaseCoreGenericHandler(byArray, n, n2, 2);
    }

    public static final int BaseCoreGenericHandler(byte[] byArray, int n) {
        return (int)LiteBansModule_268.BaseCoreGenericHandler(byArray, n, 2);
    }

    public boolean equals(Object targetObj) {
        if (targetObj == null || !(targetObj instanceof LiteBansModule_289)) {
            return false;
        }
        return this.plugin == ((LiteBansModule_289)targetObj).BaseCoreGenericHandler();
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
        c = new LiteBansModule_289(0);
    }
}

