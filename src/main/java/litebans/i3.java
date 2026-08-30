package litebans;

import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import litebans.a9;
import litebans.at;
import litebans.aw;
import litebans.bc_0;
import litebans.bt_0;
import litebans.bz;
import litebans.dw;
import litebans.ew;
import litebans.g9;
import litebans.gr_0;
import litebans.hl;
import litebans.ip_0;
import litebans.iv_0;
import litebans.jb_0;
import litebans.ji_0;
import litebans.ks_0;
import litebans.ll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class i3 {
    public static final bc_0 j;
    private final String b;
    private String d;
    private String g;
    private String e;
    private boolean f;
    private List i;
    private final gr_0 c;
    private static final Character[] h;
    private static /* synthetic */ String[] a;

    public i3(@NotNull String string) {
        this.b = string;
        this.i = ll.e();
        this.c = new gr_0();
    }

    public final String d() {
        return this.b;
    }

    public final void a(@NotNull List list) {
        this.i = list;
    }

    public final gr_0 b() {
        return this.c;
    }

    public final String a(@Nullable String string, boolean bl) {
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        String string3 = string2;
        if (!bl) {
            Character[] characterArray = h;
            int n = characterArray.length;
            for (int i = 0; i < n; ++i) {
                char c = characterArray[i].charValue();
                if (!bz.c((CharSequence)string3, c, false, 2, null)) continue;
                string3 = bz.a(string3, String.valueOf(c), "" + '\\' + c, false, 4, null);
            }
        }
        return string3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public final void c() {
        Object object;
        block13: {
            Object object2;
            boolean bl;
            Object object3;
            ((Map)this.c).put("content", this.a(this.d, false));
            ((Map)this.c).put("username", this.g);
            ((Map)this.c).put("avatar_url", this.e);
            ((Map)this.c).put("tts", this.f);
            Object object4 = this.c;
            Object object5 = "embeds";
            Object object6 = this.i;
            boolean bl2 = false;
            Iterable iterable = object6;
            Object object7 = new ArrayList(ll.a((Iterable)object6, 10));
            boolean bl3 = false;
            for (Object t2 : iterable) {
                object3 = (g9)t2;
                Collection collection = object7;
                bl = false;
                collection.add(this.a((g9)object3));
            }
            object6 = (List)object7;
            bl2 = false;
            try {
                object2 = new ip_0().a(ks_0.a((List)object6));
            }
            catch (Throwable throwable) {
                System.err.println(ks_0.a((List)object6));
                throw throwable;
            }
            object6 = object2;
            object4.put(object5, object6);
            object4 = this;
            object5 = this.c;
            boolean bl4 = false;
            object = object4;
            boolean bl5 = false;
            URLConnection uRLConnection = URI.create(((i3)object).b).toURL().openConnection();
            ew.b(uRLConnection, "");
            Object object8 = object7 = (HttpsURLConnection)uRLConnection;
            boolean bl6 = false;
            ((URLConnection)object8).addRequestProperty("Content-Type", "application/json");
            ((URLConnection)object8).addRequestProperty("User-Agent", "Java (LiteBans " + jb_0.c() + ')');
            ((URLConnection)object8).setConnectTimeout(80000);
            ((URLConnection)object8).setReadTimeout(80000);
            ((URLConnection)object8).setDoOutput(true);
            ((HttpURLConnection)object8).setRequestMethod("POST");
            object = (HttpURLConnection)object7;
            bl5 = false;
            object7 = ((URLConnection)object).getOutputStream();
            object8 = null;
            OutputStream outputStream = (OutputStream)object7;
            boolean bl7 = false;
            ew.a(outputStream);
            object3 = outputStream;
            bl = false;
            Object object9 = object3;
            boolean bl8 = false;
            Object object10 = object5;
            boolean bl9 = false;
            ((OutputStream)object9).write(((gr_0)object10).toString().getBytes(ji_0.b));
            iv_0 iv_02 = iv_0.a;
            object3 = iv_02;
            break block13;
            {
                catch (Throwable throwable) {
                    object8 = throwable;
                    throw throwable;
                }
                finally {
                    bt_0.a((Closeable)object7, (Throwable)object8);
                }
                {
                    catch (Throwable throwable) {
                        try {
                            ((URLConnection)object).getInputStream().close();
                            ((HttpURLConnection)object).disconnect();
                        }
                        catch (Throwable throwable2) {
                            throw new RuntimeException(throwable2);
                        }
                        throw throwable;
                    }
                }
            }
        }
        ((URLConnection)object).getInputStream().close();
        ((HttpURLConnection)object).disconnect();
    }

    private final gr_0 a(g9 g92) {
        Object object;
        Map map;
        gr_0 gr_02 = new gr_0();
        g9 g93 = g92;
        boolean bl = false;
        ((Map)gr_02).put("title", this.a(g93.f(), true));
        ((Map)gr_02).put("description", this.a(g93.h(), true));
        Object object2 = gr_02;
        Object object3 = "url";
        String string = g93.b();
        if (string == null) {
            string = "";
        }
        String string2 = string;
        object2.put(object3, string2);
        object2 = g93.g();
        object3 = g93.d();
        string2 = g93.e();
        dw dw2 = g93.c();
        List list = g93.i();
        int n = g93.a();
        if (object2 != null) {
            map = new gr_0();
            ((Map)map).put("text", ((aw)object2).b());
            ((Map)map).put("icon_url", ((aw)object2).a());
            ((Map)gr_02).put("footer", map);
        }
        if (object3 != null) {
            map = new gr_0();
            ((Map)map).put("url", ((a9)object3).a());
            ((Map)gr_02).put("image", map);
        }
        if (dw2 != null) {
            map = new gr_0();
            ((Map)map).put("name", dw2.c());
            ((Map)map).put("url", dw2.b());
            ((Map)map).put("icon_url", dw2.a());
            ((Map)gr_02).put("author", map);
        }
        if (string2 != null) {
            map = new gr_0();
            ((Map)map).put("url", string2);
            ((Map)gr_02).put("thumbnail", map);
        }
        Object object4 = n;
        ((Map)gr_02).put("color", object4);
        map = gr_02;
        String string3 = "fields";
        object4 = list;
        boolean bl2 = false;
        Object object5 = object4;
        Collection collection = new ArrayList(ll.a((Iterable)object4, 10));
        boolean bl3 = false;
        Iterator iterator = object5.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            at at2 = (at)t2;
            Collection collection2 = collection;
            boolean bl4 = false;
            gr_0 gr_03 = new gr_0();
            at at3 = at2;
            boolean bl5 = false;
            ((Map)gr_03).put("name", at3.c());
            ((Map)gr_03).put("value", at3.b());
            ((Map)gr_03).put("inline", at3.a());
            collection2.add(gr_03);
        }
        object4 = (List)collection;
        bl2 = false;
        try {
            object = new ip_0().a(ks_0.a((List)object4));
        }
        catch (Throwable throwable) {
            System.err.println(ks_0.a((List)object4));
            throw throwable;
        }
        object4 = object;
        map.put(string3, object4);
        return gr_02;
    }

    static {
        i3.a();
        j = new bc_0(null);
        Character[] characterArray = new Character[]{Character.valueOf('_'), Character.valueOf('*'), Character.valueOf('`'), Character.valueOf('~'), Character.valueOf('#'), Character.valueOf('-')};
        h = characterArray;
    }

    private static final void a() {
        a = new String[]{"content", "username", "avatar_url", "tts", "embeds", "", "Content-Type", "application/json", "User-Agent", "Java (LiteBans ", "POST", "", "Content-Type", "application/json", "User-Agent", "Java (LiteBans ", "POST", "", "Content-Type", "application/json", "User-Agent", "Java (LiteBans ", "POST", "title", "description", "url", "", "text", "icon_url", "footer", "url", "image", "name", "url", "icon_url", "author", "url", "thumbnail", "color", "fields", "name", "value", "inline"};
    }
}

