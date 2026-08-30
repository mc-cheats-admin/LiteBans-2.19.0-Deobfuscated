package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import litebans.aJ;
import litebans.dh;
import litebans.hl;
import litebans.iC;
import litebans.kL;
import litebans.kd;
import litebans.x_0;

public static final class a_
extends Enum
implements CharSequence {
    public static final dh l;
    private final a_ f;
    private final kL m;
    private static final List b;
    public static final a_ h;
    public static final a_ j;
    public static final a_ c;
    public static final a_ g;
    public static final a_ d;
    public static final a_ n;
    public static final a_ e;
    private static final /* synthetic */ a_[] k;
    private static final /* synthetic */ kd a;
    private static /* synthetic */ String[] i;

    /*
     * WARNING - void declaration
     */
    private a_() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.f = var3_1;
        this.m = var4_2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ a_(a_ a_2, kL kL2, int object, aJ aJ2) {
        void var4_5;
        void var1_-1;
        block4: {
            Object object2;
            block6: {
                block5: {
                    void var5_6;
                    if ((var5_6 & 1) != 0) {
                        object = null;
                    }
                    if ((var5_6 & 2) == 0) break block4;
                    object2 = object;
                    if (object2 == null) break block5;
                    kL kL3 = object2.m;
                    object2 = kL3;
                    if (kL3 != null) break block6;
                }
                object2 = (kL)((Object)x_0.a());
            }
            Object object3 = object2;
        }
        this((String)var1_-1, (int)kL2, (a_)object, (kL)var4_5);
    }

    public final kL a() {
        return this.m;
    }

    public final a_ c() {
        a_ a_2 = this.f;
        if (a_2 == null) {
            a_2 = this;
        }
        return a_2;
    }

    public int e() {
        return this.toString().length();
    }

    @Override
    public String toString() {
        String string = super.toString();
        return string.toLowerCase(Locale.ENGLISH);
    }

    @Override
    public IntStream chars() {
        return this.toString().chars();
    }

    @Override
    public IntStream codePoints() {
        return this.toString().codePoints();
    }

    public char a(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    public static a_[] values() {
        return (a_[])k.clone();
    }

    public static a_ a(String string) {
        return Enum.valueOf(a_.class, string);
    }

    @Override
    public final int length() {
        return this.e();
    }

    @Override
    public final char charAt(int n) {
        return this.a(n);
    }

    public static final /* synthetic */ List d() {
        return b;
    }

    static {
        a_.b();
        h = new a_(i[11], 0, null, kL.k, 1, null);
        j = new a_(i[12], 1, null, kL.m, 1, null);
        c = new a_(i[13], 2, null, kL.b, 1, null);
        g = new a_(i[14], 3, null, kL.j, 1, null);
        d = new a_(i[15], 4, h, null, 2, null);
        n = new a_(i[16], 5, j, null, 2, null);
        e = new a_(i[17], 6, c, null, 2, null);
        k = a_Array = new a_[]{a_.h, a_.j, a_.c, a_.g, a_.d, a_.n, a_.e};
        a = iC.a(k);
        l = new dh(null);
        a_[] a_Array = a_.values();
        boolean bl = false;
        a_[] a_Array2 = a_Array;
        Collection collection = new ArrayList();
        boolean bl2 = false;
        int n = a_Array2.length;
        for (int i = 0; i < n; ++i) {
            a_ a_2;
            a_ a_3 = a_2 = a_Array2[i];
            boolean bl3 = false;
            if (!(a_3 == a_3.c())) continue;
            collection.add(a_2);
        }
        b = (List)collection;
    }

    private static final void b() {
        i = new String[]{hl.a("\u276d\u2776", 1978738456), hl.a("\u3c10\u3c01\u3c09\u3c14\u3c3b", 1667972196), hl.a("\ud59a\ud58b\ud583\ud59e\ud5b1\ud587\ud59e", -576530962), hl.a("\u4882\u489b", -1766635285), hl.a("\u57d4\u57cf", 2010404769), hl.a("\uebc2\uebd9", -1979061321), hl.a("\u0e76\u0e67\u0e6f\u0e72\u0e5d", 254807554), hl.a("\u9b8b\u9b9a\u9b92\u9b8f\u9ba0\u9b96\u9b8f", -1345938433), hl.a("\u4c7b\u4c62", 1356221458), hl.a("\u00d7\u00cc", 1969356962), hl.a("\u6ad6\u6acc\u6ac9\u6ac0\u6acb\u6ad1\u6afa", -1430558043), hl.a("\u5516\u5515\u551a", -983280300), hl.a("\u2021\u2039\u2038\u2029", 2028085356), hl.a("\u54a9\u54bf\u54ac\u54b0", -1950919426), hl.a("\u1304\u1306\u130c\u1304", -755625137), hl.a("\u0deb\u0df0\u0dfc\u0dff\u0df0", 366742974), hl.a("\u4267\u427c\u427f\u4267\u4266\u4277", -521584078), hl.a("\ub042\ub059\ub040\ub056\ub045\ub059", -172576745)};
    }
}

