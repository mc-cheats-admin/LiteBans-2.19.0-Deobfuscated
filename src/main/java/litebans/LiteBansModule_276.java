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

public final class LiteBansModule_276
implements ProxiedPlayer {
    final /* synthetic */ CommandSenderWrapper BaseCoreGenericHandler;
    final /* synthetic */ ServerInfo LiteBansModule_31;

    public LiteBansModule_276(CommandSenderWrapper sender, ServerInfo serverInfo) {
        this.plugin = sender;
        this.LiteBansModule_31 = serverInfo;
    }

    public InetSocketAddress getAddress() {
        return new InetSocketAddress(InetAddress.getByName(this.plugin.LiteBansModule_31()), 0);
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
        return this.plugin.i();
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

    public void sendMessages(String[] args) {
    }

    public Collection getGroups() {
        return new ArrayList();
    }

    public void addGroups(String[] args) {
    }

    public void removeGroups(String[] args) {
    }

    public boolean hasPermission(String string) {
        return false;
    }

    public Void BaseCoreGenericHandler(String string, boolean flag) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Collection getPermissions() {
        return new ArrayList();
    }

    public String getDisplayName() {
        return this.plugin.i();
    }

    public Void BaseCoreGenericHandler(String string) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
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
        return new LiteBansModule_69(this.LiteBansModule_31);
    }

    public int getPing() {
        return 0;
    }

    public void sendData(String string, byte[] byArray) {
    }

    public PendingConnection getPendingConnection() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public void chat(String string) {
    }

    public ServerInfo getReconnectServer() {
        return null;
    }

    public void setReconnectServer(ServerInfo serverInfo) {
    }

    public String getUUID() {
        return this.plugin.BaseCoreGenericHandler();
    }

    public UUID getUniqueId() {
        return this.plugin.AsyncBackgroundTask_5();
    }

    public Locale getLocale() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public byte getViewDistance() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public ProxiedPlayer.ChatMode getChatMode() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public boolean hasChatColors() {
        return false;
    }

    public SkinConfiguration getSkinParts() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public ProxiedPlayer.MainHand getMainHand() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
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
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Map getModList() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Scoreboard getScoreboard() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public CompletableFuture retrieveCookie(String string) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Void BaseCoreGenericHandler(String string, byte[] byArray) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Void BaseCoreGenericHandler(String string, int n) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public void setPermission(String string, boolean flag) {
        this.plugin(string, flag);
    }

    public void setDisplayName(String string) {
        this.plugin(string);
    }

    public void storeCookie(String string, byte[] byArray) {
        this.plugin(string, byArray);
    }

    public void transfer(String string, int n) {
        this.plugin(string, n);
}

