package litebans;

import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
public abstract class LiteBansModule_47 {
    public static final Map BaseCoreGenericHandler = new HashMap();

    public static LiteBansModule_47 BaseCoreGenericHandler(Class clazz) {
        return (LiteBansModule_47)BaseCoreGenericHandler.get(clazz);
    }

    public abstract void BaseCoreGenericHandler(NullHandler_4 var1, Writer var2);

    public abstract NullHandler_4 BaseCoreGenericHandler(Reader var1);

    public abstract NullHandler_4 BaseCoreGenericHandler(Reader var1, NullHandler_4 var2);

    static {
        try {
            BaseCoreGenericHandler.put(LiteBansModule_62.class, new LiteBansModule_62());
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
        try {
            BaseCoreGenericHandler.put(LiteBansModule_54.class, new LiteBansModule_54());
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
    }
}

