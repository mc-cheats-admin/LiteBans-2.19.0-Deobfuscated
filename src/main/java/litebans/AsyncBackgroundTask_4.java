package litebans;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;
public final class AsyncBackgroundTask_4
implements Runnable {
    final /* synthetic */ ConfigService LiteBansModule_31;
    final /* synthetic */ File AsyncBackgroundTask_5;
    final /* synthetic */ DiscordWebhookClient BaseCoreGenericHandler;
    public AsyncBackgroundTask_4(ConfigService configService, File file, DiscordWebhookClient eG2) {
        this.LiteBansModule_31 = configService;
        this.AsyncBackgroundTask_5 = file;
        this.plugin = eG2;
    }

    @Override
    public final void run() {
        try {
            Logger logger = this.LiteBansModule_31.BaseCoreGenericHandler.getLogger();
            String[] args = this.AsyncBackgroundTask_5;
            DiscordWebhookClient eG2 = this.plugin;
            ConfigService configService = this.LiteBansModule_31;
            Logger logger2 = logger;
            File[] fileArray = args.listFiles();
            String string = "GeoLite2-Country.mmdb";
            String[] filteredArgs = args;
            File file = new File((File)filteredArgs, string);
            if (fileArray == null || fileArray.length < eG2.g().length + 1 || !file.exists()) {
                logger2.info("Downloading GeoIP API.. + ");
                for (String string2 : eG2.g()) {
                    CharSequence charSequence = string2;
                    Object object = new NativepatternHandler(":(?!(//))");
                    int n2 = 2;
                    List list = ((NativepatternHandler)object).BaseCoreGenericHandler(charSequence, n2);
                    charSequence = (String)list.get(0);
                    object = (String)CollectionUtilities.BaseCoreGenericHandler(list, 1);
                    if (ObjectUtilities.BaseCoreGenericHandler(object, (Object)"d4f611abd54f725c67ade1983e5637140fac151dbbbe223ce894b7100d2a090c")) {
                        object = "81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb";
                    }
                    String string3 = args.getAbsolutePath() + File.separator + ((String)charSequence).substring(StringUtilities.LiteBansModule_31(charSequence, '/', 0, false, 6, null) + 1);
                    MariaDBDriverHandler.BaseCoreGenericHandler(ConfigService.GnuSparseMapHandler, string3, (String)charSequence, null, null, 12, null);
                    File file2 = new File(string3);
                    String string4 = ConfigService.GnuSparseMapHandler.LiteBansModule_31(LiteBansModule_373.BaseCoreGenericHandler(file2));
                    if (object == null || ObjectUtilities.BaseCoreGenericHandler((Object)string4, object)) continue;
                    file2.delete();
                    throw new LiteBansException_9(file2, (String)object, string4);
                }
                if (!file.exists()) {
                    logger2.info("Downloading GeoIP database (" + string + ").. + ");
                    if (StringUtilities.BaseCoreGenericHandler((CharSequence)eG2.Utf8Handler_2(), (CharSequence)"YOUR_LICENSE_KEY", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)eG2.Utf8Handler_2(), (CharSequence)"/geolite + ", false, 2, null)) {
                        logger2.warning("GeoIP download URL has not yet been ");
                        logger2.warning("https://gitlab.com/ruany/LiteBans/-/wikis/GeoIP#geoip-download-issue");
                        return;
}
                MariaDBDriverHandler.BaseCoreGenericHandler(ConfigService.GnuSparseMapHandler, file.getAbsolutePath(), eG2.Utf8Handler_2(), string, null, 8, null);
            }
            configService.BaseCoreGenericHandler(new GeoIPLookupService_2(configService.BaseCoreGenericHandler, (File)args, file));
        }
        catch (Exception exception) {
            this.LiteBansModule_31.BaseCoreGenericHandler(exception);
}

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"GeoLite2-Country.mmdb", "Downloading GeoIP API.. + ", ":(?!(//))", "d4f611abd54f725c67ade1983e5637140fac151dbbbe223ce894b7100d2a090c", "81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb", "Downloading GeoIP database (", ").. + ", "YOUR_LICENSE_KEY", "/geolite + ", "GeoIP download URL has not yet been ", "https://gitlab.com/ruany/LiteBans/-/wikis/GeoIP#geoip-download-issue"};
}

