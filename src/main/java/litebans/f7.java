package litebans;

import java.util.Date;
import java.util.UUID;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bK;
import litebans.cM;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.h1;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jj_0;
import litebans.kR;
import litebans.lo_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class f7
extends fg_0 {
    private final String[] e;
    private final boolean f;
    private static /* synthetic */ String[] d;

    public f7(@NotNull String[] stringArray, @NotNull di_0 di_02, boolean bl) {
        super(di_02);
        this.e = stringArray;
        this.f = bl;
    }

    @Override
    public void run() {
        Object object;
        if (this.f) {
            object = new String[]{d[0], d[1]};
            aa_0.a((fg_0)this, (String[])object);
        }
        object = fg_0.a;
        boolean bl = this.e.length < 2;
        CharSequence charSequence = am.bl;
        boolean bl2 = false;
        String[] stringArray = object;
        boolean bl3 = false;
        if (bl) {
            String[] stringArray2 = stringArray;
            boolean bl4 = false;
            stringArray2.a(charSequence);
            throw new as();
        }
        object = this;
        bl = false;
        ((w)((fg_0)object).h().a(w.class)).a(arg_0 -> f7.a(this, arg_0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final iv_0 a(f7 f72, ch ch2) {
        boolean bl;
        Object object;
        block21: {
            boolean bl2;
            Object object2;
            Object object3;
            block22: {
                Object object4;
                Object object5 = fg_0.a;
                boolean bl3 = ch2.b();
                Object object6 = am.aX;
                boolean bl4 = false;
                fo_0 fo_02 = object5;
                boolean bl5 = false;
                if (bl3) {
                    fo_0 fo_03 = fo_02;
                    boolean bl6 = false;
                    fo_03.a(object6);
                    throw new as();
                }
                String string = (String)lo_0.a((Object[])f72.e, 2);
                if (string == null) {
                    fg_0.a.a(am.bl);
                    throw new as();
                }
                object5 = string;
                Object object7 = fg_0.a;
                object6 = object5;
                bl4 = false;
                byte by2 = jj_0.a.i((String)object6);
                object = am.bl;
                boolean bl7 = false;
                fo_0 fo_04 = object7;
                boolean bl8 = false;
                if (by2 != 0) {
                    fo_0 fo_05 = fo_04;
                    boolean bl9 = false;
                    fo_05.a(object);
                    throw new as();
                }
                object7 = ch2.c((String)object5);
                by2 = jj_0.a.k((String)object5).d();
                Object object8 = object7;
                if ((object8 != null ? ((iA)object8).b() : null) != null) {
                    object4 = object7;
                } else if (by2 == 1) {
                    object4 = new iA((String)object5, (String)object5, null, null, 12, null);
                } else {
                    Object object9 = f72;
                    boolean bl10 = false;
                    if (((q_0)((fg_0)object9).h().a(q_0.class)).f().af()) {
                        object9 = bK.c.b((String)object5);
                        bl10 = false;
                        UUID uUID = ((cM)object9).a();
                        object4 = kR.a(ch2, new iA(((cM)object9).d(), uUID != null ? uUID.toString() : null, null, new Date()), false, 2, null);
                    } else if (by2 == 0) {
                        object4 = kR.a(ch2, new iA((String)object5, h1.a((String)object5), null, null, 12, null), false, 2, null);
                    } else {
                        fg_0.a.a(am.aN);
                        throw new as();
                    }
                }
                object = object4;
                object3 = fg_0.a;
                bl = ((iA)object).b() == null;
                CharSequence charSequence = am.aN;
                boolean bl11 = false;
                object2 = object3;
                bl2 = false;
                if (bl) {
                    fo_0 fo_06 = object2;
                    boolean bl12 = false;
                    fo_06.a(charSequence);
                    throw new as();
                }
                String string2 = ((iA)object).b();
                ew.a((Object)string2);
                object3 = UUID.fromString(string2);
                ew.a(object3);
                bl = kR.a(ch2, (UUID)object3, null, 2, null);
                charSequence = f72.e[1];
                switch (((String)charSequence).hashCode()) {
                    case 96417: {
                        if (((String)charSequence).equals(d[2])) break;
                        return iv_0.a;
                    }
                    case 94627080: {
                        if (!((String)charSequence).equals(d[3])) {
                            return iv_0.a;
                        }
                        break block21;
                    }
                    case -934610812: {
                        if (!((String)charSequence).equals(d[4])) {
                            return iv_0.a;
                        }
                        break block22;
                    }
                }
                fo_0 fo_07 = fg_0.a;
                object2 = kR.a(ch2, (CharSequence)am.cD, (iA)object, false, 2, null);
                bl2 = false;
                fo_0 fo_08 = fo_07;
                boolean bl13 = false;
                if (bl) {
                    fo_0 fo_09 = fo_08;
                    boolean bl14 = false;
                    fo_09.a(object2);
                    throw new as();
                }
                kR.a(ch2, (UUID)object3, 0, 2, null);
                aa_0.a((fg_0)f72, kR.a(ch2, (CharSequence)am.cK, (iA)object, false, 2, null));
                return iv_0.a;
            }
            fo_0 fo_010 = fg_0.a;
            object2 = kR.a(ch2, (CharSequence)am.bg, (iA)object, false, 2, null);
            bl2 = false;
            fo_0 fo_011 = fo_010;
            boolean bl15 = !bl;
            boolean bl16 = false;
            if (bl15) {
                fo_0 fo_012 = fo_011;
                boolean bl17 = false;
                fo_012.a(object2);
                throw new as();
            }
            ch2.a((UUID)object3);
            aa_0.a((fg_0)f72, kR.a(ch2, (CharSequence)am.cA, (iA)object, false, 2, null));
            return iv_0.a;
        }
        am am2 = am.c(d[5] + bl);
        fg_0 fg_02 = f72;
        ew.a(am2);
        aa_0.a(fg_02, kR.a(ch2, (CharSequence)am2, (iA)object, false, 2, null));
        return iv_0.a;
    }

    private static final void a() {
        d = new String[]{hl.a("\ue65d\ue658\ue645\ue654\ue653\ue650\ue65f\ue642\ue61f\ue650\ue655\ue65c\ue658\ue65f", -841554383), hl.a("\u10de\u10db\u10c6\u10d7\u10d0\u10d3\u10dc\u10c1\u109c\u10d3\u10de\u10de\u10dd\u10c5", -1830940494), hl.a("\u80d2\u80d7\u80d7", 1050706099), hl.a("\ued23\ued28\ued25\ued23\ued2b", 242478400), hl.a("\u66b0\u66a7\u66af\u66ad\u66b4\u66a7", 1029334722), hl.a("\u2901\u290c\u290c\u290f\u2917\u291f\u2903\u2908\u2905\u2903\u290b\u291f", -1615451840)};
    }

    static {
        f7.a();
    }
}

