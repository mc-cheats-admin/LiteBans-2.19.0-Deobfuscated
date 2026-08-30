package litebans;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
public abstract class Utf8Handler {
    static final String BaseCoreGenericHandler = "UTF8";
    static final LiteBansModule_119 LiteBansModule_31 = Utf8Handler.LiteBansModule_31("UTF8");

    public static final LiteBansModule_119 LiteBansModule_31(String string) {
        Charset charset = Charset.defaultCharset();
        if (string != null) {
            try {
                charset = Charset.forName(string);
            }
            catch (UnsupportedCharsetException unsupportedCharsetException) {
                // empty catch block
}
        boolean flag = Utf8Handler.BaseCoreGenericHandler(charset.name());
        return new LiteBansModule_222(charset, flag);
    }

    static final boolean BaseCoreGenericHandler(String string) {
        if (string == null) {
            string = Charset.defaultCharset().name();
        }
        if (StandardCharsets.UTF_8.name().equalsIgnoreCase(string)) {
            return true;
        }
        for (String string2 : StandardCharsets.UTF_8.aliases()) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
}

