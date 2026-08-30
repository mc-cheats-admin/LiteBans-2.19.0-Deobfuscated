package litebans;

import litebans.ew;
import litebans.hl;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class ce_0
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
        ew.b(object, "");
        String string = (String)object;
        Object[] objectArray = new Object[]{this.b[1]};
        q_0.j.a("/dev/null", string, "/dev/null", objectArray);
        return 0;
    }

    private static final void b() {
        a = new String[]{"", "/dev/null", "/dev/null"};
    }

    static {
        ce_0.b();
    }
}

