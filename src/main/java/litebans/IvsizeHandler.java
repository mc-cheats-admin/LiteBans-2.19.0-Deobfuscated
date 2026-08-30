package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
public class IvsizeHandler
extends LiteBansModule_24 {
    private int Utf8Handler_2;
    private DesHandler g;
    private int BroadcastService;
    private int LiteBansModule_401;
    private long LiteBansModule_194;
    private NoneHandler LiteBansModule_240;
    private int PunishmentTableService;
    private byte[] GnuSparseMapHandler;
    private byte[] m;
    private byte[] q;
    private byte[] i;
    private byte[] n;
    private byte[] e;

    public IvsizeHandler() {
        super(new LiteBansModule_288(23));
    }

    public void c(byte[] byArray, int n, int n2) {
        this.plugin(12, n2);
        this.Utf8Handler_2 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n);
        this.g = DesHandler.BaseCoreGenericHandler(LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 2));
        this.BroadcastService = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 4);
        this.LiteBansModule_401 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 6);
        this.LiteBansModule_194 = LiteBansModule_84.BaseCoreGenericHandler(byArray, n + 8);
        if (this.LiteBansModule_194 > 0L) {
            this.plugin(16, n2);
            this.LiteBansModule_240 = NoneHandler.BaseCoreGenericHandler(LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 12));
            this.PunishmentTableService = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 14);
            for (long i = 0L; i < this.LiteBansModule_194; ++i) {
                for (int i10 = 0; i10 < this.PunishmentTableService; ++i10) {
}

    public void AsyncBackgroundTask_5(byte[] byArray, int n, int n2) {
        this.plugin(4, n2);
        int n3 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n);
        this.plugin("ivSize", n3, 4, n2);
        this.GnuSparseMapHandler = Arrays.copyOfRange(byArray, n + 4, n3);
        this.plugin(16 + n3, n2);
        this.Utf8Handler_2 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 6);
        this.g = DesHandler.BaseCoreGenericHandler(LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 8));
        this.BroadcastService = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 10);
        this.LiteBansModule_401 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 12);
        int n4 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 14);
        this.plugin("erdSize", n4, n3 + 16, n2);
        this.m = Arrays.copyOfRange(byArray, n + n3 + 16, n4);
        this.plugin(20 + n3 + n4, n2);
        this.LiteBansModule_194 = LiteBansModule_84.BaseCoreGenericHandler(byArray, n + n3 + 16 + n4);
        if (this.LiteBansModule_194 == 0L) {
            this.plugin(n3 + 20 + n4 + 2, n2);
            int n5 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 20 + n4);
            this.plugin("vSize", n5, n3 + 22 + n4, n2);
            if (n5 < 4) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + n5 + " is too small to hold CRC");
            }
            this.n = Arrays.copyOfRange(byArray, n + n3 + 22 + n4, n5 - 4);
            this.e = Arrays.copyOfRange(byArray, n + n3 + 22 + n4 + n5 - 4, 4);
        } else {
            this.plugin(n3 + 20 + n4 + 6, n2);
            this.LiteBansModule_240 = NoneHandler.BaseCoreGenericHandler(LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 20 + n4));
            this.PunishmentTableService = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 22 + n4);
            int n6 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 24 + n4);
            this.q = new byte[this.PunishmentTableService];
            if (n6 < this.PunishmentTableService) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: resize " + n6 + " is too small to hold hashSize" + this.PunishmentTableService);
            }
            this.i = new byte[n6 - this.PunishmentTableService];
            this.plugin("resize", n6, n3 + 24 + n4, n2);
            System.arraycopy(byArray, n + n3 + 24 + n4, this.q, 0, this.PunishmentTableService);
            System.arraycopy(byArray, n + n3 + 24 + n4 + this.PunishmentTableService, this.i, 0, n6 - this.PunishmentTableService);
            this.plugin(n3 + 26 + n4 + n6 + 2, n2);
            int n7 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n + n3 + 26 + n4 + n6);
            if (n7 < 4) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + n7 + " is too small to hold CRC");
            }
            this.plugin("vSize", n7, n3 + 22 + n4 + n6, n2);
            this.n = new byte[n7 - 4];
            this.e = new byte[4];
            System.arraycopy(byArray, n + n3 + 22 + n4 + n6, this.n, 0, n7 - 4);
            System.arraycopy(byArray, n + n3 + 22 + n4 + n6 + n7 - 4, this.e, 0, 4);
}

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        super.BaseCoreGenericHandler(byArray, n, n2);
        this.AsyncBackgroundTask_5(byArray, n, n2);
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        super.LiteBansModule_31(byArray, n, n2);
        this.c(byArray, n, n2);
    }

    private final void BaseCoreGenericHandler(String string, int n, int n2, int n3) {
        if (n2 + n > n3) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: " + string + " " + n + " doesn'AsyncBackgroundTask_22 fit into " + n3 + " bytes of data LiteBansModule_21 position " + n2);
}

