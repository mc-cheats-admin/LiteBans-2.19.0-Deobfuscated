package litebans;

import org.jetbrains.annotations.NotNull;

public final class SecHandler
extends Enum {
    public static final PermanentHandler AsyncBackgroundTask_5;
    private final String[] BroadcastService;
    public static final double m;
    private static final NativepatternHandler c;
    private static final NativepatternHandler e;
    public static final SecHandler LiteBansModule_194;
    public static final SecHandler i;
    public static final SecHandler n;
    public static final SecHandler BaseCoreGenericHandler;
    public static final SecHandler GnuSparseMapHandler;
    public static final SecHandler g;
    public static final SecHandler LiteBansModule_240;
    private static final /* synthetic */ SecHandler[] LiteBansModule_401;
    private static final /* synthetic */ LiteBansModule_372 Utf8Handler_2;
    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SecHandler() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.BroadcastService = var3_1;
    }

    public final long LiteBansModule_31(double d10) {
        double d11;
        double d12 = d10 * 1000.0;
        switch (LiteBansModule_192.BaseCoreGenericHandler[this.ordinal()]) {
            case 1: {
                d11 = d12;
                break;
            }
            case 2: {
                d11 = d12 * 60.0;
                break;
            }
            case 3: {
                d11 = d12 * 60.0 * 60.0;
                break;
            }
            case 4: {
                d11 = d12 * 60.0 * 60.0 * 24.0;
                break;
            }
            case 5: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 7.0;
                break;
            }
            case 6: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 30.0;
                break;
            }
            case 7: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 365.0;
                break;
            }
            default: {
                throw new LiteBansException_5();
            }
        }
        return (long)d11;
    }

    public final boolean LiteBansModule_31(@NotNull String string) {
        boolean flag;
        switch (LiteBansModule_192.BaseCoreGenericHandler[this.ordinal()]) {
            case 1: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.dC, MessageKey.bu);
                break;
            }
            case 2: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.r, MessageKey.cB);
                break;
            }
            case 3: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.cH, MessageKey.SetHandler);
                break;
            }
            case 4: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.LiteBansModule_125, MessageKey.aq);
                break;
            }
            case 5: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.ElementsHandler_3, MessageKey.aU);
                break;
            }
            case 6: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.LiteBansModule_10, MessageKey.aT);
                break;
            }
            case 7: {
                flag = PermanentHandler.BaseCoreGenericHandler(AsyncBackgroundTask_5, string, MessageKey.AsyncBackgroundTask_6, MessageKey.q);
                break;
            }
            default: {
                throw new LiteBansException_5();
            }
        }
        return flag;
    }

    public final CharSequence BaseCoreGenericHandler(double d10) {
        CharSequence charSequence;
        switch (LiteBansModule_192.BaseCoreGenericHandler[this.ordinal()]) {
            case 1: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.dC, (Object)MessageKey.bu);
                break;
            }
            case 2: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.r, (Object)MessageKey.cB);
                break;
            }
            case 3: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.cH, (Object)MessageKey.SetHandler);
                break;
            }
            case 4: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.LiteBansModule_125, (Object)MessageKey.aq);
                break;
            }
            case 5: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.ElementsHandler_3, (Object)MessageKey.aU);
                break;
            }
            case 6: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.LiteBansModule_10, (Object)MessageKey.aT);
                break;
            }
            case 7: {
                charSequence = AsyncBackgroundTask_5.BaseCoreGenericHandler(d10, (Object)MessageKey.AsyncBackgroundTask_6, (Object)MessageKey.q);
                break;
            }
            default: {
                throw new LiteBansException_5();
            }
        }
        return charSequence;
    }

    public static SecHandler[] values() {
        return (SecHandler[])LiteBansModule_401.clone();
    }

    public static SecHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(SecHandler.class, string);
    }

    public static final /* synthetic */ String[] BaseCoreGenericHandler(SecHandler dk2) {
        return dk2.BroadcastService;
    }

    public static final /* synthetic */ NativepatternHandler AsyncBackgroundTask_5() {
        return c;
    }

    public static final /* synthetic */ NativepatternHandler BaseCoreGenericHandler() {
        return e;
    }

    static {
        m = 0.0;
        SecHandler.LiteBansModule_31();
        String[] args = new String[]{"AsyncBackgroundTask_21", "se", "sc", "sec", "secs", "second", "seconds"};
        LiteBansModule_194 = new SecHandler("SECONDS", 0, args);
        args = new String[]{"m", "mi", "min", "mins", "minute", "minutes"};
        i = new SecHandler("MINUTES", 1, args);
        args = new String[]{"LiteBansModule_240", "hr", "hrs", "hour", "hours"};
        n = new SecHandler("HOURS", 2, args);
        args = new String[]{"AsyncBackgroundTask_5", "CommandExecutionTask", "PlayerJoinListener", "day", "days"};
        BaseCoreGenericHandler = new SecHandler("DAYS", 3, args);
        args = new String[]{"DatabaseMonitorService", "we", "wk", "wks", "week", "weeks"};
        GnuSparseMapHandler = new SecHandler("WEEKS", 4, args);
        args = new String[]{"mo", "mh", "mon", "month", "months"};
        g = new SecHandler("MONTHS", 5, args);
        args = new String[]{"HoverTextFormatter", "ye", "yr", "yrs", "year", "years"};
        LiteBansModule_240 = new SecHandler("YEARS", 6, args);
        LiteBansModule_401 = dkArray = new SecHandler[]{SecHandler.LiteBansModule_194, SecHandler.i, SecHandler.n, SecHandler.BaseCoreGenericHandler, SecHandler.GnuSparseMapHandler, SecHandler.g, SecHandler.LiteBansModule_240};
        Utf8Handler_2 = EntriesHandler_3.BaseCoreGenericHandler(LiteBansModule_401);
        AsyncBackgroundTask_5 = new PermanentHandler(null);
        c = new NativepatternHandler("[0-9.]");
        e = new NativepatternHandler("[^0-9.]");
    }

    }

