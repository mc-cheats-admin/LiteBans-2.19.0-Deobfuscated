package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class HistoryCommand
extends AbstractCommand
implements LiteBansModule_359 {
    public HistoryCommand(@NotNull PlatformPlugin plugin) {
        super("history", plugin);
    }

    @Override
    public CharSequence BaseCoreGenericHandler() {
        return MessageKey.GnuSparseMapHandler;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block9: {
            Object object = this;
            boolean flag = false;
            object = (DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2 = (LiteBansModule_82)closeable;
                    boolean flag2 = false;
                    LiteBansModule_82 ch3 = ch2;
                    boolean flag3 = false;
                    Object object3 = this;
                    boolean flag4 = false;
                    String string = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object3, (String)ArrayUtilities.LiteBansModule_31(args));
                    object3 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string, false);
                    String string2 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])args, 1);
                    BanHandler a_2 = BanHandler.LiteBansModule_401.BaseCoreGenericHandler(string2);
                    String string3 = CommandArgumentUtils.BaseCoreGenericHandler(this, sender, args, null, 4, null);
                    if (((LiteBansModule_297)object3).LiteBansModule_31() == null) {
                        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(string + "'AsyncBackgroundTask_21 uuid is null");
                        throw new CommandExitException();
                    }
                    int n = LimitHandler.BaseCoreGenericHandler((LiteBansModule_359)this, ch3.e(), args, CollectionUtilities.e(), 0, 8, null);
                    BanHandler a_3 = a_2;
                    List list = a_3 != null ? CollectionUtilities.BaseCoreGenericHandler(a_3) : BanHandler.LiteBansModule_401.BaseCoreGenericHandler();
                    Iterable iterable = list;
                    boolean flag5 = false;
                    Iterable iterable2 = iterable;
                    Collection collection = new ArrayList();
                    boolean flag6 = false;
                    for (Object t2 : iterable2) {
                        BanHandler a_4 = (BanHandler)t2;
                        boolean flag7 = false;
                        Iterable iterable3 = ch3.BaseCoreGenericHandler((LiteBansModule_297)object3, a_4, string3, false, n);
                        CollectionUtilities.BaseCoreGenericHandler(collection, iterable3);
                    }
                    List list2 = CollectionUtilities.e((List)collection);
                    LimitHandler.BaseCoreGenericHandler(this, ch3, list2, (LiteBansModule_297)object3, args, null, 0, 24, null);
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
                if (((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) break block9;
                throw sQLException;
            }
        }
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
        i = new String[]{"history", "'AsyncBackgroundTask_21 uuid is null"};
    }

    }

