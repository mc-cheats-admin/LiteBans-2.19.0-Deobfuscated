package litebans;

import java.nio.charset.Charset;
import litebans.hl;

public final class ji_0 {
    public static final ji_0 f;
    public static final Charset b;
    public static final Charset e;
    public static final Charset h;
    public static final Charset a;
    public static final Charset d;
    public static final Charset c;
    private static /* synthetic */ String[] g;

    private ji_0() {
    }

    static {
        ji_0.a();
        f = new ji_0();
        b = Charset.forName("UTF-8");
        e = Charset.forName("UTF-16");
        h = Charset.forName("UTF-16BE");
        a = Charset.forName("UTF-16LE");
        d = Charset.forName("US-ASCII");
        c = Charset.forName("ISO-8859-1");
    }

    private static final void a() {
        g = new String[]{"UTF-32", "UTF-32LE", "UTF-32BE", "UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE", "US-ASCII", "ISO-8859-1"};
    }
}

