package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bz;
import litebans.ch;
import litebans.di_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.h1;
import litebans.hd_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jT;
import litebans.jZ;
import litebans.kL;
import litebans.kR;
import litebans.kb_0;
import litebans.kc_0;
import litebans.ll;
import litebans.lo_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fm_0
extends fg_0 {
    private final String[] g;
    private boolean d;
    private String f;
    private jZ e;
    private ch i;
    private static /* synthetic */ String[] h;

    public fm_0(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.g = stringArray;
        this.f = "global";
        this.e = jZ.c;
    }

    @Override
    public void run() {
        this.f = aa_0.a(this, this.d(), this.g, this.f);
        Object object = this;
        boolean bl = false;
        fo_0 fo_02 = fg_0.a;
        boolean bl2 = ((fg_0)object).d().f();
        Object object2 = am.b;
        boolean bl3 = false;
        fo_0 fo_03 = fo_02;
        boolean bl4 = !bl2;
        boolean bl5 = false;
        if (bl4) {
            fo_0 fo_04 = fo_03;
            boolean bl6 = false;
            fo_04.a(object2);
            throw new as();
        }
        object = fg_0.a;
        bl = !lo_0.b(this.g, "confirm");
        boolean bl7 = false;
        if (bl) {
            Object object3 = object;
            bl2 = false;
            object2 = this;
            bl3 = false;
            ((fo_0)object3).a(am.dj.a("serverScope", (Object)((fm_0)object2).f));
            throw new as();
        }
        object = this;
        bl = false;
        ((w)((fg_0)object).h().a(w.class)).a(arg_0 -> fm_0.a(this, arg_0));
    }

    private static final iv_0 a(fm_0 fm_02, ch ch2) {
        List list;
        boolean bl;
        Object object;
        String string;
        Object v1;
        int n;
        Object object2;
        Object object3;
        Iterator iterator;
        Object object4;
        Object object5;
        block23: {
            String string2;
            boolean t7;
            Object v0;
            boolean bl3;
            Object object6;
            boolean bl4;
            jZ[] jZArray;
            boolean bl5;
            Object object7;
            block22: {
                object7 = fg_0.a;
                boolean bl6 = ch2.b();
                object5 = am.aX;
                bl5 = false;
                object4 = object7;
                boolean bl7 = false;
                if (bl6) {
                    fo_0 fo_02 = object4;
                    boolean bl8 = false;
                    fo_02.a(object5);
                    throw new as();
                }
                object7 = h1.a(lo_0.d(fm_02.g));
                object5 = (Iterable)object7;
                bl5 = false;
                object4 = object5.iterator();
                while (object4.hasNext()) {
                    Object e = object4.next();
                    jZArray = (String)e;
                    bl4 = false;
                    object6 = fm_02;
                    bl3 = false;
                    if (!(!(ew.a((Object)jZArray, (Object)"reset-database") || bz.b((String)jZArray, "exclude:", false, 2, null) || bz.b((String)jZArray, "mode:", false, 2, null) || bz.b((String)jZArray, "server:", false, 2, null) || ew.a((Object)jZArray, (Object)"-g") || ew.a((Object)jZArray, (Object)"confirm")))) continue;
                    v0 = e;
                    break block22;
                }
                v0 = null;
            }
            String string3 = v0;
            object5 = fg_0.a;
            bl5 = string3 != null;
            object4 = hd_0.f("Unrecognized parameter: " + hd_0.d(string3));
            boolean bl9 = false;
            jZArray = object5;
            bl4 = false;
            if (bl5) {
                object6 = jZArray;
                bl3 = false;
                ((fo_0)object6).a(object4);
                throw new as();
            }
            fm_02.i = ch2;
            fm_02.d = eq_0.f.b(fm_02.f);
            object5 = fm_02.d ? "__ALL__" : fm_02.f;
            object4 = (Iterable)object7;
            bl9 = false;
            jZArray = object4;
            Collection collection = new ArrayList();
            boolean bl10 = false;
            for (Object t2 : jZArray) {
                iterator = (String)t2;
                t7 = false;
                if (!bz.b((String)((Object)iterator), "exclude:reason:", false, 2, null)) continue;
                collection.add(t2);
            }
            object4 = (List)collection;
            bl9 = false;
            jZArray = object4;
            collection = new ArrayList(ll.a((Iterable)object4, 10));
            bl10 = false;
            for (Object t5 : jZArray) {
                iterator = (String)t5;
                object3 = collection;
                t7 = false;
                object3.add(bz.a((String)((Object)iterator), "exclude:reason:", null, 2, null));
            }
            List list2 = (List)collection;
            jZArray = (Iterable)object7;
            boolean bl11 = false;
            object2 = jZArray;
            Iterator iterator2 = new ArrayList();
            boolean n2 = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t8 = iterator.next();
                string2 = (String)t8;
                n = 0;
                if (!bz.b(string2, "exclude:", false, 2, null)) continue;
                iterator2.add(t8);
            }
            jZArray = (List)((Object)iterator2);
            bl11 = false;
            object2 = jZArray;
            iterator2 = new ArrayList(ll.a((Iterable)jZArray, 10));
            boolean enumArray = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t9 = iterator.next();
                string2 = (String)t9;
                object3 = iterator2;
                n = 0;
                object3.add(bz.a(string2, "exclude:", null, 2, null));
            }
            jZArray = (List)((Object)iterator2);
            bl11 = false;
            object2 = jZArray;
            iterator2 = new ArrayList();
            boolean bl19 = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t10 = iterator.next();
                string2 = (String)t10;
                n = 0;
                if (!(!bz.c((CharSequence)string2, ':', false, 2, null))) continue;
                iterator2.add(t10);
            }
            object4 = kb_0.c((List)((Object)iterator2));
            if (!((Collection)object4).isEmpty()) {
                fm_0 fm_03 = fm_02;
                boolean bl13 = false;
                ((Collection)object4).add("history");
                ((Collection)object4).add("config");
            }
            object2 = (Iterable)object7;
            iterator2 = object2.iterator();
            while (iterator2.hasNext()) {
                Object t2 = iterator2.next();
                iterator = (String)t2;
                boolean bl2 = false;
                if (!bz.b((String)((Object)iterator), "mode:", false, 2, null)) continue;
                v1 = t2;
                break block23;
            }
            v1 = null;
        }
        String string3 = v1;
        String string4 = string = string3 != null ? bz.b(string3, ':', null, 2, null) : null;
        if (string != null) {
            jZ jZ2;
            Object object6;
            block24: {
                jZ[] jZArray = jZ.values();
                object3 = fm_02;
                object2 = jZArray;
                int n2 = ((jZ[])object2).length;
                for (int i = 0; i < n2; ++i) {
                    Iterator iterator2 = iterator = object2[i];
                    boolean bl3 = false;
                    if (!bz.a(((Enum)((Object)iterator2)).name(), string, true)) continue;
                    object6 = iterator;
                    break block24;
                }
                object6 = jZ2 = null;
            }
            if (object6 == null) {
                jZ2 = jZ.c;
            }
            ((fm_0)object3).e = jZ2;
        }
        Object object9 = fm_02;
        boolean bl16 = false;
        if (((fm_0)object9).d) {
            object2 = kL.values();
            boolean bl17 = false;
            Enum[] enumArray = object2;
            iterator = new ArrayList();
            boolean bl4 = false;
            for (Enum enum_ : enumArray) {
                object = enum_;
                bl = false;
                if (!(((kL)object).a() || object == kL.g)) continue;
                iterator.add((Enum)enum_);
            }
            list = (List)((Object)iterator);
        } else {
            list = kL.d.a();
        }
        object9 = list;
        bl16 = false;
        object2 = object9;
        Object object10 = new ArrayList();
        boolean bl5 = false;
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t3 = iterator.next();
            kL kL2 = (kL)t3;
            n = 0;
            if (!(!object4.contains(kL2.toString().toLowerCase(Locale.ROOT)))) continue;
            object10.add(t3);
        }
        object9 = (List)object10;
        bl16 = false;
        object2 = object9;
        object10 = new ArrayList();
        boolean bl6 = false;
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t4 = iterator.next();
            kL kL3 = (kL)t4;
            n = 0;
            if (!(!object4.contains(kL3.name().toLowerCase(Locale.ROOT)))) continue;
            object10.add(t4);
        }
        object9 = (List)object10;
        bl16 = false;
        object2 = object9;
        object10 = new ArrayList(ll.a((Iterable)object9, 10));
        boolean bl7 = false;
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t5 = iterator.next();
            kL kL4 = (kL)t5;
            object3 = object10;
            n = 0;
            object3.add(kc_0.a(kL4, kR.a(ch2, kL4, (String)object5, false, 4, null)));
        }
        object9 = (List)object10;
        bl16 = false;
        object10 = object2 = object9;
        boolean bl8 = false;
        iterator = object10.iterator();
        while (iterator.hasNext()) {
            Object t6 = iterator.next();
            jT jT2 = (jT)t6;
            n = 0;
            boolean bl9 = false;
            object = fm_02;
            bl = false;
            ch ch3 = ((fm_0)object).i;
            if (ch3 == null) {
                ew.e("");
                ch3 = null;
            }
            ch3.a((kL)jT2.b(), ((fm_0)object).f, ((fm_0)object).e.ordinal());
        }
        object9 = object2;
        bl16 = false;
        object10 = object2 = object9;
        boolean bl10 = false;
        iterator = object10.iterator();
        while (iterator.hasNext()) {
            Object t7 = iterator.next();
            jT jT3 = (jT)t7;
            n = 0;
            fm_0 fm_03 = fm_02;
            boolean bl11 = false;
            fm_0 fm_04 = fm_03;
            boolean bl12 = false;
            jT jT4 = jT3;
            boolean bl13 = false;
            CharSequence[] charSequenceArray = new CharSequence[]{"amount", String.valueOf(((Number)jT4.e()).longValue())};
            CharSequence charSequence = h1.a((CharSequence)am.b8.a("serverScope", (Object)fm_04.f), charSequenceArray);
            charSequenceArray = new CharSequence[]{"type", ((kL)jT4.b()).name().toLowerCase(Locale.ROOT)};
            aa_0.a((fg_0)fm_03, (CharSequence)h1.a(charSequence, charSequenceArray));
        }
        w.a(ch2.d(), 0L, true, true, false, 1, null);
        return iv_0.a;
    }

    private static final void a() {
        h = new String[]{"global", "serverScope", "serverScope", "amount", "type", "confirm", "serverScope", "history", "config", "reset-database", "exclude:", "mode:", "server:", "-g", "confirm", "", "serverScope", "amount", "type", "reset-database", "exclude:", "mode:", "server:", "-g", "confirm", "Unrecognized parameter: ", "__ALL__", "exclude:reason:", "exclude:reason:", "exclude:", "exclude:", "history", "config", "mode:", "", "serverScope", "amount", "type"};
    }

    static {
        fm_0.a();
    }
}

