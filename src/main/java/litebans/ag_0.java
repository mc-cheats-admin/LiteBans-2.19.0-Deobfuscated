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

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.aG
 */
public static class ag_0
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
        this.c = this.j ? ((class_2168)object).method_9214() : h[0];
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
        return string == null || string.equals(h[1]) ? (this.e = this.d().toString()) : string;
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
            throw new NullPointerException(h[2]);
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
            if (string.equals(h[3])) {
                string = h[4];
            }
            this.f.g().a(this.a(), string, byArray);
        }
    }

    private static final void b() {
        h = new String[]{hl.a("\u07f3\u07eb\u07c7\u07c6\u07db\u07c7\u07c4\u07cd\u07f5", -1635448920), hl.a("\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58d7\u58ca\u58ca\u58ca\u58ca\u58d7\u58ca\u58ca\u58ca\u58ca\u58d7\u58ca\u58ca\u58ca\u58ca\u58d7\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca\u58ca", 1306417402), hl.a("\ued99\ued8e\ued8a\ued98\ued84\ued85\uedcb\ued82\ued98\uedcb\ued86\ued8a\ued99\ued80\ued8e\ued8f\uedcb\ued85\ued84\ued85\uedc6\ued85\ued9e\ued87\ued87\uedcb\ued89\ued9e\ued9f\uedcb\ued82\ued98\uedcb\ued85\ued9e\ued87\ued87", 431287787), hl.a("\u0ed0\u0ee7\u0efc\u0ef5\u0ef7\u0ef7\u0ed1\u0efd\u0ee0\u0ef6", -1760620910), hl.a("\ufdfc\ufdeb\ufdf0\ufdf9\ufdfb\ufdfb\ufdfd\ufdf1\ufdec\ufdfa\ufda4\ufdf3\ufdff\ufdf7\ufdf0", 1217985950)};
    }

    static {
        ag_0.b();
    }
}

