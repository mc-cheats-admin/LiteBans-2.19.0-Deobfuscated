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

/*
 * Renamed from litebans.fd
 */
public static final class fd_0
extends fB {
    private static /* synthetic */ String[] i;

    public fd_0(@NotNull di_0 di_02) {
        super(i[0], di_02);
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
            if (((q_0)((fg_0)object4).h().a(q_0.class)).f().t()) {
                object3 = this;
                bl2 = false;
                object4 = fg_0.a;
                bl3 = ((fg_0)object3).d().f();
                object2 = am.b;
                boolean bl4 = false;
                object = object4;
                boolean bl5 = !bl3;
                bl = false;
                if (bl5) {
                    Object object5 = object;
                    boolean bl6 = false;
                    ((fo_0)object5).a(object2);
                    throw new as();
                }
            }
            Object object6 = this;
            boolean bl7 = false;
            object3 = aa_0.a((fg_0)object6, (String)lo_0.b(stringArray));
            object6 = aa_0.a(this, jv_02, stringArray, null, 4, null);
            Object object7 = this;
            bl3 = false;
            object7 = (w)((fg_0)object7).h().a(w.class);
            bl3 = false;
            try {
                object2 = ((w)object7).f();
                Closeable closeable = (Closeable)object2;
                object = null;
                try {
                    String string;
                    boolean bl8;
                    StringBuilder stringBuilder;
                    int n;
                    String string2;
                    Object object8 = (ch)closeable;
                    bl = false;
                    Object object9 = object2;
                    boolean bl9 = false;
                    iA iA2 = aa_0.a((ch)object9, (String)object3, false, 2, null);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    String[] stringArray2 = stringArray;
                    int n2 = 1;
                    if (n2 < stringArray2.length) {
                        string2 = stringArray2[n2];
                    } else {
                        n = n2;
                        stringBuilder = stringBuilder2;
                        bl8 = false;
                        string2 = i[1];
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
                        string = i[2];
                        stringBuilder3 = stringBuilder;
                    }
                    String string3 = stringBuilder3.append(string).toString();
                    double d10 = dk.d.a(string3, Double.MIN_VALUE);
                    Object object10 = fg_0.a;
                    bl8 = d10 == Double.MIN_VALUE && !bz.b((CharSequence)string3);
                    CharSequence charSequence = am.aL;
                    boolean bl10 = false;
                    fo_0 fo_02 = object10;
                    boolean bl11 = false;
                    if (bl8) {
                        fo_0 fo_03 = fo_02;
                        boolean bl12 = false;
                        fo_03.a(charSequence);
                        throw new as();
                    }
                    String string4 = iA2.b();
                    if (string4 == null) {
                        fg_0.a.a(am.bi);
                        throw new as();
                    }
                    object10 = string4;
                    long l3 = d10 == Double.MIN_VALUE ? 0L : (long)((double)w.a(object9.d(), false, 1, null) - d10);
                    long l5 = object9.a((String)object10, l3, (String)object6);
                    aa_0.a((fg_0)this, kR.a((ch)object9, (CharSequence)am.c0.a(i[3], (Object)l5), iA2, false, 2, null));
                    object8 = iv_0.a;
                }
                catch (Throwable throwable) {
                    object = throwable;
                    throw throwable;
                }
                finally {
                    bt_0.a(closeable, (Throwable)object);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object7).b(sQLException)) break block15;
                throw sQLException;
            }
        }
    }

    private static final void a() {
        i = new String[]{hl.a("\uf1ea\uf1ed\uf1f8\uf1ff\uf1ff\uf1eb\uf1f6\uf1f5\uf1f5\uf1fb\uf1f8\uf1fa\uf1f2", 1436938649), hl.a("", -1101165737), hl.a("", 940300029), hl.a("\uaa80\uaa8c\uaa8e\uaa94\uaa8f\uaa95", 0xE1EAAE1)};
    }

    static {
        fd_0.a();
    }
}

