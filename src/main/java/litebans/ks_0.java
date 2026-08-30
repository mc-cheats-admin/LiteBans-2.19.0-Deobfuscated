package litebans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import litebans.bD;
import litebans.ck_0;
import litebans.jH;

public class ks_0
extends ArrayList
implements List,
bD,
ck_0 {
    private static final long a = 3957988303675231981L;

    public static final String a(List list) {
        if (list == null) {
            return "null";
        }
        boolean bl = true;
        StringBuffer stringBuffer = new StringBuffer();
        Iterator iterator = list.iterator();
        stringBuffer.append('[');
        while (iterator.hasNext()) {
            if (bl) {
                bl = false;
            } else {
                stringBuffer.append(',');
            }
            Object e = iterator.next();
            if (e == null) {
                stringBuffer.append("null");
                continue;
            }
            stringBuffer.append(jH.a(e));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public String a() {
        return ks_0.a(this);
    }

    public String toString() {
        return this.a();
    }
}

