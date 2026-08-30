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

public final class a_
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
        h = new a_("BAN", 0, null, kL.k, 1, null);
        j = new a_("MUTE", 1, null, kL.m, 1, null);
        c = new a_("WARN", 2, null, kL.b, 1, null);
        g = new a_("KICK", 3, null, kL.j, 1, null);
        d = new a_("UNBAN", 4, h, null, 2, null);
        n = new a_("UNMUTE", 5, j, null, 2, null);
        e = new a_("UNWARN", 6, c, null, 2, null);
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
        i = new String[]{"un", "temp_", "temp_ip", "ip", "un", "un", "temp_", "temp_ip", "ip", "un", "silent_", "BAN", "MUTE", "WARN", "KICK", "UNBAN", "UNMUTE", "UNWARN"};
    }
}

