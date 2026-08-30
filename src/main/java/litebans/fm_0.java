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

/*
 * Renamed from litebans.fM
 */
public static final class fm_0
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
        this.f = h[0];
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
        bl = !lo_0.b(this.g, h[5]);
        boolean bl7 = false;
        if (bl) {
            Object object3 = object;
            bl2 = false;
            object2 = this;
            bl3 = false;
            ((fo_0)object3).a(am.dj.a(h[6], (Object)((fm_0)object2).f));
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
                    if (!(!(ew.a((Object)jZArray, (Object)h[19]) || bz.b((String)jZArray, h[20], false, 2, null) || bz.b((String)jZArray, h[21], false, 2, null) || bz.b((String)jZArray, h[22], false, 2, null) || ew.a((Object)jZArray, (Object)h[23]) || ew.a((Object)jZArray, (Object)h[24])))) continue;
                    v0 = e;
                    break block22;
                }
                v0 = null;
            }
            String string3 = v0;
            object5 = fg_0.a;
            bl5 = string3 != null;
            object4 = hd_0.f(h[25] + hd_0.d(string3));
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
            object5 = fm_02.d ? h[26] : fm_02.f;
            object4 = (Iterable)object7;
            bl9 = false;
            jZArray = object4;
            Collection collection = new ArrayList();
            boolean bl10 = false;
            for (Object t2 : jZArray) {
                iterator = (String)t2;
                t7 = false;
                if (!bz.b((String)((Object)iterator), h[27], false, 2, null)) continue;
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
                object3.add(bz.a((String)((Object)iterator), h[28], null, 2, null));
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
                if (!bz.b(string2, h[29], false, 2, null)) continue;
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
                object3.add(bz.a(string2, h[30], null, 2, null));
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
                ((Collection)object4).add(h[31]);
                ((Collection)object4).add(h[32]);
            }
            object2 = (Iterable)object7;
            iterator2 = object2.iterator();
            while (iterator2.hasNext()) {
                Object t2 = iterator2.next();
                iterator = (String)t2;
                boolean bl2 = false;
                if (!bz.b((String)((Object)iterator), h[33], false, 2, null)) continue;
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
                ew.e(h[34]);
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
            CharSequence[] charSequenceArray = new CharSequence[]{h[36], String.valueOf(((Number)jT4.e()).longValue())};
            CharSequence charSequence = h1.a((CharSequence)am.b8.a(h[35], (Object)fm_04.f), charSequenceArray);
            charSequenceArray = new CharSequence[]{h[37], ((kL)jT4.b()).name().toLowerCase(Locale.ROOT)};
            aa_0.a((fg_0)fm_03, (CharSequence)h1.a(charSequence, charSequenceArray));
        }
        w.a(ch2.d(), 0L, true, true, false, 1, null);
        return iv_0.a;
    }

    private static final void a() {
        h = new String[]{hl.a("\u73ff\u73f4\u73f7\u73fa\u73f9\u73f4", -1686539368), hl.a("\ud51c\ud50a\ud51d\ud519\ud50a\ud51d\ud53c\ud50c\ud500\ud51f\ud50a", -1599154833), hl.a("\uf344\uf352\uf345\uf341\uf352\uf345\uf364\uf354\uf358\uf347\uf352", -1473776841), hl.a("\u864d\u8641\u8643\u8659\u8642\u8658", 2099742252), hl.a("\u07e3\u07ee\u07e7\u07f2", 1134233495), hl.a("\u79a8\u79a4\u79a5\u79ad\u79a2\u79b9\u79a6", 2119793099), hl.a("\u95cc\u95da\u95cd\u95c9\u95da\u95cd\u95ec\u95dc\u95d0\u95cf\u95da", -1014524481), hl.a("\u7240\u7241\u725b\u725c\u7247\u725a\u7251", -1012698584), hl.a("\u0581\u058d\u058c\u0584\u058b\u0585", -1832516126), hl.a("\u61ee\u61f9\u61ef\u61f9\u61e8\u61b1\u61f8\u61fd\u61e8\u61fd\u61fe\u61fd\u61ef\u61f9", -1843043940), hl.a("\uf946\uf95b\uf940\uf94f\uf956\uf947\uf946\uf919", -1752762077), hl.a("\u1d8c\u1d8e\u1d85\u1d84\u1ddb", -825745951), hl.a("\u5ebf\u5ea9\u5ebe\u5eba\u5ea9\u5ebe\u5ef6", -268017972), hl.a("\u06e5\u06af", 548996808), hl.a("\u6bbd\u6bb1\u6bb0\u6bb8\u6bb7\u6bac\u6bb3", 615017438), hl.a("", 1063166549), hl.a("\u95cb\u95dd\u95ca\u95ce\u95dd\u95ca\u95eb\u95db\u95d7\u95c8\u95dd", -1562667592), hl.a("\ub5a8\ub5a4\ub5a6\ub5bc\ub5a7\ub5bd", -1487424055), hl.a("\u9dde\u9dd3\u9dda\u9dcf", 580492714), hl.a("\u0f32\u0f25\u0f33\u0f25\u0f34\u0f6d\u0f24\u0f21\u0f34\u0f21\u0f22\u0f21\u0f33\u0f25", 1265766208), hl.a("\ud4cc\ud4d1\ud4ca\ud4c5\ud4dc\ud4cd\ud4cc\ud493", -981936983), hl.a("\u83bd\u83bf\u83b4\u83b5\u83ea", -1822587952), hl.a("\u6697\u6681\u6696\u6692\u6681\u6696\u66de", -1142331676), hl.a("\u64b5\u64ff", -1069980520), hl.a("\ua9e3\ua9ef\ua9ee\ua9e6\ua9e9\ua9f2\ua9ed", -906057344), hl.a("\ue90d\ue936\ue92a\ue93d\ue93b\ue937\ue93f\ue936\ue931\ue922\ue93d\ue93c\ue978\ue928\ue939\ue92a\ue939\ue935\ue93d\ue92c\ue93d\ue92a\ue962\ue978", -475272872), hl.a("\uf872\uf872\uf86c\uf861\uf861\uf872\uf872", 1621620781), hl.a("\uebef\uebf2\uebe9\uebe6\uebff\uebee\uebef\uebb0\uebf8\uebef\uebeb\uebf9\uebe5\uebe4\uebb0", 594078602), hl.a("\u775b\u7746\u775d\u7752\u774b\u775a\u775b\u7704\u774c\u775b\u775f\u774d\u7751\u7750\u7704", 803698494), hl.a("\u78ca\u78d7\u78cc\u78c3\u78da\u78cb\u78ca\u7895", -1238599505), hl.a("\uc5c1\uc5dc\uc5c7\uc5c8\uc5d1\uc5c0\uc5c1\uc59e", -1206270556), hl.a("\u55fe\u55ff\u55e5\u55e2\u55f9\u55e4\u55ef", 457397654), hl.a("\u3b2b\u3b27\u3b26\u3b2e\u3b21\u3b2f", 1918516040), hl.a("\u51d3\u51d1\u51da\u51db\u5184", 1790333374), hl.a("", 708703575), hl.a("\u3cbe\u3ca8\u3cbf\u3cbb\u3ca8\u3cbf\u3c9e\u3cae\u3ca2\u3cbd\u3ca8", -1852621619), hl.a("\uada3\uadaf\uadad\uadb7\uadac\uadb6", -2072072766), hl.a("\u9d5e\u9d53\u9d5a\u9d4f", -2037605078)};
    }

    static {
        fm_0.a();
    }
}

