package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import litebans.bt_0;
import litebans.ch;
import litebans.hl;
import litebans.iv_0;
import litebans.n_0;
import litebans.w;

public static final class dF
implements Runnable {
    final /* synthetic */ w a;
    private static /* synthetic */ String[] b;

    public dF(w w2) {
        this.a = w2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        n_0 n_02;
        block7: {
            w w2;
            n_02 = w2 = this.a;
            boolean bl = false;
            try {
                ch ch2 = n_02.f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object = (ch)closeable;
                    boolean bl2 = false;
                    ch ch3 = ch2;
                    boolean bl3 = false;
                    w2.a(ch3, true);
                    object = iv_0.a;
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
                if (n_02.b(sQLException)) break block7;
                throw sQLException;
            }
        }
        n_02 = this.a;
        String string = b[0];
        boolean bl = false;
        n_02.a.getLogger().severe(string);
    }

    private static final void a() {
        b = new String[]{hl.a("\uf111\uf127\uf130\uf134\uf127\uf130\uf162\uf12b\uf12c\uf124\uf12d\uf130\uf12f\uf123\uf136\uf12b\uf12d\uf12c\uf162\uf130\uf127\uf131\uf127\uf136\uf162\uf121\uf12d\uf12f\uf132\uf12e\uf127\uf136\uf127\uf16c", -1576734398)};
    }

    static {
        dF.a();
    }
}

