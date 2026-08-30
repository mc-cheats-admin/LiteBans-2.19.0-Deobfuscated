package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ChatFormatter {
        private ChatFormatter() {
    }

    public final ThreadLocal LiteBansModule_31() {
        return MessageHandler.c();
    }

    public final Void BaseCoreGenericHandler(@Nullable Object targetObj) {
        throw new LiteBansException(targetObj);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence, @NotNull PlatformPlugin plugin) {
        if (charSequence.length() == 0) {
            return;
        }
        if (flag) {
            return;
        }
        HoverTextFormatter y2 = (HoverTextFormatter)plugin.BaseCoreGenericHandler(HoverTextFormatter.class);
        CharSequence charSequence2 = charSequence;
        int n = 4096;
        String string = LiteBansModule_243.BaseCoreGenericHandler(((Object)charSequence2).toString(), n);
        String string2 = y2.BaseCoreGenericHandler(sender, string);
        if (string2 == null) {
            return;
        }
        charSequence2 = string2;
        if (!sender.e() && plugin.AsyncBackgroundTask_22() == 0) {
            PlatformPlugin pluginWrapper = plugin;
            flag2 = false;
            PlatformPlugin pluginWrapper = pluginWrapper;
            if (!(!pluginWrapper.isEnabled() || pluginWrapper.AsyncBackgroundTask_21())) {
                plugin.c(() -> ChatFormatter.BaseCoreGenericHandler(sender, (String)charSequence2));
                return;
            }
        }
        sender.BaseCoreGenericHandler((String)charSequence2);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(ChatFormatter chatFormatter, CommandSenderWrapper sender, CharSequence charSequence, PlatformPlugin plugin, int n, Object targetObj) {
        if ((n & 4) != 0) {
            plugin = LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler();
        }
        chatFormatter.BaseCoreGenericHandler(sender, charSequence, plugin);
    }

    private static final void BaseCoreGenericHandler(CommandSenderWrapper sender, String string) {
        sender.BaseCoreGenericHandler(string);
    }

    public /* synthetic */ ChatFormatter(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{""};
    }

    static {
        ChatFormatter.BaseCoreGenericHandler();
    }
}

