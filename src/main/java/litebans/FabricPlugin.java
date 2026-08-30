package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import litebans.N;
import litebans.a6;
import litebans.a_0;
import litebans.b8;
import litebans.bd_0;
import litebans.bk_0;
import litebans.cr_0;
import litebans.cv_0;
import litebans.di_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.f_0;
import litebans.gk_0;
import litebans.gn_0;
import litebans.hb_0;
import litebans.hl;
import litebans.iy_0;
import litebans.j_0;
import litebans.jv_0;
import litebans.ln;
import litebans.n_0;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricPlugin
implements DedicatedServerModInitializer,
di_0 {
    private static final Logger g;
    private iy_0 f;
    private java.util.logging.Logger b;
    private ModContainer e;
    private b8 j;
    private final bd_0 d = new bd_0(this);
    private cr_0 h;
    private boolean c = false;
    private static /* synthetic */ String[] i;

    @Override
    public void m() {
        this.j.a();
    }

    @Override
    public gn_0 h() {
        return this.d.o;
    }

    @Override
    public n_0[] k() {
        return this.d.j();
    }

    @Override
    public void d() {
        this.d.i();
    }

    @Override
    public boolean a(n_0 n_02) {
        boolean bl = n_02.d();
        if (bl) {
            if (n_02 instanceof N) {
                this.a((j_0)n_02);
            }
            if (n_02 instanceof f_0) {
                this.a((a_0)n_02);
            }
        }
        return bl;
    }

    @Override
    public hb_0 f() {
        return this.d.k;
    }

    @Override
    public a_0 z() {
        return this.d.e;
    }

    @Override
    public void a(a_0 a_02) {
        this.d.e = a_02;
    }

    @Override
    public j_0 b() {
        return this.d.f;
    }

    @Override
    public jv_0 y() {
        return this.d.g;
    }

    @Override
    public n_0 a(Class clazz) {
        return this.d.b(clazz);
    }

    @Override
    public n_0 b(Class clazz) {
        return this.d.a(clazz);
    }

    @Override
    public n_0[] p() {
        return this.d.d;
    }

    @Override
    public String getName() {
        return this.f.d();
    }

    @Override
    public int a() {
        return this.d.l();
    }

    @Override
    public jv_0[] q() {
        return this.d.b();
    }

    @Override
    public Map w() {
        return this.d.b;
    }

    @Override
    public ThreadPoolExecutor x() {
        ThreadPoolExecutor threadPoolExecutor = this.d.h;
        if ((threadPoolExecutor == null || threadPoolExecutor.isShutdown()) && (this.d.j.get() || this.d.m.get())) {
            ThreadFactoryBuilder threadFactoryBuilder = this.d.d();
            return this.d.a(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.d.h();
    }

    @Override
    public final byte t() {
        return 3;
    }

    @Override
    public ec_0 i() {
        return new a6(this);
    }

    @Override
    public String e() {
        return this.f.b();
    }

    @Override
    public jv_0 v() {
        return this.h.a(this.h.f(), () -> this.h.f());
    }

    @Override
    public gn_0 o() {
        gn_0 gn_02;
        this.d.o = gn_02 = this.a(new File(this.getDataFolder(), "config.yml"));
        return gn_02;
    }

    @Override
    public File getDataFolder() {
        return FabricLoader.getInstance().getConfigDir().resolve(this.f.c()).toFile();
    }

    public int b() {
        return this.h.b();
    }

    @Override
    public java.util.logging.Logger getLogger() {
        return this.b;
    }

    @Override
    public void j() {
        this.j = new b8();
        this.d.k();
    }

    @Override
    public boolean s() {
        return this.d.n.get();
    }

    @Override
    public boolean isEnabled() {
        return this.d.j.get();
    }

    @Override
    public boolean n() {
        return this.d.p;
    }

    @Override
    public gn_0 a(File file) {
        return this.d.i.a(this, file);
    }

    public ScheduledExecutorService c() {
        return this.j.a(this.d);
    }

    @Override
    public boolean c() {
        return this.h.a();
    }

    @Override
    public boolean u() {
        return this.h.e();
    }

    @Override
    public boolean l() {
        return false;
    }

    public void onInitializeServer() {
        this.f = new iy_0(hb_0.a(iy_0.class));
        String string = this.f.c();
        this.b = new cv_0(LoggerFactory.getLogger((String)string), string);
        this.h = gk_0.b(this, ((ModContainer)FabricLoader.getInstance().getModContainer("fabric-api").get()).getMetadata().getVersion().getFriendlyString().split("\\+")[1]);
        ServerLifecycleEvents.SERVER_STARTING.register(this::a);
        ServerLifecycleEvents.SERVER_STOPPING.register(this::b);
        this.d.c();
    }

    private final void a(MinecraftServer minecraftServer) {
        this.h.a(minecraftServer);
        this.e = FabricLoader.getInstance().getModContainer(this.f.c()).orElse(null);
        try {
            Class.forName("me.lucko.fabric.api.permissions.v0.Permissions");
            this.c = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        this.j();
    }

    private final void b(MinecraftServer minecraftServer) {
        this.d();
    }

    @Override
    public void b(@Nullable em_0[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (em_0 em_02 : em_0Array) {
            if (!(em_02 instanceof bk_0)) continue;
            bk_0 bk_02 = (bk_0)em_02;
            bk_02.a();
        }
    }

    @Override
    public boolean a(String string, Supplier supplier) {
        return this.d.a(string, supplier);
    }

    @Override
    public void c(Runnable runnable) {
        this.h.a(runnable);
    }

    @Override
    public void b(Runnable runnable, long l3) {
        this.a(() -> this.c(runnable), l3);
    }

    @Override
    public void a(Runnable runnable) {
        this.x().execute(runnable);
    }

    @Override
    public void a(Runnable runnable, long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid delay " + l3);
        }
        try {
            this.c().schedule(runnable, l3 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.a(rejectedExecutionException);
        }
    }

    @Override
    public void b(Runnable runnable) {
        this.a(runnable);
    }

    @Override
    public void a(Runnable runnable, long l3, long l5) {
        this.b(() -> this.c(runnable), l3, l5);
    }

    @Override
    public void b(Runnable runnable, long l3, long l5) {
        try {
            this.c().scheduleAtFixedRate(runnable, l3 * 50L, l5 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.a(rejectedExecutionException);
        }
    }

    private final void a(Exception exception) {
        if (this.d.m.get()) {
            this.getLogger().warning("Startup was cancelled");
            return;
        }
        throw exception;
    }

    @Override
    public void a(String string) {
        gn_0.a(this.getDataFolder(), string, null, false);
    }

    @Override
    public void a(ln ln2) {
        this.d.i = ln2;
    }

    @Override
    public void a(j_0 j_02) {
        this.d.f = j_02;
    }

    @Override
    public void r() {
    }

    @Override
    public void a(@Nullable em_0[] em_0Array) {
    }

    @Override
    public jv_0 b(Object object) {
        return this.h.c(object);
    }

    @Override
    public jv_0 a(Object object) {
        return this.h.b(object);
    }

    public ModContainer h() {
        return this.e;
    }

    public bd_0 a() {
        return this.d;
    }

    public cr_0 g() {
        return this.h;
    }

    public boolean d() {
        return this.c;
    }

    static {
        FabricPlugin.e();
        g = LoggerFactory.getLogger(FabricPlugin.class);
    }

    private static final void e() {
        i = new String[]{"config.yml", "fabric-api", "\\+", "me.lucko.fabric.api.permissions.v0.Permissions", "Invalid delay ", "Startup was cancelled"};
    }
}

