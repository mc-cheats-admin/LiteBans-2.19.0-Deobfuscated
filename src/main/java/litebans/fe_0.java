package litebans;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import litebans.ai_0;
import litebans.as;
import litebans.di_0;
import litebans.ec_0;
import litebans.ew;
import litebans.hl;
import litebans.k1;
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

@ai_0(a=1)
public final class fe_0
implements ProxiedPlayer {
    private final di_0 c;
    private final PendingConnection b;
    private static /* synthetic */ String[] a;

    public fe_0(@NotNull di_0 di_02, @Nullable PendingConnection pendingConnection) {
        this.c = di_02;
        this.b = pendingConnection;
    }

    public final Void b() {
        throw new UnsupportedOperationException();
    }

    public void connect(@Nullable ServerConnectRequest serverConnectRequest) {
        this.b();
        throw new as();
    }

    public void connect(@Nullable ServerInfo serverInfo, @Nullable ServerConnectEvent.Reason reason) {
        this.b();
        throw new as();
    }

    public void connect(@Nullable ServerInfo serverInfo, @Nullable Callback callback, @Nullable ServerConnectEvent.Reason reason) {
        this.b();
        throw new as();
    }

    public SkinConfiguration getSkinParts() {
        this.b();
        throw new as();
    }

    public boolean hasChatColors() {
        this.b();
        throw new as();
    }

    public byte getViewDistance() {
        this.b();
        throw new as();
    }

    public ProxiedPlayer.MainHand getMainHand() {
        this.b();
        throw new as();
    }

    public ProxiedPlayer.ChatMode getChatMode() {
        this.b();
        throw new as();
    }

    public Scoreboard getScoreboard() {
        this.b();
        throw new as();
    }

    public void addGroups(@NotNull String[] stringArray) {
        this.b();
        throw new as();
    }

    public void chat(@NotNull String string) {
        this.b();
        throw new as();
    }

    public void connect(@NotNull ServerInfo serverInfo) {
        this.b();
        throw new as();
    }

    public void connect(@NotNull ServerInfo serverInfo, @NotNull Callback callback) {
        this.b();
        throw new as();
    }

    public void disconnect(@NotNull String string) {
        block0: {
            PendingConnection pendingConnection = this.b;
            if (pendingConnection == null) break block0;
            pendingConnection.disconnect(string);
        }
    }

    public void disconnect(@NotNull BaseComponent[] baseComponentArray) {
        block0: {
            PendingConnection pendingConnection = this.b;
            if (pendingConnection == null) break block0;
            pendingConnection.disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
        }
    }

    public void disconnect(@NotNull BaseComponent baseComponent) {
        block0: {
            PendingConnection pendingConnection = this.b;
            if (pendingConnection == null) break block0;
            pendingConnection.disconnect(baseComponent);
        }
    }

    public InetSocketAddress getAddress() {
        PendingConnection pendingConnection = this.b;
        return pendingConnection != null ? pendingConnection.getAddress() : null;
    }

    public String getDisplayName() {
        return this.getName();
    }

    public void setDisplayName(@NotNull String string) {
        this.b();
        throw new as();
    }

    public Collection getGroups() {
        this.b();
        throw new as();
    }

    public Locale getLocale() {
        this.b();
        throw new as();
    }

    public Map getModList() {
        this.b();
        throw new as();
    }

    public String getName() {
        Object object = this.b;
        if (object == null || (object = object.getName()) == null) {
            object = "null";
        }
        return object;
    }

    public PendingConnection getPendingConnection() {
        PendingConnection pendingConnection = this.b;
        ew.a(pendingConnection);
        return pendingConnection;
    }

    public Collection getPermissions() {
        this.b();
        throw new as();
    }

    public int getPing() {
        return 0;
    }

    public ServerInfo getReconnectServer() {
        ec_0 ec_02 = this.c.i();
        ew.b(ec_02, "");
        k1 k12 = (k1)ec_02;
        PendingConnection pendingConnection = this.b;
        ew.a(pendingConnection);
        return k12.b(pendingConnection);
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
        Object object = this.b;
        if (object == null || (object = object.getUniqueId()) == null) {
            object = new UUID(0L, 0L);
        }
        return object;
    }

    public boolean hasPermission(@NotNull String string) {
        return false;
    }

    public boolean isConnected() {
        return false;
    }

    public boolean isForgeUser() {
        this.b();
        throw new as();
    }

    public void removeGroups(@NotNull String[] stringArray) {
        this.b();
        throw new as();
    }

    public void resetTabHeader() {
        this.b();
        throw new as();
    }

    public SocketAddress getSocketAddress() {
        PendingConnection pendingConnection = this.b;
        return pendingConnection != null ? pendingConnection.getSocketAddress() : null;
    }

    public void sendData(@NotNull String string, @NotNull byte[] byArray) {
        this.b();
        throw new as();
    }

    public void sendMessage(@NotNull String string) {
        this.b();
        throw new as();
    }

    public void sendMessage(@NotNull BaseComponent[] baseComponentArray) {
        this.b();
        throw new as();
    }

    public void sendMessage(@NotNull BaseComponent baseComponent) {
        this.b();
        throw new as();
    }

    public void sendMessage(@NotNull ChatMessageType chatMessageType, @NotNull BaseComponent[] baseComponentArray) {
        this.b();
        throw new as();
    }

    public void sendMessage(@NotNull ChatMessageType chatMessageType, @NotNull BaseComponent baseComponent) {
        this.b();
        throw new as();
    }

    public void sendMessage(@Nullable UUID uUID, @NotNull BaseComponent[] baseComponentArray) {
        this.b();
        throw new as();
    }

    public void sendMessage(@Nullable UUID uUID, @Nullable BaseComponent baseComponent) {
        this.b();
        throw new as();
    }

    public void sendMessages(@NotNull String[] stringArray) {
        this.b();
        throw new as();
    }

    public void sendTitle(@NotNull Title title) {
        this.b();
        throw new as();
    }

    public void setPermission(@NotNull String string, boolean bl) {
        this.b();
        throw new as();
    }

    public void setTabHeader(@NotNull BaseComponent baseComponent, @NotNull BaseComponent baseComponent2) {
        this.b();
        throw new as();
    }

    public void setTabHeader(@NotNull BaseComponent[] baseComponentArray, @NotNull BaseComponent[] baseComponentArray2) {
        this.b();
        throw new as();
    }

    public Connection.Unsafe unsafe() {
        PendingConnection pendingConnection = this.b;
        ew.a(pendingConnection);
        return pendingConnection.unsafe();
    }

    public Void a(@Nullable String string, @NotNull byte[] byArray) {
        this.b();
        throw new as();
    }

    public void transfer(@Nullable String string, int n) {
        this.b();
        throw new as();
    }

    public CompletableFuture retrieveCookie(@Nullable String string) {
        this.b();
        throw new as();
    }

    public void storeCookie(String string, byte[] byArray) {
        this.a(string, byArray);
    }

    private static final void a() {
        a = new String[]{"null", ""};
    }

    static {
        fe_0.a();
    }
}

