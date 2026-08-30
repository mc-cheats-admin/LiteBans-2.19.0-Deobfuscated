package litebans;

import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import litebans.bn_0;
import litebans.by_0;
import litebans.ie_0;

public abstract class bg_0 {
    public static final Map a = new HashMap();

    public static bg_0 a(Class clazz) {
        return (bg_0)a.get(clazz);
    }

    public abstract void a(ie_0 var1, Writer var2);

    public abstract ie_0 a(Reader var1);

    public abstract ie_0 a(Reader var1, ie_0 var2);

    static {
        try {
            a.put(by_0.class, new by_0());
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
        try {
            a.put(bn_0.class, new bn_0());
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
    }
}

