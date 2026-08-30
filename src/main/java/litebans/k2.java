package litebans;

import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;
import litebans.aJ;
import litebans.di_0;
import litebans.gn_0;
import litebans.hl;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class k2 {
    private final di_0 b;
    private final File e;
    private final q_0 f;
    private Locale a;
    private gn_0 d;
    private static /* synthetic */ String[] c;

    public k2(@NotNull di_0 di_02, @NotNull File file) {
        this.b = di_02;
        this.e = file;
        this.f = (q_0)this.b.a(q_0.class);
        this.a = this.b();
    }

    public /* synthetic */ k2(di_0 di_02, File file, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            File file2 = di_02.getDataFolder();
            String string = "messages.yml";
            boolean bl = false;
            file = new File(file2, string);
        }
        this(di_02, file);
    }

    public final di_0 a() {
        return this.b;
    }

    public final File g() {
        return this.e;
    }

    public final q_0 e() {
        return this.f;
    }

    public final Locale d() {
        return this.a;
    }

    public final void a(@NotNull Locale locale) {
        this.a = locale;
    }

    public final gn_0 c() {
        return this.d;
    }

    public final void a(@Nullable gn_0 gn_02) {
        this.d = gn_02;
    }

    public final Locale b() {
        return Locale.getDefault(Locale.Category.FORMAT);
    }

    public final void a(@NotNull Exception exception) {
        Logger logger = this.b.getLogger();
        boolean bl = false;
        String string = "messages";
        this.f.a(string, exception);
        String string2 = "[!!] " + string + ".yml";
        if (this.e.exists()) {
            logger.severe(string2 + " may be invalid. Check with https://yaml-online-parser.appspot.com");
        } else {
            logger.severe(string2 + " could not be created in " + this.b.getDataFolder().getAbsolutePath());
        }
        if (this.f.a(1)) {
            this.f.a(exception);
        }
    }

    private static final void f() {
        c = new String[]{"messages.yml", "messages.yml", "messages.yml", "locale", "system", "system", "Using configured locale (", "Supported locales: ", "Note: If the configured locale is unrecognized, the system default locale is ", "Using system locale (", "[!!] Could not save messages + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%d %s", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%d %s", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "messages", "[!!] ", ".yml", " may be invalid. Check with https://yaml-online-parser.appspot.com", " could not be created in "};
    }

    static {
        k2.f();
    }
}

