package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import litebans.aa_0;
import litebans.am;
import litebans.bF;
import litebans.bt_0;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.fB;
import litebans.fW;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.kq_0;
import litebans.lo_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class f4
extends fB {
    private static /* synthetic */ String[] i;

    public f4(@NotNull di_0 di_02) {
        super("dupeip", di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void a(@NotNull jv_0 var1_1, @NotNull String[] var2_2) {
        block9: {
            var4_3 = this;
            var5_5 = false;
            var3_7 = aa_0.a(var4_3, (String)lo_0.b(var2_2));
            var5_6 = this;
            var6_8 = false;
            var7_9 = var5_6;
            var8_11 = false;
            var4_4 = kq_0.a(var2_2, 1, ((q_0)var7_9.h().a(q_0.class)).f().y());
            var5_6 = this;
            var6_8 = false;
            var5_6 = (w)var5_6.h().a(w.class);
            var6_8 = false;
            try {
                var7_9 = var5_6.f();
                var8_12 = (Closeable)var7_9;
                var9_13 = null;
                try {
                    block10: {
                        block11: {
                            var10_14 = (ch)var8_12;
                            var11_15 = false;
                            var12_18 = var7_9;
                            var13_19 = false;
                            var14_20 = new fW(var3_7, (ch)var12_18, var1_1, false, var4_4).i();
                            if (var14_20.e()) break block10;
                            if (var1_1.f()) break block11;
                            var15_21 = this;
                            var16_22 = false;
                            var17_25 = var15_21;
                            var18_27 = false;
                            if (((q_0)var17_25.h().a(q_0.class)).f().O()) ** GOTO lbl-1000
                        }
                        var15_21 = var1_1;
                        var16_23 = "litebans.dupeip.viewip";
                        var17_26 = false;
                        var18_28 = var15_21;
                        var19_29 = false;
                        if (var18_28.e(var16_23) == false) lbl-1000:
                        // 2 sources

                        {
                            v0 = true;
                        } else {
                            v0 = false;
                        }
                        var20_30 = v0;
                        var15_21 = var14_20.f() != false ? am.cR.a("num", (Object)var14_20.k()) : var14_20.j();
                        var16_24 = var20_30 != false ? (CharSequence)am.P : (CharSequence)am.G;
                        v1 = bF.a(var16_24, (CharSequence)"ip", var15_21);
                        v2 = var14_20.l();
                        ew.a(v2);
                        var16_24 = kR.a((ch)var12_18, v1, v2, false, 2, null);
                        fo_0.a(fg_0.a, var1_1, var16_24, null, 4, null);
                        fo_0.a(fg_0.a, var1_1, var14_20.c(), null, 4, null);
                        fo_0.a(fg_0.a, var1_1, am.dr, null, 4, null);
                    }
                    var10_14 = iv_0.a;
                }
                catch (Throwable var11_16) {
                    var9_13 = var11_16;
                    throw var11_16;
                }
                finally {
                    bt_0.a(var8_12, var9_13);
                }
            }
            catch (SQLException var7_10) {
                if (var5_6.b(var7_10)) break block9;
                throw var7_10;
            }
        }
    }

    private static final void a() {
        i = new String[]{"dupeip", "litebans.dupeip.viewip", "num", "ip"};
    }

    static {
        f4.a();
    }
}

