package litebans;

import java.util.Collection;
import java.util.List;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.hq_0;
import litebans.in_0;
import litebans.kz;

/*
 * Renamed from litebans.kb
 */
public static class kb_0 {
    private static /* synthetic */ String[] a;

    private static final Throwable a(Throwable throwable) {
        return ew.a(throwable, kb_0.class.getName());
    }

    public static void a(Object object, String string) {
        String string2 = object == null ? a[0] : object.getClass().getName();
        kb_0.a(string2 + a[1] + string);
    }

    public static void a(String string) {
        throw kb_0.a(new ClassCastException(string));
    }

    public static ClassCastException a(ClassCastException classCastException) {
        throw (ClassCastException)kb_0.a((Throwable)classCastException);
    }

    public static Iterable a(Object object) {
        if (object instanceof dG && !(object instanceof in_0)) {
            kb_0.a(object, a[4]);
        }
        return kb_0.e(object);
    }

    public static Iterable e(Object object) {
        try {
            return (Iterable)object;
        }
        catch (ClassCastException classCastException) {
            throw kb_0.a(classCastException);
        }
    }

    public static Collection b(Object object) {
        if (object instanceof dG && !(object instanceof hq_0)) {
            kb_0.a(object, a[5]);
        }
        return kb_0.d(object);
    }

    public static Collection d(Object object) {
        try {
            return (Collection)object;
        }
        catch (ClassCastException classCastException) {
            throw kb_0.a(classCastException);
        }
    }

    public static List c(Object object) {
        if (object instanceof dG && !(object instanceof kz)) {
            kb_0.a(object, a[6]);
        }
        return kb_0.f(object);
    }

    public static List f(Object object) {
        try {
            return (List)object;
        }
        catch (ClassCastException classCastException) {
            throw kb_0.a(classCastException);
        }
    }

    private static final void a() {
        a = new String[]{hl.a("\u425d\u4246\u425f\u425f", 1714635315), hl.a("\u8a3b\u8a78\u8a7a\u8a75\u8a75\u8a74\u8a6f\u8a3b\u8a79\u8a7e\u8a3b\u8a78\u8a7a\u8a68\u8a6f\u8a3b\u8a6f\u8a74\u8a3b", 925993499), hl.a("\u5e38\u5e3c\u5e27\u5e3f\u5e3a\u5e3d\u5e7d\u5e30\u5e3c\u5e3f\u5e3f\u5e36\u5e30\u5e27\u5e3a\u5e3c\u5e3d\u5e20\u5e7d\u5e1e\u5e26\u5e27\u5e32\u5e31\u5e3f\u5e36\u5e1a\u5e27\u5e36\u5e21\u5e32\u5e27\u5e3c\u5e21", -1483448749), hl.a("\ud437\ud433\ud428\ud430\ud435\ud432\ud472\ud43f\ud433\ud430\ud430\ud439\ud43f\ud428\ud435\ud433\ud432\ud42f\ud472\ud411\ud429\ud428\ud43d\ud43e\ud430\ud439\ud410\ud435\ud42f\ud428\ud415\ud428\ud439\ud42e\ud43d\ud428\ud433\ud42e", -184232868), hl.a("\u947a\u947e\u9465\u947d\u9478\u947f\u943f\u9472\u947e\u947d\u947d\u9474\u9472\u9465\u9478\u947e\u947f\u9462\u943f\u945c\u9464\u9465\u9470\u9473\u947d\u9474\u9458\u9465\u9474\u9463\u9470\u9473\u947d\u9474", -2063428591), hl.a("\ud650\ud654\ud64f\ud657\ud652\ud655\ud615\ud658\ud654\ud657\ud657\ud65e\ud658\ud64f\ud652\ud654\ud655\ud648\ud615\ud676\ud64e\ud64f\ud65a\ud659\ud657\ud65e\ud678\ud654\ud657\ud657\ud65e\ud658\ud64f\ud652\ud654\ud655", -88680901), hl.a("\u62e7\u62e3\u62f8\u62e0\u62e5\u62e2\u62a2\u62ef\u62e3\u62e0\u62e0\u62e9\u62ef\u62f8\u62e5\u62e3\u62e2\u62ff\u62a2\u62c1\u62f9\u62f8\u62ed\u62ee\u62e0\u62e9\u62c0\u62e5\u62ff\u62f8", 1796498060), hl.a("\ubd81\ubd85\ubd9e\ubd86\ubd83\ubd84\ubdc4\ubd89\ubd85\ubd86\ubd86\ubd8f\ubd89\ubd9e\ubd83\ubd85\ubd84\ubd99\ubdc4\ubda7\ubd9f\ubd9e\ubd8b\ubd88\ubd86\ubd8f\ubdb9\ubd8f\ubd9e", 12631530), hl.a("\u4586\u4582\u4599\u4581\u4584\u4583\u45c3\u458e\u4582\u4581\u4581\u4588\u458e\u4599\u4584\u4582\u4583\u459e\u45c3\u45a0\u4598\u4599\u458c\u458f\u4581\u4588\u45a0\u458c\u459d", 1435780589), hl.a("\u71bd\u71b9\u71a2\u71ba\u71bf\u71b8\u71f8\u71b5\u71b9\u71ba\u71ba\u71b3\u71b5\u71a2\u71bf\u71b9\u71b8\u71a5\u71f8\u719b\u71a3\u71a2\u71b7\u71b4\u71ba\u71b3\u719b\u71b7\u71a6\u71f8\u719b\u71a3\u71a2\u71b7\u71b4\u71ba\u71b3\u7193\u71b8\u71a2\u71a4\u71af", -1773243946), hl.a("\ubf93\ubf97\ubf8c\ubf94\ubf91\ubf96\ubfd6\ubf92\ubf8e\ubf95\ubfd6\ubf9e\ubf8d\ubf96\ubf9b\ubf8c\ubf91\ubf97\ubf96\ubf8b\ubfd6\ubfbe\ubf8d\ubf96\ubf9b\ubf8c\ubf91\ubf97\ubf96", -139935752)};
    }

    static {
        kb_0.a();
    }
}

