package litebans;

import java.io.Closeable;
import java.sql.ResultSet;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_185 {
        public static final ResultSet AsyncBackgroundTask_5(@NotNull LiteBansModule_60 bT2) {
        ResultSet resultSet;
        DatabaseMonitorService w2 = bT2.c().AsyncBackgroundTask_5();
        if (bT2.BaseCoreGenericHandler() == null) {
            LiteBansModule_60 bT3 = bT2;
            resultSet = w2.AsyncBackgroundTask_5(bT3);
        } else {
            String string = bT2.BaseCoreGenericHandler();
            if (StringUtilities.LiteBansModule_31(string, "SELECT ", false, 2, null)) {
                LiteBansModule_60 bT4 = bT2;
                resultSet = w2.BaseCoreGenericHandler(bT4);
            } else {
                string = bT2.BaseCoreGenericHandler();
                flag = false;
                if (StringUtilities.LiteBansModule_31(string, "INSERT ", false, 2, null) || StringUtilities.LiteBansModule_31(string, "DELETE ", false, 2, null) || StringUtilities.LiteBansModule_31(string, "UPDATE ", false, 2, null) || StringUtilities.LiteBansModule_31(string, "ALTER ", false, 2, null) || StringUtilities.LiteBansModule_31(string, "CREATE ", false, 2, null)) {
                    LiteBansModule_60 bT5 = bT2;
                    resultSet = w2.c(bT5);
                } else {
                    LiteBansModule_60 bT6 = bT2;
                    resultSet = w2.AsyncBackgroundTask_5(bT6);
                }
            }
        }
        return resultSet;
    }

    public static final ResultSet BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2, @NotNull DescHandler hc2) {
        LiteBansModule_60 bT3 = bT2;
        LiteBansModule_179 eo_02 = hc2.BaseCoreGenericHandler();
        return LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)eo_02.BaseCoreGenericHandler(bT3));
    }

    public static final ResultSet LiteBansModule_31(@NotNull LiteBansModule_60 bT2, @NotNull LiteBansModule_179 eo_02) {
        LiteBansModule_60 bT3 = bT2;
        return LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)eo_02.BaseCoreGenericHandler(bT3));
    }

    public static final ResultSet c(@NotNull LiteBansModule_60 bT2) {
        DatabaseMonitorService w2 = (DatabaseMonitorService)LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(DatabaseMonitorService.class);
        LiteBansModule_60 bT3 = bT2;
        return w2.BaseCoreGenericHandler(bT3);
    }

    public static final ResultSet BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2, @NotNull LiteBansModule_179 eo_02) {
        LiteBansModule_60 bT3 = bT2;
        return LiteBansModule_185.c((LiteBansModule_60)eo_02.BaseCoreGenericHandler(bT3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final int LiteBansModule_31(@NotNull LiteBansModule_60 bT2) {
        DatabaseMonitorService w2 = (DatabaseMonitorService)LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(DatabaseMonitorService.class);
        Closeable closeable = bT2;
        Throwable throwable = null;
        try {
            LiteBansModule_60 bT3 = (LiteBansModule_60)closeable;
            LiteBansModule_60 bT4 = bT2;
            int n = w2.LiteBansModule_31(bT4);
            return n;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
        }
    }

    public static final LiteBansModule_60 BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(DatabaseMonitorService.BaseCoreGenericHandler(bT2.c().AsyncBackgroundTask_5(), false, 1, null));
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"SELECT ", "INSERT ", "DELETE ", "UPDATE ", "ALTER ", "CREATE "};
    }

    static {
        LiteBansModule_185.BaseCoreGenericHandler();
    }
}

