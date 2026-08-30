package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.aJ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class bq_0 {
    private static /* synthetic */ String[] a;

    private bq_0() {
    }

    public final void a(int n, int n2) {
        if (n < 0 || n >= n2) {
            throw new IndexOutOfBoundsException("index: " + n + ", size: " + n2);
        }
    }

    public final void b(int n, int n2) {
        if (n < 0 || n > n2) {
            throw new IndexOutOfBoundsException("index: " + n + ", size: " + n2);
        }
    }

    public final void a(int n, int n2, int n3) {
        if (n < 0 || n2 > n3) {
            throw new IndexOutOfBoundsException("fromIndex: " + n + ", toIndex: " + n2 + ", size: " + n3);
        }
        if (n > n2) {
            throw new IllegalArgumentException("fromIndex: " + n + " > toIndex: " + n2);
        }
    }

    public final int a(@NotNull Collection collection) {
        ew.a((Object)collection, "c");
        int n = 1;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object e;
            Object e10 = e = iterator.next();
            n = 31 * n + (e10 != null ? e10.hashCode() : 0);
        }
        return n;
    }

    public final boolean a(@NotNull Collection collection, @NotNull Collection collection2) {
        ew.a((Object)collection, "c");
        ew.a((Object)collection2, "other");
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator iterator = collection2.iterator();
        for (Object e : collection) {
            Object e10;
            if (ew.a(e, e10 = iterator.next())) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ bq_0(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"index: ", ", size: ", "index: ", ", size: ", "fromIndex: ", ", toIndex: ", ", size: ", "fromIndex: ", " > toIndex: ", "startIndex: ", ", endIndex: ", ", size: ", "startIndex: ", " > endIndex: ", "c", "c", "other"};
    }

    static {
        bq_0.a();
    }
}

