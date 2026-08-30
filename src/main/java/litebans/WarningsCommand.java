package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WarningsCommand
extends AbstractCommand
implements LiteBansModule_361 {
        public WarningsCommand(@NotNull PlatformPlugin plugin) {
        super("warnings", plugin);
    }

    @Override
    public String getPermission() {
        return "litebans.warnings.self";
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block15: {
            boolean flag;
            boolean flag2;
            boolean flag3;
            String string;
            String string2 = sender.BaseCoreGenericHandler();
            MessageHandler messageHandler = this;
            String string3 = (String)ArrayUtilities.e(args);
            if (string3 == null) {
                string3 = string2;
            }
            if (StringUtilities.BaseCoreGenericHandler(string = CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, string3), sender.i(), true) || StringUtilities.BaseCoreGenericHandler(string, string2, true)) {
                resultObj = this;
                String string4 = "litebans.warnings.self";
                CommandSenderWrapper senderWrapper = ((MessageHandler)resultObj).AsyncBackgroundTask_5();
                ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
                CommandSenderWrapper senderWrapper = senderWrapper;
                CommandSenderWrapper senderWrapper = senderWrapper;
                flag3 = !senderWrapper.e(string4);
                contextObj = MessageKey.cZ;
                flag2 = false;
                targetObj = chatFormatter;
                flag = false;
                if (flag3) {
                    ChatFormatter fo_03 = targetObj;
                    fo_03.BaseCoreGenericHandler(contextObj);
                    throw new CommandExitException();
                }
                resultObj = MessageHandler.BaseCoreGenericHandler;
                boolean bl9 = sender.e();
                CharSequence charSequence = MessageKey.LiteBansModule_38;
                Object helperObj = resultObj;
                boolean bl11 = !bl9;
                flag3 = false;
                if (bl11) {
                    contextObj = helperObj;
                    flag2 = false;
                    ((ChatFormatter)contextObj).BaseCoreGenericHandler(charSequence);
                    throw new CommandExitException();
                }
            } else {
                resultObj = this;
                String string5 = "litebans.warnings";
                CommandSenderWrapper senderWrapper = ((MessageHandler)resultObj).AsyncBackgroundTask_5();
                ChatFormatter fo_04 = MessageHandler.BaseCoreGenericHandler;
                CommandSenderWrapper senderWrapper = senderWrapper;
                CommandSenderWrapper senderWrapper = senderWrapper;
                flag3 = !senderWrapper.e(string5);
                contextObj = MessageKey.cZ;
                flag2 = false;
                targetObj = fo_04;
                flag = false;
                if (flag3) {
                    ChatFormatter fo_05 = targetObj;
                    fo_05.BaseCoreGenericHandler(contextObj);
                    throw new CommandExitException();
                }
            }
            resultObj = CommandArgumentUtils.BaseCoreGenericHandler(this, sender, args, null, 4, null);
            int n = this.plugin(this.LiteBansModule_241(), args, CollectionUtilities.e(), 512);
                        tempObj = (DatabaseMonitorService)((MessageHandler)tempObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            bl17 = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)tempObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    contextObj = (LiteBansModule_83)closeable;
                    flag2 = false;
                    targetObj = ch2;
                    flag = false;
                    LiteBansModule_298 iA2 = CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)targetObj, string, false, 2, null);
                    List list = CollectionUtilities.e(targetObj.BaseCoreGenericHandler(iA2, BanHandler.c, (String)resultObj, true, n));
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)targetObj, this.plugin(), iA2, false, 2, null), (CharSequence)"limit", n));
                    Iterable iterable = list;
                    for (Object t2 : iterable) {
                        MessageKey am2;
                        SilentHandler dZ2 = (SilentHandler)t2;
                        CharSequence charSequence = MessageKey.BaseCoreGenericHandler(dZ2.ServerSyncService());
                        MessageKey am3 = am2 = dZ2.HoverTextFormatter() ? MessageKey.LiteBansModule_90 : MessageKey.MessageKey;
                        if (targetObj.BaseCoreGenericHandler(dZ2)) {
                            CharSequence charSequence2 = charSequence;
                            charSequence = "" + charSequence2 + (CharSequence)am2;
                        }
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)targetObj, charSequence, dZ2, iA2, false, 4, null));
                    }
                    contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)tempObj).LiteBansModule_31(sQLException)) break block15;
                throw sQLException;
            }
        }
    }

    @Override
    public CharSequence BaseCoreGenericHandler() {
        return MessageKey.bc;
    }

    @Override
    public int BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, @Nullable String[] args, @NotNull Collection collection, int n) {
        return LimitHandler.BaseCoreGenericHandler(this, plugin, args, collection, n);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull Collection collection, @Nullable LiteBansModule_298 iA2, @Nullable String[] args, @NotNull AbstractCommand abstractCommand, int n) {
        LimitHandler.BaseCoreGenericHandler((LiteBansModule_361)this, ch2, collection, iA2, args, abstractCommand, n);
    }

    @Override
    public LiteBansModule_298 BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull HashMap hashMap, @Nullable String string) {
        return LimitHandler.BaseCoreGenericHandler(this, ch2, hashMap, string);
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"warnings", "litebans.warnings.self", "litebans.warnings.self", "litebans.warnings", "limit"};
    }

    static {
        WarningsCommand.BaseCoreGenericHandler();
    }
}

