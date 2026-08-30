package litebans;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import litebans.aK;
import litebans.aa_0;
import litebans.ch;
import litebans.di_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.h1;
import litebans.hd_0;
import litebans.hl;
import litebans.ij;
import litebans.iv_0;
import litebans.jn;
import litebans.jv_0;
import litebans.kg_0;
import litebans.q_0;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class f3
extends fg_0 {
    private static /* synthetic */ String[] d;

    public f3(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> f3.a(this, arg_0));
    }

    private static final void a(u u2, jn jn2, CopyOnWriteArrayList copyOnWriteArrayList, jv_0 jv_02) {
        u2.b(jn2);
        int n = copyOnWriteArrayList.size();
        if (n <= 1) {
            jv_0 jv_03 = jv_02;
            CharSequence charSequence = h1.a(hd_0.i, d[0]);
            boolean bl = false;
            fo_0.a(fg_0.a, jv_03, charSequence, null, 4, null);
        } else {
            jv_0 jv_04 = jv_02;
            Object object = copyOnWriteArrayList;
            boolean bl = false;
            Collection collection = object;
            object = h1.a(hd_0.i, d[1]) + hd_0.m + n + hd_0.i + d[2] + kg_0.a.a(collection.toArray(new Object[0]), d[3]);
            bl = false;
            fo_0.a(fg_0.a, jv_04, (CharSequence)object, null, 4, null);
        }
    }

    private static final iv_0 a(f3 f32, ch ch2) {
        if (ch2.d().s()) {
            u u2 = (u)ch2.e().a(u.class);
            Object object = f32;
            boolean bl = false;
            String string = ((q_0)((fg_0)object).h().a(q_0.class)).f().d();
            object = String.valueOf(System.nanoTime() % (long)1000);
            CopyOnWriteArrayList<aK> copyOnWriteArrayList = new CopyOnWriteArrayList<aK>();
            copyOnWriteArrayList.add(ch2.d().l());
            aa_0.a((fg_0)f32, (CharSequence)(h1.a(hd_0.i, d[4]) + hd_0.m + string + hd_0.i + '\"'));
            aa_0.a((fg_0)f32, (CharSequence)h1.a(hd_0.i, d[5]));
            jn jn2 = new jn((String)object, copyOnWriteArrayList);
            u2.a(jn2);
            u.a(u2, ij.e, ch2, (CharSequence)object, 0, 8, null);
            jv_0 jv_02 = f32.d();
            fg_0 fg_02 = f32;
            boolean bl2 = false;
            long l3 = ((q_0)fg_02.h().a(q_0.class)).f().aQ();
            fg_02 = f32;
            bl2 = false;
            ch2.e().a(() -> f3.a(u2, jn2, copyOnWriteArrayList, jv_02), l3 * (long)(((q_0)fg_02.h().a(q_0.class)).f().ag() + 1));
        }
        return iv_0.a;
    }

    private static final void a() {
        d = new String[]{hl.a("\ub974\ub948\ub945\ub952\ub945\ub900\ub941\ub952\ub945\ub900\ub94e\ub94f\ub900\ub94f\ub954\ub948\ub945\ub952\ub900\ub953\ub945\ub952\ub956\ub945\ub952\ub953\ub900\ub943\ub94f\ub94e\ub94e\ub945\ub943\ub954\ub945\ub944\ub900\ub954\ub94f\ub900\ub954\ub948\ub949\ub953\ub900\ub944\ub941\ub954\ub941\ub942\ub941\ub953\ub945\ub90e", 1764014368), hl.a("\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13", 0x3DD3AA33), hl.a("\u1994\u19c7\u19d1\u19c6\u19c2\u19d1\u19c6\u19c7\u1994\u19d7\u19db\u19da\u19da\u19d1\u19d7\u19c0\u19d1\u19d0\u1994\u19c0\u19db\u1994\u19c0\u19dc\u19dd\u19c7\u1994\u19d0\u19d5\u19c0\u19d5\u19d6\u19d5\u19c7\u19d1\u198e\u1994", -1973937740), hl.a("\u2a78\u2a74", 479734356), hl.a("\u208b\u20be\u20bd\u20b3\u20ba\u20ff\u20af\u20ad\u20ba\u20b9\u20b6\u20a7\u20ff\u20b0\u20b9\u20ff\u20ab\u20b7\u20b6\u20ac\u20ff\u20b6\u20b1\u20ac\u20ab\u20be\u20b1\u20bc\u20ba\u20e5\u20ff\u20fd", 500637919), hl.a("\u5f42\u5f69\u5f64\u5f62\u5f6a\u5f68\u5f6f\u5f66\u5f21\u5f67\u5f6e\u5f73\u5f21\u5f6e\u5f75\u5f69\u5f64\u5f73\u5f21\u5f72\u5f64\u5f73\u5f77\u5f64\u5f73\u5f72\u5f21\u5f62\u5f6e\u5f6f\u5f6f\u5f64\u5f62\u5f75\u5f64\u5f65\u5f21\u5f75\u5f6e\u5f21\u5f75\u5f69\u5f64\u5f21\u5f65\u5f60\u5f75\u5f60\u5f63\u5f60\u5f72\u5f64\u5f2d\u5f21\u5f71\u5f6d\u5f64\u5f60\u5f72\u5f64\u5f21\u5f76\u5f60\u5f68\u5f75\u5f2f\u5f2f\u5f2f", -121741567)};
    }

    static {
        f3.a();
    }
}

