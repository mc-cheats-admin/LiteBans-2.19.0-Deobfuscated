package litebans;

import litebans.bT;
import litebans.di_0;
import litebans.ew;
import litebans.hl;
import litebans.jJ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class jy
extends jJ {
    private final boolean f;
    private static /* synthetic */ String[] e;

    public jy(@NotNull di_0 di_02, @Nullable String string, boolean bl) {
        super(di_02, string);
        this.f = bl;
    }

    @Override
    public void a(@NotNull bT bT2) {
        if (ew.a((Object)this.c(), (Object)e[0])) {
            return;
        }
        bT2.a(this.c());
    }

    @Override
    public String toString() {
        if (ew.a((Object)this.c(), (Object)e[1])) {
            return e[2];
        }
        if (this.f) {
            return e[3];
        }
        return e[4];
    }

    private static final void a() {
        e = new String[]{hl.a("\u31ed\u31ed\u31f3\u31fe\u31fe\u31ed\u31ed", -1447415374), hl.a("\ue9d5\ue9d5\ue9cb\ue9c6\ue9c6\ue9d5\ue9d5", 1743120778), hl.a("", 319836709), hl.a("\u0640\u0621\u062e\u0624\u0648\u0613\u0605\u0612\u0616\u0605\u0612\u063f\u0613\u0603\u060f\u0610\u0605\u065d\u065f\u0649", 1244595808), hl.a("\u4055\u4043\u4054\u4050\u4043\u4054\u4079\u4055\u4045\u4049\u4056\u4043\u401b\u4019", 1250705446)};
    }

    static {
        jy.a();
    }
}

