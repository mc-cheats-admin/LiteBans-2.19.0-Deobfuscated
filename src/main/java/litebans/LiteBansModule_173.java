package litebans;

import java.util.Locale;
public final class LiteBansModule_173
implements LiteBansModule_179 {
    public static final LiteBansModule_173 BaseCoreGenericHandler = new LiteBansModule_173();

    public final CharSequence BaseCoreGenericHandler(Locale locale) {
        return locale.getLanguage();
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return this.plugin((Locale)targetObj);
    }
}

