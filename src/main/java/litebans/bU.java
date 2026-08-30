package litebans;

import java.sql.ResultSet;
import java.sql.Statement;
import litebans.bT;
import litebans.bz;
import litebans.dM;
import litebans.di_0;
import litebans.ew;
import litebans.hl;
import litebans.kx_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public class bU {
    public static final dM c;
    private final di_0 d;
    public static final int b;
    private static /* synthetic */ String[] a;

    public bU(@NotNull di_0 di_02) {
        this.d = di_02;
    }

    public ResultSet c(@NotNull bT var1_1) {
        if (var1_1.c().b()) {
            var2_2 = this;
            var3_4 = null;
            var4_6 = false;
            return kx_0.a();
        }
        var2_3 = this;
        var3_5 = var1_1;
        var4_7 = false;
        var5_8 = var3_5;
        var6_9 = false;
        if (!(var5_8.b().isClosed() == false)) ** GOTO lbl-1000
        var3_5 = var1_1;
        var4_7 = false;
        if (var3_5.b().execute()) {
            var3_5 = var1_1;
            var4_7 = false;
            v0 = var3_5.b().getResultSet();
        } else lbl-1000:
        // 2 sources

        {
            v0 = null;
        }
        var3_5 = v0;
        var4_7 = false;
        v1 /* !! */  = var3_5;
        if (v1 /* !! */  == null) {
            v1 /* !! */  = kx_0.a();
        }
        return v1 /* !! */ ;
    }

    public ResultSet b(@NotNull bT bT2) {
        AutoCloseable autoCloseable;
        if (bT2.c().b()) {
            bU bU2 = this;
            Object var3_4 = null;
            boolean bl = false;
            return kx_0.a();
        }
        bU bU3 = this;
        Object object = bT2;
        boolean bl = false;
        bT bT3 = object;
        boolean bl2 = false;
        if (!bT3.b().isClosed()) {
            object = this;
            AutoCloseable autoCloseable2 = bT2;
            boolean bl3 = false;
            autoCloseable2 = autoCloseable2.b().executeQuery();
            bl3 = false;
            autoCloseable = autoCloseable2;
            if (autoCloseable == null) {
                autoCloseable = kx_0.a();
            }
        } else {
            autoCloseable = null;
        }
        object = autoCloseable;
        boolean bl4 = false;
        Object object2 = object;
        if (object2 == null) {
            object2 = kx_0.a();
        }
        return object2;
    }

    public int a(@NotNull bT bT2) {
        if (bT2.c().b()) {
            return -1;
        }
        int n = 0;
        while (true) {
            bT bT3 = bT2;
            boolean bl = false;
            bT bT4 = bT3;
            boolean bl2 = false;
            if (!(!bT4.b().isClosed())) break;
            try {
                bT3 = bT2;
                bl = false;
                return bT3.b().executeUpdate();
            }
            catch (Exception exception) {
                if (++n <= 5 && this.a(n, exception)) continue;
                throw exception;
            }
            break;
        }
        return -1;
    }

    public int[] a(@NotNull Statement statement) {
        Object object;
        Object object2 = statement;
        boolean bl = false;
        if (!object2.isClosed()) {
            object2 = statement.executeBatch();
            ew.a(object2);
            object = object2;
        } else {
            object = new int[]{};
        }
        return object;
    }

    public String a(@NotNull String string) {
        return string;
    }

    private final boolean a(int n, Throwable throwable) {
        boolean bl;
        q_0 q_02 = (q_0)this.d.a(q_0.class);
        String string = throwable.getMessage();
        if (string == null) {
            string = "";
        }
        if (bz.a((CharSequence)string, (CharSequence)"Deadlock found when trying to get lock; try restarting transaction", false, 2, null)) {
            int n2 = n * n * 101;
            q_02.a((Object)("executeUpdate() failed due to deadlock. Wait " + n2 + " ms before retrying... (" + n + "/5)"));
            Thread.sleep(n2);
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }

    static {
        b = 5;
        bU.a();
        c = new dM(null);
    }

    private static final void a() {
        a = new String[]{"", "Deadlock found when trying to get lock; try restarting transaction", "executeUpdate() failed due to deadlock. Wait ", " ms before retrying... (", "/5)"};
    }
}

