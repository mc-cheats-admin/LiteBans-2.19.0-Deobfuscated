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

public static final class eS {
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
            if (bz.b(string, a[0], false, 2, null)) {
                bT bT4 = bT2;
                boolean bl2 = false;
                resultSet = w2.a(bT4);
            } else {
                string = bT2.a();
                bl = false;
                if (bz.b(string, a[1], false, 2, null) || bz.b(string, a[2], false, 2, null) || bz.b(string, a[3], false, 2, null) || bz.b(string, a[4], false, 2, null) || bz.b(string, a[5], false, 2, null)) {
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
        a = new String[]{hl.a("\u6937\u6921\u6928\u6921\u6927\u6930\u6944", 678586724), hl.a("\u771f\u7718\u7705\u7713\u7704\u7702\u7776", -947423402), hl.a("\u5f0d\u5f0c\u5f05\u5f0c\u5f1d\u5f0c\u5f69", 350838601), hl.a("\ude66\ude63\ude77\ude72\ude67\ude76\ude13", -428876237), hl.a("\u792d\u7920\u7938\u7929\u793e\u794c", -169117332), hl.a("\u4b9e\u4b8f\u4b98\u4b9c\u4b89\u4b98\u4bfd", 1391021021)};
    }

    static {
        eS.a();
    }
}

