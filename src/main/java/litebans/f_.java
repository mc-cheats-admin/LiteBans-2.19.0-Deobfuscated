package litebans;

import litebans.b5;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public final class f_ {
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
        a = new String[]{"closeAction", "block"};
    }

    static {
        f_.a();
    }
}

