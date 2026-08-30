package litebans;

import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bF;
import litebans.bi;
import litebans.d8;
import litebans.di_0;
import litebans.e0;
import litebans.et;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gy_0;
import litebans.hl;
import litebans.jv_0;
import litebans.lo_0;
import litebans.v;
import litebans.w;
import org.jetbrains.annotations.NotNull;

@gy_0
public abstract class fB
extends fg_0
implements d8 {
    public static final et d;
    private final String h;
    private final boolean e;
    private final boolean f;
    private static /* synthetic */ String[] g;

    public fB(@NotNull String string, @NotNull di_0 di_02) {
        super(di_02);
        this.h = string;
        this.e = true;
        this.f = true;
    }

    public boolean b() {
        return this.e;
    }

    public boolean a() {
        return this.f;
    }

    @Override
    public String getName() {
        return this.h;
    }

    @Override
    public String[] getAliases() {
        return new Strin"";
    }

    @Override
    public String getPermission() {
        return "" + this.getName();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray, @NotNull String string) {
        fo_0 fo_02 = fg_0.a;
        jv_0 jv_03 = jv_02;
        boolean bl = false;
        try {
            fo_02.b().set(jv_03);
            boolean bl2 = false;
            v v2 = (v)this.h().a(v.class);
            boolean bl3 = false;
            try {
                if (this.a()) {
                    fB.a(this, stringArray, null, 2, null);
                }
                if (jv_02.e() && v2.a((byte)3, jv_02.a())) {
                    jv_0 jv_04 = jv_02;
                    String string2 = "litebans.cooldown.bypass";
                    boolean bl4 = false;
                    jv_0 jv_05 = jv_04;
                    boolean bl5 = false;
                    if (!jv_05.e(string2)) {
                        bl3 = true;
                    }
                }
                if (!bl3) {
                    this.a(jv_02, stringArray);
                }
            }
            catch (bi bi2) {
                String string3 = bF.a((CharSequence)bF.a((CharSequence)String.valueOf(bi2.a()), (CharSequence)"commandArgs", () -> fB.a(stringArray)), (CharSequence)"command", () -> fB.a(string));
                aa_0.a((fg_0)this, (CharSequence)string3);
            }
            catch (Exception exception) {
                aa_0.a((fg_0)this, am.c6);
                fg_0 fg_02 = this;
                boolean bl6 = false;
                ((w)fg_02.h().a(w.class)).a(exception);
            }
            finally {
                if (jv_02.e() && !bl3) {
                    v2.b((byte)3, jv_02.a());
                }
            }
        }
        finally {
            fo_02.b().remove();
        }
    }

    public void a(@NotNull String[] stringArray, @NotNull e0 e02) {
        fo_0 fo_02 = fg_0.a;
        boolean bl = stringArray.length == 0;
        boolean bl2 = false;
        if (bl) {
            fo_02.a(e02.a());
            throw new as();
        }
    }

    public static /* synthetic */ void a(fB fB2, String[] stringArray, e0 e02, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            e02 = () -> fB.a(fB2);
        }
        fB2.a(stringArray, e02);
    }

    private static final Object a(String[] stringArray) {
        return lo_0.a(stringArray, (CharSequence)" ", null, null, 0, null, null, 62, null);
    }

    private static final Object a(String string) {
        return '/' + string;
    }

    private static final am a(fB fB2) {
        return am.c(fB2.h + "_USAGE");
    }

    static {
        fB.c();
        d = new et(null);
    }

    private static final void c() {
        g = new String[]{"", "litebans.cooldown.bypass", "commandArgs", "command", "", " ", "_USAGE"};
    }
}

