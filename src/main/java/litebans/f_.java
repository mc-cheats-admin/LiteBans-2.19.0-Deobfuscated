package litebans;

import litebans.b5;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public static final class f_ {
    private static /* synthetic */ String[] a;

    public static final void a(@Nullable AutoCloseable autoCloseable, @Nullable Throwable throwable) {
        if (autoCloseable != null) {
            if (throwable == null) {
                autoCloseable.close();
            } else {
                try {
                    autoCloseable.close();
                }
                catch (Throwable throwable2) {
                    b5.a(throwable, throwable2);
                }
            }
        }
    }

    private static final void a() {
        a = new String[]{hl.a("\uf757\uf758\uf75b\uf747\uf751\uf775\uf757\uf740\uf75d\uf75b\uf75a", -1975519436), hl.a("\u2d0d\u2d03\u2d00\u2d0c\u2d04", 657796463)};
    }

    static {
        f_.a();
    }
}

