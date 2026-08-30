package litebans;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import litebans.FabricPlugin;
import litebans.ai_0;
import litebans.cp_0;
import litebans.cr_0;
import litebans.di_0;
import litebans.eg_0;
import litebans.ew;
import litebans.g8;
import litebans.gG;
import litebans.h8;
import litebans.hb_0;
import litebans.hl;
import litebans.k5;
import litebans.ld;
import litebans.lr_0;
import litebans.o;
import litebans.p_0;
import litebans.q_0;
import litebans.w;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.server.network.ServerLoginPacketListenerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ai_0(a=3)
public final class s_0
extends p_0
implements h8 {
    private static /* synthetic */ String[] b;

    public s_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        this.a.r();
    }

    @Override
    public boolean d() {
        return this.a.t() == 3 && !hb_0.a("net.minecraft.class_3248");
    }

    @Override
    public void e() {
    }

    @Override
    public void a() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.a();
        s_0 s_02 = this;
        boolean bl = false;
        di_0 di_02 = s_02.a;
        ew.b(di_02, "");
        cr_0 cr_02 = ((FabricPlugin)di_02).g();
        di_0 di_03 = s_02.a;
        ew.a(cr_02);
        new ld(di_03, cr_02).c();
        if (q_02.f().p()) {
            new k5(this.a).b();
        }
    }

    public final void b(@NotNull ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @NotNull cp_0 cp_02, @NotNull Connection connection) {
        o o2 = (o)this.a.a(o.class);
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        w w2 = (w)this.a.a(w.class);
        di_0 di_02 = this.a;
        ew.b(di_02, "");
        FabricPlugin fabricPlugin = (FabricPlugin)di_02;
        lr_0 lr_02 = new lr_0(cp_02, serverLoginPacketListenerImpl, null, 4, null);
        loginSynchronizer.waitFor((Future)CompletableFuture.runAsync(() -> s_0.a(q_02, o2, lr_02, fabricPlugin, serverLoginPacketListenerImpl, cp_02, w2)));
    }

    public void a(@Nullable ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, @Nullable ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @Nullable cp_0 cp_02, @Nullable Connection connection) {
        ServerLoginPacketListenerImpl serverLoginPacketListenerImpl2 = serverLoginPacketListenerImpl;
        ew.a(serverLoginPacketListenerImpl2);
        ServerLoginNetworking.LoginSynchronizer loginSynchronizer2 = loginSynchronizer;
        ew.a(loginSynchronizer2);
        cp_0 cp_03 = cp_02;
        ew.a(cp_03);
        Connection connection2 = connection;
        ew.a(connection2);
        this.b(serverLoginPacketListenerImpl2, loginSynchronizer2, cp_03, connection2);
    }

    private static final void a(q_0 q_02, o o2, lr_0 lr_02, FabricPlugin fabricPlugin, ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, cp_0 cp_02, w w2) {
        Object object = q_02;
        boolean bl = false;
        if (object.g()) {
            q_0 q_03 = object;
            boolean bl2 = false;
            q_03.a((Object)("Login " + cp_02));
        }
        o2.c().b(lr_02);
        object = null;
        object = g8.a;
        if (fabricPlugin.b() < 770) {
            object = g8.c;
        }
        if (lr_02.c() != null) {
            Object object2 = fabricPlugin.g().d().b(eg_0.a(lr_02.c(), (g8)((Object)object)));
            ew.b(object2, "");
            Component component = (Component)object2;
            serverLoginPacketListenerImpl.disconnect(component);
        } else {
            gG gG2;
            gG gG3 = o2.e();
            if (gG3 == null) {
                return;
            }
            gG gG4 = gG2 = gG3;
            boolean bl3 = false;
            if (gG4.c() != null && fabricPlugin.d() && !((Boolean)Permissions.check((UUID)UUID.fromString(cp_02.g()), (String)"litebans.lockdown.bypass").get()).booleanValue()) {
                String string = gG2.a(w2.u(), false);
                Object object3 = fabricPlugin.g().d().b(eg_0.a(string, (g8)((Object)object)));
                ew.b(object3, "");
                Component component = (Component)object3;
                serverLoginPacketListenerImpl.disconnect(component);
            }
        }
    }

    @Override
    public void a(Object object, Object object2, Object object3, Object object4) {
        this.a((ServerLoginPacketListenerImpl)object, (ServerLoginNetworking.LoginSynchronizer)object2, (cp_0)object3, (Connection)object4);
    }

    private static final void d() {
        b = new String[]{"net.minecraft.class_3248", "", "", "", "Login ", "", "litebans.lockdown.bypass", ""};
    }

    static {
        s_0.d();
    }
}

