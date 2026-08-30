package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import litebans.bz;
import litebans.eo_0;
import litebans.id_0;
import litebans.ll;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

public final class kq_0 {
    private static final byte[] a = new byte[0];

    public static final byte[] a() {
        return a;
    }

    public static final List a(@NotNull String[] stringArray) {
        List list;
        if (stringArray.length == 0) {
            list = ll.e();
        } else {
            String[] stringArray2 = stringArray;
            boolean bl = false;
            String[] stringArray3 = stringArray2;
            Collection collection = new ArrayList(stringArray2.length);
            boolean bl2 = false;
            int n = stringArray3.length;
            for (int i = 0; i < n; ++i) {
                String string;
                String string2 = string = stringArray3[i];
                Collection collection2 = collection;
                boolean bl3 = false;
                String string3 = string2;
                collection2.add(string3.toLowerCase(Locale.ENGLISH));
            }
            list = (List)collection;
        }
        return list;
    }

    public static final Integer a(@NotNull String[] stringArray, int n) {
        String string = (String)lo_0.a((Object[])stringArray, n);
        return string != null ? bz.a(string) : null;
    }

    public static final int a(@NotNull String[] stringArray, int n, int n2) {
        Integer n3 = kq_0.a(stringArray, n);
        return n3 != null ? n3 : n2;
    }

    public static final int b(@NotNull String[] stringArray, int n) {
        int n2 = stringArray.length + -1;
        if (0 <= n2) {
            do {
                int n3 = n2--;
                Integer n4 = bz.a(stringArray[n3]);
                if (n4 == null) {
                    continue;
                }
                int n5 = n4;
                return n5;
            } while (0 <= n2);
        }
        return n;
    }

    public static final double a(@NotNull String[] stringArray, int n, double d10) {
        Object object = (String)lo_0.a((Object[])stringArray, n);
        return object != null && (object = bz.b((String)object)) != null ? (Double)object : d10;
    }

    public static final boolean a(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n, int n2) {
        int n3 = n2 - n;
        int n4 = 0;
        int n5 = n;
        while (n4 < n3) {
            if (byArray[n4++] == byArray2[n5++]) continue;
            return false;
        }
        return true;
    }

    public static final boolean a(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n, int n2, int n3) {
        int n4 = n + (n3 - n2);
        int n5 = n;
        int n6 = n2;
        while (n5 < n4) {
            if (byArray[n5++] == byArray2[n6++]) continue;
            return false;
        }
        return true;
    }

    public static final void a(@NotNull id_0 id_02, @NotNull eo_0 eo_02) {
        eo_02.a(id_02.a());
        eo_02.a(id_02.c());
        eo_02.a(id_02.f());
    }
}

