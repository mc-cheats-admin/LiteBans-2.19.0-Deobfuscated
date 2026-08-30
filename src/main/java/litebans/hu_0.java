package litebans;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import litebans.as;
import litebans.c8;
import litebans.jv_0;
import litebans.x_0;
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

/*
 * Renamed from litebans.hU
 */
public static final class hu_0
implements ProxiedPlayer {
    final /* synthetic */ jv_0 a;
    final /* synthetic */ ServerInfo b;

    public hu_0(jv_0 jv_02, ServerInfo serverInfo) {
        this.a = jv_02;
        this.b = serverInfo;
    }

    public InetSocketAddress getAddress() {
        return new InetSocketAddress(InetAddress.getByName(this.a.b()), 0);
    }

    public SocketAddress getSocketAddress() {
        return this.getAddress();
    }

    public void disconnect(String string) {
    }

    public void disconnect(BaseComponent[] baseComponentArray) {
    }

    public void disconnect(BaseComponent baseComponent) {
    }

    public boolean isConnected() {
        return false;
    }

    public Connection.Unsafe unsafe() {
        return null;
    }

    public String getName() {
        return this.a.i();
    }

    public void sendMessage(ChatMessageType chatMessageType, BaseComponent[] baseComponentArray) {
    }

    public void sendMessage(ChatMessageType chatMessageType, BaseComponent baseComponent) {
    }

    public void sendMessage(UUID uUID, BaseComponent[] baseComponentArray) {
    }

    public void sendMessage(UUID uUID, BaseComponent baseComponent) {
    }

    public void sendMessage(String string) {
    }

    public void sendMessage(BaseComponent[] baseComponentArray) {
    }

    public void sendMessage(BaseComponent baseComponent) {
    }

    public void sendMessages(String[] stringArray) {
    }

    public Collection getGroups() {
        return new ArrayList();
    }

    public void addGroups(String[] stringArray) {
    }

    public void removeGroups(String[] stringArray) {
    }

    public boolean hasPermission(String string) {
        return false;
    }

    public Void a(String string, boolean bl) {
        x_0.a();
        throw new as();
    }

    public Collection getPermissions() {
        return new ArrayList();
    }

    public String getDisplayName() {
        return this.a.i();
    }

    public Void a(String string) {
        x_0.a();
        throw new as();
    }

    public void connect(ServerInfo serverInfo) {
    }

    public void connect(ServerInfo serverInfo, ServerConnectEvent.Reason reason) {
    }

    public void connect(ServerInfo serverInfo, Callback callback) {
    }

    public void connect(ServerInfo serverInfo, Callback callback, ServerConnectEvent.Reason reason) {
    }

    public void connect(ServerConnectRequest serverConnectRequest) {
    }

    public Server getServer() {
        return new c8(this.b);
    }

    public int getPing() {
        return 0;
    }

    public void sendData(String string, byte[] byArray) {
    }

    public PendingConnection getPendingConnection() {
        x_0.a();
        throw new as();
    }

    public void chat(String string) {
    }

    public ServerInfo getReconnectServer() {
        return null;
    }

    public void setReconnectServer(ServerInfo serverInfo) {
    }

    public String getUUID() {
        return this.a.a();
    }

    public UUID getUniqueId() {
        return this.a.d();
    }

    public Locale getLocale() {
        x_0.a();
        throw new as();
    }

    public byte getViewDistance() {
        x_0.a();
        throw new as();
    }

    public ProxiedPlayer.ChatMode getChatMode() {
        x_0.a();
        throw new as();
    }

    public boolean hasChatColors() {
        return false;
    }

    public SkinConfiguration getSkinParts() {
        x_0.a();
        throw new as();
    }

    public ProxiedPlayer.MainHand getMainHand() {
        x_0.a();
        throw new as();
    }

    public void setTabHeader(BaseComponent baseComponent, BaseComponent baseComponent2) {
    }

    public void setTabHeader(BaseComponent[] baseComponentArray, BaseComponent[] baseComponentArray2) {
    }

    public void resetTabHeader() {
    }

    public void sendTitle(Title title) {
    }

    public boolean isForgeUser() {
        x_0.a();
        throw new as();
    }

    public Map getModList() {
        x_0.a();
        throw new as();
    }

    public Scoreboard getScoreboard() {
        x_0.a();
        throw new as();
    }

    public CompletableFuture retrieveCookie(String string) {
        x_0.a();
        throw new as();
    }

    public Void a(String string, byte[] byArray) {
        x_0.a();
        throw new as();
    }

    public Void a(String string, int n) {
        x_0.a();
        throw new as();
    }

    public void setPermission(String string, boolean bl) {
        this.a(string, bl);
    }

    public void setDisplayName(String string) {
        this.a(string);
    }

    public void storeCookie(String string, byte[] byArray) {
        this.a(string, byArray);
    }

    public void transfer(String string, int n) {
        this.a(string, n);
    }
}

