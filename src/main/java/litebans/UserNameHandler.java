package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
public class UserNameHandler
implements LiteBansModule_235,
LiteBansModule_411 {
    private static final UserNameHandler[] ContinueEvictHandler;
    public static final long aL;
    private String LiteBansModule_7 = "";
    private final boolean HikariConfig;
    private int LiteBansModule_24;
    private long LiteBansModule_15 = 0L;
    private long LiteBansModule_9 = 0L;
    private long ElementsHandler = 0L;
    private long aE;
    private boolean LiteBansModule_14;
    private byte SQLiteDriverHandler;
    private String aG = "";
    private String InitHandler = "ustar\u0000";
    private String CommandExitException = "00";
    private String LiteBansModule_23;
    private String LockdownCommandHandler = "";
    private int LiteBansModule_25 = 0;
    private int LiteBansModule_18 = 0;
    private List ay;
    private boolean ax;
    private long ar;
    private boolean ap;
    private boolean LiteBansModule_13 = false;
    private boolean aq;
    private final File aO;
    private final Map aM = new HashMap();
    public static final int LiteBansModule_21;
    public static final int TapeHandler;
    public static final int aN;
    public static final int az;

    private UserNameHandler(boolean flag) {
        String string = System.getProperty("user.name", "");
        if (string.length() > 31) {
            string = string.substring(0, 31);
        }
        this.LiteBansModule_23 = string;
        this.aO = null;
        this.HikariConfig = flag;
    }

    public UserNameHandler(byte[] byArray, LiteBansModule_119 dd_02, boolean flag) {
        this(false);
        this.plugin(byArray, dd_02, false, flag);
    }

    public boolean BaseCoreGenericHandler(UserNameHandler bv_02) {
        return bv_02 != null && this.getName().equals(bv_02.getName());
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.plugin((UserNameHandler)object);
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String getName() {
        return this.LiteBansModule_7;
    }

    public void c(String string) {
        this.LiteBansModule_7 = UserNameHandler.BaseCoreGenericHandler(string, this.HikariConfig);
    }

    public void LiteBansModule_31(String string) {
        this.aG = string;
    }

    public void AsyncBackgroundTask_5(long l3) {
        this.LiteBansModule_15 = l3;
    }

    public void LiteBansModule_31(long l3) {
        this.LiteBansModule_9 = l3;
    }

    public void AsyncBackgroundTask_5(String string) {
        this.LiteBansModule_23 = string;
    }

    public void BaseCoreGenericHandler(String string) {
        this.LockdownCommandHandler = string;
    }

    public void BaseCoreGenericHandler(long l3) {
        this.aE = l3 / 1000L;
    }

    @Override
    public long getSize() {
        return this.ElementsHandler;
    }

    public void BaseCoreGenericHandler(List list) {
        this.ay = list;
    }

    public List LiteBansModule_194() {
        return this.ay;
    }

    public boolean i() {
        return this.LiteBansModule_13;
    }

    public void c(long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Size is out of range: " + l3);
        }
        this.ElementsHandler = l3;
    }

    public void BaseCoreGenericHandler(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + n);
        }
        this.LiteBansModule_25 = n;
    }

    public void LiteBansModule_31(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + n);
        }
        this.LiteBansModule_18 = n;
    }

    public boolean LiteBansModule_31() {
        return this.ax;
    }

    public long g() {
        if (!this.LiteBansModule_401()) {
            return this.ElementsHandler;
        }
        return this.ar;
    }

    public boolean LiteBansModule_240() {
        return this.AsyncBackgroundTask_5() || this.GnuSparseMapHandler();
    }

    public boolean AsyncBackgroundTask_5() {
        return this.SQLiteDriverHandler == 83;
    }

    public boolean GnuSparseMapHandler() {
        return this.ap;
    }

    public boolean e() {
        return this.aq;
    }

    public boolean Utf8Handler_2() {
        return this.SQLiteDriverHandler == 75;
    }

    public boolean m() {
        return this.SQLiteDriverHandler == 76;
    }

    public boolean c() {
        return this.SQLiteDriverHandler == 120 || this.SQLiteDriverHandler == 88;
    }

    public boolean BaseCoreGenericHandler() {
        return this.SQLiteDriverHandler == 103;
    }

    @Override
    public boolean isDirectory() {
        if (this.aO != null) {
            return this.aO.isDirectory();
        }
        if (this.SQLiteDriverHandler == 53) {
            return true;
        }
        return !this.c() && !this.plugin() && this.getName().endsWith("/");
    }

    public boolean LiteBansModule_401() {
        return this.LiteBansModule_240() || this.e();
    }

    void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            this.plugin(string, string2, map);
        }
    }

    private final void BaseCoreGenericHandler(String string, String string2, Map map) {
        switch (string) {
            case "path": {
                this.c(string2);
                break;
            }
            case "linkpath": {
                this.LiteBansModule_31(string2);
                break;
            }
            case "gid": {
                this.LiteBansModule_31(Long.parseLong(string2));
                break;
            }
            case "gname": {
                this.plugin(string2);
                break;
            }
            case "uid": {
                this.AsyncBackgroundTask_5(Long.parseLong(string2));
                break;
            }
            case "uname": {
                this.AsyncBackgroundTask_5(string2);
                break;
            }
            case "size": {
                this.c(Long.parseLong(string2));
                break;
            }
            case "mtime": {
                this.plugin((long)(Double.parseDouble(string2) * 1000.0));
                break;
            }
            case "SCHILY.devminor": {
                this.LiteBansModule_31(Integer.parseInt(string2));
                break;
            }
            case "SCHILY.devmajor": {
                this.plugin(Integer.parseInt(string2));
                break;
            }
            case "GNU.sparse.size": {
                this.AsyncBackgroundTask_5(map);
                break;
            }
            case "GNU.sparse.realsize": {
                this.LiteBansModule_31(map);
                break;
            }
            case "SCHILY.filetype": {
                if (!"sparse".equals(string2)) break;
                this.plugin(map);
                break;
            }
            default: {
                this.aM.put(string, string2);
            }
        }
    }

    private final void BaseCoreGenericHandler(byte[] byArray, LiteBansModule_119 dd_02, boolean flag, boolean flag2) {
        int n = 0;
        this.LiteBansModule_7 = flag ? LiteBansModule_355.LiteBansModule_31(byArray, n, 100) : LiteBansModule_355.BaseCoreGenericHandler(byArray, n, 100, dd_02);
        this.LiteBansModule_24 = (int)this.plugin(byArray, n += 100, 8, flag2);
        this.LiteBansModule_15 = (int)this.plugin(byArray, n += 8, 8, flag2);
        this.LiteBansModule_9 = (int)this.plugin(byArray, n += 8, 8, flag2);
        this.ElementsHandler = LiteBansModule_355.BaseCoreGenericHandler(byArray, n += 8, 12);
        this.aE = this.plugin(byArray, n += 12, 12, flag2);
        n += 12;
        this.LiteBansModule_14 = LiteBansModule_355.BaseCoreGenericHandler(byArray);
        n += 8;
        this.SQLiteDriverHandler = byArray[n++];
        this.aG = flag ? LiteBansModule_355.LiteBansModule_31(byArray, n, 100) : LiteBansModule_355.BaseCoreGenericHandler(byArray, n, 100, dd_02);
        this.InitHandler = LiteBansModule_355.LiteBansModule_31(byArray, n += 100, 6);
        this.CommandExitException = LiteBansModule_355.LiteBansModule_31(byArray, n += 6, 2);
        this.LiteBansModule_23 = flag ? LiteBansModule_355.LiteBansModule_31(byArray, n, 32) : LiteBansModule_355.BaseCoreGenericHandler(byArray, n += 2, 32, dd_02);
        this.LockdownCommandHandler = flag ? LiteBansModule_355.LiteBansModule_31(byArray, n, 32) : LiteBansModule_355.BaseCoreGenericHandler(byArray, n += 32, 32, dd_02);
        n += 32;
        if (this.SQLiteDriverHandler == 51 || this.SQLiteDriverHandler == 52) {
            this.LiteBansModule_25 = (int)this.plugin(byArray, n, 8, flag2);
            this.LiteBansModule_18 = (int)this.plugin(byArray, n += 8, 8, flag2);
            n += 8;
        } else {
            n += 16;
        }
        int n2 = this.plugin(byArray);
        switch (n2) {
            case 2: {
                n += 12;
                n += 12;
                n += 12;
                n += 4;
                ++n;
                this.ay = new ArrayList();
                for (int i = 0; i < 4; ++i) {
                    LiteBansModule_292 i72 = LiteBansModule_355.LiteBansModule_31(byArray, n + i * 24);
                    if (i72.BaseCoreGenericHandler() <= 0L && i72.LiteBansModule_31() <= 0L) continue;
                    this.ay.add(i72);
                }
                this.ax = LiteBansModule_355.BaseCoreGenericHandler(byArray, n += 96);
                this.ar = LiteBansModule_355.c(byArray, ++n, 12);
                n += 12;
                break;
            }
            case 4: {
                String string;
                String string2 = string = flag ? LiteBansModule_355.LiteBansModule_31(byArray, n, 131) : LiteBansModule_355.BaseCoreGenericHandler(byArray, n, 131, dd_02);
                if (string.length() <= 0) break;
                this.LiteBansModule_7 = string + "/" + this.LiteBansModule_7;
                break;
            }
            default: {
                String string;
                String string3 = string = flag ? LiteBansModule_355.LiteBansModule_31(byArray, n, 155) : LiteBansModule_355.BaseCoreGenericHandler(byArray, n, 155, dd_02);
                if (this.isDirectory() && !this.LiteBansModule_7.endsWith("/")) {
                    this.LiteBansModule_7 = this.LiteBansModule_7 + "/";
                }
                if (string.length() <= 0) break;
                this.LiteBansModule_7 = string + "/" + this.LiteBansModule_7;
            }
        }
    }

    private final long BaseCoreGenericHandler(byte[] byArray, int n, int n2, boolean flag) {
        if (flag) {
            try {
                return LiteBansModule_355.BaseCoreGenericHandler(byArray, n, n2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return -1L;
            }
        }
        return LiteBansModule_355.BaseCoreGenericHandler(byArray, n, n2);
    }

    private static final String BaseCoreGenericHandler(String string, boolean flag) {
        String string2;
        if (!flag && (string2 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH)) != null) {
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
        while (!flag && string.startsWith("/")) {
            string = string.substring(1);
        }
        return string;
    }

    private final int BaseCoreGenericHandler(byte[] byArray) {
        if (LiteBansModule_76.BaseCoreGenericHandler("ustar ", byArray, 257, 6)) {
            return 2;
        }
        if (LiteBansModule_76.BaseCoreGenericHandler("ustar\u0000", byArray, 257, 6)) {
            if (LiteBansModule_76.BaseCoreGenericHandler("tar\u0000", byArray, 508, 4)) {
                return 4;
            }
            return 3;
        }
        return 0;
    }

    void AsyncBackgroundTask_5(Map map) {
        this.ap = true;
        this.ar = Integer.parseInt((String)map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.LiteBansModule_7 = (String)map.get("GNU.sparse.name");
        }
    }

    void LiteBansModule_31(Map map) {
        this.ap = true;
        this.LiteBansModule_13 = true;
        this.ar = Integer.parseInt((String)map.get("GNU.sparse.realsize"));
        this.LiteBansModule_7 = (String)map.get("GNU.sparse.name");
    }

    void BaseCoreGenericHandler(Map map) {
        this.aq = true;
        if (map.containsKey("SCHILY.realsize")) {
            this.ar = Long.parseLong((String)map.get("SCHILY.realsize"));
        }
    }

    static {
        az = 1000;
        aN = 33188;
        TapeHandler = 16877;
        LiteBansModule_21 = 31;
        aL = -1L;
        ContinueEvictHandler = new UserNameHandler[0];
    }
}

