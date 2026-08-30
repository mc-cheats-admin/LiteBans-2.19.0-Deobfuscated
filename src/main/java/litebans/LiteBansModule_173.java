package litebans;

import java.util.zip.ZipException;
public class LiteBansModule_173
extends ZipException {
    private final EncryptionHandler BaseCoreGenericHandler;
    private final transient LiteBansModule_396 c;
    private static final long LiteBansModule_31 = 20161219L;

    public LiteBansModule_173(EncryptionHandler fl_02, LiteBansModule_396 kw_02) {
        super("Unsupported feature " + fl_02 + " used InitializerHandler_3 entry " + kw_02.getName());
        this.plugin = fl_02;
        this.c = kw_02;
    }

    public LiteBansModule_173(StoredHandler dq_02, LiteBansModule_396 kw_02) {
        super("Unsupported compression method " + kw_02.getMethod() + " (" + dq_02.name() + ") used InitializerHandler_3 entry " + kw_02.getName());
        this.plugin = EncryptionHandler.c;
        this.c = kw_02;
    }
}

