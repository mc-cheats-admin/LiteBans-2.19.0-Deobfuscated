package litebans;

public final class LiteBansModule_45 {
    private final int LiteBansModule_31;
    private final int c;
    private final int BaseCoreGenericHandler;

    public LiteBansModule_45(int n, int n2, int n3) {
        this.LiteBansModule_31 = n;
        this.c = n2;
        this.plugin = n3;
    }

    public /* synthetic */ LiteBansModule_45(int n, int n2, int n3, int n4, LiteBansModule_14 aJ2) {
        if ((n4 & 1) != 0) {
            n = 0;
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = 0;
        }
        this(n, n2, n3);
    }

    public final int c() {
        return this.LiteBansModule_31;
    }

    public final int LiteBansModule_31() {
        return this.c;
    }

    public final int BaseCoreGenericHandler() {
        return this.plugin;
    }

    public LiteBansModule_45() {
        this(0, 0, 0, 7, null);
}

