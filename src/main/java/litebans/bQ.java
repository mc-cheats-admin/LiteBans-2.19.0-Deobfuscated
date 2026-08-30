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

public static final class bQ {
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
            URLConnection uRLConnection = new URL(a[0] + string2).openConnection();
            ew.b(uRLConnection, a[1]);
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
                ew.b(object2, a[2]);
                gr_0 gr_02 = (gr_0)object2;
                Object v2 = gr_02.get(a[3]);
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
            q_02.a(1, (Object)(a[4] + string + a[5]));
            return cn.b();
        }
        try {
            URLConnection uRLConnection = new URL(a[6] + string).openConnection();
            ew.b(uRLConnection, a[7]);
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
                ew.b(object3, a[8]);
                gr_0 gr_02 = (gr_0)object3;
                Object object4 = gr_02.get(a[9]);
                String string2 = object4 instanceof String ? (String)object4 : null;
                Object v2 = gr_02.get(a[10]);
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
        return string.length() != 36 ? string : x.b.a(string, a[11], (Object)a[12]);
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
        Object object = gr_02.get(a[13]);
        String string = object instanceof String ? (String)object : null;
        Object v2 = gr_02.get(a[14]);
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
        a = new String[]{hl.a("\u9697\u968b\u968b\u968f\u968c\u96c5\u96d0\u96d0\u968c\u969a\u968c\u968c\u9696\u9690\u9691\u968c\u969a\u968d\u9689\u969a\u968d\u96d1\u9692\u9690\u9695\u969e\u9691\u9698\u96d1\u969c\u9690\u9692\u96d0\u968c\u969a\u968c\u968c\u9696\u9690\u9691\u96d0\u9692\u9696\u9691\u969a\u969c\u968d\u969e\u9699\u968b\u96d0\u968f\u968d\u9690\u9699\u9696\u9693\u969a\u96d0", -700016897), hl.a("", 2004160723), hl.a("", 1570639397), hl.a("\u8378\u8377\u837b\u8373", 482444054), hl.a("\ufc97\ufcb1\ufca7\ufcb0\ufcac\ufca3\ufcaf\ufca7\ufce2\ufce0", -1875313470), hl.a("\u9ad0\u9ad2\u9a9b\u9a9c\u9a84\u9a93\u9a9e\u9a9b\u9a96", -2069259534), hl.a("\u9930\u992c\u992c\u9928\u992b\u9962\u9977\u9977\u9939\u9928\u9931\u9976\u9935\u9937\u9932\u9939\u9936\u993f\u9976\u993b\u9937\u9935\u9977\u992d\u992b\u993d\u992a\u992b\u9977\u9928\u992a\u9937\u993e\u9931\u9934\u993d\u992b\u9977\u9935\u9931\u9936\u993d\u993b\u992a\u9939\u993e\u992c\u9977", 432773464), hl.a("", 1168318180), hl.a("", 828283571), hl.a("\u689e\u6891\u689d\u6895", -218666768), hl.a("\u7884\u7889", 2027583725), hl.a("\u2fad", -313839744), hl.a("", -1221875327), hl.a("\u8cb0\u8cb2\u8ca6\u8ca0\u8cb6", 539921619), hl.a("\ub4bf\ub4a8\ub4a8\ub4b5\ub4a8\ub497\ub4bf\ub4a9\ub4a9\ub4bb\ub4bd\ub4bf", 2086319322)};
    }

    static {
        bQ.a();
    }
}

