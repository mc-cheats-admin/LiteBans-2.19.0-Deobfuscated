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

/*
 * Renamed from litebans.jD
 */
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
        a = new String[]{hl.a("\ua824\ua822", -209606561), hl.a("\u5a4b\u5a5c\u5a51\u5a48\u5a58", -1279829443), hl.a("\u2a26\u2a19\u2a0c\u2a1b\u2a08\u2a1d\u2a00\u2a06\u2a07\u2a49\u2a00\u2a1a\u2a49\u2a07\u2a06\u2a1d\u2a49\u2a1a\u2a1c\u2a19\u2a19\u2a06\u2a1b\u2a1d\u2a0c\u2a0d\u2a49\u2a0f\u2a06\u2a1b\u2a49\u2a1b\u2a0c\u2a08\u2a0d\u2a44\u2a06\u2a07\u2a05\u2a10\u2a49\u2a0a\u2a06\u2a05\u2a05\u2a0c\u2a0a\u2a1d\u2a00\u2a06\u2a07", -520082839), hl.a("\u3845\u387a\u386f\u3878\u386b\u387e\u3863\u3865\u3864\u382a\u3863\u3879\u382a\u3864\u3865\u387e\u382a\u3879\u387f\u387a\u387a\u3865\u3878\u387e\u386f\u386e\u382a\u386c\u3865\u3878\u382a\u3878\u386f\u386b\u386e\u3827\u3865\u3864\u3866\u3873\u382a\u3869\u3865\u3866\u3866\u386f\u3869\u387e\u3863\u3865\u3864", 733231114), hl.a("\u9165\u915a\u914f\u9158\u914b\u915e\u9143\u9145\u9144\u910a\u9143\u9159\u910a\u9144\u9145\u915e\u910a\u9159\u915f\u915a\u915a\u9145\u9158\u915e\u914f\u914e\u910a\u914c\u9145\u9158\u910a\u9158\u914f\u914b\u914e\u9107\u9145\u9144\u9146\u9153\u910a\u9149\u9145\u9146\u9146\u914f\u9149\u915e\u9143\u9145\u9144", -713977558), hl.a("\uc8fd\uc8c2\uc8d7\uc8c0\uc8d3\uc8c6\uc8db\uc8dd\uc8dc\uc892\uc8db\uc8c1\uc892\uc8dc\uc8dd\uc8c6\uc892\uc8c1\uc8c7\uc8c2\uc8c2\uc8dd\uc8c0\uc8c6\uc8d7\uc8d6\uc892\uc8d4\uc8dd\uc8c0\uc892\uc8c0\uc8d7\uc8d3\uc8d6\uc89f\uc8dd\uc8dc\uc8de\uc8cb\uc892\uc8d1\uc8dd\uc8de\uc8de\uc8d7\uc8d1\uc8c6\uc8db\uc8dd\uc8dc", 424396978), hl.a("\u2bb7\u2b88\u2b9d\u2b8a\u2b99\u2b8c\u2b91\u2b97\u2b96\u2bd8\u2b91\u2b8b\u2bd8\u2b96\u2b97\u2b8c\u2bd8\u2b8b\u2b8d\u2b88\u2b88\u2b97\u2b8a\u2b8c\u2b9d\u2b9c\u2bd8\u2b9e\u2b97\u2b8a\u2bd8\u2b8a\u2b9d\u2b99\u2b9c\u2bd5\u2b97\u2b96\u2b94\u2b81\u2bd8\u2b9b\u2b97\u2b94\u2b94\u2b9d\u2b9b\u2b8c\u2b91\u2b97\u2b96", 1646013432)};
    }
}

