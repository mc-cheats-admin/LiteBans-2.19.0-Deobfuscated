package litebans;

import java.util.Arrays;
import java.util.List;
import litebans.E;
import litebans.a_0;
import litebans.am;
import litebans.d8;
import litebans.di_0;
import litebans.ec_0;
import litebans.ew;
import litebans.hk_0;
import litebans.hl;
import litebans.jv_0;
import litebans.k1;
import litebans.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class hO
extends hk_0 {
    private final di_0 e;
    private static /* synthetic */ String[] d;

    public hO(@NotNull d8 d82, @NotNull di_0 di_02, @Nullable String string, @NotNull String[] stringArray) {
        super(d82, string, di_02, Arrays.copyOf(stringArray, stringArray.length));
        this.e = di_02;
        ec_0 ec_02 = this.e.i();
        ew.b(ec_02, d[0]);
        if (((k1)ec_02).a()) {
            this.setPermissionMessage(y.b.a(am.cZ.toString()));
        }
    }

    @Override
    public List suggest(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        a_0 a_02 = this.e.z();
        ew.b(a_02, d[1]);
        return ((E)a_02).a(this, this.getName(), jv_02, stringArray);
    }

    private static final void a() {
        d = new String[]{hl.a("", -1513808057), hl.a("", 669954740)};
    }

    static {
        hO.a();
    }
}

