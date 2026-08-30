package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import litebans.a_;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.ew;
import litebans.fS;
import litebans.fg_0;
import litebans.gf_0;
import litebans.go_0;
import litebans.gr_0;
import litebans.hd_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jH;
import litebans.ji_0;
import litebans.kR;
import litebans.ks_0;
import litebans.ll;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class fg
extends fS {
    private final File n = new File(o[1]);
    private final DateFormat m = new SimpleDateFormat(o[2]);
    private static /* synthetic */ String[] o;

    public fg(@NotNull di_0 di_02) {
        super(di_02, o[0], null, 0, 0L, 28, null);
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || bz.a((CharSequence)string, (CharSequence)o[3], false, 2, null) || bz.a((CharSequence)string, (CharSequence)o[4], false, 2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        Object object = this.n;
        Object object2 = ji_0.b;
        int n = 8192;
        Object object3 = object;
        BufferedReader bufferedReader = (object3 = (Reader)new InputStreamReader((InputStream)new FileInputStream((File)object3), (Charset)object2)) instanceof BufferedReader ? (BufferedReader)object3 : new BufferedReader((Reader)object3, n);
        object = bufferedReader;
        object2 = null;
        try {
            Object object4 = (BufferedReader)object;
            boolean bl2 = false;
            String string2 = ll.a(go_0.a((Reader)bufferedReader), null, null, null, 0, null, null, 63, null);
            Object object5 = jH.a(string2);
            ew.b(object5, o[5]);
            ks_0 ks_02 = (ks_0)object5;
            this.a(ks_02, ch2);
            object4 = iv_0.a;
        }
        catch (Throwable throwable) {
            object2 = throwable;
            throw throwable;
        }
        finally {
            bt_0.a((Closeable)object, (Throwable)object2);
        }
    }

    private final void a(ks_0 ks_02, ch ch2) {
        gr_0 gr_02 = null;
        String string = o[6];
        for (Object e : ks_02) {
            try {
                String string2;
                ew.b(e, o[7]);
                gr_02 = (gr_0)e;
                String string3 = (String)gr_02.get(o[8]);
                String string4 = (String)gr_02.get(o[9]);
                Date date = this.m.parse((String)gr_02.get(o[10]));
                long l3 = date.getTime();
                if ((String)gr_02.get(o[11]) == null) continue;
                string = hd_0.a((CharSequence)string2);
                long l5 = 0L;
                String string5 = (String)gr_02.get(o[12]);
                l5 = ew.a((Object)string5, (Object)o[13]) ? 0L : this.m.parse(string5).getTime();
                String string6 = (String)gr_02.get(o[14]);
                if (string6 == null) {
                    string6 = o[15];
                }
                String string7 = string6;
                dZ dZ2 = new dZ(a_.h, string4, null, string7, this.b(string), string, o[16], null, l3, l5, 0, false, false, false, 0L, 31744, null);
                if (kR.a(ch2, string4, null, null, false, false, 30, null) == null) {
                    ch2.c(dZ2);
                    this.g().incrementAndGet();
                } else {
                    this.m().warning(o[17] + dZ2.w());
                }
                if (string3 == null || string4 == null) continue;
                new gf_0(this.h(), string3, string4, null).run();
            }
            catch (Exception exception) {
                this.a(this.k(), string, gr_02, exception);
            }
        }
    }

    private final void a(String string, String string2, gr_0 gr_02, Exception exception) {
        this.h().getLogger().warning(o[18] + string + o[19] + string2 + o[20]);
        gr_0 gr_03 = gr_02;
        this.h().getLogger().warning(gr_03 != null ? gr_03.a() : null);
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(exception);
    }

    private static final void a() {
        o = new String[]{hl.a("\u75cb\u75dc\u75d3\u75d4\u75d1\u75d1\u75dc", 27293117), hl.a("\u40a0\u40a3\u40ac\u40ac\u40a7\u40a6\u40ef\u40b2\u40ae\u40a3\u40bb\u40a7\u40b0\u40b1\u40ec\u40a8\u40b1\u40ad\u40ac", -237289278), hl.a("\u18ea\u18ea\u18ea\u18ea\u18be\u18de\u18de\u18be\u18f7\u18f7\u18b3\u18db\u18db\u18a9\u18fe\u18fe\u18a9\u18e0\u18e0\u18b3\u18c9", -1486415725), hl.a("\ub162\ub161\ub16e\ub16e\ub165\ub164\ub12d\ub170\ub16c\ub161\ub179\ub165\ub172\ub173", 641446144), hl.a("\ubdc9\ubddf\ubddf\ubdc9\ubdc2\ubdd8\ubdc5\ubdcd\ubdc0\ubddf", -2028225108), hl.a("", -1467518264), hl.a("", 825935403), hl.a("", 786687125), hl.a("\ua372\ua37d\ua371\ua379", -1707433188), hl.a("\uffe0\uffe0\ufffc\ufff1", -700907627), hl.a("\u5f7b\u5f6a\u5f7d\u5f79\u5f6c\u5f7d\u5f7c", 1484152600), hl.a("\ue046\ue05a\ue040\ue047\ue056\ue050", 577036341), hl.a("\ufd06\ufd1b\ufd13\ufd0a\ufd11\ufd06\ufd10", 470285667), hl.a("\ud9bf\ud9b6\ud9ab\ud9bc\ud9af\ud9bc\ud9ab", -461579815), hl.a("\u4a0b\u4a1c\u4a18\u4a0a\u4a16\u4a17", -268940679), hl.a("", 86295963), hl.a("\ud24b", -1750609311), hl.a("\ub693\ub6bd\ub6b4\ub6b5\ub6a8\ub6b3\ub6b4\ub6bd\ub6fa\ub6be\ub6af\ub6aa\ub6b6\ub6b3\ub6b9\ub6bb\ub6ae\ub6bf\ub6fa\ub6b8\ub6bb\ub6b4\ub6fa\ub6bc\ub6b5\ub6a8\ub6fa", 901297882), hl.a("\u0f93\u0fb4\u0fbc\u0fb9\u0fb0\u0fb1\u0ff5\u0fa1\u0fba\u0ff5\u0fbc\u0fb8\u0fa5\u0fba\u0fa7\u0fa1\u0ff5\u0fb7\u0fb4\u0fbb\u0ff5\u0fb3\u0fba\u0fa7\u0ff5", 50991061), hl.a("\uaffa\uaff2\uafb9\uafa8\uafbf\uafbb\uafae\uafbf\uafbe\uaffa\uafb8\uafa3\uaffa", -598495270), hl.a("\u40d9\u40de\u40d0\u40ba\u40a3\u40bf\u40be\u40d0\u4094\u4091\u4084\u4091\u40ca", 12534000)};
    }

    static {
        fg.a();
    }
}

