package litebans;

import java.io.Closeable;
import java.sql.ResultSet;
import litebans.bT;
import litebans.bt_0;
import litebans.bz;
import litebans.eo_0;
import litebans.g2;
import litebans.hc;
import litebans.hl;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class eS {
    private static /* synthetic */ String[] a;

    public static final ResultSet d(@NotNull bT bT2) {
        ResultSet resultSet;
        w w2 = bT2.c().d();
        if (bT2.a() == null) {
            bT bT3 = bT2;
            boolean bl = false;
            resultSet = w2.d(bT3);
        } else {
            String string = bT2.a();
            boolean bl = false;
            if (bz.b(string, "SELECT ", false, 2, null)) {
                bT bT4 = bT2;
                boolean bl2 = false;
                resultSet = w2.a(bT4);
            } else {
                string = bT2.a();
                bl = false;
                if (bz.b(string, "INSERT ", false, 2, null) || bz.b(string, "DELETE ", false, 2, null) || bz.b(string, "UPDATE ", false, 2, null) || bz.b(string, "ALTER ", false, 2, null) || bz.b(string, "CREATE ", false, 2, null)) {
                    bT bT5 = bT2;
                    boolean bl3 = false;
                    resultSet = w2.c(bT5);
                } else {
                    bT bT6 = bT2;
                    boolean bl4 = false;
                    resultSet = w2.d(bT6);
                }
            }
        }
        return resultSet;
    }

    public static final ResultSet a(@NotNull bT bT2, @NotNull hc hc2) {
        bT bT3 = bT2;
        eo_0 eo_02 = hc2.a();
        boolean bl = false;
        return eS.d((bT)eo_02.a(bT3));
    }

    public static final ResultSet b(@NotNull bT bT2, @NotNull eo_0 eo_02) {
        bT bT3 = bT2;
        boolean bl = false;
        return eS.d((bT)eo_02.a(bT3));
    }

    public static final ResultSet c(@NotNull bT bT2) {
        w w2 = (w)g2.b.a().a(w.class);
        bT bT3 = bT2;
        boolean bl = false;
        return w2.a(bT3);
    }

    public static final ResultSet a(@NotNull bT bT2, @NotNull eo_0 eo_02) {
        bT bT3 = bT2;
        boolean bl = false;
        return eS.c((bT)eo_02.a(bT3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final int b(@NotNull bT bT2) {
        w w2 = (w)g2.b.a().a(w.class);
        Closeable closeable = bT2;
        Throwable throwable = null;
        try {
            bT bT3 = (bT)closeable;
            boolean bl = false;
            bT bT4 = bT2;
            boolean bl2 = false;
            int n = w2.b(bT4);
            return n;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    public static final bT a(@NotNull bT bT2) {
        return bT2.a(w.a(bT2.c().d(), false, 1, null));
    }

    private static final void a() {
        a = new String[]{"SELECT ", "INSERT ", "DELETE ", "UPDATE ", "ALTER ", "CREATE "};
    }

    static {
        eS.a();
    }
}

