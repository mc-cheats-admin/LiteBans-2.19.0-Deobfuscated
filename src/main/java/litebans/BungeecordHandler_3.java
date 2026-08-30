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
    public BungeecordHandler_3(ConfigYmlHandler fabricPlugin, Object targetObj, @Nullable Supplier supplier) {
        this.AsyncBackgroundTask_5 = fabricPlugin;
        this.e = new WeakReference<Object>(targetObj);
        this.c = supplier;
        boolean flag = this.Utf8Handler_2 = targetObj instanceof ServerPlayer || targetObj instanceof CommandSourceStack && targetObj.isPlayer();
        this.i = this.Utf8Handler_2 && targetObj instanceof ServerPlayer ? targetObj.getPlainTextName() : (targetObj instanceof CommandSourceStack ? targetObj.getTextName() : "?");
    }

    public boolean equals(Object targetObj) {
        return this == targetObj || targetObj instanceof BungeecordHandler_3 && targetObj.AsyncBackgroundTask_5().equals(this.AsyncBackgroundTask_5());
    }

    @Override
    public void c(@NotNull String string) {
        Object targetObj = this.c();
        if (!(targetObj instanceof CommandSourceStack) || string.isEmpty()) {
            return;
        }
        this.AsyncBackgroundTask_5.g().LiteBansModule_31(targetObj, string);
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
            Object targetObj = this.c();
            this.LiteBansModule_194 = string = this.AsyncBackgroundTask_5.g().BaseCoreGenericHandler(targetObj);
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
        UUID uUID2 = this.GnuSparseMapHandler;
        if (uUID2.equals(LiteBansModule_31) && this.Utf8Handler_2 && (targetObj = this.c()) != null && (uUID = this.LiteBansModule_31().getUUID()) != null) {
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
        Object targetObj = this.c();
        if (targetObj == null) {
            return false;
        }
        if (!this.AsyncBackgroundTask_5.AsyncBackgroundTask_5() || !this.Utf8Handler_2 && targetObj instanceof CommandSourceStack) {
            return this.AsyncBackgroundTask_5.g().AsyncBackgroundTask_5(targetObj, string);
        }
        if (!(targetObj instanceof CommandSourceStack) || !this.GnuSparseMapHandler()) {
            return false;
        }
        return (Boolean)Permissions.check(this.AsyncBackgroundTask_5(), (String)string).get();
    }

    @Override
    public boolean LiteBansModule_194() {
        return !this.Utf8Handler_2;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        Object targetObj = this.c();
        if (this.Utf8Handler_2 && targetObj != null) {
            return !this.LiteBansModule_31().hasDisconnected();
        }
        return targetObj != null;
    }

    private final ServerPlayer LiteBansModule_31() {
        CommandSourceStack commandSourceStack = this.c();
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
        Object targetObj = this.c();
        if (targetObj == null) {
            return;
        }
        if (this.e()) {
            if (this.AsyncBackgroundTask_5.ServerSyncService()) {
                this.AsyncBackgroundTask_5.g().BaseCoreGenericHandler(this.LiteBansModule_31(), string);
            } else {
                this.AsyncBackgroundTask_5.c(() -> this.AsyncBackgroundTask_5(string));
}

    @Override
    public void LiteBansModule_31(String string) {
        Object targetObj = this.c();
        this.AsyncBackgroundTask_5.g().c(targetObj, string);
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        if (!this.Utf8Handler_2) {
            Object targetObj = this.c();
            if (targetObj != null) {
                targetObj.sendSystemMessage(this.AsyncBackgroundTask_5.g().AsyncBackgroundTask_5().BaseCoreGenericHandler(BlackHandler.BaseCoreGenericHandler(string)));
} else {
            V116Handler g82 = V116Handler.c;
            if (this.AsyncBackgroundTask_5.g().LiteBansModule_31() >= 770) {
                g82 = V116Handler.BaseCoreGenericHandler;
            }
            this.LiteBansModule_31(LiteBansModule_147.BaseCoreGenericHandler(g82).BaseCoreGenericHandler(LiteBansModule_182.BaseCoreGenericHandler(string)));
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
            this.AsyncBackgroundTask_5.g().BaseCoreGenericHandler(this.LiteBansModule_31(), string, byArray);
}

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"?", "00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null", "BungeeCord", "bungeecord:main"};
}

