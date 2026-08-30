package litebans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class NullHandler_3
extends HashMap
implements Map,
LiteBansModule_44,
LiteBansModule_86 {
    private static final long BaseCoreGenericHandler = -503443796854799292L;

    public static final String BaseCoreGenericHandler(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean flag = true;
        Iterator iterator = map.entrySet().iterator();
        stringBuffer.append('{');
        while (iterator.hasNext()) {
            if (flag) {
                flag = false;
            } else {
                stringBuffer.append(',');
            }
            Map.Entry entry = iterator.next();
            NullHandler_3.BaseCoreGenericHandler(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public String BaseCoreGenericHandler() {
        return NullHandler_3.BaseCoreGenericHandler(this);
    }

    private static final String BaseCoreGenericHandler(String string, Object object, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (string == null) {
            stringBuffer.append("null");
        } else {
            NullHandler_5.BaseCoreGenericHandler(string, stringBuffer);
        }
        stringBuffer.append('\"').append(':');
        stringBuffer.append(NullHandler_5.BaseCoreGenericHandler(object));
        return stringBuffer.toString();
    }

    public String toString() {
        return this.plugin();
    }
}

