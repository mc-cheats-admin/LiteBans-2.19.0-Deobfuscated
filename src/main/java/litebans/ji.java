package litebans;

import litebans.aJ;
import litebans.bz;
import litebans.hl;
import litebans.lq;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class ji {
    private static /* synthetic */ String[] a;

    private ji() {
    }

    public final lq a(@NotNull String string, @NotNull String string2) {
        if (w.v.b(string)) {
            return new lq(string, bz.b((CharSequence)string2) ? a[0] : a[1] + string2, a[2], a[3]);
        }
        return new lq(string, a[4], a[5], a[6]);
    }

    public /* synthetic */ ji(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("", -1514487492), hl.a("\u2e40\u2e4b\u2e42\u2e4c\u2e4b\u2e40\u2e38", 1357655557), hl.a("\u7056\u7035\u703e\u7037\u7024\u7037\u7035\u7022\u7033\u7024\u7056\u7025\u7033\u7022\u7056\u7003\u7002\u7010\u704e\u701b\u7014\u7042\u7056\u7035\u7039\u703a\u703a\u7037\u7022\u7033\u7056\u7003\u7002\u7010\u704e\u701b\u7014\u7042\u7029\u7003\u7018\u701f\u7015\u7019\u7012\u7013\u7029\u7015\u701f", 679702646), hl.a("\u103c\u1049\u1052\u104f\u1055\u105b\u1052\u1059\u1058", -383840228), hl.a("", -198202492), hl.a("", 1724440907), hl.a("\ub65a", -1485982086)};
    }

    static {
        ji.a();
    }
}

