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

public final class fg
extends fS {
    private final File n = new File("banned-players.json");
    private final DateFormat m = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private static /* synthetic */ String[] o;

    public fg(@NotNull di_0 di_02) {
        super(di_02, "vanilla", null, 0, 0L, 28, null);
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || bz.a((CharSequence)string, (CharSequence)"banned-players", false, 2, null) || bz.a((CharSequence)string, (CharSequence)"essentials", false, 2, null);
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
            ew.b(object5, "");
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
        String string = "";
        for (Object e : ks_02) {
            try {
                String string2;
                ew.b(e, "");
                gr_02 = (gr_0)e;
                String string3 = (String)gr_02.get("name");
                String string4 = (String)gr_02.get("uuid");
                Date date = this.m.parse((String)gr_02.get("created"));
                long l3 = date.getTime();
                if ((String)gr_02.get("source") == null) continue;
                string = hd_0.a((CharSequence)string2);
                long l5 = 0L;
                String string5 = (String)gr_02.get("expires");
                l5 = ew.a((Object)string5, (Object)"forever") ? 0L : this.m.parse(string5).getTime();
                String string6 = (String)gr_02.get("reason");
                if (string6 == null) {
                    string6 = "";
                }
                String string7 = string6;
                dZ dZ2 = new dZ(a_.h, string4, null, string7, this.b(string), string, "*", null, l3, l5, 0, false, false, false, 0L, 31744, null);
                if (kR.a(ch2, string4, null, null, false, false, 30, null) == null) {
                    ch2.c(dZ2);
                    this.g().incrementAndGet();
                } else {
                    this.m().warning("Ignoring duplicate ban for " + dZ2.w());
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
        this.h().getLogger().warning("Failed to import ban for " + string + " (created by " + string2 + "). JSON data:");
        gr_0 gr_03 = gr_02;
        this.h().getLogger().warning(gr_03 != null ? gr_03.a() : null);
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(exception);
    }

    private static final void a() {
        o = new String[]{"vanilla", "banned-players.json", "yyyy-MM-dd HH:mm:ss Z", "banned-players", "essentials", "", "", "", "name", "uuid", "created", "source", "expires", "forever", "reason", "", "*", "Ignoring duplicate ban for ", "Failed to import ban for ", " (created by ", "). JSON data:"};
    }

    static {
        fg.a();
    }
}

