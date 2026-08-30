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

public static class bU {
    public static final dM c;
    private final di_0 d;
    public static final int b;
    private static /* synthetic */ String[] a;

    public bU(@NotNull di_0 di_02) {
        this.d = di_02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
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
            string = a[0];
        }
        if (bz.a((CharSequence)string, (CharSequence)a[1], false, 2, null)) {
            int n2 = n * n * 101;
            q_02.a((Object)(a[2] + n2 + a[3] + n + a[4]));
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
        a = new String[]{hl.a("", -1325114741), hl.a("\ud16c\ud14d\ud149\ud14c\ud144\ud147\ud14b\ud143\ud108\ud14e\ud147\ud15d\ud146\ud14c\ud108\ud15f\ud140\ud14d\ud146\ud108\ud15c\ud15a\ud151\ud141\ud146\ud14f\ud108\ud15c\ud147\ud108\ud14f\ud14d\ud15c\ud108\ud144\ud147\ud14b\ud143\ud113\ud108\ud15c\ud15a\ud151\ud108\ud15a\ud14d\ud15b\ud15c\ud149\ud15a\ud15c\ud141\ud146\ud14f\ud108\ud15c\ud15a\ud149\ud146\ud15b\ud149\ud14b\ud15c\ud141\ud147\ud146", 465293608), hl.a("\ube1a\ube07\ube1a\ube1c\ube0a\ube0b\ube1a\ube2a\ube0f\ube1b\ube1e\ube0b\ube1a\ube57\ube56\ube5f\ube19\ube1e\ube16\ube13\ube1a\ube1b\ube5f\ube1b\ube0a\ube1a\ube5f\ube0b\ube10\ube5f\ube1b\ube1a\ube1e\ube1b\ube13\ube10\ube1c\ube14\ube51\ube5f\ube28\ube1e\ube16\ube0b\ube5f", 958250623), hl.a("\u0436\u047b\u0465\u0436\u0474\u0473\u0470\u0479\u0464\u0473\u0436\u0464\u0473\u0462\u0464\u046f\u047f\u0478\u0471\u0438\u0438\u0438\u0436\u043e", -1884683242), hl.a("\uc7d4\uc7ce\uc7d2", -1388853253)};
    }
}

