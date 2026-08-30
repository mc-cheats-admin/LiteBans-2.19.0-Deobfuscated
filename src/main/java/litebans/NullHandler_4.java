package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public final class NullHandler_4 {
    private static final char BaseCoreGenericHandler = (char)46;
    final Map AsyncBackgroundTask_5 = new LinkedHashMap();
    private final NullHandler_4 LiteBansModule_31;
    public NullHandler_4() {
        this(null);
    }

    public NullHandler_4(NullHandler_4 ie_02) {
        this(new LinkedHashMap(), ie_02);
    }

    public NullHandler_4(Map map, NullHandler_4 ie_02) {
        this.LiteBansModule_31 = ie_02;
        for (Map.Entry entry : map.entrySet()) {
            String string;
            String string2 = string = entry.getKey() == null ? "null" : entry.getKey().toString();
            if (entry.getValue() instanceof Map) {
                this.AsyncBackgroundTask_5.put(string, new NullHandler_4((Map)entry.getValue(), ie_02 == null ? null : ie_02.LiteBansModule_31(string)));
                continue;
            }
            this.AsyncBackgroundTask_5.put(string, entry.getValue());
}

    private final NullHandler_4 c(String string) {
        int n = string.indexOf(46);
        if (n == -1) {
            return this;
        }
        String string2 = string.substring(0, n);
        Object object = this.AsyncBackgroundTask_5.get(string2);
        if (object == null) {
            object = new NullHandler_4(this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.LiteBansModule_31(string2));
            this.AsyncBackgroundTask_5.put(string2, object);
        }
        return (NullHandler_4)object;
    }

    private final String LiteBansModule_240(String string) {
        int n = string.indexOf(46);
        return n == -1 ? string : string.substring(n + 1);
    }

    public Object LiteBansModule_31(String string, Object object) {
        NullHandler_4 ie_02 = this.c(string);
        Object object2 = ie_02 == this ? this.AsyncBackgroundTask_5.get(string) : ie_02.LiteBansModule_31(this.LiteBansModule_240(string), object);
        if (object2 == null && object instanceof NullHandler_4) {
            this.AsyncBackgroundTask_5.put(string, object);
        }
        return object2 != null ? object2 : object;
    }

    public Object e(String string) {
        return this.LiteBansModule_31(string, this.g(string));
    }

    public Object g(String string) {
        return this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.e(string);
    }

    public void BaseCoreGenericHandler(String string, Object object) {
        NullHandler_4 ie_02;
        if (object instanceof Map) {
            object = new NullHandler_4((Map)object, this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.LiteBansModule_31(string));
        }
        if ((ie_02 = this.c(string)) == this) {
            if (object == null) {
                this.AsyncBackgroundTask_5.remove(string);
            } else {
                this.AsyncBackgroundTask_5.put(string, object);
} else {
            ie_02.BaseCoreGenericHandler(this.LiteBansModule_240(string), object);
}

    public NullHandler_4 LiteBansModule_31(String string) {
        Object object = this.g(string);
        return (NullHandler_4)this.LiteBansModule_31(string, object instanceof NullHandler_4 ? object : new NullHandler_4(this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.LiteBansModule_31(string)));
    }

    public Collection LiteBansModule_31() {
        return new LinkedHashSet(this.AsyncBackgroundTask_5.keySet());
    }

    public int BaseCoreGenericHandler(String string, int n) {
        Object object = this.LiteBansModule_31(string, n);
        return object instanceof Number ? ((Number)object).intValue() : n;
    }

    public long BaseCoreGenericHandler(String string, long l3) {
        Object object = this.LiteBansModule_31(string, l3);
        return object instanceof Number ? ((Number)object).longValue() : l3;
    }

    public double BaseCoreGenericHandler(String string) {
        Object object = this.g(string);
        return this.plugin(string, object instanceof Number ? ((Number)object).doubleValue() : 0.0);
    }

    public double BaseCoreGenericHandler(String string, double d10) {
        Object object = this.LiteBansModule_31(string, d10);
        return object instanceof Number ? ((Number)object).doubleValue() : d10;
    }

    public boolean LiteBansModule_194(String string) {
        Object object = this.g(string);
        return this.plugin(string, object instanceof Boolean ? (Boolean)object : false);
    }

    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        Object object = this.LiteBansModule_31(string, flag);
        return object instanceof Boolean ? (Boolean)object : flag;
    }

    public String i(String string) {
        Object object = this.g(string);
        return this.plugin(string, object instanceof String ? (String)object : "");
    }

    public String BaseCoreGenericHandler(String string, String string2) {
        Object object = this.LiteBansModule_31(string, string2);
        return object instanceof String ? (String)object : string2;
    }

    public List GnuSparseMapHandler(String string) {
        List list = this.AsyncBackgroundTask_5(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object e : list) {
            if (!(e instanceof String)) continue;
            arrayList.add((String)e);
        }
        return arrayList;
    }

    public List AsyncBackgroundTask_5(String string) {
        Object object = this.g(string);
        return this.plugin(string, object instanceof List ? (List)object : Collections.EMPTY_LIST);
    }

    public List BaseCoreGenericHandler(String string, List list) {
        Object object = this.LiteBansModule_31(string, list);
        return object instanceof List ? (List)object : list;
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"null", ""};
}

