package litebans;

import java.io.Serializable;
import litebans.cu_0;
import litebans.e0;
import litebans.eE;
import litebans.ew;
import litebans.hl;
import litebans.kv_0;
import org.jetbrains.annotations.NotNull;

public final class iH
implements eE,
Serializable {
    private e0 a;
    private Object b;
    private static /* synthetic */ String[] c;

    public iH(@NotNull e0 e02) {
        ew.a((Object)e02, "initializer");
        this.a = e02;
        this.b = kv_0.a;
    }

    @Override
    public Object a() {
        if (this.b == kv_0.a) {
            e0 e02 = this.a;
            ew.a(e02);
            this.b = e02.a();
            this.a = null;
        }
        return this.b;
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
        c = new String[]{"initializer", "Lazy value not initialized yet."};
    }

    static {
        iH.c();
    }
}

