package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.b4;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.h1;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kR;
import litebans.lo_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fY
extends fB {
    private static /* synthetic */ String[] i;

    public fY(@NotNull di_0 di_02) {
        super("geoip", di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        CharSequence charSequence;
        Object object;
        Object object2;
        Object object3;
        block23: {
            boolean bl;
            block24: {
                object3 = fg_0.a;
                fg_0 fg_02 = this;
                boolean bl2 = false;
                fg_0 fg_03 = fg_02;
                boolean bl3 = false;
                boolean bl4 = ((q_0)fg_03.h().a(q_0.class)).f().W();
                CharSequence charSequence2 = am.cF;
                boolean bl5 = false;
                object2 = object3;
                bl = !bl4;
                boolean bl6 = false;
                if (bl) {
                    fo_0 fo_02 = object2;
                    boolean bl7 = false;
                    fo_02.a(charSequence2);
                    throw new as();
                }
                object3 = null;
                Object object4 = this;
                boolean bl8 = false;
                object3 = aa_0.a((fg_0)object4, (String)lo_0.b(stringArray));
                object4 = aa_0.b(this, (String)object3);
                object = null;
                charSequence = null;
                charSequence = am.s;
                if (object4 != null) {
                    object3 = object4.i();
                    object = object4.b();
                    object2 = this;
                    bl = false;
                    object2 = (w)((fg_0)object2).h().a(w.class);
                    bl = false;
                    try {
                        ch ch2 = ((w)object2).f();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object object5 = (ch)closeable;
                            boolean bl9 = false;
                            ch ch3 = ch2;
                            boolean bl10 = false;
                            charSequence = ch3.a(charSequence, (jv_0)object4);
                            object5 = iv_0.a;
                            break block23;
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
                        if (!((w)object2).b(sQLException)) {
                            throw sQLException;
                        }
                        break block23;
                    }
                }
                object2 = object3;
                bl = false;
                if (!jj_0.a.i((String)object2)) break block24;
                object = object3;
                break block23;
            }
            object2 = this;
            bl = false;
            object2 = (w)((fg_0)object2).h().a(w.class);
            bl = false;
            try {
                ch ch4 = ((w)object2).f();
                Closeable closeable = ch4;
                Throwable throwable = null;
                try {
                    iA iA2;
                    ch ch5;
                    Object object6;
                    block26: {
                        block25: {
                            object6 = (ch)closeable;
                            boolean bl11 = false;
                            ch5 = ch4;
                            boolean bl12 = false;
                            iA2 = ch5.c((String)object3);
                            if (iA2 == null) break block25;
                            String string = iA2.i();
                            boolean bl13 = string != null ? bz.a((CharSequence)string, '#', false, 2, null) : false;
                            if (!bl13) break block26;
                        }
                        throw new b4();
                    }
                    object = iA2.i();
                    String string = iA2.a();
                    ew.a((Object)string);
                    object3 = string;
                    charSequence = kR.a(ch5, charSequence, iA2, false, 2, null);
                    object6 = iv_0.a;
                }
                catch (Throwable throwable3) {
                    throwable = throwable3;
                    throw throwable3;
                }
                finally {
                    bt_0.a(closeable, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object2).b(sQLException)) break block23;
                throw sQLException;
            }
        }
        if (object == null) {
            throw new b4();
        }
        CharSequence[] charSequenceArray = this;
        boolean bl = false;
        object2 = ((q_0)charSequenceArray.h().a(q_0.class)).b((String)object);
        CharSequence charSequence3 = ew.a((Object)(charSequenceArray = object2), (Object)"geoip.unavailable") ? (CharSequence)am.ck : (ew.a((Object)charSequenceArray, (Object)"geoip.error") ? (CharSequence)am.da : (CharSequence)charSequence);
        charSequenceArray = new CharSequence[]{"target", object3};
        CharSequence charSequence4 = h1.a(charSequence3, charSequenceArray);
        charSequenceArray = new CharSequence[]{"result", object2};
        charSequence = h1.a(charSequence4, charSequenceArray);
        fg_0.a.a(charSequence);
        throw new as();
    }

    private static final void a() {
        i = new String[]{"geoip", "geoip.unavailable", "geoip.error", "target", "result"};
    }

    static {
        fY.a();
    }
}

