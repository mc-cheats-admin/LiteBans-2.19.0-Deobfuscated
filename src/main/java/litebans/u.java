package litebans;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import litebans.a7;
import litebans.aK;
import litebans.aR;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.bF;
import litebans.bN;
import litebans.bP;
import litebans.bT;
import litebans.br;
import litebans.bt_0;
import litebans.bz;
import litebans.c1;
import litebans.cE;
import litebans.c_;
import litebans.c_0;
import litebans.ch;
import litebans.cz;
import litebans.d6;
import litebans.dZ;
import litebans.di_0;
import litebans.eE;
import litebans.eG;
import litebans.eI;
import litebans.eN;
import litebans.eS;
import litebans.eo_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fB;
import litebans.fO;
import litebans.f_;
import litebans.fa_0;
import litebans.ga;
import litebans.ge;
import litebans.gs_0;
import litebans.h1;
import litebans.hG;
import litebans.hl;
import litebans.i5;
import litebans.iA;
import litebans.iF;
import litebans.iX;
import litebans.id_0;
import litebans.ij;
import litebans.ir;
import litebans.iv_0;
import litebans.jT;
import litebans.jg_0;
import litebans.ji_0;
import litebans.jj_0;
import litebans.jm_0;
import litebans.jv_0;
import litebans.kG;
import litebans.kL;
import litebans.kQ;
import litebans.kR;
import litebans.kc_0;
import litebans.ko;
import litebans.kq_0;
import litebans.kx_0;
import litebans.l6;
import litebans.ll;
import litebans.lo_0;
import litebans.n_0;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.r_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class u
extends n_0
implements Runnable {
    public static final iF j;
    private final eE q = bN.a(() -> u.a(this));
    private final eE e = bN.a(() -> u.b(this));
    private final eE c = bN.a(() -> u.e(this));
    private final eE h = bN.a(() -> u.d(this));
    private final AtomicBoolean k = new AtomicBoolean();
    private final ge i = new ge(this.a);
    private long o;
    private int r;
    private byte s;
    private byte[][] p = new byte[0][];
    private final byte[][] g;
    private CopyOnWriteArrayList b;
    private final CopyOnWriteArrayList d;
    private final id_0 l;
    public static final char n;
    public static final String m;
    private static /* synthetic */ String[] f;

    public u(@NotNull di_0 di_02) {
        super(di_02);
        int n = 0;
        byte[][] byArrayArray = new byte[4][];
        u u2 = this;
        while (n < 4) {
            int n2 = n++;
            byArrayArray[n2] = kq_0.a();
        }
        u2.g = byArrayArray;
        this.b = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.l = new id_0(new AtomicLong(), new AtomicLong(), new AtomicLong());
    }

    public final q_0 a() {
        eE eE2 = this.q;
        return (q_0)eE2.a();
    }

    public final w d() {
        eE eE2 = this.e;
        return (w)eE2.a();
    }

    public final o b() {
        eE eE2 = this.c;
        return (o)eE2.a();
    }

    public final p g() {
        eE eE2 = this.h;
        return (p)eE2.a();
    }

    public final ge h() {
        return this.i;
    }

    public final int k() {
        return this.r;
    }

    public final void a(int n) {
        this.r = n;
    }

    public final byte c() {
        return this.s;
    }

    public final void a(byte by2) {
        this.s = by2;
    }

    public final void a(@NotNull byte[][] byArray) {
        this.p = byArray;
    }

    public final CopyOnWriteArrayList j() {
        return this.b;
    }

    public final void a(@NotNull CopyOnWriteArrayList copyOnWriteArrayList) {
        this.b = copyOnWriteArrayList;
    }

    public final id_0 i() {
        return this.l;
    }

    public final boolean a(@NotNull fa_0 fa_02) {
        return this.d.add(fa_02);
    }

    public final boolean b(@NotNull fa_0 fa_02) {
        return this.d.remove(fa_02);
    }

    public final bP b(int n) {
        Object v1;
        block1: {
            Iterable iterable = this.b;
            for (Object t2 : iterable) {
                Reference reference = (Reference)t2;
                boolean bl = false;
                bP bP2 = (bP)reference.get();
                if (!((bP2 != null ? bP2.b() : -1) == n)) continue;
                v1 = t2;
                break block1;
            }
            v1 = null;
        }
        Reference reference = v1;
        return reference != null ? (bP)reference.get() : null;
    }

    @Override
    public void e() {
        this.a().e();
        eG eG2 = this.a().f();
        boolean bl = false;
        if (w.v.a(eG2.aF()) && eG2.aS()) {
            this.k.set(false);
            eG2.a7().b(this, eG2.aQ(), eG2.aQ());
        }
    }

    @Override
    public void b() {
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        AtomicBoolean atomicBoolean = this.k;
        boolean bl = false;
        Object object = atomicBoolean;
        boolean bl2 = false;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            try {
                object = this.d();
                bl2 = false;
                try {
                    ch ch2 = ((w)object).f();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object2 = (ch)closeable;
                        boolean bl3 = false;
                        ch ch3 = ch2;
                        boolean bl4 = false;
                        this.o = this.a(ch3, this.d, this.o);
                        object2 = iv_0.a;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!((w)object).b(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (SQLException sQLException) {
                this.d().a(sQLException);
            }
            finally {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                bl2 = false;
                atomicBoolean2.set(false);
            }
        }
    }

    private final void d(ch ch2) {
        long l3 = ((AtomicLong)this.l.f()).incrementAndGet();
        long l5 = l3 - ((AtomicLong)this.l.c()).get();
        if (l5 > 1L) {
            this.b(ch2);
        }
    }

    private final void b(ch ch2) {
        this.a().a((Object)f[6]);
        kq_0.a(this.l, kG.l);
        Serializable serializable = ch2.e().getDataFolder();
        String string = f[7];
        boolean bl = false;
        d6.b(new File((File)serializable, string));
        serializable = ch2.e().getDataFolder();
        string = f[8];
        bl = false;
        d6.b(new File((File)serializable, string));
        serializable = this.a().f().a(true);
        this.a().f().b((String)((jT)serializable).b());
        this.a().f().a((String)((jT)serializable).e());
        w.a(ch2.d(), ch2, 0L, false, 6, null);
    }

    public final void a(@NotNull ij ij2, @NotNull ch ch2, @NotNull CharSequence charSequence, int n) {
        if (!this.d().s() || ch2.b()) {
            return;
        }
        Object object = charSequence;
        int n2 = 4092;
        char c = '\u0000';
        String string = h1.a(object.toString(), n2);
        object = this.d().l();
        if (object == null || ((aK)object).f() && n == -1) {
            u u2 = this;
            c = 'x';
            boolean bl = false;
            q_0 q_02 = u2.a();
            boolean bl2 = false;
            if (q_02.g()) {
                q_0 q_03 = q_02;
                boolean bl3 = false;
                q_03.a((Object)(f[9] + c + f[10] + object));
            }
            return;
        }
        try {
            Object object2;
            boolean bl;
            char c10;
            int n3;
            n2 = ((aK)object).c();
            if (n != -1 && n != n2) {
                n2 = n;
            } else {
                ((AtomicLong)this.l.c()).incrementAndGet();
            }
            c = (ij2.d() << 16 | n2) + 42;
            Object object3 = kL.c;
            CharSequence charSequence2 = f[11];
            ch ch3 = ch2;
            boolean bl4 = false;
            Object object4 = charSequence2;
            char c11 = ',';
            boolean bl5 = false;
            CharSequence charSequence3 = object4;
            boolean bl6 = false;
            int n4 = 0;
            for (n3 = 0; n3 < charSequence3.length(); ++n3) {
                char c12 = c10 = charSequence3.charAt(n3);
                bl = false;
                if (!(c12 == c11)) continue;
                ++n4;
            }
            int n5 = n4;
            object4 = f[12];
            if (n5 > 0) {
                StringBuilder stringBuilder = new StringBuilder(n5 * 2);
                Iterable iterable = new eI(0, n5);
                boolean bl7 = false;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n3 = n4 = ((i5)iterator).b();
                    c10 = '\u0000';
                    stringBuilder.append(f[13]);
                }
                object4 = bz.b(stringBuilder.toString(), 1);
            }
            kL kL2 = object3;
            bl5 = false;
            object3 = ch3.c(aR.d(aR.e(f[14] + kL2 + '(' + charSequence2 + f[15] + object4 + ')'))).a(c);
            boolean bl8 = false;
            object4 = object2 = object3;
            boolean bl9 = false;
            ((bT)object3).a(string);
            eS.d((bT)object2);
            object3 = this;
            ch ch4 = ch2;
            boolean bl10 = false;
            object4 = (r_0)ch4.e().a(r_0.class);
            long l3 = System.currentTimeMillis();
            if (l3 - ch4.d().i() > 28800000L) {
                ch4.d().b(l3);
                charSequence3 = f[16];
                if (ew.a((Object)((u)object3).a().f().aF(), (Object)f[17])) {
                    charSequence3 = '\'' + (String)charSequence3 + '\'';
                }
                Object object5 = kL.c;
                n4 = 0;
                object5 = aR.e(f[18] + object5);
                CharSequence charSequence4 = f[19] + (String)charSequence3 + ')';
                ch ch5 = ch4;
                c10 = '\u0000';
                CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)object5), charSequence4};
                bl = false;
                CharSequence[] charSequenceArray2 = charSequenceArray;
                boolean bl11 = false;
                int n6 = charSequenceArray2.length;
                for (int i = 0; i < n6; ++i) {
                    CharSequence charSequence5;
                    CharSequence charSequence6 = charSequence5 = charSequenceArray2[i];
                    boolean bl12 = false;
                    if (charSequence6.length() > 0) continue;
                    String string2 = f[20];
                    throw new IllegalArgumentException(string2.toString());
                }
                eS.d(ch5.c(aR.d(aR.e(aR.b((String)object5) + f[21] + charSequence4))));
                object5 = object4;
                boolean bl13 = false;
                ((r_0)object5).a(ch4);
            }
        }
        catch (SQLException sQLException) {
            this.d().a(sQLException);
        }
    }

    public static /* synthetic */ void a(u u2, ij ij2, ch ch2, CharSequence charSequence, int n, int n2, Object object) {
        if ((n2 & 4) != 0) {
            charSequence = f[22];
        }
        if ((n2 & 8) != 0) {
            n = -1;
        }
        u2.a(ij2, ch2, charSequence, n);
    }

    /*
     * Unable to fully structure code
     */
    public void a(@NotNull ch var1_1, @NotNull String var2_2, @NotNull String var3_3, @NotNull ij var4_4, @NotNull Set var5_5) {
        block38: {
            block37: {
                block36: {
                    if (var2_2.length() != 36) {
                        return;
                    }
                    var7_6 = var4_4;
                    var8_7 = false;
                    switch (ko.a[var7_6.ordinal()]) {
                        case 6: {
                            v0 = a_.h;
                            break;
                        }
                        case 7: {
                            v0 = a_.j;
                            break;
                        }
                        case 8: {
                            v0 = a_.c;
                            break;
                        }
                        case 9: 
                        case 10: {
                            v0 = a_.g;
                            break;
                        }
                        case 11: {
                            v0 = a_.h;
                            break;
                        }
                        case 12: {
                            v0 = a_.j;
                            break;
                        }
                        default: {
                            v0 = null;
                        }
                    }
                    var6_9 = v0;
                    if (var6_9 == null) {
                        var7_6 = this.a();
                        var8_7 = false;
                        if (var7_6.g()) {
                            var23_10 = var7_6;
                            var9_11 = false;
                            var23_10.a((Object)(u.f[29] + (Object)var4_4));
                        }
                        return;
                    }
                    if (var4_4 == ij.s) {
                        var7_6 = this.g();
                        var8_7 = false;
                        var9_12 = ll.a((Iterable)var7_6.a().b().entrySet(), (eo_0)new cE(var2_2, var3_3));
                        if (var9_12) {
                            var7_6.a(var2_2, var3_3);
                        }
                        return;
                    }
                    if (var5_5.isEmpty()) break block37;
                    if (var4_4.a() || var5_5.contains(var2_2)) break block38;
                    if (((CharSequence)var3_3).length() == 0) break block37;
                    var7_6 = var1_1.e().q();
                    var8_7 = false;
                    for (Object var11_16 : var7_6) {
                        var12_18 = (Object[])var11_16;
                        var13_20 = false;
                        if (!dZ.s.a(true, var12_18.b(), var3_3, dZ.s.a(var3_3))) continue;
                        v1 = false;
                        break block36;
                    }
                    v1 = true;
                }
                if (!v1) break block38;
            }
            return;
        }
        v2 = kR.a(var1_1, var2_2, var3_3, var6_9, true, false, 16, null);
        if (v2 == null) {
            return;
        }
        var7_6 = v2;
        var8_8 = w.a(var1_1.d(), false, 1, null);
        if (var1_1.e().t() == 1) {
            var11_16 = this.b();
            var12_19 = false;
            if (var4_4 == ij.w) {
                litebans.o.a((o)var11_16, var1_1, (dZ)var7_6, null, 2, null);
            } else if (var4_4 == ij.j) {
                var13_21 = var11_16.a.q();
                var14_23 = false;
                var15_25 = var13_21;
                var16_27 = new ArrayList<E>();
                var17_31 = false;
                for (Object var20_37 : var15_25) {
                    var21_38 = (jv_0)var20_37;
                    var22_39 = false;
                    if (!var7_6.a(var21_38.a(), var21_38.b(), var8_8)) continue;
                    var16_27.add(var20_37);
                }
                var13_21 = (List)var16_27;
                var14_23 = false;
                var15_25 = var13_21.iterator();
                while (var15_25.hasNext()) {
                    var16_27 = var15_25.next();
                    var17_32 = (jv_0)var16_27;
                    var18_34 = 0;
                    ew.a(var17_32);
                    var11_16.a(var1_1, var17_32);
                }
            }
        }
        var10_15 = var1_1.e().q();
        var11_17 = false;
        var12_18 = var10_15;
        var13_22 = new ArrayList<E>();
        var14_23 = false;
        for (Object var17_33 : var12_18) {
            var18_35 = (jv_0)var17_33;
            var19_36 = 0;
            if (!var7_6.a(var18_35.a(), var18_35.b(), var8_8)) ** GOTO lbl-1000
            v3 = var18_35.h();
            if (v3 == null) {
                v3 = var1_1.d().u();
            }
            if ((v4 = var7_6.m()) == null) {
                v4 = eq_0.f.b();
            }
            if (eq_0.f.a(v3, v4)) {
                v5 = true;
            } else lbl-1000:
            // 2 sources

            {
                v5 = false;
            }
            if (!v5) continue;
            var13_22.add(var17_33);
        }
        var10_15 = (List)var13_22;
        var11_17 = false;
        var12_18 = var10_15.iterator();
        while (var12_18.hasNext()) {
            var13_22 = var12_18.next();
            var14_24 = (jv_0)var13_22;
            var15_26 = 0;
            v6 = var6_9;
            switch (v6 == null ? -1 : kQ.a[v6.ordinal()]) {
                case 1: {
                    ew.a(var14_24);
                    if (!aa_0.a(var1_1, (dZ)var7_6, var14_24)) break;
                    this.b().a(var14_24, bF.a(var1_1, (dZ)var7_6, var14_24, -1));
                    break;
                }
                case 2: {
                    this.g().a(var2_2, (dZ)var7_6);
                    if (!this.a().f().aU()) break;
                    var16_29 = this.b();
                    var17_31 = false;
                    ew.a(var14_24);
                    var16_29.a(var1_1, var14_24, (dZ)var7_6, -1, u.f[30]);
                    break;
                }
                case 3: {
                    if (!this.a().f().aU()) break;
                    var1_1.b(var2_2);
                    var16_30 = this.b();
                    var17_31 = false;
                    ew.a(var14_24);
                    var16_30.a(var1_1, var14_24, (dZ)var7_6, -1, u.f[31]);
                    break;
                }
                case 4: {
                    v7 = this.b();
                    ew.a(var14_24);
                    v7.a(var14_24, (CharSequence)bF.a(var1_1, (dZ)var7_6, var14_24));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final long a(@NotNull ch var1_1, @NotNull Collection var2_2, long var3_3) {
        block106: {
            var72_4 = 0L;
            var72_4 = var3_3;
            try {
                var5_5 = var1_1.d().l();
                if (var1_1.b() || var5_5 == null) {
                    var6_7 = this;
                    var7_9 = 's';
                    var8_11 = false;
                    var9_14 = var6_7.a();
                    var10_16 = false;
                    if (var9_14.g()) {
                        var11_18 = var9_14;
                        var12_22 = false;
                        var11_18.a((Object)(u.f[32] + var7_9 + u.f[33] + var5_5));
                    }
                    return var72_4;
                }
                var6_8 = this.a().f().ag();
                var8_12 = var1_1.e().q();
                var8_12 = (Object[])var8_12;
                var9_15 = false;
                var10_17 = var8_12;
                var11_19 = new ArrayList<E>(((Object[])var8_12).length);
                var12_23 = false;
                for (Object var15_40 : var10_17) {
                    var16_42 = (jv_0)var15_40;
                    var69_33 = var11_19;
                    var17_45 = false;
                    var70_36 = var16_42.a();
                    var69_33.add(var70_36);
                }
                var7_10 = ll.g((List)var11_19);
                if (var7_10.size() <= 0) {
                    var8_12 = var1_1.d();
                    var8_12.a((byte)(var8_12.t() + 1));
                    if (var8_12.t() < var6_8) {
                        return var72_4;
                    }
                    var1_1.d().a((byte)0);
                }
                var8_13 = w.a(var1_1.d(), false, 1, null);
                if (var72_4 == 0L) {
                    var11_19 = kL.c;
                    var12_24 = u.f[34];
                    var13_28 = 0;
                    var10_17 = eS.d(var1_1.c(aR.d(aR.a(aR.a(aR.e(u.f[35] + var12_24 + u.f[36] + var11_19), u.f[37]), (Number)1))));
                    if (var10_17.next()) {
                        var72_4 = var10_17.getLong(u.f[38]);
                        var11_19 = this.a();
                        var12_25 = false;
                        if (var11_19.g()) {
                            var69_33 = var11_19;
                            var13_28 = 0;
                            var70_36 = u.f[39] + var72_4;
                            var69_33.a((Object)var70_36);
                        }
                    }
                }
                var10_17 = eS.d(var1_1.c((CharSequence)(u.f[40] + kL.c + u.f[41])).a(var72_4));
                while (var10_17.next()) {
                    block105: {
                        var11_20 = var10_17.getLong(u.f[42]);
                        var13_29 = var10_17.getLong(u.f[43]) - (long)42;
                        var15_41 = c_0.b((int)(var13_29 & 65535L));
                        var16_43 = var13_29 >> 16;
                        var18_48 = var1_1.d().a(var1_1, var15_41, true);
                        var72_4 = Math.max(var72_4, var11_20);
                        if (var18_48 == null) {
                            var19_50 = this;
                            var20_53 = 108;
                            var21_55 = false;
                            var22_60 = var19_50.a();
                            var23_66 = false;
                            if (!var22_60.g()) continue;
                            var24_72 = var22_60;
                            var25_80 = false;
                            var24_72.a((Object)(u.f[44] + (char)var20_53 + u.f[45] + var18_48));
                            continue;
                        }
                        if (var15_41 == var5_5.c()) {
                            this.d(var1_1);
                            continue;
                        }
                        var19_50 = null;
                        var19_50 = var10_17.getString(u.f[46]);
                        var20_54 = ij.l.a((int)var16_43);
                        if (var20_54 == null) {
                            var21_56 = this;
                            var22_61 = 'c';
                            var23_67 = var16_43;
                            var24_73 = false;
                            var25_81 = var21_56.a();
                            var26_93 = false;
                            if (!var25_81.g()) continue;
                            var27_102 = var25_81;
                            var28_112 = false;
                            var27_102.a((Object)(u.f[47] + var22_61 + u.f[48] + var23_67));
                            continue;
                        }
                        ((AtomicLong)this.l.a()).incrementAndGet();
                        var21_57 = this.a();
                        var22_62 = false;
                        if (var21_57.g()) {
                            var69_33 = var21_57;
                            var23_66 = false;
                            var70_36 = u.f[49] + var11_20 + u.f[50] + var16_43 + u.f[51] + c_0.c(var15_41) + u.f[52] + (String)var19_50 + '\"';
                            var69_33.a((Object)var70_36);
                        }
                        var21_57 = var19_50;
                        if (bz.a((CharSequence)var21_57, (CharSequence)u.f[53], false, 2, null) || bz.a((CharSequence)(var21_57 = var19_50), (CharSequence)u.f[54], false, 2, null)) {
                            var22_63 = am.a(var18_48.e(), false);
                            var21_57 = var22_63;
                            var22_63 = var19_50;
                            var19_50 = bF.a((CharSequence)bF.a((CharSequence)var22_63, (CharSequence)u.f[55], var21_57), (CharSequence)u.f[56], var21_57);
                        }
                        var21_57 = var2_2;
                        var22_64 = false;
                        if (var21_57 instanceof Collection && ((Collection)var21_57).isEmpty()) {
                            v0 = false;
                        } else {
                            for (T var24_74 : var21_57) {
                                var25_82 = (fa_0)var24_74;
                                var26_93 = false;
                                if (!(var25_82.a((aK)var18_48, var20_54, (String)var19_50) == false)) continue;
                                v0 = true;
                                break block105;
                            }
                            v0 = false;
                        }
                    }
                    if (v0) {
                        var21_57 = this;
                        var22_64 = false;
                        v1 = var21_57.a();
                        var23_69 = fB.d;
                        var24_75 = u.f[57] + var16_43;
                        var25_83 = false;
                        if (ew.a((Object)var24_75, (Object)u.f[58])) {
                            var26_94 = new String[]{u.f[59]};
                            v2 = var26_94;
                        } else {
                            var26_94 = new String[]{u.f[60] + var24_75};
                            v2 = var26_94;
                        }
                        var27_103 = v2;
                        new l6(v1, Arrays.copyOf(var27_103, var27_103.length)).b();
                        continue;
                    }
                    var21_57 = null;
                    var23_70 = var22_65 = this.a().f();
                    var24_76 = false;
                    switch (kQ.b[var20_54.ordinal()]) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            v3 = var19_50;
                            ew.c(v3, u.f[61]);
                            var21_57 = iF.a(u.j, (String)v3, 0, 2, null);
                            this.a(var1_1, jj_0.f(var21_57[0]), var21_57[1], var20_54, var7_10);
                            v4 = iv_0.a;
                            break;
                        }
                        case 6: 
                        case 7: {
                            if (!var23_70.s()) ** GOTO lbl186
                            v5 = var19_50;
                            ew.c(v5, u.f[62]);
                            var21_57 = u.j.a((String)v5, 3);
                            v6 = (String)lo_0.a((Object[])var21_57, 1);
                            if (v6 == null) {
                                v6 = u.f[63];
                            }
                            var25_84 = v6;
                            var26_95 = var25_84.toUpperCase(Locale.ROOT);
                            var27_104 /* !! */  = a_.values();
                            var28_112 = false;
                            var30_127 = var27_104 /* !! */ .length;
                            for (var29_119 = 0; var29_119 < var30_127; var29_119 += 1) {
                                var32_140 = var31_134 = var27_104 /* !! */ [var29_119];
                                var33_142 = 0;
                                if (!ew.a((Object)var32_140.name(), (Object)var26_95)) {
                                    continue;
                                }
                                ** GOTO lbl177
                            }
                            throw new NoSuchElementException(u.f[64]);
lbl177:
                            // 1 sources

                            var25_84 = var31_134;
                            v7 = (String)lo_0.a((Object[])var21_57, 2);
                            if (v7 == null) {
                                v7 = var1_1.d().u();
                            }
                            var27_104 /* !! */  = v7;
                            var29_120 = this.b();
                            var30_127 = 0;
                            litebans.o.a(var29_120, var1_1, (CharSequence)var21_57[0], var20_54, (a_)var25_84, (String)var27_104 /* !! */ , false, false, null, 112, null);
lbl186:
                            // 2 sources

                            v4 = iv_0.a;
                            break;
                        }
                        case 8: {
                            var25_85 = this.b();
                            var27_105 = false;
                            v8 = var19_50;
                            ew.c(v8, u.f[65]);
                            litebans.o.a(var25_85, var1_1, (CharSequence)v8, u.f[66], null, null, var23_70.s() != false && var23_70.aJ() != false && var23_70.B() != false, false, null, 108, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 9: {
                            v9 = var19_50;
                            ew.c(v9, u.f[67]);
                            var21_57 = iF.a(u.j, (String)v9, 0, 2, null);
                            var26_96 = var21_57[0];
                            var25_86 = var21_57[1];
                            var28_113 = this.b();
                            var29_121 = false;
                            litebans.o.a(var28_113, var1_1, (CharSequence)var25_86, var26_96, null, null, var23_70.s(), false, null, 108, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 10: {
                            if (var23_70.aU()) {
                                v10 = var19_50;
                                ew.c(v10, u.f[68]);
                                var21_57 = iF.a(u.j, (String)v10, 0, 2, null);
                                this.b().b(var21_57[0], var21_57[1], false);
                            }
                            v4 = iv_0.a;
                            break;
                        }
                        case 11: {
                            var25_87 = this.b();
                            var27_106 = false;
                            v11 = var19_50;
                            ew.c(v11, u.f[69]);
                            litebans.o.a(var25_87, var1_1, (CharSequence)v11, var20_54, null, null, var23_70.bg() != false && var23_70.aP() != false && var23_70.aU() != false, false, null, 108, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 12: {
                            var25_88 = this.b();
                            var27_107 = false;
                            v12 = var19_50;
                            ew.c(v12, u.f[70]);
                            litebans.o.a(var25_88, var1_1, (CharSequence)v12, var20_54, a_.j, null, var23_70.aU(), false, null, 104, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 13: {
                            var26_97 = var23_70.a7().q();
                            ew.a(var26_97);
                            if (!(var26_97.length == 0 == false)) ** GOTO lbl299
                            v13 = var19_50;
                            ew.c(v13, u.f[71]);
                            var21_57 = u.j.a((String)v13, 8);
                            var25_89 = jj_0.f(var21_57[0]);
                            var27_108 = var21_57[1];
                            var28_114 = var21_57[2];
                            var29_122 = var21_57[3];
                            var31_134 = u.j;
                            var32_140 = (String)lo_0.a((Object[])var21_57, 4);
                            var33_142 = 0;
                            var30_127 = (int)ew.a(var32_140, (Object)u.f[72]);
                            var32_140 = u.j;
                            var33_143 = (String)lo_0.a((Object[])var21_57, 5);
                            var34_151 = false;
                            var31_135 = ew.a((Object)var33_143, (Object)u.f[73]);
                            v14 = (String)lo_0.a((Object[])var21_57, 6);
                            var32_141 = v14 != null && (v14 = gs_0.a((String)v14)) != null ? (byte)v14.a() : -1;
                            v15 = (String)lo_0.a((Object[])var21_57, 7);
                            var33_142 = v15 != null && (v15 = bz.a((String)v15)) != null ? v15.intValue() : 0;
                            var35_153 = var26_97;
                            var37_161 = ((jv_0[])var35_153).length;
                            for (var36_154 = 0; var36_154 < var37_161; ++var36_154) {
                                var39_171 = var38_167 = var35_153[var36_154];
                                var40_172 = false;
                                if (!bz.a(var39_171.i(), var28_114, true)) continue;
                                v16 = var38_167;
                                ** GOTO lbl267
                            }
                            v16 = var34_150 = null;
lbl267:
                            // 2 sources

                            if (var34_150 != null) {
                                v17 = var1_1.d().a((jv_0)var34_150);
                                if (v17 == null) {
                                    v17 = var1_1.d().u();
                                }
                                var41_174 = v17;
                                var35_153 = new dZ(a_.g, var34_150.a(), var34_150.b(), var29_122, var25_89, var27_108, eq_0.f.b(), (String)var41_174, var8_13, -1L, var32_141, (boolean)var30_127, false, false, 0L, 16384, null);
                                v18 = var23_70.a7().z().a(u.f[74]);
                                ew.b(v18, u.f[75]);
                                var36_155 = (fO)v18;
                                v19 = this.a().s().a(a_.g, var32_141);
                                if (v19 == null) {
                                    v19 = c1.b.a();
                                }
                                var37_162 = v19;
                                var39_171 = a_.g;
                                var42_176 = false;
                                var40_173 = new iA(var34_150.i(), var34_150.a(), var34_150.b(), new Date());
                                v20 = var27_108;
                                if (v20 == null) {
                                    v20 = u.f[76];
                                }
                                var42_175 = v20;
                                var43_177 = var35_153.j();
                                v21 = var35_153.m();
                                if (v21 == null) {
                                    v21 = eq_0.f.b();
                                }
                                var44_180 = v21;
                                var38_167 = new cz((a_)var39_171, false, (boolean)var30_127, var31_135, false, false, false, false, false, false, false, false, false, false, var8_13, 0L, 0L, 0, var37_162, null, false, null, var33_142, null, var40_173, null, null, (jv_0)var34_150, (String)var42_175, var25_89, var44_180, (String)var43_177, null, null, null, null, null, 112967666, 31, null);
                                var38_167.b((dZ)var35_153);
                                var39_171 = var36_155;
                                var40_172 = false;
                                var39_171.a((cz)var38_167, var1_1, (jv_0)var34_150);
                            }
lbl299:
                            // 4 sources

                            v4 = iv_0.a;
                            break;
                        }
                        case 14: {
                            var26_98 = var1_1.d();
                            var25_90 = 21600000 + new iX(0L, 1, null).a(32400000);
                            var27_109 = false;
                            var26_98.a(var8_13 + (long)var25_90);
                            this.r = 0;
                            v4 = iv_0.a;
                            break;
                        }
                        case 15: {
                            u.a(this, ij.v, var1_1, (CharSequence)var19_50, 0, 8, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 16: {
                            w.a(var1_1.d(), var1_1, this.a().f().aQ() * (long)2, false, 4, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 17: {
                            var1_1.d().o();
                            v4 = iv_0.a;
                            break;
                        }
                        default: {
                            v4 = iv_0.a;
                        }
                    }
                }
                var11_21 = this.a().f().Z();
                if (var11_21 <= 0 || this.r > 0 && this.s < 32) break block106;
                this.r = 0;
                var12_27 = new ArrayList<E>(6000);
                var13_30 = new int[4];
                var16_44 = 0;
                var17_46 = System.currentTimeMillis();
                var19_51 = 0;
                var20_53 = var11_21 * 2;
                if (var20_53 >= 60000) {
                    var20_53 = var11_21;
                }
                var21_58 = this.a(var1_1, var20_53);
                var22_60 = new HashSet<E>(6000);
                var23_71 = new HashMap<K, V>();
                var24_77 = var21_58;
                var25_91 = false;
                var26_99 = (AutoCloseable)var24_77;
                var27_110 = null;
                try {
                    var28_115 = (ResultSet)var26_99;
                    var29_123 = 0;
                    while (var24_77.next()) {
                        var30_129 = var24_77;
                        var31_136 = false;
                        var32_140 = var30_129.getString(u.f[77]);
                        var33_145 = var32_140.toLowerCase(Locale.ENGLISH);
                        if (var33_145.length() < 2) continue;
                        if (var33_145.charAt(0) == '.' || var33_145.charAt(0) == '*') {
                            var33_145 = var33_145.substring(1);
                        }
                        if (!var22_60.add(var33_145)) continue;
                        v22 = var30_129.getTimestamp(u.f[78]);
                        var34_152 = v22 != null ? v22.getTime() : System.currentTimeMillis();
                        ((Collection)var12_27).add(kc_0.a(var34_152, var33_145));
                    }
                    var28_115 = iv_0.a;
                }
                catch (Throwable var29_124) {
                    var27_110 = var29_124;
                    throw var29_124;
                }
                finally {
                    f_.a((AutoCloseable)var26_99, (Throwable)var27_110);
                }
                if (var22_60.size() <= 5) {
                    this.r = 1;
                    return var72_4;
                }
                var24_77 = var12_27;
                var25_91 = false;
                if (var24_77.size() > 1) {
                    ll.a((List)var24_77, new ir());
                }
                var24_77 = ll.a((Iterable)var12_27, var11_21);
                var25_91 = false;
                var26_99 = var24_77.iterator();
                while (var26_99.hasNext()) {
                    var27_110 = var26_99.next();
                    var28_115 = (jT)var27_110;
                    var29_123 = 0;
                    var30_130 = this.a(bz.a((CharSequence)var28_115.e()));
                    var31_137 = (Map)var23_71;
                    var32_140 = var30_130;
                    var33_146 = false;
                    var36_156 = var31_137.get(var32_140);
                    if (var36_156 == null) {
                        var37_163 = false;
                        var37_164 = new ArrayList<E>((32 + var12_27.size()) / 5);
                        var31_137.put(var32_140, var37_164);
                        v23 /* !! */  = var37_164;
                    } else {
                        v23 /* !! */  = var36_156;
                    }
                    var38_167 = (List)v23 /* !! */ ;
                    ((Collection)var38_167).add(var28_115);
                    var13_30[var30_130] = var13_30[var30_130] + (((String)var28_115.e()).length() + 1);
                }
                var25_92 = var24_77 = (br)a7.a.a().a();
                synchronized (var25_92) {
                    var26_100 = false;
                    var27_110 = null;
                    if (this.s >= 20 && var8_13 - var1_1.d().b() > 57600000L) {
                        this.c(var1_1);
                        var27_110 = kx_0.a();
                    } else {
                        var27_110 = this.a(var1_1);
                    }
                    var28_116 = 0;
                    var29_123 = ((Object[])this.g).length;
                    var30_131 /* !! */  = new byte[var29_123][];
                    while (var28_116 < var29_123) {
                        var31_138 = var28_116++;
                        var30_131 /* !! */ [var31_138] = kq_0.a();
                    }
                    var32_140 = var30_131 /* !! */ ;
                    var28_117 = var27_110;
                    var29_123 = 0;
                    var30_131 /* !! */  = (byte[][])((AutoCloseable)var28_117);
                    var31_139 = null;
                    try {
                        var33_147 = (ResultSet)var30_131 /* !! */ ;
                        var36_157 = false;
                        while (var28_117.next()) {
                            var37_165 = var28_117;
                            var38_169 = false;
                            var32_140[var37_165.getInt((String)u.f[79])] = var37_165.getBytes(u.f[80]);
                        }
                        var33_147 = iv_0.a;
                    }
                    catch (Throwable var36_158) {
                        var31_139 = var36_158;
                        throw var36_158;
                    }
                    finally {
                        f_.a((AutoCloseable)var30_131 /* !! */ , (Throwable)var31_139);
                    }
                    this.b.clear();
                    this.p = new byte[0][];
                    var28_118 = false;
                    var28_118 = var23_71.size() >= ((Object[])var32_140).length;
                    var29_123 = 0;
                    var30_132 = ((Object[])this.g).length;
                    var31_139 = new byte[var30_132][];
                    var39_171 = var24_77;
                    while (var29_123 < var30_132) {
                        var33_148 = var29_123++;
                        var31_139[var33_148] = kq_0.a();
                    }
                    var39_171.a((byte[][])var31_139);
                    var29_126 = new iX(var24_77.c() << 32 << 32);
                    var30_133 = new byte[40];
                    var31_139 = var23_71.entrySet();
                    var33_149 = false;
                    var31_139 = ll.a((Iterable)var31_139, (Comparator)new hG());
                    var33_149 = false;
                    var36_160 = var31_139.iterator();
                    while (var36_160.hasNext()) {
                        block109: {
                            var37_166 = var36_160.next();
                            var38_170 = (Map.Entry)var37_166;
                            var40_172 = false;
                            var41_174 = null;
                            var42_175 = (Object[])var32_140;
                            var43_178 = false;
                            for (Object var46_187 : var42_175) {
                                var47_188 = (byte[])var46_187;
                                var48_192 = false;
                                v24 = var47_188.length == 0;
                                if (!v24) continue;
                                v25 = false;
                                break block109;
                            }
                            v25 = true;
                        }
                        if (v25) {
                            var41_174 = var32_140[((Number)var38_170.getKey()).intValue()];
                            var28_118 = false;
                        }
                        var42_175 = this;
                        ew.a(var38_170);
                        var43_177 = var38_170;
                        var44_181 = 0;
                        var45_185 = null;
                        v26 = var41_174;
                        if (v26 == null) {
                            v26 = kq_0.a();
                        }
                        var45_185 = v26;
                        var46_187 = var24_77;
                        var47_189 = '\u0000';
                        var48_193 = (Iterable)var43_177.getValue();
                        var49_197 = false;
                        var50_200 = var48_193;
                        var51_203 = new ArrayList<E>();
                        var52_205 = 0;
                        var53_206 = var50_200.iterator();
                        while (var53_206.hasNext()) {
                            block110: {
                                var54_209 = var53_206.next();
                                var55_212 = (jT)var54_209;
                                var56_213 = 0;
                                if (((String)var55_212.e()).length() >= 20) ** GOTO lbl-1000
                                var57_214 = (CharSequence)var55_212.e();
                                var58_218 = br.P;
                                var59_221 /* !! */  = false;
                                for (var60_222 = 0; var60_222 < var57_214.length(); ++var60_222) {
                                    var62_226 = var61_224 = var57_214.charAt(var60_222);
                                    var63_227 = false;
                                    var64_229 = var58_218;
                                    var65_231 = false;
                                    if (97 <= var62_226 ? var62_226 < 123 : false) ** GOTO lbl-1000
                                    v27 = 48 <= var62_226 ? var62_226 < 58 : false;
                                    if (v27 || var62_226 == 44) lbl-1000:
                                    // 2 sources

                                    {
                                        v28 = true;
                                    } else {
                                        v28 = false;
                                    }
                                    if (v28) continue;
                                    v29 = false;
                                    break block110;
                                }
                                v29 = true;
                            }
                            if (v29) {
                                v30 = true;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v30 = false;
                            }
                            if (!v30) continue;
                            var51_203.add(var54_209);
                        }
                        var48_193 = (List)var51_203;
                        var49_197 = false;
                        var50_200 = var48_193;
                        var51_203 = new ArrayList<E>(ll.a((Iterable)var48_193, 10));
                        var52_205 = 0;
                        var53_206 = var50_200.iterator();
                        while (var53_206.hasNext()) {
                            var54_209 = var53_206.next();
                            var55_212 = (jT)var54_209;
                            var66_232 = var51_203;
                            var56_213 = 0;
                            var66_232.add((String)var55_212.e());
                        }
                        var48_193 = (List)var51_203;
                        var49_197 = false;
                        var67_233 = ll.a((Iterable)var48_193, (Comparator)new c_((br)var24_77));
                        var48_193 = ll.a(var67_233, u.f[81], null, null, 0, null, null, 62, null);
                        var50_200 = var46_187;
                        var51_203 = var48_193.getBytes(ji_0.d);
                        var52_205 = 0;
                        var55_212 = var54_209 = (var53_206 = var51_203);
                        var56_213 = 0;
                        for (boolean var59_221 : var55_212) {
                            v31 = var56_213++;
                            var60_222 = var59_221 /* !! */ ;
                            var61_224 = v31;
                            var62_226 = 0;
                            var63_228 = var50_200;
                            var64_230 = false;
                            var51_203[var61_224] = var63_228.n()[var60_222 - 44];
                        }
                        var49_198 = var53_206;
                        var50_200 = new byte[((Object)var49_198).length];
                        var24_77.a(var24_77.f());
                        if (var41_174 != null && ((Object)var41_174).length == 0 == false) {
                            var24_77.b().a((byte[])var41_174);
                        } else {
                            var51_203 = new byte[8192];
                            var24_77.b().a((byte[])var51_203);
                            var46_187.b(true);
                            br.a((br)var46_187, (byte[])var49_198, (byte[])var50_200, false, false, 12, null);
                            var45_185 = var46_187.o();
                            var46_187.b(false);
                        }
                        v32 = var24_77.a();
                        if (v32 != null) {
                            v32[((Number)var43_177.getKey()).intValue()] = var24_77.b().b();
                            v33 = iv_0.a;
                        } else {
                            v33 = null;
                        }
                        var51_203 = var46_187.a(var42_175.a, (String)var48_193, true, var24_77.f(), var29_126, var30_133);
                        br.a((br)var46_187, (byte[])var51_203, (byte[])var50_200, false, false, 12, null);
                        v34 = var52_205 = var42_175.a((br)var24_77) == false ? 1 : 0;
                        if (var52_205 != 0) {
                            br.a((br)var46_187, (byte[])var50_200, 600, false, false, 12, null);
                        }
                        var53_206 = null;
                        if (var52_205 != 0) {
                            var54_209 = new ArrayList<E>(71);
                            var53_206 = br.a((br)var46_187, (byte[])var50_200, 0, 0, new eN((ArrayList)var54_209, (u)var42_175), 6, null);
                            var55_212 = (Collection)var54_209;
                            var56_213 = 0;
                            var57_216 = var55_212;
                            var42_175.a((byte[][])var57_216.toArray((T[])new byte[0][]));
                            var46_187.h();
                        } else {
                            var53_206 = br.a((br)var46_187, (byte[])var50_200, 0, 0, null, 14, null);
                        }
                        var54_209 = var42_175.a();
                        var55_211 = false;
                        if (var54_209.g()) {
                            var66_232 = var54_209;
                            var56_213 = 0;
                            v35 = new StringBuilder().append(u.f[82]).append(((Number)var43_177.getKey()).intValue()).append(u.f[83]).append(((Object)var51_203).length).append(u.f[84]).append(((Object)var53_206).length).append(u.f[85]).append(lo_0.a((byte[])var50_200, (CharSequence)u.f[86], null, null, 0, null, null, 62, null)).append('\n').append((String)var48_193).append('\n');
                            v36 = var42_175.a();
                            var57_217 = fB.d;
                            var58_220 = lo_0.a((byte[])var53_206, null, null, null, 0, null, null, 63, null);
                            var59_221 /* !! */  = false;
                            if (ew.a((Object)var58_220, (Object)u.f[87])) {
                                var60_223 = new String[]{u.f[88]};
                                v37 = var60_223;
                            } else {
                                var60_223 = new String[]{u.f[89] + var58_220};
                                v37 = var60_223;
                            }
                            var61_225 = v37;
                            var66_232.a((Object)v35.append((Object)c_0.c(new l6(v36, Arrays.copyOf(var61_225, var61_225.length)).b())).toString());
                        }
                        var24_77.b().a(kq_0.a());
                        u.c((u)var42_175)[((Number)var43_177.getKey()).intValue()] = (byte[])var53_206;
                        var42_175.a(var42_175.k() + ((List)var43_177.getValue()).size());
                        var41_174 = var45_185;
                        if (!var28_118) continue;
                        try {
                            var43_177 = kL.n;
                            var44_182 = u.f[90];
                            var68_234 = var1_1;
                            var45_186 = false;
                            var46_187 = var44_182;
                            var47_189 = ',';
                            var48_194 = false;
                            var49_198 = var46_187;
                            var50_201 = false;
                            var51_204 = 0;
                            for (var52_205 = 0; var52_205 < var49_198.length(); ++var52_205) {
                                var54_210 = var53_207 = var49_198.charAt(var52_205);
                                var55_211 = false;
                                if (!(var54_210 == var47_189)) continue;
                                ++var51_204;
                            }
                            var56_213 = var51_204;
                            var46_187 = u.f[91];
                            if (var56_213 > 0) {
                                var47_190 = new StringBuilder(var56_213 * 2);
                                var48_195 = new eI(0, var56_213);
                                var49_199 = false;
                                var50_202 = var48_195.iterator();
                                while (var50_202.hasNext()) {
                                    var52_205 = var51_204 = ((i5)var50_202).b();
                                    var53_208 = false;
                                    var47_190.append(u.f[92]);
                                }
                                var46_187 = bz.b(var47_190.toString(), 1);
                            }
                            var47_191 = var43_177;
                            var48_196 = false;
                            var42_175 = var68_234.c(aR.d(aR.e(u.f[93] + var47_191 + '(' + var44_182 + u.f[94] + (CharSequence)var46_187 + ')')));
                            eS.d(var42_175.a(((Number)var38_170.getKey()).intValue()).a((byte[])var41_174));
                        }
                        catch (SQLException var43_179) {
                            v38 = var43_179.getMessage();
                            if (v38 == null) {
                                v38 = u.f[95];
                            }
                            if (bz.a((CharSequence)(var44_183 = v38), (CharSequence)u.f[96], false, 2, null) || bz.a((CharSequence)var44_183, (CharSequence)u.f[97], false, 2, null)) continue;
                            var1_1.d().a(var43_179);
                        }
                    }
                    if (var28_118) {
                        u.a(this, ij.p, var1_1, null, 0, 12, null);
                    }
                    var26_101 = iv_0.a;
                }
                var14_32 = System.currentTimeMillis() - var17_46;
                this.s = 0;
                var16_44 = lo_0.a(var13_30);
                var18_48 = (Object[])this.g;
                var19_51 = 0;
                for (Object var22_60 : var18_48) {
                    var23_71 = (byte[])var22_60;
                    var69_34 = var19_51;
                    var24_78 = false;
                    var70_37 = ((Object)var23_71).length;
                    var19_51 = var69_34 + var70_37;
                }
                var18_48 = (Object[])this.p;
                var69_35 = var19_51;
                var19_51 = 0;
                for (Object var22_60 : var18_48) {
                    var23_71 = (byte[])var22_60;
                    var70_38 = var19_51;
                    var24_79 = false;
                    var71_235 = ((Object)var23_71).length;
                    var19_51 = var70_38 + var71_235;
                }
                var70_39 = var19_51;
                var17_47 = var69_35 + var70_39;
                var18_49 = Math.abs(100 - (int)((double)var17_47 / (double)var16_44 * 100.0));
                var19_52 = u.f[98] + var18_49 + u.f[99] + var16_44 + u.f[100];
                if (var17_47 >= var16_44) {
                    var19_52 = u.f[101];
                }
                this.a().a((Object)(u.f[102] + this.r + u.f[103] + var14_32 + u.f[104] + var17_47 + u.f[105] + var19_52));
            }
            catch (Throwable var5_6) {
                var1_1.d().a(var5_6);
            }
        }
        return var72_4;
    }

    private final ResultSet a(ch ch2, int n) {
        kL kL2 = kL.g;
        CharSequence charSequence = f[106];
        boolean bl = false;
        return eS.d(ch2.c(aR.d(aR.a(aR.a(aR.e(f[107] + charSequence + f[108] + kL2), f[109]), (Number)n))));
    }

    public final ResultSet a(@NotNull ch ch2) {
        kL kL2 = kL.n;
        CharSequence charSequence = f[110];
        boolean bl = false;
        return eS.d(ch2.c(aR.d(aR.e(f[111] + charSequence + f[112] + kL2))));
    }

    public final ResultSet c(@NotNull ch ch2) {
        kL kL2 = kL.n;
        boolean bl = false;
        return eS.d(ch2.c(aR.d(aR.e(f[113] + kL2))));
    }

    public final boolean a(@NotNull br br2) {
        if (!(((Object[])this.p).length == 0)) {
            if (br2.l().isEmpty()) {
                byte by2 = 0;
                by2 = -128;
                Object[] objectArray = (Object[])this.p;
                br br3 = br2;
                boolean bl = false;
                Object[] objectArray2 = objectArray;
                Collection collection = new ArrayList(objectArray.length);
                boolean bl2 = false;
                for (Object object : objectArray2) {
                    byte[] byArray = (byte[])object;
                    Collection collection2 = collection;
                    boolean bl3 = false;
                    byte by3 = by2;
                    by2 = (byte)(by3 + 1);
                    collection2.add(new jg_0(byArray, by3, 0, 4, null));
                }
                br3.a((List)collection);
            }
            return true;
        }
        return false;
    }

    public final ByteArrayOutputStream c(int n) {
        return new ga(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final bP a(int n, @NotNull br br2) {
        Object object;
        Object object2;
        Object[] objectArray;
        Object object3 = this.a();
        boolean bl = false;
        if (((q_0)object3).g()) {
            q_0 q_02 = object3;
            boolean bl2 = false;
            objectArray = (Object[])this.p;
            StringBuilder stringBuilder = new StringBuilder().append(f[123]).append(n).append(f[124]).append(br2.l().size()).append(f[125]).append(((Object[])this.p).length).append(f[126]).append(ll.a(br2.l(), f[127], null, null, 0, null, u::a, 30, null)).append('\n');
            boolean bl3 = false;
            Object[] objectArray2 = objectArray;
            object2 = new ArrayList(objectArray.length);
            boolean bl4 = false;
            for (Object object4 : objectArray2) {
                object = (byte[])object4;
                Collection object5 = object2;
                boolean object14 = false;
                object5.add(lo_0.a((byte[])object, null, null, null, 0, null, null, 63, null));
            }
            q_02.a((Object)stringBuilder.append((List)object2).toString());
        }
        object3 = br2;
        synchronized (object3) {
            int n2;
            boolean bl2;
            Object object4;
            byte[] byArray;
            block19: {
                block18: {
                    bl = false;
                    this.a(br2);
                    if (!br2.l().isEmpty() && !(((Object[])this.p).length == 0)) break block18;
                    this.a().a(10, (Object)f[128]);
                    bP bP2 = new bP((byte)n, jm_0.a());
                    return bP2;
                }
                byArray = this.g[n];
                objectArray = this.a();
                boolean bl7 = false;
                if (objectArray.g()) {
                    q_0 q_03 = objectArray;
                    boolean bl8 = false;
                    q_03.a((Object)lo_0.a(byArray, null, null, null, 0, null, null, 63, null));
                }
                objectArray = (Object[])br2.a();
                if (byArray != kq_0.a() && objectArray != null && !(((Object)objectArray[n]).length == 0)) break block19;
                this.a().a(10, (Object)f[129]);
                bP bP3 = new bP((byte)n, jm_0.a());
                return bP3;
            }
            br2.b().a((byte[])objectArray[n]);
            ByteArrayOutputStream byteArrayOutputStream = this.c(byArray.length * 4);
            br2.a(byArray, byteArrayOutputStream);
            byte[] byArray2 = new byte[byteArrayOutputStream.size()];
            br2.a(br2.f());
            object2 = Arrays.copyOf(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size());
            ew.a(object2);
            br.a(br2, (byte[])object2, byArray2, false, false, 8, null);
            Object object7 = this.a();
            int n3 = 0;
            if (((q_0)object7).g()) {
                q_0 q_04 = object7;
                int n4 = 0;
                q_04.a((Object)lo_0.a(byArray2, null, null, null, 0, null, null, 63, null));
            }
            object7 = br2.a(byArray2).toString();
            Object object8 = new char[]{','};
            object8 = bz.a((CharSequence)object7, object8, false, 0, 6, null);
            int n5 = 0;
            object = object8;
            String[] stringArray = object.toArray(new String[0]);
            object8 = new HashMap(stringArray.length * 2, 0.5f);
            for (String string : stringArray) {
                if (!(((CharSequence)string).length() > 0)) continue;
                int[] nArray = this.a(string);
                object4 = nArray;
                bl2 = false;
                int n4 = ((int[])object4).length;
                for (n2 = 0; n2 < n4; ++n2) {
                    Object object5;
                    Object object6;
                    Object object9 = object6 = object4[n2];
                    boolean bl3 = false;
                    Map map = (Map)object8;
                    Integer n6 = (int)object9;
                    boolean bl4 = false;
                    Object v2 = map.get(n6);
                    if (v2 == null) {
                        boolean bl5 = false;
                        ArrayList arrayList = new ArrayList(64);
                        map.put(n6, arrayList);
                        object5 = arrayList;
                    } else {
                        object5 = v2;
                    }
                    ((ArrayList)object5).add(string);
                }
            }
            Object object12 = (Map)object8;
            int n8 = 0;
            for (Map.Entry entry : object12.entrySet()) {
                object4 = entry;
                bl2 = false;
                ((ArrayList)object4.getValue()).trimToSize();
            }
            object12 = br2;
            di_0 di_02 = this.a;
            boolean bl6 = false;
            Object object10 = di_02;
            if (object10 != null && (object10 = (q_0)object10.a(q_0.class)) != null) {
                String[] stringArray2;
                String[] stringArray3;
                Object object11 = object10;
                object4 = fB.d;
                String string = ((Object)((CharSequence)object7)).toString();
                n2 = 0;
                if (ew.a((Object)string, (Object)f[130])) {
                    String[] stringArray4 = new String[]{f[131]};
                    stringArray3 = stringArray4;
                } else {
                    String[] stringArray5 = new String[]{f[132] + string};
                    stringArray3 = stringArray5;
                }
                if (new l6((q_0)object11, Arrays.copyOf(stringArray2 = stringArray3, stringArray2.length)).b() == object11.hashCode()) {
                    throw new IllegalArgumentException();
                }
            }
            object12 = new bP((byte)n, new HashMap((Map)object8));
            ((Collection)this.b).add(new SoftReference<Object>(object12));
            Object object13 = object12;
            return object13;
        }
    }

    public final int a(char c) {
        return c % ((Object[])this.g).length;
    }

    public final int[] a(@NotNull String string) {
        if (((CharSequence)string).length() == 0) {
            int[] nArray = new int[]{0};
            return nArray;
        }
        int n = string.charAt(0) * 3;
        if (string.length() <= 1) {
            int[] nArray = new int[]{n};
            return nArray;
        }
        int n2 = string.substring(0, 2).hashCode() * 13;
        if (string.length() <= 2) {
            int[] nArray = new int[]{n2, n};
            return nArray;
        }
        int n3 = string.substring(0, 3).hashCode() * 17;
        int[] nArray = new int[]{n3, n2, n};
        return nArray;
    }

    private static final q_0 a(u u2) {
        return (q_0)u2.a.a(q_0.class);
    }

    private static final w b(u u2) {
        return (w)u2.a.a(w.class);
    }

    private static final o e(u u2) {
        return (o)u2.a.a(o.class);
    }

    private static final p d(u u2) {
        return (p)u2.a.a(p.class);
    }

    private static final CharSequence a(jg_0 jg_02) {
        return lo_0.a(jg_02.c(), null, null, null, 0, null, null, 63, null);
    }

    public static final /* synthetic */ byte[][] c(u u2) {
        return u2.g;
    }

    static {
        m = "\ufeff";
        n = (char)65279;
        u.f();
        j = new iF(null);
    }

    private static final void f() {
        f = new String[]{hl.a("\u052c\u0564\u052d\u052d\u053c\u0520\u054d\u0522\u053c", -1641609956), hl.a("\ubf98\ubf84\ubf99\ubf9f", 629784555), hl.a("\uf74b\uf74b", -607914117), hl.a("\ub4e7\ub4e6\ub4ed", -1999063849), hl.a("\ub8dd\ub895\ub8dc\ub8dc\ub8cd\ub8d1", 1771616493), hl.a("\u5dcc\u5dd2", -1679532558), hl.a("\u5ff8\u5ff0\u5fda\u5fcd\u5fc0\u5ffe\u5f83\u5fe7\u5fc6\u5fd7\u5fc6\u5fc0\u5fd7\u5fc6\u5fc7\u5f83\u5fc7\u5fd6\u5fd3\u5fcf\u5fca\u5fc0\u5fc2\u5fd7\u5fc6\u5f83\u5fd0\u5fc6\u5fd1\u5fd5\u5fc6\u5fd1\u5f8d\u5f83\u5ff7\u5fcb\u5fca\u5fd0\u5f83\u5fd4\u5fca\u5fcf\u5fcf\u5f83\u5fc1\u5fc6\u5f83\u5fd1\u5fc6\u5fd0\u5fcc\u5fcf\u5fd5\u5fc6\u5fc7\u5f83\u5fc2\u5fd6\u5fd7\u5fcc\u5fce\u5fc2\u5fd7\u5fca\u5fc0\u5fc2\u5fcf\u5fcf\u5fda\u5f8d", -1464967261), hl.a("\uca5c\uca4a\uca5d\uca59\uca4a\uca5d\uca01\uca56\uca42\uca43", 1171114543), hl.a("\uafaf\uafb9\uafae\uafaa\uafb9\uafae\uaff2\uafb6\uafaf\uafb3\uafb2", 1777184732), hl.a("\uda47\uda0f\uda46\uda46\uda57\uda4b", 355523191), hl.a("\u4493\u448d", -1616690003), hl.a("\ude9d\ude9a\ude92\ude9b\uded8\ude99\ude87\ude93", -222109964), hl.a("\u736e", -136481967), hl.a("\u2120\u2133", -1632689889), hl.a("\u59c1\u59c6\u59db\u59cd\u59da\u59dc\u59a8\u59c1\u59c6\u59dc\u59c7\u59a8", 1365596552), hl.a("\u37da\u37a5\u37b2\u37bf\u37a6\u37b6\u37a0\u37db", 651638771), hl.a("\ud251\ud240\ud20d\ud209\ud20e\ud215\ud214\ud205", 799003232), hl.a("\u3414\u3403\u3417\u3415\u3408", -80333724), hl.a("\u1564\u1565\u156c\u1565\u1574\u1565\u1500\u1566\u1572\u156f\u156d\u1500", -760212192), hl.a("\ue6a3\ue6be\ue6ba\ue6b2\ue6f7\ue6eb\ue6f7\ue6ff\ue699\ue698\ue680\ue6ff\ue6fe\ue6f7\ue6fa\ue6f7\ue69e\ue699\ue683\ue692\ue685\ue681\ue696\ue69b\ue6f7", -2124028201), hl.a("\u3c82\u3ca5\u3cad\u3ca8\u3ca1\u3ca0\u3ce4\u3cb6\u3ca1\u3cb5\u3cb1\u3cad\u3cb6\u3ca1\u3ca9\u3ca1\u3caa\u3cb0\u3cea", 2103065796), hl.a("\u8090\u80e7\u80f8\u80f5\u80e2\u80f5\u8090", 496533680), hl.a("", -82631126), hl.a("\u7976\u7967\u792a\u792e\u7929\u7932\u7933\u7922", 1889499463), hl.a("\u7f56\u7f41\u7f55\u7f57\u7f4a", -430670042), hl.a("\ubdc1\ubdc0\ubdc9\ubdc0\ubdd1\ubdc0\ubda5\ubdc3\ubdd7\ubdca\ubdc8\ubda5", -2140422779), hl.a("\uae2c\uae31\uae35\uae3d\uae78\uae64\uae78\uae70\uae16\uae17\uae0f\uae70\uae71\uae78\uae75\uae78\uae11\uae16\uae0c\uae1d\uae0a\uae0e\uae19\uae14\uae78", -641618344), hl.a("\u5929\u590e\u5906\u5903\u590a\u590b\u594f\u591d\u590a\u591e\u591a\u5906\u591d\u590a\u5902\u590a\u5901\u591b\u5941", 1323915631), hl.a("\u3683\u36f4\u36eb\u36e6\u36f1\u36e6\u3683", -1297008989), hl.a("\u2a1f\u2a65\u2a65\u2a65\u2a19\u2a64\u2a0a\u2a02\u2a64", 1216096836), hl.a("\ud6cf\ud6d7\ud6d6\ud6c7\ud6c6", -1799170398), hl.a("\u6fa4\u6fb2\u6fa1\u6fbd\u6fb6\u6fb7", 517304275), hl.a("\u387c\u3834\u387d\u387d\u386c\u3870", -1606862772), hl.a("\u7704\u771a", 2019915578), hl.a("\u1849\u1844", 1154881568), hl.a("\ufc0d\ufc1b\ufc12\ufc1b\ufc1d\ufc0a\ufc7e", -55444386), hl.a("\u6472\u6414\u6400\u641d\u641f\u6472", -1030265774), hl.a("\ud2f4\ud2f9", 262328989), hl.a("\u12f4\u12f9", -1565125987), hl.a("\u1d57\u1d30\u1d3b", -540140261), hl.a("\u951b\u950d\u9504\u950d\u950b\u951c\u9568\u9562\u9568\u950e\u951a\u9507\u9505\u9568", 93820232), hl.a("\u3f3b\u3f4c\u3f53\u3f5e\u3f49\u3f5e\u3f3b\u3f72\u3f7f\u3f25\u3f24", 785989403), hl.a("\u3629\u3624", 923285056), hl.a("\u76b6\u76b1\u76b9\u76b0", 2019325663), hl.a("\u7867\u782f\u7866\u7866\u7877\u786b", 2003925079), hl.a("\u40a8\u40b6", 212287638), hl.a("\u0e7c\u0e62\u0e76", 973147665), hl.a("\ua829\ua861\ua828\ua828\ua839\ua825", -815814631), hl.a("\ufe69\ufe77", -207684009), hl.a("\u6beb\u6be6\u6bb8\u6ba2", 1999793026), hl.a("\uef0a\uef06\uef52\uef5f\uef56\uef43\uef1c\uef06", -233574618), hl.a("\ue0f5\ue0f9\ue0aa\ue0bc\ue0ab\ue0af\ue0bc\ue0ab\ue0e3\ue0f9", 619110617), hl.a("\uf7f3\uf7ff\uf7b2\uf7ba\uf7ac\uf7ac\uf7be\uf7b8\uf7ba\uf7e5\uf7ff\uf7fd", 821295071), hl.a("\ud958\ud94e\ud959\ud95d\ud94e\ud959", 1099290923), hl.a("\ua477\ua441\ua456\ua452\ua441\ua456", 1816634404), hl.a("\u7dce\u7dd8\u7dcf\u7dcb\u7dd8\u7dcf", -226329155), hl.a("\u78d1\u78cd\u78c0\u78d8\u78c4\u78d3\u78f2\u78c4\u78d3\u78d7\u78c4\u78d3", -1722451807), hl.a("\u82a3\u82eb\u82a2\u82a2\u82b3\u82af\u82c2\u82ad\u82b3", 257852051), hl.a("\uc773\uc76f\uc772\uc774", 32163584), hl.a("\u87e9\u87e9", -561805351), hl.a("\u594e\u594f\u5944", 939678078), hl.a("\uc2e7\uc2ee\uc2e7\uc2ef\uc2e7\uc2ec\uc2f6", -849886590), hl.a("\u253f\u2536\u253f\u2537\u253f\u2534\u252e", 1350968666), hl.a("\u488d\u488e\u4881", -1911732017), hl.a("\u0582\u05b1\u05b1\u05a2\u05ba\u05e3\u05a0\u05ac\u05ad\u05b7\u05a2\u05aa\u05ad\u05b0\u05e3\u05ad\u05ac\u05e3\u05a6\u05af\u05a6\u05ae\u05a6\u05ad\u05b7\u05e3\u05ae\u05a2\u05b7\u05a0\u05ab\u05aa\u05ad\u05a4\u05e3\u05b7\u05ab\u05a6\u05e3\u05b3\u05b1\u05a6\u05a7\u05aa\u05a0\u05a2\u05b7\u05a6\u05ed", -980482621), hl.a("\ud9d0\ud9d9\ud9d0\ud9d8\ud9d0\ud9db\ud9c1", 961141173), hl.a("\u56a1\u56ad\u56ac\u56b1\u56ad\u56ae\u56a7", -1781311806), hl.a("\ucbba\ucbb3\ucbba\ucbb2\ucbba\ucbb1\ucbab", 2039991263), hl.a("\u6b2c\u6b25\u6b2c\u6b24\u6b2c\u6b27\u6b3d", 2047634249), hl.a("\uee74\uee7d\uee74\uee7c\uee74\uee7f\uee65", 710602257), hl.a("\ua614\ua61d\ua614\ua61c\ua614\ua61f\ua605", -817977743), hl.a("\u457b\u4572\u457b\u4573\u457b\u4570\u456a", 858015006), hl.a("\u01d6", 2113995239), hl.a("\u476c", -640465059), hl.a("\uea10\uea12\uea18\uea10", -312874373), hl.a("", -168890994), hl.a("", -5087000), hl.a("\ud27d\ud272\ud27e\ud276", -1476406765), hl.a("\uaf09\uaf0c\uaf19\uaf08", 1484566381), hl.a("\u3791\u379c", 1934112760), hl.a("\u6114", 232153462), hl.a("\u813e", 1010270482), hl.a("\u370e\u3739\u372f\u3727\u3729\u3738\u376c", 1590966092), hl.a("\u12b2\u12f4\u12fb\u12fe\u12fe\u12f7\u12f6\u12b2\u12e5\u12fb\u12e6\u12fa\u12b2\u12ba", 1455690386), hl.a("\u29a7\u29ba\u29b9\u29a7", -192992889), hl.a("\u5edf\u5ed6\u5e94\u5e8f\u5e82\u5e93\u5e85\u5efc", -796827914), hl.a("\u246b", 410920007), hl.a("\u2aaf\u2ab3\u2aae\u2aa8", 1864510172), hl.a("\u48cb\u48cb", 978471163), hl.a("\u93e2\u93e3\u93e8", -1768778798), hl.a("\udfc6\udfcb\udf83\udfcd", 369745839), hl.a("\u0528", 114885911), hl.a("\ue6bc\ue6af", -942938493), hl.a("\u6499\u649e\u6483\u6495\u6482\u6484\u64f0\u6499\u649e\u6484\u649f\u64f0", 683828432), hl.a("\u6b29\u6b56\u6b41\u6b4c\u6b55\u6b45\u6b53\u6b28", -781817088), hl.a("", 919236738), hl.a("\u23c7\u23f6\u23f3\u23ef\u23ea\u23e0\u23e2\u23f7\u23e6\u23a3\u23e6\u23ed\u23f7\u23f1\u23fa", 84550531), hl.a("\u895a\u894b\u894e\u8952\u8957\u895d\u895f\u894a\u895b\u891e\u8955\u895b\u8947", 1905690942), hl.a("\uc60c\uc604\uc65e\uc649\uc648\uc659\uc64f\uc649\uc648\uc60c", 563988012), hl.a("\uec3f\uec3a\uec7c\uec68\uec75\uec77\uec3a", -1681789926), hl.a("\uf90e\uf94c\uf957\uf95a\uf94b\uf95d\uf907", 169277742), hl.a("", 965491546), hl.a("\u2ef6\u2efe\u2ed4\u2ec3\u2ece\u2ef0\u2e8d\u2eee\u2ecc\u2ece\u2ec5\u2ec8\u2ec9\u2e8d", 1779576493), hl.a("\u2cc4\u2c8b\u2c82\u2c82\u2c88\u2c8d\u2c8a\u2c81\u2cc4\u2c91\u2c97\u2c81\u2c96\u2c97\u2cc4\u2c82\u2c8b\u2c96\u2cc4\u2c90\u2c85\u2c86\u2cc4\u2c87\u2c8b\u2c89\u2c94\u2c88\u2c81\u2c90\u2c8d\u2c8b\u2c8a\u2cc4\u2c8d\u2c8a\u2cc4", -1108333340), hl.a("\ubeaf\ubee2\ubefc\ubea1\ubeaf\ubec2\ubeea\ubee2\ubee0\ubefd\ubef6\ubeaf\ubefa\ubefc\ubeea\ubeeb\ubeb5\ubeaf", 264683151), hl.a("\u4003\u4041\u405a\u4057\u4046\u4050", 118112291), hl.a("\ue8a6\ue8a9\ue8a5\ue8ad\ue8e4\ue8ac\ue8a9\ue8bc\ue8ad", -1370167096), hl.a("\ua0c8\ua0de\ua0d7\ua0de\ua0d8\ua0cf\ua0bb", 439722139), hl.a("\ue783\ue7e5\ue7f1\ue7ec\ue7ee\ue783", -1980504157), hl.a("\uf164\uf169", 457437453), hl.a("\u1f8f", 964370341), hl.a("\ub007\ub011\ub018\ub011\ub017\ub000\ub074", -1191858092), hl.a("\ud014\ud072\ud066\ud07b\ud079\ud014", 237293620), hl.a("\ue5c4\ue5c5\ue5cc\ue5c5\ue5d4\ue5c5\ue5a0\ue5c6\ue5d2\ue5cf\ue5cd\ue5a0", -1314724480), hl.a("\u320c", -1178979808), hl.a("\u6e40\u6e77\u6e61\u6e69\u6e67\u6e76\u6e22", 1291218434), hl.a("\u11e3\u11a5\u11aa\u11af\u11af\u11a6\u11a7\u11e3\u11b4\u11aa\u11b7\u11ab\u11e3\u11eb", -817557053), hl.a("\uc024\uc039\uc03a\uc024", 1120649220), hl.a("\u252c\u2525\u2567\u257c\u2571\u2560\u2576\u250f", 429073669), hl.a("\uc972", -1729705634), hl.a("\u9470\u946c\u9471\u9477", -1300392957), hl.a("\u6cea\u6cea", -1985254182), hl.a("\u9cb6\u9cb7\u9cbc", -1875403642), hl.a("\u0219\u022e\u022a\u022f\u026b\u0229\u023e\u0228\u0220\u022e\u023f\u026b", -1078853045), hl.a("\u7b56\u7b58", 940014456), hl.a("\ua54f\ua503\ua500\ua50e\ua50b\ua50a\ua50b\ua543\ua54f", 382182767), hl.a("\u0a2c\u0a7f\u0a78\u0a63\u0a7e\u0a69\u0a68\u0a06", 1146620428), hl.a("\uc8f4", -1495152504), hl.a("\u7675\u7654\u761b\u7658\u765a\u7658\u7653\u765e", -216697285), hl.a("\ua70e\ua72f\ua760\ua723\ua721\ua723\ua728\ua725", 1708042048), hl.a("\ufc6d\ufc71\ufc6c\ufc6a", -893780962), hl.a("\u945d\u945d", 661099629), hl.a("\u513d\u513c\u5137", 1721979149), hl.a("\u8fe1\u8ff2", 888776)};
    }
}

