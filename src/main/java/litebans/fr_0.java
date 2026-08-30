package litebans;

import litebans.a_0;
import litebans.am;
import litebans.e0;
import litebans.fB;
import litebans.hh_0;
import litebans.hl;
import litebans.jq_0;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@hh_0
public final class fr_0
extends fB {
    private final String j;
    private final jq_0 l;
    private final String k;
    private final a_0 m;
    private static /* synthetic */ String[] i;

    public fr_0(@NotNull String string, @NotNull String string2, @Nullable jq_0 jq_02, @Nullable String string3, @NotNull a_0 a_02) {
        super(string, a_02.a);
        this.j = string2;
        this.l = jq_02;
        this.k = string3;
        this.m = a_02;
    }

    @Override
    public String getPermission() {
        return this.k;
    }

    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        this.m.a(jv_02, this.j, stringArray);
    }

    @Override
    public void a(@NotNull String[] stringArray, @NotNull e0 e02) {
        super.a(stringArray, () -> fr_0.a(this));
    }

    private static final CharSequence a(fr_0 fr_02) {
        return am.c(fr_02.j + "_USAGE");
    }

    private static final void a() {
        i = new String[]{"_USAGE"};
    }

    static {
        fr_0.a();
    }
}

