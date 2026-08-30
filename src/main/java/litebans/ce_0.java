package litebans;

import litebans.ew;
import litebans.hl;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.ce
 */
public static final class ce_0
implements Runnable {
    private final Object[] b;
    private static /* synthetic */ String[] a;

    public ce_0(@NotNull Object[] objectArray) {
        this.b = objectArray;
    }

    public final Object[] c() {
        return this.b;
    }

    @Override
    public void run() {
        this.a();
    }

    private final int a() {
        Object object = this.b[0];
        ew.b(object, a[0]);
        String string = (String)object;
        Object[] objectArray = new Object[]{this.b[1]};
        q_0.j.a(a[1], string, a[2], objectArray);
        return 0;
    }

    private static final void b() {
        a = new String[]{hl.a("", -1687269531), hl.a("\uc9eb\uc9a0\uc9a1\uc9b2\uc9eb\uc9aa\uc9b1\uc9a8\uc9a8", -2093692476), hl.a("\u905b\u9010\u9011\u9002\u905b\u901a\u9001\u9018\u9018", 1051627636)};
    }

    static {
        ce_0.b();
    }
}

