package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import org.jetbrains.annotations.NotNull;

public final class SQLConnectionHandler
implements List,
LiteBansModule_122 {
    private final PlatformPlugin g;
    private final LiteBansModule_82 e;
    private final boolean c;
    private final ArrayList BaseCoreGenericHandler;
    private BansHandler_2 LiteBansModule_194;
    private final ConfigService LiteBansModule_31;
    public SQLConnectionHandler(@NotNull PlatformPlugin plugin, @NotNull LiteBansModule_82 ch2, boolean flag, @NotNull ArrayList arrayList) {
        this.g = plugin;
        this.e = ch2;
        this.c = flag;
        this.plugin = arrayList;
        this.LiteBansModule_194 = BansHandler_2.Utf8Handler_2;
        this.LiteBansModule_31 = (ConfigService)this.g.BaseCoreGenericHandler(ConfigService.class);
    }

    public /* synthetic */ SQLConnectionHandler(PlatformPlugin plugin, LiteBansModule_82 ch2, boolean flag, ArrayList arrayList, int n, LiteBansModule_14 aJ2) {
        if ((n & 8) != 0) {
            arrayList = new ArrayList();
        }
        this(plugin, ch2, flag, arrayList);
    }

    public final boolean c() {
        return this.c;
    }

    public final ArrayList LiteBansModule_31() {
        return this.plugin;
    }

    public final void BaseCoreGenericHandler(@NotNull BansHandler_2 kL2) {
        this.LiteBansModule_194 = kL2;
    }

    public final ConfigService e() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_354 jT2) {
        boolean flag = ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_31.LiteBansModule_194().ElementsHandler(), (Object)"mysql");
        if (this.c || !this.e.LiteBansModule_31(this.LiteBansModule_194, (String)jT2.LiteBansModule_31(), flag)) {
            Object object = ((LiteBansModule_178)jT2.e()).BaseCoreGenericHandler(this.LiteBansModule_194);
            if (object instanceof Object[]) {
                SQLConnectionHandler dc_02 = this;
                Object[] objectArray = (Object[])object;
                Object[] objectArray2 = objectArray;
                int n = objectArray2.length;
                for (int i = 0; i < n; ++i) {
                    Object object2;
                    Object object3 = object2 = objectArray2[i];
                    Collection collection = dc_02.LiteBansModule_31();
                    ObjectUtilities.LiteBansModule_31(object3, "");
                    collection.add((SQLiteDriverHandler)object3);
} else {
                Collection collection = this.plugin;
                ObjectUtilities.LiteBansModule_31(object, "");
                collection.add((SQLiteDriverHandler)object);
}

    @Override
    public boolean isEmpty() {
        return this.plugin.isEmpty();
    }

    public boolean BaseCoreGenericHandler(@NotNull String string) {
        return this.plugin.contains(SQLiteDriverHandler.AsyncBackgroundTask_5(string));
    }

    @Override
    public Iterator iterator() {
        return this.plugin.iterator();
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        return this.plugin.containsAll(collection);
    }

    public String BaseCoreGenericHandler(int n) {
        return ((SQLiteDriverHandler)this.plugin.get(n)).c();
    }

    public int LiteBansModule_31(@NotNull String string) {
        return this.plugin.indexOf(SQLiteDriverHandler.AsyncBackgroundTask_5(string));
    }

    public int c(@NotNull String string) {
        return this.plugin.lastIndexOf(SQLiteDriverHandler.AsyncBackgroundTask_5(string));
    }

    public ListIterator listIterator() {
        return this.plugin.listIterator();
    }

    public ListIterator listIterator(int n) {
        return this.plugin.listIterator(n);
    }

    public List subList(int n, int n2) {
        return this.plugin.subList(n, n2);
    }

    public int BaseCoreGenericHandler() {
        return this.plugin.size();
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
        if (!(object instanceof SQLiteDriverHandler)) {
            return false;
        }
        return this.plugin(((SQLiteDriverHandler)object).c());
    }

    public Object get(int n) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin(n));
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof SQLiteDriverHandler)) {
            return -1;
        }
        return this.LiteBansModule_31(((SQLiteDriverHandler)object).c());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof SQLiteDriverHandler)) {
            return -1;
        }
        return this.c(((SQLiteDriverHandler)object).c());
    }

    @Override
    public final int size() {
        return this.plugin();
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
        return CollectionHandler.BaseCoreGenericHandler(this, objectArray);
    }

    @Override
    public Object[] toArray() {
        return CollectionHandler.BaseCoreGenericHandler(this);
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"", "mysql", "", "", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
}

