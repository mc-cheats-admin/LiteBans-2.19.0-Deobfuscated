package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import litebans.as_0;
import litebans.bD;
import litebans.bz;
import litebans.de_0;
import litebans.di_0;
import litebans.e2;
import litebans.ea_0;
import litebans.ej;
import litebans.er;
import litebans.er_0;
import litebans.et;
import litebans.ew;
import litebans.fB;
import litebans.g8;
import litebans.gr_0;
import litebans.hl;
import litebans.hz_0;
import litebans.i4;
import litebans.i5;
import litebans.ip_0;
import litebans.ir_0;
import litebans.jT;
import litebans.jv_0;
import litebans.kc_0;
import litebans.ks_0;
import litebans.l6;
import litebans.ll;
import litebans.n_0;
import litebans.q_0;
import litebans.v_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class y
extends n_0 {
    public static final ir_0 b;
    private static boolean c;
    public static final boolean e;
    private static /* synthetic */ String[] d;

    public y(@NotNull di_0 di_02) {
        super(di_02);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String a(@NotNull jv_0 jv_02, @NotNull String string) {
        ej ej2;
        block15: {
            block16: {
                Object object;
                int n;
                Object object2;
                block14: {
                    boolean bl;
                    boolean bl2;
                    int n2;
                    boolean bl3;
                    block12: {
                        ej2 = this.a(string, jv_02);
                        boolean bl4 = false;
                        object2 = ej2.a();
                        bl3 = false;
                        n2 = ((i4[])object2).length;
                        for (n = 0; n < n2; ++n) {
                            object = object2[n];
                            i4 i42 = object;
                            bl2 = false;
                            if (!i42.b()) continue;
                            bl = true;
                            break block12;
                        }
                        bl = false;
                    }
                    if (!bl) return b.a(string);
                    if (ej2.b() == null) return b.a(string);
                    if (jv_02.f()) {
                        block13: {
                            Object object3;
                            i4[] i4Array = ej2.a();
                            int n3 = i4Array.length;
                            for (n2 = 0; n2 < n3; ++n2) {
                                i4 i43;
                                i4 i44 = i43 = i4Array[n2];
                                boolean bl5 = false;
                                if (!(i44.b() && ew.a((Object)i44.g(), (Object)this.b(jv_02)))) continue;
                                object3 = i43;
                                break block13;
                            }
                            object3 = object2 = null;
                        }
                        if (object2 != null) {
                            jv_02.a(ej2.c());
                            jv_02.a("=> " + ((i4)object2).a());
                            return null;
                        }
                    }
                    object2 = (q_0)this.a.a(q_0.class);
                    bl3 = false;
                    if (((q_0)object2).g()) {
                        Object object4 = object2;
                        n = 0;
                        ((q_0)object4).a(ej2.b());
                    }
                    if (!jv_02.e()) break block15;
                    object2 = ej2.a();
                    bl3 = false;
                    n = 0;
                    n2 = ((Object)object2).length;
                    while (n < n2) {
                        Object object5 = object = object2[n];
                        bl2 = false;
                        if (!ew.a((Object)((i4)object5).g(), (Object)this.a(jv_02))) {
                            ++n;
                            continue;
                        }
                        break block14;
                    }
                    throw new NoSuchElementException("Array contains no element matching the ");
                }
                if (!((i4)object).b()) break block16;
                object2 = jv_02;
                String string2 = "litebans.json.hover_text";
                n = 0;
                if (!object2.e(string2)) break block15;
            }
            jv_02.b(ej2.b().toString());
            return null;
        }
        String string3 = ej2.c();
        return string3;
    }

    public final i4 a(@NotNull String string, @NotNull String string2, @NotNull String string3, @Nullable i4 i42) {
        List list;
        int n;
        String string4 = '{' + string2 + ':';
        if (i42 != null && !bz.a((CharSequence)string, (CharSequence)string4, false, 2, null) && bz.c((CharSequence)string, '}', false, 2, null) && i42.d() && ew.a((Object)i42.e(), (Object)string2)) {
            String string5 = string4 + ' ' + string;
            return this.a(string5, string2, string3, null);
        }
        if (!bz.a((CharSequence)string, (CharSequence)string4, false, 2, null)) {
            return new i4(string2, string3, string, null, false, false, 56, null);
        }
        Object object = new char[]{' '};
        List list2 = bz.a((CharSequence)string, object, false, 0, 6, null);
        object = ll.a((Collection)list2);
        int n2 = 0;
        int n3 = 0;
        n3 = 1;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        ArrayList<String> arrayList = new ArrayList<String>(object.size());
        y y2 = this;
        boolean bl4 = false;
        Iterable iterable = list2;
        int n4 = 0;
        int n5 = 0;
        for (Object object2 : iterable) {
            if ((n = n5++) < 0) {
                ll.b();
            }
            String string6 = (String)object2;
            int n6 = n;
            boolean bl5 = false;
            if (!bl && bz.b(string6, string4, false, 2, null)) {
                bl = true;
                bl2 = true;
                n2 = n6;
                continue;
            }
            if (!bl2) continue;
            ++n3;
            if (bz.c((CharSequence)string6, '}', false, 2, null) && !bz.c((CharSequence)string6, '{', false, 2, null)) {
                String string7 = bz.c(string6, '}', null, 2, null);
                if (((CharSequence)string7).length() > 0) {
                    arrayList.add(string7);
                }
                String string8 = bz.d(string6, '}', null, 2, null);
                if (((CharSequence)string8).length() > 0) {
                    int n7 = n6 + 1;
                    if (object.size() > n7) {
                        object.set(n7, string8 + (String)object.get(n7));
                    } else {
                        object.add(string8);
                    }
                }
                bl2 = false;
                bl3 = true;
                break;
            }
            arrayList.add(string6);
        }
        n2 = Math.min(object.size() - 1, n2);
        Iterable iterable2 = as_0.b(0, n3);
        boolean bl6 = false;
        Object object3 = iterable2.iterator();
        while (object3.hasNext()) {
            int n8;
            n4 = n8 = ((i5)object3).b();
            n5 = 0;
            object.remove(n2);
        }
        String string9 = string2;
        String string10 = string3;
        String string11 = ll.a((Iterable)object, " ", null, null, 0, null, null, 62, null);
        if (ew.a((Object)string2, (Object)"url")) {
            Iterable<String> iterable3;
            iterable2 = arrayList;
            String string12 = string11;
            String string13 = string10;
            String string14 = string9;
            bl6 = false;
            object3 = iterable2;
            iterable = new ArrayList(ll.a(iterable2, 10));
            n4 = 0;
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                Object object2;
                Iterator iterator2 = iterator.next();
                object2 = (String)((Object)iterator2);
                iterable3 = iterable;
                n = 0;
                iterable3.add(bz.a(object2, '\u00a7', null, 2, null));
            }
            iterable3 = (List)iterable;
            string9 = string14;
            string10 = string13;
            string11 = string12;
            list = iterable3;
        } else {
            list = arrayList;
        }
        boolean bl7 = bl2;
        boolean bl8 = bl3;
        String string15 = ll.a(list, " ", null, null, 0, null, null, 62, null);
        String string16 = string11;
        String string17 = string10;
        String string18 = string9;
        return new i4(string18, string17, string16, string15, bl8, bl7);
    }

    public static /* synthetic */ i4 a(y y2, String string, String string2, String string3, i4 i42, int n, Object object) {
        if ((n & 8) != 0) {
            i42 = null;
        }
        return y2.a(string, string2, string3, i42);
    }

    public final ej a(@NotNull String string, @NotNull jv_0 jv_02) {
        Object[] objectArray;
        String string2;
        bD bD2;
        String string3 = b.a(string);
        String string4 = this.a(jv_02);
        String string5 = this.b(jv_02);
        i4 i42 = y.a(this, string3, "hoverText", string4, null, 8, null);
        i4 i43 = y.a(this, i42.c(), "run", string5, null, 8, null);
        i4 i44 = y.a(this, i43.c(), "url", string5, null, 8, null);
        i4 i45 = y.a(this, i44.c(), "suggest", string5, null, 8, null);
        i4 i46 = y.a(this, i45.c(), "copy", string5, null, 8, null);
        if (!(i42.b() || i43.b() || i44.b() || i45.b() || i46.b())) {
            return new ej(string3, null, new i4[0]);
        }
        gr_0 gr_02 = null;
        gr_0 gr_03 = null;
        int n = 0;
        if (i42.b()) {
            bD2 = new ks_0();
            string2 = i42.a();
            objectArray = y.a(this, string2, jv_02, null, null, null, 28, null);
            bD2.add(objectArray);
            gr_03 = new gr_0();
            ((Map)gr_03).put("action", "show_text");
            ((Map)gr_03).put("value", bD2);
            ++n;
        }
        if (i43.b()) {
            gr_02 = new gr_0();
            ((Map)gr_02).put("action", "run_command");
            if (this.c(jv_02)) {
                ((Map)gr_02).put("command", i43.a());
            } else {
                ((Map)gr_02).put("value", i43.a());
            }
            ++n;
        }
        if (i45.b()) {
            gr_02 = new gr_0();
            ((Map)gr_02).put("action", "suggest_command");
            if (this.c(jv_02)) {
                ((Map)gr_02).put("command", i45.a());
            } else {
                ((Map)gr_02).put("value", i45.a());
            }
            ++n;
        }
        if (i46.b()) {
            gr_02 = new gr_0();
            ((Map)gr_02).put("action", "copy_to_clipboard");
            ((Map)gr_02).put("value", i45.a());
            ++n;
        }
        if (i44.b() && bz.b(i44.a(), "https:", false, 2, null)) {
            gr_02 = new gr_0();
            ((Map)gr_02).put("action", "open_url");
            if (this.c(jv_02)) {
                ((Map)gr_02).put("url", i44.a());
            } else {
                ((Map)gr_02).put("value", i44.a());
            }
            ++n;
        }
        bD2 = null;
        string2 = string3;
        jT[] jTArray = new jT[]{kc_0.a(i42, gr_03), kc_0.a(i43, gr_02), kc_0.a(i44, gr_02), kc_0.a(i45, gr_02), kc_0.a(i46, gr_02)};
        for (jT jT2 : jTArray) {
            i4 i47 = (i4)jT2.b();
            gr_0 gr_04 = (gr_0)jT2.e();
            if (!i47.b()) continue;
            bD2 = this.a(i47.c(), jv_02, gr_04, i47.g(), (gr_0)bD2);
            string2 = i47.c();
        }
        if (n > 1 && bD2 != null) {
            bD2 = this.a((gr_0)bD2, jv_02);
        }
        objectArray = new i4[]{i42, i43, i44, i45, i46};
        return new ej(string2, (gr_0)bD2, (i4[])objectArray);
    }

    public final String b(@NotNull jv_0 jv_02) {
        return this.c(jv_02) ? "click_event" : "clickEvent";
    }

    public final String a(@NotNull jv_0 jv_02) {
        return this.c(jv_02) ? "hover_event" : "hoverEvent";
    }

    public final gr_0 a(@NotNull String string, @NotNull jv_0 jv_02, @Nullable gr_0 gr_02, @NotNull String string2, @Nullable gr_0 gr_03) {
        gr_0 gr_04 = gr_03;
        Object var7_7 = null;
        try {
            boolean bl;
            boolean bl2 = bl = gr_03 == null;
            if (bl) {
                int n;
                int n2;
                g8 g82 = g8.a;
                if (this.a.t() == 1) {
                    ew.b(jv_02, "");
                    n2 = ((ea_0)jv_02).b();
                } else if (this.a.t() == 2) {
                    ew.b(jv_02, "");
                    n2 = ((hz_0)jv_02).a();
                } else {
                    n2 = n = !this.c(jv_02) ? 0 : 770;
                }
                if (n < 770) {
                    g82 = g8.c;
                }
                Object object = er.a(string);
                String string3 = e2.a(g82).a(Arrays.copyOf(object, ((v_0[])object).length));
                object = new ip_0().a(string3);
                ew.b(object, "");
                gr_04 = (gr_0)object;
                if (!this.a(gr_02, gr_04, string2)) {
                    Object v2 = gr_04.get("contents");
                    if (ew.a(v2, (Object)"null")) {
                        String[] stringArray;
                        String[] stringArray2;
                        y y2 = this;
                        gr_0 gr_05 = gr_04;
                        boolean bl3 = false;
                        q_0 q_02 = (q_0)y2.a.a(q_0.class);
                        ew.a(q_02);
                        et et2 = fB.d;
                        Object v3 = gr_05.get("contents");
                        ew.b(v3, "");
                        String string4 = (String)v3;
                        boolean bl4 = false;
                        if (ew.a((Object)string4, (Object)"sort")) {
                            String[] stringArray3 = new String[]{"00"};
                            stringArray2 = stringArray3;
                        } else {
                            String[] stringArray4 = new String[]{"01:" + string4};
                            stringArray2 = stringArray4;
                        }
                        if (new l6(q_02, Arrays.copyOf(stringArray = stringArray2, stringArray.length)).b() == q_02.hashCode()) {
                            throw new IllegalArgumentException(gr_05.toString());
                        }
                    } else if (ew.a(v2, (Object)"true") || ew.a(v2, (Object)"false")) {
                        this.a(gr_04, jv_02);
                    }
                }
            } else {
                gr_0 gr_06 = gr_04;
                if (gr_06 == null) {
                    gr_06 = new gr_0();
                }
                gr_04 = gr_06;
                if (bl) {
                    ((Map)gr_04).put("text", string);
                }
                if (gr_02 != null) {
                    ((Map)gr_04).put(string2, gr_02);
                }
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to build JSON: \"" + gr_04 + "\"; last result: " + var7_7, exception);
        }
        return gr_04;
    }

    public static /* synthetic */ gr_0 a(y y2, String string, jv_0 jv_02, gr_0 gr_02, String string2, gr_0 gr_03, int n, Object object) {
        if ((n & 4) != 0) {
            gr_02 = null;
        }
        if ((n & 8) != 0) {
            string2 = "";
        }
        if ((n & 0x10) != 0) {
            gr_03 = null;
        }
        return y2.a(string, jv_02, gr_02, string2, gr_03);
    }

    private final boolean a(gr_0 gr_02, gr_0 gr_03, String string) {
        if (gr_02 != null) {
            ks_0 ks_02;
            ks_0 ks_03 = ks_02 = (ks_0)gr_03.get("extra");
            if (ks_03 != null) {
                Iterable iterable = ks_03;
                boolean bl = false;
                Iterable iterable2 = iterable;
                Collection collection2 = new ArrayList();
                boolean bl2 = false;
                Iterator iterator = iterable2.iterator();
                while (iterator.hasNext()) {
                    Object t2 = iterator.next();
                    if (!(t2 instanceof gr_0)) continue;
                    collection2.add(t2);
                }
                iterable = (List)collection2;
                bl = false;
                for (Collection collection2 : iterable) {
                    gr_0 gr_04 = (gr_0)((Object)collection2);
                    boolean bl3 = false;
                    ((Map)gr_04).put(string, gr_02);
                }
            }
            ((Map)gr_03).put(string, gr_02);
            return true;
        }
        return false;
    }

    public final gr_0 a(@NotNull gr_0 gr_02, @NotNull jv_0 jv_02) {
        block6: {
            Object object;
            Object object2;
            Object object3;
            if (!ew.a(gr_02.get("text"), (Object)"")) {
                object3 = gr_02;
                object2 = "text";
                i4 i42 = y.a(this, (String)gr_02.get("text"), null, 2, null);
                String string = i42 != null ? i42.c() : null;
                object3.put(object2, string);
            }
            object3 = (ks_0)gr_02.get("extra");
            object2 = null;
            Object object4 = object3;
            if (object4 == null) break block6;
            Iterable iterable = (Iterable)object4;
            boolean bl = false;
            Iterable iterable2 = iterable;
            Collection collection2 = new ArrayList();
            boolean bl2 = false;
            Iterator iterator = iterable2.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!(object instanceof gr_0)) continue;
                collection2.add(object);
            }
            iterable = (List)collection2;
            bl = false;
            for (Collection collection2 : iterable) {
                String string;
                gr_0 gr_03 = (gr_0)((Object)collection2);
                boolean bl3 = false;
                object2 = object = this.a((String)gr_03.get("text"), (i4)object2);
                Object t2 = object;
                ((Map)gr_03).put("text", t2 != null ? ((i4)t2).c() : null);
                String string2 = "click_event";
                String string3 = "clickEvent";
                if (!this.c(jv_02)) {
                    string = string2;
                    string2 = string3;
                    string3 = string;
                }
                if (gr_03.containsKey(string2) && gr_03.containsKey(string3)) {
                    gr_03.remove(string3);
                }
                string2 = "hover_event";
                string3 = "hoverEvent";
                if (!this.c(jv_02)) {
                    string = string2;
                    string2 = string3;
                    string3 = string;
                }
                if (!gr_03.containsKey(string2) || !gr_03.containsKey(string3)) continue;
                gr_03.remove(string3);
            }
        }
        return gr_02;
    }

    private final i4 a(String string, i4 i42) {
        if (string == null) {
            return null;
        }
        i4 i43 = this.a(string, "hoverText", "", i42);
        i4 i44 = this.a(i43.c(), "run", "", i42);
        i4 i45 = this.a(i44.c(), "url", "", i42);
        i4 i46 = this.a(i45.c(), "suggest", "", i42);
        i4 i47 = this.a(i46.c(), "copy", "", i42);
        if (i47.b() || i47.d()) {
            return i47;
        }
        if (i46.b() || i46.d()) {
            return i46;
        }
        if (i45.b() || i45.d()) {
            return i45;
        }
        if (i44.b() || i44.d()) {
            return i44;
        }
        return i43;
    }

    static /* synthetic */ i4 a(y y2, String string, i4 i42, int n, Object object) {
        if ((n & 2) != 0) {
            i42 = null;
        }
        return y2.a(string, i42);
    }

    @Override
    public void e() {
    }

    public final boolean c(@NotNull jv_0 jv_02) {
        if (this.a.t() == 4) {
            return c;
        }
        de_0 de_02 = er_0.a(de_0.c, this.a.i().b(), null, 2, null);
        if (this.a.t() == 1) {
            ew.b(jv_02, "");
            return ((ea_0)jv_02).b() >= 770;
        }
        if (this.a.t() == 2) {
            ew.b(jv_02, "");
            return ((hz_0)jv_02).a() >= 770;
        }
        return de_02.a(1, 21, 5);
    }

    static {
        e = false;
        y.d();
        b = new ir_0(null);
        c = true;
    }

    private static final void d() {
        d = new String[]{"=> ", "Array contains no element matching the ", "litebans.json.hover_text", " ", "url", " ", "hoverText", "run", "url", "suggest", "copy", "action", "show_text", "value", "action", "run_command", "command", "value", "action", "suggest_command", "command", "value", "action", "copy_to_clipboard", "value", "https:", "action", "open_url", "url", "value", "click_event", "clickEvent", "hover_event", "hoverEvent", "", "", "", "contents", "null", "contents", "", "sort", "00", "01:", "true", "false", "text", "Failed to build JSON: \"", "\"; last result: ", "", "extra", "text", "", "text", "text", "extra", "text", "text", "click_event", "clickEvent", "hover_event", "hoverEvent", "hoverText", "", "run", "", "url", "", "suggest", "", "copy", "", "contents", "", "sort", "00", "01:", "", "", "", "display-name", "ip", "name", "uuid", "", ""};
    }
}

