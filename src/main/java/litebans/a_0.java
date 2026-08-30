package litebans;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import litebans.d8;
import litebans.di_0;
import litebans.hl;
import litebans.jv_0;
import litebans.n_0;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.A
 */
public static abstract class a_0
extends n_0 {
    private final Map d = new HashMap();
    private Collection b;
    private static /* synthetic */ String[] c;

    public a_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public void a() {
        this.b = this.g();
        this.f();
    }

    public Collection g() {
        return this.a.f().a(d8.class, new Class[]{di_0.class}, new Object[]{this.a});
    }

    public void a(d8 d82, jv_0 jv_02, String[] stringArray) {
        d82.a(jv_02, stringArray);
    }

    public void a(jv_0 jv_02, String string, String[] stringArray) {
        d8 d82 = this.a(string);
        if (d82 == null) {
            return;
        }
        this.a(d82, jv_02, stringArray);
    }

    public @Nullable d8 a(String string) {
        return (d8)this.d.get(string);
    }

    public Collection e() {
        return this.b;
    }

    public List a(@Nullable d8 d82, String string, jv_0 jv_02, String[] stringArray) {
        this.a.getLogger().warning(c[1] + string);
        return Collections.emptyList();
    }

    private final void a(d8 d82) {
        this.a(d82.getName(), d82);
    }

    public void a(String string, d8 d82) {
        this.d.put(string, d82);
    }

    void f() {
        Collection collection = this.b;
        if (collection == null) {
            throw new IllegalStateException();
        }
        for (d8 d82 : collection) {
            this.a(d82);
        }
    }

    private static final void d() {
        c = new String[]{hl.a("\uaf56\uaf5a\uaf58\uaf58\uaf54\uaf5b\uaf51\uaf15\uaf5c\uaf46\uaf15\uaf58\uaf54\uaf47\uaf5e\uaf50\uaf51\uaf15\uaf5b\uaf5a\uaf5b\uaf18\uaf5b\uaf40\uaf59\uaf59\uaf15\uaf57\uaf40\uaf41\uaf15\uaf5c\uaf46\uaf15\uaf5b\uaf40\uaf59\uaf59", -1577668811), hl.a("\u3cb4\u3c95\u3cda\u3c89\u3c8f\u3c9d\u3c9d\u3c9f\u3c89\u3c8e\u3cda\u3c93\u3c97\u3c8a\u3c96\u3c9f\u3c97\u3c9f\u3c94\u3c8e\u3c9b\u3c8e\u3c93\u3c95\u3c94\u3cda\u3c9c\u3c95\u3c88\u3cda\u3cd5", 1056128250)};
    }

    static {
        a_0.d();
    }
}

