package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TemplatesYmlHandler {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private final File LiteBansModule_31;
    private final boolean c;
    private final ArrayList g;
    private List BaseCoreGenericHandler;
    private DatabaseService LiteBansModule_195;
        public TemplatesYmlHandler(@NotNull PlatformPlugin plugin, @NotNull File file, boolean flag) {
        this.AsyncBackgroundTask_5 = plugin;
        this.LiteBansModule_31 = file;
        this.c = flag;
        this.g = new ArrayList();
        this.plugin = new ArrayList();
    }

    public /* synthetic */ TemplatesYmlHandler(PlatformPlugin plugin, File file, boolean flag, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            File file2 = plugin.getDataFolder();
            String string = "templates.yml";
            file = new File(file2, string);
        }
        if ((n & 4) != 0) {
            flag = false;
        }
        this(plugin, file, flag);
    }

    public final PlatformPlugin c() {
        return this.AsyncBackgroundTask_5;
    }

    public final File LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final ArrayList AsyncBackgroundTask_5() {
        return this.g;
    }

    public final List e() {
        return this.plugin;
    }

    public final void BaseCoreGenericHandler(@NotNull List list) {
        this.plugin = list;
    }

    public final DatabaseService BaseCoreGenericHandler() {
        return this.LiteBansModule_195;
    }

    public final void BaseCoreGenericHandler(@Nullable DatabaseService gn_02) {
        this.LiteBansModule_195 = gn_02;
    }

    public final LiteBansModule_65 BaseCoreGenericHandler(@NotNull BanHandler a_2, @NotNull String string) {
        Object v0;
        block2: {
            Iterable iterable = this.g;
            Iterable iterable2 = iterable;
            Object targetObj = iterable2;
            Collection collection = new ArrayList();
            Iterator iterator = targetObj.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                LiteBansModule_65 c12 = (LiteBansModule_65)t2;
                if (!(c12.AsyncBackgroundTask_5() == a_2.c())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            flag = false;
            for (Object e : iterable) {
                targetObj = (LiteBansModule_65)e;
                if (!StringUtilities.BaseCoreGenericHandler(((LiteBansModule_65)targetObj).g(), string, true)) continue;
                v0 = e;
                break block2;
            }
            v0 = null;
        }
        return v0;
    }

    public final LiteBansModule_65 BaseCoreGenericHandler(@NotNull SilentHandler dZ2) {
        return this.plugin(dZ2.ServerSyncService(), dZ2.r() & 0xFF);
    }

    public final LiteBansModule_65 BaseCoreGenericHandler(@NotNull BanHandler a_2, byte by2) {
        Object v0;
        block2: {
            Iterable iterable = this.g;
            Iterable iterable2 = iterable;
            Object targetObj = iterable2;
            Collection collection = new ArrayList();
            Iterator iterator = targetObj.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                LiteBansModule_65 c12 = (LiteBansModule_65)t2;
                if (!(c12.AsyncBackgroundTask_5() == a_2.c())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            flag = false;
            for (Object e : iterable) {
                targetObj = (LiteBansModule_65)e;
                if (!(((LiteBansModule_65)targetObj).LiteBansModule_195() == by2)) continue;
                v0 = e;
                break block2;
            }
            v0 = null;
        }
        return v0;
    }

    public final LiteBansModule_65 BaseCoreGenericHandler(@NotNull BanHandler a_2, int n) {
        Object v0;
        block2: {
            Iterable iterable = this.g;
            Iterable iterable2 = iterable;
            Object targetObj = iterable2;
            Collection collection = new ArrayList();
            Iterator iterator = targetObj.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                LiteBansModule_65 c12 = (LiteBansModule_65)t2;
                if (!(c12.AsyncBackgroundTask_5() == a_2.c())) continue;
                collection.add(t2);
            }
            iterable = (List)collection;
            flag = false;
            for (Object e : iterable) {
                targetObj = (LiteBansModule_65)e;
                if (!((((LiteBansModule_65)targetObj).LiteBansModule_195() & 0xFF) == n)) continue;
                v0 = e;
                break block2;
            }
            v0 = null;
        }
        return v0;
    }

    public final LiteBansModule_175 BaseCoreGenericHandler(@NotNull BanHandler a_2, @NotNull LiteBansModule_65 c12) {
        Collection collection;
        block2: {
            Iterable iterable = this.plugin;
            Iterable iterable2 = iterable;
            Collection collection22 = new ArrayList();
            Iterator iterator = iterable2.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                LiteBansModule_175 eM2 = (LiteBansModule_175)t2;
                if (!(eM2.c() == a_2.c())) continue;
                collection22.add(t2);
            }
            iterable = (List)collection22;
            flag = false;
            for (Collection collection22 : iterable) {
                LiteBansModule_175 eM3 = (LiteBansModule_175)((Object)collection22);
                if (!eM3.e().containsKey(c12)) continue;
                collection = collection22;
                break block2;
            }
            collection = null;
        }
        return (LiteBansModule_175)((Object)collection);
    }

    public final List BaseCoreGenericHandler(@NotNull BanHandler a_2) {
        boolean flag;
        Iterable iterable = this.g;
        Iterable iterable2 = iterable;
        Iterable iterable3 = iterable2;
        Iterator iterator = new ArrayList();
        for (Object t2 : iterable3) {
            contextObj = (LiteBansModule_65)t2;
            flag = false;
            if (!(((LiteBansModule_65)contextObj).AsyncBackgroundTask_5() == a_2.c())) continue;
            iterator.add(t2);
        }
        iterable = (List)((Object)iterator);
        flag2 = false;
        iterable2 = iterable;
        Collection collection = new ArrayList();
        for (Object e : iterable2) {
            boolean flag6;
            block6: {
                targetObj = (LiteBansModule_65)e;
                contextObj = ((LiteBansModule_65)targetObj).LiteBansModule_241().LiteBansModule_31();
                flag = false;
                if (contextObj instanceof Collection && ((Collection)contextObj).isEmpty()) {
                    flag6 = false;
                } else {
                    Iterator iterator2 = contextObj.iterator();
                    while (iterator2.hasNext()) {
                        Object t3 = iterator2.next();
                        String string = (String)t3;
                        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string, (CharSequence)"--hide", false, 2, null)) continue;
                        flag6 = true;
                        break block6;
                    }
                    flag6 = false;
                }
            }
            if (!flag6) continue;
            collection.add(e);
        }
        iterable = (List)collection;
        flag2 = false;
        iterable2 = iterable;
        collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        flag5 = false;
        for (Object t4 : iterable2) {
            targetObj = (LiteBansModule_65)t4;
            Collection collection2 = collection;
            collection2.add(LiteBansModule_284.AsyncBackgroundTask_5(((LiteBansModule_65)targetObj).LiteBansModule_195()));
        }
        return (List)collection;
    }

    public final List BaseCoreGenericHandler(@NotNull LiteBansModule_392 kr_02, @Nullable String string) {
        List list = kr_02.g(string);
        if (list == null) {
            List list2;
            String string2 = kr_02.e(string);
            if (string2 != null) {
                char[] cArray = new char[]{' '};
                list2 = StringUtilities.BaseCoreGenericHandler((CharSequence)string2, cArray, false, 0, 6, null);
            } else {
                list2 = list = null;
            }
            if (list2 == null) {
                list = CollectionUtilities.e();
            }
        }
        return list;
    }

    public final void BaseCoreGenericHandler(@NotNull Exception exception) {
        if (this.c) {
            throw exception;
        }
        ConfigService configService = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
        configService.BaseCoreGenericHandler("templates", exception);
        if (configService.BaseCoreGenericHandler(1)) {
            configService.BaseCoreGenericHandler(exception);
        }
    }

    private static final void LiteBansModule_195() {
        e = new String[]{"templates.yml", "--hide", "templates.yml", "templates.yml", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", StringDecryptor.BaseCoreGenericHandler("\u00c9\u00ce\u0086\u008f\u009d\u00ce\u0087\u0080\u0098\u008f\u0082\u0087\u008a\u00ce\u009d\u008b\u008d\u009a\u0087\u0081\u0080\u00c0", 0x11EE00EE), "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes BaseCoreGenericHandler bad weight: ", "Loaded ", " template groups from templates.yml!", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes BaseCoreGenericHandler bad weight: ", "Loaded ", " template groups from templates.yml!", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes BaseCoreGenericHandler bad weight: ", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "templates"};
    }

    static {
        TemplatesYmlHandler.LiteBansModule_195();
    }
}

