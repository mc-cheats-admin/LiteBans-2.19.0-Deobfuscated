package litebans;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.bF;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.db_0;
import litebans.di_0;
import litebans.dk;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.hY;
import litebans.hl;
import litebans.iA;
import litebans.jW;
import litebans.kR;
import litebans.kq_0;
import litebans.ll;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class g3 {
    private static /* synthetic */ String[] a;

    public static int a(@NotNull jW jW2, @NotNull di_0 di_02, @Nullable String[] stringArray, @NotNull Collection collection, int n) {
        if (stringArray == null) {
            return Integer.MAX_VALUE;
        }
        int n2 = kq_0.b(stringArray, n);
        if (!collection.isEmpty()) {
            n2 = Math.min(n2, collection.size());
        }
        n2 = Math.max(1, n2);
        return n2;
    }

    public static /* synthetic */ int a(jW jW2, di_0 di_02, String[] stringArray, Collection collection, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException(a[0]);
        }
        if ((n2 & 8) != 0) {
            n = ((q_0)di_02.a(q_0.class)).f().aT();
        }
        return jW2.a(di_02, stringArray, collection, n);
    }

    /*
     * Unable to fully structure code
     */
    public static void a(@NotNull jW var0, @NotNull ch var1_1, @NotNull Collection var2_2, @Nullable iA var3_3, @Nullable String[] var4_4, @NotNull fB var5_5, int var6_6) {
        var7_7 = var5_5;
        var8_8 = false;
        var9_9 = var7_7;
        var10_10 = false;
        var11_12 = w.a((w)var9_9.h().a(w.class), false, 1, null);
        var9_9 = new HashMap<K, V>();
        if (bz.b(var0.a()) == false && var3_3 != null) {
            aa_0.a((fg_0)var7_7, (CharSequence)bF.a((CharSequence)bF.a(kR.a(var1_1, var0.a(), var3_3, false, 2, null), (CharSequence)g3.a[1], var6_6), (CharSequence)g3.a[2], var2_2.size()));
        }
        for (dZ var13_13 : ll.a((Iterable)var2_2, var6_6)) {
            block19: {
                var14_14 = var13_13.w();
                v0 = var3_3;
                if (v0 == null) {
                    v0 = var0.a(var1_1, (HashMap)var9_9, var14_14);
                }
                if ((var15_15 = v0) == null) break block19;
                var16_17 = false;
                var17_19 = var13_13;
                var18_20 = false;
                if (!var17_19.h()) ** GOTO lbl-1000
                v1 = var17_19.p();
                v2 = v1 != null ? bz.a((CharSequence)v1, '#', false, 2, null) : false;
                if (v2 && !ew.a((Object)var17_19.w(), (Object)var15_15.b())) {
                    v3 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v3 = false;
                }
                if (v3) {
                    var16_16 = var7_7;
                    var17_18 = 0;
                    var16_16 = (q_0)var16_16.h().a(q_0.class);
                    var17_18 = 100;
                    var18_20 = false;
                    if (!var16_16.a(var17_18)) continue;
                    var19_22 = var16_16;
                    var20_23 = false;
                    var19_22.a((Object)(g3.a[3] + var13_13));
                    continue;
                }
            }
            var16_16 = null;
            var17_18 = var14_14 == null || bz.a((CharSequence)var14_14, '#', false, 2, null) != false ? 1 : 0;
            var18_21 = var13_13.p();
            if (var17_18 != 0 && !var7_7.d().f()) {
                var20_24 = var7_7;
                var21_26 = false;
                if (((q_0)var20_24.h().a(q_0.class)).f().aa()) {
                    var18_21 = am.dk.toString();
                }
            }
            var20_25 = am.a(var13_13.u());
            v4 = var16_16 = var17_18 == 0 ? var0.a(var1_1, (HashMap)var9_9, var14_14) : new iA(var18_21, null, var18_21, new Date(var13_13.o()));
            if (var16_16 == null) {
                var21_27 = var7_7;
                var22_28 = 0;
                var21_27 = (q_0)var21_27.h().a(q_0.class);
                var22_28 = 100;
                var23_31 = false;
                if (!var21_27.a(var22_28)) continue;
                var19_22 = var21_27;
                var24_35 = false;
                var19_22.a((Object)(g3.a[4] + var13_13));
                continue;
            }
            var21_26 = var1_1.a(var13_13);
            if (var21_26 && var13_13.u() != a_.g) {
                var22_29 = var20_25;
                var23_32 = var13_13.y() != false ? am.cM : am.am;
                var24_35 = false;
                var20_25 = "" + var22_29 + var23_32;
            }
            if (ew.a((Object)g3.a[5], (Object)(var22_30 = var13_13.q())) || !var21_26 && var13_13.b(var11_12)) {
                var23_33 = var20_25;
                var24_36 = am.dm;
                var25_38 = false;
                var20_25 = "" + var23_33 + var24_36;
            }
            var20_25 = kR.a(var1_1, var20_25, var13_13, (iA)var16_16, false, 4, null);
            var23_34 = null;
            var24_37 = var22_30;
            if (!(var24_37 == null || bz.b((CharSequence)var24_37) != false) && !bz.a((CharSequence)var22_30, '#', false, 2, null)) {
                var24_37 = var7_7;
                var25_38 = false;
                var22_30 = ((o)var24_37.h().a(o.class)).a(var1_1, var13_13);
                if (var22_30 != null) {
                    switch (hY.a[var13_13.u().ordinal()]) {
                        case 1: {
                            v5 = am.co;
                            break;
                        }
                        case 2: {
                            v5 = am.V;
                            break;
                        }
                        case 3: {
                            v5 = am.aG;
                            break;
                        }
                        default: {
                            v5 = null;
                        }
                    }
                    var23_34 = v5;
                    if (var23_34 != null) {
                        var26_39 = var7_7;
                        var27_40 = false;
                        var30_42 = var28_41 = ((w)var26_39.h().a(w.class)).b(true) - var13_13.f();
                        var32_43 = false;
                        var23_34 = ((am)var23_34).a(g3.a[6], (Object)db_0.a(dk.d, var30_42, false, 2, null));
                        var23_34 = kR.a(var1_1, (CharSequence)bF.a(kR.a(var1_1, var23_34, var22_30, var13_13.s(), false, 4, null), (CharSequence)g3.a[7], (Object)var22_30), var13_13, (iA)var16_16, false, 4, null);
                    }
                }
            }
            aa_0.a((fg_0)var7_7, var20_25);
            if (var23_34 == null) continue;
            aa_0.a((fg_0)var7_7, var23_34);
        }
    }

    public static /* synthetic */ void a(jW jW2, ch ch2, Collection collection, iA iA2, String[] stringArray, fB fB2, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException(a[8]);
        }
        if ((n2 & 2) != 0) {
            iA2 = null;
        }
        if ((n2 & 4) != 0) {
            stringArray = null;
        }
        if ((n2 & 8) != 0) {
            ew.b(jW2, a[9]);
            fB2 = (fB)((Object)jW2);
        }
        if ((n2 & 0x10) != 0) {
            n = g3.a(jW2, ch2.e(), stringArray, collection, 0, 8, null);
        }
        jW2.a(ch2, collection, iA2, stringArray, fB2, n);
    }

    public static iA a(@NotNull jW jW2, @NotNull ch ch2, @NotNull HashMap hashMap, @Nullable String string) {
        Object object;
        Map map = hashMap;
        String string2 = string;
        ew.a((Object)string2);
        String string3 = string2;
        boolean bl = false;
        Object v2 = map.get(string3);
        if (v2 == null) {
            boolean bl2 = false;
            iA iA2 = ch2.c(string);
            map.put(string3, iA2);
            object = iA2;
        } else {
            object = v2;
        }
        return (iA)object;
    }

    private static final void a() {
        a = new String[]{hl.a("", 1840434884), hl.a("\u383a\u383f\u383b\u383f\u3822", -273991594), hl.a("\u41ef\u41f4\u41ef\u41fa\u41f7", 1920614811), hl.a("\uaa2d\uaa6f\uaa7f", -649942433), hl.a("\u2561\u2521\u2533", 715203859), hl.a("\uc296\uc2d0\uc2cd\uc2c5\uc2dc\uc2c7\uc2d0\uc2d1", 1356907189), hl.a("\u24fd\u24e0\u24e4\u24ec\u24da\u24e0\u24e7\u24ea\u24ec", 122692745), hl.a("\u1d5e\u1d53\u1d49\u1d4a\u1d56\u1d5b\u1d43\u1d74\u1d5b\u1d57\u1d5f", -638968518), hl.a("", -987245314), hl.a("", -1470560719)};
    }

    static {
        g3.a();
    }
}

