package litebans;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_183 {
    private LiteBansModule_183() {
    }

    public final LiteBansModule_120 BaseCoreGenericHandler(@NotNull String string, @NotNull Integer[] integerArray) {
        char[] cArray;
        String string2 = string;
        if (StringUtilities.LiteBansModule_31(string2, "git:", false, 2, null)) {
            string2 = StringUtilities.AsyncBackgroundTask_5(string2, ':', null, 2, null);
        }
        if (StringUtilities.c((CharSequence)string2, '+', false, 2, null)) {
            cArray = new char[]{'+'};
            string2 = (String)StringUtilities.BaseCoreGenericHandler((CharSequence)string2, cArray, false, 0, 6, null).get(1);
        }
        if (StringUtilities.c((CharSequence)string2, '-', false, 2, null)) {
            cArray = new char[]{'-'};
            string2 = (String)StringUtilities.BaseCoreGenericHandler((CharSequence)string2, cArray, false, 0, 6, null).get(0);
        }
        int n = integerArray[0];
        int n2 = integerArray[1];
        int n3 = integerArray[2];
        if (StringUtilities.c((CharSequence)string2, '.', false, 2, null)) {
            char[] cArray2 = new char[]{'.'};
            List list = StringUtilities.BaseCoreGenericHandler((CharSequence)string2, cArray2, false, 0, 6, null);
            if (list.size() >= 3) {
                Integer n4 = StringUtilities.BaseCoreGenericHandler((String)list.get(0));
                n = n4 != null ? n4 : n;
                Integer n5 = StringUtilities.BaseCoreGenericHandler((String)list.get(1));
                n2 = n5 != null ? n5 : n2;
                Integer n6 = StringUtilities.BaseCoreGenericHandler((String)list.get(2));
                n3 = n6 != null ? n6 : n3;
            }
        } else {
            Integer n7 = StringUtilities.BaseCoreGenericHandler(string2);
            n = n7 != null ? n7 : n;
        }
        return new LiteBansModule_120(n, n2, n3);
    }

    public static /* synthetic */ LiteBansModule_120 BaseCoreGenericHandler(LiteBansModule_183 er_02, String string, Integer[] integerArray, int n, Object object) {
        if ((n & 2) != 0) {
            Integer[] integerArray2 = new Integer[]{1, 21, 5};
            integerArray = integerArray2;
        }
        return er_02.BaseCoreGenericHandler(string, integerArray);
    }

    public /* synthetic */ LiteBansModule_183(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"git:"};
    }

    }

