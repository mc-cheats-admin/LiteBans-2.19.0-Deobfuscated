package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.utility.MinecraftVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_134
extends PacketAdapter {
    public static final LiteBansModule_370 LiteBansModule_31;
    private final PlatformPlugin i;
    private final PunishmentTableService LiteBansModule_194;
    private final BroadcastService BaseCoreGenericHandler;
    private final ConfigService g;
    private final DatabaseMonitorService AsyncBackgroundTask_5;
    private static final LiteBansModule_161 c;
    private static final LiteBansModule_161 e;
    public LiteBansModule_134(@NotNull PlatformPlugin plugin) {
        PacketType[] packetTypeArray;
        LiteBansModule_158 ec_02 = plugin.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        LiteBansModule_370 kc2 = LiteBansModule_31;
        Object[] objectArray = new Object[]{LiteBansModule_370.LiteBansModule_31(LiteBansModule_31), LiteBansModule_370.BaseCoreGenericHandler(LiteBansModule_31)};
        Plugin plugin = BungeecordHandler_2.BaseCoreGenericHandler((BungeecordHandler_2)ec_02, null, 1, null);
        LiteBansModule_134 ds2 = this;
        Object targetObj = objectArray;
        Object[] objectArray2 = targetObj;
        Collection collection = new ArrayList();
        Object[] objectArray3 = objectArray2;
        int n = objectArray3.length;
        for (int i = 0; i < n; ++i) {
            PacketType packetType;
            Object resultObj = contextObj = objectArray3[i];
            Object helperObj = resultObj;
            if ((helperObj instanceof PacketType ? (PacketType)helperObj : null) == null) continue;
            packetType = packetType;
            collection.add(packetType);
        }
        targetObj = (List)collection;
        flag2 = false;
        objectArray2 = targetObj;
        PacketType[] packetTypeArray2 = packetTypeArray = objectArray2.toArray(new PacketType[0]);
        super(PacketAdapter.params((Plugin)plugin, (PacketType[])Arrays.copyOf(packetTypeArray2, packetTypeArray2.length)).optionAsync());
        this.i = plugin;
        this.LiteBansModule_194 = this.i.BaseCoreGenericHandler(PunishmentTableService.class);
        this.plugin = this.i.BaseCoreGenericHandler(BroadcastService.class);
        this.g = this.i.BaseCoreGenericHandler(ConfigService.class);
        this.AsyncBackgroundTask_5 = this.i.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public void onPacketReceiving(@NotNull PacketEvent packetEvent) {
        PacketType packetType = packetEvent.getPacketType();
        if (packetEvent.isCancelled() || TemporaryplayerHandler.BaseCoreGenericHandler(packetEvent.getPlayer()) || TemporaryplayerHandler.c(packetEvent.getPlayer()) >= 759 && !ObjectUtilities.BaseCoreGenericHandler(packetType, LiteBansModule_370.BaseCoreGenericHandler(LiteBansModule_31))) {
            return;
        }
        String string = (ObjectUtilities.BaseCoreGenericHandler(packetType, LiteBansModule_370.BaseCoreGenericHandler(LiteBansModule_31)) ? "/" : "") + this.plugin(packetEvent);
        boolean flag = LiteBansModule_370.BaseCoreGenericHandler(LiteBansModule_31) != null && !ObjectUtilities.BaseCoreGenericHandler(packetType, LiteBansModule_370.BaseCoreGenericHandler(LiteBansModule_31));
        this.LiteBansModule_194.BaseCoreGenericHandler().BaseCoreGenericHandler(packetEvent, string, this.i.BaseCoreGenericHandler(packetEvent.getPlayer()), flag);
    }

    public final String BaseCoreGenericHandler(@NotNull PacketEvent packetEvent) {
        String string = (String)packetEvent.getPacket().getStrings().readSafely(0);
        if (string == null) {
            string = "";
        }
        return string;
    }

    private static final PacketType BaseCoreGenericHandler() {
        PacketType packetType;
        try {
            packetType = PacketType.Play.Client.CHAT;
        }
        catch (Throwable throwable) {
            packetType = null;
        }
        return packetType;
    }

    private static final PacketType c() {
        PacketType packetType;
        try {
            packetType = MinecraftVersion.WILD_UPDATE.atOrAbove() ? PacketType.Play.Client.CHAT_COMMAND : null;
        }
        catch (Throwable throwable) {
            packetType = null;
        }
        return packetType;
    }

    public static final /* synthetic */ LiteBansModule_161 e() {
        return c;
    }

    public static final /* synthetic */ LiteBansModule_161 LiteBansModule_31() {
        return e;
    }

    static {
        LiteBansModule_134.AsyncBackgroundTask_5();
        LiteBansModule_31 = new LiteBansModule_370(null);
        c = ProxyConnection.BaseCoreGenericHandler(LiteBansModule_134::BaseCoreGenericHandler);
        e = ProxyConnection.BaseCoreGenericHandler(LiteBansModule_134::c);
}

