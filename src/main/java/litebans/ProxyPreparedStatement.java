package litebans;

import java.sql.ResultSet;
import java.sql.Statement;
import org.jetbrains.annotations.NotNull;

public class ProxyPreparedStatement {
    public static final LiteBansModule_127 c;
    private final PlatformPlugin AsyncBackgroundTask_5;
    public static final int LiteBansModule_31;
    public ProxyPreparedStatement(@NotNull PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    public ResultSet c(@NotNull LiteBansModule_60 v1) {
        if (v1.c().LiteBansModule_31()) {
                        return LiteBansModule_397.BaseCoreGenericHandler();
        }
                arg2 = v1;
        arg3 = arg2;
        if (!(arg3.LiteBansModule_31().isClosed() == false)) ** GOTO lbl-1000
        arg2 = v1;
        if (arg2.LiteBansModule_31().execute()) {
            arg2 = v1;
            v0 = arg2.LiteBansModule_31().getResultSet();
        } else lbl-1000:
                {
        }
        arg2 = v0;
        v1   = arg2;
        if (v1   == null) {
            v1   = LiteBansModule_397.BaseCoreGenericHandler();
        }
        return v1  ;
    }

    public ResultSet LiteBansModule_31(@NotNull LiteBansModule_60 bT2) {
        AutoCloseable autoCloseable;
        if (bT2.c().LiteBansModule_31()) {
            ProxyPreparedStatement bU2 = this;
            Object arg4 = null;
            return LiteBansModule_397.BaseCoreGenericHandler();
        }
        ProxyPreparedStatement bU3 = this;
        Object targetObj = bT2;
        LiteBansModule_60 bT3 = targetObj;
        if (!bT3.LiteBansModule_31().isClosed()) {
            targetObj = this;
            AutoCloseable autoCloseable2 = bT2;
            autoCloseable2 = autoCloseable2.LiteBansModule_31().executeQuery();
            flag3 = false;
            autoCloseable = autoCloseable2;
            if (autoCloseable == null) {
                autoCloseable = LiteBansModule_397.BaseCoreGenericHandler();
} else {
            autoCloseable = null;
        }
        targetObj = autoCloseable;
        Object contextObj = targetObj;
        if (contextObj == null) {
            contextObj = LiteBansModule_397.BaseCoreGenericHandler();
        }
        return contextObj;
    }

    public int BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        if (bT2.c().LiteBansModule_31()) {
            return -1;
        }
        while (true) {
            LiteBansModule_60 bT3 = bT2;
            LiteBansModule_60 bT4 = bT3;
            if (!(!bT4.LiteBansModule_31().isClosed())) break;
            try {
                bT3 = bT2;
                flag = false;
                return bT3.LiteBansModule_31().executeUpdate();
            }
            catch (Exception exception) {
                if (++n <= 5 && this.plugin(n, exception)) continue;
                throw exception;
            }
            break;
        }
        return -1;
    }

    public int[] BaseCoreGenericHandler(@NotNull Statement statement) {
        Object contextObj = statement;
        if (!contextObj.isClosed()) {
            contextObj = statement.executeBatch();
            ObjectUtilities.BaseCoreGenericHandler(contextObj);
            targetObj = contextObj;
        } else {
            targetObj = new int[]{ }
        }
        return targetObj;
    }

    public String BaseCoreGenericHandler(@NotNull String string) {
        return string;
    }

    private final boolean BaseCoreGenericHandler(int n, Throwable throwable) {
        boolean flag;
        ConfigService configService = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
        String string = throwable.getMessage();
        if (string == null) {
            string = "";
        }
        if (StringUtilities.BaseCoreGenericHandler(string, (CharSequence)"Deadlock found when trying to get lock; try restarting transaction", false, 2, null)) {
            int n2 = n * n * 101;
            configService.BaseCoreGenericHandler((Object)("executeUpdate() failed due to deadlock. Wait " + n2 + " ms before retrying... (" + n + "/5)"));
            Thread.sleep(n2);
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    static {
        LiteBansModule_31 = 5;
        ProxyPreparedStatement.BaseCoreGenericHandler();
        c = new LiteBansModule_127(null);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "Deadlock found when trying to get lock; try restarting transaction", "executeUpdate() failed due to deadlock. Wait ", " ms before retrying... (", "/5)"};
}

