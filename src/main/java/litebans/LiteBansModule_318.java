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
        if (StringUtilities.c((CharSequence)string, '#', false, 2, null)) {
            boolean flag;
            boolean flag2;
            Object object;
            List list;
            int n;
            ArrayList arrayList;
            StringBuilder stringBuilder;
            block14: {
                stringBuilder = new StringBuilder();
                arrayList = new ArrayList();
                Object object2 = new char[]{'\n'};
                object2 = StringUtilities.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_50, object2, false, 0, 6, null);
                boolean flag3 = false;
                char[] cArray = object2;
                Object object3 = new ArrayList();
                n = 0;
                Object object4 = cArray.iterator();
                while (object4.hasNext()) {
                    Object t2 = object4.next();
                    String string2 = (String)t2;
                    boolean flag4 = false;
                    if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)"%AsyncBackgroundTask_21", false, 2, null)) continue;
                    object3.add(t2);
                }
                list = (List)object3;
                object = list;
                boolean flag5 = false;
                if (object instanceof Collection && ((Collection)object).isEmpty()) {
                    flag2 = false;
                } else {
                    object3 = object.iterator();
                    while (object3.hasNext()) {
                        Object e = object3.next();
                        object4 = (String)e;
                        boolean flag6 = false;
                        char c = StringUtilities.BaseCoreGenericHandler((CharSequence)object4);
                        String string3 = "#";
                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string, (CharSequence)(c + string3), false, 2, null)) continue;
                        flag2 = true;
                        break block14;
                    }
                    flag2 = false;
                }
            }
            boolean flag7 = flag2;
            Object object5 = object = (Object)string.toCharArray();
            boolean flag8 = false;
            n = 0;
            for (Object object6 : object5) {
                int n2 = n++;
                Object object7 = object6;
                int n3 = n2;
                flag = false;
                if (object7 != 35 || ((Object)object).length <= n3 + 6) continue;
                StringUtilities.BaseCoreGenericHandler(stringBuilder);
                stringBuilder.append('#');
                boolean bl9 = true;
                for (int i = 1; i < 7; ++i) {
                    Object object8 = object[n3 + i];
                    if (!Character.isDigit((char)object8)) {
                        if (!(97 <= object8 ? object8 < 103 : false)) {
                            boolean bl10 = 65 <= object8 ? object8 < 71 : false;
                            if (bl10) {
                            } else {
                                bl9 = false;
                                break;
                            }
                        }
                    }
                    stringBuilder.append((char)object8);
                }
                if (!bl9) continue;
                String string4 = stringBuilder.toString();
                String string5 = HoverTextFormatter.LiteBansModule_31.LiteBansModule_31(string4);
                if (flag7) {
                    Iterable iterable = list;
                    boolean bl11 = false;
                    for (Object t3 : iterable) {
                        String string6 = (String)t3;
                        boolean bl12 = false;
                        Collection collection = arrayList;
                        String string7 = string6;
                        Object[] objectArray = new Object[]{string4};
                        collection.add(LiteBansModule_371.BaseCoreGenericHandler(String.format(string7, Arrays.copyOf(objectArray, objectArray.length)), string5));
                    }
                }
                ((Collection)arrayList).add(LiteBansModule_371.BaseCoreGenericHandler(string4, string5));
            }
            object5 = string;
            flag8 = false;
            Object object9 = null;
            object9 = object5;
            Iterable iterable = arrayList;
            int n4 = 0;
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
        boolean flag = false;
        CharSequence charSequence = string.substring(1);
        boolean flag2 = false;
        for (int i = 0; i < charSequence.length(); ++i) {
            char c;
            char c10 = c = charSequence.charAt(i);
            boolean flag3 = false;
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

    }

