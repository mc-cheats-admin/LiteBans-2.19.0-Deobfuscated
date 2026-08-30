package litebans;

import java.util.Iterator;
import java.util.List;
import litebans.am;
import litebans.bF;
import litebans.bz;
import litebans.ch;
import litebans.cz;
import litebans.dZ;
import litebans.di_0;
import litebans.eM;
import litebans.et;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gn_0;
import litebans.hl;
import litebans.jv_0;
import litebans.kR;
import litebans.kk;
import litebans.ll;
import litebans.lo_0;
import litebans.q_0;
import litebans.v;
import org.jetbrains.annotations.NotNull;

public static abstract class fV
extends fB {
    private static /* synthetic */ String[] i;

    public fV(@NotNull String string, @NotNull di_0 di_02) {
        super(string, di_02);
    }

    public final void a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull cz cz2) {
        cz cz3 = cz2;
        boolean bl = false;
        if (!cz3.E()) {
            return;
        }
        v v2 = (v)ch2.e().a(v.class);
        List list = ll.e();
        if (cz3.i() != null) {
            if (cz3.m()) {
                eM eM2 = cz3.i();
                ew.a(eM2);
                list = eM2.a(cz3.D()).d();
            }
        } else {
            list = cz3.g().a(cz3.D()).d();
            if (list.isEmpty()) {
                list = cz3.g().h().d();
            }
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            boolean bl2 = false;
            if (bz.b(string, i[0], false, 2, null)) {
                bl2 = true;
                string2 = bz.a(string2, i[1], null, 2, null);
            }
            if (bz.a((CharSequence)string2, '/', false, 2, null)) {
                string2 = string2.substring(1);
            }
            char[] cArray = new char[]{' '};
            String string3 = (String)ll.b(bz.a((CharSequence)string2, cArray, false, 0, 6, null));
            boolean bl3 = this.a(string3);
            if (bl2 && !bz.a((CharSequence)string2, (CharSequence)i[2], false, 2, null) && bl3) {
                string2 = string2 + i[3] + cz3.a().a() + i[4] + cz3.a().i();
            }
            if (bl3) {
                string2 = string2 + i[5] + (cz2.r() + 1);
            }
            string2 = ((Object)kR.a(ch2, kR.a(ch2, (CharSequence)string2, dZ2, false, 2, null), cz3.t(), false, 2, null)).toString();
            string2 = bF.a(ch2, (CharSequence)string2, cz2);
            fV fV2 = this;
            ch ch3 = ch2;
            ew.a(v2);
            v v3 = v2;
            boolean bl4 = false;
            Object object = fV2;
            boolean bl5 = false;
            ((q_0)((fg_0)object).h().a(q_0.class)).a(10, (Object)string2);
            Object object2 = object = bl2 ? ch3.e().y() : fV2.d();
            if (object.e()) {
                v3.b((byte)3, object.a());
            }
            ch3.e().c(new kk((jv_0)object, string2));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean a(String string) {
        if (ew.a((Object)string, (Object)i[6])) return true;
        if (ew.a((Object)string, (Object)i[7])) return true;
        et et2 = fB.d;
        boolean bl = false;
        Object[] objectArray = new String[]{i[8], i[9], i[10], i[11], i[12], i[13], i[14], i[15], i[16], i[17], i[18], i[19], i[20], i[21], i[22], i[23]};
        if (!lo_0.b(objectArray, string)) return false;
        return true;
    }

    public final void a(@NotNull cz cz2) {
        fg_0 fg_02 = this;
        boolean bl = false;
        gn_0 gn_02 = ((q_0)fg_02.h().a(q_0.class)).z().c();
        if ((gn_02 != null ? gn_02.b() : null) != null) {
            fo_0.a(fg_0.a, cz2.a(), am.bs, null, 4, null);
        }
        fg_0 fg_03 = this;
        boolean bl2 = false;
        if (((q_0)fg_03.h().a(q_0.class)).s().a() == null) {
            fo_0.a(fg_0.a, cz2.a(), am.aV, null, 4, null);
        }
    }

    private static final void a() {
        i = new String[]{hl.a("\u0549\u0545\u0544\u0559\u0545\u0546\u054f\u0510", 263193898), hl.a("\ud454\ud458\ud459\ud444\ud458\ud45b\ud452\ud40d", 1030018103), hl.a("\udf49\udf49\udf17\udf01\udf0a\udf00\udf01\udf16", 1826611044), hl.a("\ua195\ua198\ua198\ua1c6\ua1d0\ua1db\ua1d1\ua1d0\ua1c7\ua198\ua1c0\ua1c0\ua1dc\ua1d1\ua188", -1350852171), hl.a("\u21ad\u21a0\u21a0\u21fe\u21e8\u21e3\u21e9\u21e8\u21ff\u21b0", -7659123), hl.a("\u808a\u8087\u8087\u80d9\u80de\u80cb\u80c9\u80c1\u8097", 826114218), hl.a("\uf005\uf006\uf009", -386863001), hl.a("\u47e1\u47e3\u47e9\u47e1", -327202934), hl.a("\ua7b5\ua7ad\ua7ac\ua7bd", 1957275608), hl.a("\ua606\ua610\ua603\ua61f", -242506127), hl.a("\ub516\ub50d\ub501\ub502\ub50d", 1108587875), hl.a("\uc9d8\uc9c3\uc9c0\uc9d8\uc9d9\uc9c8", -2115057235), hl.a("\u1dc0\u1ddb\u1dc2\u1dd4\u1dc7\u1ddb", 1038491061), hl.a("\uc0dd\uc0cc\uc0c4\uc0d9\uc0cb\uc0c8\uc0c7", -2138193751), hl.a("\u56d7\u56c6\u56ce\u56d3\u56ce\u56d6\u56d7\u56c6", -2034215261), hl.a("\u5c07\u5c1e\u5c0c\u5c0f\u5c00", -1424663442), hl.a("\u865a\u8659\u8656\u8651\u8648", 1232700984), hl.a("\uef94\uef97\uef98\uefdb\uef9f\uef86", -157945866), hl.a("\ufc59\ufc40\ufc5d\ufc45\ufc44\ufc55", 783940656), hl.a("\u54e4\u54fc\u54fd\u54ec\u54e0\u54f9", -1232579447), hl.a("\u9e1f\u9e0e\u9e06\u9e1b\u9e02\u9e1b\u9e09\u9e0a\u9e05", -555442581), hl.a("\u450e\u451f\u4517\u450a\u4518\u451b\u4514\u4513\u450a", 1206404474), hl.a("\uf7d8\uf7c9\uf7c1\uf7dc\uf7c5\uf7dc\uf7c1\uf7d9\uf7d8\uf7c9", 52557740), hl.a("\u6a16\u6a07\u6a0f\u6a12\u6a0f\u6a17\u6a16\u6a07\u6a0b\u6a12", -1826002334)};
    }

    static {
        fV.a();
    }
}

