package litebans;

import kotlin.internal.PlatformImplementationsKt;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static class bg {
    private static /* synthetic */ String[] a;

    public static final void a(@NotNull Throwable throwable, @NotNull Throwable throwable2) {
        ew.a((Object)throwable, a[7]);
        ew.a((Object)throwable2, a[8]);
        if (throwable != throwable2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(throwable, throwable2);
        }
    }

    private static final void a() {
        a = new String[]{hl.a("\u94a1\u94e9\u94f5\u94f4\u94ee\u94a3", 1014731933), hl.a("\ubb74\ubb3c\ubb20\ubb21\ubb3b\ubb76", -1211974840), hl.a("\u7da9\u7dac\u7db7\u7daa\u7dbb\u7dac", 1423736286), hl.a("\u3285\u32cd\u32d1\u32d0\u32ca\u3287", 756298425), hl.a("\u832d\u832a\u832c\u833b\u833f\u8333", -649100450), hl.a("\u74a8\u74e0\u74fc\u74fd\u74e7\u74aa", -184716140), hl.a("\u4248\u4200\u421c\u421d\u4207\u424a", 1245856372), hl.a("\u6e04\u6e4c\u6e50\u6e51\u6e4b\u6e06", -1862832584), hl.a("\uda1b\uda06\uda1d\uda1b\uda0e\uda0a\uda17\uda11\uda10", -52897154), hl.a("\ub27e\ub236\ub22a\ub22b\ub231\ub27c", -361385406)};
    }

    static {
        bg.a();
    }
}

