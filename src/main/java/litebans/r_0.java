package litebans;

import java.io.Closeable;
import java.lang.ref.Reference;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import litebans.bN;
import litebans.bt_0;
import litebans.ch;
import litebans.dZ;
import litebans.dc;
import litebans.di_0;
import litebans.eE;
import litebans.eo_0;
import litebans.ew;
import litebans.gu;
import litebans.gx_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.n_0;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class r_0
extends n_0
implements Runnable {
    public static final dc c;
    private final eE e = bN.a(() -> r_0.a(this));
    public static final long d;
    private static /* synthetic */ String[] b;

    public r_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final w a() {
        eE eE2 = this.e;
        return (w)eE2.a();
    }

    @Override
    public void e() {
        this.a.b(this, 48000L, 48000L);
    }

    @Override
    public void b() {
        this.c();
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block7: {
            w w2 = this.a();
            boolean bl = false;
            try {
                ch ch2 = w2.f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object = (ch)closeable;
                    boolean bl2 = false;
                    ch ch3 = ch2;
                    boolean bl3 = false;
                    this.a(ch3);
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
                if (w2.b(sQLException)) break block7;
                throw sQLException;
            }
        }
    }

    public final void a(@NotNull ch ch2) {
        q_0 q_02 = (q_0)ch2.e().a(q_0.class);
        p p2 = (p)ch2.e().a(p.class);
        u u2 = (u)ch2.e().a(u.class);
        jv_0[] jv_0Array = ch2.e().q();
        ew.a(jv_0Array);
        if (jv_0Array.length == 0) {
            if (q_02.f().p()) {
                p2.a().b().clear();
            }
            if (ch2.e().t() == 1) {
                this.b(ch2);
            }
        } else {
            if (q_02.f().p()) {
                p2.a().b().values().removeIf(arg_0 -> r_0.a(arg_0 -> r_0.a(this, ch2, jv_0Array, arg_0), arg_0));
            }
            if (ch2.e().t() == 1) {
                this.a(ch2, jv_0Array);
            }
        }
        byte by2 = u2.c();
        u2.a((byte)(by2 + 1));
        if (u2.j().size() > 8) {
            Iterable iterable = u2.j();
            boolean bl = false;
            Iterable iterable2 = iterable;
            Collection collection = new ArrayList();
            boolean bl2 = false;
            for (Object t2 : iterable2) {
                Reference reference = (Reference)t2;
                boolean bl3 = false;
                if (!(reference.get() != null)) continue;
                collection.add(t2);
            }
            List list = (List)collection;
            if (list.isEmpty()) {
                u2.j().clear();
            } else {
                u2.a(new CopyOnWriteArrayList(list));
            }
        }
    }

    private final void b(ch ch2) {
        o o2 = (o)ch2.e().a(o.class);
        gu gu2 = o2.c();
        ew.b(gu2, "");
        gx_0 gx_02 = (gx_0)gu2;
        gx_02.b().clear();
        gx_02.a().clear();
    }

    private final void a(ch ch2, jv_0[] jv_0Array) {
        o o2 = (o)ch2.e().a(o.class);
        gu gu2 = o2.c();
        ew.b(gu2, "");
        gx_0 gx_02 = (gx_0)gu2;
        gx_02.b().values().removeIf(arg_0 -> r_0.c(arg_0 -> r_0.a(this, ch2, jv_0Array, arg_0), arg_0));
        if (gx_02.b().isEmpty()) {
            gx_02.a().clear();
        } else {
            ((ConcurrentHashMap.KeySetView)gx_02.a().keySet()).removeIf(arg_0 -> r_0.b(arg_0 -> r_0.a(gx_02, arg_0), arg_0));
        }
    }

    public final boolean a(@NotNull ch ch2, @NotNull jv_0[] jv_0Array, @NotNull dZ dZ2) {
        boolean bl;
        block1: {
            jv_0[] jv_0Array2 = jv_0Array;
            boolean bl2 = false;
            int n = jv_0Array2.length;
            for (int i = 0; i < n; ++i) {
                jv_0 jv_02;
                jv_0 jv_03 = jv_02 = jv_0Array2[i];
                boolean bl3 = false;
                if (!ch2.a(dZ2, jv_03)) continue;
                bl = false;
                break block1;
            }
            bl = true;
        }
        return bl;
    }

    private static final w a(r_0 r_02) {
        return (w)r_02.a.a(w.class);
    }

    private static final boolean a(r_0 r_02, ch ch2, jv_0[] jv_0Array, dZ dZ2) {
        ew.a(jv_0Array);
        ew.a(dZ2);
        return r_02.a(ch2, jv_0Array, dZ2);
    }

    private static final boolean a(eo_0 eo_02, Object object) {
        return (Boolean)eo_02.a(object);
    }

    private static final boolean a(r_0 r_02, ch ch2, jv_0[] jv_0Array, Collection collection) {
        boolean bl;
        block3: {
            ew.a(collection);
            Iterable iterable = collection;
            boolean bl2 = false;
            if (((Collection)iterable).isEmpty()) {
                bl = false;
            } else {
                for (Object t2 : iterable) {
                    dZ dZ2 = (dZ)t2;
                    boolean bl3 = false;
                    if (!(!r_02.a(ch2, jv_0Array, dZ2))) continue;
                    bl = true;
                    break block3;
                }
                bl = false;
            }
        }
        return !bl;
    }

    private static final boolean c(eo_0 eo_02, Object object) {
        return (Boolean)eo_02.a(object);
    }

    private static final boolean a(gx_0 gx_02, dZ dZ2) {
        boolean bl;
        block7: {
            Iterable iterable = gx_02.b().values();
            boolean bl2 = false;
            if (((Collection)iterable).isEmpty()) {
                bl = true;
            } else {
                for (Object t2 : iterable) {
                    boolean bl3;
                    block6: {
                        Collection collection = (Collection)t2;
                        boolean bl4 = false;
                        ew.a(collection);
                        Iterable iterable2 = collection;
                        boolean bl5 = false;
                        if (iterable2 instanceof Collection && ((Collection)iterable2).isEmpty()) {
                            bl3 = false;
                        } else {
                            for (Object t3 : iterable2) {
                                dZ dZ3 = (dZ)t3;
                                boolean bl6 = false;
                                if (!(dZ3.a() == dZ2.a())) continue;
                                bl3 = true;
                                break block6;
                            }
                            bl3 = false;
                        }
                    }
                    if (!bl3) continue;
                    bl = false;
                    break block7;
                }
                bl = true;
            }
        }
        return bl;
    }

    private static final boolean b(eo_0 eo_02, Object object) {
        return (Boolean)eo_02.a(object);
    }

    static {
        d = 48000L;
        r_0.d();
        c = new dc(null);
    }

    private static final void d() {
        b = new String[]{"", ""};
    }
}

