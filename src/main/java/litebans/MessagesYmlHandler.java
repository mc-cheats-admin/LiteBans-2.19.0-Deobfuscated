package litebans;

import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MessagesYmlHandler {
    private final PlatformPlugin LiteBansModule_31;
    private final File e;
    private final ConfigService LiteBansModule_195;
    private Locale BaseCoreGenericHandler;
    private DatabaseService AsyncBackgroundTask_5;
        public MessagesYmlHandler(@NotNull PlatformPlugin plugin, @NotNull File file) {
        this.LiteBansModule_31 = plugin;
        this.e = file;
        this.LiteBansModule_195 = (ConfigService)this.LiteBansModule_31.BaseCoreGenericHandler(ConfigService.class);
        this.plugin = this.LiteBansModule_31();
    }

    public /* synthetic */ MessagesYmlHandler(PlatformPlugin plugin, File file, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            File file2 = plugin.getDataFolder();
            String string = "messages.yml";
            file = new File(file2, string);
        }
        this(plugin, file);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final File g() {
        return this.e;
    }

    public final ConfigService e() {
        return this.LiteBansModule_195;
    }

    public final Locale AsyncBackgroundTask_5() {
        return this.plugin;
    }

    public final void BaseCoreGenericHandler(@NotNull Locale locale) {
        this.plugin = locale;
    }

    public final DatabaseService c() {
        return this.AsyncBackgroundTask_5;
    }

    public final void BaseCoreGenericHandler(@Nullable DatabaseService gn_02) {
        this.AsyncBackgroundTask_5 = gn_02;
    }

    public final Locale LiteBansModule_31() {
        return Locale.getDefault(Locale.Category.FORMAT);
    }

    public final void BaseCoreGenericHandler(@NotNull Exception exception) {
        Logger logger = this.LiteBansModule_31.getLogger();
        String string = "messages";
        this.LiteBansModule_195.BaseCoreGenericHandler(string, exception);
        String string2 = "[!!] " + string + ".yml";
        if (this.e.exists()) {
            logger.severe(string2 + " may be invalid. Check with https://yaml-online-parser.appspot.com");
        } else {
            logger.severe(string2 + " could not be created InitializerHandler_3 " + this.LiteBansModule_31.getDataFolder().getAbsolutePath());
        }
        if (this.LiteBansModule_195.BaseCoreGenericHandler(1)) {
            this.LiteBansModule_195.BaseCoreGenericHandler(exception);
        }
    }

    private static final void LiteBansModule_195() {
        c = new String[]{"messages.yml", "messages.yml", "messages.yml", "locale", "system", "system", "Using configured locale (", "Supported locales: ", "Note: If the configured locale is unrecognized, the system default locale is ", "Using system locale (", "[!!] Could not save messages + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%AsyncBackgroundTask_5 %AsyncBackgroundTask_21", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%AsyncBackgroundTask_5 %AsyncBackgroundTask_21", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "messages", "[!!] ", ".yml", " may be invalid. Check with https://yaml-online-parser.appspot.com", " could not be created InitializerHandler_3 "};
    }

    static {
        MessagesYmlHandler.LiteBansModule_195();
    }
}
}
