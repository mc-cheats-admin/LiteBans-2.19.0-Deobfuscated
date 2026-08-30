package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.aJ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.bq
 */
public static final class bq_0 {
    private static /* synthetic */ String[] a;

    private bq_0() {
    }

    public final void a(int n, int n2) {
        if (n < 0 || n >= n2) {
            throw new IndexOutOfBoundsException(a[0] + n + a[1] + n2);
        }
    }

    public final void b(int n, int n2) {
        if (n < 0 || n > n2) {
            throw new IndexOutOfBoundsException(a[2] + n + a[3] + n2);
        }
    }

    public final void a(int n, int n2, int n3) {
        if (n < 0 || n2 > n3) {
            throw new IndexOutOfBoundsException(a[4] + n + a[5] + n2 + a[6] + n3);
        }
        if (n > n2) {
            throw new IllegalArgumentException(a[7] + n + a[8] + n2);
        }
    }

    public final int a(@NotNull Collection collection) {
        ew.a((Object)collection, a[14]);
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
        ew.a((Object)collection, a[15]);
        ew.a((Object)collection2, a[16]);
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
        a = new String[]{hl.a("\uf1fa\uf1fd\uf1f7\uf1f6\uf1eb\uf1a9\uf1b3", 1746661779), hl.a("\u01b0\u01bc\u01ef\u01f5\u01e6\u01f9\u01a6\u01bc", 464978332), hl.a("\uec93\uec94\uec9e\uec9f\uec82\uecc0\uecda", 524872954), hl.a("\ua778\ua774\ua727\ua73d\ua72e\ua731\ua76e\ua774", -129063084), hl.a("\u7ccc\u7cd8\u7cc5\u7cc7\u7ce3\u7cc4\u7cce\u7ccf\u7cd2\u7c90\u7c8a", 975010986), hl.a("\ub881\ub88d\ub8d9\ub8c2\ub8e4\ub8c3\ub8c9\ub8c8\ub8d5\ub897\ub88d", -1351501651), hl.a("\u7947\u794b\u7918\u7902\u7911\u790e\u7951\u794b", 32340331), hl.a("\u4b00\u4b14\u4b09\u4b0b\u4b2f\u4b08\u4b02\u4b03\u4b1e\u4b5c\u4b46", 1856523110), hl.a("\ucdaa\ucdb4\ucdaa\ucdfe\ucde5\ucdc3\ucde4\ucdee\ucdef\ucdf2\ucdb0\ucdaa", -1977102966), hl.a("\u4bf1\u4bf6\u4be3\u4bf0\u4bf6\u4bcb\u4bec\u4be6\u4be7\u4bfa\u4bb8\u4ba2", 1006521218), hl.a("\ucbba\ucbb6\ucbf3\ucbf8\ucbf2\ucbdf\ucbf8\ucbf2\ucbf3\ucbee\ucbac\ucbb6", 968084374), hl.a("\u6ad1\u6add\u6a8e\u6a94\u6a87\u6a98\u6ac7\u6add", -1753453827), hl.a("\u1bc0\u1bc7\u1bd2\u1bc1\u1bc7\u1bfa\u1bdd\u1bd7\u1bd6\u1bcb\u1b89\u1b93", 548740019), hl.a("\u851c\u8502\u851c\u8559\u8552\u8558\u8575\u8552\u8558\u8559\u8544\u8506\u851c", -127302340), hl.a("\ufa3c", 1314126431), hl.a("\u0115", 2030895478), hl.a("\u1029\u1032\u102e\u1023\u1034", 554373190)};
    }

    static {
        bq_0.a();
    }
}

