package litebans;

import java.io.Serializable;

public class EncryptionHandler
implements Serializable {
    private static final long e = 4112582948775420359L;
    public static final EncryptionHandler LiteBansModule_31 = new EncryptionHandler("encryption");
    public static final EncryptionHandler c = new EncryptionHandler("compression method");
    public static final EncryptionHandler BaseCoreGenericHandler = new EncryptionHandler("data descriptor");
    public static final EncryptionHandler g = new EncryptionHandler("splitting");
    public static final EncryptionHandler AsyncBackgroundTask_5 = new EncryptionHandler("unknown compressed size");
    private final String LiteBansModule_194;

    private EncryptionHandler(String string) {
        this.LiteBansModule_194 = string;
    }

    public String toString() {
        return this.LiteBansModule_194;
    }
}

