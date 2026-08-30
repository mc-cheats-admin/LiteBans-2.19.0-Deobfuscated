package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.d2;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.ll;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

static final class h_
implements Collection,
dG {
    private final Object[] a;
    private final boolean c;
    private static /* synthetic */ String[] b;

    public h_(@NotNull Object[] objectArray, boolean bl) {
        ew.a((Object)objectArray, b[0]);
        this.a = objectArray;
        this.c = bl;
    }

    public int a() {
        return this.a.length;
    }

    @Override
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override
    public boolean contains(Object object) {
        return lo_0.b(this.a, object);
    }

    public boolean containsAll(@NotNull Collection collection) {
        boolean bl;
        block3: {
            ew.a((Object)collection, b[1]);
            Iterable iterable = collection;
            boolean bl2 = false;
            if (((Collection)iterable).isEmpty()) {
                bl = true;
            } else {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object t2;
                    Object t3 = t2 = iterator.next();
                    boolean bl3 = false;
                    if (this.contains(t3)) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public Iterator iterator() {
        return d2.a(this.a);
    }

    @Override
    public final Object[] toArray() {
        return ll.a(this.a, this.c);
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException(b[2]);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException(b[3]);
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(b[4]);
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(b[5]);
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(b[6]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(b[7]);
    }

    @Override
    public final int size() {
        return this.a();
    }

    public Object[] toArray(Object[] objectArray) {
        ew.a((Object)objectArray, b[8]);
        return d7.a(this, objectArray);
    }

    private static final void b() {
        b = new String[]{hl.a("\ue363\ue374\ue379\ue360\ue370\ue366", -821107947), hl.a("\u6609\u6600\u6609\u6601\u6609\u6602\u6618\u661f", 1620403820), hl.a("\u1552\u156d\u1578\u156f\u157c\u1569\u1574\u1572\u1573\u153d\u1574\u156e\u153d\u1573\u1572\u1569\u153d\u156e\u1568\u156d\u156d\u1572\u156f\u1569\u1578\u1579\u153d\u157b\u1572\u156f\u153d\u156f\u1578\u157c\u1579\u1530\u1572\u1573\u1571\u1564\u153d\u157e\u1572\u1571\u1571\u1578\u157e\u1569\u1574\u1572\u1573", 958141725), hl.a("\udcea\udcd5\udcc0\udcd7\udcc4\udcd1\udccc\udcca\udccb\udc85\udccc\udcd6\udc85\udccb\udcca\udcd1\udc85\udcd6\udcd0\udcd5\udcd5\udcca\udcd7\udcd1\udcc0\udcc1\udc85\udcc3\udcca\udcd7\udc85\udcd7\udcc0\udcc4\udcc1\udc88\udcca\udccb\udcc9\udcdc\udc85\udcc6\udcca\udcc9\udcc9\udcc0\udcc6\udcd1\udccc\udcca\udccb", 2111823013), hl.a("\uea46\uea79\uea6c\uea7b\uea68\uea7d\uea60\uea66\uea67\uea29\uea60\uea7a\uea29\uea67\uea66\uea7d\uea29\uea7a\uea7c\uea79\uea79\uea66\uea7b\uea7d\uea6c\uea6d\uea29\uea6f\uea66\uea7b\uea29\uea7b\uea6c\uea68\uea6d\uea24\uea66\uea67\uea65\uea70\uea29\uea6a\uea66\uea65\uea65\uea6c\uea6a\uea7d\uea60\uea66\uea67", 1660217865), hl.a("\ue5dc\ue5e3\ue5f6\ue5e1\ue5f2\ue5e7\ue5fa\ue5fc\ue5fd\ue5b3\ue5fa\ue5e0\ue5b3\ue5fd\ue5fc\ue5e7\ue5b3\ue5e0\ue5e6\ue5e3\ue5e3\ue5fc\ue5e1\ue5e7\ue5f6\ue5f7\ue5b3\ue5f5\ue5fc\ue5e1\ue5b3\ue5e1\ue5f6\ue5f2\ue5f7\ue5be\ue5fc\ue5fd\ue5ff\ue5ea\ue5b3\ue5f0\ue5fc\ue5ff\ue5ff\ue5f6\ue5f0\ue5e7\ue5fa\ue5fc\ue5fd", -1413814893), hl.a("\u2c07\u2c38\u2c2d\u2c3a\u2c29\u2c3c\u2c21\u2c27\u2c26\u2c68\u2c21\u2c3b\u2c68\u2c26\u2c27\u2c3c\u2c68\u2c3b\u2c3d\u2c38\u2c38\u2c27\u2c3a\u2c3c\u2c2d\u2c2c\u2c68\u2c2e\u2c27\u2c3a\u2c68\u2c3a\u2c2d\u2c29\u2c2c\u2c65\u2c27\u2c26\u2c24\u2c31\u2c68\u2c2b\u2c27\u2c24\u2c24\u2c2d\u2c2b\u2c3c\u2c21\u2c27\u2c26", 276769864), hl.a("\u991d\u9922\u9937\u9920\u9933\u9926\u993b\u993d\u993c\u9972\u993b\u9921\u9972\u993c\u993d\u9926\u9972\u9921\u9927\u9922\u9922\u993d\u9920\u9926\u9937\u9936\u9972\u9934\u993d\u9920\u9972\u9920\u9937\u9933\u9936\u997f\u993d\u993c\u993e\u992b\u9972\u9931\u993d\u993e\u993e\u9937\u9931\u9926\u993b\u993d\u993c", -1010919086), hl.a("\u9956\u9945\u9945\u9956\u994e", -609904329)};
    }

    static {
        h_.b();
    }
}

