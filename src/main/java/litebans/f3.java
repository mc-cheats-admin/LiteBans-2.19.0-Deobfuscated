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

public final class f3
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
            CharSequence charSequence = h1.a(hd_0.i, "There are no other servers connected to this ");
            boolean bl = false;
            fo_0.a(fg_0.a, jv_03, charSequence, null, 4, null);
        } else {
            jv_0 jv_04 = jv_02;
            Object object = copyOnWriteArrayList;
            boolean bl = false;
            Collection collection = object;
            object = h1.a(hd_0.i, "\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13") + hd_0.m + n + hd_0.i + " servers connected to this database: " + kg_0.a.a(collection.toArray(new Object[0]), ", ");
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
            aa_0.a((fg_0)f32, (CharSequence)(h1.a(hd_0.i, "Table prefix of this instance: \"") + hd_0.m + string + hd_0.i + '\"'));
            aa_0.a((fg_0)f32, (CharSequence)h1.a(hd_0.i, "Checking for other servers connected to the database, please wait.. + "));
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
        d = new String[]{"There are no other servers connected to this ", hl.a("\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13", 0x3DD3AA33), " servers connected to this database: ", ", ", "Table prefix of this instance: \"", "Checking for other servers connected to the database, please wait..."};
    }

    static {
        f3.a();
    }
}

