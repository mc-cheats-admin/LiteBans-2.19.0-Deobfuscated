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
    private String LiteBansModule_194;
    private final ConfigService BaseCoreGenericHandler;
    public DiscordWebhookClient_2(@NotNull PlatformPlugin plugin, @NotNull File file) {
        this.AsyncBackgroundTask_5 = plugin;
        this.c = file;
        this.e = new HashMap();
        this.LiteBansModule_194 = "";
        this.plugin = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
    }

    public /* synthetic */ DiscordWebhookClient_2(PlatformPlugin plugin, File file, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            File file2 = plugin.getDataFolder();
            String string = "webhooks.yml";
            boolean flag = false;
            file = new File(file2, string);
        }
        this(plugin, file);
    }

    public final String BaseCoreGenericHandler(@NotNull String string) {
        String string2 = this.e.getOrDefault(string, "").toString();
        DiscordWebhookClient_2 h72 = this;
        boolean flag = false;
        ConfigService configService = h72.BaseCoreGenericHandler;
        int n = 1;
        boolean flag2 = false;
        if (configService.BaseCoreGenericHandler(n)) {
            ConfigService q_03 = configService;
            boolean flag3 = false;
            q_03.BaseCoreGenericHandler((Object)("Fetch webhook: " + string + " => '" + string2 + '\''));
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"on") || ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"true") || ((CharSequence)string2).length() == 0 ? this.LiteBansModule_194 : (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"off") || ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"false") ? "" : string2);
    }

    public final DiscordWebhookClient_2 BaseCoreGenericHandler() {
        DiscordWebhookClient_2 h72;
        DiscordWebhookClient_2 h73 = h72 = this;
        boolean flag = false;
        DatabaseService gn_02 = null;
        try {
            Object object;
            boolean flag2;
            Iterable<String> iterable;
            Object[] objectArray;
            boolean flag3;
            BanHandler a_2;
            boolean flag4;
            Object object2;
            this.AsyncBackgroundTask_5.BaseCoreGenericHandler("webhooks.yml");
            gn_02 = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(this.c).g();
            gn_02.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("webhooks.yml", null));
            String string = gn_02.BaseCoreGenericHandler("default_webhook", "");
            CharSequence charSequence = string;
            this.LiteBansModule_194 = charSequence == null || charSequence.length() == 0 ? this.plugin.LiteBansModule_194().aO() : string;
            this.e.clear();
            Object object322 = BanHandler.LiteBansModule_401;
            boolean flag5 = false;
            Iterable iterable2 = ((TempHandler)object322).BaseCoreGenericHandler();
            boolean flag6 = false;
            Iterable iterable3 = iterable2;
            Collection collection = new ArrayList();
            boolean flag7 = false;
            for (Object t2 : iterable3) {
                List list;
                object2 = (BanHandler)t2;
                flag4 = false;
                a_2 = object2;
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
                boolean flag8 = false;
                objectArray = iterable4;
                iterable = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable4, 10));
                flag2 = false;
                for (Object t3 : objectArray) {
                    object = t3;
                    Collection collection2 = iterable;
                    boolean bl9 = false;
                    collection2.add(object.toString());
                }
                object2 = (List)iterable;
                CollectionUtilities.BaseCoreGenericHandler(collection, (Iterable)object2);
            }
            iterable2 = ((TempHandler)object322).BaseCoreGenericHandler();
            Collection collection3 = (List)collection;
            flag6 = false;
            iterable3 = iterable2;
            collection = new ArrayList();
            flag7 = false;
            for (Object t2 : iterable3) {
                Object object4;
                List list;
                object2 = (BanHandler)t2;
                flag4 = false;
                a_2 = object2;
                flag3 = false;
                objectArray = a_2;
                boolean bl10 = false;
                switch (litebans.LiteBansModule_31.BaseCoreGenericHandler[objectArray.ordinal()]) {
                    case 1: {
                        list = CollectionUtilities.BaseCoreGenericHandler(objectArray.c());
                        break;
                    }
                    case 2: {
                        object4 = new Object[]{objectArray.c(), "un" + objectArray.c()};
                        list = CollectionUtilities.LiteBansModule_31((Object[])object4);
                        break;
                    }
                    default: {
                        object4 = new Object[]{objectArray.c(), "temp_" + objectArray.c(), "temp_ip" + objectArray.c(), "ip" + objectArray.c(), "un" + objectArray.c()};
                        list = CollectionUtilities.LiteBansModule_31((Object[])object4);
                    }
                }
                iterable = list;
                flag2 = false;
                object4 = iterable;
                Iterator iterator = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
                boolean bl11 = false;
                object = object4.iterator();
                while (object.hasNext()) {
                    Object e;
                    Object e10 = e = object.next();
                    Iterator iterator2 = iterator;
                    boolean bl12 = false;
                    iterator2.add(e10.toString());
                }
                objectArray = (List)((Object)iterator);
                bl10 = false;
                object4 = objectArray;
                iterable = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)objectArray, 10));
                flag2 = false;
                iterator = object4.iterator();
                while (iterator.hasNext()) {
                    Object t4 = iterator.next();
                    object = (String)t4;
                    Iterable<String> iterable5 = iterable;
                    boolean bl13 = false;
                    iterable5.add("silent_" + (String)object);
                }
                object2 = (List)iterable;
                CollectionUtilities.BaseCoreGenericHandler(collection, (Iterable)object2);
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
        Object object = gn_02.BaseCoreGenericHandler(string, (Object)string2);
        if (object instanceof Boolean) {
            if (((Boolean)object).booleanValue()) {
                return "on";
            }
            return "off";
        }
        if (object instanceof String) {
            return (String)object;
        }
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    }

