package litebans;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.aJ;
import litebans.am;
import litebans.bz;
import litebans.ch;
import litebans.cz;
import litebans.ew;
import litebans.g9;
import litebans.hd_0;
import litebans.hl;
import litebans.i3;
import litebans.jT;
import litebans.kc_0;
import litebans.ll;
import litebans.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.bc
 */
public static final class bc_0 {
    private static /* synthetic */ String[] a;

    private bc_0() {
    }

    /*
     * Unable to fully structure code
     */
    public final void a(@NotNull ch var1_1, @NotNull cz var2_2, @NotNull String var3_3) {
        if (((CharSequence)var3_3).length() == 0) {
            return;
        }
        var4_4 = var2_2;
        var5_5 = false;
        var6_6 = new i3(var3_3);
        v0 = var4_4.q();
        ew.a(v0);
        var7_7 = v0;
        v1 = am.b(bc_0.a[0] + var4_4.u() + bc_0.a[1]);
        if (v1 == null) {
            v1 = bc_0.a[2];
        }
        var8_8 = v1;
        var9_9 = am.b(bc_0.a[3] + var4_4.u() + bc_0.a[4]);
        var10_10 = i3.j.a(var1_1, am.b(bc_0.a[5] + var4_4.u() + bc_0.a[6]));
        v2 = var11_11 = am.b(bc_0.a[7] + var4_4.u() + bc_0.a[8]);
        if (v2 != null ? bz.b((CharSequence)v2) : false) ** GOTO lbl-1000
        v3 = var11_11;
        v4 = v3 != null ? !bz.b(v3, bc_0.a[9], false, 2, null) : false;
        if (v4) lbl-1000:
        // 2 sources

        {
            var11_11 = null;
        } else {
            v5 = var11_11;
            v6 = var11_11 = v5 != null && (v5 = var1_1.a(v5, var4_4.H(), var4_4.d(), false)) != null && (v5 = var1_1.a(v5, var7_7, var4_4.t(), false)) != null ? v5.toString() : null;
        }
        if ((v7 = am.b(bc_0.a[10] + var4_4.u() + bc_0.a[11])) == null) {
            v7 = bc_0.a[12];
        }
        var12_12 = v7;
        var13_13 = i3.j.a(var1_1, var12_12, var4_4);
        var8_8 = var1_1.a(var1_1.a((CharSequence)var8_8, var4_4.H(), var4_4.d(), false), var7_7, var4_4.t(), false).toString();
        var14_14 = var9_9;
        ew.a((Object)var14_14);
        var9_9 = var1_1.a(var1_1.a((CharSequence)var14_14, var4_4.H(), var4_4.d(), false), var7_7, var4_4.t(), false).toString();
        i3.j.a(var1_1, var6_6, var8_8, var9_9, var10_10, var11_11, var13_13, bz.a((CharSequence)var12_12, (CharSequence)bc_0.a[13], false, 2, null) == false);
    }

    private final jT[] a(ch ch2, String string, cz cz2) {
        jT[] jTArray;
        Object object;
        cz cz3 = cz2;
        boolean bl = false;
        if (bz.b((CharSequence)string)) {
            return null;
        }
        bc_0 bc_02 = i3.j;
        CharSequence charSequence = ch2.a((CharSequence)string, cz3.q(), cz3.t(), false);
        boolean bl2 = false;
        ArrayList<jT> arrayList = new ArrayList<jT>();
        String string2 = bc_02.a(charSequence);
        List list = null;
        ew.a((Object)string2);
        if (bz.a((CharSequence)string2, (CharSequence)a[14], false, 2, null)) {
            object = new String[]{a[15]};
            list = bz.a((CharSequence)string2, (String[])object, false, 0, 6, null);
        } else {
            object = new char[1];
            object[0] = (String)10;
            list = bz.a((CharSequence)string2, (char[])object, false, 0, 6, null);
        }
        object = list;
        boolean bl3 = false;
        Object object2 = object.iterator();
        while (object2.hasNext()) {
            Object t2 = object2.next();
            String string3 = (String)t2;
            boolean bl4 = false;
            if (((CharSequence)string3).length() == 0) continue;
            Object object3 = new char[]{':'};
            List list2 = bz.a((CharSequence)string3, object3, false, 0, 6, null);
            if (list2.size() <= 1) {
                if (arrayList.isEmpty()) {
                    ((Collection)arrayList).add(kc_0.a(string3, string3));
                    continue;
                }
                object3 = (jT)ll.a(arrayList);
                arrayList.set(ll.b(arrayList), kc_0.a(object3.b(), (String)object3.e() + '\n' + string3));
                continue;
            }
            ((Collection)arrayList).add(kc_0.a(list2.get(0), list2.get(1)));
        }
        if (!((Collection)arrayList).isEmpty()) {
            object = arrayList;
            bl3 = false;
            object2 = object;
            jTArray = object2.toArray(new jT[0]);
        } else {
            jTArray = null;
        }
        return jTArray;
    }

    public final int a(@NotNull ch ch2, @NotNull CharSequence charSequence) {
        int n = 0xFFFFFF;
        try {
            n = ((Number)Integer.valueOf(bz.b(((Object)charSequence).toString(), '#', null, 2, null), 16)).intValue();
        }
        catch (NumberFormatException numberFormatException) {
            ch2.e().getLogger().warning(a[18]);
        }
        return n;
    }

