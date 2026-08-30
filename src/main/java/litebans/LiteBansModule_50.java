package litebans;

public final class LiteBansModule_50 {
    public static final ProxyStatement c;
    private static final NativepatternHandler BaseCoreGenericHandler;
    private static final LiteBansModule_314 LiteBansModule_31;
    public static final /* synthetic */ NativepatternHandler c() {
        return BaseCoreGenericHandler;
    }

    public static final /* synthetic */ LiteBansModule_314 BaseCoreGenericHandler() {
        return LiteBansModule_31;
    }

    static {
        LiteBansModule_50.LiteBansModule_31();
        c = new ProxyStatement(null);
        BaseCoreGenericHandler = new NativepatternHandler(AsyncBackgroundTask_5[0]);
        LiteBansModule_31 = new LiteBansModule_314();
    }

    private static final void LiteBansModule_31() {
        AsyncBackgroundTask_5 = new String[]{"^\\DatabaseMonitorService{2,16}$"};
}

