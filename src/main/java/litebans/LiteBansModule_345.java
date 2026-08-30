package litebans;

import java.nio.charset.Charset;
public final class LiteBansModule_345 {
    public static final LiteBansModule_345 LiteBansModule_195;
    public static final Charset LiteBansModule_31;
    public static final Charset e;
    public static final Charset LiteBansModule_241;
    public static final Charset BaseCoreGenericHandler;
    public static final Charset AsyncBackgroundTask_5;
    public static final Charset c;
        private LiteBansModule_345() {
    }

    static {
        LiteBansModule_345.BaseCoreGenericHandler();
        LiteBansModule_195 = new LiteBansModule_345();
        LiteBansModule_31 = Charset.forName("UTF-8");
        e = Charset.forName("UTF-16");
        LiteBansModule_241 = Charset.forName("UTF-16BE");
        BaseCoreGenericHandler = Charset.forName("UTF-16LE");
        AsyncBackgroundTask_5 = Charset.forName("US-ASCII");
        c = Charset.forName("ISO-8859-1");
    }

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"UTF-32", "UTF-32LE", "UTF-32BE", "UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE", "US-ASCII", "ISO-8859-1"};
    }
}

