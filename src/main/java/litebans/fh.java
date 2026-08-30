package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import litebans.aa_0;
import litebans.am;
import litebans.bt_0;
import litebans.ch;
import litebans.di_0;
import litebans.fB;
import litebans.fg_0;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.lo_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fh
extends fB {
    private static /* synthetic */ String[] i;

    public fh(@NotNull di_0 di_02) {
        super("lastuuid", di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block7: {
            Object object = this;
            boolean bl = false;
            String string = aa_0.a((fg_0)object, (String)lo_0.b(stringArray));
            object = this;
            bl = false;
            object = (w)((fg_0)object).h().a(w.class);
            bl = false;
            try {
                ch ch2 = ((w)object).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2 = (ch)closeable;
                    boolean bl2 = false;
                    ch ch3 = ch2;
                    boolean bl3 = false;
                    iA iA2 = aa_0.a(ch3, string, false, 2, null);
                    aa_0.a((fg_0)this, kR.a(ch3, (CharSequence)am.bI, iA2, false, 2, null));
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
                if (((w)object).b(sQLException)) break block7;
                throw sQLException;
            }
        }
    }

    private static final void a() {
        i = new String[]{"lastuuid"};
    }

    static {
        fh.a();
    }
}

