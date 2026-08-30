package litebans;

import java.util.ArrayList;
import java.util.List;
import litebans.am;
import litebans.di_0;
import litebans.em_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.h1;
import litebans.hl;
import litebans.iS;
import litebans.il_0;
import litebans.jv_0;
import litebans.jw_0;
import litebans.o;
import litebans.p_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class gG
extends fg_0
implements jw_0 {
    private final CharSequence h;
    private final String f;
    private final boolean d;
    private em_0 e;
    private static /* synthetic */ String[] g;

    public gG(@NotNull di_0 di_02, @Nullable CharSequence charSequence, @NotNull String string, boolean bl) {
        super(di_02);
        this.h = charSequence;
        this.f = string;
        this.d = bl;
    }

    public final CharSequence c() {
        return this.h;
    }

    public final String a() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block10: {
            var1_1 = this;
            var2_2 = false;
            if (var1_1.h != null && var1_1.h().t() != 3) {
                var3_3 = var1_1;
                var4_4 = false;
                var5_7 = (p_0)var3_3.h().b(p_0.class);
                v0 = var1_1.e = var5_7.a((jw_0)var3_3);
                if (v0 != null) {
                    v0.a();
                }
            }
            var1_1 = this;
            var2_2 = false;
            if (var1_1.h == null) break block10;
            var3_3 = var1_1.a(var1_1.f, false);
            var4_5 = var1_1.h().q();
            var5_8 = false;
            var6_10 = var4_5;
            var7_11 = new ArrayList<E>();
            var8_12 = false;
            for (Object var11_17 : var6_10) {
                block11: {
                    var12_19 = (jv_0)var11_17;
                    var13_20 = false;
                    var14_21 = var1_1;
                    var15_22 = false;
                    v1 = var12_19.h();
                    if (v1 == null) {
                        var16_23 = var14_21;
                        var17_25 = false;
                        var18_27 = var16_23;
                        var19_29 = false;
                        v1 = ((q_0)var18_27.h().a(q_0.class)).f().aw();
                    }
                    if (eq_0.f.a(v1, var14_21.f)) break block11;
                    if (var14_21.h().t() == 0) ** GOTO lbl-1000
                    var20_30 = var14_21;
                    var16_24 = false;
                    var17_26 = var20_30;
                    var18_28 = false;
                    if (!eq_0.f.a(((q_0)var17_26.h().a(q_0.class)).f().aw(), var14_21.f)) ** GOTO lbl-1000
                }
                var20_30 = var12_19;
                var16_23 = gG.g[0];
                var17_25 = false;
                var18_27 = var20_30;
                var19_29 = false;
                if (var18_27.e((String)var16_23) == false) {
                    v2 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v2 = false;
                }
                if (!v2) continue;
                var7_11.add(var11_17);
            }
            var4_5 = (List)var7_11;
            var5_8 = false;
            var6_10 = var4_5.iterator();
            while (var6_10.hasNext()) {
                var7_11 = var6_10.next();
                var8_13 = (jv_0)var7_11;
                var9_14 = 0;
                var10_16 = var1_1;
                var11_18 = false;
                v3 = (o)var10_16.h().a(o.class);
                ew.a(var8_13);
                v3.a(var8_13, (String)var3_3);
            }
        }
        var1_1 = this;
        var2_2 = false;
        if (var1_1.d) {
            var3_3 = var1_1;
            var4_4 = false;
            if (((w)var3_3.h().a(w.class)).m()) {
                v4 = (jv_0)fg_0.a.b().get();
                if (v4 == null) {
                    v4 = var1_1.h().y();
                }
                var3_3 = v4;
                var4_6 = var1_1;
                var5_9 = false;
                ((w)var4_6.h().a(w.class)).a(new iS(var1_1, (jv_0)var3_3));
            }
        }
    }

    @Override
    public void i() {
        this.h().c(this);
    }

    @Override
    public void f() {
        gG gG2 = this;
        boolean bl = false;
        em_0 em_02 = gG2.e;
        if (em_02 != null) {
            em_0[] em_0Array = new em_0[]{em_02};
            gG2.h().a(em_0Array);
        }
    }

    public final void a(@NotNull Object object, @NotNull String string, boolean bl) {
        il_0.a(this.h().i(), object, string, null, bl, g[1], 4, null);
    }

    public static /* synthetic */ void a(gG gG2, Object object, String string, boolean bl, int n, Object object2) {
        if ((n & 2) != 0) {
            string = g[2];
        }
        if ((n & 4) != 0) {
            bl = true;
        }
        gG2.a(object, string, bl);
    }

    public final String a(@NotNull String string, boolean bl) {
        CharSequence charSequence = bl ? am.dw : am.av;
        CharSequence[] charSequenceArray = new CharSequence[4];
        charSequenceArray[0] = g[3];
        CharSequence charSequence2 = this.h;
        if (charSequence2 == null) {
            charSequence2 = g[4];
        }
        charSequenceArray[1] = charSequence2;
        charSequenceArray[2] = g[5];
        charSequenceArray[3] = string;
        return am.a(h1.a(charSequence, charSequenceArray), true);
    }

    @Override
    public String getName() {
        return g[8];
    }

    private static final void b() {
        g = new String[]{hl.a("\ue4ae\ue4ab\ue4b6\ue4a7\ue4a0\ue4a3\ue4ac\ue4b1\ue4ec\ue4ae\ue4ad\ue4a1\ue4a9\ue4a6\ue4ad\ue4b5\ue4ac\ue4ec\ue4a0\ue4bb\ue4b2\ue4a3\ue4b1\ue4b1", -1852775230), hl.a("\u7ae2\u7ae0\u7aea\u7ae2\u7af6\u7ae6\u7afd\u7ae1\u7aec\u7afb", -1624474967), hl.a("", -846361673), hl.a("\u68e2\u68f5\u68f1\u68e3\u68ff\u68fe", -1490327408), hl.a("", -2118083180), hl.a("\u08fd\u08eb\u08fc\u08f8\u08eb\u08fc", 707070094), hl.a("\u7941\u7944\u7959\u7948\u794f\u794c\u7943\u795e\u7903\u7941\u7942\u794e\u7946\u7949\u7942\u795a\u7943\u7903\u794f\u7954\u795d\u794c\u795e\u795e", -1393460947), hl.a("\u7f94\u7f91\u7f8c\u7f9d\u7f9a\u7f99\u7f96\u7f8b\u7fd6\u7f94\u7f97\u7f9b\u7f93\u7f9c\u7f97\u7f8f\u7f96\u7fd6\u7f9a\u7f81\u7f88\u7f99\u7f8b\u7f8b", 2032893944), hl.a("\uf34d\uf34e\uf342\uf34a\uf345\uf34e\uf356\uf34f", 10089249)};
    }

    static {
        gG.b();
    }
}

