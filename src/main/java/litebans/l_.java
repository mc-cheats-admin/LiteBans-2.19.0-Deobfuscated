package litebans;

import java.util.Collection;
import litebans.ew;
import litebans.hl;
import litebans.lA;
import org.jetbrains.annotations.NotNull;

static class l_
extends lA {
    private static /* synthetic */ String[] c;

    public static final int a(@NotNull Iterable iterable, int n) {
        ew.a((Object)iterable, c[2]);
        return iterable instanceof Collection ? ((Collection)iterable).size() : n;
    }

    private static final void e() {
        c = new String[]{hl.a("\u0483\u049e\u048f\u0498\u048b\u049e\u0485\u0498", -1334508310), hl.a("\uf7d7\uf79f\uf783\uf782\uf798\uf7d5", -396232725), hl.a("\ua013\ua05b\ua047\ua046\ua05c\ua011", 2137759791), hl.a("\ud0d7\ud09f\ud083\ud082\ud098\ud0d5", 74174699), hl.a("\u2ed4\u2e9c\u2e80\u2e81\u2e9b\u2ed6", -575721752)};
    }

    static {
        l_.e();
    }
}

