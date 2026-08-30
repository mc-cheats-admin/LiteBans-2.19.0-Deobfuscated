package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import litebans.aJ;
import litebans.a_;
import litebans.as;
import litebans.b;
import litebans.dh;
import litebans.di_0;
import litebans.ew;
import litebans.gn_0;
import litebans.hl;
import litebans.ll;
import litebans.q_0;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;

public static final class h7 {
    private final di_0 d;
    private final File c;
    private final HashMap e;
    private String f;
    private final q_0 a;
    private static /* synthetic */ String[] b;

    public h7(@NotNull di_0 di_02, @NotNull File file) {
        this.d = di_02;
        this.c = file;
        this.e = new HashMap();
        this.f = b[0];
        this.a = (q_0)this.d.a(q_0.class);
    }

    public /* synthetic */ h7(di_0 di_02, File file, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            File file2 = di_02.getDataFolder();
            String string = b[1];
            boolean bl = false;
            file = new File(file2, string);
        }
        this(di_02, file);
    }

    public final String a(@NotNull String string) {
        String string2 = this.e.getOrDefault(string, b[2]).toString();
        h7 h72 = this;
        boolean bl = false;
        q_0 q_02 = h72.a;
        int n = 1;
        boolean bl2 = false;
        if (q_02.a(n)) {
            q_0 q_03 = q_02;
            boolean bl3 = false;
            q_03.a((Object)(b[3] + string + b[4] + string2 + '\''));
        }
        return ew.a((Object)string2, (Object)b[5]) || ew.a((Object)string2, (Object)b[6]) || ((CharSequence)string2).length() == 0 ? this.f : (ew.a((Object)string2, (Object)b[7]) || ew.a((Object)string2, (Object)b[8]) ? b[9] : string2);
    }

    public final h7 a() {
        h7 h72;
        h7 h73 = h72 = this;
        boolean bl = false;
        gn_0 gn_02 = null;
        try {
            Object object;
            boolean bl2;
            Iterable<String> iterable;
            Object[] objectArray;
            boolean bl3;
            a_ a_2;
            boolean bl4;
            Object object2;
            this.d.a(b[10]);
            gn_02 = this.d.a(this.c).g();
            gn_02.a(gn_0.b(b[11], null));
            String string = gn_02.a(b[12], b[13]);
            CharSequence charSequence = string;
            this.f = charSequence == null || charSequence.length() == 0 ? this.a.f().aO() : string;
            this.e.clear();
            Object object322 = a_.l;
            boolean bl5 = false;
            Iterable iterable2 = ((dh)object322).a();
            boolean bl6 = false;
            Iterable iterable3 = iterable2;
            Collection collection = new ArrayList();
            boolean bl7 = false;
            for (Object t2 : iterable3) {
                List list;
                object2 = (a_)t2;
                bl4 = false;
                a_2 = object2;
                bl3 = false;
                switch (litebans.b.a[a_2.ordinal()]) {
                    case 1: {
                        list = ll.a(a_2.c());
                        break;
                    }
                    case 2: {
                        objectArray = new Object[]{a_2.c(), b[14] + a_2.c()};
                        list = ll.b(objectArray);
                        break;
                    }
                    default: {
                        objectArray = new Object[]{a_2.c(), b[15] + a_2.c(), b[16] + a_2.c(), b[17] + a_2.c(), b[18] + a_2.c()};
                        list = ll.b(objectArray);
                    }
                }
                Iterable iterable4 = list;
                boolean bl8 = false;
                objectArray = iterable4;
                iterable = new ArrayList(ll.a(iterable4, 10));
                bl2 = false;
                for (Object t3 : objectArray) {
                    object = t3;
                    Collection collection2 = iterable;
                    boolean bl9 = false;
                    collection2.add(object.toString());
                }
                object2 = (List)iterable;
                ll.a(collection, (Iterable)object2);
            }
            iterable2 = ((dh)object322).a();
            Collection collection3 = (List)collection;
            bl6 = false;
            iterable3 = iterable2;
            collection = new ArrayList();
            bl7 = false;
            for (Object t2 : iterable3) {
                Object object4;
                List list;
                object2 = (a_)t2;
                bl4 = false;
                a_2 = object2;
                bl3 = false;
                objectArray = a_2;
                boolean bl10 = false;
                switch (litebans.b.a[objectArray.ordinal()]) {
                    case 1: {
                        list = ll.a(objectArray.c());
                        break;
                    }
                    case 2: {
                        object4 = new Object[]{objectArray.c(), b[19] + objectArray.c()};
                        list = ll.b((Object[])object4);
                        break;
                    }
                    default: {
                        object4 = new Object[]{objectArray.c(), b[20] + objectArray.c(), b[21] + objectArray.c(), b[22] + objectArray.c(), b[23] + objectArray.c()};
                        list = ll.b((Object[])object4);
                    }
                }
                iterable = list;
                bl2 = false;
                object4 = iterable;
                Iterator iterator = new ArrayList(ll.a(iterable, 10));
                boolean bl11 = false;
                object = object4.iterator();
                while (object.hasNext()) {
                    Object e;
                    Object e10 = e = object.next();
                    Iterator iterator2 = iterator;
                    boolean bl12 = false;
                    iterator2.add(e10.toString());
                }
                objectArray = (List)((Object)iterator);
                bl10 = false;
                object4 = objectArray;
                iterable = new ArrayList(ll.a((Iterable)objectArray, 10));
                bl2 = false;
                iterator = object4.iterator();
                while (iterator.hasNext()) {
                    Object t4 = iterator.next();
                    object = (String)t4;
                    Iterable<String> iterable5 = iterable;
                    boolean bl13 = false;
                    iterable5.add(b[24] + (String)object);
                }
                object2 = (List)iterable;
                ll.a(collection, (Iterable)object2);
            }
            for (Object object322 : (Iterable)ll.a(collection3, (Iterable)((List)collection))) {
                ((Map)this.e).put(object322, this.a(gn_02, b[25] + (String)object322, b[26]));
            }
            ((Map)this.e).put(b[27], this.a(gn_02, b[28], b[29]));
        }
        catch (Exception exception) {
            this.a.a(b[30], exception);
        }
        return h72;
    }

    private final String a(gn_0 gn_02, String string, String string2) {
        Object object = gn_02.a(string, (Object)string2);
        if (object instanceof Boolean) {
            if (((Boolean)object).booleanValue()) {
                return b[31];
            }
            return b[32];
        }
        if (object instanceof String) {
            return (String)object;
        }
        x_0.a();
        throw new as();
    }

    private static final void b() {
        b = new String[]{hl.a("", 1958581003), hl.a("\u9b8c\u9b9e\u9b99\u9b93\u9b94\u9b94\u9b90\u9b88\u9bd5\u9b82\u9b96\u9b97", -686121989), hl.a("", -1700579636), hl.a("\ue352\ue371\ue360\ue377\ue37c\ue334\ue363\ue371\ue376\ue37c\ue37b\ue37b\ue37f\ue32e\ue334", -1919294700), hl.a("\u7dd4\u7dc9\u7dca\u7dd4\u7dd3", -1432519180), hl.a("\u274b\u274a", -11917532), hl.a("\u23e2\u23e4\u23e3\u23f3", 2009015190), hl.a("\uac07\uac0e\uac0e", 248425576), hl.a("\uc9e4\uc9e3\uc9ee\uc9f1\uc9e7", -1508259454), hl.a("", -159488576), hl.a("\ua714\ua706\ua701\ua70b\ua70c\ua70c\ua708\ua710\ua74d\ua71a\ua70e\ua70f", 2028775267), hl.a("\u32e1\u32f3\u32f4\u32fe\u32f9\u32f9\u32fd\u32e5\u32b8\u32ef\u32fb\u32fa", 2101228182), hl.a("\u8974\u8975\u8976\u8971\u8965\u897c\u8964\u894f\u8967\u8975\u8972\u8978\u897f\u897f\u897b", -762672880), hl.a("", 1626315021), hl.a("\u3357\u334c", 1392784162), hl.a("\u2d95\u2d84\u2d8c\u2d91\u2dbe", 1081814497), hl.a("\u81d5\u81c4\u81cc\u81d1\u81fe\u81c8\u81d1", -278232671), hl.a("\ue8a0\ue8b9", 1075636425), hl.a("\u7979\u7962", 1939241228), hl.a("\u73d9\u73c2", -1187613780), hl.a("\uc29a\uc28b\uc283\uc29e\uc2b1", 535937774), hl.a("\u5fae\u5fbf\u5fb7\u5faa\u5f85\u5fb3\u5faa", 656302042), hl.a("\u7352\u734b", 257061691), hl.a("\u2a1c\u2a07", -2080363927), hl.a("\ue3df\ue3c5\ue3c0\ue3c9\ue3c2\ue3d8\ue3f3", 1749672876), hl.a("\u9552\u9540\u9547\u954d\u954a\u954a\u954e\u9556\u950b", 526882085), hl.a("", -96468372), hl.a("\u728a\u7287\u729f\u7298", -1870236949), hl.a("\u57fd\u57ef\u57e8\u57e2\u57e5\u57e5\u57e1\u57f9\u57a4\u57eb\u57e6\u57fe\u57f9", 1309366154), hl.a("\ue779\ue770\ue770", 1333126934), hl.a("\u71ce\u71dc\u71db\u71d1\u71d6\u71d6\u71d2\u71ca", -11570759), hl.a("\uc03c\uc03d", 1439416403), hl.a("\uefc2\uefcb\uefcb", 1180037037), hl.a("\u9382\u93a1\u93b0\u93a7\u93ac\u93e4\u93b3\u93a1\u93a6\u93ac\u93ab\u93ab\u93af\u93fe\u93e4", -936340540), hl.a("\u4163\u417e\u417d\u4163\u4164", -1855766205)};
    }

    static {
        h7.b();
    }
}

