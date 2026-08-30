package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.as_0;
import litebans.bF;
import litebans.bt_0;
import litebans.ch;
import litebans.di_0;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jm_0;
import litebans.jv_0;
import litebans.kR;
import litebans.kq_0;
import litebans.ll;
import litebans.lo_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fy_0
extends fB {
    private static /* synthetic */ String[] i;

    public fy_0(@NotNull di_0 di_02) {
        super("namehistory", di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block10: {
            fg_0 fg_02 = this;
            boolean bl = false;
            String string = aa_0.a(fg_02, (String)lo_0.b(stringArray));
            int n = 0;
            n = kq_0.a(stringArray, 1, 10);
            Object object = this;
            boolean bl2 = false;
            object = (w)((fg_0)object).h().a(w.class);
            bl2 = false;
            try {
                ch ch2 = ((w)object).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2 = (ch)closeable;
                    boolean bl3 = false;
                    ch ch3 = ch2;
                    boolean bl4 = false;
                    List list = ch3.a(string);
                    Object object3 = fg_0.a;
                    boolean bl5 = list.isEmpty();
                    CharSequence charSequence = am.M;
                    int n2 = 0;
                    Object object42 = object3;
                    boolean bl6 = false;
                    if (bl5) {
                        fo_0 fo_02 = object42;
                        boolean bl7 = false;
                        fo_02.a(charSequence);
                        throw new as();
                    }
                    aa_0.a((fg_0)this, ch3.a((CharSequence)bF.a((CharSequence)am.dH.a("target", (Object)string), (CharSequence)"limit", n)));
                    Iterable iterable = list;
                    boolean bl8 = false;
                    n2 = as_0.c(jm_0.a(ll.a(iterable, 10)), 16);
                    object42 = iterable;
                    Object object5 = new LinkedHashMap(n2);
                    boolean bl9 = false;
                    Iterator iterator = object42.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        iA iA2 = (iA)t2;
                        Map map = object5;
                        boolean bl10 = false;
                        map.put(iA2.a(), t2);
                    }
                    object3 = object5;
                    iterable = ll.a((Iterable)object3.values(), n);
                    bl8 = false;
                    for (Object object42 : iterable) {
                        object5 = (iA)object42;
                        bl9 = false;
                        aa_0.a((fg_0)this, kR.a(ch3, (CharSequence)am.br, (iA)object5, false, 2, null));
                    }
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
                if (((w)object).b(sQLException)) break block10;
                throw sQLException;
            }
        }
    }

    private static final void a() {
        i = new String[]{"namehistory", "target", "limit"};
    }

    static {
        fy_0.a();
    }
}

