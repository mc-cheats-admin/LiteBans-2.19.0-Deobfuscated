package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import litebans.aJ;
import litebans.bK;
import litebans.bt_0;
import litebans.cM;
import litebans.cn;
import litebans.ew;
import litebans.g2;
import litebans.gr_0;
import litebans.hl;
import litebans.iv_0;
import litebans.ji_0;
import litebans.jj_0;
import litebans.q_0;
import litebans.x;
import org.jetbrains.annotations.NotNull;

public final class bQ {
    private static /* synthetic */ String[] a;

    private bQ() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final String f(@NotNull String string) {
        if (this.c(string) || !jj_0.a(string) || ew.a((Object)string, (Object)cn.a())) {
            return null;
        }
        String string2 = this.d(string);
        try {
            URLConnection uRLConnection = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + string2).openConnection();
            ew.b(uRLConnection, "");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRLConnection;
            int n = 10000;
            boolean bl = false;
            httpsURLConnection.setConnectTimeout(n);
            httpsURLConnection.setReadTimeout(n);
            Closeable closeable = httpsURLConnection.getInputStream();
            Charset charset = ji_0.b;
            closeable = new InputStreamReader((InputStream)closeable, charset);
            int n2 = 512;
            closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n2);
            Throwable throwable = null;
            try {
                String string3;
                Object object = (BufferedReader)closeable;
                boolean bl2 = false;
                Object object2 = bK.a().b((Reader)object);
                ew.b(object2, "");
                gr_0 gr_02 = (gr_0)object2;
                Object v2 = gr_02.get("name");
                String string4 = string3 = v2 instanceof String ? (String)v2 : null;
                if (string3 != null) {
                    bK.c.a(gr_02);
                    String string5 = string3;
                    return string5;
                }
                object = iv_0.a;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                bt_0.a(closeable, throwable);
            }
        }
        catch (Exception exception) {
            q_0 q_02 = (q_0)g2.b.a().a(q_0.class);
            q_02.a(1, (Object)exception);
        }
        return null;
    }

    public final cM a(@NotNull String string) {
        cM cM2 = this.b(string);
        boolean bl = false;
        return !cM2.c() ? cM2 : null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final cM b(@NotNull String string) {
        q_0 q_02 = (q_0)g2.b.a().a(q_0.class);
        Object object = string.toLowerCase(Locale.ROOT);
        if (!bK.c().a((CharSequence)object)) {
            q_02.a(1, (Object)("Username \"" + string + "\" invalid"));
            return cn.b();
        }
        try {
            URLConnection uRLConnection = new URL("https://api.mojang.com/users/profiles/minecraft/" + string).openConnection();
            ew.b(uRLConnection, "");
            object = (HttpsURLConnection)uRLConnection;
            int n = 10000;
            boolean bl = false;
            ((URLConnection)object).setConnectTimeout(n);
            ((URLConnection)object).setReadTimeout(n);
            Closeable closeable = ((URLConnection)object).getInputStream();
            Charset charset = ji_0.b;
            closeable = new InputStreamReader((InputStream)closeable, charset);
            int n2 = 512;
            closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n2);
            Throwable throwable = null;
            try {
                Object object2 = (BufferedReader)closeable;
                boolean bl2 = false;
                Object object3 = bK.a().b((Reader)object2);
                ew.b(object3, "");
                gr_0 gr_02 = (gr_0)object3;
                Object object4 = gr_02.get("name");
                String string2 = object4 instanceof String ? (String)object4 : null;
                Object v2 = gr_02.get("id");
                String string3 = object4 = v2 instanceof String ? (String)v2 : null;
                if (string2 != null && object4 != null) {
                    bK.c.a(gr_02);
                    cM cM2 = new cM(string2, UUID.fromString(bK.c.e((String)object4)));
                    return cM2;
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
        catch (Exception exception) {
            q_02.a(1, (Object)exception);
        }
        return cn.b();
    }

    public final boolean c(@NotNull String string) {
        String string2 = this.e(string);
        return string2.length() == 36 && string2.charAt(14) == '3';
    }

    public final String a(@NotNull UUID uUID) {
        return this.d(uUID.toString());
    }

    public final String d(@NotNull String string) {
        return string.length() != 36 ? string : x.b.a(string, "-", (Object)"");
    }

    public final String e(@NotNull String string) {
        if (string.length() != 32) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(36);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 8;
        int n5 = string.length();
        for (int i = 0; i < n5; ++i) {
            char c = string.charAt(i);
            ++n;
            stringBuilder.append(c);
            if (++n2 < n4) continue;
            n2 = 0;
            if (n < 32) {
                stringBuilder.append('-');
            }
            if (++n3 == 1) {
                n4 = 4;
                continue;
            }
            if (n3 < 4) continue;
            n4 = 12;
        }
        return stringBuilder.toString();
    }

    private final void a(gr_0 gr_02) {
        Object object = gr_02.get("cause");
        String string = object instanceof String ? (String)object : null;
        Object v2 = gr_02.get("errorMessage");
        object = v2 instanceof String ? (String)v2 : null;
        String string2 = string;
        boolean bl = string2 != null ? !(((CharSequence)string2).length() == 0) : false;
        if (bl) {
            throw new RuntimeException((String)object);
        }
    }

    public /* synthetic */ bQ(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"https://sessionserver.mojang.com/session/minecraft/profile/", "", "", "name", "Username \"", "\" invalid", "https://api.mojang.com/users/profiles/minecraft/", "", "", "name", "id", "-", "", "cause", "errorMessage"};
    }

    static {
        bQ.a();
    }
}

