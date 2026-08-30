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
implements LiteBansModule_359 {
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
            Object object;
            boolean flag2;
            Object object2;
            boolean flag3;
            Object object3;
            String string;
            String string2 = sender.BaseCoreGenericHandler();
            MessageHandler messageHandler = this;
            String string3 = (String)ArrayUtilities.e(args);
            if (string3 == null) {
                string3 = string2;
            }
            if (StringUtilities.BaseCoreGenericHandler(string = CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, string3), sender.i(), true) || StringUtilities.BaseCoreGenericHandler(string, string2, true)) {
                object3 = this;
                String string4 = "litebans.warnings.self";
                boolean flag4 = false;
                CommandSenderWrapper jv_03 = ((MessageHandler)object3).AsyncBackgroundTask_5();
                boolean flag5 = false;
                ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
                CommandSenderWrapper jv_04 = jv_03;
                boolean flag6 = false;
                CommandSenderWrapper jv_05 = jv_04;
                boolean flag7 = false;
                flag3 = !jv_05.e(string4);
                object2 = MessageKey.cZ;
                flag2 = false;
                object = chatFormatter;
                flag = false;
                if (flag3) {
                    ChatFormatter fo_03 = object;
                    boolean flag8 = false;
                    fo_03.BaseCoreGenericHandler(object2);
                    throw new CommandExitException();
                }
                object3 = MessageHandler.BaseCoreGenericHandler;
                boolean bl9 = sender.e();
                CharSequence charSequence = MessageKey.LiteBansModule_38;
                boolean bl10 = false;
                Object object4 = object3;
                boolean bl11 = !bl9;
                flag3 = false;
                if (bl11) {
                    object2 = object4;
                    flag2 = false;
                    ((ChatFormatter)object2).BaseCoreGenericHandler(charSequence);
                    throw new CommandExitException();
                }
            } else {
                object3 = this;
                String string5 = "litebans.warnings";
                boolean bl12 = false;
                CommandSenderWrapper jv_06 = ((MessageHandler)object3).AsyncBackgroundTask_5();
                boolean bl13 = false;
                ChatFormatter fo_04 = MessageHandler.BaseCoreGenericHandler;
                CommandSenderWrapper jv_07 = jv_06;
                boolean bl14 = false;
                CommandSenderWrapper jv_08 = jv_07;
                boolean bl15 = false;
                flag3 = !jv_08.e(string5);
                object2 = MessageKey.cZ;
                flag2 = false;
                object = fo_04;
                flag = false;
                if (flag3) {
                    ChatFormatter fo_05 = object;
                    boolean bl16 = false;
                    fo_05.BaseCoreGenericHandler(object2);
                    throw new CommandExitException();
                }
            }
            object3 = CommandArgumentUtils.BaseCoreGenericHandler(this, sender, args, null, 4, null);
            int n = this.plugin(this.LiteBansModule_240(), args, CollectionUtilities.e(), 512);
            Object object5 = this;
            boolean bl17 = false;
            object5 = (DatabaseMonitorService)((MessageHandler)object5).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            bl17 = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object5).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    object2 = (LiteBansModule_82)closeable;
                    flag2 = false;
                    object = ch2;
                    flag = false;
                    LiteBansModule_297 iA2 = CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)object, string, false, 2, null);
                    List list = CollectionUtilities.e(object.BaseCoreGenericHandler(iA2, BanHandler.c, (String)object3, true, n));
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)object, this.plugin(), iA2, false, 2, null), (CharSequence)"limit", n));
                    Iterable iterable = list;
                    boolean bl18 = false;
                    for (Object t2 : iterable) {
                        MessageKey am2;
                        SilentHandler dZ2 = (SilentHandler)t2;
                        boolean bl19 = false;
                        CharSequence charSequence = MessageKey.BaseCoreGenericHandler(dZ2.ServerSyncService());
                        MessageKey am3 = am2 = dZ2.HoverTextFormatter() ? MessageKey.LiteBansModule_89 : MessageKey.MessageKey;
                        if (object.BaseCoreGenericHandler(dZ2)) {
                            CharSequence charSequence2 = charSequence;
                            boolean bl20 = false;
                            charSequence = "" + charSequence2 + (CharSequence)am2;
                        }
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)object, charSequence, dZ2, iA2, false, 4, null));
                    }
                    object2 = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (((DatabaseMonitorService)object5).LiteBansModule_31(sQLException)) break block15;
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
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Collection collection, @Nullable LiteBansModule_297 iA2, @Nullable String[] args, @NotNull AbstractCommand abstractCommand, int n) {
        LimitHandler.BaseCoreGenericHandler((LiteBansModule_359)this, ch2, collection, iA2, args, abstractCommand, n);
    }

    @Override
    public LiteBansModule_297 BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull HashMap hashMap, @Nullable String string) {
        return LimitHandler.BaseCoreGenericHandler(this, ch2, hashMap, string);
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"warnings", "litebans.warnings.self", "litebans.warnings.self", "litebans.warnings", "limit"};
    }

    }

