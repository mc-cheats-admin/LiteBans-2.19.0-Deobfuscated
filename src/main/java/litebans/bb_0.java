package litebans;

import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import java.util.function.Supplier;
import litebans.bg_0;
import litebans.bn_0;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import litebans.ie_0;

public final class bb_0
extends bg_0 {
    final /* synthetic */ File d;
    final /* synthetic */ Class c;
    private static /* synthetic */ String[] b;

    bb_0(File file, Class clazz) {
        this.d = file;
        this.c = clazz;
    }

    @Override
    public void a(ie_0 ie_02, Writer writer) {
        if (bz.a(this.d.getName(), ".json", false, 2, null)) {
            bg_0.a(bn_0.class).a(ie_02, writer);
        }
    }

    @Override
    public ie_0 a(Reader reader) {
        Object[] objectArray = new Object[]{reader};
        Object obj = this.c.getConstructors()[0].newInstance(objectArray);
        ew.b(obj, "");
        Supplier supplier = (Supplier)obj;
        Map map = (Map)supplier.get();
        return new ie_0(map, null);
    }

    private static final void a() {
        b = new String[]{".json", ".json", ""};
    }

    static {
        bb_0.a();
    }
}

