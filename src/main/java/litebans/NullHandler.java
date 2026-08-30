package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModDependency;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.jetbrains.annotations.NotNull;

public final class NullHandler
implements LiteBansModule_158 {
    private final PlatformPlugin BaseCoreGenericHandler;
    public NullHandler(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public PlatformPlugin c() {
        return this.plugin;
    }

    public ModContainer BaseCoreGenericHandler(@NotNull String string) {
        Object v0;
{
            Iterable iterable = FabricLoader.getInstance().getAllMods();
            for (Object t2 : iterable) {
                ModContainer modContainer = (ModContainer)t2;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)modContainer.getMetadata().getName(), (Object)string)) continue;
                v0 = t2;
                break;
}
        return v0;
    }

    @Override
    public List LiteBansModule_31(@NotNull String string) {
        boolean flag;
        Collection collection;
        ModContainer modContainer;
        Iterable iterable = FabricLoader.getInstance().getAllMods();
        Iterable iterable2 = iterable;
        Collection collection2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        for (Object t2 : iterable2) {
            modContainer = (ModContainer)t2;
            collection = collection2;
            flag = false;
            collection.add(modContainer.getMetadata());
        }
        iterable = (List)collection2;
        flag2 = false;
        iterable2 = iterable;
        collection2 = new ArrayList();
        flag3 = false;
        for (Object t2 : iterable2) {
            boolean flag4;
{
                modContainer = (ModMetadata)t2;
                flag = false;
                Iterable iterable3 = modContainer.getDependencies();
                if (iterable3 instanceof Collection && ((Collection)iterable3).isEmpty()) {
                    flag4 = false;
                } else {
                    for (Object t3 : iterable3) {
                        ModDependency modDependency = (ModDependency)t3;
                        if (!ObjectUtilities.BaseCoreGenericHandler((Object)modDependency.getModId(), (Object)string)) continue;
                        flag4 = true;
                        break;
                    }
                    flag4 = false;
}
            if (!flag4) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        flag2 = false;
        iterable2 = iterable;
        collection2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        flag3 = false;
        for (Object t2 : iterable2) {
            modContainer = (ModMetadata)t2;
            collection = collection2;
            flag = false;
            collection.add(modContainer.getName());
        }
        return (List)collection2;
    }

    @Override
    public Collection BaseCoreGenericHandler() {
        return CollectionUtilities.e();
    }

    @Override
    public String LiteBansModule_31() {
        return FabricLoader.getInstance().getModContainer("fabric-api").map(arg_0 -> NullHandler.BaseCoreGenericHandler(NullHandler::BaseCoreGenericHandler, arg_0)).orElse("null");
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean flag, @NotNull String string2) {
        Object object2 = object;
        if (object2 instanceof LiteBansModule_422) {
            ((LiteBansModule_422)object).BaseCoreGenericHandler(((Object)charSequence).toString());
        } else if (object2 instanceof LiteBansModule_70) {
            ((LiteBansModule_70)object).BaseCoreGenericHandler(true);
}

    @Override
    public LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object object, boolean flag) {
        if (!(object instanceof LiteBansModule_422)) {
            throw new UnsupportedOperationException();
        }
        return ((LiteBansModule_422)object).BaseCoreGenericHandler();
    }

    public Void BaseCoreGenericHandler(@NotNull Object object) {
        throw new UnsupportedOperationException();
    }

    public Void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull String string) {
        return KickBannedHandler.BaseCoreGenericHandler(this, string);
    }

    private static final String BaseCoreGenericHandler(ModContainer modContainer) {
        return modContainer.getMetadata().getVersion().getFriendlyString();
    }

    private static final String BaseCoreGenericHandler(LiteBansModule_178 eo_02, Object object) {
        return (String)eo_02.BaseCoreGenericHandler(object);
    }

    @Override
    public Object c(String string) {
        return this.plugin(string);
    }

    @Override
    public String BaseCoreGenericHandler(Object object) {
        return (String)((Object)this.plugin(object));
    }

    @Override
    public void BaseCoreGenericHandler(Object object, CharSequence charSequence) {
        this.plugin(object, charSequence);
}

