package litebans;

import java.io.Serializable;
import litebans.an_0;
import litebans.ew;
import litebans.gn;
import litebans.hl;
import litebans.kd;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

static final class gh
extends gn
implements kd,
Serializable {
    private final Enum[] e;
    private static /* synthetic */ String[] f;

    public gh(@NotNull Enum[] enumArray) {
        ew.a((Object)enumArray, f[0]);
        this.e = enumArray;
    }

    @Override
    public int a() {
        return this.e.length;
    }

    public Enum a(int n) {
        gn.b.a(n, this.e.length);
        return this.e[n];
    }

    public boolean c(@NotNull Enum enum_) {
        ew.a((Object)enum_, f[1]);
        Enum enum_2 = (Enum)lo_0.a((Object[])this.e, enum_.ordinal());
        return enum_2 == enum_;
    }

    public int b(@NotNull Enum enum_) {
        ew.a((Object)enum_, f[2]);
        int n = enum_.ordinal();
        Enum enum_2 = (Enum)lo_0.a((Object[])this.e, n);
        return enum_2 == enum_ ? n : -1;
    }

    public int a(@NotNull Enum enum_) {
        ew.a((Object)enum_, f[3]);
        return this.indexOf(enum_);
    }

    private final Object d() {
        return new an_0(this.e);
    }

    @Override
    public Object get(int n) {
        return this.a(n);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Enum)) {
            return false;
        }
        return this.c((Enum)object);
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Enum)) {
            return -1;
        }
        return this.b((Enum)object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Enum)) {
            return -1;
        }
        return this.a((Enum)object);
    }

    private static final void c() {
        f = new String[]{hl.a("\u98b4\u98bf\u98a5\u98a3\u98b8\u98b4\u98a2", 296982737), hl.a("\uae81\uae88\uae81\uae89\uae81\uae8a\uae90", 1629597412), hl.a("\u75bf\u75b6\u75bf\u75b7\u75bf\u75b4\u75ae", -88246822), hl.a("\ued9c\ued95\ued9c\ued94\ued9c\ued97\ued8d", -945492487)};
    }

    static {
        gh.c();
    }
}

