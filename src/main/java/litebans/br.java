package litebans;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import litebans.aJ;
import litebans.bE;
import litebans.bz;
import litebans.di_0;
import litebans.eo_0;
import litebans.ew;
import litebans.ez_0;
import litebans.fB;
import litebans.h1;
import litebans.h5;
import litebans.hV;
import litebans.hl;
import litebans.ho_0;
import litebans.iX;
import litebans.iv_0;
import litebans.jT;
import litebans.jg_0;
import litebans.ji_0;
import litebans.k9;
import litebans.kb_0;
import litebans.kq_0;
import litebans.l6;
import litebans.ll;
import litebans.lo_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class br {
    public static final hV P;
    private final long I;
    private final iX B;
    private final byte[] h;
    private final k9 u;
    private final boolean J;
    private long O;
    private int c;
    private int T;
    private final byte[] X;
    private final byte[] t;
    private final byte[] y;
    private List m;
    private List a;
    private byte[][] k;
    private boolean q;
    private boolean p;
    public static final boolean H;
    public static final int v;
    public static final int l;
    public static final boolean N;
    public static final char A;
    public static final byte V;
    public static final int C;
    public static final int x;
    public static final byte i;
    public static final int W;
    public static final int j;
    public static final int M;
    public static final int n;
    public static final int S;
    public static final int d;
    public static final int r;
    public static final int K;
    public static final boolean z;
    public static final int R;
    public static final int Q;
    public static final int g;
    public static final int E;
    public static final int w;
    public static final boolean L;
    public static final boolean U;
    public static final boolean o;
    public static final boolean F;
    public static final boolean G;
    public static final boolean e;
    public static final boolean D;
    public static final boolean s;
    public static final boolean b;
    private static /* synthetic */ String[] f;

    private br(long l3, iX iX2, byte[] byArray, k9 k92, boolean bl, long l5, int n, int n2) {
        this.I = l3;
        this.B = iX2;
        this.h = byArray;
        this.u = k92;
        this.J = bl;
        this.O = l5;
        this.c = n;
        this.T = n2;
        this.X = new byte[80];
        this.t = new byte[80];
        byte[] byArray2 = new byte[]{32, 16, 8, 4, 2, 1};
        this.y = byArray2;
        this.m = ll.e();
        this.a = ll.e();
        this.i();
    }

    public /* synthetic */ br(long l3, iX iX2, byte[] byArray, k9 k92, boolean bl, long l5, int n, int n2, int n3, aJ aJ2) {
        if ((n3 & 8) != 0) {
            k92 = new k9(iX2, null, 2, null);
        }
        if ((n3 & 0x10) != 0) {
            bl = false;
        }
        if ((n3 & 0x20) != 0) {
            l5 = 0L;
        }
        if ((n3 & 0x40) != 0) {
            n = 0;
        }
        if ((n3 & 0x80) != 0) {
            n2 = 0;
        }
        this(l3, iX2, byArray, k92, bl, l5, n, n2, null);
    }

    public final long c() {
        return this.I;
    }

    public final iX m() {
        return this.B;
    }

    public final k9 b() {
        return this.u;
    }

    public final boolean f() {
        return this.J;
    }

    public final byte[] n() {
        return this.X;
    }

    public final byte[] d() {
        return this.t;
    }

    public final List l() {
        return this.m;
    }

    public final void a(@NotNull List list) {
        this.m = list;
    }

    public final List e() {
        return this.a;
    }

    public final void b(@NotNull List list) {
        this.a = list;
    }

    public final byte[][] a() {
        return this.k;
    }

    public final void a(@Nullable byte[][] byArray) {
        this.k = byArray;
    }

    public final boolean j() {
        return this.q;
    }

    public final void b(boolean bl) {
        this.q = bl;
    }

    public final void a(boolean bl) {
        this.p = bl;
    }

    public final StringBuilder a(@NotNull byte[] byArray) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(byArray.length + 1);
        boolean bl = false;
        byte[] byArray2 = byArray;
        boolean bl2 = false;
        int n = byArray2.length;
        for (int i = 0; i < n; ++i) {
            byte by2;
            byte by3 = by2 = byArray2[i];
            boolean bl3 = false;
            br br2 = this;
            boolean bl4 = false;
            stringBuilder2.append((char)(br2.d()[by3] + 44));
        }
        return stringBuilder;
    }

    public final void i() {
        this.X[53] = 1;
        this.t[1] = 53;
        this.X[57] = 2;
        this.t[2] = 57;
        this.X[71] = 3;
        this.t[3] = 71;
        this.X[64] = 4;
        this.t[4] = 64;
        this.X[70] = 5;
        this.t[5] = 70;
        this.X[61] = 6;
        this.t[6] = 61;
        this.X[65] = 7;
        this.t[7] = 65;
        this.X[66] = 8;
        this.t[8] = 66;
        this.X[67] = 9;
        this.t[9] = 67;
        this.X[72] = 10;
        this.t[10] = 72;
        this.X[63] = 11;
        this.t[11] = 63;
        this.X[55] = 12;
        this.t[12] = 55;
        this.X[56] = 13;
        this.t[13] = 56;
        this.X[73] = 14;
        this.t[14] = 73;
        this.X[51] = 15;
        this.t[15] = 51;
        this.X[5] = 16;
        this.t[16] = 5;
        this.X[54] = 17;
        this.t[17] = 54;
        this.X[68] = 18;
        this.t[18] = 68;
        this.X[60] = 19;
        this.t[19] = 60;
        this.X[78] = 20;
        this.t[20] = 78;
        this.X[77] = 21;
        this.t[21] = 77;
        this.X[6] = 22;
        this.t[22] = 6;
        this.X[59] = 23;
        this.t[23] = 59;
        this.X[7] = 24;
        this.t[24] = 7;
        this.X[74] = 25;
        this.t[25] = 74;
        this.X[4] = 26;
        this.t[26] = 4;
        this.X[76] = 27;
        this.t[27] = 76;
        this.X[62] = 28;
        this.t[28] = 62;
        this.X[58] = 29;
        this.t[29] = 58;
        this.X[8] = 30;
        this.t[30] = 8;
        this.X[9] = 31;
        this.t[31] = 9;
        this.X[13] = 32;
        this.t[32] = 13;
        this.X[12] = 33;
        this.t[33] = 12;
        this.X[10] = 34;
        this.t[34] = 10;
        this.X[11] = 35;
        this.t[35] = 11;
        this.X[75] = 36;
        this.t[36] = 75;
        this.X[69] = 37;
        this.t[37] = 69;
        this.X[1] = 79;
        this.t[79] = 1;
    }

    public final int a(char c) {
        br br2 = this;
        boolean bl = false;
        return br2.n()[c - 44] << 16;
    }

    public final void b(@NotNull jg_0 jg_02) {
        List list = this.m;
        ew.b(list, f[0]);
        ((Collection)kb_0.c(list)).add(jg_02);
    }

    public final void h() {
        Iterable iterable = this.m;
        br br2 = this;
        boolean bl = false;
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList();
        boolean bl2 = false;
        for (Object t2 : iterable2) {
            jg_0 jg_02 = (jg_0)t2;
            boolean bl3 = false;
            if (!(jg_02.e() != 0)) continue;
            collection.add(t2);
        }
        br2.m = (List)collection;
    }

    public final void a(@NotNull byte[] byArray, @NotNull ByteArrayOutputStream byteArrayOutputStream) {
        for (byte by2 : byArray) {
            if (by2 >= 128 || by2 < -8) {
                Object v0;
                block4: {
                    Iterable iterable = this.m;
                    for (Object t2 : iterable) {
                        jg_0 jg_02 = (jg_0)t2;
                        boolean bl = false;
                        if (!(jg_02.e() == by2)) continue;
                        v0 = t2;
                        break block4;
                    }
                    v0 = null;
                }
                jg_0 jg_03 = v0;
                if (jg_03 != null) {
                    byteArrayOutputStream.write(jg_03.c());
                    continue;
                }
            }
            byteArrayOutputStream.write(by2);
        }
    }

    public final byte[] a(@NotNull byte[] byArray, @NotNull jg_0 jg_02) {
        byte[] byArray2 = jg_02.c();
        byte[] byArray3 = new byte[byArray.length];
        int n = 0;
        int n2 = byArray.length - byArray2.length;
        int n3 = 0;
        n3 = Integer.MIN_VALUE;
        boolean bl = false;
        int n4 = 0;
        byte[] byArray4 = byArray;
        boolean bl2 = false;
        int n5 = 0;
        for (byte by2 : byArray4) {
            int n6;
            int n7 = n5++;
            byte by3 = by2;
            int n8 = n7;
            boolean bl3 = false;
            if (n8 >= n3) {
                if (n8 < n2 && kq_0.a(byArray2, byArray, n8, n8 + byArray2.length)) {
                    bl = true;
                    n6 = n;
                    n = n6 + 1;
                    byArray3[n6] = jg_02.e();
                    ++n4;
                    n3 = n8 + byArray2.length;
                    continue;
                }
                bl = false;
            }
            if (bl) continue;
            n6 = n;
            n = n6 + 1;
            byArray3[n6] = by3;
        }
        if (n == byArray.length) {
            return byArray;
        }
        byArray4 = lo_0.a(byArray3, 0, n);
        return byArray4;
    }

    public final byte[] a(@NotNull byte[] byArray, int n, int n2, @NotNull eo_0 eo_02) {
        byte[] byArray2 = null;
        byArray2 = byArray;
        byte by2 = 0;
        by2 = (byte)n;
        List list = this.m;
        int n3 = 0;
        Object object = list;
        boolean bl = false;
        Object object2 = object.iterator();
        while (object2.hasNext()) {
            byte[] byArray3;
            boolean bl2;
            Object t2 = object2.next();
            jg_0 jg_02 = (jg_0)t2;
            boolean bl3 = false;
            if (++n3 > n2) {
                return byArray2;
            }
            boolean bl4 = bl2 = jg_02.e() == 0;
            if (bl2) {
                byte by3 = by2;
                by2 = (byte)(by3 + 1);
                jg_02.a(by3);
            } else {
                by2 = (byte)(jg_02.e() + 1);
            }
            if ((byArray3 = this.a(byArray2, jg_02)) != byArray2) {
                byArray2 = byArray3;
                eo_02.a(jg_02);
                continue;
            }
            if (!bl2) continue;
            jg_02.a((byte)0);
            by2 = (byte)(by2 + -1);
            n3 += -1;
        }
        object = this;
        Object var10_11 = null;
        object2 = byArray.toString();
        boolean bl5 = false;
        return byArray2;
    }

    public static /* synthetic */ byte[] a(br br2, byte[] byArray, int n, int n2, eo_0 eo_02, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 128;
        }
        if ((n3 & 4) != 0) {
            n2 = 70;
        }
        if ((n3 & 8) != 0) {
            eo_02 = br::a;
        }
        return br2.a(byArray, n, n2, eo_02);
    }

    public final void a(@NotNull byte[] byArray, @NotNull byte[] byArray2, boolean bl, boolean bl2) {
        if (bl2) {
            this.B.a(this.I);
        }
        if (bl) {
            byte[] byArray3 = byArray2;
            boolean bl3 = false;
            int n = 0;
            for (byte by2 : byArray3) {
                int n2 = n++;
                boolean bl4 = false;
                byArray2[n2] = this.a(byArray[n2]);
            }
        } else {
            byte[] byArray4 = byArray2;
            boolean bl5 = false;
            int n = 0;
            for (byte by3 : byArray4) {
                int n3 = n++;
                boolean bl6 = false;
                byArray2[n3] = this.b(byArray[n3]);
            }
        }
    }

    public static /* synthetic */ void a(br br2, byte[] byArray, byte[] byArray2, boolean bl, boolean bl2, int n, Object object) {
        if ((n & 4) != 0) {
            bl = true;
        }
        if ((n & 8) != 0) {
            bl2 = true;
        }
        br2.a(byArray, byArray2, bl, bl2);
    }

    public final void b(@NotNull byte[] byArray, int n, boolean bl, boolean bl2) {
        for (int i = 0; i < n; ++i) {
            int n2 = i;
            boolean bl3 = false;
            int n3 = n2 * 2;
            byte by2 = h5.d(this.h, this.B);
            if (bl2) {
                by2 = (byte)(by2 + h5.d(this.h, this.B));
            }
            byArray[n3] = by2;
            byte by3 = h5.d(this.u.b(), this.B);
            if (!bl) continue;
            byArray[n3 + 1] = by3;
        }
    }

    public final int a(@NotNull byte[] byArray, int n, @NotNull CharSequence charSequence, boolean bl) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3 = i;
            boolean bl2 = false;
            int n4 = n3 * 2;
            byte by2 = byArray[n4];
            br br2 = this;
            char c = charSequence.charAt(n3);
            boolean bl3 = false;
            byte by3 = (byte)(br2.n()[c - 44] - by2);
            if (bl) {
                byte by4 = byArray[n4 + 1];
                by3 = (byte)(by3 ^ by4);
            }
            if ((n2 += this.c(by3)) > -7) continue;
            return n2;
        }
        return n2;
    }

    public final byte[] o() {
        Serializable serializable;
        Iterator iterator;
        Object object;
        Object object2;
        byte by222;
        byte[] byArray = this.u.b();
        int n = this.a.size();
        bE bE2 = new bE(Math.max(1, n / 4096), Math.max(1, n / 1024), Math.max(1, n / 512));
        HashMap hashMap = new HashMap(32);
        HashMap hashMap2 = new HashMap(this.u.b().length);
        for (jT jT2 : this.a) {
            Object object3;
            int n2 = ((Number)jT2.b()).intValue();
            byte by3 = ((Number)jT2.e()).byteValue();
            int n3 = 0;
            for (byte by222 : this.y) {
                if ((byte)(by3 ^ by222) >= by3) continue;
                n3 |= by222;
            }
            object2 = hashMap2;
            object = n2;
            by222 = 0;
            iterator = object2.get(object);
            if (iterator == null) {
                boolean bl = false;
                serializable = new ArrayList(32);
                object2.put(object, serializable);
                object3 = serializable;
            } else {
                object3 = iterator;
            }
            ArrayList object4 = (ArrayList)object3;
            ((Collection)object4).add((byte)n3);
        }
        Map map = hashMap2;
        boolean bl = false;
        Iterator iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Serializable serializable2;
            int n4;
            Object object5;
            int n5;
            Map.Entry entry;
            Map.Entry entry2 = entry = iterator2.next();
            boolean bl2 = false;
            object2 = (ArrayList)entry2.getValue();
            object = ((ArrayList)object2).iterator();
            while (object.hasNext()) {
                Object object4;
                by222 = ((Number)object.next()).byteValue();
                iterator = hashMap;
                serializable = by222;
                n5 = 0;
                object5 = iterator.get(serializable);
                if (object5 == null) {
                    int n2;
                    n4 = 0;
                    Iterable iterable = (Iterable)object2;
                    boolean bl3 = false;
                    if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                        n2 = 0;
                    } else {
                        int n7 = 0;
                        for (Object t2 : iterable) {
                            byte by4 = ((Number)t2).byteValue();
                            boolean bl4 = false;
                            if (!(by4 == by222) || ++n7 >= 0) continue;
                            ll.c();
                        }
                        n2 = n7;
                    }
                    Integer n8 = n2;
                    iterator.put(serializable, n8);
                    object4 = n8;
                } else {
                    object4 = object5;
                }
                int n9 = ((Number)object4).intValue();
                this.a(n9, by222, ((Number)entry2.getKey()).intValue(), bE2);
            }
            Iterable iterable = ((Map)hashMap).entrySet();
            iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                throw new NoSuchElementException();
            }
            serializable = iterator.next();
            if (!iterator.hasNext()) {
                serializable2 = serializable;
            } else {
                Map.Entry entry3 = (Map.Entry)((Object)serializable);
                boolean bl5 = false;
                n5 = ((Number)entry3.getValue()).intValue();
                do {
                    object5 = iterator.next();
                    Map.Entry entry4 = (Map.Entry)object5;
                    boolean bl6 = false;
                    n4 = ((Number)entry4.getValue()).intValue();
                    if (n5 >= n4) continue;
                    serializable = object5;
                    n5 = n4;
                } while (iterator.hasNext());
                serializable2 = serializable;
            }
            object = (Map.Entry)((Object)serializable2);
            this.a(((Number)object.getValue()).intValue(), ((Number)object.getKey()).byteValue(), ((Number)entry2.getKey()).intValue(), bE2);
            hashMap.clear();
        }
        this.a = ll.e();
        return byArray;
    }

    private final void a(int n, byte by2, int n2, bE bE2) {
        if (by2 <= 7 && n >= bE2.c() || by2 <= 31 && n >= bE2.b() || n > bE2.a()) {
            this.u.b()[n2] = by2;
        }
    }

    private final int c(byte by2) {
        int n;
        switch (by2) {
            case 0: {
                n = 7;
                break;
            }
            case -3: 
            case -1: 
            case 1: 
            case 13: {
                n = 3;
                break;
            }
            default: {
                n = -1;
            }
        }
        return n;
    }

    public final byte a(byte by2) {
        if (by2 == 79) {
            this.p = !this.p;
            return by2;
        }
        byte by3 = h5.d(this.h, this.B);
        int n = by2 - by3;
        int n2 = this.u.a(this, (byte)n);
        return (byte)(n ^ n2);
    }

    public final byte b(byte by2) {
        if (by2 == 79) {
            this.p = !this.p;
            return 0;
        }
        byte by3 = h5.d(this.h, this.B);
        byte by4 = (byte)this.u.a(this, by2);
        return (byte)((byte)(by2 ^ by4) + by3);
    }

    public final byte[] a(@Nullable di_0 di_02, @NotNull String string, boolean bl, boolean bl2, @NotNull iX iX2, @NotNull byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3;
        int n;
        this.B.a(this.I);
        Object object = new char[]{','};
        List list = ll.a((Collection)bz.a((CharSequence)string, object, false, 0, 6, null));
        if (list.size() <= 1) {
            Object object2;
            Object object3;
            object = this;
            boolean bl3 = false;
            Object object4 = di_02;
            if (object4 != null && (object4 = (q_0)object4.a(q_0.class)) != null) {
                String[] stringArray;
                String[] stringArray2;
                String[] stringArray3;
                Object object5 = object4;
                object3 = fB.d;
                object2 = ((Object)string).toString();
                boolean bl4 = false;
                if (ew.a(object2, (Object)f[2])) {
                    stringArray3 = new String[]{f[3]};
                    stringArray2 = stringArray3;
                } else {
                    stringArray3 = new String[]{f[4] + (String)object2};
                    stringArray2 = stringArray3;
                }
                if (new l6((q_0)object5, Arrays.copyOf(stringArray = stringArray2, stringArray.length)).b() == object5.hashCode()) {
                    throw new IllegalArgumentException();
                }
            }
            object = this;
            byte[] byArray4 = string.getBytes(ji_0.d);
            boolean bl5 = false;
            Object object6 = object2 = (object3 = (Object)byArray4);
            int n2 = 0;
            for (Object object7 : object6) {
                int n3 = n2++;
                Object object8 = object7;
                int n4 = n3;
                boolean bl6 = false;
                char[] cArray = object;
                boolean bl7 = false;
                byArray4[n4] = cArray.n()[object8 - 44];
            }
            return object3;
        }
        object = new StringBuilder(16);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        br br2 = this;
        boolean bl8 = false;
        int n5 = 1500;
        boolean bl9 = false;
        boolean bl10 = bl2;
        boolean bl11 = false;
        String string2 = (String)list.get(0);
        while (list.size() != 1) {
            int n6 = string2.length() + 1;
            int n7 = n5 / (n6 + 4);
            long l3 = br2.m().c()[0];
            long l5 = br2.m().c()[1];
            bl11 = false;
            boolean bl12 = false;
            br2.b(byArray, n6, bl, bl12);
            bz.a((StringBuilder)object).append(string2).append(',');
            n = br2.a(byArray, n6, (CharSequence)object, bl);
            if (n >= Math.min(7 * n6, n7)) {
                n5 += 4 * n6;
                list.remove(string2);
                stringBuilder.append(string2).append(',');
                string2 = (String)list.get(0);
                continue;
            }
            --n5;
            br2.m().a(l3, l5);
            if (list.size() < 10) {
                n5 -= 128;
            }
            string2 = (String)h5.c(list, iX2);
        }
        stringBuilder.append((String)list.get(0));
        br2 = this;
        byte[] byArray5 = h1.a(stringBuilder, ji_0.d);
        n5 = 0;
        byte[] byArray6 = byArray3 = (byArray2 = byArray5);
        int n8 = 0;
        for (byte by2 : byArray6) {
            int n9 = n8++;
            byte by3 = by2;
            int n10 = n9;
            boolean bl13 = false;
            br br3 = br2;
            n = 0;
            byArray5[n10] = br3.n()[by3 - 44];
        }
        return byArray2;
    }

    public final void a(@NotNull byte[] byArray, int n, boolean bl, boolean bl2) {
        int n2 = n;
        int n3 = 10;
        if (!(this.m instanceof ArrayList)) {
            this.m = new ArrayList(512);
        }
        if (bl) {
            n3 = 10;
        }
        while (n2-- > 0 && n3 >= 2) {
            int n4 = n3;
            int n5 = Math.max(1, this.a(n4));
            jT jT2 = jg_0.c.a(byArray, n4, n5, this, !bl);
            if (jT2 == jg_0.c.a()) {
                n3 = n4 - 1;
                continue;
            }
            short s2 = ((ez_0)jT2.b()).a();
            byte[] byArray2 = (byte[])jT2.e();
            this.b(new jg_0(byArray2, 0, s2, 2, null));
        }
        this.k();
    }

    public static /* synthetic */ void a(br br2, byte[] byArray, int n, boolean bl, boolean bl2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 16000;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        if ((n2 & 8) != 0) {
            bl2 = false;
        }
        br2.a(byArray, n, bl, bl2);
    }

    private final int a(int n) {
        return 30 / n / n - 2;
    }

    public final void k() {
        if (!((Collection)this.m).isEmpty()) {
            List list;
            List list2 = this.m;
            ew.b(list2, f[8]);
            List list3 = list = kb_0.c(list2);
            boolean bl = false;
            if (list3.size() > 1) {
                ll.a(list3, new ho_0());
            }
        }
    }

    private static final iv_0 a(jg_0 jg_02) {
        return iv_0.a;
    }

    public /* synthetic */ br(long l3, iX iX2, byte[] byArray, k9 k92, boolean bl, long l5, int n, int n2, aJ aJ2) {
        this(l3, iX2, byArray, k92, bl, l5, n, n2);
    }

    static {
        b = false;
        s = false;
        D = false;
        e = false;
        G = false;
        F = false;
        o = false;
        U = false;
        L = false;
        w = 1;
        E = 2400;
        g = 512;
        Q = 1024;
        R = 4096;
        z = false;
        K = 28;
        r = 4;
        d = 140;
        S = -7;
        n = 7;
        M = 16;
        j = 1500;
        W = 128;
        i = (byte)127;
        x = 40;
        C = 12;
        V = (byte)79;
        A = (char)45;
        N = false;
        l = 80;
        v = 44;
        H = false;
        br.g();
        P = new hV(null);
    }

    private static final void g() {
        f = new String[]{hl.a("", 774598232), hl.a("", -1611575063), hl.a("\u8d1e\u8d02\u8d1f\u8d19", 2075561325), hl.a("\u1ac8\u1ac8", -424207624), hl.a("\ub585\ub584\ub58f", 1288943029), hl.a("\u6218\u6204\u6219\u621f", -983604629), hl.a("\u2be2\u2be2", 173157330), hl.a("\ua4bb\ua4ba\ua4b1", 647865483), hl.a("", -467232192)};
    }
}

