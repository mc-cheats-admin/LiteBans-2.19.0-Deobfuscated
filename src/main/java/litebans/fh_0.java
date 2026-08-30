package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.bF;
import litebans.bt_0;
import litebans.ch;
import litebans.di_0;
import litebans.fB;
import litebans.fg_0;
import litebans.g3;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jW;
import litebans.jv_0;
import litebans.kR;
import litebans.kq_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fh_0
extends fB
implements jW {
    private static /* synthetic */ String[] i;

    public fh_0(@NotNull di_0 di_02) {
        super("banlist", di_02);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public CharSequence a() {
        return "";
    }

    @Override
    public a_ a() {
        return a_.h;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block8: {
            Object object = this;
            boolean bl = false;
            object = (w)((fg_0)object).h().a(w.class);
            bl = false;
            try {
                ch ch2 = ((w)object).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    double d10;
                    Object object2 = (ch)closeable;
                    boolean bl2 = false;
                    ch ch3 = ch2;
                    boolean bl3 = false;
                    fg_0 fg_02 = this;
                    boolean bl4 = false;
                    fg_0 fg_03 = fg_02;
                    boolean bl5 = false;
                    double d11 = kR.a(ch3, ((a_)this.a()).a(), null, ((q_0)fg_03.h().a(q_0.class)).f().aA(), 2, null);
                    fg_03 = this;
                    bl5 = false;
                    fg_0 fg_04 = fg_03;
                    boolean bl6 = false;
                    double d12 = ((q_0)fg_04.h().a(q_0.class)).f().aZ();
                    double d13 = d10 = Math.floor(d11 / d12);
                    double d14 = kq_0.a(stringArray, 0, d10);
                    d14 = Math.min(d10, d14);
                    if (d14 > 0.0 && d14 == d10 && (int)d11 % (int)d12 == 0) {
                        d14 += -1.0;
                        d13 += -1.0;
                    }
                    aa_0.a((fg_0)this, (CharSequence)bF.a((CharSequence)bF.a(ch3.a(am.b4), (CharSequence)"page", (int)d14), (CharSequence)"total", (int)d13));
                    fg_0 fg_05 = this;
                    boolean bl7 = false;
                    Collection collection = ch3.a((a_)this.a(), (long)d14, (long)d12, ((q_0)fg_05.h().a(q_0.class)).f().aA());
                    g3.a(this, ch3, collection, null, null, null, 0, 30, null);
                    object2 = iv_0.a;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    bt_0.a(closeable, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object).b(sQLException)) break block8;
                throw sQLException;
            }
        }
    }

    @Override
    public int a(@NotNull di_0 di_02, @Nullable String[] stringArray, @NotNull Collection collection, int n) {
        return g3.a(this, di_02, stringArray, collection, n);
    }

    @Override
    public void a(@NotNull ch ch2, @NotNull Collection collection, @Nullable iA iA2, @Nullable String[] stringArray, @NotNull fB fB2, int n) {
        g3.a((jW)this, ch2, collection, iA2, stringArray, fB2, n);
    }

    @Override
    public iA a(@NotNull ch ch2, @NotNull HashMap hashMap, @Nullable String string) {
        return g3.a(this, ch2, hashMap, string);
    }

    private static final void b() {
        i = new String[]{"banlist", "", "page", "total"};
    }

    static {
        fh_0.b();
    }
}

