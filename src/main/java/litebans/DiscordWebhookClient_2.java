package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class DiscordWebhookClient_2 {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private final File c;
    private final HashMap e;
    private String LiteBansModule_195;
    private final ConfigService BaseCoreGenericHandler;
        public DiscordWebhookClient_2(@NotNull PlatformPlugin plugin, @NotNull File file) {
        this.AsyncBackgroundTask_5 = plugin;
        this.c = file;
        this.e = new HashMap();
        this.LiteBansModule_195 = "";
        this.plugin = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
    }

    public /* synthetic */ DiscordWebhookClient_2(PlatformPlugin plugin, File file, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            File file2 = plugin.getDataFolder();
            String string = "webhooks.yml";
            file = new File(file2, string);
        }
        this(plugin, file);
    }

    public final String BaseCoreGenericHandler(@NotNull String string) {
        String string2 = this.e.getOrDefault(string, "").toString();
        DiscordWebhookClient_2 h72 = this;
        ConfigService configService = h72.BaseCoreGenericHandler;
        int n = 1;
        if (configService.BaseCoreGenericHandler(n)) {
            ConfigService q_03 = configService;
            q_03.BaseCoreGenericHandler((Object)("Fetch webhook: " + string + " => '" + string2 + '\''));
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"on") || ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"true") || ((CharSequence)string2).length() == 0 ? this.LiteBansModule_195 : (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"off") || ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"false") ? "" : string2);
    }

    public final DiscordWebhookClient_2 BaseCoreGenericHandler() {
        DiscordWebhookClient_2 h72;
        DiscordWebhookClient_2 h73 = h72 = this;
        DatabaseService gn_02 = null;
        try {
            boolean flag2;
            Iterable<String> iterable;
            Object[] objectArray;
            boolean flag3;
            BanHandler a_2;
            boolean flag4;
            this.AsyncBackgroundTask_5.BaseCoreGenericHandler("webhooks.yml");
            gn_02 = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(this.c).g();
            gn_02.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("webhooks.yml", null));
            String string = gn_02.BaseCoreGenericHandler("default_webhook", "");
            CharSequence charSequence = string;
            this.LiteBansModule_195 = charSequence == null || charSequence.length() == 0 ? this.plugin.LiteBansModule_195().aO() : string;
            this.e.clear();
            Object object322 = BanHandler.LiteBansModule_403;
            Iterable iterable2 = ((TempHandler)object322).BaseCoreGenericHandler();
            Iterable iterable3 = iterable2;
            Collection collection = new ArrayList();
            for (Object t2 : iterable3) {
                List list;
                contextObj = (BanHandler)t2;
                flag4 = false;
                a_2 = contextObj;
                flag3 = false;
                switch (litebans.LiteBansModule_31.BaseCoreGenericHandler[a_2.ordinal()]) {
                    case 1: {
                        list = CollectionUtilities.BaseCoreGenericHandler(a_2.c());
                        break;
                    }
                    case 2: {
                        objectArray = new Object[]{a_2.c(), "un" + a_2.c()};
                        list = CollectionUtilities.LiteBansModule_31(objectArray);
                        break;
                    }
                    default: {
                        objectArray = new Object[]{a_2.c(), "temp_" + a_2.c(), "temp_ip" + a_2.c(), "ip" + a_2.c(), "un" + a_2.c()};
                        list = CollectionUtilities.LiteBansModule_31(objectArray);
                    }
                }
                Iterable iterable4 = list;
                objectArray = iterable4;
                iterable = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable4, 10));
                flag2 = false;
                for (Object t3 : objectArray) {
                    targetObj = t3;
                    Collection collection2 = iterable;
                    collection2.add(targetObj.toString());
                }
                contextObj = (List)iterable;
                CollectionUtilities.BaseCoreGenericHandler(collection, (Iterable)contextObj);
            }
            iterable2 = ((TempHandler)object322).BaseCoreGenericHandler();
            Collection collection3 = (List)collection;
            flag6 = false;
            iterable3 = iterable2;
            collection = new ArrayList();
            flag7 = false;
            for (Object t2 : iterable3) {
                List list;
                contextObj = (BanHandler)t2;
                flag4 = false;
                a_2 = contextObj;
                flag3 = false;
                objectArray = a_2;
                switch (litebans.LiteBansModule_31.BaseCoreGenericHandler[objectArray.ordinal()]) {
                    case 1: {
                        list = CollectionUtilities.BaseCoreGenericHandler(objectArray.c());
                        break;
                    }
                    case 2: {
                        helperObj = new Object[]{objectArray.c(), "un" + objectArray.c()};
                        list = CollectionUtilities.LiteBansModule_31((Object[])helperObj);
                        break;
                    }
                    default: {
                        helperObj = new Object[]{objectArray.c(), "temp_" + objectArray.c(), "temp_ip" + objectArray.c(), "ip" + objectArray.c(), "un" + objectArray.c()};
                        list = CollectionUtilities.LiteBansModule_31((Object[])helperObj);
                    }
                }
                iterable = list;
                flag2 = false;
                helperObj = iterable;
                Iterator iterator = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
                targetObj = helperObj.iterator();
                while (targetObj.hasNext()) {
                    Object e;
                    Object e10 = e = targetObj.next();
                    Iterator iterator2 = iterator;
                    iterator2.add(e10.toString());
                }
                objectArray = (List)((Object)iterator);
                bl10 = false;
                helperObj = objectArray;
                iterable = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)objectArray, 10));
                flag2 = false;
                iterator = helperObj.iterator();
                while (iterator.hasNext()) {
                    Object t4 = iterator.next();
                    targetObj = (String)t4;
                    Iterable<String> iterable5 = iterable;
                    iterable5.add("silent_" + (String)targetObj);
                }
                contextObj = (List)iterable;
                CollectionUtilities.BaseCoreGenericHandler(collection, (Iterable)contextObj);
            }
            for (Object object322 : (Iterable)CollectionUtilities.BaseCoreGenericHandler(collection3, (Iterable)((List)collection))) {
                ((Map)this.e).put(object322, this.plugin(gn_02, "" + (String)object322, ""));
            }
            ((Map)this.e).put("alts", this.plugin(gn_02, "webhooks.alts", "off"));
        }
        catch (Exception exception) {
            this.plugin.BaseCoreGenericHandler("webhooks", exception);
        }
        return h72;
    }

    private final String BaseCoreGenericHandler(DatabaseService gn_02, String string, String string2) {
        Object targetObj = gn_02.BaseCoreGenericHandler(string, (Object)string2);
        if (targetObj instanceof Boolean) {
            if (((Boolean)targetObj).booleanValue()) {
                return "on";
            }
            return "off";
        }
        if (targetObj instanceof String) {
            return (String)targetObj;
        }
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"", "webhooks.yml", "", "Fetch webhook: ", " => '", "on", "true", "off", "false", "", "webhooks.yml", "webhooks.yml", "default_webhook", "", "un", "temp_", "temp_ip", "ip", "un", "un", "temp_", "temp_ip", "ip", "un", "silent_", "", "", "alts", "webhooks.alts", "off", "webhooks", "on", "off", "Fetch webhook: ", " => '"};
    }

    static {
        DiscordWebhookClient_2.LiteBansModule_31();
    }
}

