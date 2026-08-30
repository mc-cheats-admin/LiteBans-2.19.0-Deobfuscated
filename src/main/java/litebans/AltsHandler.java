package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AltsHandler
extends MessageHandler {
    private final String AsyncBackgroundTask_5;
    private final String g;
    private final String LiteBansModule_195;
        public AltsHandler(@NotNull PlatformPlugin plugin, @NotNull String string, @NotNull String string2, @Nullable String string3) {
        super(plugin);
        this.AsyncBackgroundTask_5 = string;
        this.g = string2;
        this.LiteBansModule_195 = string3;
    }

    public final String BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public final String AsyncBackgroundTask_5() {
        return this.g;
    }

    public final String c() {
        return this.LiteBansModule_195;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block20: {
                        targetObj = (DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)targetObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object helperObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    MessageHandler messageHandler = this;
                    Object tempObj = messageHandler;
                    DiscordWebhookClient eG2 = ((ConfigService)((MessageHandler)tempObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195();
                    messageHandler = new LiteBansModule_207(this.g, ch3, null, false, 0, 28, null).i();
                                        tempObj = ch3;
                    flag5 = false;
                    Object object7 = (MessageHandler)object6;
                    Object object8 = object7;
                    Object object9 = ((ConfigService)((MessageHandler)object8).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195();
                    UUID uUID = LiteBansModule_346.BaseCoreGenericHandler.GnuSparseMapHandler(((AltsHandler)object6).AsyncBackgroundTask_5());
                    if (uUID != null) {
                        object7 = uUID;
                        if (((DiscordWebhookClient)object9).e() > 1 && tempObj.AsyncBackgroundTask_5().CommandThrottleService() && ((LiteBansModule_207)messageHandler).n() && !AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)tempObj, (UUID)object7, null, 2, null)) {
                            Object v1;
                            block19: {
                                Iterable iterable = ((LiteBansModule_207)messageHandler).LiteBansModule_241();
                                for (Object object32 : iterable) {
                                    LiteBansModule_328 j02 = (LiteBansModule_328)object32;
                                    if (!(j02.c() != null && (j02.c().LiteBansModule_241() || ((DiscordWebhookClient)object9).e() > 2))) continue;
                                    v1 = object32;
                                    break block19;
                                }
                                v1 = null;
                            }
                            LiteBansModule_328 j03 = v1;
                            if (j03 != null) {
                                LiteBansModule_328 j04 = j03;
                                SilentHandler dZ2 = j04.c();
                                ObjectUtilities.BaseCoreGenericHandler(dZ2);
                                CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)tempObj, j04, dZ2, ((AltsHandler)object6).BaseCoreGenericHandler(), ((AltsHandler)object6).c(), ((AltsHandler)object6).AsyncBackgroundTask_5(), ((AltsHandler)object6).c(), false, 64, null);
                                if (((DiscordWebhookClient)object9).e() > 2) {
                                    boolean bl9;
                                    LiteBansModule_328 j05;
                                    Object t2;
                                    Iterable iterable = ((LiteBansModule_207)messageHandler).LiteBansModule_241();
                                    contextObj = iterable;
                                    object32 = new ArrayList();
                                    Iterator iterator = contextObj.iterator();
                                    while (iterator.hasNext()) {
                                        t2 = iterator.next();
                                        j05 = (LiteBansModule_328)t2;
                                        bl9 = false;
                                        if (!(!ObjectUtilities.BaseCoreGenericHandler((Object)j05.LiteBansModule_31(), (Object)((AltsHandler)object6).AsyncBackgroundTask_5()) && j05.c() == null)) continue;
                                        object32.add(t2);
                                    }
                                    iterable = (List)object32;
                                    bl10 = false;
                                    contextObj = iterable;
                                    object32 = new ArrayList();
                                    bl11 = false;
                                    iterator = contextObj.iterator();
                                    while (iterator.hasNext()) {
                                        UUID uUID2;
                                        t2 = iterator.next();
                                        j05 = (LiteBansModule_328)t2;
                                        bl9 = false;
                                        if (!(LiteBansModule_346.BaseCoreGenericHandler.GnuSparseMapHandler(j05.LiteBansModule_31()) == null ? false : !AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)tempObj, uUID2, null, 2, null))) continue;
                                        object32.add(t2);
                                    }
                                    object8 = (List)object32;
                                    iterable = (Iterable)object8;
                                    bl10 = false;
                                    for (Object object32 : iterable) {
                                        LiteBansModule_328 j06 = (LiteBansModule_328)object32;
                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)tempObj, j06, j04.c(), j06.e(), ((AltsHandler)object6).c(), j06.LiteBansModule_31(), ((AltsHandler)object6).c(), true);
                                    }
                                }
                            }
                        }
                    }
                    object6 = messageHandler;
                    if (!((LiteBansModule_207)object6).e() && (((LiteBansModule_207)messageHandler).n() && eG2.LiteBansModule_27() || ((LiteBansModule_207)messageHandler).LiteBansModule_31() && eG2.PluginHookService() || ((LiteBansModule_207)messageHandler).m() >= eG2.ValueHandler())) {
                        LiteBansModule_298 iA2 = ((LiteBansModule_207)messageHandler).LiteBansModule_403();
                        if (iA2 == null) {
                            AssertionUtilities.BaseCoreGenericHandler();
                            throw new CommandExitException();
                        }
                        object6 = iA2;
                        CharSequence charSequence = this.plugin(ch3, (LiteBansModule_298)object6, (LiteBansModule_207)messageHandler);
                        MessageHandler fg_03 = this;
                        Object object10 = (BroadcastService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                        flag6 = false;
                        BroadcastService.BaseCoreGenericHandler((BroadcastService)object10, ch3, charSequence, BroadcastHandler.LiteBansModule_31, null, null, false, false, null, 124, null);
                        if (eG2.ExceptionHandler() && ch3.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
                            ch3.AsyncBackgroundTask_5().BaseCoreGenericHandler(arg_0 -> AltsHandler.BaseCoreGenericHandler(charSequence, arg_0));
                        }
                        fg_03 = this;
                        object10 = ch3;
                        flag6 = false;
                        object8 = messageHandler;
                        flag7 = false;
                        object9 = object8;
                        contextObj = ((ConfigService)((MessageHandler)object9).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_31().BaseCoreGenericHandler("alts");
                        if (((CharSequence)contextObj).length() > 0) {
                            object9 = ((Object)object10.BaseCoreGenericHandler((CharSequence)MessageKey.HistoryCleanupTask, ((LiteBansModule_207)object8).LiteBansModule_403(), false)).toString();
                            CharSequence charSequence2 = object10.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler((CharSequence)((LiteBansModule_207)messageHandler).c(), (CharSequence)MessageKey.HikariPool), ((LiteBansModule_207)object8).LiteBansModule_403(), false);
                            object32 = object10.BaseCoreGenericHandler((CharSequence)MessageKey.bt, ((LiteBansModule_207)object8).LiteBansModule_403(), false);
                            ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler((LiteBansModule_83)object10, new ContentHandler((String)contextObj), (CharSequence)object32, charSequence2, ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler((LiteBansModule_83)object10, MessageKey.ca), (String)object9, null, false);
                        }
                    }
                    helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (((DatabaseMonitorService)targetObj).LiteBansModule_31(sQLException)) break block20;
                throw sQLException;
            }
        }
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull LiteBansModule_298 iA2, @NotNull LiteBansModule_207 fW2) {
        CharSequence charSequence = fW2.LiteBansModule_195() ? (CharSequence)MessageKey.PoolBase.BaseCoreGenericHandler("num", (Object)fW2.Utf8Handler_2()) : (CharSequence)this.LiteBansModule_195;
        return LiteBansModule_243.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.P.BaseCoreGenericHandler("ip", (Object)charSequence), iA2, false, 2, null), (CharSequence)fW2.c()), (CharSequence)MessageKey.HikariPool);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(CharSequence charSequence, LiteBansModule_83 ch2) {
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, BroadcastHandler.LiteBansModule_31, charSequence, null, null, 12, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void LiteBansModule_31() {
        e = new String[]{"alts", "alts", "num", "ip"};
    }

    static {
        AltsHandler.LiteBansModule_31();
    }
}

