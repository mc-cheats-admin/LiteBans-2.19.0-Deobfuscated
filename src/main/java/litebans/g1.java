package litebans;

import litebans.aJ;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bF;
import litebans.br_0;
import litebans.ch;
import litebans.cz;
import litebans.dZ;
import litebans.di_0;
import litebans.ew;
import litebans.fg_0;
import litebans.hl;
import litebans.i3;
import litebans.iA;
import litebans.ij;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.o;
import litebans.q_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g1
extends fg_0 {
    private final cz f;
    private final jv_0 h;
    private final iA d;
    private final CharSequence j;
    private final jv_0 g;
    private final boolean k;
    private final boolean i;
    private static /* synthetic */ String[] e;

    public g1(@NotNull cz cz2, @Nullable jv_0 jv_02, @Nullable iA iA2, @NotNull CharSequence charSequence, @NotNull di_0 di_02, @Nullable jv_0 jv_03, boolean bl, boolean bl2) {
        super(di_02);
        this.f = cz2;
        this.h = jv_02;
        this.d = iA2;
        this.j = charSequence;
        this.g = jv_03;
        this.k = bl;
        this.i = bl2;
    }

    public /* synthetic */ g1(cz cz2, jv_0 jv_02, iA iA2, CharSequence charSequence, di_0 di_02, jv_0 jv_03, boolean bl, boolean bl2, int n, aJ aJ2) {
        if ((n & 0x20) != 0) {
            jv_03 = (jv_0)fg_0.a.b().get();
        }
        if ((n & 0x40) != 0) {
            bl = true;
        }
        if ((n & 0x80) != 0) {
            dZ dZ2 = cz2.q();
            ew.a(dZ2);
            bl2 = dZ2.d();
        }
        this(cz2, jv_02, iA2, charSequence, di_02, jv_03, bl, bl2);
    }

    public final cz f() {
        return this.f;
    }

    public final jv_0 b() {
        return this.h;
    }

    public final iA a() {
        return this.d;
    }

    public final jv_0 e() {
        return this.g;
    }

    public final boolean h() {
        return this.k;
    }

    public final boolean g() {
        return this.i;
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> g1.a(this, arg_0));
    }

    private static final iv_0 a(g1 g12, ch ch2) {
        Object object;
        g1 g13 = g12;
        ch ch3 = ch2;
        Object object2 = g12;
        ch ch4 = ch2;
        Object object3 = g12.j;
        boolean bl = false;
        Object object4 = object3;
        if (((g1)object2).g()) {
            object = am.cI;
            boolean bl2 = false;
            object4 = "" + object + object4;
        }
        if (((g1)object2).a() != null) {
            object4 = kR.a(ch4, (CharSequence)object4, ((g1)object2).a(), false, 2, null);
        }
        object4 = bF.a(ch4, (CharSequence)object4, ((g1)object2).f());
        object2 = kR.a(ch4, ch4.a((CharSequence)object4, ((g1)object2).b()), ((g1)object2).f().q(), false, 2, null);
        boolean bl3 = false;
        object3 = g13.f();
        bl = false;
        dZ dZ2 = ((cz)object3).q();
        ew.a(dZ2);
        object4 = dZ2;
        object = g13;
        ch ch5 = ch3;
        boolean bl4 = false;
        ij ij2 = ((g1)object).f().c() ? ij.k : (((g1)object).g() ? ij.o : ij.t);
        object = g13;
        boolean bl5 = false;
        Object object5 = (o)((fg_0)object).h().a(o.class);
        bl4 = false;
        o.a((o)object5, ch3, (CharSequence)object2, ij2.f(), ((dZ)object4).u(), ((dZ)object4).j(), false, false, g13.e(), 48, null);
        aa_0.a(ch3, ij2, (CharSequence)object2, ((dZ)object4).u(), null, 8, null);
        object = g13;
        object5 = ch3;
        bl4 = false;
        cz cz2 = ((g1)object).f();
        boolean bl6 = false;
        dZ dZ3 = cz2.q();
        ew.a(dZ3);
        dZ dZ4 = dZ3;
        CharSequence charSequence = dZ4.u();
        boolean bl7 = false;
        if ((charSequence.c() == a_.j || charSequence.c() == a_.c) && ((g1)object).h() && ((g1)object).b() != null) {
            String string;
            switch (br_0.a[dZ4.u().c().ordinal()]) {
                case 1: {
                    string = "banned";
                    break;
                }
                case 2: {
                    string = "muted";
                    break;
                }
                case 3: {
                    string = "warned";
                    break;
                }
                case 4: {
                    string = "kicked";
                    break;
                }
                default: {
                    x_0.a();
                    throw new as();
                }
            }
            charSequence = string;
            fg_0 fg_02 = (fg_0)object;
            boolean bl8 = false;
            o o2 = (o)fg_02.h().a(o.class);
            boolean bl9 = false;
            o2.a((ch)object5, ((g1)object).b(), dZ4, cz2.D(), (String)charSequence);
        }
        object5 = g13;
        bl4 = false;
        object = ((q_0)((fg_0)object5).h().a(q_0.class)).b().a(((dZ)object4).a(g13.f()));
        if (((CharSequence)object).length() > 0 && (ij2 == ij.t || ij2 == ij.o)) {
            i3.j.a(ch3, g13.f(), (String)object);
        }
        return iv_0.a;
    }

    private static final void c() {
        e = new String[]{"banned", "muted", "warned", "kicked", "banned", "muted", "warned", "kicked", "banned", "muted", "warned", "kicked"};
    }

    static {
        g1.c();
    }
}

