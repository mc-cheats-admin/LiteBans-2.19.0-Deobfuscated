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

public final class u
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
        this.a().a((Object)"[Sync] Detected duplicate server. This will be resolved ");
        kq_0.a(this.l, kG.l);
        Serializable serializable = ch2.e().getDataFolder();
        String string = "server.yml";
        boolean bl = false;
        d6.b(new File((File)serializable, string));
        serializable = ch2.e().getDataFolder();
        string = "server.json";
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
                q_03.a((Object)("0x11 <" + c + "> " + object));
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
            CharSequence charSequence2 = "info,msg";
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
            object4 = "?";
            if (n5 > 0) {
                StringBuilder stringBuilder = new StringBuilder(n5 * 2);
                Iterable iterable = new eI(0, n5);
                boolean bl7 = false;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n3 = n4 = ((i5)iterator).b();
                    c10 = '\u0000';
                    stringBuilder.append("?,");
                }
                object4 = bz.b(stringBuilder.toString(), 1);
            }
            kL kL2 = object3;
            bl5 = false;
            object3 = ch3.c(aR.d(aR.e("INSERT INTO " + kL2 + '(' + charSequence2 + ")VALUES(" + object4 + ')'))).a(c);
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
                charSequence3 = "1 minute";
                if (ew.a((Object)((u)object3).a().f().aF(), (Object)"pgsql")) {
                    charSequence3 = '\'' + (String)charSequence3 + '\'';
                }
                Object object5 = kL.c;
                n4 = 0;
                object5 = aR.e("DELETE FROM " + object5);
                CharSequence charSequence4 = "time < (NOW() - INTERVAL " + (String)charSequence3 + ')';
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
                    String string2 = "Failed ";
                    throw new IllegalArgumentException(string2.toString());
                }
                eS.d(ch5.c(aR.d(aR.e(aR.b((String)object5) + " WHERE " + charSequence4))));
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
            charSequence = "";
        }
        if ((n2 & 8) != 0) {
            n = -1;
        }
        u2.a(ij2, ch2, charSequence, n);
    }

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
                            var23_10.a((Object)("[!!!] NF " + (Object)var4_4));
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
                    var16_29.a(var1_1, var14_24, (dZ)var7_6, -1, "muted");
                    break;
                }
                case 3: {
                    if (!this.a().f().aU()) break;
                    var1_1.b(var2_2);
                    var16_30 = this.b();
                    var17_31 = false;
                    ew.a(var14_24);
                    var16_30.a(var1_1, var14_24, (dZ)var7_6, -1, "warned");
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
                        var11_18.a((Object)("0x11 <" + var7_9 + "> " + var5_5));
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
                    var12_24 = "id";
                    var13_28 = 0;
                    var10_17 = eS.d(var1_1.c(aR.d(aR.a(aR.a(aR.e("SELECT " + var12_24 + " FROM " + var11_19), "id"), (Number)1))));
                    if (var10_17.next()) {
                        var72_4 = var10_17.getLong("id");
                        var11_19 = this.a();
                        var12_25 = false;
                        if (var11_19.g()) {
                            var69_33 = var11_19;
                            var13_28 = 0;
                            var70_36 = "L+ " + var72_4;
                            var69_33.a((Object)var70_36);
                        }
                    }
                }
                var10_17 = eS.d(var1_1.c((CharSequence)("SELECT * FROM " + kL.c + " WHERE id>?")).a(var72_4));
                while (var10_17.next()) {
                    block105: {
                        var11_20 = var10_17.getLong("id");
                        var13_29 = var10_17.getLong("info") - (long)42;
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
                            var24_72.a((Object)("0x11 <" + (char)var20_53 + "> " + var18_48));
                            continue;
                        }
                        if (var15_41 == var5_5.c()) {
                            this.d(var1_1);
                            continue;
                        }
                        var19_50 = null;
                        var19_50 = var10_17.getString("msg");
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
                            var27_102.a((Object)("0x11 <" + var22_61 + "> " + var23_67));
                            continue;
                        }
                        ((AtomicLong)this.l.a()).incrementAndGet();
                        var21_57 = this.a();
                        var22_62 = false;
                        if (var21_57.g()) {
                            var69_33 = var21_57;
                            var23_66 = false;
                            var70_36 = "id: " + var11_20 + ", type: " + var16_43 + ", server: " + c_0.c(var15_41) + ", message: \"" + (String)var19_50 + '\"';
                            var69_33.a((Object)var70_36);
                        }
                        var21_57 = var19_50;
                        if (bz.a((CharSequence)var21_57, (CharSequence)"server", false, 2, null) || bz.a((CharSequence)(var21_57 = var19_50), (CharSequence)"Server", false, 2, null)) {
                            var22_63 = am.a(var18_48.e(), false);
                            var21_57 = var22_63;
                            var22_63 = var19_50;
                            var19_50 = bF.a((CharSequence)bF.a((CharSequence)var22_63, (CharSequence)"server", var21_57), (CharSequence)"playerServer", var21_57);
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
                        var24_75 = "0x11 <Q> " + var16_43;
                        var25_83 = false;
                        if (ew.a((Object)var24_75, (Object)"sort")) {
                            var26_94 = new String[]{"00"};
                            v2 = var26_94;
                        } else {
                            var26_94 = new String[]{"01:" + var24_75};
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
                            ew.c(v3, "element");
                            var21_57 = iF.a(u.j, (String)v3, 0, 2, null);
                            this.a(var1_1, jj_0.f(var21_57[0]), var21_57[1], var20_54, var7_10);
                            v4 = iv_0.a;
                            break;
                        }
                        case 6: 
                        case 7: {
                            if (!var23_70.s()) ** GOTO lbl186
                            v5 = var19_50;
                            ew.c(v5, "element");
                            var21_57 = u.j.a((String)v5, 3);
                            v6 = (String)lo_0.a((Object[])var21_57, 1);
                            if (v6 == null) {
                                v6 = "BAN";
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
                            throw new NoSuchElementException("Array contains no element matching the predicate + ");
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
                            ew.c(v8, "element");
                            litebans.o.a(var25_85, var1_1, (CharSequence)v8, "console", null, null, var23_70.s() != false && var23_70.aJ() != false && var23_70.B() != false, false, null, 108, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 9: {
                            v9 = var19_50;
                            ew.c(v9, "element");
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
                                ew.c(v10, "element");
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
                            ew.c(v11, "element");
                            litebans.o.a(var25_87, var1_1, (CharSequence)v11, var20_54, null, null, var23_70.bg() != false && var23_70.aP() != false && var23_70.aU() != false, false, null, 108, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 12: {
                            var25_88 = this.b();
                            var27_107 = false;
                            v12 = var19_50;
                            ew.c(v12, "element");
                            litebans.o.a(var25_88, var1_1, (CharSequence)v12, var20_54, a_.j, null, var23_70.aU(), false, null, 104, null);
                            v4 = iv_0.a;
                            break;
                        }
                        case 13: {
                            var26_97 = var23_70.a7().q();
                            ew.a(var26_97);
                            if (!(var26_97.length == 0 == false)) ** GOTO lbl299
                            v13 = var19_50;
                            ew.c(v13, "element");
                            var21_57 = u.j.a((String)v13, 8);
                            var25_89 = jj_0.f(var21_57[0]);
                            var27_108 = var21_57[1];
                            var28_114 = var21_57[2];
                            var29_122 = var21_57[3];
                            var31_134 = u.j;
                            var32_140 = (String)lo_0.a((Object[])var21_57, 4);
                            var33_142 = 0;
                            var30_127 = (int)ew.a(var32_140, (Object)"1");
                            var32_140 = u.j;
                            var33_143 = (String)lo_0.a((Object[])var21_57, 5);
                            var34_151 = false;
                            var31_135 = ew.a((Object)var33_143, (Object)"1");
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
                                v18 = var23_70.a7().z().a("kick");
                                ew.b(v18, "");
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
                                    v20 = "";
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
                        var32_140 = var30_129.getString("name");
                        var33_145 = var32_140.toLowerCase(Locale.ENGLISH);
                        if (var33_145.length() < 2) continue;
                        if (var33_145.charAt(0) == '.' || var33_145.charAt(0) == '*') {
                            var33_145 = var33_145.substring(1);
                        }
                        if (!var22_60.add(var33_145)) continue;
                        v22 = var30_129.getTimestamp("date");
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
                            var32_140[var37_165.getInt((String)"id")] = var37_165.getBytes("b");
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
                        var48_193 = ll.a(var67_233, ",", null, null, 0, null, null, 62, null);
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
                            v35 = new StringBuilder().append("Bucket ").append(((Number)var43_177.getKey()).intValue()).append(" filled with (").append(((Object)var51_203).length).append(" => ").append(((Object)var53_206).length).append(") bytes\n").append(lo_0.a((byte[])var50_200, (CharSequence)",", null, null, 0, null, null, 62, null)).append('\n').append((String)var48_193).append('\n');
                            v36 = var42_175.a();
                            var57_217 = fB.d;
                            var58_220 = lo_0.a((byte[])var53_206, null, null, null, 0, null, null, 63, null);
                            var59_221 /* !! */  = false;
                            if (ew.a((Object)var58_220, (Object)"sort")) {
                                var60_223 = new String[]{"00"};
                                v37 = var60_223;
                            } else {
                                var60_223 = new String[]{"01:" + var58_220};
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
                            var44_182 = "id,b";
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
                            var46_187 = "?";
                            if (var56_213 > 0) {
                                var47_190 = new StringBuilder(var56_213 * 2);
                                var48_195 = new eI(0, var56_213);
                                var49_199 = false;
                                var50_202 = var48_195.iterator();
                                while (var50_202.hasNext()) {
                                    var52_205 = var51_204 = ((i5)var50_202).b();
                                    var53_208 = false;
                                    var47_190.append("?,");
                                }
                                var46_187 = bz.b(var47_190.toString(), 1);
                            }
                            var47_191 = var43_177;
                            var48_196 = false;
                            var42_175 = var68_234.c(aR.d(aR.e("INSERT INTO " + var47_191 + '(' + var44_182 + ")VALUES(" + (CharSequence)var46_187 + ')')));
                            eS.d(var42_175.a(((Number)var38_170.getKey()).intValue()).a((byte[])var41_174));
                        }
                        catch (SQLException var43_179) {
                            v38 = var43_179.getMessage();
                            if (v38 == null) {
                                v38 = "";
                            }
                            if (bz.a((CharSequence)(var44_183 = v38), (CharSequence)"Duplicate entry", false, 2, null) || bz.a((CharSequence)var44_183, (CharSequence)"duplicate key", false, 2, null)) continue;
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
                var19_52 = " (reduced " + var18_49 + "% from " + var16_44 + " bytes)";
                if (var17_47 >= var16_44) {
                    var19_52 = "";
                }
                this.a().a((Object)("[Sync] Cached " + this.r + " offline users for tab completion in " + var14_32 + " ms. Memory used: " + var17_47 + " bytes" + var19_52));
            }
            catch (Throwable var5_6) {
                var1_1.d().a(var5_6);
            }
        }
        return var72_4;
    }

    private final ResultSet a(ch ch2, int n) {
        kL kL2 = kL.g;
        CharSequence charSequence = "name,date";
        boolean bl = false;
        return eS.d(ch2.c(aR.d(aR.a(aR.a(aR.e("SELECT " + charSequence + " FROM " + kL2), "id"), (Number)n))));
    }

    public final ResultSet a(@NotNull ch ch2) {
        kL kL2 = kL.n;
        CharSequence charSequence = "*";
        boolean bl = false;
        return eS.d(ch2.c(aR.d(aR.e("SELECT " + charSequence + " FROM " + kL2))));
    }

    public final ResultSet c(@NotNull ch ch2) {
        kL kL2 = kL.n;
        boolean bl = false;
        return eS.d(ch2.c(aR.d(aR.e("DELETE FROM " + kL2))));
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
            StringBuilder stringBuilder = new StringBuilder().append("Read bucket ").append(n).append(" + ").append(br2.l().size()).append(" loaded, ").append(((Object[])this.p).length).append(" stored\n").append(ll.a(br2.l(), "|", null, null, 0, null, u::a, 30, null)).append('\n');
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
                    this.a().a(10, (Object)"No cache");
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
                this.a().a(10, (Object)"No cache");
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
                if (ew.a((Object)string, (Object)"sort")) {
                    String[] stringArray4 = new String[]{"00"};
                    stringArray3 = stringArray4;
                } else {
                    String[] stringArray5 = new String[]{"01:" + string};
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
        f = new String[]{"0x11 <Q> ", "sort", "00", "01:", "0x11 <", "> ", "[Sync] Detected duplicate server. This will be resolved ", "server.yml", "server.json", "0x11 <", "> ", "info,msg", "?", "?,", "INSERT INTO ", ")VALUES(", "1 minute", "pgsql", "DELETE FROM ", "time < (NOW() - INTERVAL ", "Failed ", " WHERE ", "", "1 minute", "pgsql", "DELETE FROM ", "time < (NOW() - INTERVAL ", "Failed ", " WHERE ", "[!!!] NF ", "muted", "warned", "0x11 <", "> ", "id", "SELECT ", " FROM ", "id", "id", "L+ ", "SELECT * FROM ", " WHERE id>?", "id", "info", "0x11 <", "> ", "msg", "0x11 <", "> ", "id: ", ", type: ", ", server: ", ", message: \"", "server", "Server", "server", "playerServer", "0x11 <Q> ", "sort", "00", "01:", "element", "element", "BAN", "Array contains no element matching the ", "element", "console", "element", "element", "element", "element", "element", "1", "1", "kick", "", "", "name", "date", "id", "b", ",", "Bucket ", " filled with (", " => ", ") bytes\n", ",", "sort", "00", "01:", "id,b", "?", "?,", "INSERT INTO ", ")VALUES(", "", "Duplicate entry", "duplicate key", " (reduced ", "% from ", " bytes)", "", "[Sync] Cached ", " offline users for tab completion in ", " ms. Memory used: ", " bytes", "name,date", "SELECT ", " FROM ", "id", "*", "SELECT ", " FROM ", "DELETE FROM ", ",", "Bucket ", " filled with (", " => ", ") bytes\n", ",", "sort", "00", "01:", "Read bucket ", " + ", " loaded, ", " stored\n", "|", "No cache", "No cache", "sort", "00", "01:", "):"};
    }
}

