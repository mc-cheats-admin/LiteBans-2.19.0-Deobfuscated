package litebans;

import java.util.Locale;
public final class LiteBansModule_172
implements LiteBansModule_178 {
    public static final LiteBansModule_172 BaseCoreGenericHandler = new LiteBansModule_172();

    public final CharSequence BaseCoreGenericHandler(Locale locale) {
        return locale.getLanguage();
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return this.plugintargetObj;
}

