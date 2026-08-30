package litebans;

import com.mojang.authlib.GameProfile;
import litebans.as;
import litebans.bk_0;
import litebans.cp_0;
import litebans.cr_0;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.h8;
import litebans.hl;
import litebans.mixin.AccessLoginData_26_;
import litebans.n_0;
import litebans.p_0;
import litebans.x_0;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.network.Connection;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerLoginPacketListenerImpl;
import org.jetbrains.annotations.NotNull;

public final class ld
implements bk_0 {
    private final di_0 c;
    private final cr_0 a;
    private static /* synthetic */ String[] b;

    public ld(@NotNull di_0 di_02, @NotNull cr_0 cr_02) {
        this.c = di_02;
        this.a = cr_02;
    }

    public final di_0 d() {
        return this.c;
    }

    public final cr_0 b() {
        return this.a;
    }

    public ld c() {
        ld ld2;
        ld ld3 = ld2 = this;
        boolean bl = false;
        ServerLoginConnectionEvents.QUERY_START.register(ld3::a);
        return ld2;
    }

    public final void a(@NotNull ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, @NotNull MinecraftServer minecraftServer, @NotNull PacketSender packetSender, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer) {
        n_0 n_02 = this.c.b(p_0.class);
        ew.b(n_02, "");
        h8 h82 = (h8)((Object)n_02);
        if (!(serverLoginPacketListenerImpl instanceof AccessLoginData_26_)) {
            x_0.a();
            throw new as();
        }
        GameProfile gameProfile = ((AccessLoginData_26_)serverLoginPacketListenerImpl).getProfile();
        Connection connection = ((AccessLoginData_26_)serverLoginPacketListenerImpl).getConnection();
        h82.a(serverLoginPacketListenerImpl, loginSynchronizer, new cp_0(gameProfile.name(), gameProfile.id().toString(), this.a.a(connection)), connection);
    }

    @Override
    public em_0 a() {
        return this.c();
    }

    private static final void a() {
        b = new String[]{""};
    }

    static {
        ld.a();
    }
}

