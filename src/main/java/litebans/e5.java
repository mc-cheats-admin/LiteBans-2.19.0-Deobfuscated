package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.le_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class e5
implements Set,
Serializable,
dG {
    public static final e5 b;
    private static final long a;
    private static /* synthetic */ String[] c;

    private e5() {
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String toString() {
        return c[0];
    }

    public int a() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public boolean a(@NotNull Void void_) {
        ew.a((Object)void_, c[1]);
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        ew.a((Object)collection, c[2]);
        return collection.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return le_0.a;
    }

    private final Object c() {
        return b;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException(c[4]);
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(c[5]);
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(c[6]);
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(c[7]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(c[8]);
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
        return this.a((Void)object);
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException(c[9]);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        ew.a((Object)objectArray, c[10]);
        return d7.a(this, objectArray);
    }

    @Override
    public Object[] toArray() {
        return d7.a(this);
    }

    static {
        a = 3406603774387020532L;
        e5.b();
        b = new e5();
    }

    private static final void b() {
        c = new String[]{hl.a("\u50fc\u50fa", 1991069863), hl.a("\uf9c5\uf9cc\uf9c5\uf9cd\uf9c5\uf9ce\uf9d4", -519636576), hl.a("\u2085\u208c\u2085\u208d\u2085\u208e\u2094\u2093", 1897537760), hl.a("\uea7f\uea40\uea55\uea42\uea51\uea44\uea59\uea5f\uea5e\uea10\uea59\uea43\uea10\uea5e\uea5f\uea44\uea10\uea43\uea45\uea40\uea40\uea5f\uea42\uea44\uea55\uea54\uea10\uea56\uea5f\uea42\uea10\uea42\uea55\uea51\uea54\uea1d\uea5f\uea5e\uea5c\uea49\uea10\uea53\uea5f\uea5c\uea5c\uea55\uea53\uea44\uea59\uea5f\uea5e", 700705328), hl.a("\u9a91\u9aae\u9abb\u9aac\u9abf\u9aaa\u9ab7\u9ab1\u9ab0\u9afe\u9ab7\u9aad\u9afe\u9ab0\u9ab1\u9aaa\u9afe\u9aad\u9aab\u9aae\u9aae\u9ab1\u9aac\u9aaa\u9abb\u9aba\u9afe\u9ab8\u9ab1\u9aac\u9afe\u9aac\u9abb\u9abf\u9aba\u9af3\u9ab1\u9ab0\u9ab2\u9aa7\u9afe\u9abd\u9ab1\u9ab2\u9ab2\u9abb\u9abd\u9aaa\u9ab7\u9ab1\u9ab0", 890870494), hl.a("\uf843\uf87c\uf869\uf87e\uf86d\uf878\uf865\uf863\uf862\uf82c\uf865\uf87f\uf82c\uf862\uf863\uf878\uf82c\uf87f\uf879\uf87c\uf87c\uf863\uf87e\uf878\uf869\uf868\uf82c\uf86a\uf863\uf87e\uf82c\uf87e\uf869\uf86d\uf868\uf821\uf863\uf862\uf860\uf875\uf82c\uf86f\uf863\uf860\uf860\uf869\uf86f\uf878\uf865\uf863\uf862", 1766651916), hl.a("\ue939\ue906\ue913\ue904\ue917\ue902\ue91f\ue919\ue918\ue956\ue91f\ue905\ue956\ue918\ue919\ue902\ue956\ue905\ue903\ue906\ue906\ue919\ue904\ue902\ue913\ue912\ue956\ue910\ue919\ue904\ue956\ue904\ue913\ue917\ue912\ue95b\ue919\ue918\ue91a\ue90f\ue956\ue915\ue919\ue91a\ue91a\ue913\ue915\ue902\ue91f\ue919\ue918", 1612114294), hl.a("\u208b\u20b4\u20a1\u20b6\u20a5\u20b0\u20ad\u20ab\u20aa\u20e4\u20ad\u20b7\u20e4\u20aa\u20ab\u20b0\u20e4\u20b7\u20b1\u20b4\u20b4\u20ab\u20b6\u20b0\u20a1\u20a0\u20e4\u20a2\u20ab\u20b6\u20e4\u20b6\u20a1\u20a5\u20a0\u20e9\u20ab\u20aa\u20a8\u20bd\u20e4\u20a7\u20ab\u20a8\u20a8\u20a1\u20a7\u20b0\u20ad\u20ab\u20aa", -1357307708), hl.a("\u3027\u3018\u300d\u301a\u3009\u301c\u3001\u3007\u3006\u3048\u3001\u301b\u3048\u3006\u3007\u301c\u3048\u301b\u301d\u3018\u3018\u3007\u301a\u301c\u300d\u300c\u3048\u300e\u3007\u301a\u3048\u301a\u300d\u3009\u300c\u3045\u3007\u3006\u3004\u3011\u3048\u300b\u3007\u3004\u3004\u300d\u300b\u301c\u3001\u3007\u3006", 1613770856), hl.a("\u645f\u6460\u6475\u6462\u6471\u6464\u6479\u647f\u647e\u6430\u6479\u6463\u6430\u647e\u647f\u6464\u6430\u6463\u6465\u6460\u6460\u647f\u6462\u6464\u6475\u6474\u6430\u6476\u647f\u6462\u6430\u6462\u6475\u6471\u6474\u643d\u647f\u647e\u647c\u6469\u6430\u6473\u647f\u647c\u647c\u6475\u6473\u6464\u6479\u647f\u647e", -2045942768), hl.a("\u915d\u914e\u914e\u915d\u9145", 1871155516)};
    }
}

