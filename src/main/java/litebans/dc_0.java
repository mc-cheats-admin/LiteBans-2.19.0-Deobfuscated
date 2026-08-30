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

/*
 * Renamed from litebans.dC
 */
public static final class dc_0
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
        boolean bl = ew.a((Object)this.b.f().aF(), (Object)d[1]);
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
                    ew.b(object3, d[2]);
                    collection.add((aR)object3);
                }
            } else {
                Collection collection = this.a;
                ew.b(object, d[3]);
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
        throw new UnsupportedOperationException(d[6]);
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(d[7]);
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException(d[8]);
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(d[9]);
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(d[10]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(d[11]);
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException(d[14]);
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException(d[15]);
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException(d[16]);
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
        throw new UnsupportedOperationException(d[21]);
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException(d[22]);
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException(d[23]);
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
        d = new String[]{hl.a("", 1996145888), hl.a("\u7a31\u7a25\u7a2f\u7a2d\u7a30", 1601600092), hl.a("", -1509756563), hl.a("", 1777077701), hl.a("\u6ba8\u6b97\u6b82\u6b95\u6b86\u6b93\u6b8e\u6b88\u6b89\u6bc7\u6b8e\u6b94\u6bc7\u6b89\u6b88\u6b93\u6bc7\u6b94\u6b92\u6b97\u6b97\u6b88\u6b95\u6b93\u6b82\u6b83\u6bc7\u6b81\u6b88\u6b95\u6bc7\u6b95\u6b82\u6b86\u6b83\u6bca\u6b88\u6b89\u6b8b\u6b9e\u6bc7\u6b84\u6b88\u6b8b\u6b8b\u6b82\u6b84\u6b93\u6b8e\u6b88\u6b89", -156931097), hl.a("\ua0a3\ua09c\ua089\ua09e\ua08d\ua098\ua085\ua083\ua082\ua0cc\ua085\ua09f\ua0cc\ua082\ua083\ua098\ua0cc\ua09f\ua099\ua09c\ua09c\ua083\ua09e\ua098\ua089\ua088\ua0cc\ua08a\ua083\ua09e\ua0cc\ua09e\ua089\ua08d\ua088\ua0c1\ua083\ua082\ua080\ua095\ua0cc\ua08f\ua083\ua080\ua080\ua089\ua08f\ua098\ua085\ua083\ua082", -275406612), hl.a("\uaee8\uaed7\uaec2\uaed5\uaec6\uaed3\uaece\uaec8\uaec9\uae87\uaece\uaed4\uae87\uaec9\uaec8\uaed3\uae87\uaed4\uaed2\uaed7\uaed7\uaec8\uaed5\uaed3\uaec2\uaec3\uae87\uaec1\uaec8\uaed5\uae87\uaed5\uaec2\uaec6\uaec3\uae8a\uaec8\uaec9\uaecb\uaede\uae87\uaec4\uaec8\uaecb\uaecb\uaec2\uaec4\uaed3\uaece\uaec8\uaec9", -355553625), hl.a("\u66ae\u6691\u6684\u6693\u6680\u6695\u6688\u668e\u668f\u66c1\u6688\u6692\u66c1\u668f\u668e\u6695\u66c1\u6692\u6694\u6691\u6691\u668e\u6693\u6695\u6684\u6685\u66c1\u6687\u668e\u6693\u66c1\u6693\u6684\u6680\u6685\u66cc\u668e\u668f\u668d\u6698\u66c1\u6682\u668e\u668d\u668d\u6684\u6682\u6695\u6688\u668e\u668f", 25913057), hl.a("\u1aa6\u1a99\u1a8c\u1a9b\u1a88\u1a9d\u1a80\u1a86\u1a87\u1ac9\u1a80\u1a9a\u1ac9\u1a87\u1a86\u1a9d\u1ac9\u1a9a\u1a9c\u1a99\u1a99\u1a86\u1a9b\u1a9d\u1a8c\u1a8d\u1ac9\u1a8f\u1a86\u1a9b\u1ac9\u1a9b\u1a8c\u1a88\u1a8d\u1ac4\u1a86\u1a87\u1a85\u1a90\u1ac9\u1a8a\u1a86\u1a85\u1a85\u1a8c\u1a8a\u1a9d\u1a80\u1a86\u1a87", 1708333801), hl.a("\u4f4d\u4f72\u4f67\u4f70\u4f63\u4f76\u4f6b\u4f6d\u4f6c\u4f22\u4f6b\u4f71\u4f22\u4f6c\u4f6d\u4f76\u4f22\u4f71\u4f77\u4f72\u4f72\u4f6d\u4f70\u4f76\u4f67\u4f66\u4f22\u4f64\u4f6d\u4f70\u4f22\u4f70\u4f67\u4f63\u4f66\u4f2f\u4f6d\u4f6c\u4f6e\u4f7b\u4f22\u4f61\u4f6d\u4f6e\u4f6e\u4f67\u4f61\u4f76\u4f6b\u4f6d\u4f6c", 1942769410), hl.a("\u35c7\u35f8\u35ed\u35fa\u35e9\u35fc\u35e1\u35e7\u35e6\u35a8\u35e1\u35fb\u35a8\u35e6\u35e7\u35fc\u35a8\u35fb\u35fd\u35f8\u35f8\u35e7\u35fa\u35fc\u35ed\u35ec\u35a8\u35ee\u35e7\u35fa\u35a8\u35fa\u35ed\u35e9\u35ec\u35a5\u35e7\u35e6\u35e4\u35f1\u35a8\u35eb\u35e7\u35e4\u35e4\u35ed\u35eb\u35fc\u35e1\u35e7\u35e6", -500681336), hl.a("\uadf9\uadc6\uadd3\uadc4\uadd7\uadc2\uaddf\uadd9\uadd8\uad96\uaddf\uadc5\uad96\uadd8\uadd9\uadc2\uad96\uadc5\uadc3\uadc6\uadc6\uadd9\uadc4\uadc2\uadd3\uadd2\uad96\uadd0\uadd9\uadc4\uad96\uadc4\uadd3\uadd7\uadd2\uad9b\uadd9\uadd8\uadda\uadcf\uad96\uadd5\uadd9\uadda\uadda\uadd3\uadd5\uadc2\uaddf\uadd9\uadd8", -638145098), hl.a("\ubb63\ubb5c\ubb49\ubb5e\ubb4d\ubb58\ubb45\ubb43\ubb42\ubb0c\ubb45\ubb5f\ubb0c\ubb42\ubb43\ubb58\ubb0c\ubb5f\ubb59\ubb5c\ubb5c\ubb43\ubb5e\ubb58\ubb49\ubb48\ubb0c\ubb4a\ubb43\ubb5e\ubb0c\ubb5e\ubb49\ubb4d\ubb48\ubb01\ubb43\ubb42\ubb40\ubb55\ubb0c\ubb4f\ubb43\ubb40\ubb40\ubb49\ubb4f\ubb58\ubb45\ubb43\ubb42", -479151316), hl.a("\u25cc\u25f3\u25e6\u25f1\u25e2\u25f7\u25ea\u25ec\u25ed\u25a3\u25ea\u25f0\u25a3\u25ed\u25ec\u25f7\u25a3\u25f0\u25f6\u25f3\u25f3\u25ec\u25f1\u25f7\u25e6\u25e7\u25a3\u25e5\u25ec\u25f1\u25a3\u25f1\u25e6\u25e2\u25e7\u25ae\u25ec\u25ed\u25ef\u25fa\u25a3\u25e0\u25ec\u25ef\u25ef\u25e6\u25e0\u25f7\u25ea\u25ec\u25ed", -445045373), hl.a("\u38ce\u38f1\u38e4\u38f3\u38e0\u38f5\u38e8\u38ee\u38ef\u38a1\u38e8\u38f2\u38a1\u38ef\u38ee\u38f5\u38a1\u38f2\u38f4\u38f1\u38f1\u38ee\u38f3\u38f5\u38e4\u38e5\u38a1\u38e7\u38ee\u38f3\u38a1\u38f3\u38e4\u38e0\u38e5\u38ac\u38ee\u38ef\u38ed\u38f8\u38a1\u38e2\u38ee\u38ed\u38ed\u38e4\u38e2\u38f5\u38e8\u38ee\u38ef", -1398982527), hl.a("\u82ed\u82d2\u82c7\u82d0\u82c3\u82d6\u82cb\u82cd\u82cc\u8282\u82cb\u82d1\u8282\u82cc\u82cd\u82d6\u8282\u82d1\u82d7\u82d2\u82d2\u82cd\u82d0\u82d6\u82c7\u82c6\u8282\u82c4\u82cd\u82d0\u8282\u82d0\u82c7\u82c3\u82c6\u828f\u82cd\u82cc\u82ce\u82db\u8282\u82c1\u82cd\u82ce\u82ce\u82c7\u82c1\u82d6\u82cb\u82cd\u82cc", -1650031966), hl.a("\u3211\u322e\u323b\u322c\u323f\u322a\u3237\u3231\u3230\u327e\u3237\u322d\u327e\u3230\u3231\u322a\u327e\u322d\u322b\u322e\u322e\u3231\u322c\u322a\u323b\u323a\u327e\u3238\u3231\u322c\u327e\u322c\u323b\u323f\u323a\u3273\u3231\u3230\u3232\u3227\u327e\u323d\u3231\u3232\u3232\u323b\u323d\u322a\u3237\u3231\u3230", 1044853342), hl.a("\uedec\uedd3\uedc6\uedd1\uedc2\uedd7\uedca\uedcc\uedcd\ued83\uedca\uedd0\ued83\uedcd\uedcc\uedd7\ued83\uedd0\uedd6\uedd3\uedd3\uedcc\uedd1\uedd7\uedc6\uedc7\ued83\uedc5\uedcc\uedd1\ued83\uedd1\uedc6\uedc2\uedc7\ued8e\uedcc\uedcd\uedcf\uedda\ued83\uedc0\uedcc\uedcf\uedcf\uedc6\uedc0\uedd7\uedca\uedcc\uedcd", -763105885), hl.a("\u0646\u0679\u066c\u067b\u0668\u067d\u0660\u0666\u0667\u0629\u0660\u067a\u0629\u0667\u0666\u067d\u0629\u067a\u067c\u0679\u0679\u0666\u067b\u067d\u066c\u066d\u0629\u066f\u0666\u067b\u0629\u067b\u066c\u0668\u066d\u0624\u0666\u0667\u0665\u0670\u0629\u066a\u0666\u0665\u0665\u066c\u066a\u067d\u0660\u0666\u0667", -713816567), hl.a("\u87bd\u8782\u8797\u8780\u8793\u8786\u879b\u879d\u879c\u87d2\u879b\u8781\u87d2\u879c\u879d\u8786\u87d2\u8781\u8787\u8782\u8782\u879d\u8780\u8786\u8797\u8796\u87d2\u8794\u879d\u8780\u87d2\u8780\u8797\u8793\u8796\u87df\u879d\u879c\u879e\u878b\u87d2\u8791\u879d\u879e\u879e\u8797\u8791\u8786\u879b\u879d\u879c", 736331762), hl.a("\u7da6\u7d99\u7d8c\u7d9b\u7d88\u7d9d\u7d80\u7d86\u7d87\u7dc9\u7d80\u7d9a\u7dc9\u7d87\u7d86\u7d9d\u7dc9\u7d9a\u7d9c\u7d99\u7d99\u7d86\u7d9b\u7d9d\u7d8c\u7d8d\u7dc9\u7d8f\u7d86\u7d9b\u7dc9\u7d9b\u7d8c\u7d88\u7d8d\u7dc4\u7d86\u7d87\u7d85\u7d90\u7dc9\u7d8a\u7d86\u7d85\u7d85\u7d8c\u7d8a\u7d9d\u7d80\u7d86\u7d87", 532315625), hl.a("\u9c2b\u9c14\u9c01\u9c16\u9c05\u9c10\u9c0d\u9c0b\u9c0a\u9c44\u9c0d\u9c17\u9c44\u9c0a\u9c0b\u9c10\u9c44\u9c17\u9c11\u9c14\u9c14\u9c0b\u9c16\u9c10\u9c01\u9c00\u9c44\u9c02\u9c0b\u9c16\u9c44\u9c16\u9c01\u9c05\u9c00\u9c49\u9c0b\u9c0a\u9c08\u9c1d\u9c44\u9c07\u9c0b\u9c08\u9c08\u9c01\u9c07\u9c10\u9c0d\u9c0b\u9c0a", 1652923492), hl.a("\uf167\uf158\uf14d\uf15a\uf149\uf15c\uf141\uf147\uf146\uf108\uf141\uf15b\uf108\uf146\uf147\uf15c\uf108\uf15b\uf15d\uf158\uf158\uf147\uf15a\uf15c\uf14d\uf14c\uf108\uf14e\uf147\uf15a\uf108\uf15a\uf14d\uf149\uf14c\uf105\uf147\uf146\uf144\uf151\uf108\uf14b\uf147\uf144\uf144\uf14d\uf14b\uf15c\uf141\uf147\uf146", -818810584), hl.a("\u28fe\u28c1\u28d4\u28c3\u28d0\u28c5\u28d8\u28de\u28df\u2891\u28d8\u28c2\u2891\u28df\u28de\u28c5\u2891\u28c2\u28c4\u28c1\u28c1\u28de\u28c3\u28c5\u28d4\u28d5\u2891\u28d7\u28de\u28c3\u2891\u28c3\u28d4\u28d0\u28d5\u289c\u28de\u28df\u28dd\u28c8\u2891\u28d2\u28de\u28dd\u28dd\u28d4\u28d2\u28c5\u28d8\u28de\u28df", -1763039055), hl.a("\u0899\u08a6\u08b3\u08a4\u08b7\u08a2\u08bf\u08b9\u08b8\u08f6\u08bf\u08a5\u08f6\u08b8\u08b9\u08a2\u08f6\u08a5\u08a3\u08a6\u08a6\u08b9\u08a4\u08a2\u08b3\u08b2\u08f6\u08b0\u08b9\u08a4\u08f6\u08a4\u08b3\u08b7\u08b2\u08fb\u08b9\u08b8\u08ba\u08af\u08f6\u08b5\u08b9\u08ba\u08ba\u08b3\u08b5\u08a2\u08bf\u08b9\u08b8", 268110038), hl.a("\u1593\u15ac\u15b9\u15ae\u15bd\u15a8\u15b5\u15b3\u15b2\u15fc\u15b5\u15af\u15fc\u15b2\u15b3\u15a8\u15fc\u15af\u15a9\u15ac\u15ac\u15b3\u15ae\u15a8\u15b9\u15b8\u15fc\u15ba\u15b3\u15ae\u15fc\u15ae\u15b9\u15bd\u15b8\u15f1\u15b3\u15b2\u15b0\u15a5\u15fc\u15bf\u15b3\u15b0\u15b0\u15b9\u15bf\u15a8\u15b5\u15b3\u15b2", 1175393756), hl.a("\u6571\u654e\u655b\u654c\u655f\u654a\u6557\u6551\u6550\u651e\u6557\u654d\u651e\u6550\u6551\u654a\u651e\u654d\u654b\u654e\u654e\u6551\u654c\u654a\u655b\u655a\u651e\u6558\u6551\u654c\u651e\u654c\u655b\u655f\u655a\u6513\u6551\u6550\u6552\u6547\u651e\u655d\u6551\u6552\u6552\u655b\u655d\u654a\u6557\u6551\u6550", -796105410), hl.a("\u7f07\u7f38\u7f2d\u7f3a\u7f29\u7f3c\u7f21\u7f27\u7f26\u7f68\u7f21\u7f3b\u7f68\u7f26\u7f27\u7f3c\u7f68\u7f3b\u7f3d\u7f38\u7f38\u7f27\u7f3a\u7f3c\u7f2d\u7f2c\u7f68\u7f2e\u7f27\u7f3a\u7f68\u7f3a\u7f2d\u7f29\u7f2c\u7f65\u7f27\u7f26\u7f24\u7f31\u7f68\u7f2b\u7f27\u7f24\u7f24\u7f2d\u7f2b\u7f3c\u7f21\u7f27\u7f26", 1663336264)};
    }

    static {
        dc_0.d();
    }
}

