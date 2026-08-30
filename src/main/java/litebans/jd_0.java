package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import litebans.cK;
import litebans.dG;
import litebans.e5;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class jd_0
implements Map,
Serializable,
dG {
    public static final jd_0 b;
    private static final long c;
    private static /* synthetic */ String[] a;

    private jd_0() {
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object instanceof Map && ((Map)object).isEmpty();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String toString() {
        return a[0];
    }

    public int d() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean containsKey(@Nullable Object object) {
        return false;
    }

    public boolean a(@NotNull Void void_) {
        ew.a((Object)void_, a[1]);
        return false;
    }

    public Void b(@Nullable Object object) {
        return null;
    }

    public Set f() {
        return e5.b;
    }

    public Set c() {
        return e5.b;
    }

    public Collection b() {
        return cK.c;
    }

    private final Object e() {
        return b;
    }

    public Void a(Object object) {
        throw new UnsupportedOperationException(a[3]);
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException(a[4]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(a[5]);
    }

    @Override
    public final int size() {
        return this.d();
    }

    @Override
    public final boolean containsValue(Object object) {
        if (!(object instanceof Void)) {
            return false;
        }
        return this.a((Void)object);
    }

    public Object get(Object object) {
        return this.b(object);
    }

    public final Set entrySet() {
        return this.f();
    }

    public final Set keySet() {
        return this.c();
    }

    public final Collection values() {
        return this.b();
    }

    public Object put(Object object, Object object2) {
        throw new UnsupportedOperationException(a[6]);
    }

    public Object remove(Object object) {
        return this.a(object);
    }

    static {
        c = 8246714829545688274L;
        jd_0.a();
        b = new jd_0();
    }

    private static final void a() {
        a = new String[]{"{}", "value", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
    }
}

