package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.le_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class cK
implements List,
Serializable,
RandomAccess,
dG {
    public static final cK c;
    private static final long b;
    private static /* synthetic */ String[] a;

    private cK() {
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object instanceof List && ((List)object).isEmpty();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String toString() {
        return a[0];
    }

    public int a() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public boolean b(@NotNull Void void_) {
        ew.a((Object)void_, a[1]);
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        ew.a((Object)collection, a[2]);
        return collection.isEmpty();
    }

    public Void a(int n) {
        throw new IndexOutOfBoundsException(a[3] + n + '.');
    }

    public int c(@NotNull Void void_) {
        ew.a((Object)void_, a[4]);
        return -1;
    }

    public int a(@NotNull Void void_) {
        ew.a((Object)void_, a[5]);
        return -1;
    }

    @Override
    public Iterator iterator() {
        return le_0.a;
    }

    public ListIterator listIterator() {
        return le_0.a;
    }

    public ListIterator listIterator(int n) {
        if (n != 0) {
            throw new IndexOutOfBoundsException(a[6] + n);
        }
        return le_0.a;
    }

    public List subList(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(a[7] + n + a[8] + n2);
    }

    private final Object c() {
        return c;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException(a[11]);
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(a[12]);
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException(a[13]);
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(a[14]);
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(a[15]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(a[16]);
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException(a[19]);
    }

    @Override
    public final int size() {
        return this.a();
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Void)) {
            return false;
        }
        return this.b((Void)object);
    }

    public Object get(int n) {
        return this.a(n);
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        return this.c((Void)object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        return this.a((Void)object);
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException(a[20]);
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException(a[21]);
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException(a[22]);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        ew.a((Object)objectArray, a[23]);
        return d7.a(this, objectArray);
    }

    @Override
    public Object[] toArray() {
        return d7.a(this);
    }

    static {
        b = -7390468764508069838L;
        cK.b();
        c = new cK();
    }

    private static final void b() {
        a = new String[]{hl.a("\u9e88\u9e8e", -1577279789), hl.a("\u7bcb\u7bc2\u7bcb\u7bc3\u7bcb\u7bc0\u7bda", -807044178), hl.a("\ub929\ub920\ub929\ub921\ub929\ub922\ub938\ub93f", 1618196812), hl.a("\uc850\uc878\uc865\uc861\uc86c\uc835\uc879\uc87c\uc866\uc861\uc835\uc871\uc87a\uc870\uc866\uc87b\uc832\uc861\uc835\uc876\uc87a\uc87b\uc861\uc874\uc87c\uc87b\uc835\uc870\uc879\uc870\uc878\uc870\uc87b\uc861\uc835\uc874\uc861\uc835\uc87c\uc87b\uc871\uc870\uc86d\uc835", -523778027), hl.a("\ufd14\ufd1d\ufd14\ufd1c\ufd14\ufd1f\ufd05", 2072247665), hl.a("\ue486\ue48f\ue486\ue48e\ue486\ue48d\ue497", -1640241949), hl.a("\ua9b1\ua996\ua99c\ua99d\ua980\ua9c2\ua9d8", -2002605576), hl.a("\u9132\u9126\u913b\u9139\u911d\u913a\u9130\u9131\u912c\u916e\u9174", -1428319916), hl.a("\ude34\ude38\ude6c\ude77\ude51\ude76\ude7c\ude7d\ude60\ude22\ude38", -1499931112), hl.a("\u53df\u53e0\u53f5\u53e2\u53f1\u53e4\u53f9\u53ff\u53fe\u53b0\u53f9\u53e3\u53b0\u53fe\u53ff\u53e4\u53b0\u53e3\u53e5\u53e0\u53e0\u53ff\u53e2\u53e4\u53f5\u53f4\u53b0\u53f6\u53ff\u53e2\u53b0\u53e2\u53f5\u53f1\u53f4\u53bd\u53ff\u53fe\u53fc\u53e9\u53b0\u53f3\u53ff\u53fc\u53fc\u53f5\u53f3\u53e4\u53f9\u53ff\u53fe", 412177296), hl.a("\ude85\udeba\udeaf\udeb8\udeab\udebe\udea3\udea5\udea4\udeea\udea3\udeb9\udeea\udea4\udea5\udebe\udeea\udeb9\udebf\udeba\udeba\udea5\udeb8\udebe\udeaf\udeae\udeea\udeac\udea5\udeb8\udeea\udeb8\udeaf\udeab\udeae\udee7\udea5\udea4\udea6\udeb3\udeea\udea9\udea5\udea6\udea6\udeaf\udea9\udebe\udea3\udea5\udea4", 700833482), hl.a("\uba3b\uba04\uba11\uba06\uba15\uba00\uba1d\uba1b\uba1a\uba54\uba1d\uba07\uba54\uba1a\uba1b\uba00\uba54\uba07\uba01\uba04\uba04\uba1b\uba06\uba00\uba11\uba10\uba54\uba12\uba1b\uba06\uba54\uba06\uba11\uba15\uba10\uba59\uba1b\uba1a\uba18\uba0d\uba54\uba17\uba1b\uba18\uba18\uba11\uba17\uba00\uba1d\uba1b\uba1a", -879510924), hl.a("\u9540\u957f\u956a\u957d\u956e\u957b\u9566\u9560\u9561\u952f\u9566\u957c\u952f\u9561\u9560\u957b\u952f\u957c\u957a\u957f\u957f\u9560\u957d\u957b\u956a\u956b\u952f\u9569\u9560\u957d\u952f\u957d\u956a\u956e\u956b\u9522\u9560\u9561\u9563\u9576\u952f\u956c\u9560\u9563\u9563\u956a\u956c\u957b\u9566\u9560\u9561", 1789826319), hl.a("\udcad\udc92\udc87\udc90\udc83\udc96\udc8b\udc8d\udc8c\udcc2\udc8b\udc91\udcc2\udc8c\udc8d\udc96\udcc2\udc91\udc97\udc92\udc92\udc8d\udc90\udc96\udc87\udc86\udcc2\udc84\udc8d\udc90\udcc2\udc90\udc87\udc83\udc86\udccf\udc8d\udc8c\udc8e\udc9b\udcc2\udc81\udc8d\udc8e\udc8e\udc87\udc81\udc96\udc8b\udc8d\udc8c", 2016730338), hl.a("\udc7f\udc40\udc55\udc42\udc51\udc44\udc59\udc5f\udc5e\udc10\udc59\udc43\udc10\udc5e\udc5f\udc44\udc10\udc43\udc45\udc40\udc40\udc5f\udc42\udc44\udc55\udc54\udc10\udc56\udc5f\udc42\udc10\udc42\udc55\udc51\udc54\udc1d\udc5f\udc5e\udc5c\udc49\udc10\udc53\udc5f\udc5c\udc5c\udc55\udc53\udc44\udc59\udc5f\udc5e", -1668948944), hl.a("\uecf3\ueccc\uecd9\uecce\uecdd\uecc8\uecd5\uecd3\uecd2\uec9c\uecd5\ueccf\uec9c\uecd2\uecd3\uecc8\uec9c\ueccf\uecc9\ueccc\ueccc\uecd3\uecce\uecc8\uecd9\uecd8\uec9c\uecda\uecd3\uecce\uec9c\uecce\uecd9\uecdd\uecd8\uec91\uecd3\uecd2\uecd0\uecc5\uec9c\uecdf\uecd3\uecd0\uecd0\uecd9\uecdf\uecc8\uecd5\uecd3\uecd2", 704769212), hl.a("\ucaf0\ucacf\ucada\ucacd\ucade\ucacb\ucad6\ucad0\ucad1\uca9f\ucad6\ucacc\uca9f\ucad1\ucad0\ucacb\uca9f\ucacc\ucaca\ucacf\ucacf\ucad0\ucacd\ucacb\ucada\ucadb\uca9f\ucad9\ucad0\ucacd\uca9f\ucacd\ucada\ucade\ucadb\uca92\ucad0\ucad1\ucad3\ucac6\uca9f\ucadc\ucad0\ucad3\ucad3\ucada\ucadc\ucacb\ucad6\ucad0\ucad1", -176829761), hl.a("\u8a86\u8ab9\u8aac\u8abb\u8aa8\u8abd\u8aa0\u8aa6\u8aa7\u8ae9\u8aa0\u8aba\u8ae9\u8aa7\u8aa6\u8abd\u8ae9\u8aba\u8abc\u8ab9\u8ab9\u8aa6\u8abb\u8abd\u8aac\u8aad\u8ae9\u8aaf\u8aa6\u8abb\u8ae9\u8abb\u8aac\u8aa8\u8aad\u8ae4\u8aa6\u8aa7\u8aa5\u8ab0\u8ae9\u8aaa\u8aa6\u8aa5\u8aa5\u8aac\u8aaa\u8abd\u8aa0\u8aa6\u8aa7", 1584171721), hl.a("\u992e\u9911\u9904\u9913\u9900\u9915\u9908\u990e\u990f\u9941\u9908\u9912\u9941\u990f\u990e\u9915\u9941\u9912\u9914\u9911\u9911\u990e\u9913\u9915\u9904\u9905\u9941\u9907\u990e\u9913\u9941\u9913\u9904\u9900\u9905\u994c\u990e\u990f\u990d\u9918\u9941\u9902\u990e\u990d\u990d\u9904\u9902\u9915\u9908\u990e\u990f", 1923914081), hl.a("\udf12\udf2d\udf38\udf2f\udf3c\udf29\udf34\udf32\udf33\udf7d\udf34\udf2e\udf7d\udf33\udf32\udf29\udf7d\udf2e\udf28\udf2d\udf2d\udf32\udf2f\udf29\udf38\udf39\udf7d\udf3b\udf32\udf2f\udf7d\udf2f\udf38\udf3c\udf39\udf70\udf32\udf33\udf31\udf24\udf7d\udf3e\udf32\udf31\udf31\udf38\udf3e\udf29\udf34\udf32\udf33", 787013469), hl.a("\u0856\u0869\u087c\u086b\u0878\u086d\u0870\u0876\u0877\u0839\u0870\u086a\u0839\u0877\u0876\u086d\u0839\u086a\u086c\u0869\u0869\u0876\u086b\u086d\u087c\u087d\u0839\u087f\u0876\u086b\u0839\u086b\u087c\u0878\u087d\u0834\u0876\u0877\u0875\u0860\u0839\u087a\u0876\u0875\u0875\u087c\u087a\u086d\u0870\u0876\u0877", -1940125671), hl.a("\uf88b\uf8b4\uf8a1\uf8b6\uf8a5\uf8b0\uf8ad\uf8ab\uf8aa\uf8e4\uf8ad\uf8b7\uf8e4\uf8aa\uf8ab\uf8b0\uf8e4\uf8b7\uf8b1\uf8b4\uf8b4\uf8ab\uf8b6\uf8b0\uf8a1\uf8a0\uf8e4\uf8a2\uf8ab\uf8b6\uf8e4\uf8b6\uf8a1\uf8a5\uf8a0\uf8e9\uf8ab\uf8aa\uf8a8\uf8bd\uf8e4\uf8a7\uf8ab\uf8a8\uf8a8\uf8a1\uf8a7\uf8b0\uf8ad\uf8ab\uf8aa", -28313404), hl.a("\u0b73\u0b4c\u0b59\u0b4e\u0b5d\u0b48\u0b55\u0b53\u0b52\u0b1c\u0b55\u0b4f\u0b1c\u0b52\u0b53\u0b48\u0b1c\u0b4f\u0b49\u0b4c\u0b4c\u0b53\u0b4e\u0b48\u0b59\u0b58\u0b1c\u0b5a\u0b53\u0b4e\u0b1c\u0b4e\u0b59\u0b5d\u0b58\u0b11\u0b53\u0b52\u0b50\u0b45\u0b1c\u0b5f\u0b53\u0b50\u0b50\u0b59\u0b5f\u0b48\u0b55\u0b53\u0b52", 1564937020), hl.a("\ud02b\ud038\ud038\ud02b\ud033", -461516726)};
    }
}

