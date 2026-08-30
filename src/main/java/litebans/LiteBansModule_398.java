package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
public class LiteBansModule_398
extends ZipEntry
implements LiteBansModule_236,
LiteBansModule_310 {
    public static final int CommandThrottleService;
    public static final int m;
    public static final int i;
    private static final int BroadcastService;
    private static final int e;
    private static final byte[] Utf8Handler_2;
    private int c = -1;
    private long LiteBansModule_403 = -1L;
    private int LiteBansModule_435 = 0;
    private int LiteBansModule_241 = 0;
    private long AsyncBackgroundTask_21 = 0L;
    private int LiteBansModule_31 = 0;
    private LiteBansModule_178[] PunishmentTableService;
    private LiteBansModule_265 AsyncBackgroundTask_22 = null;
    private String LiteBansModule_195 = null;
    private byte[] GnuSparseMapHandler = null;
    private DefaultThreadFactory r = new DefaultThreadFactory();
    private static final LiteBansModule_178[] q;
    private long AsyncBackgroundTask_5 = -1L;
    private long DatabaseMonitorService = -1L;
    private boolean ServerSyncService = false;
    private NameHandler n = NameHandler.BaseCoreGenericHandler;
    private CommentHandler g = CommentHandler.c;

    public LiteBansModule_398(String string) {
        super(string);
        this.plugin(string);
    }

    protected LiteBansModule_398() {
        this("");
    }

    @Override
    public Object clone() {
        LiteBansModule_398 kw_02 = (LiteBansModule_398)super.clone();
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
        return this.LiteBansModule_435;
    }

    public void BaseCoreGenericHandler(int n) {
        this.LiteBansModule_435 = n;
    }

    public long c() {
        return this.AsyncBackgroundTask_21;
    }

    public void BaseCoreGenericHandler(long l3) {
        this.AsyncBackgroundTask_21 = l3;
    }

    public int LiteBansModule_195() {
        return this.LiteBansModule_241;
    }

    public void BaseCoreGenericHandler(LiteBansModule_178[] en_0Array) {
        this.AsyncBackgroundTask_22 = null;
        ArrayList<LiteBansModule_178> arrayList = new ArrayList<LiteBansModule_178>();
        if (en_0Array != null) {
            for (LiteBansModule_178 en_02 : en_0Array) {
                if (en_02 instanceof LiteBansModule_265) {
                    this.AsyncBackgroundTask_22 = (LiteBansModule_265)en_02;
                    continue;
                }
                arrayList.add(en_02);
            }
        }
        this.PunishmentTableService = arrayList.toArray(q);
        this.GnuSparseMapHandler();
    }

    private final LiteBansModule_178[] i() {
        if (this.PunishmentTableService == null) {
            return this.plugin();
        }
        return this.AsyncBackgroundTask_22 != null ? this.g() : this.PunishmentTableService;
    }

    private final LiteBansModule_178[] g() {
        LiteBansModule_178[] en_0Array = this.plugin(this.PunishmentTableService, this.PunishmentTableService.length + 1);
        en_0Array[this.PunishmentTableService.length] = this.AsyncBackgroundTask_22;
        return en_0Array;
    }

    private final LiteBansModule_178[] BaseCoreGenericHandler() {
        LiteBansModule_178[] en_0Array;
        if (this.AsyncBackgroundTask_22 == null) {
            en_0Array = q;
        } else {
            LiteBansModule_178[] en_0Array2 = new LiteBansModule_178[1];
            en_0Array = en_0Array2;
            en_0Array2[0] = this.AsyncBackgroundTask_22;
        }
        return en_0Array;
    }

    public void BaseCoreGenericHandler(LiteBansModule_178 en_02) {
        if (en_02 instanceof LiteBansModule_265) {
            this.AsyncBackgroundTask_22 = (LiteBansModule_265)en_02;
        } else if (this.PunishmentTableService == null) {
            this.PunishmentTableService = new LiteBansModule_178[]{en_02};
        } else {
            if (this.plugin(en_02.c()) != null) {
                this.LiteBansModule_31(en_02.c());
            }
            LiteBansModule_178[] en_0Array = this.plugin(this.PunishmentTableService, this.PunishmentTableService.length + 1);
            en_0Array[en_0Array.length - 1] = en_02;
            this.PunishmentTableService = en_0Array;
        }
        this.GnuSparseMapHandler();
    }

    public void LiteBansModule_31(LiteBansModule_289 i22) {
        if (this.PunishmentTableService == null) {
            throw new NoSuchElementException();
        }
        ArrayList<LiteBansModule_178> arrayList = new ArrayList<LiteBansModule_178>();
        for (LiteBansModule_178 en_02 : this.PunishmentTableService) {
            if (i22.equals(en_02.c())) continue;
            arrayList.add(en_02);
        }
        if (this.PunishmentTableService.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        this.PunishmentTableService = arrayList.toArray(q);
        this.GnuSparseMapHandler();
    }

    public LiteBansModule_178 BaseCoreGenericHandler(LiteBansModule_289 i22) {
        if (this.PunishmentTableService != null) {
            for (LiteBansModule_178 en_02 : this.PunishmentTableService) {
                if (!i22.equals(en_02.c())) continue;
                return en_02;
            }
        }
        return null;
    }

    @Override
    public void setExtra(byte[] byArray) {
        try {
            LiteBansModule_178[] en_0Array = LiteBansModule_8.BaseCoreGenericHandler(byArray, true, StrictForKnowHandler.LiteBansModule_195);
            this.plugin(en_0Array, true);
        }
        catch (ZipException zipException) {
            throw new RuntimeException("Error parsing extra fields for entry: " + this.getName() + " - " + zipException.getMessage(), zipException);
        }
    }

    protected void GnuSparseMapHandler() {
        super.setExtra(LiteBansModule_8.LiteBansModule_31(this.i()));
    }

    public byte[] LiteBansModule_241() {
        byte[] byArray = this.getExtra();
        return byArray != null ? byArray : Utf8Handler_2;
    }

    public byte[] e() {
        return LiteBansModule_8.BaseCoreGenericHandler(this.i());
    }

    @Override
    public String getName() {
        return this.LiteBansModule_195 == null ? super.getName() : this.LiteBansModule_195;
    }

    @Override
    public boolean isDirectory() {
        String string = this.getName();
        return string != null && string.endsWith("/");
    }

    protected void BaseCoreGenericHandler(String string) {
        if (string != null && this.LiteBansModule_195() == 0 && !string.contains("/")) {
            string = string.replace('\\', '/');
        }
        this.LiteBansModule_195 = string;
    }

    @Override
    public long getSize() {
        return this.LiteBansModule_403;
    }

    @Override
    public void setSize(long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid entry size");
        }
        this.LiteBansModule_403 = l3;
    }

    @Override
    public int hashCode() {
        String string = this.getName();
        return (string == null ? "" : string).hashCode();
    }

    public DefaultThreadFactory AsyncBackgroundTask_5() {
        return this.r;
    }

    private final void BaseCoreGenericHandler(LiteBansModule_178[] en_0Array, boolean flag) {
        if (this.PunishmentTableService == null) {
            this.plugin(en_0Array);
        } else {
            for (LiteBansModule_178 en_02 : en_0Array) {
                LiteBansModule_178 en_03 = en_02 instanceof LiteBansModule_265 ? this.AsyncBackgroundTask_22 : this.plugin(en_02.c());
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
                    LiteBansModule_436 y_02 = new LiteBansModule_436();
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

    public boolean equals(Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (targetObj == null || this.getClass() != targetObj.getClass()) {
            return false;
        }
        LiteBansModule_398 kw_02 = (LiteBansModule_398)targetObj;
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
        return this.getTime() == kw_02.getTime() && string3.equals(string4) && this.LiteBansModule_31() == kw_02.LiteBansModule_31() && this.LiteBansModule_195() == kw_02.LiteBansModule_195() && this.c() == kw_02.c() && this.getMethod() == kw_02.getMethod() && this.getSize() == kw_02.getSize() && this.getCrc() == kw_02.getCrc() && this.getCompressedSize() == kw_02.getCompressedSize() && Arrays.equals(this.e(), kw_02.e()) && Arrays.equals(this.LiteBansModule_241(), kw_02.LiteBansModule_241()) && this.AsyncBackgroundTask_5 == kw_02.AsyncBackgroundTask_5 && this.DatabaseMonitorService == kw_02.DatabaseMonitorService && this.r.equals(kw_02.r);
    }

    private final LiteBansModule_178[] BaseCoreGenericHandler(LiteBansModule_178[] en_0Array, int n) {
        LiteBansModule_178[] en_0Array2 = new LiteBansModule_178[n];
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
        q = new LiteBansModule_178[0];
    }
}

