package litebans;

import java.util.WeakHashMap;

/*
 * Renamed from litebans.dL
 */
public static final class dl_0
extends ThreadLocal {
    dl_0() {
    }

    protected WeakHashMap a() {
        return new WeakHashMap();
    }

    public Object initialValue() {
        return this.a();
    }
}

