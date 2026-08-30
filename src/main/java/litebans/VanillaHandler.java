package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;

public final class VanillaHandler
extends BansHandler {
    private final File n = new File("banned-players.json");
    private final DateFormat m = new SimpleDateFormat("yyyy-MM-LiteBansModule_118 HH:mm:ss NullHandler_8");
    public VanillaHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "vanilla", null, 0, 0L, 28, null);
    }

    @Override
    public boolean LiteBansModule_401() {
        return false;
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || StringUtilities.BaseCoreGenericHandler(string, (CharSequence)"banned-players", false, 2, null) || StringUtilities.BaseCoreGenericHandler(string, (CharSequence)"essentials", false, 2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        Object targetObj = this.n;
        Object contextObj = LiteBansModule_344.LiteBansModule_31;
        int n = 8192;
        Object resultObj = targetObj;
        BufferedReader bufferedReader = (resultObj = (Reader)new InputStreamReader((InputStream)new FileInputStreamthis, (Charset)contextObj)) instanceof BufferedReader ? (BufferedReader)resultObj : new BufferedReader((Reader)resultObj, n);
        targetObj = bufferedReader;
        contextObj = null;
        try {
            Object helperObj = (BufferedReader)targetObj;
            String string2 = CollectionUtilities.BaseCoreGenericHandler(ActionHandler_2.BaseCoreGenericHandler((Reader)bufferedReader), null, null, null, 0, null, null, 63, null);
            Object tempObj = NullHandler_5.BaseCoreGenericHandler(string2);
            ObjectUtilities.LiteBansModule_31(tempObj, "");
            NullHandler_7 ks_02 = (NullHandler_7)tempObj;
            this.plugin(ks_02, ch2);
            helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable) {
            contextObj = throwable;
            throw throwable;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler((Closeable)targetObj, (Throwable)contextObj);
}

    private final void BaseCoreGenericHandler(NullHandler_7 ks_02, LiteBansModule_82 ch2) {
        NullHandler_3 gr_02 = null;
        String string = "";
        for (Object e : ks_02) {
            try {
                String string2;
                ObjectUtilities.LiteBansModule_31(e, "");
                gr_02 = (NullHandler_3)e;
                String string3 = (String)gr_02.get("name");
                String string4 = (String)gr_02.get("uuid");
                Date date = this.m.parse((String)gr_02.get("created"));
                long l3 = date.getTime();
                if ((String)gr_02.get("source") == null) continue;
                string = BlackHandler.BaseCoreGenericHandler(string2);
                long l5 = 0L;
                String string5 = (String)gr_02.get("expires");
                l5 = ObjectUtilities.BaseCoreGenericHandler(string5, (Object)"forever") ? 0L : this.m.parse(string5).getTime();
                String string6 = (String)gr_02.get("reason");
                if (string6 == null) {
                    string6 = "";
                }
                String string7 = string6;
                SilentHandler dZ2 = new SilentHandler(BanHandler.LiteBansModule_240, string4, null, string7, this.LiteBansModule_31(string), string, "*", null, l3, l5, 0, false, false, false, 0L, 31744, null);
                if (AllHandler_3.BaseCoreGenericHandler(ch2, string4, null, null, false, false, 30, null) == null) {
                    ch2.c(dZ2);
                    this.g().incrementAndGet();
                } else {
                    this.m().warning("Ignoring duplicate ban for " + dZ2.DatabaseMonitorService());
                }
                if (string3 == null || string4 == null) continue;
                new LiteBansModule_221(this.LiteBansModule_240(), string3, string4, null).run();
            }
            catch (Exception exception) {
                this.plugin(this.Utf8Handler_2(), string, gr_02, exception);
}

    private final void BaseCoreGenericHandler(String string, String string2, NullHandler_3 gr_02, Exception exception) {
        this.LiteBansModule_240().getLogger().warning("Failed to import ban for " + string + " (created LiteBansModule_61 " + string2 + "). JSON data:");
        NullHandler_3 gr_03 = gr_02;
        this.LiteBansModule_240().getLogger().warning(gr_03 != null ? gr_03.BaseCoreGenericHandler() : null);
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
    }

    private static final void BaseCoreGenericHandler() {
        BroadcastService = new String[]{"vanilla", "banned-players.json", "yyyy-MM-LiteBansModule_118 HH:mm:ss NullHandler_8", "banned-players", "essentials", "", "", "", "name", "uuid", "created", "source", "expires", "forever", "reason", "", "*", "Ignoring duplicate ban for ", "Failed to import ban for ", " (created LiteBansModule_61 ", "). JSON data:"};
}

