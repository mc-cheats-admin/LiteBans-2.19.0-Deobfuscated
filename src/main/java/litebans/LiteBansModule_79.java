package litebans;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.minecraft.class_2561;

static class LiteBansModule_79
implements LiteBansModule_252 {
    final /* synthetic */ LiteBansModule_405 BaseCoreGenericHandler;

    LiteBansModule_79(LiteBansModule_405 la_02) {
        this.plugin = la_02;
    }

    public class_2561 LiteBansModule_31(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public class_2561 BaseCoreGenericHandler(CharSequence charSequence) {
        return class_2561.class_2562.method_10872((JsonElement)JsonParser.parseString((String)charSequence.toString()));
    }

    @Override
    public Object LiteBansModule_31(CharSequence charSequence) {
        return this.plugin(charSequence);
    }

    @Override
    public Object BaseCoreGenericHandler(CharSequence charSequence) {
        return this.LiteBansModule_31(charSequence);
    }
}

