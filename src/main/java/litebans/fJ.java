package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import litebans.aa_0;
import litebans.am;
import litebans.bt_0;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.fB;
import litebans.fW;
import litebans.fg_0;
import litebans.h1;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class fJ
extends fB {
    private static /* synthetic */ String[] i;

    public fJ(@NotNull di_0 di_02) {
        super(i[0], di_02);
    }

    @Override
    public boolean a() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block9: {
            Object object = this.h().q();
            boolean bl = false;
            Object object2 = object;
            Object object3 = new ArrayList();
            boolean bl2 = false;
            for (Object object4 : object2) {
                jv_0 jv_03 = (jv_0)object4;
                boolean bl3 = false;
                if (!(!ew.a((Object)jv_03, jv_02))) continue;
                object3.add(object4);
            }
            List list = (List)object3;
            object = this;
            bl = false;
            object = (w)((fg_0)object).h().a(w.class);
            bl = false;
            try {
                object2 = ((w)object).f();
                object3 = (Closeable)object2;
                Throwable throwable = null;
                try {
                    Object object4;
                    Object object5 = (ch)object3;
                    int n = 0;
                    object4 = object2;
                    boolean bl4 = false;
                    CharSequence charSequence = object4.a((CharSequence)am.b0.a(i[1], (Object)list.size()));
                    aa_0.a((fg_0)this, charSequence);
                    Iterable iterable = list;
                    boolean bl5 = false;
                    for (Object t2 : iterable) {
                        jv_0 jv_04 = (jv_0)t2;
                        boolean bl6 = false;
                        fW fW2 = new fW(jv_04.i(), (ch)object4, null, false, 0, 28, null).i();
                        fg_0 fg_02 = fW2;
                        boolean bl7 = false;
                        if (!(!((fW)fg_02).e())) continue;
                        fg_02 = this;
                        bl7 = false;
                        fg_0 fg_03 = fg_02;
                        boolean bl8 = false;
                        if (fW2.m() < ((q_0)fg_03.h().a(q_0.class)).f().b()) continue;
                        fg_02 = new CharSequence[]{i[2], fW2.c()};
                        aa_0.a((fg_0)this, (CharSequence)h1.a(object4.a((CharSequence)am.a4, jv_04), (CharSequence[])fg_02));
                    }
                    object5 = iv_0.a;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    bt_0.a((Closeable)object3, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object).b(sQLException)) break block9;
                throw sQLException;
            }
        }
    }

    private static final void a() {
        i = new String[]{hl.a("\u6634\u662d\u662f\u6638\u662d\u6632\u662f\u6629", -1866111395), hl.a("\u737a\u7361\u7379", -358321388), hl.a("\uf0cd\uf0da\uf0cc\uf0ca\uf0d3\uf0cb", 1259139263)};
    }

    static {
        fJ.a();
    }
}

