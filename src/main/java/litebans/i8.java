package litebans;

import litebans.aR;
import litebans.gl_0;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class i8 {
    private static /* synthetic */ String[] a;

    public static final String a(@NotNull String string, @NotNull String string2) {
        gl_0.a(string2);
        return aR.c(string, string2 + a[0]);
    }

    private static final void a() {
        a = new String[]{"={true}", "={false}"};
    }

    static {
        i8.a();
    }
}

