package litebans;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import litebans.dd_0;
import litebans.gh_0;

public abstract class c4 {
    static final String a = "UTF8";
    static final dd_0 b = c4.b("UTF8");

    public static final dd_0 b(String string) {
        Charset charset = Charset.defaultCharset();
        if (string != null) {
            try {
                charset = Charset.forName(string);
            }
            catch (UnsupportedCharsetException unsupportedCharsetException) {
                // empty catch block
            }
        }
        boolean bl = c4.a(charset.name());
        return new gh_0(charset, bl);
    }

    static final boolean a(String string) {
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
}

