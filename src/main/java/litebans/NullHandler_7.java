package litebans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class NullHandler_7
extends ArrayList
implements List,
LiteBansModule_44,
LiteBansModule_86 {
    private static final long BaseCoreGenericHandler = 3957988303675231981L;

    public static final String BaseCoreGenericHandler(List list) {
        if (list == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator iterator = list.iterator();
        stringBuffer.append('[');
        while (iterator.hasNext()) {
            if (flag) {
                flag = false;
            } else {
                stringBuffer.append(',');
            }
            Object e = iterator.next();
            if (e == null) {
                stringBuffer.append("null");
                continue;
            }
            stringBuffer.append(NullHandler_5.BaseCoreGenericHandler(e));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public String BaseCoreGenericHandler() {
        return NullHandler_7.BaseCoreGenericHandler(this);
    }

    public String toString() {
        return this.plugin();
}

