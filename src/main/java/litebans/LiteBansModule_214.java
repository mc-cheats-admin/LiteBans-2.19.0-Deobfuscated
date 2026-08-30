package litebans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_214
extends MessageHandler {
    private final String[] AsyncBackgroundTask_5;
    public LiteBansModule_214(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.AsyncBackgroundTask_5 = args;
    }

    @Override
    public void run() {
        int n;
        int n2;
        int n3;
        CommandSenderWrapper sender = this.AsyncBackgroundTask_5();
        LiteBansModule_324 iX2 = new LiteBansModule_324(0L, 1, null);
        int n4 = LiteBansModule_389.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, 1, 512);
        int n5 = LiteBansModule_389.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, 2, 4096);
        int n6 = LiteBansModule_389.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, 3, 6);
                ServerInfo serverInfo = new LobbyHandler();
        targetObj = new ArrayList(n4);
        for (n7 = 0; n7 < n4; ++n7) {
            UUID uUID = new UUID(iX2.LiteBansModule_31(), iX2.LiteBansModule_31());
            int n8 = iX2.BaseCoreGenericHandler(252) + 2;
            n3 = iX2.BaseCoreGenericHandler(252) + 2;
            n2 = iX2.BaseCoreGenericHandler(252) + 2;
            n = iX2.BaseCoreGenericHandler(252) + 2;
            String string = "" + n8 + '.' + n3 + '.' + n2 + '.' + n;
            String string2 = String.valueOf(iX2.BaseCoreGenericHandler(999999999));
            LiteBansModule_214 ga_02 = this;
            targetObj.add((CommandSenderWrapper)new LiteBansModule_46(string2, string, uUID));
        }
                ((ConfigService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler((byte)0);
        contextObj = new LiteBansModule_166(1, n6);
        flag = false;
        Iterator iterator = contextObj.iterator();
        while (iterator.hasNext()) {
            n2 = n3 = ((LiteBansModule_290)iterator).LiteBansModule_31();
            n = 0;
            this.LiteBansModule_240().LiteBansModule_31(() -> LiteBansModule_214.BaseCoreGenericHandler(sender, n5, (List)targetObj, iX2, this, serverInfo));
}

    private static final void BaseCoreGenericHandler(CommandSenderWrapper sender, int n, List list, LiteBansModule_324 iX2, LiteBansModule_214 ga_02, ServerInfo serverInfo) {
        long l3 = System.nanoTime();
        Iterable iterable = new LiteBansModule_166(1, n);
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            int n2;
            int n3 = n2 = ((LiteBansModule_290)iterator).LiteBansModule_31();
            CommandSenderWrapper senderWrapper = (CommandSenderWrapper)list.get(iX2.BaseCoreGenericHandler(list.size()));
            MessageHandler messageHandler = ga_02;
            GeoIPLookupService_3 gu2 = ((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).c();
            messageHandler = ga_02;
            flag5 = false;
            gu2.LiteBansModule_31(new ServerConnectEvent((ProxiedPlayer)new LiteBansModule_276(senderWrapper, serverInfo), serverInfo, ServerConnectEvent.Reason.PLUGIN, null));
        }
        long l5 = System.nanoTime() - l3;
        sender.BaseCoreGenericHandler(BlackHandler.i + " -> " + BlackHandler.m + LiteBansModule_287.BaseCoreGenericHandler((double)l5 / 1000.0 / 1000.0) + ' ' + BlackHandler.i + "ms to process " + n + " ");
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{" -> ", "ms to process ", " events."};
}

