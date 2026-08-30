package litebans;

import java.io.Serializable;

public class fl_0
implements Serializable {
    private static final long e = 4112582948775420359L;
    public static final fl_0 b = new fl_0("encryption");
    public static final fl_0 c = new fl_0("compression method");
    public static final fl_0 a = new fl_0("data descriptor");
    public static final fl_0 g = new fl_0("splitting");
    public static final fl_0 d = new fl_0("unknown compressed size");
    private final String f;

    private fl_0(String string) {
        this.f = string;
    }

    public String toString() {
        return this.f;
    }
}

