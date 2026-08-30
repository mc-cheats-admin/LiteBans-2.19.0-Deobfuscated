package litebans;

import java.io.Serializable;
import java.util.regex.Pattern;
import litebans.ag;
import litebans.ew;
import litebans.hN;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static final class k8
implements Serializable {
    public static final ag e;
    private final String b;
    private final int c;
    private static final long a;
    private static /* synthetic */ String[] d;

    public k8(@NotNull String string, int n) {
        ew.a((Object)string, "pattern");
        this.b = string;
        this.c = n;
    }

    private final Object b() {
        return new hN(Pattern.compile(this.b, this.c));
    }

    static {
        a = 0L;
        k8.a();
        e = new ag(null);
    }

    private static final void a() {
        d = new String[]{"pattern"};
    }
}

