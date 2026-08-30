package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
public class LiteBansModule_396
extends ZipEntry
implements LiteBansModule_235,
LiteBansModule_309 {
    public static final int CommandThrottleService;
    public static final int m;
    public static final int i;
    private static final int BroadcastService;
    private static final int e;
    private static final byte[] Utf8Handler_2;
    private int c = -1;
    private long LiteBansModule_401 = -1L;
    private int LiteBansModule_433 = 0;
    private int LiteBansModule_240 = 0;
    private long AsyncBackgroundTask_21 = 0L;
    private int LiteBansModule_31 = 0;
    private LiteBansModule_177[] PunishmentTableService;
    private LiteBansModule_264 AsyncBackgroundTask_22 = null;
    private String LiteBansModule_194 = null;
    private byte[] GnuSparseMapHandler = null;
    private DefaultThreadFactory r = new DefaultThreadFactory();
    private static final LiteBansModule_177[] q;
    private long AsyncBackgroundTask_5 = -1L;
    private long DatabaseMonitorService = -1L;
    private boolean ServerSyncService = false;
    private NameHandler n = NameHandler.BaseCoreGenericHandler;
    private CommentHandler g = CommentHandler.c;

    public LiteBansModule_396(String string) {
        super(string);
        this.plugin(string);
    }

    protected LiteBansModule_396() {
        this("");
    }

    @Override
    public Object clone() {
        LiteBansModule_396 kw_02 = (LiteBansModule_396)super.clone();
        kw_02.BaseCoreGenericHandler(this.LiteBansModule_31());
        kw_02.BaseCoreGenericHandler(this.c());
        kw_02.BaseCoreGenericHandler(this.i());
        return kw_02;
    }

    @Override
    public int getMethod() {
        return this.c;
    }

    @Override
    public void setMethod(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + n);
        }
        this.c = n;
    }

    public int LiteBansModule_31() {
        return this.LiteBansModule_433;
    }

    public void BaseCoreGenericHandler(int n) {
        this.LiteBansModule_433 = n;
    }

    public long c() {
        return this.AsyncBackgroundTask_21;
    }

    public void BaseCoreGenericHandler(long l3) {
        this.AsyncBackgroundTask_21 = l3;
    }

    public int LiteBansModule_194() {
        return this.LiteBansModule_240;
    }

    public void BaseCoreGenericHandler(LiteBansModule_177[] en_0Array) {
        this.AsyncBackgroundTask_22 = null;
        ArrayList<LiteBansModule_177> arrayList = new ArrayList<LiteBansModule_177>();
        if (en_0Array != null) {
            for (LiteBansModule_177 en_02 : en_0Array) {
                if (en_02 instanceof LiteBansModule_264) {
                    this.AsyncBackgroundTask_22 = (LiteBansModule_264)en_02;
                    continue;
                }
                arrayList.add(en_02);
            }
        }
        this.PunishmentTableService = arrayList.toArray(q);
        this.GnuSparseMapHandler();
    }

    private final LiteBansModule_177[] i() {
        if (this.PunishmentTableService == null) {
            return this.plugin();
        }
        return this.AsyncBackgroundTask_22 != null ? this.g() : this.PunishmentTableService;
    }

    private final LiteBansModule_177[] g() {
        LiteBansModule_177[] en_0Array = this.plugin(this.PunishmentTableService, this.PunishmentTableService.length + 1);
        en_0Array[this.PunishmentTableService.length] = this.AsyncBackgroundTask_22;
        return en_0Array;
    }

    private final LiteBansModule_177[] BaseCoreGenericHandler() {
        LiteBansModule_177[] en_0Array;
        if (this.AsyncBackgroundTask_22 == null) {
            en_0Array = q;
        } else {
            LiteBansModule_177[] en_0Array2 = new LiteBansModule_177[1];
            en_0Array = en_0Array2;
            en_0Array2[0] = this.AsyncBackgroundTask_22;
        }
        return en_0Array;
    }

    public void BaseCoreGenericHandler(LiteBansModule_177 en_02) {
        if (en_02 instanceof LiteBansModule_264) {
            this.AsyncBackgroundTask_22 = (LiteBansModule_264)en_02;
        } else if (this.PunishmentTableService == null) {
            this.PunishmentTableService = new LiteBansModule_177[]{en_02};
        } else {
            if (this.plugin(en_02.c()) != null) {
                this.LiteBansModule_31(en_02.c());
            }
            LiteBansModule_177[] en_0Array = this.plugin(this.PunishmentTableService, this.PunishmentTableService.length + 1);
            en_0Array[en_0Array.length - 1] = en_02;
            this.PunishmentTableService = en_0Array;
        }
        this.GnuSparseMapHandler();
    }

    public void LiteBansModule_31(LiteBansModule_288 i22) {
        if (this.PunishmentTableService == null) {
            throw new NoSuchElementException();
        }
        ArrayList<LiteBansModule_177> arrayList = new ArrayList<LiteBansModule_177>();
        for (LiteBansModule_177 en_02 : this.PunishmentTableService) {
            if (i22.equals(en_02.c())) continue;
            arrayList.add(en_02);
        }
        if (this.PunishmentTableService.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        this.PunishmentTableService = arrayList.toArray(q);
        this.GnuSparseMapHandler();
    }

    public LiteBansModule_177 BaseCoreGenericHandler(LiteBansModule_288 i22) {
        if (this.PunishmentTableService != null) {
            for (LiteBansModule_177 en_02 : this.PunishmentTableService) {
                if (!i22.equals(en_02.c())) continue;
                return en_02;
            }
        }
        return null;
    }

    @Override
    public void setExtra(byte[] byArray) {
        try {
            LiteBansModule_177[] en_0Array = LiteBansModule_8.BaseCoreGenericHandler(byArray, true, StrictForKnowHandler.LiteBansModule_194);
            this.plugin(en_0Array, true);
        }
        catch (ZipException zipException) {
            throw new RuntimeException("Error parsing extra fields for entry: " + this.getName() + " - " + zipException.getMessage(), zipException);
        }
    }

    protected void GnuSparseMapHandler() {
        super.setExtra(LiteBansModule_8.LiteBansModule_31(this.i()));
    }

    public byte[] LiteBansModule_240() {
        byte[] byArray = this.getExtra();
        return byArray != null ? byArray : Utf8Handler_2;
    }

    public byte[] e() {
        return LiteBansModule_8.BaseCoreGenericHandler(this.i());
    }

    @Override
    public String getName() {
        return this.LiteBansModule_194 == null ? super.getName() : this.LiteBansModule_194;
    }

    @Override
    public boolean isDirectory() {
        String string = this.getName();
        return string != null && string.endsWith("/");
    }

    protected void BaseCoreGenericHandler(String string) {
        if (string != null && this.LiteBansModule_194() == 0 && !string.contains("/")) {
            string = string.replace('\\', '/');
        }
        this.LiteBansModule_194 = string;
    }

    @Override
    public long getSize() {
        return this.LiteBansModule_401;
    }

    @Override
    public void setSize(long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid entry size");
        }
        this.LiteBansModule_401 = l3;
    }

    @Override
    public int hashCode() {
        String string = this.getName();
        return (string == null ? "" : string).hashCode();
    }

    public DefaultThreadFactory AsyncBackgroundTask_5() {
        return this.r;
    }

    private final void BaseCoreGenericHandler(LiteBansModule_177[] en_0Array, boolean flag) {
        if (this.PunishmentTableService == null) {
            this.plugin(en_0Array);
        } else {
            for (LiteBansModule_177 en_02 : en_0Array) {
                LiteBansModule_177 en_03 = en_02 instanceof LiteBansModule_264 ? this.AsyncBackgroundTask_22 : this.plugin(en_02.c());
                if (en_03 == null) {
                    this.plugin(en_02);
                    continue;
                }
                byte[] byArray = flag ? en_02.e() : en_02.AsyncBackgroundTask_5();
                try {
                    if (flag) {
                        en_03.BaseCoreGenericHandler(byArray, 0, byArray.length);
                        continue;
                    }
                    en_03.LiteBansModule_31(byArray, 0, byArray.length);
                }
                catch (ZipException zipException) {
                    LiteBansModule_434 y_02 = new LiteBansModule_434();
                    y_02.BaseCoreGenericHandler(en_03.c());
                    if (flag) {
                        y_02.LiteBansModule_31(byArray);
                        y_02.BaseCoreGenericHandler(en_03.AsyncBackgroundTask_5());
                    } else {
                        y_02.LiteBansModule_31(en_03.e());
                        y_02.BaseCoreGenericHandler(byArray);
                    }
                    this.LiteBansModule_31(en_03.c());
                    this.plugin(y_02);
                }
            }
            this.GnuSparseMapHandler();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        LiteBansModule_396 kw_02 = (LiteBansModule_396)object;
        String string = this.getName();
        String string2 = kw_02.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.getComment();
        String string4 = kw_02.getComment();
        if (string3 == null) {
            string3 = "";
        }
        if (string4 == null) {
            string4 = "";
        }
        return this.getTime() == kw_02.getTime() && string3.equals(string4) && this.LiteBansModule_31() == kw_02.LiteBansModule_31() && this.LiteBansModule_194() == kw_02.LiteBansModule_194() && this.c() == kw_02.c() && this.getMethod() == kw_02.getMethod() && this.getSize() == kw_02.getSize() && this.getCrc() == kw_02.getCrc() && this.getCompressedSize() == kw_02.getCompressedSize() && Arrays.equals(this.e(), kw_02.e()) && Arrays.equals(this.LiteBansModule_240(), kw_02.LiteBansModule_240()) && this.AsyncBackgroundTask_5 == kw_02.AsyncBackgroundTask_5 && this.DatabaseMonitorService == kw_02.DatabaseMonitorService && this.r.equals(kw_02.r);
    }

    private final LiteBansModule_177[] BaseCoreGenericHandler(LiteBansModule_177[] en_0Array, int n) {
        LiteBansModule_177[] en_0Array2 = new LiteBansModule_177[n];
        System.arraycopy(en_0Array, 0, en_0Array2, 0, Math.min(en_0Array.length, n));
        return en_0Array2;
    }

    static {
        e = 16;
        BroadcastService = 65535;
        i = -1;
        m = 0;
        CommandThrottleService = 3;
        Utf8Handler_2 = new byte[0];
        q = new LiteBansModule_177[0];
    }
}

