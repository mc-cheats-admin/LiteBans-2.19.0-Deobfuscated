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

public final class h7 {
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
        this.f = "";
        this.a = (q_0)this.d.a(q_0.class);
    }

    public /* synthetic */ h7(di_0 di_02, File file, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            File file2 = di_02.getDataFolder();
            String string = "webhooks.yml";
            boolean bl = false;
            file = new File(file2, string);
        }
        this(di_02, file);
    }

    public final String a(@NotNull String string) {
        String string2 = this.e.getOrDefault(string, "").toString();
        h7 h72 = this;
        boolean bl = false;
        q_0 q_02 = h72.a;
        int n = 1;
        boolean bl2 = false;
        if (q_02.a(n)) {
            q_0 q_03 = q_02;
            boolean bl3 = false;
            q_03.a((Object)("Fetch webhook: " + string + " => '" + string2 + '\''));
        }
        return ew.a((Object)string2, (Object)"on") || ew.a((Object)string2, (Object)"true") || ((CharSequence)string2).length() == 0 ? this.f : (ew.a((Object)string2, (Object)"off") || ew.a((Object)string2, (Object)"false") ? "" : string2);
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
            this.d.a("webhooks.yml");
            gn_02 = this.d.a(this.c).g();
            gn_02.a(gn_0.b("webhooks.yml", null));
            String string = gn_02.a("default_webhook", "");
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
                        objectArray = new Object[]{a_2.c(), "un" + a_2.c()};
                        list = ll.b(objectArray);
                        break;
                    }
                    default: {
                        objectArray = new Object[]{a_2.c(), "temp_" + a_2.c(), "temp_ip" + a_2.c(), "ip" + a_2.c(), "un" + a_2.c()};
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
                        object4 = new Object[]{objectArray.c(), "un" + objectArray.c()};
                        list = ll.b((Object[])object4);
                        break;
                    }
                    default: {
                        object4 = new Object[]{objectArray.c(), "temp_" + objectArray.c(), "temp_ip" + objectArray.c(), "ip" + objectArray.c(), "un" + objectArray.c()};
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
                    iterable5.add("silent_" + (String)object);
                }
                object2 = (List)iterable;
                ll.a(collection, (Iterable)object2);
            }
            for (Object object322 : (Iterable)ll.a(collection3, (Iterable)((List)collection))) {
                ((Map)this.e).put(object322, this.a(gn_02, "" + (String)object322, ""));
            }
            ((Map)this.e).put("alts", this.a(gn_02, "webhooks.alts", "off"));
        }
        catch (Exception exception) {
            this.a.a("webhooks", exception);
        }
        return h72;
    }

    private final String a(gn_0 gn_02, String string, String string2) {
        Object object = gn_02.a(string, (Object)string2);
        if (object instanceof Boolean) {
            if (((Boolean)object).booleanValue()) {
                return "on";
            }
            return "off";
        }
        if (object instanceof String) {
            return (String)object;
        }
        x_0.a();
        throw new as();
    }

    private static final void b() {
        b = new String[]{"", "webhooks.yml", "", "Fetch webhook: ", " => '", "on", "true", "off", "false", "", "webhooks.yml", "webhooks.yml", "default_webhook", "", "un", "temp_", "temp_ip", "ip", "un", "un", "temp_", "temp_ip", "ip", "un", "silent_", "", "", "alts", "webhooks.alts", "off", "webhooks", "on", "off", "Fetch webhook: ", " => '"};
    }

    static {
        h7.b();
    }
}

