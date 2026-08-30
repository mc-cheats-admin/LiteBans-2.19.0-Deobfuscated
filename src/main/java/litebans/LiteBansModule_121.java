package litebans;

public final class LiteBansModule_121 {
    public static final LiteBansModule_184 c = new LiteBansModule_184(null);
    private final int AsyncBackgroundTask_5;
    private final int LiteBansModule_31;
    private final int BaseCoreGenericHandler;

    public LiteBansModule_121(int n, int n2, int n3) {
        this.AsyncBackgroundTask_5 = n;
        this.LiteBansModule_31 = n2;
        this.plugin = n3;
    }

    public final boolean BaseCoreGenericHandler(int n, int n2, int n3) {
        if (this.AsyncBackgroundTask_5 > n) {
            return true;
        }
        if (this.LiteBansModule_31 > n2) {
            return true;
        }
        if (this.LiteBansModule_31 < n2) {
            return false;
        }
        return this.plugin >= n3;
    }

    public String toString() {
        if (this.AsyncBackgroundTask_5 >= 100 && this.LiteBansModule_31 == 0 && this.plugin == 0) {
            return "" + '#' + this.AsyncBackgroundTask_5;
        }
        return "" + this.AsyncBackgroundTask_5 + '.' + this.LiteBansModule_31 + '.' + this.plugin;
    }
}

