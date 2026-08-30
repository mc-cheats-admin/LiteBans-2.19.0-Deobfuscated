package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BanListCommand
extends AbstractCommand
implements LiteBansModule_361 {
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
        return BanHandler.LiteBansModule_241;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block8: {
                        targetObj = (DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)targetObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    double d10;
                    Object contextObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    MessageHandler messageHandler = this;
                    MessageHandler fg_03 = messageHandler;
                    double d11 = AllHandler_3.BaseCoreGenericHandler(ch3, ((BanHandler)this.plugin()).BaseCoreGenericHandler(), null, ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_7(), 2, null);
                    fg_03 = this;
                    flag5 = false;
                    MessageHandler fg_04 = fg_03;
                    double d12 = ((ConfigService)fg_04.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_29();
                    double d13 = d10 = Math.floor(d11 / d12);
                    double d14 = LiteBansModule_391.BaseCoreGenericHandler(args, 0, d10);
                    d14 = Math.min(d10, d14);
                    if (d14 > 0.0 && d14 == d10 && (int)d11 % (int)d12 == 0) {
                        d14 += -1.0;
                        d13 += -1.0;
                    }
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler(ch3.BaseCoreGenericHandler(MessageKey.LiteBansModule_35), (CharSequence)"page", (int)d14), (CharSequence)"total", (int)d13));
                    MessageHandler fg_05 = this;
                    Collection collection = ch3.BaseCoreGenericHandler((BanHandler)this.plugin(), (long)d14, (long)d12, ((ConfigService)fg_05.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_7());
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
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)targetObj).LiteBansModule_31(sQLException)) break block8;
                throw sQLException;
            }
        }
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

    private static final void LiteBansModule_31() {
        i = new String[]{"banlist", "", "page", "total"};
    }

    static {
        BanListCommand.LiteBansModule_31();
    }
}

