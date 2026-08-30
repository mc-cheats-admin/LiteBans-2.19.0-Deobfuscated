package litebans;

import java.io.InputStream;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import litebans.dm_0;
import litebans.e_;
import litebans.e_0;
import litebans.f;
import litebans.g_0;
import litebans.gt_0;
import litebans.h;
import litebans.hc_0;
import litebans.hg_0;
import litebans.i6;
import litebans.i_0;
import litebans.j;
import litebans.jk_0;
import litebans.k;
import litebans.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.eP
 */
public static class ep_0
implements dm_0 {
    private static final int n;
    private static final int b;
    private static final int o;
    private static final ep_0 d;
    public static final String m;
    public static final String f;
    public static final String c;
    public static final String i;
    public static final String a;
    public static final String l;
    public static final String k;
    public static final String g;
    private final String j;
    private volatile String e;
    private SortedMap h;

    private static final ArrayList a() {
        return i6.a(ep_0.f());
    }

    static final void a(Set set, dm_0 dm_02, TreeMap treeMap) {
        for (String string : set) {
            treeMap.put(ep_0.a(string), dm_02);
        }
    }

    private static final Iterator f() {
        return new jk_0(dm_0.class);
    }

    private static final String a(String string) {
        return string.toUpperCase(Locale.ROOT);
    }

    public static final SortedMap c() {
        return (SortedMap)AccessController.doPrivileged(new e_());
    }

    public ep_0() {
        this(null);
    }

    public ep_0(String string) {
        this.j = string;
        this.e = string;
    }

    public e_0 a(String string, InputStream inputStream) {
        return this.a(string, inputStream, this.e);
    }

    @Override
    public e_0 a(String string, InputStream inputStream, String string2) {
        if (string == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if ("ar".equalsIgnoreCase(string)) {
            return new f(inputStream);
        }
        if ("arj".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new g_0(inputStream, string2);
            }
            return new g_0(inputStream);
        }
        if ("zip".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new k(inputStream, string2);
            }
            return new k(inputStream);
        }
        if ("tar".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new j(inputStream, string2);
            }
            return new j(inputStream);
        }
        if ("jar".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new l(inputStream, string2);
            }
            return new l(inputStream);
        }
        if ("cpio".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new h(inputStream, string2);
            }
            return new h(inputStream);
        }
        if ("dump".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new i_0(inputStream, string2);
            }
            return new i_0(inputStream);
        }
        if ("7z".equalsIgnoreCase(string)) {
            throw new hg_0("7z");
        }
        dm_0 dm_02 = (dm_0)this.b().get(ep_0.a(string));
        if (dm_02 != null) {
            return dm_02.a(string, inputStream, string2);
        }
        throw new hc_0("Archiver: " + string + " not found.");
    }

    public SortedMap b() {
        if (this.h == null) {
            this.h = Collections.unmodifiableSortedMap(ep_0.c());
        }
        return this.h;
    }

    @Override
    public Set a() {
        return gt_0.a(new String[]{"ar", "arj", "zip", "tar", "jar", "cpio", "dump", "7z"});
    }

    static final /* synthetic */ ep_0 e() {
        return d;
    }

    static final /* synthetic */ ArrayList d() {
        return ep_0.a();
    }

    static {
        g = "7z";
        k = "zip";
        l = "tar";
        a = "jar";
        i = "dump";
        c = "cpio";
        f = "arj";
        m = "ar";
        o = 12;
        b = 32;
        n = 512;
        d = new ep_0();
    }
}

