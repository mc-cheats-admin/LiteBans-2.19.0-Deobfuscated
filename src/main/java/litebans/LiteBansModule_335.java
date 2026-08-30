package litebans;

public class LiteBansModule_335
implements LiteBansModule_236 {
    public static final String c;
    public static final String LiteBansModule_195;
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

    public boolean equals(Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (targetObj == null || this.getClass() != targetObj.getClass()) {
            return false;
        }
        LiteBansModule_335 ja_02 = (LiteBansModule_335)targetObj;
        if (this.e == null) {
            return ja_02.e == null;
        }
        return this.e.equals(ja_02.e);
    }

    static {
        AsyncBackgroundTask_5 = 33188;
        LiteBansModule_195 = "`\n";
        c = "!<arch>\n";
    }
}

