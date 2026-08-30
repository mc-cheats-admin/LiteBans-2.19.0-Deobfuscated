package litebans;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import litebans.bN;
import litebans.e0;
import litebans.eE;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class cU
implements eE,
Serializable {
    private final e0 a;
    private volatile Reference b;

    public cU(@NotNull e0 e02) {
        this.a = e02;
        this.b = new SoftReference<Object>(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        Object t2;
        Object t3 = this.b.get();
        if (t3 != null) {
            return t3;
        }
        cU cU2 = this;
        synchronized (cU2) {
            Object object;
            boolean bl = false;
            Object t4 = this.b.get();
            if (t4 != null) {
                object = t4;
            } else {
                Object object2 = this.a.a();
                this.b = new SoftReference<Object>(object2);
                object = object2;
            }
            t2 = object;
        }
        return t2;
    }

    @Override
    public boolean b() {
        return this.b.get() != null;
    }

    public String toString() {
        return String.valueOf(this.b() ? this.a() : null);
    }

    private final Object b() {
        return bN.a(this.a());
    }
}

