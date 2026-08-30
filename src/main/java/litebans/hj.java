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
import litebans.mixin.AccessLoginData_1_21;
import litebans.n_0;
import litebans.p_0;
import litebans.x_0;
import net.fabricmc.fabric.api.networking.v1.LoginPacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.class_2535;
import net.minecraft.class_3248;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class hj
implements bk_0 {
    private final di_0 b;
    private final cr_0 c;
    private static /* synthetic */ String[] a;

    public hj(@NotNull di_0 di_02, @NotNull cr_0 cr_02) {
        this.b = di_02;
        this.c = cr_02;
    }

    public final di_0 a() {
        return this.b;
    }

    public final cr_0 b() {
        return this.c;
    }

    public hj d() {
        hj hj2;
        hj hj3 = hj2 = this;
        boolean bl = false;
        ServerLoginConnectionEvents.QUERY_START.register(hj3::a);
        return hj2;
    }

    public final void a(@NotNull class_3248 class_32482, @NotNull MinecraftServer minecraftServer, @NotNull LoginPacketSender loginPacketSender, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer) {
        n_0 n_02 = this.b.b(p_0.class);
        ew.b(n_02, a[0]);
        h8 h82 = (h8)((Object)n_02);
        if (!(class_32482 instanceof AccessLoginData_1_21)) {
            x_0.a();
            throw new as();
        }
        GameProfile gameProfile = ((AccessLoginData_1_21)class_32482).getProfile();
        class_2535 class_25352 = ((AccessLoginData_1_21)class_32482).getConnection();
        h82.a(class_32482, loginSynchronizer, new cp_0(gameProfile.getName(), gameProfile.getId().toString(), this.c.a(class_25352)), class_25352);
    }

    @Override
    public em_0 a() {
        return this.d();
    }

    private static final void c() {
        a = new String[]{hl.a("", -1727823450)};
    }

    static {
        hj.c();
    }
}

