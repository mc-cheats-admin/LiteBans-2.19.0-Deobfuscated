package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import litebans.aJ;
import litebans.a_;
import litebans.bz;
import litebans.c1;
import litebans.dZ;
import litebans.di_0;
import litebans.eM;
import litebans.gn_0;
import litebans.hl;
import litebans.hy_0;
import litebans.kr_0;
import litebans.ll;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fu {
    private final di_0 d;
    private final File b;
    private final boolean c;
    private final ArrayList g;
    private List a;
    private gn_0 f;
    private static /* synthetic */ String[] e;

    public fu(@NotNull di_0 di_02, @NotNull File file, boolean bl) {
        this.d = di_02;
        this.b = file;
        this.c = bl;
        this.g = new ArrayList();
        this.a = new ArrayList();
    }

    public /* synthetic */ fu(di_0 di_02, File file, boolean bl, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            File file2 = di_02.getDataFolder();
            String string = "templates.yml";
            boolean bl2 = false;
            file = new File(file2, string);
        }
        if ((n & 4) != 0) {
            bl = false;
        }
        this(di_02, file, bl);
    }

    public final di_0 c() {
        return this.d;
    }

    public final File b() {
        return this.b;
    }

    public final ArrayList d() {
        return this.g;
    }

    public final List e() {
        return this.a;
    }

    public final void a(@NotNull List list) {
        this.a = list;
    }

    public final gn_0 a() {
        return this.f;
    }

    public final void a(@Nullable gn_0 gn_02) {
        this.f = gn_02;
    }

    public final c1 a(@NotNull a_ a_2, @NotNull String string) {
        Object v0;
        block2: {
            Iterable iterable = this.g;
            boolean bl = false;
            Iterable iterable2 = iterable;
            boolean bl2 = false;
            Object object = iterable2;
            Collection collection = new ArrayList();
            boolean bl3 = false;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                c1 c12 = (c1)t2;
                boolean bl4 = false;
                if (!(c12.d() == a_2.c())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            bl = false;
            for (Object e : iterable) {
                object = (c1)e;
                boolean bl5 = false;
                if (!bz.a(((c1)object).g(), string, true)) continue;
                v0 = e;
                break block2;
            }
            v0 = null;
        }
        return v0;
    }

    public final c1 a(@NotNull dZ dZ2) {
        return this.a(dZ2.u(), dZ2.r() & 0xFF);
    }

    public final c1 a(@NotNull a_ a_2, byte by2) {
        Object v0;
        block2: {
            Iterable iterable = this.g;
            boolean bl = false;
            Iterable iterable2 = iterable;
            boolean bl2 = false;
            Object object = iterable2;
            Collection collection = new ArrayList();
            boolean bl3 = false;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                c1 c12 = (c1)t2;
                boolean bl4 = false;
                if (!(c12.d() == a_2.c())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            bl = false;
            for (Object e : iterable) {
                object = (c1)e;
                boolean bl5 = false;
                if (!(((c1)object).f() == by2)) continue;
                v0 = e;
                break block2;
            }
            v0 = null;
        }
        return v0;
    }

    public final c1 a(@NotNull a_ a_2, int n) {
        Object v0;
        block2: {
            Iterable iterable = this.g;
            boolean bl = false;
            Iterable iterable2 = iterable;
            boolean bl2 = false;
            Object object = iterable2;
            Collection collection = new ArrayList();
            boolean bl3 = false;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                c1 c12 = (c1)t2;
                boolean bl4 = false;
                if (!(c12.d() == a_2.c())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            bl = false;
            for (Object e : iterable) {
                object = (c1)e;
                boolean bl5 = false;
                if (!((((c1)object).f() & 0xFF) == n)) continue;
                v0 = e;
                break block2;
            }
            v0 = null;
        }
        return v0;
    }

    public final eM a(@NotNull a_ a_2, @NotNull c1 c12) {
        Collection collection;
        block2: {
            Iterable iterable = this.a;
            boolean bl = false;
            Iterable iterable2 = iterable;
            Collection collection22 = new ArrayList();
            boolean bl2 = false;
            Iterator iterator = iterable2.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                eM eM2 = (eM)t2;
                boolean bl3 = false;
                if (!(eM2.c() == a_2.c())) continue;
                collection22.add(t2);
            }
            iterable = (List)collection22;
            bl = false;
            for (Collection collection22 : iterable) {
                eM eM3 = (eM)((Object)collection22);
                boolean bl4 = false;
                if (!eM3.e().containsKey(c12)) continue;
                collection = collection22;
                break block2;
            }
            collection = null;
        }
        return (eM)((Object)collection);
    }

    public final List a(@NotNull a_ a_2) {
        Object object;
        boolean bl;
        Object object2;
        Iterable iterable = this.g;
        boolean bl2 = false;
        Iterable iterable2 = iterable;
        boolean bl3 = false;
        Iterable iterable3 = iterable2;
        Iterator iterator = new ArrayList();
        boolean bl4 = false;
        for (Object t2 : iterable3) {
            object2 = (c1)t2;
            bl = false;
            if (!(((c1)object2).d() == a_2.c())) continue;
            iterator.add(t2);
        }
        iterable = (List)((Object)iterator);
        bl2 = false;
        iterable2 = iterable;
        Collection collection = new ArrayList();
        boolean bl5 = false;
        for (Object e : iterable2) {
            boolean bl6;
            block6: {
                object = (c1)e;
                boolean bl7 = false;
                object2 = ((c1)object).h().b();
                bl = false;
                if (object2 instanceof Collection && ((Collection)object2).isEmpty()) {
                    bl6 = false;
                } else {
                    Iterator iterator2 = object2.iterator();
                    while (iterator2.hasNext()) {
                        Object t3 = iterator2.next();
                        String string = (String)t3;
                        boolean bl8 = false;
                        if (!bz.a((CharSequence)string, (CharSequence)"--hide", false, 2, null)) continue;
                        bl6 = true;
                        break block6;
                    }
                    bl6 = false;
                }
            }
            if (!bl6) continue;
            collection.add(e);
        }
        iterable = (List)collection;
        bl2 = false;
        iterable2 = iterable;
        collection = new ArrayList(ll.a(iterable, 10));
        bl5 = false;
        for (Object t4 : iterable2) {
            object = (c1)t4;
            Collection collection2 = collection;
            boolean bl9 = false;
            collection2.add(hy_0.d(((c1)object).f()));
        }
        return (List)collection;
    }

    public final List a(@NotNull kr_0 kr_02, @Nullable String string) {
        List list = kr_02.g(string);
        if (list == null) {
            List list2;
            String string2 = kr_02.e(string);
            if (string2 != null) {
                char[] cArray = new char[]{' '};
                list2 = bz.a((CharSequence)string2, cArray, false, 0, 6, null);
            } else {
                list2 = list = null;
            }
            if (list2 == null) {
                list = ll.e();
            }
        }
        return list;
    }

    public final void a(@NotNull Exception exception) {
        if (this.c) {
            throw exception;
        }
        q_0 q_02 = (q_0)this.d.a(q_0.class);
        q_02.a("templates", exception);
        if (q_02.a(1)) {
            q_02.a(exception);
        }
    }

    private static final void f() {
        e = new String[]{"templates.yml", "--hide", "templates.yml", "templates.yml", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", hl.a("\u00c9\u00ce\u0086\u008f\u009d\u00ce\u0087\u0080\u0098\u008f\u0082\u0087\u008a\u00ce\u009d\u008b\u008d\u009a\u0087\u0081\u0080\u00c0", 0x11EE00EE), "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes a bad weight: ", "Loaded ", " template groups from templates.yml!", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes a bad weight: ", "Loaded ", " template groups from templates.yml!", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes a bad weight: ", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "templates"};
    }

    static {
        fu.f();
    }
}

