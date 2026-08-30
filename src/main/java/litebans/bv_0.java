package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import litebans.cd_0;
import litebans.dd_0;
import litebans.gu_0;
import litebans.i7;
import litebans.jt_0;
import litebans.lG;

/*
 * Renamed from litebans.bV
 */
public static class bv_0
implements gu_0,
lG {
    private static final bv_0[] aD;
    public static final long aL;
    private String aA = "";
    private final boolean aB;
    private int av;
    private long aK = 0L;
    private long aC = 0L;
    private long aF = 0L;
    private long aE;
    private boolean aJ;
    private byte aR;
    private String aG = "";
    private String aI = "ustar\u0000";
    private String as = "00";
    private String au;
    private String aP = "";
    private int aw = 0;
    private int aQ = 0;
    private List ay;
    private boolean ax;
    private long ar;
    private boolean ap;
    private boolean aH = false;
    private boolean aq;
    private final File aO;
    private final Map aM = new HashMap();
    public static final int at;
    public static final int ao;
    public static final int aN;
    public static final int az;

    private bv_0(boolean bl) {
        String string = System.getProperty("user.name", "");
        if (string.length() > 31) {
            string = string.substring(0, 31);
        }
        this.au = string;
        this.aO = null;
        this.aB = bl;
    }

    public bv_0(byte[] byArray, dd_0 dd_02, boolean bl) {
        this(false);
        this.a(byArray, dd_02, false, bl);
    }

    public boolean a(bv_0 bv_02) {
        return bv_02 != null && this.getName().equals(bv_02.getName());
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.a((bv_0)object);
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String getName() {
        return this.aA;
    }

    public void c(String string) {
        this.aA = bv_0.a(string, this.aB);
    }

    public void b(String string) {
        this.aG = string;
    }

    public void d(long l3) {
        this.aK = l3;
    }

    public void b(long l3) {
        this.aC = l3;
    }

    public void d(String string) {
        this.au = string;
    }

    public void a(String string) {
        this.aP = string;
    }

    public void a(long l3) {
        this.aE = l3 / 1000L;
    }

    @Override
    public long getSize() {
        return this.aF;
    }

    public void a(List list) {
        this.ay = list;
    }

    public List f() {
        return this.ay;
    }

    public boolean i() {
        return this.aH;
    }

    public void c(long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Size is out of range: " + l3);
        }
        this.aF = l3;
    }

    public void a(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + n);
        }
        this.aw = n;
    }

    public void b(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + n);
        }
        this.aQ = n;
    }

    public boolean b() {
        return this.ax;
    }

    public long g() {
        if (!this.l()) {
            return this.aF;
        }
        return this.ar;
    }

    public boolean h() {
        return this.d() || this.j();
    }

    public boolean d() {
        return this.aR == 83;
    }

    public boolean j() {
        return this.ap;
    }

    public boolean e() {
        return this.aq;
    }

    public boolean k() {
        return this.aR == 75;
    }

    public boolean m() {
        return this.aR == 76;
    }

    public boolean c() {
        return this.aR == 120 || this.aR == 88;
    }

    public boolean a() {
        return this.aR == 103;
    }

    @Override
    public boolean isDirectory() {
        if (this.aO != null) {
            return this.aO.isDirectory();
        }
        if (this.aR == 53) {
            return true;
        }
        return !this.c() && !this.a() && this.getName().endsWith("/");
    }

    public boolean l() {
        return this.h() || this.e();
    }

    void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            this.a(string, string2, map);
        }
    }

    private final void a(String string, String string2, Map map) {
        switch (string) {
            case "path": {
                this.c(string2);
                break;
            }
            case "linkpath": {
                this.b(string2);
                break;
            }
            case "gid": {
                this.b(Long.parseLong(string2));
                break;
            }
            case "gname": {
                this.a(string2);
                break;
            }
            case "uid": {
                this.d(Long.parseLong(string2));
                break;
            }
            case "uname": {
                this.d(string2);
                break;
            }
            case "size": {
                this.c(Long.parseLong(string2));
                break;
            }
            case "mtime": {
                this.a((long)(Double.parseDouble(string2) * 1000.0));
                break;
            }
            case "SCHILY.devminor": {
                this.b(Integer.parseInt(string2));
                break;
            }
            case "SCHILY.devmajor": {
                this.a(Integer.parseInt(string2));
                break;
            }
            case "GNU.sparse.size": {
                this.d(map);
                break;
            }
            case "GNU.sparse.realsize": {
                this.b(map);
                break;
            }
            case "SCHILY.filetype": {
                if (!"sparse".equals(string2)) break;
                this.a(map);
                break;
            }
            default: {
                this.aM.put(string, string2);
            }
        }
    }

    private final void a(byte[] byArray, dd_0 dd_02, boolean bl, boolean bl2) {
        int n = 0;
        this.aA = bl ? jt_0.b(byArray, n, 100) : jt_0.a(byArray, n, 100, dd_02);
        this.av = (int)this.a(byArray, n += 100, 8, bl2);
        this.aK = (int)this.a(byArray, n += 8, 8, bl2);
        this.aC = (int)this.a(byArray, n += 8, 8, bl2);
        this.aF = jt_0.a(byArray, n += 8, 12);
        this.aE = this.a(byArray, n += 12, 12, bl2);
        n += 12;
        this.aJ = jt_0.a(byArray);
        n += 8;
        this.aR = byArray[n++];
        this.aG = bl ? jt_0.b(byArray, n, 100) : jt_0.a(byArray, n, 100, dd_02);
        this.aI = jt_0.b(byArray, n += 100, 6);
        this.as = jt_0.b(byArray, n += 6, 2);
        this.au = bl ? jt_0.b(byArray, n, 32) : jt_0.a(byArray, n += 2, 32, dd_02);
        this.aP = bl ? jt_0.b(byArray, n, 32) : jt_0.a(byArray, n += 32, 32, dd_02);
        n += 32;
        if (this.aR == 51 || this.aR == 52) {
            this.aw = (int)this.a(byArray, n, 8, bl2);
            this.aQ = (int)this.a(byArray, n += 8, 8, bl2);
            n += 8;
        } else {
            n += 16;
        }
        int n2 = this.a(byArray);
        switch (n2) {
            case 2: {
                n += 12;
                n += 12;
                n += 12;
                n += 4;
                ++n;
                this.ay = new ArrayList();
                for (int i = 0; i < 4; ++i) {
                    i7 i72 = jt_0.b(byArray, n + i * 24);
                    if (i72.a() <= 0L && i72.b() <= 0L) continue;
                    this.ay.add(i72);
                }
                this.ax = jt_0.a(byArray, n += 96);
                this.ar = jt_0.c(byArray, ++n, 12);
                n += 12;
                break;
            }
            case 4: {
                String string;
                String string2 = string = bl ? jt_0.b(byArray, n, 131) : jt_0.a(byArray, n, 131, dd_02);
                if (string.length() <= 0) break;
                this.aA = string + "/" + this.aA;
                break;
            }
            default: {
                String string;
                String string3 = string = bl ? jt_0.b(byArray, n, 155) : jt_0.a(byArray, n, 155, dd_02);
                if (this.isDirectory() && !this.aA.endsWith("/")) {
                    this.aA = this.aA + "/";
                }
                if (string.length() <= 0) break;
                this.aA = string + "/" + this.aA;
            }
        }
    }

    private final long a(byte[] byArray, int n, int n2, boolean bl) {
        if (bl) {
            try {
                return jt_0.a(byArray, n, n2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return -1L;
            }
        }
        return jt_0.a(byArray, n, n2);
    }

    private static final String a(String string, boolean bl) {
        String string2;
        if (!bl && (string2 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH)) != null) {
            int n;
            if (string2.startsWith("windows")) {
                if (string.length() > 2) {
                    n = string.charAt(0);
                    char c = string.charAt(1);
                    if (c == ':' && (n >= 97 && n <= 122 || n >= 65 && n <= 90)) {
                        string = string.substring(2);
                    }
                }
            } else if (string2.contains("netware") && (n = string.indexOf(58)) != -1) {
                string = string.substring(n + 1);
            }
        }
        string = string.replace(File.separatorChar, '/');
        while (!bl && string.startsWith("/")) {
            string = string.substring(1);
        }
        return string;
    }

    private final int a(byte[] byArray) {
        if (cd_0.a("ustar ", byArray, 257, 6)) {
            return 2;
        }
        if (cd_0.a("ustar\u0000", byArray, 257, 6)) {
            if (cd_0.a("tar\u0000", byArray, 508, 4)) {
                return 4;
            }
            return 3;
        }
        return 0;
    }

    void d(Map map) {
        this.ap = true;
        this.ar = Integer.parseInt((String)map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.aA = (String)map.get("GNU.sparse.name");
        }
    }

    void b(Map map) {
        this.ap = true;
        this.aH = true;
        this.ar = Integer.parseInt((String)map.get("GNU.sparse.realsize"));
        this.aA = (String)map.get("GNU.sparse.name");
    }

    void a(Map map) {
        this.aq = true;
        if (map.containsKey("SCHILY.realsize")) {
            this.ar = Long.parseLong((String)map.get("SCHILY.realsize"));
        }
    }

    static {
        az = 1000;
        aN = 33188;
        ao = 16877;
        at = 31;
        aL = -1L;
        aD = new bv_0[0];
    }
}

