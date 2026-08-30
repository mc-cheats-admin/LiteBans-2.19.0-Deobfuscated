package litebans;

static class LiteBansModule_285 {
    private TapeHandler AsyncBackgroundTask_5;
    private int LiteBansModule_31;
    private int c;
    private int BaseCoreGenericHandler;
    private int e;
    private final byte[] LiteBansModule_195 = new byte[512];

    LiteBansModule_285() {
    }

    public TapeHandler BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public int c() {
        return this.LiteBansModule_31;
    }

    public int LiteBansModule_31() {
        return this.plugin;
    }

    public int BaseCoreGenericHandler(int n) {
        return this.LiteBansModule_195[n];
    }

    static final /* synthetic */ TapeHandler BaseCoreGenericHandler(LiteBansModule_285 hz2, TapeHandler ao2) {
        hz2.AsyncBackgroundTask_5 = ao2;
        return hz2.AsyncBackgroundTask_5;
    }

    static final /* synthetic */ int AsyncBackgroundTask_5(LiteBansModule_285 hz2, int n) {
        hz2.LiteBansModule_31 = n;
        return hz2.LiteBansModule_31;
    }

    static final /* synthetic */ int c(LiteBansModule_285 hz2, int n) {
        hz2.c = n;
        return hz2.c;
    }

    static final /* synthetic */ int LiteBansModule_31(LiteBansModule_285 hz2, int n) {
        hz2.BaseCoreGenericHandler = n;
        return hz2.BaseCoreGenericHandler;
    }

    static final /* synthetic */ int BaseCoreGenericHandler(LiteBansModule_285 hz2, int n) {
        hz2.e = n;
        return hz2.e;
    }

    static final /* synthetic */ int LiteBansModule_31(LiteBansModule_285 hz2) {
        return hz2.BaseCoreGenericHandler;
    }

    static final /* synthetic */ int BaseCoreGenericHandler(LiteBansModule_285 hz2) {
        return hz2.e++;
    }

    static final /* synthetic */ byte[] c(LiteBansModule_285 hz2) {
        return hz2.LiteBansModule_195;
    }
}

