package litebans;

import java.io.Closeable;
import java.lang.ref.Reference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import litebans.a7;
import litebans.bP;
import litebans.br;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.f_;
import litebans.fg_0;
import litebans.hl;
import litebans.iv_0;
import litebans.kq_0;
import litebans.q_0;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class ge
extends fg_0
implements Runnable {
    private final AtomicBoolean f = new AtomicBoolean();
    private final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    private static /* synthetic */ String[] e;

    public ge(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final AtomicBoolean c() {
        return this.f;
    }

    public final CopyOnWriteArrayList b() {
        return this.d;
    }

    @Override
    public void run() {
        try {
            int n;
            w w2 = (w)this.h().a(w.class);
            u u2 = (u)this.h().a(u.class);
            Object object = this;
            int n2 = 0;
            object = (q_0)((fg_0)object).h().a(q_0.class);
            n2 = 0;
            if (((q_0)object).g()) {
                Object object2 = object;
                n = 0;
                ((q_0)object2).a((Object)a7.a.a().b());
            }
            object = (br)a7.a.a().a();
            ew.a(w2);
            ew.a(u2);
            this.a(this, (br)object, w2, u2);
            n2 = 100;
            n = 0;
            while (n < n2) {
                int n3 = n++;
                boolean bl = false;
                this.a(this, (br)object, w2, u2);
                Thread.sleep(70L);
            }
        }
        catch (InterruptedException interruptedException) {
            this.d();
        }
        this.f.set(false);
    }

    private final void d() {
        this.d.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(ge ge2, br br2, w w2, u u2) {
        if (!((Collection)ge2.d).isEmpty()) {
            boolean bl;
            Object object;
            Object object2;
            int n;
            block30: {
                boolean bl2;
                boolean bl3;
                Object object3;
                block28: {
                    Object object4 = br2.a();
                    if (object4 == null) {
                        n = 0;
                        byte[][] byArrayArray = new byte[4][];
                        while (n < 4) {
                            int n2 = n++;
                            byArrayArray[n2] = kq_0.a();
                        }
                        object4 = byArrayArray;
                    }
                    byte[][] byArray = object4;
                    br2.a(byArray);
                    object2 = (Object[])byArray;
                    n = 0;
                    for (Object object5 : object2) {
                        object3 = (byte[])object5;
                        bl3 = false;
                        boolean bl4 = ((byte[])object3).length == 0;
                        if (!bl4) continue;
                        bl2 = true;
                        break block28;
                    }
                    bl2 = false;
                }
                if (bl2) {
                    object2 = w2;
                    n = 0;
                    try {
                        Object object5;
                        ch ch2 = ((w)object2).f();
                        Closeable closeable = ch2;
                        object5 = null;
                        try {
                            object3 = (ch)closeable;
                            bl3 = false;
                            ch ch3 = ch2;
                            boolean bl5 = false;
                            if (ch3.a()) {
                                try {
                                    u u3 = u2;
                                    boolean bl6 = false;
                                    ResultSet resultSet = u3.a(ch3);
                                    object = resultSet;
                                    bl = false;
                                    AutoCloseable autoCloseable = (AutoCloseable)object;
                                    Throwable throwable = null;
                                    try {
                                        Object object6 = (ResultSet)autoCloseable;
                                        boolean bl7 = false;
                                        while (object.next()) {
                                            Object object7 = object;
                                            boolean bl8 = false;
                                            byArray[object7.getInt((String)ge.e[0])] = object7.getBytes(e[1]);
                                        }
                                        object6 = iv_0.a;
                                    }
                                    catch (Throwable throwable2) {
                                        throwable = throwable2;
                                        throw throwable2;
                                    }
                                    finally {
                                        f_.a(autoCloseable, throwable);
                                    }
                                }
                                catch (SQLException sQLException) {
                                    w2.a(sQLException);
                                }
                            }
                            object3 = iv_0.a;
                        }
                        catch (Throwable throwable) {
                            try {
                                object5 = throwable;
                                throw throwable;
                            }
                            catch (Throwable throwable3) {
                                bt_0.a(closeable, object5);
                                throw throwable3;
                            }
                        }
                        bt_0.a(closeable, (Throwable)object5);
                    }
                    catch (SQLException sQLException) {
                        if (((w)object2).b(sQLException)) break block30;
                        throw sQLException;
                    }
                }
            }
            try {
                object2 = u2;
                n = 0;
                Iterable iterable = ge2.d;
                boolean bl9 = false;
                for (Object object3 : iterable) {
                    boolean bl10;
                    Byte by2;
                    block31: {
                        by2 = (Byte)object3;
                        boolean bl11 = false;
                        if (by2 < 0) continue;
                        Iterable iterable2 = ((u)object2).j();
                        boolean bl12 = false;
                        if (iterable2 instanceof Collection && ((Collection)iterable2).isEmpty()) {
                            bl10 = true;
                        } else {
                            for (ResultSet resultSet : iterable2) {
                                boolean bl13;
                                object = (Reference)((Object)resultSet);
                                bl = false;
                                bP bP2 = (bP)((Reference)object).get();
                                if (bP2 != null) {
                                    byte by3 = bP2.b();
                                    bl13 = by2 == by3;
                                } else {
                                    bl13 = false;
                                }
                                if (!bl13) continue;
                                bl10 = false;
                                break block31;
                            }
                            bl10 = true;
                        }
                    }
                    if (!bl10) continue;
                    ((u)object2).a(by2.byteValue(), br2);
                }
                ((u)object2).a(br2);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                ge2.a(indexOutOfBoundsException, br2, u2);
            }
            ge2.d();
        }
    }

    private final void a(Exception exception, br br2, u u2) {
        char[] cArray;
        Object object;
        this.h().getLogger().warning(e[2] + ((object = exception.getMessage()) != null && (object = bz.a((CharSequence)object, cArray = new char[]{' '}, false, 0, 6, null)) != null ? (String)object.get(1) : null) + ')');
        br2.a((byte[][])null);
        u2.a(0);
        Object object2 = this;
        boolean bl = false;
        object2 = (q_0)((fg_0)object2).h().a(q_0.class);
        bl = false;
        if (((q_0)object2).g()) {
            ((q_0)object2).a((Object)exception);
        }
        Thread.sleep(1000L);
    }

    private static final void a() {
        e = new String[]{hl.a("\ub4b4\ub4b9", 347714781), hl.a("\uf396", 1270543348), hl.a("\u2f8e\u2fac\u2fae\u2fa5\u2fa8\u2fed\u2fa9\u2fa8\u2fbe\u2fb4\u2fa3\u2fae\u2fe1\u2fed\u2fbf\u2fa8\u2fa1\u2fa2\u2fac\u2fa9\u2fa4\u2fa3\u2faa\u2fe3\u2fed\u2fe5\u2fa8\u2fbf\u2fbf\u2fa2\u2fbf\u2fed", 1060581325)};
    }

    static {
        ge.a();
    }
}

