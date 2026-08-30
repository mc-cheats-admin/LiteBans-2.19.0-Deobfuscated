package litebans;

import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.function.Supplier;
import litebans.FabricPlugin;
import litebans.e2;
import litebans.er;
import litebans.g8;
import litebans.hd_0;
import litebans.hl;
import litebans.jv_0;
import lombok.NonNull;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class jh_0
implements jv_0 {
    private final FabricPlugin d;
    private final WeakReference e;
    private final Supplier c;
    private final String i;
    private final boolean k;
    private UUID j = b;
    private String h = null;
    private String f;
    private static /* synthetic */ String[] g;

    public jh_0(FabricPlugin fabricPlugin, Object object, @Nullable Supplier supplier) {
        this.d = fabricPlugin;
        this.e = new WeakReference<Object>(object);
        this.c = supplier;
        boolean bl = this.k = object instanceof ServerPlayer || object instanceof CommandSourceStack && ((CommandSourceStack)object).isPlayer();
        this.i = this.k && object instanceof ServerPlayer ? ((ServerPlayer)object).getPlainTextName() : (object instanceof CommandSourceStack ? ((CommandSourceStack)object).getTextName() : "?");
    }

    public boolean equals(Object object) {
        return this == object || object instanceof jh_0 && ((jh_0)object).d().equals(this.d());
    }

    @Override
    public void c(@NotNull String string) {
        Object object = this.c();
        if (!(object instanceof CommandSourceStack) || string.isEmpty()) {
            return;
        }
        this.d.g().b(object, string);
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
    public @Nullable String b() {
        String string = this.f;
        if (string == null) {
            Object object = this.c();
            this.f = string = this.d.g().a(object);
        }
        return string;
    }

    @Override
    public String i() {
        return this.i;
    }

    @Override
    public @Nullable String h() {
        return null;
    }

    @Override
    public @NonNull UUID d() {
        UUID uUID;
        Object object;
        UUID uUID2 = this.j;
        if (uUID2.equals(b) && this.k && (object = this.c()) != null && (uUID = this.b().getUUID()) != null) {
            this.j = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String a() {
        String string = this.h;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.h = this.d().toString()) : string;
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
        if (!this.d.d() || !this.k && object instanceof CommandSourceStack) {
            return this.d.g().d(object, string);
        }
        if (!(object instanceof CommandSourceStack) || !this.j()) {
            return false;
        }
        return (Boolean)Permissions.check((UUID)this.d(), (String)string).get();
    }

    @Override
    public boolean f() {
        return !this.k;
    }

    @Override
    public boolean j() {
        Object object = this.c();
        if (this.k && object != null) {
            return !this.b().hasDisconnected();
        }
        return object != null;
    }

    private final ServerPlayer b() {
        CommandSourceStack commandSourceStack = (CommandSourceStack)this.c();
        if (commandSourceStack == null) {
            return null;
        }
        return commandSourceStack.getPlayer();
    }

    @Override
    public boolean e() {
        return this.k;
    }

    @Override
    public void d(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException("reason is marked non-null but is null");
        }
        Object object = this.c();
        if (object == null) {
            return;
        }
        if (this.e()) {
            if (this.d.u()) {
                this.d.g().a((Object)this.b(), string);
            } else {
                this.d.c(() -> this.d(string));
            }
        }
    }

    @Override
    public void b(String string) {
        Object object = this.c();
        this.d.g().c(object, string);
    }

    @Override
    public void a(String string) {
        if (!this.k) {
            Object object = this.c();
            if (object != null) {
                ((CommandSourceStack)object).sendSystemMessage((Component)this.d.g().d().a(hd_0.a((CharSequence)string)));
            }
        } else {
            g8 g82 = g8.c;
            if (this.d.g().b() >= 770) {
                g82 = g8.a;
            }
            this.b(e2.a(g82).a(er.a(string)));
        }
    }

    @Override
    public void a(String string, byte[] byArray) {
        Object object = this.c();
        if (object == null) {
            return;
        }
        if (this.e()) {
            if (string.equals("BungeeCord")) {
                string = "bungeecord:main";
            }
            this.d.g().a(this.b(), string, byArray);
        }
    }

    private static final void a() {
        g = new String[]{"?", "00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null", "BungeeCord", "bungeecord:main"};
    }

    static {
        jh_0.a();
    }
}

