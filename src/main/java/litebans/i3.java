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

public static final class i3 {
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
            ((Map)this.c).put(a[0], this.a(this.d, false));
            ((Map)this.c).put(a[1], this.g);
            ((Map)this.c).put(a[2], this.e);
            ((Map)this.c).put(a[3], this.f);
            Object object4 = this.c;
            Object object5 = a[4];
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
            ew.b(uRLConnection, a[5]);
            Object object8 = object7 = (HttpsURLConnection)uRLConnection;
            boolean bl6 = false;
            ((URLConnection)object8).addRequestProperty(a[6], a[7]);
            ((URLConnection)object8).addRequestProperty(a[8], a[9] + jb_0.c() + ')');
            ((URLConnection)object8).setConnectTimeout(80000);
            ((URLConnection)object8).setReadTimeout(80000);
            ((URLConnection)object8).setDoOutput(true);
            ((HttpURLConnection)object8).setRequestMethod(a[10]);
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
        ((Map)gr_02).put(a[23], this.a(g93.f(), true));
        ((Map)gr_02).put(a[24], this.a(g93.h(), true));
        Object object2 = gr_02;
        Object object3 = a[25];
        String string = g93.b();
        if (string == null) {
            string = a[26];
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
            ((Map)map).put(a[27], ((aw)object2).b());
            ((Map)map).put(a[28], ((aw)object2).a());
            ((Map)gr_02).put(a[29], map);
        }
        if (object3 != null) {
            map = new gr_0();
            ((Map)map).put(a[30], ((a9)object3).a());
            ((Map)gr_02).put(a[31], map);
        }
        if (dw2 != null) {
            map = new gr_0();
            ((Map)map).put(a[32], dw2.c());
            ((Map)map).put(a[33], dw2.b());
            ((Map)map).put(a[34], dw2.a());
            ((Map)gr_02).put(a[35], map);
        }
        if (string2 != null) {
            map = new gr_0();
            ((Map)map).put(a[36], string2);
            ((Map)gr_02).put(a[37], map);
        }
        Object object4 = n;
        ((Map)gr_02).put(a[38], object4);
        map = gr_02;
        String string3 = a[39];
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
            ((Map)gr_03).put(a[40], at3.c());
            ((Map)gr_03).put(a[41], at3.b());
            ((Map)gr_03).put(a[42], at3.a());
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
        a = new String[]{hl.a("\u8950\u895c\u895d\u8947\u8956\u895d\u8947", 344885555), hl.a("\ub017\ub011\ub007\ub010\ub00c\ub003\ub00f\ub007", 864333922), hl.a("\u886e\u8879\u886e\u887b\u886e\u887d\u8850\u887a\u887d\u8863", -1190295537), hl.a("\ua76b\ua76b\ua76c", -1593661665), hl.a("\u2fa9\u2fa1\u2fae\u2fa9\u2fa8\u2fbf", -1925042228), hl.a("", 974995488), hl.a("\uf89b\uf8b7\uf8b6\uf8ac\uf8bd\uf8b6\uf8ac\uf8f5\uf88c\uf8a1\uf8a8\uf8bd", 1575418072), hl.a("\uffdd\uffcc\uffcc\uffd0\uffd5\uffdf\uffdd\uffc8\uffd5\uffd3\uffd2\uff93\uffd6\uffcf\uffd3\uffd2", -927400004), hl.a("\ue4e2\ue4c4\ue4d2\ue4c5\ue49a\ue4f6\ue4d0\ue4d2\ue4d9\ue4c3", -1740315465), hl.a("\u330a\u3321\u3336\u3321\u3360\u3368\u330c\u3329\u3334\u3325\u3302\u3321\u332e\u3333\u3360", 1036202816), hl.a("\u54c7\u54d8\u54c4\u54c3", -1683204969), hl.a("", -2054779383), hl.a("\ud3d5\ud3f9\ud3f8\ud3e2\ud3f3\ud3f8\ud3e2\ud3bb\ud3c2\ud3ef\ud3e6\ud3f3", 1670108054), hl.a("\u1cec\u1cfd\u1cfd\u1ce1\u1ce4\u1cee\u1cec\u1cf9\u1ce4\u1ce2\u1ce3\u1ca2\u1ce7\u1cfe\u1ce2\u1ce3", -962716531), hl.a("\u6b08\u6b2e\u6b38\u6b2f\u6b70\u6b1c\u6b3a\u6b38\u6b33\u6b29", -1724159139), hl.a("\uef78\uef53\uef44\uef53\uef12\uef1a\uef7e\uef5b\uef46\uef57\uef70\uef53\uef5c\uef41\uef12", 1994452786), hl.a("\u6c2a\u6c35\u6c29\u6c2e", 321678458), hl.a("", 1973291174), hl.a("\u9f6e\u9f42\u9f43\u9f59\u9f48\u9f43\u9f59\u9f00\u9f79\u9f54\u9f5d\u9f48", 763010861), hl.a("\uf2a2\uf2b3\uf2b3\uf2af\uf2aa\uf2a0\uf2a2\uf2b7\uf2aa\uf2ac\uf2ad\uf2ec\uf2a9\uf2b0\uf2ac\uf2ad", 208073411), hl.a("\u5e15\u5e33\u5e25\u5e32\u5e6d\u5e01\u5e27\u5e25\u5e2e\u5e34", 1266900544), hl.a("\u24a0\u248b\u249c\u248b\u24ca\u24c2\u24a6\u2483\u249e\u248f\u24a8\u248b\u2484\u2499\u24ca", 781198570), hl.a("\u4ace\u4ad1\u4acd\u4aca", 1309035166), hl.a("\u7b00\u7b1d\u7b00\u7b18\u7b11", -408061068), hl.a("\uf25f\uf25e\uf248\uf258\uf249\uf252\uf24b\uf24f\uf252\uf254\uf255", -1811156421), hl.a("\ufc7b\ufc7c\ufc62", -1116210162), hl.a("", -789446589), hl.a("\u9ea7\u9eb6\u9eab\u9ea7", -1988124973), hl.a("\uaf98\uaf92\uaf9e\uaf9f\uafae\uaf84\uaf83\uaf9d", 947826673), hl.a("\ue185\ue18c\ue18c\ue197\ue186\ue191", -107355677), hl.a("\uc152\uc155\uc14b", 1040433447), hl.a("\u9803\u9807\u980b\u980d\u980f", -1341417366), hl.a("\u020e\u0201\u020d\u0205", 1263534688), hl.a("\u8557\u8550\u854e", 1937081634), hl.a("\uc019\uc013\uc01f\uc01e\uc02f\uc005\uc002\uc01c", -1615216528), hl.a("\u49ae\u49ba\u49bb\u49a7\u49a0\u49bd", 1508985295), hl.a("\u448f\u4488\u4496", -1298381574), hl.a("\ue2e1\ue2fd\ue2e0\ue2f8\ue2f7\ue2fb\ue2f4\ue2fc\ue2f9", -111615339), hl.a("\u0a57\u0a5b\u0a58\u0a5b\u0a46", -1752823244), hl.a("\u5daf\u5da0\u5dac\u5da5\u5dad\u5dba", 1033919945), hl.a("\u1a7f\u1a70\u1a7c\u1a74", 1352604177), hl.a("{laxh", 1839398925), hl.a("\ufd55\ufd52\ufd50\ufd55\ufd52\ufd59", 613154108)};
    }
}

