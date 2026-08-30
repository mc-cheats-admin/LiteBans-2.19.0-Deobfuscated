package litebans;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketListener;
import com.comphenix.protocol.utility.MinecraftProtocolVersion;
import litebans.bz;
import litebans.hl;
import litebans.n_0;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.aL
 */
public static final class al_0 {
    private static /* synthetic */ String[] a;

    public static final void a(@NotNull n_0 n_02, @Nullable Object object) {
        if (object != null) {
            ProtocolLibrary.getProtocolManager().addPacketListener((PacketListener)object);
        }
    }

    public static final void b(@NotNull n_0 n_02, @Nullable Object object) {
        if (object != null) {
            ProtocolLibrary.getProtocolManager().removePacketListener((PacketListener)object);
        }
    }

    public static final boolean b(@NotNull Player player) {
        return player.getClass().getSimpleName().length() > 8 && bz.b(player.getClass().getSimpleName(), a[0], false, 2, null);
    }

    public static final boolean a(@Nullable Player player) {
        return player == null || al_0.b(player);
    }

    public static final int c(@NotNull Player player) {
        int n = MinecraftProtocolVersion.getCurrentVersion();
        int n2 = ProtocolLibrary.getProtocolManager().getProtocolVersion(player);
        if (n2 <= 0) {
            return n;
        }
        return n2;
    }

    private static final void a() {
        a = new String[]{hl.a("\u70ba\u708b\u7083\u709e\u7081\u709c\u708f\u709c\u7097\u70be\u7082\u708f\u7097\u708b\u709c", 1384149230)};
    }

    static {
        al_0.a();
    }
}

