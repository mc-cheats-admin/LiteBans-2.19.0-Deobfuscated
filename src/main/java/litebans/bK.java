package litebans;

import litebans.bQ;
import litebans.hN;
import litebans.hl;
import litebans.ip_0;

public final class bK {
    public static final bQ c;
    private static final hN a;
    private static final ip_0 b;
    private static /* synthetic */ String[] d;

    public static final /* synthetic */ hN c() {
        return a;
    }

    public static final /* synthetic */ ip_0 a() {
        return b;
    }

    static {
        bK.b();
        c = new bQ(null);
        a = new hN(d[0]);
        b = new ip_0();
    }

    private static final void b() {
        d = new String[]{"^\\w{2,16}$"};
    }
}

