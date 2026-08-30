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
public class ArjHandler
implements LiteBansModule_128 {
    private static final int n;
    private static final int LiteBansModule_31;
    private static final int BroadcastService;
    private static final ArjHandler AsyncBackgroundTask_5;
    public static final String m;
    public static final String LiteBansModule_194;
    public static final String c;
    public static final String i;
    public static final String BaseCoreGenericHandler;
    public static final String LiteBansModule_401;
    public static final String Utf8Handler_2;
    public static final String g;
    private final String GnuSparseMapHandler;
    private volatile String e;
    private SortedMap LiteBansModule_240;

    private static final ArrayList BaseCoreGenericHandler() {
        return LiteBansModule_291.BaseCoreGenericHandler(ArjHandler.LiteBansModule_194());
    }

    static final void BaseCoreGenericHandler(Set set, LiteBansModule_128 dm_02, TreeMap treeMap) {
        for (String string : set) {
            treeMap.put(ArjHandler.BaseCoreGenericHandler(string), dm_02);
        }
    }

    private static final Iterator LiteBansModule_194() {
        return new LiteBansModule_346(LiteBansModule_128.class);
    }

    private static final String BaseCoreGenericHandler(String string) {
        return string.toUpperCase(Locale.ROOT);
    }

    public static final SortedMap c() {
        return (SortedMap)AccessController.doPrivileged(new LiteBansModule_152());
    }

    public ArjHandler() {
        this(null);
    }

    public ArjHandler(String string) {
        this.GnuSparseMapHandler = string;
        this.e = string;
    }

    public LiteBansModule_153 BaseCoreGenericHandler(String string, InputStream inputStream) {
        return this.plugin(string, inputStream, this.e);
    }

    @Override
    public LiteBansModule_153 BaseCoreGenericHandler(String string, InputStream inputStream, String string2) {
        if (string == null) {
            throw new IllegalArgumentException("Archivername must not be ");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be ");
        }
        if ("ar".equalsIgnoreCase(string)) {
            return new LiteBansModule_194(inputStream);
        }
        if ("arj".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new Cp437Handler(inputStream, string2);
            }
            return new Cp437Handler(inputStream);
        }
        if ("zip".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new Utf8Handler_2(inputStream, string2);
            }
            return new Utf8Handler_2(inputStream);
        }
        if ("tar".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new GnuSparseMapHandler(inputStream, string2);
            }
            return new GnuSparseMapHandler(inputStream);
        }
        if ("jar".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new LiteBansModule_401(inputStream, string2);
            }
            return new LiteBansModule_401(inputStream);
        }
        if ("cpio".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new LiteBansModule_240(inputStream, string2);
            }
            return new LiteBansModule_240(inputStream);
        }
        if ("dump".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new LiteBansModule_296(inputStream, string2);
            }
            return new LiteBansModule_296(inputStream);
        }
        if ("7z".equalsIgnoreCase(string)) {
            throw new LiteBansModule_257("7z");
        }
        LiteBansModule_128 dm_02 = (LiteBansModule_128)this.LiteBansModule_31().get(ArjHandler.BaseCoreGenericHandler(string));
        if (dm_02 != null) {
            return dm_02.BaseCoreGenericHandler(string, inputStream, string2);
        }
        throw new LiteBansException_8("Archiver: " + string + " not ");
    }

    public SortedMap LiteBansModule_31() {
        if (this.LiteBansModule_240 == null) {
            this.LiteBansModule_240 = Collections.unmodifiableSortedMap(ArjHandler.c());
        }
        return this.LiteBansModule_240;
    }

    @Override
    public Set BaseCoreGenericHandler() {
        return LiteBansModule_234.BaseCoreGenericHandler(new String[]{"ar", "arj", "zip", "tar", "jar", "cpio", "dump", "7z"});
    }

    static final /* synthetic */ ArjHandler e() {
        return AsyncBackgroundTask_5;
    }

    static final /* synthetic */ ArrayList AsyncBackgroundTask_5() {
        return ArjHandler.BaseCoreGenericHandler();
    }

    static {
        g = "7z";
        Utf8Handler_2 = "zip";
        LiteBansModule_401 = "tar";
        BaseCoreGenericHandler = "jar";
        i = "dump";
        c = "cpio";
        LiteBansModule_194 = "arj";
        m = "ar";
        BroadcastService = 12;
        LiteBansModule_31 = 32;
        n = 512;
        AsyncBackgroundTask_5 = new ArjHandler();
    }
}

