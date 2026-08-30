package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class IPReportCommand
extends AbstractCommand {
    public IPReportCommand(@NotNull PlatformPlugin plugin) {
        super("ipreport", plugin);
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
        block9: {
            Object object = this.LiteBansModule_240().q();
            boolean flag = false;
            Object object2 = object;
            Object object3 = new ArrayList();
            boolean flag2 = false;
            for (Object object4 : object2) {
                CommandSenderWrapper jv_03 = (CommandSenderWrapper)object4;
                boolean flag3 = false;
                if (!(!ObjectUtilities.BaseCoreGenericHandler((Object)jv_03, sender))) continue;
                object3.add(object4);
            }
            List list = (List)object3;
            object = this;
            flag = false;
            object = (DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                object2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                object3 = (Closeable)object2;
                Throwable throwable = null;
                try {
                    Object object4;
                    Object object5 = (LiteBansModule_82)object3;
                    int n = 0;
                    object4 = object2;
                    boolean flag4 = false;
                    CharSequence charSequence = object4.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_32.BaseCoreGenericHandler("num", (Object)list.size()));
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, charSequence);
                    Iterable iterable = list;
                    boolean flag5 = false;
                    for (Object t2 : iterable) {
                        CommandSenderWrapper jv_04 = (CommandSenderWrapper)t2;
                        boolean flag6 = false;
                        LiteBansModule_206 fW2 = new LiteBansModule_206(jv_04.i(), (LiteBansModule_82)object4, null, false, 0, 28, null).i();
                        MessageHandler messageHandler = fW2;
                        boolean flag7 = false;
                        if (!(!((LiteBansModule_206)messageHandler).e())) continue;
                        messageHandler = this;
                        flag7 = false;
                        MessageHandler fg_03 = messageHandler;
                        boolean flag8 = false;
                        if (fW2.m() < ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_31()) continue;
                        messageHandler = new CharSequence[]{"result", fW2.c()};
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(object4.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_3, jv_04), (CharSequence[])messageHandler));
                    }
                    object5 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler((Closeable)object3, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) break block9;
                throw sQLException;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"ipreport", "num", "result"};
    }

    }

