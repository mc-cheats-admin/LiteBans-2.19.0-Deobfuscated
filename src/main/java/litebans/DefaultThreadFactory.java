package litebans;

public final class DefaultThreadFactory
implements Cloneable {
    private static final int c;
    private static final int AsyncBackgroundTask_5;
    private static final int g;
    private static final int LiteBansModule_194;
    private static final int i;
    public static final int LiteBansModule_31;
    private boolean BaseCoreGenericHandler = false;
    private boolean LiteBansModule_240 = false;
    private boolean e = false;
    private boolean GnuSparseMapHandler = false;

    public boolean LiteBansModule_31() {
        return this.LiteBansModule_240;
    }

    public boolean BaseCoreGenericHandler() {
        return this.e;
    }

    public int hashCode() {
        return 3 * (7 * (13 * (17 * (this.e ? 1 : 0) + (this.GnuSparseMapHandler ? 1 : 0)) + (this.plugin ? 1 : 0)) + (this.LiteBansModule_240 ? 1 : 0));
    }

    public boolean equals(Object object) {
        if (!(object instanceof DefaultThreadFactory)) {
            return false;
        }
        DefaultThreadFactory ch_02 = (DefaultThreadFactory)object;
        return ch_02.e == this.e && ch_02.GnuSparseMapHandler == this.GnuSparseMapHandler && ch_02.BaseCoreGenericHandler == this.plugin && ch_02.LiteBansModule_240 == this.LiteBansModule_240;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", cloneNotSupportedException);
        }
    }

    static {
        LiteBansModule_31 = 2048;
        i = 64;
        LiteBansModule_194 = 8;
        g = 4;
        AsyncBackgroundTask_5 = 2;
        c = 1;
    }
}

