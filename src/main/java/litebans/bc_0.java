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

public final class bc_0 {
    private static /* synthetic */ String[] a;

    private bc_0() {
    }

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
        v1 = am.b("WEB_" + var4_4.u() + "_TITLE");
        if (v1 == null) {
            v1 = "";
        }
        var8_8 = v1;
        var9_9 = am.b("WEB_" + var4_4.u() + "_CONTENT");
        var10_10 = i3.j.a(var1_1, am.b("WEB_" + var4_4.u() + "_COLOR"));
        v2 = var11_11 = am.b("WEB_" + var4_4.u() + "_THUMB");
        if (v2 != null ? bz.b((CharSequence)v2) : false) ** GOTO lbl-1000
        v3 = var11_11;
        v4 = v3 != null ? !bz.b(v3, "https://", false, 2, null) : false;
        if (v4) lbl-1000:
        // 2 sources

        {
            var11_11 = null;
        } else {
            v5 = var11_11;
            v6 = var11_11 = v5 != null && (v5 = var1_1.a(v5, var4_4.H(), var4_4.d(), false)) != null && (v5 = var1_1.a(v5, var7_7, var4_4.t(), false)) != null ? v5.toString() : null;
        }
        if ((v7 = am.b("WEB_" + var4_4.u() + "_FIELDS")) == null) {
            v7 = "";
        }
        var12_12 = v7;
        var13_13 = i3.j.a(var1_1, var12_12, var4_4);
        var8_8 = var1_1.a(var1_1.a((CharSequence)var8_8, var4_4.H(), var4_4.d(), false), var7_7, var4_4.t(), false).toString();
        var14_14 = var9_9;
        ew.a((Object)var14_14);
        var9_9 = var1_1.a(var1_1.a((CharSequence)var14_14, var4_4.H(), var4_4.d(), false), var7_7, var4_4.t(), false).toString();
        i3.j.a(var1_1, var6_6, var8_8, var9_9, var10_10, var11_11, var13_13, bz.a((CharSequence)var12_12, (CharSequence)"\n\n", false, 2, null) == false);
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
        if (bz.a((CharSequence)string2, (CharSequence)"\n\n", false, 2, null)) {
            object = new String[]{"\n\n"};
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
            ch2.e().getLogger().warning("Invalid color format in embed configuration, ");
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
                ch2.e().getLogger().warning("Unable to post Discord message to invalid URL: '" + i32.d() + "': " + exception.getLocalizedMessage());
            }
            ch2.e().getLogger().warning("Attempted to post Discord message but encountered an exception!\nJSON data:" + i32.b());
            ch2.d().a(exception);
        }
    }

    public /* synthetic */ bc_0(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"WEB_", "_TITLE", "", "WEB_", "_CONTENT", "WEB_", "_COLOR", "WEB_", "_THUMB", "https://", "WEB_", "_FIELDS", "", "\n\n", "\n\n", "\n\n", "\n\n", "\n\n", "Invalid color format in embed configuration, ", "Unable to post Discord message to invalid URL: '", "': ", "Attempted to post Discord message but encountered an exception!\nJSON data:"};
    }

    static {
        bc_0.a();
    }
}

