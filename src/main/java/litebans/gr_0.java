package litebans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import litebans.bD;
import litebans.ck_0;
import litebans.jH;

public class gr_0
extends HashMap
implements Map,
bD,
ck_0 {
    private static final long a = -503443796854799292L;

    public static final String a(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl = true;
        Iterator iterator = map.entrySet().iterator();
        stringBuffer.append('{');
        while (iterator.hasNext()) {
            if (bl) {
                bl = false;
            } else {
                stringBuffer.append(',');
            }
            Map.Entry entry = iterator.next();
            gr_0.a(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public String a() {
        return gr_0.a(this);
    }

    private static final String a(String string, Object object, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (string == null) {
            stringBuffer.append("null");
        } else {
            jH.a(string, stringBuffer);
        }
        stringBuffer.append('\"').append(':');
        stringBuffer.append(jH.a(object));
        return stringBuffer.toString();
    }

    public String toString() {
        return this.a();
    }
}

