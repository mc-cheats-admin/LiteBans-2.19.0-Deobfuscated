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

public final class gG
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
                var16_23 = "litebans.lockdown.bypass";
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
        il_0.a(this.h().i(), object, string, null, bl, "KICK_OTHER", 4, null);
    }

    public static /* synthetic */ void a(gG gG2, Object object, String string, boolean bl, int n, Object object2) {
        if ((n & 2) != 0) {
            string = "";
        }
        if ((n & 4) != 0) {
            bl = true;
        }
        gG2.a(object, string, bl);
    }

    public final String a(@NotNull String string, boolean bl) {
        CharSequence charSequence = bl ? am.dw : am.av;
        CharSequence[] charSequenceArray = new CharSequence[4];
        charSequenceArray[0] = "reason";
        CharSequence charSequence2 = this.h;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        charSequenceArray[1] = charSequence2;
        charSequenceArray[2] = "server";
        charSequenceArray[3] = string;
        return am.a(h1.a(charSequence, charSequenceArray), true);
    }

    @Override
    public String getName() {
        return "lockdown";
    }

    private static final void b() {
        g = new String[]{"litebans.lockdown.bypass", "KICK_OTHER", "", "reason", "", "server", "litebans.lockdown.bypass", "litebans.lockdown.bypass", "lockdown"};
    }

    static {
        gG.b();
    }
}

