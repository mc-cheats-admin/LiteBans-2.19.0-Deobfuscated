package litebans;

import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import java.util.function.Supplier;
public final class JsonHandler
extends LiteBansModule_47 {
    final /* synthetic */ File AsyncBackgroundTask_5;
    final /* synthetic */ Class c;
    JsonHandler(File file, Class clazz) {
        this.AsyncBackgroundTask_5 = file;
        this.c = clazz;
    }

    @Override
    public void BaseCoreGenericHandler(NullHandler_4 ie_02, Writer writer) {
        if (StringUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5.getName(), ".json", false, 2, null)) {
            LiteBansModule_47.BaseCoreGenericHandler(LiteBansModule_54.class).BaseCoreGenericHandler(ie_02, writer);
        }
    }

    @Override
    public NullHandler_4 BaseCoreGenericHandler(Reader reader) {
        Object[] objectArray = new Object[]{reader};
        Object obj = this.c.getConstructors()[0].newInstance(objectArray);
        ObjectUtilities.LiteBansModule_31(obj, "");
        Supplier supplier = (Supplier)obj;
        Map map = (Map)supplier.get();
        return new NullHandler_4(map, null);
    }

    }

