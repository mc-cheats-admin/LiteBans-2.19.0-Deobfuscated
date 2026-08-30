package litebans;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import litebans.gg_0;
import litebans.gn_0;
import litebans.ie_0;
import litebans.kr_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static class c7
implements kr_0 {
    private final gg_0 a;
    private final ie_0 b;

    public c7(gg_0 gg_02, ie_0 ie_02) {
        this.a = gg_02;
        this.b = ie_02;
    }

    @Override
    public Collection a(boolean bl) {
        if (this.b == null) {
            return Collections.emptyList();
        }
        return this.b.b();
    }

    @Override
    public kr_0 a(String string) {
        ie_0 ie_02;
        try {
            ie_02 = this.b.b(string);
        }
        catch (ClassCastException classCastException) {
            this.a.a(string, classCastException);
            return null;
        }
        if (ie_02 == null) {
            return null;
        }
        return new c7(this.a, ie_02);
    }

    @Override
    public gn_0 b(String string, Object object) {
        this.b.a(string, object);
        return this.a;
    }

    @Override
    public Object a(String string, Object object) {
        return this.b.b(string, object);
    }

    @Override
    public Object b(String string) {
        return this.b.e(string);
    }

    @Override
    public int a(String string, int n) {
        return this.b.a(string, n);
    }

    @Override
    public long a(String string, long l3) {
        return this.b.a(string, l3);
    }

    @Override
    public double d(String string) {
        return this.b.a(string);
    }

    @Override
    public boolean a(String string) {
        return this.b.f(string);
    }

    @Override
    public boolean a(String string, boolean bl) {
        return this.b.a(string, bl);
    }

    @Override
    public String e(String string) {
        return this.b.i(string);
    }

    @Override
    public String a(String string, String string2) {
        return this.b.a(string, string2);
    }

    @Override
    public List g(String string) {
        return this.b.j(string);
    }
}

