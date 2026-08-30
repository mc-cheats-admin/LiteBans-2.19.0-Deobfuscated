package litebans;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import litebans.bN;
import litebans.di_0;
import litebans.eE;
import litebans.hl;
import litebans.n_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class v
extends n_0 {
    private final eE c = bN.a(() -> v.a(this));
    private final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    private static /* synthetic */ String[] d;

    public v(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final q_0 e() {
        eE eE2 = this.c;
        return (q_0)eE2.a();
    }

    @Override
    public void e() {
        this.e().e();
        this.b.clear();
        long l3 = this.e().f().bf();
        if (l3 > 0L) {
            this.a.b(this.b::clear, l3, l3);
        }
    }

    @Override
    public void b() {
        this.e();
    }

    public final boolean a(byte by2, @Nullable String string) {
        if (string == null) {
            return false;
        }
        if (this.e().f().bf() <= 0) {
            return false;
        }
        boolean bl = !this.b.add("" + by2 + ':' + string);
        q_0 q_02 = this.e();
        int n = 10;
        boolean bl2 = false;
        if (q_02.a(n)) {
            q_0 q_03 = q_02;
            boolean bl3 = false;
            q_03.a((Object)("Throttled! " + string));
        }
        return bl;
    }

    public final void b(byte by2, @Nullable String string) {
        if (string == null) {
            return;
        }
        if (this.e().f().bf() <= 0) {
            return;
        }
        this.b.remove("" + by2 + ':' + string);
    }

    private static final q_0 a(v v2) {
        return (q_0)v2.a.a(q_0.class);
    }

    private static final void d() {
        d = new String[]{"Throttled! "};
    }

    static {
        v.d();
    }
}

