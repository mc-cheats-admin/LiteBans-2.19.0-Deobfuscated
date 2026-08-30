package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

static class CharsHandler
extends OldvalueHandler {
    public static final String BaseCoreGenericHandler(@NotNull String string, @NotNull char[] cArray) {
        CharSequence charSequence;
{
            ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
            ObjectUtilities.BaseCoreGenericHandler(cArray, "chars");
            String string2 = string;
            CharSequence charSequence2 = string2;
            int n = charSequence2.length();
            for (int i = 0; i < n; ++i) {
                char c = charSequence2.charAt(i);
                if (ArrayUtilities.LiteBansModule_31(cArray, c)) continue;
                charSequence = charSequence2.subSequence(i, charSequence2.length());
                break;
            }
            charSequence = "";
        }
        return (charSequence).toString();
    }

    public static final boolean LiteBansModule_31(@NotNull CharSequence charSequence) {
        boolean flag;
{
            ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
            CharSequence charSequence2 = charSequence;
            for (int i = 0; i < charSequence2.length(); ++i) {
                char c;
                char c10 = c = charSequence2.charAt(i);
                if (LiteBansModule_338.BaseCoreGenericHandler(c10)) continue;
                flag = false;
                break;
            }
            flag = true;
        }
        return flag;
    }

    public static final int BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull LiteBansModule_166 eI2) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(eI2, "range");
        return (charSequence.subSequence(eI2.LiteBansModule_31(), eI2.c() + 1)).toString();
    }

    public static final String LiteBansModule_31(@NotNull String string, char c, @NotNull String string2) {
        String string3;
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string2, "missingDelimiterValue");
        int n = StringUtilities.BaseCoreGenericHandler(string, c, 0, false, 6, null);
        if (n == -1) {
            string3 = string2;
        } else {
            String string4 = string;
            string3 = string4.substring(n2, n);
        }
        return string3;
    }

    public static /* synthetic */ String BaseCoreGenericHandler(String string, char c, String string2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringUtilities.LiteBansModule_31(string, c, string2);
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, char c, @NotNull String string2) {
        String string3;
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string2, "missingDelimiterValue");
        int n = StringUtilities.BaseCoreGenericHandler(string, c, 0, false, 6, null);
        if (n == -1) {
            string3 = string2;
        } else {
            String string4 = string;
            int n2 = n + 1;
            int n3 = string.length();
            string3 = string4.substring(n2, n3);
        }
        return string3;
    }

    public static /* synthetic */ String LiteBansModule_31(String string, char c, String string2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringUtilities.BaseCoreGenericHandler(string, c, string2);
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        String string4;
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string2, "delimiter");
        ObjectUtilities.BaseCoreGenericHandler(string3, "missingDelimiterValue");
        int n = StringUtilities.BaseCoreGenericHandler(string, string2, 0, false, 6, null);
        if (n == -1) {
            string4 = string3;
        } else {
            String string5 = string;
            int n2 = n + string2.length();
            int n3 = string.length();
            string4 = string5.substring(n2, n3);
        }
        return string4;
    }

    public static /* synthetic */ String BaseCoreGenericHandler(String string, String string2, String string3, int n, Object targetObj) {
        if ((n & 2) != 0) {
            string3 = string;
        }
        return StringUtilities.BaseCoreGenericHandler(string, string2, string3);
    }

    public static final String AsyncBackgroundTask_5(@NotNull String string, char c, @NotNull String string2) {
        String string3;
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string2, "missingDelimiterValue");
        int n = StringUtilities.LiteBansModule_31(string, c, 0, false, 6, null);
        if (n == -1) {
            string3 = string2;
        } else {
            String string4 = string;
            string3 = string4.substring(n2, n);
        }
        return string3;
    }

    public static /* synthetic */ String c(String string, char c, String string2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringUtilities.AsyncBackgroundTask_5(string, c, string2);
    }

    public static final String c(@NotNull String string, char c, @NotNull String string2) {
        String string3;
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string2, "missingDelimiterValue");
        int n = StringUtilities.LiteBansModule_31(string, c, 0, false, 6, null);
        if (n == -1) {
            string3 = string2;
        } else {
            String string4 = string;
            int n2 = n + 1;
            int n3 = string.length();
            string3 = string4.substring(n2, n3);
        }
        return string3;
    }

    public static /* synthetic */ String AsyncBackgroundTask_5(String string, char c, String string2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringUtilities.c(string, c, string2);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence, int n, @NotNull CharSequence charSequence2, int n2, int n3, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(charSequence2, "other");
        if (n2 < 0 || n < 0 || n > charSequence.length() - n3 || n2 > charSequence2.length() - n3) {
            return false;
        }
        for (int i = 0; i < n3; ++i) {
            if (LiteBansModule_338.BaseCoreGenericHandler(charSequence.charAt(n + i), charSequence2.charAt(n2 + i), flag)) continue;
            return false;
        }
        return true;
    }

    public static final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence, char c, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        return charSequence.length() > 0 && LiteBansModule_338.BaseCoreGenericHandler(charSequence.charAt(0), c, flag);
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(CharSequence charSequence, char c, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, c, flag);
    }

    public static final boolean c(@NotNull CharSequence charSequence, char c, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        return charSequence.length() > 0 && LiteBansModule_338.BaseCoreGenericHandler(charSequence.charAt(StringUtilities.BaseCoreGenericHandler(charSequence)), c, flag);
    }

    public static /* synthetic */ boolean LiteBansModule_31(CharSequence charSequence, char c, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.c(charSequence, c, flag);
    }

    public static final boolean c(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(charSequence2, "prefix");
        if (!flag && charSequence instanceof String && charSequence2 instanceof String) {
            return StringUtilities.LiteBansModule_31((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, 0, charSequence2, 0, charSequence2.length(), flag);
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.c(charSequence, charSequence2, flag);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(charSequence2, "suffix");
        if (!flag && charSequence instanceof String && charSequence2 instanceof String) {
            return StringUtilities.BaseCoreGenericHandler((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), flag);
    }

    public static /* synthetic */ boolean LiteBansModule_31(CharSequence charSequence, CharSequence charSequence2, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, charSequence2, flag);
    }

    public static final int LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull char[] cArray, int n, boolean flag) {
        int n2;
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(cArray, "chars");
        if (!flag && cArray.length == 1 && charSequence instanceof String) {
            char c = ArrayUtilities.BaseCoreGenericHandler(cArray);
            return ((String)charSequence).indexOf(c, n);
        }
        int n3 = LiteBansModule_20.c(n, 0);
        if (n3 <= (n2 = StringUtilities.BaseCoreGenericHandler(charSequence))) {
            while (true) {
                boolean flag2;
{
                    char c = charSequence.charAt(n3);
                    char[] cArray2 = cArray;
                    int n4 = cArray2.length;
                    for (int i = 0; i < n4; ++i) {
                        char c10;
                        char c11 = c10 = cArray2[i];
                        if (!LiteBansModule_338.BaseCoreGenericHandler(c11, c, flag)) continue;
                        flag2 = true;
                        break;
                    }
                    flag2 = false;
                }
                if (flag2) {
                    return n3;
                }
                if (n3 == n2) break;
                ++n3;
}
        return -1;
    }

    public static final int BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull char[] cArray, int n, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(cArray, "chars");
        if (!flag && cArray.length == 1 && charSequence instanceof String) {
            char c = ArrayUtilities.BaseCoreGenericHandler(cArray);
            return ((String)charSequence).lastIndexOf(c, n);
        }
        for (int i = LiteBansModule_20.AsyncBackgroundTask_5(n, StringUtilities.BaseCoreGenericHandler(charSequence)); -1 < i; --i) {
            boolean flag2;
{
                char c = charSequence.charAt(i);
                char[] cArray2 = cArray;
                int n2 = cArray2.length;
                for (int i10 = 0; i10 < n2; ++i10) {
                    char c10;
                    char c11 = c10 = cArray2[i10];
                    if (!LiteBansModule_338.BaseCoreGenericHandler(c11, c, flag)) continue;
                    flag2 = true;
                    break;
                }
                flag2 = false;
            }
            if (!flag2) continue;
            return i;
        }
        return -1;
    }

    private static final int BaseCoreGenericHandler(CharSequence charSequence, CharSequence charSequence2, int n, int n2, boolean flag, boolean flag2) {
        LiteBansModule_159 ed2;
        LiteBansModule_159 ed3 = ed2 = !flag2 ? (LiteBansModule_159)new LiteBansModule_166(LiteBansModule_20.c(n, 0), LiteBansModule_20.AsyncBackgroundTask_5(n2, charSequence.length())) : LiteBansModule_20.BaseCoreGenericHandler(LiteBansModule_20.AsyncBackgroundTask_5(n, StringUtilities.BaseCoreGenericHandler(charSequence)), LiteBansModule_20.c(n2, 0));
        if (charSequence instanceof String && charSequence2 instanceof String) {
            int n3 = ed2.c();
            int n4 = ed2.LiteBansModule_31();
            int n5 = ed2.BaseCoreGenericHandler();
            if (n5 > 0 && n3 <= n4 || n5 < 0 && n4 <= n3) {
                while (true) {
                    if (StringUtilities.BaseCoreGenericHandler((String)charSequence2, 0, (String)charSequence, n3, ((String)charSequence2).length(), flag)) {
                        return n3;
                    }
                    if (n3 != n4) {
                        n3 += n5;
                        continue;
                    }
                    break;
} else {
            int n6 = ed2.c();
            int n7 = ed2.LiteBansModule_31();
            int n8 = ed2.BaseCoreGenericHandler();
            if (n8 > 0 && n6 <= n7 || n8 < 0 && n7 <= n6) {
                while (true) {
                    if (StringUtilities.BaseCoreGenericHandler(charSequence2, 0, charSequence, n6, charSequence2.length(), flag)) {
                        return n6;
                    }
                    if (n6 == n7) break;
                    n6 += n8;
}
        return -1;
    }

    static /* synthetic */ int BaseCoreGenericHandler(CharSequence charSequence, CharSequence charSequence2, int n, int n2, boolean flag, boolean flag2, int n3, Object targetObj) {
        if ((n3 & 0x10) != 0) {
            flag2 = false;
        }
        return CharsHandler.BaseCoreGenericHandler(charSequence, charSequence2, n, n2, flag, flag2);
    }

    private static final LiteBansModule_354 BaseCoreGenericHandler(CharSequence charSequence, Collection collection, int n, boolean flag, boolean flag2) {
        LiteBansModule_159 ed2;
        if (!flag && collection.size() == 1) {
            String string = (String)CollectionUtilities.BaseCoreGenericHandler((Iterable)collection);
            int n2 = !flag2 ? StringUtilities.BaseCoreGenericHandler(charSequence, string, n, false, 4, null) : StringUtilities.LiteBansModule_31(charSequence, string, n, false, 4, null);
            return n2 < 0 ? null : LiteBansModule_371.BaseCoreGenericHandler(n2, string);
        }
        LiteBansModule_159 ed3 = ed2 = !flag2 ? (LiteBansModule_159)new LiteBansModule_166(LiteBansModule_20.c(n, 0), charSequence.length()) : LiteBansModule_20.BaseCoreGenericHandler(LiteBansModule_20.AsyncBackgroundTask_5(n, StringUtilities.BaseCoreGenericHandler(charSequence)), 0);
        if (charSequence instanceof String) {
            int n3 = ed2.c();
            int n4 = ed2.LiteBansModule_31();
            int n5 = ed2.BaseCoreGenericHandler();
            if (n5 > 0 && n3 <= n4 || n5 < 0 && n4 <= n3) {
                while (true) {
                    Object v1;
{
                        Iterable iterable = collection;
                        for (Object t2 : iterable) {
                            String string = (String)t2;
                            if (!StringUtilities.BaseCoreGenericHandler(string, 0, (String)charSequence, n3, string.length(), flag)) continue;
                            v1 = t2;
                            break;
}
                    String string = v1;
                    if (string != null) {
                        return LiteBansModule_371.BaseCoreGenericHandler(n3, string);
                    }
                    if (n3 != n4) {
                        n3 += n5;
                        continue;
                    }
                    break;
} else {
            int n6 = ed2.c();
            int n7 = ed2.LiteBansModule_31();
            int n8 = ed2.BaseCoreGenericHandler();
            if (n8 > 0 && n6 <= n7 || n8 < 0 && n7 <= n6) {
                while (true) {
                    Object v2;
{
                        Iterable iterable = collection;
                        for (Object t3 : iterable) {
                            String string = (String)t3;
                            if (!StringUtilities.BaseCoreGenericHandler(string, 0, charSequence, n6, string.length(), flag)) continue;
                            v2 = t3;
                            break;
}
                    String string = v2;
                    if (string != null) {
                        return LiteBansModule_371.BaseCoreGenericHandler(n6, string);
                    }
                    if (n6 == n7) break;
                    n6 += n8;
}
        return null;
    }

    public static final int BaseCoreGenericHandler(@NotNull CharSequence charSequence, char c, int n, boolean flag) {
        int n2;
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        if (flag || !(charSequence instanceof String)) {
            char[] cArray = new char[]{c};
            n2 = StringUtilities.LiteBansModule_31(charSequence, cArray, n, flag);
        } else {
            n2 = ((String)charSequence).indexOf(c, n);
        }
        return n2;
    }

    public static /* synthetic */ int BaseCoreGenericHandler(CharSequence charSequence, char c, int n, boolean flag, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            flag = false;
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, c, n, flag);
    }

    public static final int LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull String string, int n, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string, "string");
        return flag || !(charSequence instanceof String) ? CharsHandler.BaseCoreGenericHandler(charSequence, string, n, charSequence.length(), flag, false, 16, null) : ((String)charSequence).indexOf(string, n);
    }

    public static /* synthetic */ int BaseCoreGenericHandler(CharSequence charSequence, String string, int n, boolean flag, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            flag = false;
        }
        return StringUtilities.LiteBansModule_31(charSequence, string, n, flag);
    }

    public static final int LiteBansModule_31(@NotNull CharSequence charSequence, char c, int n, boolean flag) {
        int n2;
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        if (flag || !(charSequence instanceof String)) {
            char[] cArray = new char[]{c};
            n2 = StringUtilities.BaseCoreGenericHandler(charSequence, cArray, n, flag);
        } else {
            n2 = ((String)charSequence).lastIndexOf(c, n);
        }
        return n2;
    }

    public static /* synthetic */ int LiteBansModule_31(CharSequence charSequence, char c, int n, boolean flag, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = StringUtilities.BaseCoreGenericHandler(charSequence);
        }
        if ((n2 & 4) != 0) {
            flag = false;
        }
        return StringUtilities.LiteBansModule_31(charSequence, c, n, flag);
    }

    public static final int BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull String string, int n, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(string, "string");
        return flag || !(charSequence instanceof String) ? CharsHandler.BaseCoreGenericHandler(charSequence, string, n, 0, flag, true) : ((String)charSequence).lastIndexOf(string, n);
    }

    public static /* synthetic */ int LiteBansModule_31(CharSequence charSequence, String string, int n, boolean flag, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = StringUtilities.BaseCoreGenericHandler(charSequence);
        }
        if ((n2 & 4) != 0) {
            flag = false;
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, string, n, flag);
    }

    public static final boolean LiteBansModule_31(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(charSequence2, "other");
        return charSequence2 instanceof String ? StringUtilities.BaseCoreGenericHandler(charSequence, (String)charSequence2, 0, flag, 2, null) >= 0 : CharsHandler.BaseCoreGenericHandler(charSequence, charSequence2, 0, charSequence.length(), flag, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(CharSequence charSequence, CharSequence charSequence2, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.LiteBansModule_31(charSequence, charSequence2, flag);
    }

    public static final boolean LiteBansModule_31(@NotNull CharSequence charSequence, char c, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        return StringUtilities.BaseCoreGenericHandler(charSequence, c, 0, flag, 2, null) >= 0;
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, char c, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.LiteBansModule_31(charSequence, c, flag);
    }

    private static final LiteBansModule_295 BaseCoreGenericHandler(CharSequence charSequence, char[] cArray, int n, boolean flag, int n2) {
        StringUtilities.BaseCoreGenericHandler(n2);
        return new InputHandler_2(charSequence, n, n2, (arg_0, arg_1) -> CharsHandler.BaseCoreGenericHandler(cArray, flag, arg_0, arg_1));
    }

    static /* synthetic */ LiteBansModule_295 BaseCoreGenericHandler(CharSequence charSequence, char[] cArray, int n, boolean flag, int n2, int n3, Object targetObj) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            flag = false;
        }
        if ((n3 & 8) != 0) {
            n2 = 0;
        }
        return CharsHandler.BaseCoreGenericHandler(charSequence, cArray, n, flag, n2);
    }

    private static final LiteBansModule_295 BaseCoreGenericHandler(CharSequence charSequence, String[] args, int n, boolean flag, int n2) {
        StringUtilities.BaseCoreGenericHandler(n2);
        List list = ArrayUtilities.BaseCoreGenericHandler(args);
        return new InputHandler_2(charSequence, n, n2, (arg_0, arg_1) -> CharsHandler.BaseCoreGenericHandler(list, flag, arg_0, arg_1));
    }

    static /* synthetic */ LiteBansModule_295 BaseCoreGenericHandler(CharSequence charSequence, String[] args, int n, boolean flag, int n2, int n3, Object targetObj) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            flag = false;
        }
        if ((n3 & 8) != 0) {
            n2 = 0;
        }
        return CharsHandler.BaseCoreGenericHandler(charSequence, args, n, flag, n2);
    }

    public static final void BaseCoreGenericHandler(int n) {
        if (!(n >= 0)) {
            String string = "Limit must be non-negative, but was " + n;
            throw new IllegalArgumentException(string.toString());
}

    public static final List BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull String[] args, boolean flag, int n) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(args, "delimiters");
        if (args.length == 1 && !(((CharSequence)(targetObj = args[0])).length() == 0)) {
            return CharsHandler.BaseCoreGenericHandler(charSequence, (String)targetObj, flag, n);
        }
        targetObj = LiteBansModule_233.BaseCoreGenericHandler(CharsHandler.BaseCoreGenericHandler(charSequence, args, 0, flag, n, 2, null));
        Object contextObj = targetObj;
        Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)targetObj, 10));
        Iterator iterator = contextObj.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            LiteBansModule_166 eI2 = (LiteBansModule_166)t2;
            Collection collection2 = collection;
            collection2.add(StringUtilities.BaseCoreGenericHandler(charSequence, eI2));
        }
        return (List)collection;
    }

    public static /* synthetic */ List BaseCoreGenericHandler(CharSequence charSequence, String[] args, boolean flag, int n, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            flag = false;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, args, flag, n);
    }

    public static final List BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull char[] cArray, boolean flag, int n) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(cArray, "delimiters");
        if (cArray.length == 1) {
            return CharsHandler.BaseCoreGenericHandler(charSequence, String.valueOf(cArray[0]), flag, n);
        }
        Iterable iterable = LiteBansModule_233.BaseCoreGenericHandler(CharsHandler.BaseCoreGenericHandler(charSequence, cArray, 0, flag, n, 2, null));
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        for (Object t2 : iterable2) {
            LiteBansModule_166 eI2 = (LiteBansModule_166)t2;
            Collection collection2 = collection;
            collection2.add(StringUtilities.BaseCoreGenericHandler(charSequence, eI2));
        }
        return (List)collection;
    }

    public static /* synthetic */ List BaseCoreGenericHandler(CharSequence charSequence, char[] cArray, boolean flag, int n, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            flag = false;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        return StringUtilities.BaseCoreGenericHandler(charSequence, cArray, flag, n);
    }

    private static final List BaseCoreGenericHandler(CharSequence charSequence, String string, boolean flag, int n) {
        StringUtilities.BaseCoreGenericHandler(n);
        int n3 = StringUtilities.LiteBansModule_31(charSequence, string, n2, flag);
        if (n3 == -1 || n == 1) {
            return CollectionUtilities.BaseCoreGenericHandler((charSequence).toString());
        }
        boolean flag2 = n > 0;
        ArrayList<String> arrayList = new ArrayList<String>(flag2 ? LiteBansModule_20.AsyncBackgroundTask_5(n, 10) : 10);
        do {
            arrayList.add((charSequence.subSequence(n2, n3)).toString());
            n2 = n3 + string.length();
        } while ((!flag2 || arrayList.size() != n - 1) && (n3 = StringUtilities.LiteBansModule_31(charSequence, string, n2, flag)) != -1);
        arrayList.add((charSequence.subSequence(n2, charSequence.length())).toString());
        return arrayList;
    }

    private static final LiteBansModule_354 BaseCoreGenericHandler(char[] cArray, boolean flag, CharSequence charSequence, int n) {
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "$this$DelimitedRangesSequence");
        int n2 = StringUtilities.LiteBansModule_31(charSequence, cArray, n, flag);
        return n2 < 0 ? null : LiteBansModule_371.BaseCoreGenericHandler(n2, 1);
    }

    private static final LiteBansModule_354 BaseCoreGenericHandler(List list, boolean flag, CharSequence charSequence, int n) {
        LiteBansModule_354 jT2;
        ObjectUtilities.BaseCoreGenericHandler(charSequence, "$this$DelimitedRangesSequence");
        LiteBansModule_354 jT3 = CharsHandler.BaseCoreGenericHandler(charSequence, list, n, flag, false);
        if (jT3 != null) {
            LiteBansModule_354 jT4 = jT3;
            jT2 = LiteBansModule_371.BaseCoreGenericHandler(jT4.LiteBansModule_31(), ((String)jT4.e()).length());
        } else {
            jT2 = null;
        }
        return jT2;
    }

    private static final void GnuSparseMapHandler() {
        GnuSparseMapHandler = new String[]{"<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "predicate", "", "<this>", "chars", "<this>", "chars", "<this>", "chars", "", "<this>", "chars", "", "<this>", "chars", "", "<this>", "chars", "", "<this>", "<this>", "<this>", "", "<this>", "<this>", "", "<this>", "<this>", "Desired length ", " is less than ", "<this>", "<this>", "Desired length ", " is less than ", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "", "defaultValue", "defaultValue", "<this>", "<this>", "<this>", "<this>", "range", "<this>", "range", "<this>", "<this>", "<this>", "<this>", "range", "<this>", "missingDelimiterValue", "<this>", "delimiter", "missingDelimiterValue", "<this>", "missingDelimiterValue", "<this>", "delimiter", "missingDelimiterValue", "<this>", "missingDelimiterValue", "<this>", "delimiter", "missingDelimiterValue", "<this>", "missingDelimiterValue", "<this>", "delimiter", "missingDelimiterValue", "<this>", "replacement", "End index (", ") is less than start index (", ") + ", "<this>", "replacement", "<this>", "range", "replacement", "<this>", "range", "replacement", "<this>", "End index (", ") is less than start index (", ") + ", "<this>", "<this>", "range", "<this>", "range", "<this>", "prefix", "<this>", "prefix", "<this>", "suffix", "<this>", "suffix", "<this>", "prefix", "suffix", "<this>", "prefix", "suffix", "<this>", "delimiter", "<this>", "delimiter", "<this>", "replacement", "missingDelimiterValue", "<this>", "delimiter", "replacement", "missingDelimiterValue", "<this>", "replacement", "missingDelimiterValue", "<this>", "delimiter", "replacement", "missingDelimiterValue", "<this>", "delimiter", "replacement", "missingDelimiterValue", "<this>", "replacement", "missingDelimiterValue", "<this>", "replacement", "missingDelimiterValue", "<this>", "delimiter", "replacement", "missingDelimiterValue", "<this>", "regex", "replacement", "<this>", "regex", "transform", "<this>", "regex", "replacement", "<this>", "transform", "<this>", "transform", "<this>", "regex", "<this>", "other", "<this>", "<this>", "<this>", "prefix", "<this>", "prefix", "<this>", "suffix", "<this>", "other", "<this>", "other", "<this>", "chars", "<this>", "chars", "<this>", "strings", "<this>", "strings", "<this>", "strings", "<this>", "strings", "<this>", "<this>", "string", "<this>", "<this>", "string", "<this>", "other", "<this>", "<this>", "regex", "Limit must be non-negative, but was ", "<this>", "delimiters", "<this>", "delimiters", "<this>", "delimiters", "<this>", "delimiters", "<this>", "regex", "<this>", "regex", "<this>", "regex", "<this>", "regex", "<this>", "<this>", "<this>", "true", "false", "The string doesn'AsyncBackgroundTask_22 represent BaseCoreGenericHandler boolean value: ", "<this>", "true", "false", "$this$DelimitedRangesSequence", "$this$DelimitedRangesSequence", "UpdateCheckTask", "UpdateCheckTask"};
}

