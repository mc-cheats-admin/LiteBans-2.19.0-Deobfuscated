package litebans;

import java.io.Serializable;
import litebans.aJ;
import litebans.cu_0;
import litebans.e0;
import litebans.eE;
import litebans.ew;
import litebans.hl;
import litebans.kv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class in
implements eE,
Serializable {
    private e0 c;
    private volatile Object b;
    private final Object a;
    private static /* synthetic */ String[] d;

    public in(@NotNull e0 e02, @Nullable Object object) {
        ew.a((Object)e02, "initializer");
        this.c = e02;
        this.b = kv_0.a;
        Object object2 = object;
        if (object2 == null) {
            object2 = this;
        }
        this.a = object2;
    }

    public /* synthetic */ in(e0 e02, Object object, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            object = null;
        }
        this(e02, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        Object object;
        Object object2 = this.b;
        if (object2 != kv_0.a) {
            return object2;
        }
        Object object3 = this.a;
        synchronized (object3) {
            Object object4;
            boolean bl = false;
            Object object5 = this.b;
            if (object5 != kv_0.a) {
                object4 = object5;
            } else {
                Object object6;
                e0 e02 = this.c;
                ew.a(e02);
                this.b = object6 = e02.a();
                this.c = null;
                object4 = object6;
            }
            object = object4;
        }
        return object;
    }

    @Override
    public boolean b() {
        return this.b != kv_0.a;
    }

    public String toString() {
        return this.b() ? String.valueOf(this.a()) : "Lazy value not initialized ";
    }

    private final Object b() {
        return new cu_0(this.a());
    }

    private static final void c() {
        d = new String[]{"initializer", "Lazy value not initialized yet."};
    }

    static {
        in.c();
    }
}

