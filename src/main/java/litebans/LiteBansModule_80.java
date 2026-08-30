package litebans;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.minecraft.class_2561;

static class LiteBansModule_80
implements LiteBansModule_253 {
    final /* synthetic */ LiteBansModule_407 BaseCoreGenericHandler;

    LiteBansModule_80(LiteBansModule_407 la_02) {
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

