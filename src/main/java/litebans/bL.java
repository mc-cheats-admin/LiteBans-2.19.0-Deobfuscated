package litebans;

import java.util.Collection;
import litebans.a_;
import litebans.am;
import litebans.as;
import litebans.bz;
import litebans.cz;
import litebans.ew;
import litebans.fg_0;
import litebans.hl;
import litebans.jj_0;
import org.jetbrains.annotations.NotNull;

public static final class bL {
    private final cz a;
    private static /* synthetic */ String[] b;

    public bL(@NotNull cz cz2) {
        this.a = cz2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(@NotNull String[] var1_1, boolean var2_2, boolean var3_3) {
        var4_4 = this.a;
        var5_5 = false;
        var6_6 = false;
        var8_8 = var1_1.length;
        block23: for (var7_7 = 0; var7_7 < var8_8; ++var7_7) {
            block53: {
                block61: {
                    block63: {
                        block57: {
                            block62: {
                                block58: {
                                    block59: {
                                        block56: {
                                            block60: {
                                                block54: {
                                                    block55: {
                                                        var10_10 = var9_9 = var1_1[var7_7];
                                                        var11_11 = true;
                                                        if (!bz.a((CharSequence)var10_10, '-', false, 2, null) || var10_10.length() <= 1 || var6_6) break block53;
                                                        if (ew.a((Object)var10_10, (Object)bL.b[0])) {
                                                            var6_6 = true;
                                                            continue;
                                                        }
                                                        var12_12 /* !! */  = new char[]{'-'};
                                                        if (ew.a((Object)(var10_10 = bz.a(var10_10, var12_12 /* !! */ )), (Object)bL.b[1]) || ew.a((Object)var10_10, (Object)bL.b[2]) || ew.a((Object)var10_10, (Object)(bL.b[3] + am.ap))) {
                                                            if (!var3_3) {
                                                                block52: {
                                                                    var12_12 /* !! */  = (char[])var4_4.a();
                                                                    var13_13 = new String[]{bL.b[4], bL.b[5]};
                                                                    var14_19 = false;
                                                                    var15_24 = var13_13;
                                                                    var16_29 = 0;
                                                                    for (String var19_32 : var15_24) {
                                                                        var20_34 = var19_32;
                                                                        var21_35 = false;
                                                                        if (!var12_12 /* !! */ .e((String)var20_34)) continue;
                                                                        v0 = true;
                                                                        break block52;
                                                                    }
                                                                    v0 = false;
                                                                }
                                                                if (!v0) continue;
                                                            }
                                                            var4_4.k(true);
                                                            continue;
                                                        }
                                                        if (ew.a((Object)var10_10, (Object)bL.b[6]) || ew.a((Object)var10_10, (Object)(bL.b[7] + am.bW))) {
                                                            var4_4.k(false);
                                                            var4_4.h(false);
                                                            continue;
                                                        }
                                                        if (!bz.b(var10_10, bL.b[8], false, 2, null) && !bz.b(var10_10, bL.b[9], false, 2, null)) break block54;
                                                        if (var3_3) break block55;
                                                        var12_12 /* !! */  = var4_4.a();
                                                        var13_14 = bL.b[10];
                                                        var14_20 = false;
                                                        if (!var12_12 /* !! */ .e(var13_14)) break block54;
                                                    }
                                                    if (bz.b(var10_10, bL.b[11], false, 2, null)) {
                                                        var4_4.c(var10_10.substring(7));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (bz.b(var10_10, bL.b[12], false, 2, null)) {
                                                        var4_4.c(var10_10.substring(12));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (bz.b(var10_10, bL.b[13], false, 2, null)) {
                                                        var4_4.a(jj_0.f(var10_10.substring(12)));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (!bz.b(var10_10, bL.b[14], false, 2, null)) continue;
                                                    var4_4.e(var10_10.substring(14));
                                                    continue;
                                                }
                                                if (bz.b(var10_10, bL.b[15], false, 2, null)) {
                                                    var4_4.a(Byte.parseByte(bz.a(var10_10, bL.b[16], null, 2, null)));
                                                    if (var4_4.r() <= 32) continue;
                                                    fg_0.a.a(am.x);
                                                    throw new as();
                                                }
                                                var12_12 /* !! */  = var10_10;
                                                switch (var12_12 /* !! */ .hashCode()) {
                                                    case 951117504: {
                                                        if (!var12_12 /* !! */ .equals(bL.b[17])) {
                                                            ** break;
                                                        }
                                                        break block56;
                                                    }
                                                    case -1068795718: {
                                                        if (var12_12 /* !! */ .equals(bL.b[18])) break;
                                                        ** break;
                                                    }
                                                    case 3202370: {
                                                        if (!var12_12 /* !! */ .equals(bL.b[19])) {
                                                            ** break;
                                                        }
                                                        break block57;
                                                    }
                                                    case 3532159: {
                                                        if (!var12_12 /* !! */ .equals(bL.b[20])) {
                                                            ** break;
                                                        }
                                                        break block58;
                                                    }
                                                    case -439474683: {
                                                        if (!var12_12 /* !! */ .equals(bL.b[21])) {
                                                            ** break;
                                                        }
                                                        break block59;
                                                    }
                                                    case -1335458389: {
                                                        if (!var12_12 /* !! */ .equals(bL.b[22])) {
                                                            ** break;
                                                        }
                                                        break block60;
                                                    }
                                                }
                                                var4_4.b(true);
                                                break block61;
                                            }
                                            var4_4.g(true);
                                            break block61;
                                        }
                                        var4_4.e(true);
                                        break block61;
                                    }
                                    var4_4.d(true);
                                    break block61;
                                }
                                if (var3_3) break block62;
                                var13_15 = var4_4.a();
                                var14_21 = bL.b[23];
                                var15_25 = false;
                                if (!var13_15.e(var14_21)) break block61;
                            }
                            var4_4.c(true);
                            break block61;
                        }
                        if (var3_3) break block63;
                        var13_16 = var4_4.a();
                        var14_22 = bL.b[24];
                        var15_26 = false;
                        if (!var13_16.e(var14_22)) break block61;
                    }
                    var4_4.j(true);
                    break block61;
lbl122:
                    // 7 sources

                    var11_11 = false;
                }
                if (var11_11) continue;
                var12_12 /* !! */  = var10_10.toCharArray();
                var14_23 = var12_12 /* !! */ .length;
                block25: for (var13_17 = 0; var13_17 < var14_23; ++var13_17) {
                    var15_27 = var12_12 /* !! */ [var13_17];
                    switch (var15_27) {
                        case 'I': 
                        case 'M': 
                        case 'N': 
                        case 'S': 
                        case 'T': 
                        case 'U': 
                        case 'W': 
                        case 'd': 
                        case 'm': 
                        case 'p': {
                            continue block25;
                        }
                        default: {
                            if (!var2_2) continue block23;
                            ((Collection)var4_4.A()).add(var9_9);
                            continue block23;
                        }
                    }
                }
                var13_18 /* !! */  = var12_12 /* !! */ ;
                var14_23 = 0;
                var16_29 = var13_18 /* !! */ .length;
                block26: for (var15_28 = 0; var15_28 < var16_29; ++var15_28) {
                    var18_31 = var17_30 = var13_18 /* !! */ [var15_28];
                    var19_33 = false;
                    switch (var18_31) {
                        case 77: {
                            var4_4.a(a_.j);
                            continue block26;
                        }
                        case 87: {
                            var4_4.a(a_.c);
                            var4_4.l(false);
                            continue block26;
                        }
                        case 84: {
                            var4_4.l(true);
                            continue block26;
                        }
                        case 73: {
                            var4_4.m(true);
                            continue block26;
                        }
                        case 85: {
                            var4_4.G();
                            continue block26;
                        }
                        case 83: {
                            if (!var3_3) {
                                var20_34 = var4_4.a();
                                var21_36 = bL.b[25];
                                var22_37 = false;
                                if (!var20_34.e(var21_36)) continue block26;
                            }
                            var4_4.k(true);
                            var4_4.h(true);
                            continue block26;
                        }
                        case 78: {
                            var4_4.f(true);
                            continue block26;
                        }
                        case 112: {
                            if (!var3_3) {
                                var20_34 = var4_4.a();
                                var21_36 = bL.b[26];
                                var22_37 = false;
                                if (!var20_34.e(var21_36)) continue block26;
                            }
                            var4_4.k(false);
                            var4_4.h(false);
                            continue block26;
                        }
                        case 109: {
                            var4_4.b(true);
                            continue block26;
                        }
                        case 100: {
                            var4_4.g(true);
                            continue block26;
                        }
                    }
                }
                continue;
            }
            if (!var2_2) continue;
            ((Collection)var4_4.A()).add(var9_9);
        }
        if (var4_4.F()) {
            var4_4.G();
        }
    }

    public static /* synthetic */ void a(bL bL2, String[] stringArray, boolean bl, boolean bl2, int n, Object object) {
        if ((n & 1) != 0) {
            stringArray = bL2.a.z();
        }
        if ((n & 2) != 0) {
            bl = true;
        }
        if ((n & 4) != 0) {
            bl2 = false;
        }
        bL2.a(stringArray, bl, bl2);
    }

    public final boolean a(@NotNull String string) {
        return bz.a((CharSequence)string, '*', false, 2, null) && !bz.b((CharSequence)string, '*', false, 2, null) && string.length() > 3 && !bz.c((CharSequence)string, '.', false, 2, null) && !bz.c((CharSequence)string, ':', false, 2, null);
    }

    private static final void a() {
        b = new String[]{hl.a("\u9105\u9105", -1719561944), hl.a("\u0480", -1289157389), hl.a("\u6286\u62cf\u6281\u6287\u6280\u6290", 363684597), hl.a("\u6572\u653b", -84450047), hl.a("\u9441\u9444\u9459\u9448\u944f\u944c\u9443\u945e\u9403\u9443\u9442\u9459\u9444\u944b\u9454", -1326476243), hl.a("\u1f7b\u1f7e\u1f63\u1f72\u1f75\u1f76\u1f79\u1f64\u1f39\u1f79\u1f78\u1f63\u1f7e\u1f71\u1f6e\u1f39\u1f64\u1f7e\u1f7b\u1f72\u1f79\u1f63", 1321869079), hl.a("\u0fab\u0fe2\u0fbe\u0fb9\u0fb4\u0fab\u0fbd", 1600393176), hl.a("\u4993\u49da", 1368148448), hl.a("\u2054\u2042\u2049\u2043\u2042\u2055", 66527271), hl.a("\u611f\u6109\u611e\u611a\u6109\u611e\u6141\u6103\u611e\u6105\u610b\u6105\u6102", -1550753428), hl.a("\uf298\uf29d\uf280\uf291\uf296\uf295\uf29a\uf287\uf2da\uf295\uf290\uf299\uf29d\uf29a", 587264756), hl.a("\uba18\uba0e\uba05\uba0f\uba0e\uba19\uba56", -1595032981), hl.a("\ue169\ue17f\ue174\ue17e\ue17f\ue168\ue137\ue174\ue17b\ue177\ue17f\ue127", -1153375974), hl.a("\u14aa\u14bc\u14b7\u14bd\u14bc\u14ab\u14f4\u14ac\u14ac\u14b0\u14bd\u14e4", 1309611225), hl.a("\u9cc0\u9cd6\u9cc1\u9cc5\u9cd6\u9cc1\u9c9e\u9cdc\u9cc1\u9cda\u9cd4\u9cda\u9cdd\u9c8e", -1933140813), hl.a("\u51f3\u51f4\u51e1\u51e3\u51eb\u51bd", -922005120), hl.a("\ubd3b\ubd3c\ubd29\ubd2b\ubd23\ubd75", -1233535672), hl.a("\u8d7c\u8d70\u8d71\u8d79\u8d76\u8d6d\u8d72", 1243188511), hl.a("\u94fb\u94f9\u94f2\u94ff\u94f0\u94ef", -1171221354), hl.a("\ud895\ud894\ud899\ud898", 1578883325), hl.a("\u4c1f\u4c07\u4c05\u4c1c", -1686090644), hl.a("\uc394\uc395\uc3d7\uc38b\uc38f\uc39f\uc38f\uc39f", -300497926), hl.a("\u74e2\u74e3\u74ea\u74e3\u74f2\u74e3", 319190150), hl.a("\u242b\u242e\u2433\u2422\u2425\u2426\u2429\u2434\u2469\u2426\u2423\u242a\u242e\u2429", -904256441), hl.a("\ub63c\ub639\ub624\ub635\ub632\ub631\ub63e\ub623\ub67e\ub631\ub634\ub63d\ub639\ub63e", 684373584), hl.a("\ue297\ue292\ue28f\ue29e\ue299\ue29a\ue295\ue288\ue2d5\ue29e\ue283\ue28f\ue289\ue29a\ue288\ue292\ue297\ue29e\ue295\ue28f", 1316348667), hl.a("\uf679\uf67c\uf661\uf670\uf677\uf674\uf67b\uf666\uf63b\uf665\uf660\uf677\uf679\uf67c\uf676", 1113323029)};
    }

    static {
        bL.a();
    }
}

