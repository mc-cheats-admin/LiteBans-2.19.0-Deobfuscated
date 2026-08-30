package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import litebans.aJ;
import litebans.am;
import litebans.bz;
import litebans.hl;
import litebans.jT;
import litebans.kc_0;
import litebans.y;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.iR
 */
public static final class ir_0 {
    private static /* synthetic */ String[] a;

    private ir_0() {
    }

    public final String a(@NotNull String string) {
        if (bz.c((CharSequence)string, '#', false, 2, null)) {
            boolean bl;
            boolean bl2;
            Object object;
            List list;
            int n;
            ArrayList arrayList;
            StringBuilder stringBuilder;
            block14: {
                stringBuilder = new StringBuilder();
                arrayList = new ArrayList();
                Object object2 = new char[]{'\n'};
                object2 = bz.a((CharSequence)am.bK, object2, false, 0, 6, null);
                boolean bl3 = false;
                char[] cArray = object2;
                Object object3 = new ArrayList();
                n = 0;
                Object object4 = cArray.iterator();
                while (object4.hasNext()) {
                    Object t2 = object4.next();
                    String string2 = (String)t2;
                    boolean bl4 = false;
                    if (!bz.a((CharSequence)string2, (CharSequence)a[0], false, 2, null)) continue;
                    object3.add(t2);
                }
                list = (List)object3;
                object = list;
                boolean bl5 = false;
                if (object instanceof Collection && ((Collection)object).isEmpty()) {
                    bl2 = false;
                } else {
                    object3 = object.iterator();
                    while (object3.hasNext()) {
                        Object e = object3.next();
                        object4 = (String)e;
                        boolean bl6 = false;
                        char c = bz.a((CharSequence)object4);
                        String string3 = a[1];
                        if (!bz.a((CharSequence)string, (CharSequence)(c + string3), false, 2, null)) continue;
                        bl2 = true;
                        break block14;
                    }
                    bl2 = false;
                }
            }
            boolean bl7 = bl2;
            Object object5 = object = (Object)string.toCharArray();
            boolean bl8 = false;
            n = 0;
            for (Object object6 : object5) {
                int n2 = n++;
                Object object7 = object6;
                int n3 = n2;
                bl = false;
                if (object7 != 35 || ((Object)object).length <= n3 + 6) continue;
                bz.a(stringBuilder);
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
                String string5 = y.b.b(string4);
                if (bl7) {
                    Iterable iterable = list;
                    boolean bl11 = false;
                    for (Object t3 : iterable) {
                        String string6 = (String)t3;
                        boolean bl12 = false;
                        Collection collection = arrayList;
                        String string7 = string6;
                        Object[] objectArray = new Object[]{string4};
                        collection.add(kc_0.a(String.format(string7, Arrays.copyOf(objectArray, objectArray.length)), string5));
                    }
                }
                ((Collection)arrayList).add(kc_0.a(string4, string5));
            }
            object5 = string;
            bl8 = false;
            Object object9 = null;
            object9 = object5;
            Iterable iterable = arrayList;
            int n4 = 0;
            for (Object t4 : iterable) {
                jT jT2 = (jT)t4;
                bl = false;
                String string8 = (String)jT2.a();
                String string9 = (String)jT2.c();
                object9 = bz.a((String)object9, string8, string9, false, 4, null);
            }
            return object9;
        }
        return string;
    }

    private final String b(String string) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(22).append('\u00a7').append('x');
        boolean bl = false;
        CharSequence charSequence = string.substring(1);
        boolean bl2 = false;
        for (int i = 0; i < charSequence.length(); ++i) {
            char c;
            char c10 = c = charSequence.charAt(i);
            boolean bl3 = false;
            stringBuilder2.append('\u00a7').append(c10);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ ir_0(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\u37ae\u37f8", -740608117), hl.a("\uee68", 1516301899)};
    }

    static {
        ir_0.a();
    }
}

