package litebans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import litebans.di_0;
import litebans.h6;
import litebans.n_0;
import org.jetbrains.annotations.Nullable;

public static final class x
extends n_0 {
    public static final h6 b;
    public static final boolean d;
    private static final Map c;

    public x(@Nullable di_0 di_02) {
        super(di_02);
    }

    @Override
    public void e() {
    }

    public static final /* synthetic */ Map a() {
        return c;
    }

    static {
        d = false;
        b = new h6(null);
        c = new ConcurrentHashMap();
    }
}

