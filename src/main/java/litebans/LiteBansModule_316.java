package litebans;

public class LiteBansModule_316 {
    private long Utf8Handler_2;
    private long LiteBansModule_194;
    private int AsyncBackgroundTask_5;
    private String LiteBansModule_31;
    private int i;
    private String e;
    private String c;
    private String g;
    private int LiteBansModule_240;
    private int GnuSparseMapHandler;
    private int BaseCoreGenericHandler;

    LiteBansModule_316(byte[] byArray, LiteBansModule_119 dd_02) {
        this.Utf8Handler_2 = 1000L * (long)LiteBansModule_108.LiteBansModule_31(byArray, 4);
        this.LiteBansModule_194 = 1000L * (long)LiteBansModule_108.LiteBansModule_31(byArray, 8);
        this.AsyncBackgroundTask_5 = LiteBansModule_108.LiteBansModule_31(byArray, 12);
        this.LiteBansModule_31 = LiteBansModule_108.BaseCoreGenericHandler(dd_02, byArray, 676, 16).trim();
        this.i = LiteBansModule_108.LiteBansModule_31(byArray, 692);
        this.e = LiteBansModule_108.BaseCoreGenericHandler(dd_02, byArray, 696, 64).trim();
        this.c = LiteBansModule_108.BaseCoreGenericHandler(dd_02, byArray, 760, 64).trim();
        this.g = LiteBansModule_108.BaseCoreGenericHandler(dd_02, byArray, 824, 64).trim();
        this.LiteBansModule_240 = LiteBansModule_108.LiteBansModule_31(byArray, 888);
        this.GnuSparseMapHandler = LiteBansModule_108.LiteBansModule_31(byArray, 892);
        this.plugin = LiteBansModule_108.LiteBansModule_31(byArray, 896);
    }

    public String c() {
        return this.c;
    }

    public String LiteBansModule_31() {
        return this.g;
    }

    public int BaseCoreGenericHandler() {
        return this.plugin;
    }

    public boolean AsyncBackgroundTask_5() {
        return (this.LiteBansModule_240 & 0x80) == 128;
    }

    public int hashCode() {
        int n = 17;
        if (this.LiteBansModule_31 != null) {
            n = this.LiteBansModule_31.hashCode();
        }
        n = (int)((long)n + 31L * this.Utf8Handler_2);
        if (this.g != null) {
            n = 31 * this.g.hashCode() + 17;
        }
        if (this.c != null) {
            n = 31 * this.c.hashCode() + 17;
        }
        return n;
    }

    public boolean equals(Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (targetObj == null || !targetObj.getClass().equals(this.getClass())) {
            return false;
        }
        LiteBansModule_316 iq_02 = (LiteBansModule_316)targetObj;
        if (this.Utf8Handler_2 != iq_02.Utf8Handler_2) {
            return false;
        }
        if (this.LiteBansModule_31() == null || !this.LiteBansModule_31().equals(iq_02.LiteBansModule_31())) {
            return false;
        }
        return this.c() != null && this.c().equals(iq_02.c());
}

