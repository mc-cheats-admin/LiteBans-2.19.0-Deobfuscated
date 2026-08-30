package litebans;

import java.util.Locale;
import litebans.eo_0;

public static final class el
implements eo_0 {
    public static final el a = new el();

    public final CharSequence a(Locale locale) {
        return locale.getLanguage();
    }

    @Override
    public Object a(Object object) {
        return this.a((Locale)object);
    }
}

