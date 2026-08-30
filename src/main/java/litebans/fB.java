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
public static abstract class fB
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
        return new String[0];
    }

    @Override
    public String getPermission() {
        return g[0] + this.getName();
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
                    String string2 = g[1];
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
                String string3 = bF.a((CharSequence)bF.a((CharSequence)String.valueOf(bi2.a()), (CharSequence)g[2], () -> fB.a(stringArray)), (CharSequence)g[3], () -> fB.a(string));
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
            throw new UnsupportedOperationException(g[4]);
        }
        if ((n & 2) != 0) {
            e02 = () -> fB.a(fB2);
        }
        fB2.a(stringArray, e02);
    }

    private static final Object a(String[] stringArray) {
        return lo_0.a(stringArray, (CharSequence)g[5], null, null, 0, null, null, 62, null);
    }

    private static final Object a(String string) {
        return '/' + string;
    }

    private static final am a(fB fB2) {
        return am.c(fB2.h + g[6]);
    }

    static {
        fB.c();
        d = new et(null);
    }

    private static final void c() {
        g = new String[]{hl.a("\ubcf1\ubcf4\ubce9\ubcf8\ubcff\ubcfc\ubcf3\ubcee\ubcb3", 1641069725), hl.a("\u6b8d\u6b88\u6b95\u6b84\u6b83\u6b80\u6b8f\u6b92\u6bcf\u6b82\u6b8e\u6b8e\u6b8d\u6b85\u6b8e\u6b96\u6b8f\u6bcf\u6b83\u6b98\u6b91\u6b80\u6b92\u6b92", -578262047), hl.a("\u42fd\u42f1\u42f3\u42f3\u42ff\u42f0\u42fa\u42df\u42ec\u42f9\u42ed", 1317094046), hl.a("\u9a4a\u9a46\u9a44\u9a44\u9a48\u9a47\u9a4d", 697735721), hl.a("", -2089153791), hl.a("\u0fab", -2047930485), hl.a("\u1863\u1869\u186f\u187d\u187b\u1879", 1739331644)};
    }
}

