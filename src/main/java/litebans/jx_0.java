package litebans;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import litebans.cu_0;
import litebans.e0;
import litebans.eE;
import litebans.ew;
import litebans.hl;
import litebans.kv_0;
import litebans.lR;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.jX
 */
static final class jx_0
implements eE,
Serializable {
    public static final lR b;
    private volatile e0 d;
    private volatile Object _value;
    private final Object e;
    private static final AtomicReferenceFieldUpdater c;
    private static /* synthetic */ String[] a;

    public jx_0(@NotNull e0 e02) {
        ew.a((Object)e02, a[0]);
        this.d = e02;
        this._value = kv_0.a;
        this.e = kv_0.a;
    }

    @Override
    public Object a() {
        Object object;
        Object object2 = this._value;
        if (object2 != kv_0.a) {
            return object2;
        }
        e0 e02 = this.d;
        if (e02 != null && c.compareAndSet(this, kv_0.a, object = e02.a())) {
            this.d = null;
            return object;
        }
        return this._value;
    }

    @Override
    public boolean b() {
        return this._value != kv_0.a;
    }

    public String toString() {
        return this.b() ? String.valueOf(this.a()) : a[1];
    }

    private final Object b() {
        return new cu_0(this.a());
    }

    static {
        jx_0.c();
        b = new lR(null);
        c = AtomicReferenceFieldUpdater.newUpdater(jx_0.class, Object.class, a[2]);
    }

    private static final void c() {
        a = new String[]{hl.a("\ufe2c\ufe2b\ufe2c\ufe31\ufe2c\ufe24\ufe29\ufe2c\ufe3f\ufe20\ufe37", -111870395), hl.a("\ue196\ue1bb\ue1a0\ue1a3\ue1fa\ue1ac\ue1bb\ue1b6\ue1af\ue1bf\ue1fa\ue1b4\ue1b5\ue1ae\ue1fa\ue1b3\ue1b4\ue1b3\ue1ae\ue1b3\ue1bb\ue1b6\ue1b3\ue1a0\ue1bf\ue1be\ue1fa\ue1a3\ue1bf\ue1ae\ue1f4", 1863639514), hl.a("\uf0d5\uf0fc\uf0eb\uf0e6\uf0ff\uf0ef", 1124266122)};
    }
}

