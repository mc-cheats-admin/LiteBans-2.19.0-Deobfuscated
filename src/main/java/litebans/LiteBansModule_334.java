package litebans;

public class LiteBansModule_334
implements LiteBansModule_235 {
    public static final String c;
    public static final String LiteBansModule_194;
    private final String e;
    private static final int AsyncBackgroundTask_5;
    private final long LiteBansModule_31;

    public long BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.e == null ? 0 : this.e.hashCode());
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        LiteBansModule_334 ja_02 = (LiteBansModule_334)object;
        if (this.e == null) {
            return ja_02.e == null;
        }
        return this.e.equals(ja_02.e);
    }

    static {
        AsyncBackgroundTask_5 = 33188;
        LiteBansModule_194 = "`\n";
        c = "!<arch>\n";
    }
}

