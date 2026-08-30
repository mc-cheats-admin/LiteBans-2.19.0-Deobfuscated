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
        ew.a((Object)e02, "initializer");
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
        return this.b() ? String.valueOf(this.a()) : "Lazy value not initialized ";
    }

    private final Object b() {
        return new cu_0(this.a());
    }

    static {
        jx_0.c();
        b = new lR(null);
        c = AtomicReferenceFieldUpdater.newUpdater(jx_0.class, Object.class, "_value");
    }

    private static final void c() {
        a = new String[]{"initializer", "Lazy value not initialized ", "_value"};
    }
}

