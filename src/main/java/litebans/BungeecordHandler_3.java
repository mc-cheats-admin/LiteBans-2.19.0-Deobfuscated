package litebans;

import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.function.Supplier;
import lombok.NonNull;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BungeecordHandler_3
implements CommandSenderWrapper {
    private final ConfigYmlHandler AsyncBackgroundTask_5;
    private final WeakReference e;
    private final Supplier c;
    private final String i;
    private final boolean Utf8Handler_2;
    private UUID GnuSparseMapHandler = LiteBansModule_31;
    private String LiteBansModule_240 = null;
    private String LiteBansModule_194;
    public BungeecordHandler_3(ConfigYmlHandler fabricPlugin, Object object, @Nullable Supplier supplier) {
        this.AsyncBackgroundTask_5 = fabricPlugin;
        this.e = new WeakReference<Object>(object);
        this.c = supplier;
        boolean flag = this.Utf8Handler_2 = object instanceof ServerPlayer || object instanceof CommandSourceStack && ((CommandSourceStack)object).isPlayer();
        this.i = this.Utf8Handler_2 && object instanceof ServerPlayer ? ((ServerPlayer)object).getPlainTextName() : (object instanceof CommandSourceStack ? ((CommandSourceStack)object).getTextName() : "?");
    }

    public boolean equals(Object object) {
        return this == object || object instanceof BungeecordHandler_3 && ((BungeecordHandler_3)object).AsyncBackgroundTask_5().equals(this.AsyncBackgroundTask_5());
    }

    @Override
    public void c(@NotNull String string) {
        Object object = this.c();
        if (!(object instanceof CommandSourceStack) || string.isEmpty()) {
            return;
        }
        this.AsyncBackgroundTask_5.g().LiteBansModule_31(object, string);
    }

    @Override
    public String g() {
        return this.i();
    }

    @Override
    public Object c() {
        Object t2 = this.e.get();
        if (this.c == null) {
            return t2;
        }
        return t2 != null ? t2 : this.c.get();
    }

    @Override
    public @Nullable String LiteBansModule_31() {
        String string = this.LiteBansModule_194;
        if (string == null) {
            Object object = this.c();
            this.LiteBansModule_194 = string = this.AsyncBackgroundTask_5.g().BaseCoreGenericHandler(object);
        }
        return string;
    }

    @Override
    public String i() {
        return this.i;
    }

    @Override
    public @Nullable String LiteBansModule_240() {
        return null;
    }

    @Override
    public @NonNull UUID AsyncBackgroundTask_5() {
        UUID uUID;
        Object object;
        UUID uUID2 = this.GnuSparseMapHandler;
        if (uUID2.equals(LiteBansModule_31) && this.Utf8Handler_2 && (object = this.c()) != null && (uUID = this.LiteBansModule_31().getUUID()) != null) {
            this.GnuSparseMapHandler = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String BaseCoreGenericHandler() {
        String string = this.LiteBansModule_240;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.LiteBansModule_240 = this.AsyncBackgroundTask_5().toString()) : string;
    }

    @Override
    public boolean e(@Nullable String string) {
        if (string == null) {
            return true;
        }
        Object object = this.c();
        if (object == null) {
            return false;
        }
        if (!this.AsyncBackgroundTask_5.AsyncBackgroundTask_5() || !this.Utf8Handler_2 && object instanceof CommandSourceStack) {
            return this.AsyncBackgroundTask_5.g().AsyncBackgroundTask_5(object, string);
        }
        if (!(object instanceof CommandSourceStack) || !this.GnuSparseMapHandler()) {
            return false;
        }
        return (Boolean)Permissions.check((UUID)this.AsyncBackgroundTask_5(), (String)string).get();
    }

    @Override
    public boolean LiteBansModule_194() {
        return !this.Utf8Handler_2;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        Object object = this.c();
        if (this.Utf8Handler_2 && object != null) {
            return !this.LiteBansModule_31().hasDisconnected();
        }
        return object != null;
    }

    private final ServerPlayer LiteBansModule_31() {
        CommandSourceStack commandSourceStack = (CommandSourceStack)this.c();
        if (commandSourceStack == null) {
            return null;
        }
        return commandSourceStack.getPlayer();
    }

    @Override
    public boolean e() {
        return this.Utf8Handler_2;
    }

    @Override
    public void AsyncBackgroundTask_5(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException("reason is marked non-null but is null");
        }
        Object object = this.c();
        if (object == null) {
            return;
        }
        if (this.e()) {
            if (this.AsyncBackgroundTask_5.ServerSyncService()) {
                this.AsyncBackgroundTask_5.g().BaseCoreGenericHandler((Object)this.LiteBansModule_31(), string);
            } else {
                this.AsyncBackgroundTask_5.c(() -> this.AsyncBackgroundTask_5(string));
}

    @Override
    public void LiteBansModule_31(String string) {
        Object object = this.c();
        this.AsyncBackgroundTask_5.g().c(object, string);
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        if (!this.Utf8Handler_2) {
            Object object = this.c();
            if (object != null) {
                ((CommandSourceStack)object).sendSystemMessage((Component)this.AsyncBackgroundTask_5.g().AsyncBackgroundTask_5().BaseCoreGenericHandler(BlackHandler.BaseCoreGenericHandler((CharSequence)string)));
} else {
            V116Handler g82 = V116Handler.c;
            if (this.AsyncBackgroundTask_5.g().LiteBansModule_31() >= 770) {
                g82 = V116Handler.BaseCoreGenericHandler;
            }
            this.LiteBansModule_31(LiteBansModule_147.BaseCoreGenericHandler(g82).BaseCoreGenericHandler(LiteBansModule_182.BaseCoreGenericHandler(string)));
}

    @Override
    public void BaseCoreGenericHandler(String string, byte[] byArray) {
        Object object = this.c();
        if (object == null) {
            return;
        }
        if (this.e()) {
            if (string.equals("BungeeCord")) {
                string = "bungeecord:main";
            }
            this.AsyncBackgroundTask_5.g().BaseCoreGenericHandler(this.LiteBansModule_31(), string, byArray);
}

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"?", "00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null", "BungeeCord", "bungeecord:main"};
}

