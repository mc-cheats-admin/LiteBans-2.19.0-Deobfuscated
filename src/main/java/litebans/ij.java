package litebans;

import litebans.fj_0;
import litebans.hl;
import litebans.iC;
import litebans.kd;
import litebans.ko;

public final class ij
extends Enum {
    public static final fj_0 l;
    private static final ij[] m;
    public static final ij e;
    public static final ij v;
    public static final ij t;
    public static final ij o;
    public static final ij k;
    public static final ij i;
    public static final ij b;
    public static final ij q;
    public static final ij w;
    public static final ij u;
    public static final ij x;
    public static final ij r;
    public static final ij g;
    public static final ij j;
    public static final ij s;
    public static final ij f;
    public static final ij p;
    public static final ij c;
    public static final ij h;
    public static final ij a;
    private static final /* synthetic */ ij[] d;
    private static final /* synthetic */ kd n;
    private static /* synthetic */ String[] y;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ij() {
        void var2_-1;
        void var1_-1;
    }

    public final int d() {
        return this.ordinal();
    }

    public final String f() {
        String string;
        switch (ko.a[this.ordinal()]) {
            case 1: {
                string = "broadcast";
                break;
            }
            case 2: {
                string = "silent";
                break;
            }
            case 3: {
                string = "console";
                break;
            }
            case 4: {
                string = "dupeip_join";
                break;
            }
            case 5: {
                string = "mute";
                break;
            }
            default: {
                throw new UnsupportedOperationException(this.toString());
            }
        }
        return string;
    }

    public final boolean a() {
        return this == j || this == s || this == f;
    }

    public static ij[] values() {
        return (ij[])d.clone();
    }

    public static ij a(String string) {
        return Enum.valueOf(ij.class, string);
    }

    public static final /* synthetic */ ij[] e() {
        return m;
    }

    static {
        ij.c();
        e = new ij("PING", 0);
        v = new ij("PONG", 1);
        t = new ij("BROADCAST", 2);
        o = new ij("BROADCAST_SILENT", 3);
        k = new ij("BROADCAST_EXTRA_SILENT", 4);
        i = new ij("NOTIFY_BANNED_JOIN", 5);
        b = new ij("NOTIFY_DUPEIP_JOIN", 6);
        q = new ij("NOTIFY_MUTE", 7);
        w = new ij("BAN", 8);
        u = new ij("MUTE", 9);
        x = new ij("WARN", 10);
        r = new ij("KICK_REQUEST", 11);
        g = new ij("KICK_SUCCESS", 12);
        j = new ij("UNBAN", 13);
        s = new ij("UNMUTE", 14);
        f = new ij("UNWARN", 15);
        p = new ij("EXPIRED_NOTIFY", 16);
        c = new ij("BROADCAST_CUSTOM", 17);
        h = new ij("SERVERS_RELOAD", 18);
        a = new ij("CONFIG_RELOAD", 19);
        d = ijArray = new ij[]{ij.e, ij.v, ij.t, ij.o, ij.k, ij.i, ij.b, ij.q, ij.w, ij.u, ij.x, ij.r, ij.g, ij.j, ij.s, ij.f, ij.p, ij.c, ij.h, ij.a};
        n = iC.a(d);
        l = new fj_0(null);
        m = ij.values();
    }

    private static final void c() {
        y = new String[]{"broadcast", "silent", "console", "dupeip_join", "mute", "PING", "PONG", "BROADCAST", "BROADCAST_SILENT", "BROADCAST_EXTRA_SILENT", "NOTIFY_BANNED_JOIN", "NOTIFY_DUPEIP_JOIN", "NOTIFY_MUTE", "BAN", "MUTE", "WARN", "KICK_REQUEST", "KICK_SUCCESS", "UNBAN", "UNMUTE", "UNWARN", "EXPIRED_NOTIFY", "BROADCAST_CUSTOM", "SERVERS_RELOAD", "CONFIG_RELOAD"};
    }
}