    public final String a(@NotNull CharSequence charSequence) {
        return hd_0.a((CharSequence)y.b.a(((Object)charSequence).toString()));
    }

    public final void a(@NotNull ch ch2, @NotNull i3 i32, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int n, @Nullable String string, @Nullable jT[] jTArray, boolean bl) {
        if (charSequence2.length() == 0 && jTArray == null) {
            return;
        }
        try {
            Object[] objectArray;
            g9 g92 = new g9(this.a(charSequence), this.a(charSequence2), null, n, null, string, null, null, null, 468, null);
            if (jTArray != null) {
                objectArray = jTArray;
                boolean bl2 = false;
                int n2 = objectArray.length;
                for (int i = 0; i < n2; ++i) {
                    Object object;
                    Object object2 = object = objectArray[i];
                    boolean bl3 = false;
                    String string2 = (String)((jT)object2).a();
                    String string3 = (String)((jT)object2).c();
                    g92.a(string2, string3, bl);
                }
            }
            objectArray = new g9[]{g92};
            i32.a(ll.c(objectArray));
            i32.c();
        }
        catch (Exception exception) {
            if (exception instanceof IllegalArgumentException || exception instanceof MalformedURLException) {
                ch2.e().getLogger().warning(a[19] + i32.d() + a[20] + exception.getLocalizedMessage());
            }
            ch2.e().getLogger().warning(a[21] + i32.b());
            ch2.d().a(exception);
        }
    }

    public /* synthetic */ bc_0(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\uaa44\uaa56\uaa51\uaa4c", 1542892051), hl.a("\u173a\u1731\u172c\u1731\u1729\u1720", 1919948645), hl.a("", -870311946), hl.a("\ua8f2\ua8e0\ua8e7\ua8fa", -299194203), hl.a("\u9c70\u9c6c\u9c60\u9c61\u9c7b\u9c6a\u9c61\u9c7b", -307389393), hl.a("\ub99d\ub98f\ub988\ub995", -1396917814), hl.a("\uea49\uea55\uea59\uea5a\uea59\uea44", -1141970410), hl.a("\u0885\u0897\u0890\u088d", 1429801170), hl.a("\u5f6c\u5f67\u5f7b\u5f66\u5f7e\u5f71", 374759219), hl.a("\u9a89\u9a95\u9a95\u9a91\u9a92\u9adb\u9ace\u9ace", -481256735), hl.a("\u18f6\u18e4\u18e3\u18fe", 2106136737), hl.a("\ufa63\ufa7a\ufa75\ufa79\ufa70\ufa78\ufa6f", 1080097340), hl.a("", 13023714), hl.a("\ucfc0\ucfc0", -1156460598), hl.a("\ud780\ud780", -553068662), hl.a("\u116e\u116e", -1938026140), hl.a("\u601a\u601a", -1347985392), hl.a("\u95b5\u95b5", -983525953), hl.a("\ue91d\ue93a\ue922\ue935\ue938\ue93d\ue930\ue974\ue937\ue93b\ue938\ue93b\ue926\ue974\ue932\ue93b\ue926\ue939\ue935\ue920\ue974\ue93d\ue93a\ue974\ue931\ue939\ue936\ue931\ue930\ue974\ue937\ue93b\ue93a\ue932\ue93d\ue933\ue921\ue926\ue935\ue920\ue93d\ue93b\ue93a\ue978\ue974\ue93d\ue933\ue93a\ue93b\ue926\ue93d\ue93a\ue933\ue97a", 1101850964), hl.a("\uf129\uf112\uf11d\uf11e\uf110\uf119\uf15c\uf108\uf113\uf15c\uf10c\uf113\uf10f\uf108\uf15c\uf138\uf115\uf10f\uf11f\uf113\uf10e\uf118\uf15c\uf111\uf119\uf10f\uf10f\uf11d\uf11b\uf119\uf15c\uf108\uf113\uf15c\uf115\uf112\uf10a\uf11d\uf110\uf115\uf118\uf15c\uf129\uf12e\uf130\uf146\uf15c\uf15b", -2047938180), hl.a("\u5b19\u5b04\u5b1e", 561470270), hl.a("\uf3e2\uf3d7\uf3d7\uf3c6\uf3ce\uf3d3\uf3d7\uf3c6\uf3c7\uf383\uf3d7\uf3cc\uf383\uf3d3\uf3cc\uf3d0\uf3d7\uf383\uf3e7\uf3ca\uf3d0\uf3c0\uf3cc\uf3d1\uf3c7\uf383\uf3ce\uf3c6\uf3d0\uf3d0\uf3c2\uf3c4\uf3c6\uf383\uf3c1\uf3d6\uf3d7\uf383\uf3c6\uf3cd\uf3c0\uf3cc\uf3d6\uf3cd\uf3d7\uf3c6\uf3d1\uf3c6\uf3c7\uf383\uf3c2\uf3cd\uf383\uf3c6\uf3db\uf3c0\uf3c6\uf3d3\uf3d7\uf3ca\uf3cc\uf3cd\uf382\uf3a9\uf3e9\uf3f0\uf3ec\uf3ed\uf383\uf3c7\uf3c2\uf3d7\uf3c2\uf399", 551416739)};
    }

    static {
        bc_0.a();
    }
}

