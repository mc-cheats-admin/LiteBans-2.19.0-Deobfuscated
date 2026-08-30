package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.List;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bF;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.di_0;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.kq_0;
import litebans.lo_0;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fX
extends fB {
    private static /* synthetic */ String[] i;

    public fX(@NotNull di_0 di_02) {
        super("iphistory", di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block11: {
            Object object = fg_0.a;
            fg_0 fg_02 = this;
            boolean bl = false;
            fg_0 fg_03 = fg_02;
            boolean bl2 = false;
            boolean bl3 = ((q_0)fg_03.h().a(q_0.class)).f().an() && !jv_02.f();
            CharSequence charSequence = am.b;
            boolean bl4 = false;
            Object object2 = object;
            boolean bl5 = false;
            if (bl3) {
                fo_0 fo_02 = object2;
                boolean bl6 = false;
                fo_02.a(charSequence);
                throw new as();
            }
            fg_0 fg_04 = this;
            boolean bl7 = false;
            object = aa_0.a(fg_04, (String)lo_0.b(stringArray));
            int n = 0;
            n = kq_0.a(stringArray, 1, 10);
            Object object3 = this;
            bl4 = false;
            object3 = (w)((fg_0)object3).h().a(w.class);
            bl4 = false;
            try {
                object2 = ((w)object3).f();
                Closeable closeable = (Closeable)object2;
                Throwable throwable = null;
                try {
                    Object object4 = (ch)closeable;
                    boolean bl8 = false;
                    Object object5 = object2;
                    boolean bl9 = false;
                    List list = object5.a((String)object);
                    fo_0 fo_03 = fg_0.a;
                    int n2 = list.isEmpty();
                    Object object6 = am.M.a("target", object);
                    boolean bl10 = false;
                    fo_0 fo_04 = fo_03;
                    boolean bl11 = false;
                    if (n2 != 0) {
                        fo_0 fo_05 = fo_04;
                        boolean bl12 = false;
                        fo_05.a(object6);
                        throw new as();
                    }
                    aa_0.a((fg_0)this, object5.a((CharSequence)bF.a((CharSequence)am.bX.a("target", object), (CharSequence)"limit", n)));
                    n = Math.min(n, list.size());
                    n2 = n;
                    for (int i = 0; i < n2; ++i) {
                        String string;
                        object6 = (iA)list.get(i);
                        if (((iA)object6).i() == null) continue;
                        if (bz.a((CharSequence)string, '#', false, 2, null)) {
                            if (n >= list.size()) continue;
                            ++n;
                            continue;
                        }
                        aa_0.a((fg_0)this, (CharSequence)bF.a(kR.a((ch)object5, (CharSequence)am.ac.a("ip", (Object)string), (iA)object6, false, 2, null), (CharSequence)"date", () -> fX.a(this, (iA)object6)));
                    }
                    object4 = iv_0.a;
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
                if (((w)object3).b(sQLException)) break block11;
                throw sQLException;
            }
        }
    }

    private static final Object a(fX fX2, iA iA2) {
        fg_0 fg_02 = fX2;
        boolean bl = false;
        return ((o)fg_02.h().a(o.class)).a(iA2.f().getTime(), true);
    }

    private static final void a() {
        i = new String[]{"iphistory", "target", "target", "limit", "ip", "date"};
    }

    static {
        fX.a();
    }
}

