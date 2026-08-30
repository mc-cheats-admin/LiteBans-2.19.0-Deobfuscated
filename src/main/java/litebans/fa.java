package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bt_0;
import litebans.ch;
import litebans.di_0;
import litebans.fB;
import litebans.fg_0;
import litebans.g3;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jW;
import litebans.jv_0;
import litebans.ll;
import litebans.lo_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fa
extends fB
implements jW {
    private static /* synthetic */ String[] i;

    public fa(@NotNull di_0 di_02) {
        super("history", di_02);
    }

    @Override
    public CharSequence a() {
        return am.j;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block9: {
            Object object = this;
            boolean bl = false;
            object = (w)((fg_0)object).h().a(w.class);
            bl = false;
            try {
                ch ch2 = ((w)object).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2 = (ch)closeable;
                    boolean bl2 = false;
                    ch ch3 = ch2;
                    boolean bl3 = false;
                    Object object3 = this;
                    boolean bl4 = false;
                    String string = aa_0.a((fg_0)object3, (String)lo_0.b(stringArray));
                    object3 = aa_0.a(ch3, string, false);
                    String string2 = (String)lo_0.a((Object[])stringArray, 1);
                    a_ a_2 = a_.l.a(string2);
                    String string3 = aa_0.a(this, jv_02, stringArray, null, 4, null);
                    if (((iA)object3).b() == null) {
                        fg_0.a.a(string + "'s uuid is null");
                        throw new as();
                    }
                    int n = g3.a((jW)this, ch3.e(), stringArray, ll.e(), 0, 8, null);
                    a_ a_3 = a_2;
                    List list = a_3 != null ? ll.a(a_3) : a_.l.a();
                    Iterable iterable = list;
                    boolean bl5 = false;
                    Iterable iterable2 = iterable;
                    Collection collection = new ArrayList();
                    boolean bl6 = false;
                    for (Object t2 : iterable2) {
                        a_ a_4 = (a_)t2;
                        boolean bl7 = false;
                        Iterable iterable3 = ch3.a((iA)object3, a_4, string3, false, n);
                        ll.a(collection, iterable3);
                    }
                    List list2 = ll.e((List)collection);
                    g3.a(this, ch3, list2, (iA)object3, stringArray, null, 0, 24, null);
                    object2 = iv_0.a;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    bt_0.a(closeable, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object).b(sQLException)) break block9;
                throw sQLException;
            }
        }
    }

    @Override
    public int a(@NotNull di_0 di_02, @Nullable String[] stringArray, @NotNull Collection collection, int n) {
        return g3.a(this, di_02, stringArray, collection, n);
    }

    @Override
    public void a(@NotNull ch ch2, @NotNull Collection collection, @Nullable iA iA2, @Nullable String[] stringArray, @NotNull fB fB2, int n) {
        g3.a((jW)this, ch2, collection, iA2, stringArray, fB2, n);
    }

    @Override
    public iA a(@NotNull ch ch2, @NotNull HashMap hashMap, @Nullable String string) {
        return g3.a(this, ch2, hashMap, string);
    }

    private static final void a() {
        i = new String[]{"history", "'s uuid is null"};
    }

    static {
        fa.a();
    }
}

