package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BanListCommand
extends AbstractCommand
implements LiteBansModule_359 {
    public BanListCommand(@NotNull PlatformPlugin plugin) {
        super("banlist", plugin);
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return false;
    }

    @Override
    public CharSequence BaseCoreGenericHandler() {
        return "";
    }

    @Override
    public BanHandler BaseCoreGenericHandler() {
        return BanHandler.LiteBansModule_240;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
{
                        targetObj = (DatabaseMonitorService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch2 = targetObj.LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    double d10;
                    Object contextObj = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    MessageHandler messageHandler = this;
                    MessageHandler fg_03 = messageHandler;
                    double d11 = AllHandler_3.BaseCoreGenericHandler(ch3, (this.plugin()).BaseCoreGenericHandler(), null, ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_7(), 2, null);
                    fg_03 = this;
                    flag5 = false;
                    MessageHandler fg_04 = fg_03;
                    double d12 = ((ConfigService)fg_04.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_29();
                    double d13 = d10 = Math.floor(d11 / d12);
                    double d14 = LiteBansModule_389.BaseCoreGenericHandler(args, 0, d10);
                    d14 = Math.min(d10, d14);
                    if (d14 > 0.0 && d14 == d10 && (int)d11 % (int)d12 == 0) {
                        d14 += -1.0;
                        d13 += -1.0;
                    }
                    CommandArgumentUtils.BaseCoreGenericHandler(this, GeoIPLookupService.BaseCoreGenericHandler(GeoIPLookupService.BaseCoreGenericHandler(ch3.BaseCoreGenericHandler(MessageKey.LiteBansModule_35), (CharSequence)"page", (int)d14), (CharSequence)"total", (int)d13));
                    MessageHandler fg_05 = this;
                    Collection collection = ch3.BaseCoreGenericHandler(this.plugin(), (long)d14, (long)d12, ((ConfigService)fg_05.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_7());
                    LimitHandler.BaseCoreGenericHandler(this, ch3, collection, null, null, null, 0, 30, null);
                    contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (targetObj.LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    @Override
    public int BaseCoreGenericHandler(@NotNull PlatformPlugin plugin, @Nullable String[] args, @NotNull Collection collection, int n) {
        return LimitHandler.BaseCoreGenericHandler(this, plugin, args, collection, n);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull Collection collection, @Nullable LiteBansModule_297 iA2, @Nullable String[] args, @NotNull AbstractCommand abstractCommand, int n) {
        LimitHandler.BaseCoreGenericHandler(this, ch2, collection, iA2, args, abstractCommand, n);
    }

    @Override
    public LiteBansModule_297 BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull HashMap hashMap, @Nullable String string) {
        return LimitHandler.BaseCoreGenericHandler(this, ch2, hashMap, string);
    }

    private static final void LiteBansModule_31() {
        i = new String[]{"banlist", "", "page", "total"};
}

