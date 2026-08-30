package litebans;

import litebans.E;
import litebans.fB;
import litebans.hh_0;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@hh_0
public final class fn
extends fB {
    private final String i;
    private final E j;

    public fn(@NotNull String string, @Nullable String string2, @NotNull E e) {
        super(string, e.a);
        this.i = string2;
        this.j = e;
    }

    @Override
    public String getPermission() {
        return this.i;
    }

    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        this.j.a(jv_02, this.getName(), stringArray);
    }
}

