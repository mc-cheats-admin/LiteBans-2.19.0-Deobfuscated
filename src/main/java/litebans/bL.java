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

public final class bL {
    private final cz a;
    private static /* synthetic */ String[] b;

    public bL(@NotNull cz cz2) {
        this.a = cz2;
    }

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
                                                        if (ew.a((Object)var10_10, (Object)"--")) {
                                                            var6_6 = true;
                                                            continue;
                                                        }
                                                        var12_12 /* !! */  = new char[]{'-'};
                                                        if (ew.a((Object)(var10_10 = bz.a(var10_10, var12_12 /* !! */ )), (Object)"s") || ew.a((Object)var10_10, (Object)"s:true") || ew.a((Object)var10_10, (Object)("s:" + am.ap))) {
                                                            if (!var3_3) {
                                                                block52: {
                                                                    var12_12 /* !! */  = (char[])var4_4.a();
                                                                    var13_13 = new String[]{"litebans.notify", "litebans.notify.silent"};
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
                                                        if (ew.a((Object)var10_10, (Object)"s:false") || ew.a((Object)var10_10, (Object)("s:" + am.bW))) {
                                                            var4_4.k(false);
                                                            var4_4.h(false);
                                                            continue;
                                                        }
                                                        if (!bz.b(var10_10, "sender", false, 2, null) && !bz.b(var10_10, "server-origin", false, 2, null)) break block54;
                                                        if (var3_3) break block55;
                                                        var12_12 /* !! */  = var4_4.a();
                                                        var13_14 = "litebans.admin";
                                                        var14_20 = false;
                                                        if (!var12_12 /* !! */ .e(var13_14)) break block54;
                                                    }
                                                    if (bz.b(var10_10, "sender=", false, 2, null)) {
                                                        var4_4.c(var10_10.substring(7));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (bz.b(var10_10, "sender-name=", false, 2, null)) {
                                                        var4_4.c(var10_10.substring(12));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (bz.b(var10_10, "sender-uuid=", false, 2, null)) {
                                                        var4_4.a(jj_0.f(var10_10.substring(12)));
                                                        var4_4.i(true);
                                                        continue;
                                                    }
                                                    if (!bz.b(var10_10, "server-origin=", false, 2, null)) continue;
                                                    var4_4.e(var10_10.substring(14));
                                                    continue;
                                                }
                                                if (bz.b(var10_10, "stack=", false, 2, null)) {
                                                    var4_4.a(Byte.parseByte(bz.a(var10_10, "stack=", null, 2, null)));
                                                    if (var4_4.r() <= 32) continue;
                                                    fg_0.a.a(am.x);
                                                    throw new as();
                                                }
                                                var12_12 /* !! */  = var10_10;
                                                switch (var12_12 /* !! */ .hashCode()) {
                                                    case 951117504: {
                                                        if (!var12_12 /* !! */ .equals("confirm")) {
                                                            ** break;
                                                        }
                                                        break block56;
                                                    }
                                                    case -1068795718: {
                                                        if (var12_12 /* !! */ .equals("modify")) break;
                                                        ** break;
                                                    }
                                                    case 3202370: {
                                                        if (!var12_12 /* !! */ .equals("hide")) {
                                                            ** break;
                                                        }
                                                        break block57;
                                                    }
                                                    case 3532159: {
                                                        if (!var12_12 /* !! */ .equals("skip")) {
                                                            ** break;
                                                        }
                                                        break block58;
                                                    }
                                                    case -439474683: {
                                                        if (!var12_12 /* !! */ .equals("no-queue")) {
                                                            ** break;
                                                        }
                                                        break block59;
                                                    }
                                                    case -1335458389: {
                                                        if (!var12_12 /* !! */ .equals("delete")) {
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
                                var14_21 = "litebans.admin";
                                var15_25 = false;
                                if (!var13_15.e(var14_21)) break block61;
                            }
                            var4_4.c(true);
                            break block61;
                        }
                        if (var3_3) break block63;
                        var13_16 = var4_4.a();
                        var14_22 = "litebans.admin";
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
                                var21_36 = "litebans.extrasilent";
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
                                var21_36 = "litebans.public";
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
        b = new String[]{"--", "s", "s:true", "s:", "litebans.notify", "litebans.notify.silent", "s:false", "s:", "sender", "server-origin", "litebans.admin", "sender=", "sender-name=", "sender-uuid=", "server-origin=", "stack=", "stack=", "confirm", "modify", "hide", "skip", "no-queue", "delete", "litebans.admin", "litebans.admin", "litebans.extrasilent", "litebans.public"};
    }

    static {
        bL.a();
    }
}

