package litebans;

import java.sql.ResultSet;
import java.sql.Statement;
import org.jetbrains.annotations.NotNull;

public class ProxyPreparedStatement {
    public static final LiteBansModule_128 c;
    private final PlatformPlugin AsyncBackgroundTask_5;
    public static final int LiteBansModule_31;
        public ProxyPreparedStatement(@NotNull PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    public ResultSet c(@NotNull LiteBansModule_60 v1) {
        if (v1.c().LiteBansModule_31()) {
            v2 = this;
            return LiteBansModule_399.BaseCoreGenericHandler();
        }
        v3 = this;
        v4 = v1;
        v5 = v4;
        if (!(v5.LiteBansModule_31().isClosed() == false)) ** GOTO lbl-1000
        v4 = v1;
        if (v4.LiteBansModule_31().execute()) {
            v4 = v1;
            v0 = v4.LiteBansModule_31().getResultSet();
        } else lbl-1000:
                {
            v0 = null;
        }
        v4 = v0;
        v1   = v4;
        if (v1   == null) {
            v1   = LiteBansModule_399.BaseCoreGenericHandler();
        }
        return v1  ;
    }

    public ResultSet LiteBansModule_31(@NotNull LiteBansModule_60 bT2) {
        AutoCloseable autoCloseable;
        if (bT2.c().LiteBansModule_31()) {
            ProxyPreparedStatement bU2 = this;
            Object v6 = null;
            return LiteBansModule_399.BaseCoreGenericHandler();
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
                autoCloseable = LiteBansModule_399.BaseCoreGenericHandler();
            }
        } else {
            autoCloseable = null;
        }
        targetObj = autoCloseable;
        Object contextObj = targetObj;
        if (contextObj == null) {
            contextObj = LiteBansModule_399.BaseCoreGenericHandler();
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
            targetObj = new int[]{};
        }
        return targetObj;
    }

    public String BaseCoreGenericHandler(@NotNull String string) {
        return string;
    }

    private final boolean BaseCoreGenericHandler(int n, Throwable throwable) {
        boolean flag;
        ConfigService configService = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
        String string = throwable.getMessage();
        if (string == null) {
            string = "";
        }
        if (StringUtilities.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"Deadlock found when trying to get lock; try restarting transaction", false, 2, null)) {
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
        c = new LiteBansModule_128(null);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "Deadlock found when trying to get lock; try restarting transaction", "executeUpdate() failed due to deadlock. Wait ", " ms before retrying... (", "/5)"};
    }
}

