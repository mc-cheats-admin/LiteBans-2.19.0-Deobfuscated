package litebans;

import litebans.fB;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;

public class da
implements Runnable {
    private final jv_0 c;
    private final String[] b;
    private final fB d;
    private final String a;

    public da(@NotNull jv_0 jv_02, @NotNull String[] stringArray, @NotNull fB fB2, @NotNull String string) {
        this.c = jv_02;
        this.b = stringArray;
        this.d = fB2;
        this.a = string;
    }

    @Override
    public void run() {
        this.d.a(this.c, this.b, this.a);
    }
}

