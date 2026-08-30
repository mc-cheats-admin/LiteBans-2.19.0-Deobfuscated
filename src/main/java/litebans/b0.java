package litebans;

import java.util.Arrays;
import java.util.List;
import litebans.I;
import litebans.aJ;
import litebans.a_0;
import litebans.bm_0;
import litebans.d8;
import litebans.di_0;
import litebans.ew;
import litebans.hl;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class b0
extends bm_0 {
    private final di_0 e;
    private static /* synthetic */ String[] f;

    public b0(@NotNull d8 d82, @NotNull di_0 di_02, @Nullable String string, @NotNull String[] stringArray) {
        super(d82, string, di_02, Arrays.copyOf(stringArray, stringArray.length));
        this.e = di_02;
    }

    public /* synthetic */ b0(d8 d82, di_0 di_02, String string, String[] stringArray, int n, aJ aJ2) {
        if ((n & 4) != 0) {
            string = d82.getPermission();
        }
        this(d82, di_02, string, stringArray);
    }

    @Override
    public List suggest(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        a_0 a_02 = this.e.z();
        ew.b(a_02, f[0]);
        return ((I)a_02).a(this, this.getName(), jv_02, stringArray);
    }

    private static final void a() {
        f = new String[]{hl.a("", -1809200358)};
    }

    static {
        b0.a();
    }
}

