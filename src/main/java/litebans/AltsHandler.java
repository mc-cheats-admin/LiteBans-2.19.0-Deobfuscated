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
    private final String LiteBansModule_194;
    public AltsHandler(@NotNull PlatformPlugin plugin, @NotNull String string, @NotNull String string2, @Nullable String string3) {
        super(plugin);
        this.AsyncBackgroundTask_5 = string;
        this.g = string2;
        this.LiteBansModule_194 = string3;
    }

    public final String BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public final String AsyncBackgroundTask_5() {
        return this.g;
    }

    public final String c() {
        return this.LiteBansModule_194;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block20: {
            Object object = this;
            boolean flag = false;
            object = (DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2;
                    Object object32;
                    Object object4 = (LiteBansModule_82)closeable;
                    boolean flag2 = false;
                    LiteBansModule_82 ch3 = ch2;
                    boolean flag3 = false;
                    MessageHandler messageHandler = this;
                    boolean flag4 = false;
                    Object object5 = messageHandler;
                    boolean flag5 = false;
                    DiscordWebhookClient eG2 = ((ConfigService)((MessageHandler)object5).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
                    messageHandler = new LiteBansModule_206(this.g, ch3, null, false, 0, 28, null).i();
                    Object object6 = this;
                    object5 = ch3;
                    flag5 = false;
                    Object object7 = (MessageHandler)object6;
                    boolean flag6 = false;
                    Object object8 = object7;
                    boolean flag7 = false;
                    Object object9 = ((ConfigService)((MessageHandler)object8).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
                    UUID uUID = 0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.GnuSparseMapHandler(((AltsHandler)object6).AsyncBackgroundTask_5());
                    if (uUID != null) {
                        object7 = uUID;
                        if (((DiscordWebhookClient)object9).e() > 1 && object5.AsyncBackgroundTask_5().CommandThrottleService() && ((LiteBansModule_206)messageHandler).n() && !AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)object5, (UUID)object7, null, 2, null)) {
                            Object v1;
                            block19: {
                                Iterable iterable = ((LiteBansModule_206)messageHandler).LiteBansModule_240();
                                for (Object object32 : iterable) {
                                    LiteBansModule_327 j02 = (LiteBansModule_327)object32;
                                    boolean flag8 = false;
                                    if (!(j02.c() != null && (j02.c().LiteBansModule_240() || ((DiscordWebhookClient)object9).e() > 2))) continue;
                                    v1 = object32;
                                    break block19;
                                }
                                v1 = null;
                            }
                            LiteBansModule_327 j03 = v1;
                            if (j03 != null) {
                                LiteBansModule_327 j04 = j03;
                                SilentHandler dZ2 = j04.c();
                                ObjectUtilities.BaseCoreGenericHandler(dZ2);
                                CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)object5, j04, dZ2, ((AltsHandler)object6).BaseCoreGenericHandler(), ((AltsHandler)object6).c(), ((AltsHandler)object6).AsyncBackgroundTask_5(), ((AltsHandler)object6).c(), false, 64, null);
                                if (((DiscordWebhookClient)object9).e() > 2) {
                                    boolean bl9;
                                    LiteBansModule_327 j05;
                                    Object t2;
                                    Iterable iterable = ((LiteBansModule_206)messageHandler).LiteBansModule_240();
                                    boolean bl10 = false;
                                    object2 = iterable;
                                    object32 = new ArrayList();
                                    boolean bl11 = false;
                                    Iterator iterator = object2.iterator();
                                    while (iterator.hasNext()) {
                                        t2 = iterator.next();
                                        j05 = (LiteBansModule_327)t2;
                                        bl9 = false;
                                        if (!(!ObjectUtilities.BaseCoreGenericHandler((Object)j05.LiteBansModule_31(), (Object)((AltsHandler)object6).AsyncBackgroundTask_5()) && j05.c() == null)) continue;
                                        object32.add(t2);
                                    }
                                    iterable = (List)object32;
                                    bl10 = false;
                                    object2 = iterable;
                                    object32 = new ArrayList();
                                    bl11 = false;
                                    iterator = object2.iterator();
                                    while (iterator.hasNext()) {
                                        UUID uUID2;
                                        t2 = iterator.next();
                                        j05 = (LiteBansModule_327)t2;
                                        bl9 = false;
                                        if (!(0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.GnuSparseMapHandler(j05.LiteBansModule_31()) == null ? false : !AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)object5, uUID2, null, 2, null))) continue;
                                        object32.add(t2);
                                    }
                                    object8 = (List)object32;
                                    iterable = (Iterable)object8;
                                    bl10 = false;
                                    for (Object object32 : iterable) {
                                        LiteBansModule_327 j06 = (LiteBansModule_327)object32;
                                        boolean bl12 = false;
                                        CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)object5, j06, j04.c(), j06.e(), ((AltsHandler)object6).c(), j06.LiteBansModule_31(), ((AltsHandler)object6).c(), true);
                                    }
                                }
                            }
                        }
                    }
                    object6 = messageHandler;
                    boolean bl13 = false;
                    if (!((LiteBansModule_206)object6).e() && (((LiteBansModule_206)messageHandler).n() && eG2.LiteBansModule_27() || ((LiteBansModule_206)messageHandler).LiteBansModule_31() && eG2.PluginHookService() || ((LiteBansModule_206)messageHandler).m() >= eG2.ValueHandler())) {
                        LiteBansModule_297 iA2 = ((LiteBansModule_206)messageHandler).LiteBansModule_401();
                        if (iA2 == null) {
                            AssertionUtilities.BaseCoreGenericHandler();
                            throw new CommandExitException();
                        }
                        object6 = iA2;
                        CharSequence charSequence = this.plugin(ch3, (LiteBansModule_297)object6, (LiteBansModule_206)messageHandler);
                        MessageHandler fg_03 = this;
                        boolean bl14 = false;
                        Object object10 = (BroadcastService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
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
                        boolean bl15 = false;
                        object2 = ((ConfigService)((MessageHandler)object9).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_31().BaseCoreGenericHandler("alts");
                        if (((CharSequence)object2).length() > 0) {
                            object9 = ((Object)object10.BaseCoreGenericHandler((CharSequence)MessageKey.HistoryCleanupTask, ((LiteBansModule_206)object8).LiteBansModule_401(), false)).toString();
                            CharSequence charSequence2 = object10.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler((CharSequence)((LiteBansModule_206)messageHandler).c(), (CharSequence)MessageKey.HikariPool), ((LiteBansModule_206)object8).LiteBansModule_401(), false);
                            object32 = object10.BaseCoreGenericHandler((CharSequence)MessageKey.bt, ((LiteBansModule_206)object8).LiteBansModule_401(), false);
                            ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler((LiteBansModule_82)object10, new ContentHandler((String)object2), (CharSequence)object32, charSequence2, ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler((LiteBansModule_82)object10, MessageKey.ca), (String)object9, null, false);
                        }
                    }
                    object4 = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) break block20;
                throw sQLException;
            }
        }
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull LiteBansModule_297 iA2, @NotNull LiteBansModule_206 fW2) {
        CharSequence charSequence = fW2.LiteBansModule_194() ? (CharSequence)MessageKey.PoolBase.BaseCoreGenericHandler("num", (Object)fW2.Utf8Handler_2()) : (CharSequence)this.LiteBansModule_194;
        return LiteBansModule_242.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.P.BaseCoreGenericHandler("ip", (Object)charSequence), iA2, false, 2, null), (CharSequence)fW2.c()), (CharSequence)MessageKey.HikariPool);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(CharSequence charSequence, LiteBansModule_82 ch2) {
        CommandArgumentUtils.BaseCoreGenericHandler(ch2, BroadcastHandler.LiteBansModule_31, charSequence, null, null, 12, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void LiteBansModule_31() {
        e = new String[]{"alts", "alts", "num", "ip"};
    }

    }

