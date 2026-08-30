package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_391 {
    private static final byte[] BaseCoreGenericHandler = new byte[0];

    public static final byte[] BaseCoreGenericHandler() {
        return BaseCoreGenericHandler;
    }

    public static final List BaseCoreGenericHandler(@NotNull String[] args) {
        List list;
        if (args.length == 0) {
            list = CollectionUtilities.e();
        } else {
            String[] filteredArgs = args;
            String[] parsedArgs = filteredArgs;
            Collection collection = new ArrayList(filteredArgs.length);
            int n = parsedArgs.length;
            for (int i = 0; i < n; ++i) {
                String string;
                String string2 = string = parsedArgs[i];
                Collection collection2 = collection;
                String string3 = string2;
                collection2.add(string3.toLowerCase(Locale.ENGLISH));
            }
            list = (List)collection;
        }
        return list;
    }

    public static final Integer BaseCoreGenericHandler(@NotNull String[] args, int n) {
        String string = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])args, n);
        return string != null ? StringUtilities.BaseCoreGenericHandler(string) : null;
    }

    public static final int BaseCoreGenericHandler(@NotNull String[] args, int n, int n2) {
        Integer n3 = LiteBansModule_391.BaseCoreGenericHandler(args, n);
        return n3 != null ? n3 : n2;
    }

    public static final int LiteBansModule_31(@NotNull String[] args, int n) {
        int n2 = args.length + -1;
        if (0 <= n2) {
            do {
                int n3 = n2--;
                Integer n4 = StringUtilities.BaseCoreGenericHandler(args[n3]);
                if (n4 == null) {
                    continue;
                }
                int n5 = n4;
                return n5;
            } while (0 <= n2);
        }
        return n;
    }

    public static final double BaseCoreGenericHandler(@NotNull String[] args, int n, double d10) {
        Object targetObj = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])args, n);
        return targetObj != null && (targetObj = StringUtilities.LiteBansModule_31((String)targetObj)) != null ? (Double)targetObj : d10;
    }

    public static final boolean BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n, int n2) {
        int n3 = n2 - n;
        int n5 = n;
        while (n4 < n3) {
            if (byArray[n4++] == byArray2[n5++]) continue;
            return false;
        }
        return true;
    }

    public static final boolean BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n, int n2, int n3) {
        int n4 = n + (n3 - n2);
        int n5 = n;
        int n6 = n2;
        while (n5 < n4) {
            if (byArray[n5++] == byArray2[n6++]) continue;
            return false;
        }
        return true;
    }

    public static final void BaseCoreGenericHandler(@NotNull LiteBansModule_302 id_02, @NotNull LiteBansModule_179 eo_02) {
        eo_02.BaseCoreGenericHandler(id_02.BaseCoreGenericHandler());
        eo_02.BaseCoreGenericHandler(id_02.c());
        eo_02.BaseCoreGenericHandler(id_02.LiteBansModule_195());
    }
}

