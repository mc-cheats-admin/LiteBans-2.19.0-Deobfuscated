package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_318 {
    private LiteBansModule_318() {
    }

    public final String BaseCoreGenericHandler(@NotNull String string) {
        if (StringUtilities.c(string, '#', false, 2, null)) {
            boolean flag;
            boolean flag2;
            List list;
            int n;
            ArrayList arrayList;
            StringBuilder stringBuilder;
{
                stringBuilder = new StringBuilder();
                arrayList = new ArrayList();
                Object contextObj = new char[]{'\n'};
                contextObj = StringUtilities.BaseCoreGenericHandler(MessageKey.LiteBansModule_50, contextObj, false, 0, 6, null);
                char[] cArray = contextObj;
                Object resultObj = new ArrayList();
                n = 0;
                Object helperObj = cArray.iterator();
                while (helperObj.hasNext()) {
                    Object t2 = helperObj.next();
                    String string2 = (String)t2;
                    if (!StringUtilities.BaseCoreGenericHandler(string2, (CharSequence)"%AsyncBackgroundTask_21", false, 2, null)) continue;
                    resultObj.add(t2);
                }
                list = (List)resultObj;
                targetObj = list;
                if (targetObj instanceof Collection && targetObj.isEmpty()) {
                    flag2 = false;
                } else {
                    resultObj = targetObj.iterator();
                    while (resultObj.hasNext()) {
                        Object e = resultObj.next();
                        helperObj = (String)e;
                        char c = StringUtilities.BaseCoreGenericHandler(helperObj);
                        String string3 = "#";
                        if (!StringUtilities.BaseCoreGenericHandler(string, (CharSequence)(c + string3), false, 2, null)) continue;
                        flag2 = true;
                        break;
                    }
                    flag2 = false;
}
            boolean flag7 = flag2;
            Object tempObj = targetObj = string.toCharArray();
            n = 0;
            for (Object object6 : tempObj) {
                int n2 = n++;
                Object object7 = object6;
                int n3 = n2;
                flag = false;
                if (object7 != 35 || (targetObj).length <= n3 + 6) continue;
                StringUtilities.BaseCoreGenericHandler(stringBuilder);
                stringBuilder.append('#');
                for (int i = 1; i < 7; ++i) {
                    Object object8 = targetObj[n3 + i];
                    if (!Character.isDigit((char)object8)) {
                        if (!(97 <= object8 ? object8 < 103 : false)) {
                            boolean bl10 = 65 <= object8 ? object8 < 71 : false;
                            if (bl10) {
                            } else {
                                bl9 = false;
                                break;
}
                    stringBuilder.append((char)object8);
                }
                if (!bl9) continue;
                String string4 = stringBuilder.toString();
                String string5 = HoverTextFormatter.LiteBansModule_31.LiteBansModule_31(string4);
                if (flag7) {
                    Iterable iterable = list;
                    for (Object t3 : iterable) {
                        String string6 = (String)t3;
                        Collection collection = arrayList;
                        String string7 = string6;
                        Object[] objectArray = new Object[]{string4};
                        collection.add(LiteBansModule_371.BaseCoreGenericHandler(String.format(string7, Arrays.copyOf(objectArray, objectArray.length)), string5));
}
                ((Collection)arrayList).add(LiteBansModule_371.BaseCoreGenericHandler(string4, string5));
            }
            tempObj = string;
            flag8 = false;
            Object object9 = null;
            object9 = tempObj;
            Iterable iterable = arrayList;
            for (Object t4 : iterable) {
                LiteBansModule_354 jT2 = (LiteBansModule_354)t4;
                flag = false;
                String string8 = (String)jT2.BaseCoreGenericHandler();
                String string9 = (String)jT2.c();
                object9 = StringUtilities.BaseCoreGenericHandler((String)object9, string8, string9, false, 4, null);
            }
            return object9;
        }
        return string;
    }

    private final String LiteBansModule_31(String string) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(22).append('\u00a7').append('LiteBansModule_433');
        CharSequence charSequence = string.substring(1);
        for (int i = 0; i < charSequence.length(); ++i) {
            char c;
            char c10 = c = charSequence.charAt(i);
            stringBuilder2.append('\u00a7').append(c10);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ LiteBansModule_318(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"%AsyncBackgroundTask_21", "#"};
}

