package litebans;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketListener;
import com.comphenix.protocol.utility.MinecraftProtocolVersion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TemporaryplayerHandler {
    public static final void BaseCoreGenericHandler(@NotNull PluginModule module, @Nullable Object object) {
        if (object != null) {
            ProtocolLibrary.getProtocolManager().addPacketListener((PacketListener)object);
}

    public static final void LiteBansModule_31(@NotNull PluginModule module, @Nullable Object object) {
        if (object != null) {
            ProtocolLibrary.getProtocolManager().removePacketListener((PacketListener)object);
}

    public static final boolean LiteBansModule_31(@NotNull Player player) {
        return player.getClass().getSimpleName().length() > 8 && StringUtilities.LiteBansModule_31(player.getClass().getSimpleName(), "TemporaryPlayer", false, 2, null);
    }

    public static final boolean BaseCoreGenericHandler(@Nullable Player player) {
        return player == null || TemporaryplayerHandler.LiteBansModule_31(player);
    }

    public static final int c(@NotNull Player player) {
        int n = MinecraftProtocolVersion.getCurrentVersion();
        int n2 = ProtocolLibrary.getProtocolManager().getProtocolVersion(player);
        if (n2 <= 0) {
            return n;
        }
        return n2;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"TemporaryPlayer"};
}

