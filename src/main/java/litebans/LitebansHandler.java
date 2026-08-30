package litebans;

import org.jetbrains.annotations.NotNull;

public final class LitebansHandler {
    public static final LitebansHandler LiteBansModule_31;
    private static String AsyncBackgroundTask_5;
    private static String c;
    private static String e;
    private static String g;
    private static String BaseCoreGenericHandler;
        private LitebansHandler() {
    }

    public final String AsyncBackgroundTask_5() {
        return AsyncBackgroundTask_5;
    }

    public final void c(@NotNull String string) {
        AsyncBackgroundTask_5 = string;
    }

    public final String c() {
        return c;
    }

    public final void LiteBansModule_31(@NotNull String string) {
        c = string;
    }

    public final String e() {
        return e;
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        e = string;
    }

    public final String BaseCoreGenericHandler() {
        return g;
    }

    public final void AsyncBackgroundTask_5(@NotNull String string) {
        g = string;
    }

    public final String LiteBansModule_195() {
        return BaseCoreGenericHandler;
    }

    public final void e(@NotNull String string) {
        BaseCoreGenericHandler = string;
    }

    static {
        LitebansHandler.LiteBansModule_31();
        LiteBansModule_31 = new LitebansHandler();
        AsyncBackgroundTask_5 = "litebans";
        c = "?resourceId=";
        e = "redacted";
        g = "&pluginVersion=";
        BaseCoreGenericHandler = "&CommandThrottleService=";
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_195 = new String[]{"litebans", "?resourceId=", "redacted", "&pluginVersion=", "&CommandThrottleService="};
    }
}

