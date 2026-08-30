package litebans;

import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.function.Supplier;
import litebans.FabricPlugin;
import litebans.e2;
import litebans.er;
import litebans.g8;
import litebans.hl;
import litebans.jv_0;
import lombok.NonNull;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.class_2168;
import net.minecraft.class_3222;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ag_0
implements jv_0 {
    private final FabricPlugin f;
    private final WeakReference g;
    private final Supplier k;
    private final String c;
    private final boolean j;
    private UUID i = b;
    private String e = null;
    private String d;
    private static /* synthetic */ String[] h;

    public ag_0(FabricPlugin fabricPlugin, Object object, @Nullable Supplier supplier) {
        this.f = fabricPlugin;
        this.g = new WeakReference<Object>(object);
        this.k = supplier;
        this.j = object instanceof class_2168 && ((class_2168)object).method_43737();
        this.c = this.j ? ((class_2168)object).method_9214() : "[Console]";
    }

    public boolean equals(Object object) {
        return this == object || object instanceof ag_0 && ((ag_0)object).d().equals(this.d());
    }

    @Override
    public void c(@NotNull String string) {
        Object object = this.c();
        if (!(object instanceof class_2168) || string.isEmpty()) {
            return;
        }
        this.f.g().b(this.c(), string);
    }

    @Override
    public String g() {
        return this.i();
    }

    @Override
    public Object c() {
        Object t2 = this.g.get();
        if (this.k == null) {
            return t2;
        }
        return t2 != null ? t2 : this.k.get();
    }

    @Override
    public @Nullable String b() {
        String string = this.d;
        if (string == null) {
            Object object = this.c();
            this.d = string = this.f.g().a(object);
        }
        return string;
    }

    @Override
    public String i() {
        return this.c;
    }

    @Override
    public @Nullable String h() {
        return null;
    }

    @Override
    public @NonNull UUID d() {
        UUID uUID;
        Object object;
        UUID uUID2 = this.i;
        if (uUID2.equals(b) && this.j && (object = this.c()) != null && (uUID = this.a().method_5667()) != null) {
            this.i = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String a() {
        String string = this.e;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.e = this.d().toString()) : string;
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
        if (!this.f.d() || !this.j && object instanceof class_2168) {
            return ((class_2168)object).method_9259(3);
        }
        if (!(object instanceof class_2168) || !this.j()) {
            return false;
        }
        return (Boolean)Permissions.check((UUID)this.d(), (String)string).get();
    }

    @Override
    public boolean f() {
        return !this.j;
    }

    @Override
    public boolean j() {
        Object object;
        if (this.j && (object = this.c()) != null) {
            return !this.a().method_14239();
        }
        return this.c() != null;
    }

    private final class_3222 a() {
        return ((class_2168)this.c()).method_44023();
    }

    @Override
    public boolean e() {
        return this.j;
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
            if (this.f.u()) {
                this.f.g().a((Object)this.a(), string);
            } else {
                this.f.c(() -> this.d(string));
            }
        }
    }

    @Override
    public void b(String string) {
        Object object = this.c();
        this.f.g().c(object, string);
    }

    @Override
    public void a(String string) {
        g8 g82 = g8.c;
        if (this.f.g().b() >= 770) {
            g82 = g8.a;
        }
        this.b(e2.a(g82).a(er.a(string)));
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
            this.f.g().a(this.a(), string, byArray);
        }
    }

    private static final void b() {
        h = new String[]{"[Console]", "00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null", "BungeeCord", "bungeecord:main"};
    }

    static {
        ag_0.b();
    }
}

