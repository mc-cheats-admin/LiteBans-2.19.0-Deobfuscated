package litebans;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
import litebans.a1;
import litebans.af_0;
import litebans.aj_0;
import litebans.al;
import litebans.az_0;
import litebans.b2;
import litebans.b6;
import litebans.bs_0;
import litebans.cq_0;
import litebans.dt_0;
import litebans.ek;
import litebans.en_0;
import litebans.hn_0;
import litebans.i2;
import litebans.ii_0;
import litebans.ju;
import litebans.jz_0;
import litebans.km_0;
import litebans.y_0;

public class ab_0 {
    private static final int a = 4;
    private static final Map b = new ConcurrentHashMap();

    public static final void a(Class clazz) {
        try {
            en_0 en_02 = (en_0)clazz.newInstance();
            b.put(en_02.c(), clazz);
        }
        catch (ClassCastException classCastException) {
            throw new RuntimeException(clazz + " doesn't implement ZipExtraField");
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException(clazz + " is not a concrete class");
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(clazz + "'s no-arg constructor is not public");
        }
    }

    public static final en_0 a(i2 i22) {
        en_0 en_02 = ab_0.b(i22);
        if (en_02 != null) {
            return en_02;
        }
        y_0 y_02 = new y_0();
        y_02.a(i22);
        return y_02;
    }

    public static final en_0 b(i2 i22) {
        Class clazz = (Class)b.get(i22);
        if (clazz != null) {
            return (en_0)clazz.newInstance();
        }
        return null;
    }

    public static final en_0[] a(byte[] byArray, boolean bl, dt_0 dt_02) {
        Object object;
        int n;
        ArrayList<en_0> arrayList = new ArrayList<en_0>();
        for (int i = 0; i <= byArray.length - 4; i += n + 4) {
            en_0 en_02;
            object = new i2(byArray, i);
            n = new i2(byArray, i + 2).a();
            if (i + 4 + n > byArray.length) {
                en_02 = dt_02.a(byArray, i, byArray.length - i, bl, n);
                if (en_02 == null) break;
                arrayList.add(en_02);
                break;
            }
            try {
                en_02 = Objects.requireNonNull(dt_02.a((i2)object), "createExtraField must not return null");
                arrayList.add(Objects.requireNonNull(dt_02.a(en_02, byArray, i + 4, n, bl), "fill must not return null"));
                continue;
            }
            catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
                throw (ZipException)new ZipException(reflectiveOperationException.getMessage()).initCause(reflectiveOperationException);
            }
        }
        object = new en_0[arrayList.size()];
        return arrayList.toArray((T[])object);
    }

    public static final byte[] b(en_0[] en_0Array) {
        byte[] byArray;
        boolean bl = en_0Array.length > 0 && en_0Array[en_0Array.length - 1] instanceof hn_0;
        int n = bl ? en_0Array.length - 1 : en_0Array.length;
        int n2 = 4 * n;
        for (en_0 en_02 : en_0Array) {
            n2 += en_02.b().a();
        }
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        for (int byArray3 = 0; byArray3 < n; ++byArray3) {
            System.arraycopy(en_0Array[byArray3].c().b(), 0, byArray2, n3, 2);
            System.arraycopy(en_0Array[byArray3].b().b(), 0, byArray2, n3 + 2, 2);
            n3 += 4;
            byte[] byArray4 = en_0Array[byArray3].e();
            if (byArray4 == null) continue;
            System.arraycopy(byArray4, 0, byArray2, n3, byArray4.length);
            n3 += byArray4.length;
        }
        if (bl && (byArray = en_0Array[en_0Array.length - 1].e()) != null) {
            System.arraycopy(byArray, 0, byArray2, n3, byArray.length);
        }
        return byArray2;
    }

    public static final byte[] a(en_0[] en_0Array) {
        byte[] byArray;
        boolean bl = en_0Array.length > 0 && en_0Array[en_0Array.length - 1] instanceof hn_0;
        int n = bl ? en_0Array.length - 1 : en_0Array.length;
        int n2 = 4 * n;
        for (en_0 en_02 : en_0Array) {
            n2 += en_02.a().a();
        }
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        for (int byArray3 = 0; byArray3 < n; ++byArray3) {
            System.arraycopy(en_0Array[byArray3].c().b(), 0, byArray2, n3, 2);
            System.arraycopy(en_0Array[byArray3].a().b(), 0, byArray2, n3 + 2, 2);
            n3 += 4;
            byte[] byArray4 = en_0Array[byArray3].d();
            if (byArray4 == null) continue;
            System.arraycopy(byArray4, 0, byArray2, n3, byArray4.length);
            n3 += byArray4.length;
        }
        if (bl && (byArray = en_0Array[en_0Array.length - 1].d()) != null) {
            System.arraycopy(byArray, 0, byArray2, n3, byArray.length);
        }
        return byArray2;
    }

    public static final en_0 a(en_0 en_02, byte[] byArray, int n, int n2, boolean bl) {
        try {
            if (bl) {
                en_02.a(byArray, n, n2);
            } else {
                en_02.b(byArray, n, n2);
            }
            return en_02;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw (ZipException)new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(en_02.c().a())).initCause(arrayIndexOutOfBoundsException);
        }
    }

    static {
        ab_0.a(ii_0.class);
        ab_0.a(cq_0.class);
        ab_0.a(ju.class);
        ab_0.a(km_0.class);
        ab_0.a(b6.class);
        ab_0.a(b2.class);
        ab_0.a(bs_0.class);
        ab_0.a(jz_0.class);
        ab_0.a(af_0.class);
        ab_0.a(az_0.class);
        ab_0.a(a1.class);
        ab_0.a(aj_0.class);
        ab_0.a(al.class);
        ab_0.a(ek.class);
    }
}

