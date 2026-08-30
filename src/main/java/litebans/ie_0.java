package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import litebans.hl;

/*
 * Renamed from litebans.iE
 */
public static final class ie_0 {
    private static final char a = (char)46;
    final Map d = new LinkedHashMap();
    private final ie_0 b;
    private static /* synthetic */ String[] c;

    public ie_0() {
        this(null);
    }

    public ie_0(ie_0 ie_02) {
        this(new LinkedHashMap(), ie_02);
    }

    public ie_0(Map map, ie_0 ie_02) {
        this.b = ie_02;
        for (Map.Entry entry : map.entrySet()) {
            String string;
            String string2 = string = entry.getKey() == null ? c[0] : entry.getKey().toString();
            if (entry.getValue() instanceof Map) {
                this.d.put(string, new ie_0((Map)entry.getValue(), ie_02 == null ? null : ie_02.b(string)));
                continue;
            }
            this.d.put(string, entry.getValue());
        }
    }

    private final ie_0 c(String string) {
        int n = string.indexOf(46);
        if (n == -1) {
            return this;
        }
        String string2 = string.substring(0, n);
        Object object = this.d.get(string2);
        if (object == null) {
            object = new ie_0(this.b == null ? null : this.b.b(string2));
            this.d.put(string2, object);
        }
        return (ie_0)object;
    }

    private final String h(String string) {
        int n = string.indexOf(46);
        return n == -1 ? string : string.substring(n + 1);
    }

    public Object b(String string, Object object) {
        ie_0 ie_02 = this.c(string);
        Object object2 = ie_02 == this ? this.d.get(string) : ie_02.b(this.h(string), object);
        if (object2 == null && object instanceof ie_0) {
            this.d.put(string, object);
        }
        return object2 != null ? object2 : object;
    }

    public Object e(String string) {
        return this.b(string, this.g(string));
    }

    public Object g(String string) {
        return this.b == null ? null : this.b.e(string);
    }

    public void a(String string, Object object) {
        ie_0 ie_02;
        if (object instanceof Map) {
            object = new ie_0((Map)object, this.b == null ? null : this.b.b(string));
        }
        if ((ie_02 = this.c(string)) == this) {
            if (object == null) {
                this.d.remove(string);
            } else {
                this.d.put(string, object);
            }
        } else {
            ie_02.a(this.h(string), object);
        }
    }

    public ie_0 b(String string) {
        Object object = this.g(string);
        return (ie_0)this.b(string, object instanceof ie_0 ? object : new ie_0(this.b == null ? null : this.b.b(string)));
    }

    public Collection b() {
        return new LinkedHashSet(this.d.keySet());
    }

    public int a(String string, int n) {
        Object object = this.b(string, n);
        return object instanceof Number ? ((Number)object).intValue() : n;
    }

    public long a(String string, long l3) {
        Object object = this.b(string, l3);
        return object instanceof Number ? ((Number)object).longValue() : l3;
    }

    public double a(String string) {
        Object object = this.g(string);
        return this.a(string, object instanceof Number ? ((Number)object).doubleValue() : 0.0);
    }

    public double a(String string, double d10) {
        Object object = this.b(string, d10);
        return object instanceof Number ? ((Number)object).doubleValue() : d10;
    }

    public boolean f(String string) {
        Object object = this.g(string);
        return this.a(string, object instanceof Boolean ? (Boolean)object : false);
    }

    public boolean a(String string, boolean bl) {
        Object object = this.b(string, bl);
        return object instanceof Boolean ? (Boolean)object : bl;
    }

    public String i(String string) {
        Object object = this.g(string);
        return this.a(string, object instanceof String ? (String)object : c[1]);
    }

    public String a(String string, String string2) {
        Object object = this.b(string, string2);
        return object instanceof String ? (String)object : string2;
    }

    public List j(String string) {
        List list = this.d(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object e : list) {
            if (!(e instanceof String)) continue;
            arrayList.add((String)e);
        }
        return arrayList;
    }

    public List d(String string) {
        Object object = this.g(string);
        return this.a(string, object instanceof List ? (List)object : Collections.EMPTY_LIST);
    }

    public List a(String string, List list) {
        Object object = this.b(string, list);
        return object instanceof List ? (List)object : list;
    }

    private static final void a() {
        c = new String[]{hl.a("\u45c3\u45d8\u45c1\u45c1", 1269712301), hl.a("", 1669303078)};
    }

    static {
        ie_0.a();
    }
}

