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
            v2 = this;
            var3_4 = null;
            var4_6 = false;
            return LiteBansModule_397.BaseCoreGenericHandler();
        }
        var2_3 = this;
        var3_5 = v1;
        var4_7 = false;
        var5_8 = var3_5;
        var6_9 = false;
        if (!(var5_8.LiteBansModule_31().isClosed() == false)) ** GOTO lbl-1000
        var3_5 = v1;
        var4_7 = false;
        if (var3_5.LiteBansModule_31().execute()) {
            var3_5 = v1;
            var4_7 = false;
            v0 = var3_5.LiteBansModule_31().getResultSet();
        } else lbl-1000:
        // 2 sources

        {
            v0 = null;
        }
        var3_5 = v0;
        var4_7 = false;
        v1 /* !! */  = var3_5;
        if (v1 /* !! */  == null) {
            v1 /* !! */  = LiteBansModule_397.BaseCoreGenericHandler();
        }
        return v1 /* !! */ ;
    }

    public ResultSet LiteBansModule_31(@NotNull LiteBansModule_60 bT2) {
        AutoCloseable autoCloseable;
        if (bT2.c().LiteBansModule_31()) {
            ProxyPreparedStatement bU2 = this;
            Object var3_4 = null;
            boolean flag = false;
            return LiteBansModule_397.BaseCoreGenericHandler();
        }
        ProxyPreparedStatement bU3 = this;
        Object object = bT2;
        boolean flag = false;
        LiteBansModule_60 bT3 = object;
        boolean flag2 = false;
        if (!bT3.LiteBansModule_31().isClosed()) {
            object = this;
            AutoCloseable autoCloseable2 = bT2;
            boolean flag3 = false;
            autoCloseable2 = autoCloseable2.LiteBansModule_31().executeQuery();
            flag3 = false;
            autoCloseable = autoCloseable2;
            if (autoCloseable == null) {
                autoCloseable = LiteBansModule_397.BaseCoreGenericHandler();
            }
        } else {
            autoCloseable = null;
        }
        object = autoCloseable;
        boolean flag4 = false;
        Object object2 = object;
        if (object2 == null) {
            object2 = LiteBansModule_397.BaseCoreGenericHandler();
        }
        return object2;
    }

    public int BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        if (bT2.c().LiteBansModule_31()) {
            return -1;
        }
        int n = 0;
        while (true) {
            LiteBansModule_60 bT3 = bT2;
            boolean flag = false;
            LiteBansModule_60 bT4 = bT3;
            boolean flag2 = false;
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
        Object object;
        Object object2 = statement;
        boolean flag = false;
        if (!object2.isClosed()) {
            object2 = statement.executeBatch();
            ObjectUtilities.BaseCoreGenericHandler(object2);
            object = object2;
        } else {
            object = new int[]{};
        }
        return object;
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
        c = new LiteBansModule_127(null);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "Deadlock found when trying to get lock; try restarting transaction", "executeUpdate() failed due to deadlock. Wait ", " ms before retrying... (", "/5)"};
    }
}

