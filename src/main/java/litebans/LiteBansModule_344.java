package litebans;

import java.nio.charset.Charset;
public final class LiteBansModule_344 {
    public static final LiteBansModule_344 LiteBansModule_194;
    public static final Charset LiteBansModule_31;
    public static final Charset e;
    public static final Charset LiteBansModule_240;
    public static final Charset BaseCoreGenericHandler;
    public static final Charset AsyncBackgroundTask_5;
    public static final Charset c;
    private LiteBansModule_344() {
    }

    static {
        LiteBansModule_344.BaseCoreGenericHandler();
        LiteBansModule_194 = new LiteBansModule_344();
        LiteBansModule_31 = Charset.forName("UTF-8");
        e = Charset.forName("UTF-16");
        LiteBansModule_240 = Charset.forName("UTF-16BE");
        BaseCoreGenericHandler = Charset.forName("UTF-16LE");
        AsyncBackgroundTask_5 = Charset.forName("US-ASCII");
        c = Charset.forName("ISO-8859-1");
    }

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"UTF-32", "UTF-32LE", "UTF-32BE", "UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE", "US-ASCII", "ISO-8859-1"};
    }
}

