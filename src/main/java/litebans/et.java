package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import litebans.aJ;
import litebans.aK;
import litebans.a_;
import litebans.bz;
import litebans.c1;
import litebans.d2;
import litebans.d8;
import litebans.di_0;
import litebans.dr_0;
import litebans.h1;
import litebans.hl;
import litebans.jv_0;
import litebans.ll;
import litebans.lo_0;
import litebans.q_0;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class et {
    private static /* synthetic */ String[] a;

    private et() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@NotNull di_0 di_02, @Nullable String string) {
        q_0 q_02 = (q_0)di_02.a(q_0.class);
        if (q_02.f().j()) return false;
        List list = q_02.f().aj();
        String string2 = string;
        if (string2 == null) {
            string2 = q_02.f().aw();
        }
        if (list.contains(string2)) return false;
        return true;
    }

    public final String[] a(@NotNull q_0 q_02) {
        Object object = this;
        boolean bl = false;
        String[] stringArray = new String[]{a[47], a[48], a[49], a[50], a[51], a[52], a[53], a[54], a[55], a[56], a[57], a[58], a[59], a[60], a[61], a[62]};
        object = stringArray;
        bl = false;
        stringArray = object;
        Collection collection = new ArrayList();
        boolean bl2 = false;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = stringArray[i];
            boolean bl3 = false;
            if (!q_02.e(string2)) continue;
            collection.add(string);
        }
        object = (List)collection;
        bl = false;
        stringArray = object;
        return stringArray.toArray(new String[0]);
    }

    public final void a(@NotNull di_0 di_02, int n) {
        u u2 = (u)di_02.a(u.class);
        ((Collection)u2.h().b()).add((byte)n);
        if (u2.h().c().compareAndSet(false, true)) {
            di_02.b(u2.h());
        }
    }

    public static /* synthetic */ void a(et et2, di_0 di_02, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        et2.a(di_02, n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final List a(@Nullable d8 var1_1, @NotNull String var2_2, @NotNull jv_0 var3_3, @NotNull di_0 var4_4, @NotNull String[] var5_5) {
        try {
            block28: {
                block26: {
                    block29: {
                        block27: {
                            et.a(this, var4_4, 0, 2, null);
                            var6_6 = (q_0)var4_4.a(q_0.class);
                            var7_7 = 8;
                            var8_9 = new ArrayList<String>();
                            var9_10 = (String)lo_0.c(var5_5);
                            var11_11 = var5_5;
                            var34_12 = var5_5.length;
                            var12_14 = false;
                            var13_18 = 0;
                            var15_25 = ((String[])var11_11).length;
                            for (var14_21 = 0; var14_21 < var15_25; ++var14_21) {
                                var17_29 = var16_28 = var11_11[var14_21];
                                var18_31 = 0;
                                if (!bz.a((CharSequence)var17_29, '-', false, 2, null)) continue;
                                ++var13_18;
                            }
                            var35_33 = var13_18;
                            var10_34 = var34_12 - var35_33;
                            if (var4_4.t() == 3) {
                                --var10_34;
                            }
                            if (var10_34 > 1) break block27;
                            var11_11 = d2.a(var4_4.q());
                            while (var11_11.hasNext()) {
                                var12_15 = (jv_0)var11_11.next();
                                if (!bz.c(var12_15.i(), var9_10, true)) continue;
                                var8_9.add(var12_15.i());
                                if (var8_9.size() < var7_7) continue;
                                return var8_9;
                            }
                            if (var6_6.f().Z() > 0) {
                                var11_11 = null;
                                v0 = (String)lo_0.e(var5_5);
                                if (v0 == null || (v0 = (var14_22 = v0).toLowerCase(Locale.ENGLISH)) == null) {
                                    return var8_9;
                                }
                                var11_11 = v0;
                                var12_16 = null;
                                var12_16 = et.a[63];
                                v1 = var13_18 = bz.a((CharSequence)var11_11, '.', false, 2, null) != false || bz.a((CharSequence)var11_11, '*', false, 2, null) != false ? 1 : 0;
                                if (var13_18 != 0) {
                                    var12_16 = String.valueOf(bz.a((CharSequence)var11_11));
                                    var11_11 = var11_11.substring(1);
                                }
                                if (bz.b((CharSequence)var11_11) == false) {
                                    var14_22 = (u)var4_4.a(u.class);
                                    var16_28 = var14_22.b(var15_25 = var14_22.a(bz.a((CharSequence)var11_11)));
                                    if (var16_28 == null) {
                                        this.a(var4_4, var15_25);
                                        return var8_9;
                                    }
                                    for (Object var20_38 : (Object)var14_22.a((String)var11_11)) {
                                        if ((Iterable)var16_28.a().get((int)var20_38) == null) continue;
                                        var22_44 = var21_42;
                                        var23_45 = false;
                                        for (T var25_47 : var22_44) {
                                            block25: {
                                                var26_48 = (String)var25_47;
                                                var27_49 = false;
                                                if (!bz.b(var26_48, (String)var11_11, false, 2, null)) continue;
                                                var28_50 = var8_9;
                                                var29_51 = false;
                                                if (var28_50 instanceof Collection && ((Collection)var28_50).isEmpty()) {
                                                    v2 = true;
                                                } else {
                                                    for (T var31_53 : var28_50) {
                                                        var32_54 = (String)var31_53;
                                                        var33_55 = false;
                                                        if (!bz.a(var32_54, var26_48, true)) continue;
                                                        v2 = false;
                                                        break block25;
                                                    }
                                                    v2 = true;
                                                }
                                            }
                                            if (!v2) continue;
                                            var8_9.add(var12_16 + var26_48);
                                            if (var8_9.size() < var7_7) continue;
                                            return var8_9;
                                        }
                                    }
                                }
                            }
                            break block28;
                        }
                        if (!bz.b(var9_10, et.a[64], false, 2, null)) break block29;
                        var11_11 = bz.a(var9_10, et.a[65], null, 2, null);
                        et.a(this, var4_4, (String)var11_11, var8_9, 0, 8, null);
                        break block28;
                    }
                    if (var10_34 != 2 || bz.b(var2_2, et.a[66], false, 2, null)) break block28;
                    var13_19 = a_.values();
                    var15_25 = ((a_[])var13_19).length;
                    for (var14_21 = 0; var14_21 < var15_25; ++var14_21) {
                        var17_29 = var16_28 = var13_19[var14_21];
                        var18_31 = 0;
                        var19_36 /* !! */  = var2_2;
                        var20_39 = false;
                        if (bz.b(var19_36 /* !! */ , ((Enum)var17_29).toString(), false, 2, null)) ** GOTO lbl-1000
                        var19_36 /* !! */  = var2_2;
                        var20_39 = false;
                        if (bz.a(var19_36 /* !! */ , ((Enum)var17_29).toString(), false, 2, null)) ** GOTO lbl-1000
                        if (bz.a(var2_2, et.a[67], false, 2, null)) {
                            var19_36 /* !! */  = (CharSequence)var17_29;
                            var20_40 = et.a[68];
                            var21_43 = false;
                            ** if (!bz.b((CharSequence)((CharSequence)var2_2), (CharSequence)((CharSequence)(var19_36 /* !! */  + var20_40)), (boolean)false, (int)2, null)) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 3 sources

                        {
                            v3 = true;
                            ** GOTO lbl106
                        }
lbl-1000:
                        // 2 sources

                        {
                            v3 = false;
                        }
lbl106:
                        // 2 sources

                        if (!v3) continue;
                        v4 = var16_28;
                        break block26;
                    }
                    v4 = var11_11 = null;
                }
                if (var11_11 != null) {
                    var13_19 = var6_6.s().d();
                    var14_21 = 0;
                    var15_26 = var13_19;
                    var16_28 = new ArrayList<E>();
                    var17_30 = false;
                    var18_32 = var15_26.iterator();
                    while (var18_32.hasNext()) {
                        var19_36 /* !! */  = var18_32.next();
                        var20_41 = (c1)var19_36 /* !! */ ;
                        var21_43 = false;
                        if (!(var20_41.d() == var11_11)) continue;
                        var16_28.add(var19_36 /* !! */ );
                    }
                    var12_17 = (List)var16_28;
                    for (c1 var14_23 : var12_17) {
                        if (!bz.c(var14_23.g(), var9_10, true)) continue;
                        if (var8_9.size() >= var7_7) {
                            return var8_9;
                        }
                        var15_26 = var14_23.h().c();
                        if (var15_26 != null) {
                            var16_28 = var3_3;
                            var17_30 = false;
                            var18_32 = var16_28;
                            var19_37 = false;
                            if (var18_32.e((String)var15_26) == false) continue;
                        }
                        var8_9.add(var14_23.g());
                    }
                }
            }
            var11_11 = var6_6;
            var12_14 = false;
            if (var11_11.g()) {
                var34_13 = var11_11;
                var13_20 = false;
                var14_24 = var8_9;
                var15_27 = false;
                var16_28 = var14_24;
                var34_13.a(h1.a((CharSequence)var2_2, (CharSequence)Arrays.toString(var16_28.toArray(new String[0]))));
            }
            return var8_9;
        }
        catch (dr_0 var7_8) {
            return ll.e();
        }
    }

    private final void a(di_0 di_02, String string, ArrayList arrayList, int n) {
        aK aK2;
        String string2;
        w w2 = (w)di_02.a(w.class);
        Object object = new String[]{a[69], a[70]};
        String[] stringArray = object;
        object = di_02.i().a();
        Collection collection = w2.e().values();
        HashSet hashSet = new HashSet();
        for (String string3 : stringArray) {
            if (this.a(string3, string, hashSet, n)) break;
        }
        Iterator<Object> iterator = object.iterator();
        while (iterator.hasNext() && !this.a(string2 = (String)iterator.next(), string, hashSet, n)) {
        }
        iterator = collection.iterator();
        while (iterator.hasNext() && !this.a((aK2 = (aK)iterator.next()).e(), string, hashSet, n)) {
        }
        arrayList.addAll(hashSet);
    }

    static /* synthetic */ void a(et et2, di_0 di_02, String string, ArrayList arrayList, int n, int n2, Object object) {
        if ((n2 & 8) != 0) {
            n = 5;
        }
        et2.a(di_02, string, arrayList, n);
    }

    private final boolean a(String string, String string2, HashSet hashSet, int n) {
        if (string == null) {
            return false;
        }
        if (bz.b((CharSequence)string2) || bz.c(string, string2, true)) {
            hashSet.add(a[71] + string);
        }
        return hashSet.size() >= n;
    }

    public /* synthetic */ et(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\u7302\u731a\u731b\u730a", 129725295), hl.a("\ubdd1\ubdc7\ubdd4\ubdc8", -1872970330), hl.a("\uc30b\uc310\uc31c\uc31f\uc310", 1542701950), hl.a("\u2a44\u2a5f\u2a5c\u2a44\u2a45\u2a54", -580113871), hl.a("\u6d23\u6d38\u6d21\u6d37\u6d24\u6d38", -1136497322), hl.a("\uc5e8\uc5f9\uc5f1\uc5ec\uc5fe\uc5fd\uc5f2", 1520223644), hl.a("\u0eac\u0ebd\u0eb5\u0ea8\u0eb5\u0ead\u0eac\u0ebd", -836170024), hl.a("\ufe43\ufe5a\ufe48\ufe4b\ufe44", -833749462), hl.a("\uaec9\uaeca\uaec5\uaec2\uaedb", 301575851), hl.a("\ucde9\ucdea\ucde5\ucda6\ucde2\ucdfb", -498676341), hl.a("zc~fgv", -1286471661), hl.a("\ufa7d\ufa65\ufa64\ufa75\ufa79\ufa60", 1862859280), hl.a("\u04e2\u04f3\u04fb\u04e6\u04ff\u04e6\u04f4\u04f7\u04f8", -1780874090), hl.a("\ua73b\ua72a\ua722\ua73f\ua72d\ua72e\ua721\ua726\ua73f", -475355313), hl.a("\u5ed5\u5ec4\u5ecc\u5ed1\u5ec8\u5ed1\u5ecc\u5ed4\u5ed5\u5ec4", -1584177503), hl.a("\u5631\u5620\u5628\u5635\u5628\u5630\u5631\u5620\u562c\u5635", 292443717), hl.a("\u4e3b\u4e38\u4e37\u4e74\u4e30\u4e29", -841003431), hl.a("\ua8ec\ua8f7\ua8fb\ua8f8\ua8f7", 2018486425), hl.a("\u97dc\u97c7\u97de\u97c8\u97db\u97c7", -1651206231), hl.a("\u52e1\u52f0\u52f8\u52e5\u52f7\u52f4\u52fb\u52fc\u52e5", 585061013), hl.a("\ue57c\ue57f\ue570\ue577\ue56e", -1984502498), hl.a("\u245c\u2444\u2445\u2454\u2458\u2441", 211428401), hl.a("\ua663\ua678\ua67b\ua663\ua662\ua673", -1447975402), hl.a("\ud3c0\ud3d1\ud3d9\ud3c4\ud3d9\ud3c1\ud3c0\ud3d1\ud3dd\ud3c4", -657861708), hl.a("\u35e3\u35f2\u35fa\u35e7\u35fe\u35e7\u35fa\u35e2\u35e3\u35f2", -43305577), hl.a("\uf764\uf775\uf77d\uf760\uf779\uf760\uf772\uf771\uf77e", -144050416), hl.a("\u83fb\u83e0\u83ec\u83ef\u83e0\u83a0\u83e1\u83f9\u83e0", -1086094450), hl.a("\u2884\u289f\u289c\u2884\u2885\u2894\u28df\u289e\u2886\u289f", 1310533873), hl.a("\u1ce6\u1cfd\u1ce4\u1cf2\u1ce1\u1cfd\u1cbd\u1cfc\u1ce4\u1cfd", 218504339), hl.a("\u0629\u0630\u062d\u0635\u0634\u0625", 840697408), hl.a("\u7273\u726a\u7278\u727b\u7274", -759008742), hl.a("\u8215\u8204\u8201\u8214\u8218\u8201", -197164431), hl.a("\u880e\u8809\u881c\u881b\u881b\u8815\u8814\u880e\u8809\u8812\u880f\u8804", 48662653), hl.a("\u6b7f\u6b7e\u6b64\u6b63\u6b78\u6b65\u6b6e", 73886487), hl.a("\u47b8\u47b5\u47ad\u47aa", 1150502873), hl.a("\u677a\u677f\u6762\u6773\u6774\u6777\u6778\u6765\u672c\u6777\u677a\u6762\u6765", 1062102806), hl.a("\uc79d\uc796\uc79b\uc79d\uc795\uc79f\uc792\uc78a\uc78d", 180078590), hl.a("\u0db0\u0db5\u0da8\u0db9\u0dbe\u0dbd\u0db2\u0daf\u0de6\u0dbf\u0db4\u0db9\u0dbf\u0db7\u0dbd\u0db0\u0da8\u0daf", -1854403108), hl.a("\u8580\u8585\u8598\u8589\u858e\u858d\u8582\u859f\u85d6\u8588\u8599\u859c\u8589\u8585\u859c", 413042156), hl.a("\u2271\u2270\u226a\u226d", 1351033369), hl.a("\u8f96\u8f93\u8f8e\u8f9f\u8f98\u8f9b\u8f94\u8f89\u8fc0\u8f92\u8f93\u8f89\u8f8e\u8f95\u8f88\u8f83", 393908218), hl.a("\ud6e3\ud6e4\ud6f1\ud6f6\ud6f6\ud6f8\ud6f9\ud6e3\ud6e4", -1859791216), hl.a("\u7c91\u7c94\u7c89\u7c98\u7c9f\u7c9c\u7c93\u7c8e\u7cc7\u7c8e\u7c89\u7c9c\u7c9b\u7c9b\u7c95\u7c94\u7c8e\u7c89\u7c92\u7c8f\u7c84", 580025597), hl.a("\u7c01\u7c04\u7c19\u7c08\u7c0f\u7c0c\u7c03\u7c1e\u7c57", -678069139), hl.a("\u4f8d\u4f91\u4f8c\u4f8a", -234729474), hl.a("\uce7c\uce7c", 2019085900), hl.a("\u070f\u070e\u0705", 2010515263), hl.a("\u60bf\u60a7\u60a6\u60b7", 1874354386), hl.a("\u2f27\u2f31\u2f22\u2f3e", -90951856), hl.a("\u81fc\u81e7\u81eb\u81e8\u81e7", -1274183287), hl.a("\u4f39\u4f22\u4f21\u4f39\u4f38\u4f29", 1500073804), hl.a("\u784a\u7851\u7848\u785e\u784d\u7851", 1028356159), hl.a("\u639a\u638b\u6383\u639e\u638c\u638f\u6380", 1723294702), hl.a("\u60c7\u60d6\u60de\u60c3\u60de\u60c6\u60c7\u60d6", 1709727923), hl.a("\u6da1\u6db8\u6daa\u6da9\u6da6", 1998482888), hl.a("\u859c\u859f\u8590\u8597\u858e", 1972733438), hl.a("\u815c\u815f\u8150\u8113\u8157\u814e", -837713602), hl.a("\u70c7\u70de\u70c3\u70db\u70da\u70cb", -446205778), hl.a("\udc2c\udc34\udc35\udc24\udc28\udc31", -2066621375), hl.a("\ua043\ua052\ua05a\ua047\ua05e\ua047\ua055\ua056\ua059", 1945346103), hl.a("\u7def\u7dfe\u7df6\u7deb\u7df9\u7dfa\u7df5\u7df2\u7deb", 10583451), hl.a("\u09a1\u09b0\u09b8\u09a5\u09bc\u09a5\u09b8\u09a0\u09a1\u09b0", -307426859), hl.a("\u365d\u364c\u3644\u3659\u3644\u365c\u365d\u364c\u3640\u3659", 470824489), hl.a("", 363114131), hl.a("\u2bd6\u2bc0\u2bd7\u2bd3\u2bc0\u2bd7\u2b9f", -2100548699), hl.a("\u0139\u012f\u0138\u013c\u012f\u0138\u0170", -1958608566), hl.a("\udb36\udb2d", -1428825277), hl.a("\u37fa\u37e3", 1266825107), hl.a("\u12d2\u12cb", 1546130107), hl.a("\u285e\u2855\u2856\u285b\u2858\u2855", -982898631), hl.a("\udc73\udc70\udc7c\udc7e\udc73", -35660769), hl.a("\u5ec7\u5ed1\u5ec6\u5ec2\u5ed1\u5ec6\u5e8e", 1852399284)};
    }

    static {
        et.a();
    }
}

