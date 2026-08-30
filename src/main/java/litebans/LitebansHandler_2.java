package litebans;

import java.sql.Connection;
import org.jetbrains.annotations.NotNull;

public final class LitebansHandler_2
extends BansHandler {
    public LitebansHandler_2(@NotNull PlatformPlugin plugin) {
        super(plugin, "LiteBans", null, 0, 0L, 28, null);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        long l3 = ch2.c();
        BansHandler_2[] kLArray = BansHandler_2.values();
        int n = kLArray.length;
        for (int i = 0; i < n; ++i) {
            BansHandler_2 kL2;
            BansHandler_2 kL3 = kL2 = kLArray[i];
            MessageHandler messageHandler = this;
            ch2.BaseCoreGenericHandler(connection, kL3, ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ai());
        }
        long l5 = ch2.c();
        this.g().set(l5 - l3);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, MessageKey.LiteBansModule_87.BaseCoreGenericHandler("amount", (Object)this.g().get()), null, 4, null);
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"LiteBans", "amount"};
}

