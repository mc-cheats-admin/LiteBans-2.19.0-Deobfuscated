package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bt_0;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eG;
import litebans.ew;
import litebans.fW;
import litebans.fg_0;
import litebans.h1;
import litebans.hl;
import litebans.i3;
import litebans.iA;
import litebans.ij;
import litebans.iv_0;
import litebans.j0;
import litebans.jj_0;
import litebans.kR;
import litebans.o;
import litebans.q_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gz_0
extends fg_0 {
    private final String d;
    private final String g;
    private final String f;
    private static /* synthetic */ String[] e;

    public gz_0(@NotNull di_0 di_02, @NotNull String string, @NotNull String string2, @Nullable String string3) {
        super(di_02);
        this.d = string;
        this.g = string2;
        this.f = string3;
    }

    public final String a() {
        return this.d;
    }

    public final String d() {
        return this.g;
    }

    public final String c() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block20: {
            Object object = this;
            boolean bl = false;
            object = (w)((fg_0)object).h().a(w.class);
            bl = false;
            try {
                ch ch2 = ((w)object).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2;
                    Object object32;
                    Object object4 = (ch)closeable;
                    boolean bl2 = false;
                    ch ch3 = ch2;
                    boolean bl3 = false;
                    fg_0 fg_02 = this;
                    boolean bl4 = false;
                    Object object5 = fg_02;
                    boolean bl5 = false;
                    eG eG2 = ((q_0)((fg_0)object5).h().a(q_0.class)).f();
                    fg_02 = new fW(this.g, ch3, null, false, 0, 28, null).i();
                    Object object6 = this;
                    object5 = ch3;
                    bl5 = false;
                    Object object7 = (fg_0)object6;
                    boolean bl6 = false;
                    Object object8 = object7;
                    boolean bl7 = false;
                    Object object9 = ((q_0)((fg_0)object8).h().a(q_0.class)).f();
                    UUID uUID = jj_0.a.j(((gz_0)object6).d());
                    if (uUID != null) {
                        object7 = uUID;
                        if (((eG)object9).e() > 1 && object5.d().v() && ((fW)fg_02).n() && !kR.a((ch)object5, (UUID)object7, null, 2, null)) {
                            Object v1;
                            block19: {
                                Iterable iterable = ((fW)fg_02).h();
                                for (Object object32 : iterable) {
                                    j0 j02 = (j0)object32;
                                    boolean bl8 = false;
                                    if (!(j02.c() != null && (j02.c().h() || ((eG)object9).e() > 2))) continue;
                                    v1 = object32;
                                    break block19;
                                }
                                v1 = null;
                            }
                            j0 j03 = v1;
                            if (j03 != null) {
                                j0 j04 = j03;
                                dZ dZ2 = j04.c();
                                ew.a(dZ2);
                                aa_0.a((ch)object5, j04, dZ2, ((gz_0)object6).a(), ((gz_0)object6).c(), ((gz_0)object6).d(), ((gz_0)object6).c(), false, 64, null);
                                if (((eG)object9).e() > 2) {
                                    boolean bl9;
                                    j0 j05;
                                    Object t2;
                                    Iterable iterable = ((fW)fg_02).h();
                                    boolean bl10 = false;
                                    object2 = iterable;
                                    object32 = new ArrayList();
                                    boolean bl11 = false;
                                    Iterator iterator = object2.iterator();
                                    while (iterator.hasNext()) {
                                        t2 = iterator.next();
                                        j05 = (j0)t2;
                                        bl9 = false;
                                        if (!(!ew.a((Object)j05.b(), (Object)((gz_0)object6).d()) && j05.c() == null)) continue;
                                        object32.add(t2);
                                    }
                                    iterable = (List)object32;
                                    bl10 = false;
                                    object2 = iterable;
                                    object32 = new ArrayList();
                                    bl11 = false;
                                    iterator = object2.iterator();
                                    while (iterator.hasNext()) {
                                        UUID uUID2;
                                        t2 = iterator.next();
                                        j05 = (j0)t2;
                                        bl9 = false;
                                        if (!(jj_0.a.j(j05.b()) == null ? false : !kR.a((ch)object5, uUID2, null, 2, null))) continue;
                                        object32.add(t2);
                                    }
                                    object8 = (List)object32;
                                    iterable = (Iterable)object8;
                                    bl10 = false;
                                    for (Object object32 : iterable) {
                                        j0 j06 = (j0)object32;
                                        boolean bl12 = false;
                                        aa_0.a((ch)object5, j06, j04.c(), j06.e(), ((gz_0)object6).c(), j06.b(), ((gz_0)object6).c(), true);
                                    }
                                }
                            }
                        }
                    }
                    object6 = fg_02;
                    boolean bl13 = false;
                    if (!((fW)object6).e() && (((fW)fg_02).n() && eG2.aY() || ((fW)fg_02).b() && eG2.Q() || ((fW)fg_02).m() >= eG2.a3())) {
                        iA iA2 = ((fW)fg_02).l();
                        if (iA2 == null) {
                            x_0.a();
                            throw new as();
                        }
                        object6 = iA2;
                        CharSequence charSequence = this.a(ch3, (iA)object6, (fW)fg_02);
                        fg_0 fg_03 = this;
                        boolean bl14 = false;
                        Object object10 = (o)fg_03.h().a(o.class);
                        bl6 = false;
                        o.a((o)object10, ch3, charSequence, ij.b, null, null, false, false, null, 124, null);
                        if (eG2.bg() && ch3.d().s()) {
                            ch3.d().a(arg_0 -> gz_0.a(charSequence, arg_0));
                        }
                        fg_03 = this;
                        object10 = ch3;
                        bl6 = false;
                        object8 = fg_02;
                        bl7 = false;
                        object9 = object8;
                        boolean bl15 = false;
                        object2 = ((q_0)((fg_0)object9).h().a(q_0.class)).b().a("alts");
                        if (((CharSequence)object2).length() > 0) {
                            object9 = ((Object)object10.a((CharSequence)am.cr, ((fW)object8).l(), false)).toString();
                            CharSequence charSequence2 = object10.a(h1.a((CharSequence)((fW)fg_02).c(), (CharSequence)am.dr), ((fW)object8).l(), false);
                            object32 = object10.a((CharSequence)am.bt, ((fW)object8).l(), false);
                            i3.j.a((ch)object10, new i3((String)object2), (CharSequence)object32, charSequence2, i3.j.a((ch)object10, am.ca), (String)object9, null, false);
                        }
                    }
                    object4 = iv_0.a;
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
                if (((w)object).b(sQLException)) break block20;
                throw sQLException;
            }
        }
    }

    public final CharSequence a(@NotNull ch ch2, @NotNull iA iA2, @NotNull fW fW2) {
        CharSequence charSequence = fW2.f() ? (CharSequence)am.cR.a("num", (Object)fW2.k()) : (CharSequence)this.f;
        return h1.a(h1.a(kR.a(ch2, (CharSequence)am.P.a("ip", (Object)charSequence), iA2, false, 2, null), (CharSequence)fW2.c()), (CharSequence)am.dr);
    }

    private static final iv_0 a(CharSequence charSequence, ch ch2) {
        aa_0.a(ch2, ij.b, charSequence, null, null, 12, null);
        return iv_0.a;
    }

    private static final void b() {
        e = new String[]{"alts", "alts", "num", "ip"};
    }

    static {
        gz_0.b();
    }
}

