package litebans;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import litebans.aJ;
import litebans.a_;
import litebans.am;
import litebans.as;
import litebans.b4;
import litebans.bi;
import litebans.bz;
import litebans.cP;
import litebans.ch;
import litebans.dZ;
import litebans.eG;
import litebans.eo_0;
import litebans.ew;
import litebans.fD;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iA;
import litebans.j0;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kR;
import litebans.ll;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fW
extends fg_0 {
    private final String j;
    private final ch l;
    private final jv_0 f;
    private final boolean o;
    private int d;
    private boolean p;
    private boolean i;
    private boolean q;
    private boolean e;
    private int g;
    private int n;
    private final ArrayList r;
    private iA k;
    private String s;
    private String m;
    private static /* synthetic */ String[] h;

    public fW(@NotNull String string, @NotNull ch ch2, @Nullable jv_0 jv_02, boolean bl, int n) {
        super(ch2.e());
        this.j = string;
        this.l = ch2;
        this.f = jv_02;
        this.o = bl;
        this.d = n;
        this.r = new ArrayList();
        this.m = "";
    }

    public /* synthetic */ fW(String string, ch ch2, jv_0 jv_02, boolean bl, int n, int n2, aJ aJ2) {
        if ((n2 & 4) != 0) {
            jv_02 = null;
        }
        if ((n2 & 8) != 0) {
            bl = true;
        }
        if ((n2 & 0x10) != 0) {
            n = 0;
        }
        this(string, ch2, jv_02, bl, n);
    }

    public final boolean e() {
        return this.p;
    }

    public final boolean n() {
        return this.i;
    }

    public final boolean b() {
        return this.q;
    }

    public final boolean f() {
        return this.e;
    }

    public final int k() {
        return this.g;
    }

    public final int m() {
        return this.n;
    }

    public final ArrayList h() {
        return this.r;
    }

    public final iA l() {
        return this.k;
    }

    public final String j() {
        return this.s;
    }

    public final String c() {
        return this.m;
    }

    public final fW i() {
        try {
            try {
                if (fD.i == null) {
                    throw new cP();
                }
            }
            catch (Exception var1_1) {
                var2_4 = this;
                var3_7 = false;
                q_0.a((q_0)var2_4.h().a(q_0.class), var1_1, 0, 2, null);
                this.d();
                throw new as();
            }
            if (this.d == 0) {
                var1_2 = this;
                var2_5 = false;
                this.d = ((q_0)var1_2.h().a(q_0.class)).f().y();
            }
            var3_8 = var1_2 = this.j;
            var2_6 = var3_8.toLowerCase(Locale.ENGLISH);
            var3_8 = this.l.a((String)var1_2, this.d);
            v0 = (iA)ll.d((List)var3_8);
            if (v0 == null) {
                this.d();
                throw new as();
            }
            this.k = var4_9 = v0;
            this.a(var2_6);
            this.a(var4_9.b());
            var5_10 = new HashSet<E>(var3_8.size());
            var6_11 = var3_8.iterator();
            while (var6_11.hasNext()) {
                var8_12 = ((iA)var6_11.next()).d();
                if (var8_12 == null || bz.a((CharSequence)var8_12, '#', false, 2, null)) continue;
                ((Collection)var5_10).add(var8_12);
            }
            this.g = var5_10.size();
            this.s = var4_9.i();
            var6_11 = this;
            var7_15 = false;
            var8_12 = var6_11;
            var9_17 = false;
            if (!((q_0)var8_12.h().a(q_0.class)).f().E()) ** GOTO lbl-1000
            var6_11 = this;
            var7_15 = false;
            var8_12 = var6_11;
            var9_17 = false;
            if (!((q_0)var8_12.h().a(q_0.class)).f().a4() && this.g > 1) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
            this.e = v1;
            var6_11 = null;
            var7_16 = var1_2;
            var8_13 = false;
            if (jj_0.a.i((String)var7_16)) {
                var6_11 = var3_8;
                this.s = var1_2;
            } else {
                var6_11 = this.l.a(this.s, this.d);
            }
            if (var6_11.isEmpty()) {
                this.d();
                throw new as();
            }
            var7_16 = this.h().q();
            var8_14 = new HashSet<E>(8);
            var9_18 = new HashMap<K, V>(8);
            v2 = this.r;
            ew.a(var7_16);
            this.a(var8_14, var9_18, (List)var6_11, v2, var7_16);
            if (this.e) {
                this.a((List)var3_8, var8_14, var9_18, var7_16);
            }
            this.n = this.r.size();
            this.m = ll.a(this.r, am.bN, null, null, 0, null, (eo_0)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, a(litebans.j0 ), (Llitebans/j0;)Ljava/lang/CharSequence;)(), 30, null);
        }
        catch (bi var1_3) {
            if (!this.o && this.f != null) {
                fo_0.a(fg_0.a, this.f, String.valueOf(var1_3.getMessage()), null, 4, null);
            }
            this.p = true;
        }
        return this;
    }

    private final void a(List list, HashSet hashSet, HashMap hashMap, jv_0[] jv_0Array) {
        int n = this.g;
        for (int i = 1; i < n; ++i) {
            String string = ((iA)list.get(i)).d();
            List list2 = this.l.a(string, this.d);
            if (list2.isEmpty()) continue;
            this.a(hashSet, hashMap, list2, this.r, jv_0Array);
        }
    }

    private final void a(String string) {
        fg_0 fg_02 = this;
        boolean bl = false;
        fg_0 fg_03 = fg_02;
        boolean bl2 = false;
        Set set = ((q_0)fg_03.h().a(q_0.class)).f().au();
        if (set.isEmpty()) {
            return;
        }
        if (ll.a((Iterable)set, (Object)string)) {
            this.a();
            throw new as();
        }
    }

    private final Void d() {
        throw new b4();
    }

    private final Void a() {
        boolean bl;
        boolean bl2;
        Object object;
        Object object2;
        int n;
        Object object3;
        iA iA2;
        block3: {
            iA2 = this.k;
            Object object4 = iA2;
            if (object4 == null || (object4 = ((iA)object4).b()) == null) {
                throw new b4();
            }
            Object object5 = object4;
            jv_0[] jv_0Array = this.h().q();
            ew.a(jv_0Array);
            object3 = jv_0Array;
            boolean bl3 = false;
            n = ((jv_0[])object3).length;
            for (int i = 0; i < n; ++i) {
                object = object2 = object3[i];
                bl2 = false;
                if (!ew.a((Object)object.a(), object5)) continue;
                bl = true;
                break block3;
            }
            bl = false;
        }
        boolean bl4 = bl;
        object3 = null;
        Object object6 = object3 = bl4 ? am.o : am.n;
        if (this.f != null) {
            ch ch2 = this.l;
            n = 0;
            fo_0.a(fg_0.a, this.f, kR.a(ch2, (CharSequence)am.P, iA2, false, 2, null), null, 4, null);
            object2 = (CharSequence)object3;
            object = iA2.a();
            bl2 = false;
            fo_0.a(fg_0.a, this.f, "" + object2 + object, null, 4, null);
        }
        throw new bi(am.dr);
    }

    public final void a(@NotNull HashSet hashSet, @NotNull HashMap hashMap, @NotNull List list, @NotNull List list2, @NotNull jv_0[] jv_0Array) {
        Object object = this;
        boolean bl = false;
        Object object22 = object;
        boolean bl2 = false;
        eG eG2 = ((q_0)((fg_0)object22).h().a(q_0.class)).f();
        object = eG2.au();
        for (Object object22 : list) {
            boolean bl3;
            Object object3;
            jv_0 jv_02;
            Object object4;
            boolean bl4;
            Object object5;
            Object object6;
            int n;
            boolean bl5;
            Date date;
            String string;
            String string2;
            String string3;
            block19: {
                jv_0 jv_03;
                string3 = ((iA)object22).h();
                string2 = ((iA)object22).c();
                string = ((iA)object22).d();
                date = ((iA)object22).e();
                if (string2 == null || string3 == null) continue;
                iA iA2 = this.k;
                if (!ew.a((Object)string2, (Object)(iA2 != null ? iA2.b() : null)) && System.currentTimeMillis() - date.getTime() > eG2.o()) continue;
                String string4 = (String)hashMap.get(string2);
                if (string4 == null) {
                    ((Map)hashMap).put(string2, string3);
                } else if (!ew.a((Object)string3, (Object)string4)) continue;
                if (!((Collection)object).isEmpty()) {
                    boolean bl6;
                    block18: {
                        String[] stringArray = new String[]{string3.toLowerCase(Locale.ROOT), string2, string};
                        bl5 = false;
                        int n2 = stringArray.length;
                        for (n = 0; n < n2; ++n) {
                            object5 = object6 = stringArray[n];
                            int n3 = 0;
                            if (!ll.a((Iterable)object, object5)) continue;
                            bl6 = true;
                            break block18;
                        }
                        bl6 = false;
                    }
                    if (bl6) continue;
                }
                bl4 = false;
                bl5 = false;
                n = 0;
                for (jv_0 jv_04 : jv_0Array) {
                    object4 = jv_04;
                    boolean bl7 = false;
                    if (!ew.a((Object)object4.a(), (Object)string2)) continue;
                    jv_03 = jv_04;
                    break block19;
                }
                jv_03 = jv_02 = null;
            }
            if ((object3 = this.f) == null || (object3 = object3.h()) == null) {
                fg_0 fg_02 = this;
                boolean bl8 = false;
                object3 = object6 = ((w)fg_02.h().a(w.class)).u();
            }
            if (jv_02 != null) {
                object5 = jv_02.i();
                if (ew.a((Object)string3, object5)) {
                    if (!hashSet.contains(object5)) {
                        dZ dZ2 = null;
                        if (eG2.ak()) {
                            dZ2 = kR.a(this.l, string2, string, a_.j, (String)object6, false, false, 48, null);
                            n = dZ2 != null ? 1 : 0;
                        }
                        am am2 = n != 0 ? am.p : am.o;
                        ((Collection)list2).add(new j0(am2, (String)object5, string2, date, null, dZ2));
                        ((Collection)hashSet).add(object5);
                    } else {
                        bl5 = true;
                    }
                } else if (!hashSet.contains(string3)) {
                    ((Collection)list2).add(new j0(am.n, string3, string2, date, null, null));
                    ((Collection)hashSet).add(string3);
                }
                bl4 = true;
            }
            if (hashSet.contains(string3)) {
                bl5 = true;
            }
            if (bl5 || bl4) continue;
            object5 = kR.a(this.l, string2, string, null, (String)object6, false, false, 52, null);
            dZ dZ3 = null;
            int n4 = object5 != null ? 1 : 0;
            boolean bl9 = bl3 = object5 != null && !ew.a((Object)((dZ)object5).w(), (Object)string2);
            if (eG2.ak()) {
                dZ3 = kR.a(this.l, string2, string, a_.j, (String)object6, false, false, 48, null);
                int n5 = n = dZ3 != null ? 1 : 0;
            }
            if (n4 != 0) {
                this.i = true;
            }
            if (n != 0) {
                this.q = true;
            }
            object4 = bl3 ? am.cd : (n4 != 0 ? am.w : (n != 0 ? am.p : am.n));
            ((Collection)list2).add(new j0((CharSequence)object4, string3, string2, date, (dZ)object5, dZ3));
            ((Collection)hashSet).add(string3);
        }
    }

    private static final CharSequence a(j0 j02) {
        CharSequence charSequence = j02.d();
        CharSequence charSequence2 = j02.e();
        boolean bl = false;
        return "" + charSequence + charSequence2;
    }

    private static final void g() {
        h = new String[]{""};
    }

    static {
        fW.g();
    }
}

