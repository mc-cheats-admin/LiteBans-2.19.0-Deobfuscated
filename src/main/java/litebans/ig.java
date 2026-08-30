package litebans;

import litebans.e4;
import litebans.e6;
import litebans.hM;

public class ig {
    private static final e6 a() {
        String string = System.getProperty("os.name");
        if ("Mac OS X".equals(string)) {
            return new hM();
        }
        return new e4();
    }

    static /* synthetic */ e6 b() {
        return ig.a();
    }
}

