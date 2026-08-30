package litebans;

import java.io.Closeable;
import litebans.b5;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public final class bt_0 {
    private static /* synthetic */ String[] a;

    public static final void a(@Nullable Closeable closeable, @Nullable Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
            } else {
                try {
                    closeable.close();
                }
                catch (Throwable throwable2) {
                    b5.a(throwable, throwable2);
                }
            }
        }
    }

    private static final void a() {
        a = new String[]{"block"};
    }

    static {
        bt_0.a();
    }
}

