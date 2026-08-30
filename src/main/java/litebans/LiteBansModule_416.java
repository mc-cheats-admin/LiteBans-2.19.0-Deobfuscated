package litebans;

import net.minecraft.class_2540;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public class LiteBansModule_416
extends LiteBansModule_410
implements CustomPacketPayload {
        public LiteBansModule_416(String string, byte[] byArray) {
        super(string, byArray);
    }

    private LiteBansModule_416(class_2540 class_25402) {
        super("", new byte[class_25402.readableBytes()]);
        class_25402.readBytes(this.plugin);
    }

    private final void BaseCoreGenericHandler(class_2540 class_25402) {
        class_25402.writeBytes(this.plugin);
    }

    public CustomPacketPayload.Type type() {
        return new CustomPacketPayload.Type(Identifier.parse((String)this.LiteBansModule_31));
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{""};
    }

    static {
        LiteBansModule_416.BaseCoreGenericHandler();
    }
}

