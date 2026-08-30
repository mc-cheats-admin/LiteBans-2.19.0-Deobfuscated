package litebans;

import java.util.RandomAccess;
import litebans.ew;
import litebans.gn;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static final class gY
extends gn
implements RandomAccess {
    private final gn h;
    private final int e;
    private int f;
    private static /* synthetic */ String[] g;

    public gY(@NotNull gn gn2, int n, int n2) {
        ew.a((Object)gn2, "list");
        this.h = gn2;
        this.e = n;
        gn.b.a(this.e, n2, this.h.size());
        this.f = n2 - this.e;
    }

    @Override
    public Object get(int n) {
        gn.b.a(n, this.f);
        return this.h.get(this.e + n);
    }

    @Override
    public int a() {
        return this.f;
    }

    private static final void c() {
        g = new String[]{"list"};
    }

    static {
        gY.c();
    }
}

