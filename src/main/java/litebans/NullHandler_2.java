package litebans;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.ServerConnectRequest;
import net.md_5.bungee.api.SkinConfiguration;
import net.md_5.bungee.api.Title;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.score.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=1)
public final class NullHandler_2
implements ProxiedPlayer {
    private final PlatformPlugin c;
    private final PendingConnection LiteBansModule_31;
        public NullHandler_2(@NotNull PlatformPlugin plugin, @Nullable PendingConnection pendingConnection) {
        this.c = plugin;
        this.LiteBansModule_31 = pendingConnection;
    }

    public final Void LiteBansModule_31() {
        throw new UnsupportedOperationException();
    }

    public void connect(@Nullable ServerConnectRequest serverConnectRequest) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void connect(@Nullable ServerInfo serverInfo, @Nullable ServerConnectEvent.Reason reason) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void connect(@Nullable ServerInfo serverInfo, @Nullable Callback callback, @Nullable ServerConnectEvent.Reason reason) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public SkinConfiguration getSkinParts() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public boolean hasChatColors() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public byte getViewDistance() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public ProxiedPlayer.MainHand getMainHand() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public ProxiedPlayer.ChatMode getChatMode() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public Scoreboard getScoreboard() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void addGroups(@NotNull String[] args) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void chat(@NotNull String string) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void connect(@NotNull ServerInfo serverInfo) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void connect(@NotNull ServerInfo serverInfo, @NotNull Callback callback) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void disconnect(@NotNull String string) {
        block0: {
            PendingConnection pendingConnection = this.LiteBansModule_31;
            if (pendingConnection == null) break block0;
            pendingConnection.disconnect(string);
        }
    }

    public void disconnect(@NotNull BaseComponent[] baseComponentArray) {
        block0: {
            PendingConnection pendingConnection = this.LiteBansModule_31;
            if (pendingConnection == null) break block0;
            pendingConnection.disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
        }
    }

    public void disconnect(@NotNull BaseComponent baseComponent) {
        block0: {
            PendingConnection pendingConnection = this.LiteBansModule_31;
            if (pendingConnection == null) break block0;
            pendingConnection.disconnect(baseComponent);
        }
    }

    public InetSocketAddress getAddress() {
        PendingConnection pendingConnection = this.LiteBansModule_31;
        return pendingConnection != null ? pendingConnection.getAddress() : null;
    }

    public String getDisplayName() {
        return this.getName();
    }

    public void setDisplayName(@NotNull String string) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public Collection getGroups() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public Locale getLocale() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public Map getModList() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public String getName() {
        Object targetObj = this.LiteBansModule_31;
        if (targetObj == null || (targetObj = targetObj.getName()) == null) {
            targetObj = "null";
        }
        return targetObj;
    }

    public PendingConnection getPendingConnection() {
        PendingConnection pendingConnection = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(pendingConnection);
        return pendingConnection;
    }

    public Collection getPermissions() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public int getPing() {
        return 0;
    }

    public ServerInfo getReconnectServer() {
        LiteBansModule_159 ec_02 = this.c.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        GetcancelreasoncomponentsHandler k12 = (GetcancelreasoncomponentsHandler)ec_02;
        PendingConnection pendingConnection = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(pendingConnection);
        return k12.LiteBansModule_31(pendingConnection);
    }

    public void setReconnectServer(@NotNull ServerInfo serverInfo) {
    }

    public Server getServer() {
        return null;
    }

    public String getUUID() {
        return this.getUniqueId().toString();
    }

    public UUID getUniqueId() {
        Object targetObj = this.LiteBansModule_31;
        if (targetObj == null || (targetObj = targetObj.getUniqueId()) == null) {
            targetObj = new UUID(0L, 0L);
        }
        return targetObj;
    }

    public boolean hasPermission(@NotNull String string) {
        return false;
    }

    public boolean isConnected() {
        return false;
    }

    public boolean isForgeUser() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void removeGroups(@NotNull String[] args) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void resetTabHeader() {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public SocketAddress getSocketAddress() {
        PendingConnection pendingConnection = this.LiteBansModule_31;
        return pendingConnection != null ? pendingConnection.getSocketAddress() : null;
    }

    public void sendData(@NotNull String string, @NotNull byte[] byArray) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@NotNull String string) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@NotNull BaseComponent[] baseComponentArray) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@NotNull BaseComponent baseComponent) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@NotNull ChatMessageType chatMessageType, @NotNull BaseComponent[] baseComponentArray) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@NotNull ChatMessageType chatMessageType, @NotNull BaseComponent baseComponent) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@Nullable UUID uUID, @NotNull BaseComponent[] baseComponentArray) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessage(@Nullable UUID uUID, @Nullable BaseComponent baseComponent) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendMessages(@NotNull String[] args) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void sendTitle(@NotNull Title title) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void setPermission(@NotNull String string, boolean flag) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void setTabHeader(@NotNull BaseComponent baseComponent, @NotNull BaseComponent baseComponent2) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void setTabHeader(@NotNull BaseComponent[] baseComponentArray, @NotNull BaseComponent[] baseComponentArray2) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public Connection.Unsafe unsafe() {
        PendingConnection pendingConnection = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(pendingConnection);
        return pendingConnection.unsafe();
    }

    public Void BaseCoreGenericHandler(@Nullable String string, @NotNull byte[] byArray) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void transfer(@Nullable String string, int n) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public CompletableFuture retrieveCookie(@Nullable String string) {
        this.LiteBansModule_31();
        throw new CommandExitException();
    }

    public void storeCookie(String string, byte[] byArray) {
        this.plugin(string, byArray);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"null", ""};
    }

    static {
        NullHandler_2.BaseCoreGenericHandler();
    }
}

