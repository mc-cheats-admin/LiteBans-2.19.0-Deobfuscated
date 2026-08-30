package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bF;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.g3;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.jW;
import litebans.jv_0;
import litebans.kR;
import litebans.ll;
import litebans.lo_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.fI
 */
public static final class fi_0
extends fB
implements jW {
    private static /* synthetic */ String[] i;

    public fi_0(@NotNull di_0 di_02) {
        super(i[0], di_02);
    }

    @Override
    public String getPermission() {
        return i[1];
    }

    @Override
    public boolean a() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        block15: {
            boolean bl;
            Object object;
            boolean bl2;
            Object object2;
            boolean bl3;
            Object object3;
            String string;
            String string2 = jv_02.a();
            fg_0 fg_02 = this;
            String string3 = (String)lo_0.e(stringArray);
            if (string3 == null) {
                string3 = string2;
            }
            if (bz.a(string = aa_0.a(fg_02, string3), jv_02.i(), true) || bz.a(string, string2, true)) {
                object3 = this;
                String string4 = i[2];
                boolean bl4 = false;
                jv_0 jv_03 = ((fg_0)object3).d();
                boolean bl5 = false;
                fo_0 fo_02 = fg_0.a;
                jv_0 jv_04 = jv_03;
                boolean bl6 = false;
                jv_0 jv_05 = jv_04;
                boolean bl7 = false;
                bl3 = !jv_05.e(string4);
                object2 = am.cZ;
                bl2 = false;
                object = fo_02;
                bl = false;
                if (bl3) {
                    fo_0 fo_03 = object;
                    boolean bl8 = false;
                    fo_03.a(object2);
                    throw new as();
                }
                object3 = fg_0.a;
                boolean bl9 = jv_02.e();
                CharSequence charSequence = am.b7;
                boolean bl10 = false;
                Object object4 = object3;
                boolean bl11 = !bl9;
                bl3 = false;
                if (bl11) {
                    object2 = object4;
                    bl2 = false;
                    ((fo_0)object2).a(charSequence);
                    throw new as();
                }
            } else {
                object3 = this;
                String string5 = i[3];
                boolean bl12 = false;
                jv_0 jv_06 = ((fg_0)object3).d();
                boolean bl13 = false;
                fo_0 fo_04 = fg_0.a;
                jv_0 jv_07 = jv_06;
                boolean bl14 = false;
                jv_0 jv_08 = jv_07;
                boolean bl15 = false;
                bl3 = !jv_08.e(string5);
                object2 = am.cZ;
                bl2 = false;
                object = fo_04;
                bl = false;
                if (bl3) {
                    fo_0 fo_05 = object;
                    boolean bl16 = false;
                    fo_05.a(object2);
                    throw new as();
                }
            }
            object3 = aa_0.a(this, jv_02, stringArray, null, 4, null);
            int n = this.a(this.h(), stringArray, ll.e(), 512);
            Object object5 = this;
            boolean bl17 = false;
            object5 = (w)((fg_0)object5).h().a(w.class);
            bl17 = false;
            try {
                ch ch2 = ((w)object5).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    object2 = (ch)closeable;
                    bl2 = false;
                    object = ch2;
                    bl = false;
                    iA iA2 = aa_0.a((ch)object, string, false, 2, null);
                    List list = ll.e(object.a(iA2, a_.c, (String)object3, true, n));
                    aa_0.a((fg_0)this, (CharSequence)bF.a(kR.a((ch)object, this.a(), iA2, false, 2, null), (CharSequence)i[4], n));
                    Iterable iterable = list;
                    boolean bl18 = false;
                    for (Object t2 : iterable) {
                        am am2;
                        dZ dZ2 = (dZ)t2;
                        boolean bl19 = false;
                        CharSequence charSequence = am.a(dZ2.u());
                        am am3 = am2 = dZ2.y() ? am.cM : am.am;
                        if (object.a(dZ2)) {
                            CharSequence charSequence2 = charSequence;
                            boolean bl20 = false;
                            charSequence = "" + charSequence2 + (CharSequence)am2;
                        }
                        aa_0.a((fg_0)this, kR.a((ch)object, charSequence, dZ2, iA2, false, 4, null));
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
                if (((w)object5).b(sQLException)) break block15;
                throw sQLException;
            }
        }
    }

    @Override
    public CharSequence a() {
        return am.bc;
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
        i = new String[]{hl.a("\u86f3\u86e5\u86f6\u86ea\u86ed\u86ea\u86e3\u86f7", -789936508), hl.a("\uc067\uc062\uc07f\uc06e\uc069\uc06a\uc065\uc078\uc025\uc07c\uc06a\uc079\uc065\uc062\uc065\uc06c\uc078\uc025\uc078\uc06e\uc067\uc06d", 703643659), hl.a("\ud325\ud320\ud33d\ud32c\ud32b\ud328\ud327\ud33a\ud367\ud33e\ud328\ud33b\ud327\ud320\ud327\ud32e\ud33a\ud367\ud33a\ud32c\ud325\ud32f", -937897143), hl.a("\u8030\u8035\u8028\u8039\u803e\u803d\u8032\u802f\u8072\u802b\u803d\u802e\u8032\u8035\u8032\u803b\u802f", 1085112412), hl.a("\u2bec\u2be9\u2bed\u2be9\u2bf4", 1570646912)};
    }

    static {
        fi_0.a();
    }
}

