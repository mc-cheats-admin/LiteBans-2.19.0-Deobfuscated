package litebans;

import java.io.IOException;

/*
 * Renamed from litebans.ic
 */
public static class ic_0
extends IOException {
    private static final long a = 1L;

    public ic_0() {
    }

    public ic_0(String string) {
        super(string);
    }

    public ic_0(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

