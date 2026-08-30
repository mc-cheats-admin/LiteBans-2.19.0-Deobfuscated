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
        Object targetObj = this.AsyncBackgroundTask_5.get(string2);
        if (targetObj == null) {
            targetObj = new NullHandler_4(this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.LiteBansModule_31(string2));
            this.AsyncBackgroundTask_5.put(string2, targetObj);
        }
        return (NullHandler_4)targetObj;
    }

    private final String LiteBansModule_240(String string) {
        int n = string.indexOf(46);
        return n == -1 ? string : string.substring(n + 1);
    }

    public Object LiteBansModule_31(String string, Object targetObj) {
        NullHandler_4 ie_02 = this.c(string);
        Object contextObj = ie_02 == this ? this.AsyncBackgroundTask_5.get(string) : ie_02.LiteBansModule_31(this.LiteBansModule_240(string), targetObj);
        if (contextObj == null && targetObj instanceof NullHandler_4) {
            this.AsyncBackgroundTask_5.put(string, targetObj);
        }
        return contextObj != null ? contextObj : targetObj;
    }

    public Object e(String string) {
        return this.LiteBansModule_31(string, this.g(string));
    }

    public Object g(String string) {
        return this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.e(string);
    }

    public void BaseCoreGenericHandler(String string, Object targetObj) {
        NullHandler_4 ie_02;
        if (targetObj instanceof Map) {
            targetObj = new NullHandler_4((Map)targetObj, this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.LiteBansModule_31(string));
        }
        if ((ie_02 = this.c(string)) == this) {
            if (targetObj == null) {
                this.AsyncBackgroundTask_5.remove(string);
            } else {
                this.AsyncBackgroundTask_5.put(string, targetObj);
} else {
            ie_02.BaseCoreGenericHandler(this.LiteBansModule_240(string), targetObj);
}

    public NullHandler_4 LiteBansModule_31(String string) {
        Object targetObj = this.g(string);
        return this.LiteBansModule_31(string, targetObj instanceof NullHandler_4 ? targetObj : new NullHandler_4(this.LiteBansModule_31 == null ? null : this.LiteBansModule_31.LiteBansModule_31(string)));
    }

    public Collection LiteBansModule_31() {
        return new LinkedHashSet(this.AsyncBackgroundTask_5.keySet());
    }

    public int BaseCoreGenericHandler(String string, int n) {
        Object targetObj = this.LiteBansModule_31(string, n);
        return targetObj instanceof Number ? targetObj.intValue() : n;
    }

    public long BaseCoreGenericHandler(String string, long l3) {
        Object targetObj = this.LiteBansModule_31(string, l3);
        return targetObj instanceof Number ? targetObj.longValue() : l3;
    }

    public double BaseCoreGenericHandler(String string) {
        Object targetObj = this.g(string);
        return this.plugin(string, targetObj instanceof Number ? targetObj.doubleValue() : 0.0);
    }

    public double BaseCoreGenericHandler(String string, double d10) {
        Object targetObj = this.LiteBansModule_31(string, d10);
        return targetObj instanceof Number ? targetObj.doubleValue() : d10;
    }

    public boolean LiteBansModule_194(String string) {
        Object targetObj = this.g(string);
        return this.plugin(string, targetObj instanceof Boolean ? (Boolean)targetObj : false);
    }

    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        Object targetObj = this.LiteBansModule_31(string, flag);
        return targetObj instanceof Boolean ? (Boolean)targetObj : flag;
    }

    public String i(String string) {
        Object targetObj = this.g(string);
        return this.plugin(string, targetObj instanceof String ? (String)targetObj : "");
    }

    public String BaseCoreGenericHandler(String string, String string2) {
        Object targetObj = this.LiteBansModule_31(string, string2);
        return targetObj instanceof String ? (String)targetObj : string2;
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
        Object targetObj = this.g(string);
        return this.plugin(string, targetObj instanceof List ? (List)targetObj : Collections.EMPTY_LIST);
    }

    public List BaseCoreGenericHandler(String string, List list) {
        Object targetObj = this.LiteBansModule_31(string, list);
        return targetObj instanceof List ? (List)targetObj : list;
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"null", ""};
}

