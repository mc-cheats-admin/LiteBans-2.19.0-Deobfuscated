package litebans;

import litebans.a_0;
import litebans.fB;
import litebans.hh_0;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@hh_0
public final class fp_0
extends fB {
    private final String j;
    private final a_0 i;

    public fp_0(@NotNull String string, @Nullable String string2, @NotNull a_0 a_02) {
        super(string, a_02.a);
        this.j = string2;
        this.i = a_02;
    }

    @Override
    public String getPermission() {
        return this.j;
    }

    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        this.i.a(jv_02, this.getName(), stringArray);
    }
}

