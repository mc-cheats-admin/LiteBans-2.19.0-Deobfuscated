package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import litebans.aJ;
import litebans.aR;
import litebans.ch;
import litebans.d7;
import litebans.dG;
import litebans.di_0;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.jT;
import litebans.kL;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class dc_0
implements List,
dG {
    private final di_0 g;
    private final ch e;
    private final boolean c;
    private final ArrayList a;
    private kL f;
    private final q_0 b;
    private static /* synthetic */ String[] d;

    public dc_0(@NotNull di_0 di_02, @NotNull ch ch2, boolean bl, @NotNull ArrayList arrayList) {
        this.g = di_02;
        this.e = ch2;
        this.c = bl;
        this.a = arrayList;
        this.f = kL.k;
        this.b = (q_0)this.g.a(q_0.class);
    }

    public /* synthetic */ dc_0(di_0 di_02, ch ch2, boolean bl, ArrayList arrayList, int n, aJ aJ2) {
        if ((n & 8) != 0) {
            arrayList = new ArrayList();
        }
        this(di_02, ch2, bl, arrayList);
    }

    public final boolean c() {
        return this.c;
    }

    public final ArrayList b() {
        return this.a;
    }

    public final void a(@NotNull kL kL2) {
        this.f = kL2;
    }

    public final q_0 e() {
        return this.b;
    }

    public final void a(@NotNull jT jT2) {
        boolean bl = ew.a((Object)this.b.f().aF(), (Object)"mysql");
        if (this.c || !this.e.b(this.f, (String)jT2.b(), bl)) {
            Object object = ((eo_0)jT2.e()).a(this.f);
            if (object instanceof Object[]) {
                dc_0 dc_02 = this;
                Object[] objectArray = (Object[])object;
                boolean bl2 = false;
                Object[] objectArray2 = objectArray;
                boolean bl3 = false;
                int n = objectArray2.length;
                for (int i = 0; i < n; ++i) {
                    Object object2;
                    Object object3 = object2 = objectArray2[i];
                    boolean bl4 = false;
                    Collection collection = dc_02.b();
                    ew.b(object3, "");
                    collection.add((aR)object3);
                }
            } else {
                Collection collection = this.a;
                ew.b(object, "");
                collection.add((aR)object);
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public boolean a(@NotNull String string) {
        return this.a.contains(aR.d(string));
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        return this.a.containsAll(collection);
    }

    public String a(int n) {
        return ((aR)this.a.get(n)).c();
    }

    public int b(@NotNull String string) {
        return this.a.indexOf(aR.d(string));
    }

    public int c(@NotNull String string) {
        return this.a.lastIndexOf(aR.d(string));
    }

    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    public ListIterator listIterator(int n) {
        return this.a.listIterator(n);
    }

    public List subList(int n, int n2) {
        return this.a.subList(n, n2);
    }

    public int a() {
        return this.a.size();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof aR)) {
            return false;
        }
        return this.a(((aR)object).c());
    }

    public Object get(int n) {
        return aR.d(this.a(n));
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof aR)) {
            return -1;
        }
        return this.b(((aR)object).c());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof aR)) {
            return -1;
        }
        return this.c(((aR)object).c());
    }

    @Override
    public final int size() {
        return this.a();
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return d7.a(this, objectArray);
    }

    @Override
    public Object[] toArray() {
        return d7.a(this);
    }

    private static final void d() {
        d = new String[]{"", "mysql", "", "", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
    }

    static {
        dc_0.d();
    }
}

