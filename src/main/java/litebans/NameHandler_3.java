package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NameHandler_3 {
    public static final LiteBansModule_215 c;
    private final byte LiteBansModule_31;
    private final String e;
    public static final byte LiteBansModule_194;
    public static final byte AsyncBackgroundTask_5;
    public static final byte g;
    public NameHandler_3(byte by2, @NotNull String string) {
        this.LiteBansModule_31 = by2;
        this.e = string;
    }

    public final byte AsyncBackgroundTask_5() {
        return this.LiteBansModule_31;
    }

    public final String BaseCoreGenericHandler() {
        return this.e;
    }

    public final String LiteBansModule_31() {
        byte by2 = this.LiteBansModule_31;
        if (by2 == 0) {
            return "name";
        }
        if (by2 == 1) {
            return "uuid";
        }
        if (by2 == 2) {
            return "ip";
        }
        throw new AssertionError();
    }

    public String toString() {
        return "Target(type=" + this.LiteBansModule_31 + ", target=" + this.e + ')';
    }

    public int hashCode() {
        int n = Byte.hashCode(this.LiteBansModule_31);
        n = n * 31 + this.e.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof NameHandler_3)) {
            return false;
        }
        NameHandler_3 jp_02 = (NameHandler_3)targetObj;
        if (this.LiteBansModule_31 != jp_02.LiteBansModule_31) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.e, jp_02.e);
    }

    static {
        g = (byte)2;
        AsyncBackgroundTask_5 = 1;
        LiteBansModule_194 = 0;
        NameHandler_3.c();
        c = new LiteBansModule_215(null);
    }

    private static final void c() {
        BaseCoreGenericHandler = new String[]{"name", "uuid", "ip", "Target(type=", ", target="};
}

