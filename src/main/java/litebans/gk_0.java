package litebans;

import litebans.cr_0;
import litebans.di_0;
import litebans.hl;
import litebans.iy;
import litebans.l2;
import litebans.la_0;
import litebans.lb_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.gK
 */
public static class gk_0 {
    private static /* synthetic */ String[] a;

    public static cr_0 b(di_0 di_02, String string) {
        iy iy2 = gk_0.a(di_02, string);
        if (iy2 != null) {
            return iy2;
        }
        String string2 = a[0];
        try {
            Class.forName(a[1]).getMethod(string2, new Class[0]);
            return new lb_0(di_02);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return gk_0.c(di_02, string2);
        }
        catch (Exception | LinkageError throwable) {
            throw new RuntimeException(a[2] + string, throwable);
        }
    }

    private static final @Nullable iy a(di_0 di_02, String string) {
        try {
            Class.forName(a[3]);
            return new iy(di_02);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
        catch (Exception | LinkageError throwable) {
            throw new RuntimeException(a[4] + string, throwable);
        }
    }

    protected static @NotNull cr_0 c(di_0 di_02, String string) {
        try {
            Class.forName(a[5]);
            return new l2(di_02);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return new la_0(di_02);
        }
    }

    private static final void a() {
        a = new String[]{hl.a("\u06e9\u06e1\u06f0\u06ec\u06eb\u06e0\u06db\u06b2\u06b0\u06b7\u06bd\u06b2", -453572988), hl.a("\u97b8\u97b3\u97a2\u97f8\u97bb\u97bf\u97b8\u97b3\u97b5\u97a4\u97b7\u97b0\u97a2\u97f8\u97b5\u97ba\u97b7\u97a5\u97a5\u9789\u97e5\u97e4\u97e4\u97e4", 2064881622), hl.a("\u791f\u7933\u7931\u792c\u793d\u7928\u7935\u793e\u7935\u7930\u7935\u7928\u7925\u797c\u793f\u7934\u7939\u793f\u7937\u797c\u793a\u793d\u7935\u7930\u7939\u7938\u797c\u7974\u796d\u7972\u796e\u796d\u7975\u797c\u793a\u7933\u792e\u797c", -1479902884), hl.a("\u61fb\u61f0\u61e1\u61bb\u61f8\u61fc\u61fb\u61f0\u61f6\u61e7\u61f4\u61f3\u61e1\u61bb\u61c2\u61fa\u61e7\u61f9\u61f1\u61c3\u61f0\u61e7\u61e6\u61fc\u61fa\u61fb", -1619238507), hl.a("\uea17\uea3b\uea39\uea24\uea35\uea20\uea3d\uea36\uea3d\uea38\uea3d\uea20\uea2d\uea74\uea37\uea3c\uea31\uea37\uea3f\uea74\uea32\uea35\uea3d\uea38\uea31\uea30\uea74\uea7c\uea66\uea62\uea7d\uea74\uea32\uea3b\uea26\uea74", -892147116), hl.a("\ue234\ue23f\ue22e\ue274\ue237\ue233\ue234\ue23f\ue239\ue228\ue23b\ue23c\ue22e\ue274\ue239\ue236\ue23b\ue229\ue229\ue205\ue262\ue26d\ue26b\ue26a", -997989798)};
    }

    static {
        gk_0.a();
    }
}

