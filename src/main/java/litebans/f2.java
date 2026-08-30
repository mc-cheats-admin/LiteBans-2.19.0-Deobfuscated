package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.di_0;
import litebans.dk;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.lo_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class f2
extends fB {
    private static /* synthetic */ String[] i;

    public f2(@NotNull di_0 di_02) {
        super("prunehistory", di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block15: {
            boolean bl;
            Object object;
            Object object2;
            Object object3 = this;
            boolean bl2 = false;
            Object object4 = object3;
            boolean bl3 = false;
            if (((q_0)((fg_0)object4).h().a(q_0.class)).f().f()) {
                object3 = this;
                bl2 = false;
                object4 = fg_0.a;
                bl3 = ((fg_0)object3).d().f();
                object2 = am.b;
                boolean bl4 = false;
                object = object4;
                bl = !bl3;
                boolean bl5 = false;
                if (bl) {
                    Object object5 = object;
                    boolean bl6 = false;
                    ((fo_0)object5).a(object2);
                    throw new as();
                }
            }
            Object object6 = this;
            boolean bl7 = false;
            object3 = aa_0.a((fg_0)object6, (String)lo_0.b(stringArray));
            object6 = this;
            bl7 = false;
            object6 = (w)((fg_0)object6).h().a(w.class);
            bl7 = false;
            try {
                ch ch2 = ((w)object6).f();
                object2 = ch2;
                Throwable throwable = null;
                try {
                    String string;
                    boolean bl8;
                    StringBuilder stringBuilder;
                    int n;
                    String string2;
                    object = (ch)object2;
                    bl = false;
                    ch ch3 = ch2;
                    boolean bl9 = false;
                    iA iA2 = aa_0.a(ch3, (String)object3, false, 2, null);
                    String string3 = iA2.b();
                    if (string3 == null) {
                        fg_0.a.a(am.bi);
                        throw new as();
                    }
                    String string4 = string3;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    int n2 = 1;
                    String[] stringArray2 = stringArray;
                    if (n2 < stringArray2.length) {
                        string2 = stringArray2[n2];
                    } else {
                        n = n2;
                        stringBuilder = stringBuilder2;
                        bl8 = false;
                        string2 = "";
                        stringBuilder2 = stringBuilder;
                    }
                    StringBuilder stringBuilder3 = stringBuilder2.append(string2);
                    stringArray2 = stringArray;
                    n2 = 2;
                    if (n2 < stringArray2.length) {
                        string = stringArray2[n2];
                    } else {
                        n = n2;
                        stringBuilder = stringBuilder3;
                        bl8 = false;
                        string = "";
                        stringBuilder3 = stringBuilder;
                    }
                    String string5 = stringBuilder3.append(string).toString();
                    double d10 = dk.d.a(string5, Double.MIN_VALUE);
                    fo_0 fo_02 = fg_0.a;
                    bl8 = d10 == Double.MIN_VALUE && !bz.b((CharSequence)string5);
                    CharSequence charSequence = am.aL;
                    boolean bl10 = false;
                    fo_0 fo_03 = fo_02;
                    boolean bl11 = false;
                    if (bl8) {
                        fo_0 fo_04 = fo_03;
                        boolean bl12 = false;
                        fo_04.a(charSequence);
                        throw new as();
                    }
                    long l3 = d10 == Double.MIN_VALUE ? 0L : (long)((double)w.a(ch3.d(), false, 1, null) - d10);
                    ch3.a(string4, l3);
                    aa_0.a((fg_0)this, kR.a(ch3, (CharSequence)am.aK, iA2, false, 2, null));
                    object = iv_0.a;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    bt_0.a((Closeable)object2, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object6).b(sQLException)) break block15;
                throw sQLException;
            }
        }
    }

    private static final void a() {
        i = new String[]{"prunehistory", "", ""};
    }

    static {
        f2.a();
    }
}

