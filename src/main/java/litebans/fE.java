package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bt_0;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.ew;
import litebans.f7;
import litebans.fB;
import litebans.fg_0;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kR;
import litebans.lo_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static class fE
extends fB {
    private static /* synthetic */ String[] i;

    public fE(@NotNull di_0 di_02) {
        super(i[0], di_02);
    }

    public a_ b() {
        return a_.h;
    }

    public am c() {
        return am.y;
    }

    public am a() {
        return am.aH;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block11: {
            Object object = this;
            boolean bl = false;
            String string = aa_0.a((fg_0)object, (String)lo_0.b(stringArray));
            object = aa_0.a(this, jv_02, stringArray, null, 4, null);
            Object object2 = this;
            boolean bl2 = false;
            object2 = (w)((fg_0)object2).h().a(w.class);
            bl2 = false;
            try {
                ch ch2 = ((w)object2).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object3;
                    Object object4 = (ch)closeable;
                    boolean bl3 = false;
                    ch ch3 = ch2;
                    boolean bl4 = false;
                    if (jj_0.a.b(string) && (object3 = kR.a(ch3, aa_0.d(this, string), this.b(), null, false, 12, null)) != null) {
                        String string2 = ((dZ)object3).w();
                        if (string2 == null && (string2 = ((dZ)object3).p()) == null) {
                            fg_0.a.a(this.a());
                            throw new as();
                        }
                        String string3 = string2;
                        iA iA2 = aa_0.a(ch3, string3, false, 2, null);
                        aa_0.a((fg_0)this, kR.a(ch3, (CharSequence)this.c(), (dZ)object3, iA2, false, 4, null));
                        this.a(ch3, (dZ)object3, iA2);
                    } else {
                        object3 = aa_0.a(ch3, string, false, 2, null);
                        dZ dZ2 = kR.a(ch3, ((iA)object3).b(), ((iA)object3).i(), this.b(), (String)object, false, false, 48, null);
                        if (dZ2 == null) {
                            fg_0.a.a(kR.a(ch3, (CharSequence)this.a(), (iA)object3, false, 2, null));
                            throw new as();
                        }
                        dZ dZ3 = dZ2;
                        aa_0.a((fg_0)this, kR.a(ch3, (CharSequence)this.c(), dZ3, (iA)object3, false, 4, null));
                        this.a(ch3, dZ3, (iA)object3);
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
                if (((w)object2).b(sQLException)) break block11;
                throw sQLException;
            }
        }
    }

    private final void a(ch ch2, dZ dZ2, iA iA2) {
        if (this.b() == a_.h && !ew.a((Object)dZ2.w(), (Object)iA2.b())) {
            String[] stringArray = new String[2];
            stringArray[0] = i[1];
            String string = iA2.b();
            if (string == null && (string = iA2.a()) == null) {
                return;
            }
            stringArray[1] = string;
            f7 f72 = new f7(stringArray, ch2.e(), false);
        }
    }

    private static final void d() {
        i = new String[]{hl.a("\u6423\u6428\u6425\u6423\u642b\u6422\u6421\u642e", 1164207168), hl.a("\u4e10\u4e1b\u4e16\u4e10\u4e18", -1884008845)};
    }

    static {
        fE.d();
    }
}

