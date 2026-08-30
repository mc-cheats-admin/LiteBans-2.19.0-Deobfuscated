package litebans;

import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.function.Supplier;
import lombok.NonNull;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.class_2168;
import net.minecraft.class_3222;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BungeecordHandler
implements CommandSenderWrapper {
    private final ConfigYmlHandler LiteBansModule_195;
    private final WeakReference g;
    private final Supplier Utf8Handler_2;
    private final String c;
    private final boolean GnuSparseMapHandler;
    private UUID i = LiteBansModule_31;
    private String e = null;
    private String AsyncBackgroundTask_5;
        public BungeecordHandler(ConfigYmlHandler fabricPlugin, Object targetObj, @Nullable Supplier supplier) {
        this.LiteBansModule_195 = fabricPlugin;
        this.g = new WeakReference<Object>(targetObj);
        this.Utf8Handler_2 = supplier;
        this.GnuSparseMapHandler = targetObj instanceof class_2168 && ((class_2168)targetObj).method_43737();
        this.c = this.GnuSparseMapHandler ? ((class_2168)targetObj).method_9214() : "[Console]";
    }

    public boolean equals(Object targetObj) {
        return this == targetObj || targetObj instanceof BungeecordHandler && ((BungeecordHandler)targetObj).AsyncBackgroundTask_5().equals(this.AsyncBackgroundTask_5());
    }

    @Override
    public void c(@NotNull String string) {
        Object targetObj = this.c();
        if (!(targetObj instanceof class_2168) || string.isEmpty()) {
            return;
        }
        this.LiteBansModule_195.g().LiteBansModule_31(this.c(), string);
    }

    @Override
    public String g() {
        return this.i();
    }

    @Override
    public Object c() {
        Object t2 = this.g.get();
        if (this.Utf8Handler_2 == null) {
            return t2;
        }
        return t2 != null ? t2 : this.Utf8Handler_2.get();
    }

    @Override
    public @Nullable String LiteBansModule_31() {
        String string = this.AsyncBackgroundTask_5;
        if (string == null) {
            Object targetObj = this.c();
            this.AsyncBackgroundTask_5 = string = this.LiteBansModule_195.g().BaseCoreGenericHandler(targetObj);
        }
        return string;
    }

    @Override
    public String i() {
        return this.c;
    }

    @Override
    public @Nullable String LiteBansModule_241() {
        return null;
    }

    @Override
    public @NonNull UUID AsyncBackgroundTask_5() {
        UUID uUID;
        UUID uUID2 = this.i;
        if (uUID2.equals(LiteBansModule_31) && this.GnuSparseMapHandler && (targetObj = this.c()) != null && (uUID = this.plugin().method_5667()) != null) {
            this.i = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String BaseCoreGenericHandler() {
        String string = this.e;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.e = this.AsyncBackgroundTask_5().toString()) : string;
    }

    @Override
    public boolean e(@Nullable String string) {
        if (string == null) {
            return true;
        }
        Object targetObj = this.c();
        if (targetObj == null) {
            return false;
        }
        if (!this.LiteBansModule_195.AsyncBackgroundTask_5() || !this.GnuSparseMapHandler && targetObj instanceof class_2168) {
            return ((class_2168)targetObj).method_9259(3);
        }
        if (!(targetObj instanceof class_2168) || !this.GnuSparseMapHandler()) {
            return false;
        }
        return (Boolean)Permissions.check((UUID)this.AsyncBackgroundTask_5(), (String)string).get();
    }

    @Override
    public boolean LiteBansModule_195() {
        return !this.GnuSparseMapHandler;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        if (this.GnuSparseMapHandler && (targetObj = this.c()) != null) {
            return !this.plugin().method_14239();
        }
        return this.c() != null;
    }

    private final class_3222 BaseCoreGenericHandler() {
        return ((class_2168)this.c()).method_44023();
    }

    @Override
    public boolean e() {
        return this.GnuSparseMapHandler;
    }

    @Override
    public void AsyncBackgroundTask_5(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException("reason is marked non-null but is null");
        }
        Object targetObj = this.c();
        if (targetObj == null) {
            return;
        }
        if (this.e()) {
            if (this.LiteBansModule_195.ServerSyncService()) {
                this.LiteBansModule_195.g().BaseCoreGenericHandler((Object)this.plugin(), string);
            } else {
                this.LiteBansModule_195.c(() -> this.AsyncBackgroundTask_5(string));
            }
        }
    }

    @Override
    public void LiteBansModule_31(String string) {
        Object targetObj = this.c();
        this.LiteBansModule_195.g().c(targetObj, string);
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        V116Handler g82 = V116Handler.c;
        if (this.LiteBansModule_195.g().LiteBansModule_31() >= 770) {
            g82 = V116Handler.BaseCoreGenericHandler;
        }
        this.LiteBansModule_31(LiteBansModule_148.BaseCoreGenericHandler(g82).BaseCoreGenericHandler(LiteBansModule_183.BaseCoreGenericHandler(string)));
    }

    @Override
    public void BaseCoreGenericHandler(String string, byte[] byArray) {
        Object targetObj = this.c();
        if (targetObj == null) {
            return;
        }
        if (this.e()) {
            if (string.equals("BungeeCord")) {
                string = "bungeecord:main";
            }
            this.LiteBansModule_195.g().BaseCoreGenericHandler(this.plugin(), string, byArray);
        }
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_241 = new String[]{"[Console]", "00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null", "BungeeCord", "bungeecord:main"};
    }

    static {
        BungeecordHandler.LiteBansModule_31();
    }
}

