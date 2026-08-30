package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.ll;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.gB
 */
public static abstract class gb_0
implements Collection,
dG {
    private static /* synthetic */ String[] a;

    protected gb_0() {
    }

    public abstract int a();

    @Override
    public abstract Iterator iterator();

    @Override
    public boolean contains(Object object) {
        boolean bl;
        block3: {
            Iterable iterable = this;
            boolean bl2 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                bl = false;
            } else {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object t2;
                    Object t3 = t2 = iterator.next();
                    boolean bl3 = false;
                    if (!ew.a(t3, object)) continue;
                    bl = true;
                    break block3;
                }
                bl = false;
            }
        }
        return bl;
    }

    public boolean containsAll(@NotNull Collection collection) {
        boolean bl;
        block3: {
            ew.a((Object)collection, a[0]);
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
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        return ll.a(this, a[1], a[2], a[3], 0, null, arg_0 -> gb_0.a(this, arg_0), 24, null);
    }

    @Override
    public Object[] toArray() {
        return d7.a(this);
    }

    public Object[] toArray(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, a[4]);
        return d7.a(this, objectArray);
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException(a[5]);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException(a[6]);
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(a[7]);
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(a[8]);
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(a[9]);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(a[10]);
    }

    private static final CharSequence a(gb_0 gb_02, Object object) {
        return object == gb_02 ? (CharSequence)a[11] : (CharSequence)String.valueOf(object);
    }

    @Override
    public final int size() {
        return this.a();
    }

    private static final void b() {
        a = new String[]{hl.a("\u93c6\u93cf\u93c6\u93ce\u93c6\u93cd\u93d7\u93d0", -714697821), hl.a("\u5312\u531e", 1408521022), hl.a("\u6a73", -960533976), hl.a("\ua83c", -1458329503), hl.a("\ua174\ua167\ua167\ua174\ua16c", -225140459), hl.a("\u0110\u012f\u013a\u012d\u013e\u012b\u0136\u0130\u0131\u017f\u0136\u012c\u017f\u0131\u0130\u012b\u017f\u012c\u012a\u012f\u012f\u0130\u012d\u012b\u013a\u013b\u017f\u0139\u0130\u012d\u017f\u012d\u013a\u013e\u013b\u0172\u0130\u0131\u0133\u0126\u017f\u013c\u0130\u0133\u0133\u013a\u013c\u012b\u0136\u0130\u0131", 539427167), hl.a("\ufc49\ufc76\ufc63\ufc74\ufc67\ufc72\ufc6f\ufc69\ufc68\ufc26\ufc6f\ufc75\ufc26\ufc68\ufc69\ufc72\ufc26\ufc75\ufc73\ufc76\ufc76\ufc69\ufc74\ufc72\ufc63\ufc62\ufc26\ufc60\ufc69\ufc74\ufc26\ufc74\ufc63\ufc67\ufc62\ufc2b\ufc69\ufc68\ufc6a\ufc7f\ufc26\ufc65\ufc69\ufc6a\ufc6a\ufc63\ufc65\ufc72\ufc6f\ufc69\ufc68", -717292538), hl.a("\u79bc\u7983\u7996\u7981\u7992\u7987\u799a\u799c\u799d\u79d3\u799a\u7980\u79d3\u799d\u799c\u7987\u79d3\u7980\u7986\u7983\u7983\u799c\u7981\u7987\u7996\u7997\u79d3\u7995\u799c\u7981\u79d3\u7981\u7996\u7992\u7997\u79de\u799c\u799d\u799f\u798a\u79d3\u7990\u799c\u799f\u799f\u7996\u7990\u7987\u799a\u799c\u799d", 1128561139), hl.a("\u3a0b\u3a34\u3a21\u3a36\u3a25\u3a30\u3a2d\u3a2b\u3a2a\u3a64\u3a2d\u3a37\u3a64\u3a2a\u3a2b\u3a30\u3a64\u3a37\u3a31\u3a34\u3a34\u3a2b\u3a36\u3a30\u3a21\u3a20\u3a64\u3a22\u3a2b\u3a36\u3a64\u3a36\u3a21\u3a25\u3a20\u3a69\u3a2b\u3a2a\u3a28\u3a3d\u3a64\u3a27\u3a2b\u3a28\u3a28\u3a21\u3a27\u3a30\u3a2d\u3a2b\u3a2a", 1323711044), hl.a("\u27ae\u2791\u2784\u2793\u2780\u2795\u2788\u278e\u278f\u27c1\u2788\u2792\u27c1\u278f\u278e\u2795\u27c1\u2792\u2794\u2791\u2791\u278e\u2793\u2795\u2784\u2785\u27c1\u2787\u278e\u2793\u27c1\u2793\u2784\u2780\u2785\u27cc\u278e\u278f\u278d\u2798\u27c1\u2782\u278e\u278d\u278d\u2784\u2782\u2795\u2788\u278e\u278f", 51521505), hl.a("\u38e4\u38db\u38ce\u38d9\u38ca\u38df\u38c2\u38c4\u38c5\u388b\u38c2\u38d8\u388b\u38c5\u38c4\u38df\u388b\u38d8\u38de\u38db\u38db\u38c4\u38d9\u38df\u38ce\u38cf\u388b\u38cd\u38c4\u38d9\u388b\u38d9\u38ce\u38ca\u38cf\u3886\u38c4\u38c5\u38c7\u38d2\u388b\u38c8\u38c4\u38c7\u38c7\u38ce\u38c8\u38df\u38c2\u38c4\u38c5", -1822213973), hl.a("\u0dd1\u0d8d\u0d91\u0d90\u0d8a\u0dd9\u0dba\u0d96\u0d95\u0d95\u0d9c\u0d9a\u0d8d\u0d90\u0d96\u0d97\u0dd0", 255856121)};
    }

    static {
        gb_0.b();
    }
}

