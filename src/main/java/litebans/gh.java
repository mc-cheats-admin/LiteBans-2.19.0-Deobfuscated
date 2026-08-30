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
        ew.a((Object)enumArray, "entries");
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
        ew.a((Object)enum_, "element");
        Enum enum_2 = (Enum)lo_0.a((Object[])this.e, enum_.ordinal());
        return enum_2 == enum_;
    }

    public int b(@NotNull Enum enum_) {
        ew.a((Object)enum_, "element");
        int n = enum_.ordinal();
        Enum enum_2 = (Enum)lo_0.a((Object[])this.e, n);
        return enum_2 == enum_ ? n : -1;
    }

    public int a(@NotNull Enum enum_) {
        ew.a((Object)enum_, "element");
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
        f = new String[]{"entries", "element", "element", "element"};
    }

    static {
        gh.c();
    }
}

