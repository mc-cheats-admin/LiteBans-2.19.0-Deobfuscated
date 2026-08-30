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

public final class et {
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
        String[] stringArray = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
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
                                var12_16 = "";
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
                        if (!bz.b(var9_10, "server:", false, 2, null)) break block29;
                        var11_11 = bz.a(var9_10, "server:", null, 2, null);
                        et.a(this, var4_4, (String)var11_11, var8_9, 0, 8, null);
                        break block28;
                    }
                    if (var10_34 != 2 || bz.b(var2_2, "un", false, 2, null)) break block28;
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
                        if (bz.a(var2_2, "ip", false, 2, null)) {
                            var19_36 /* !! */  = (CharSequence)var17_29;
                            var20_40 = "ip";
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
        Object object = new String[]{"global", "local"};
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
            hashSet.add("server:" + string);
        }
        return hashSet.size() >= n;
    }

    public /* synthetic */ et(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "sort", "00", "01:", "mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip", "", "server:", "server:", "un", "ip", "ip", "global", "local", "server:"};
    }

    static {
        et.a();
    }
}

