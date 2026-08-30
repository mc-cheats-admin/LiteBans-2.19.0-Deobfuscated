package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.c9;
import litebans.cp_0;
import litebans.di_0;
import litebans.ec_0;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.il_0;
import litebans.ll;
import litebans.lr_0;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModDependency;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.jetbrains.annotations.NotNull;

public final class a6
implements ec_0 {
    private final di_0 a;
    private static /* synthetic */ String[] b;

    public a6(@NotNull di_0 di_02) {
        this.a = di_02;
    }

    @Override
    public di_0 c() {
        return this.a;
    }

    public ModContainer a(@NotNull String string) {
        Object v0;
        block1: {
            Iterable iterable = FabricLoader.getInstance().getAllMods();
            boolean bl = false;
            for (Object t2 : iterable) {
                ModContainer modContainer = (ModContainer)t2;
                boolean bl2 = false;
                if (!ew.a((Object)modContainer.getMetadata().getName(), (Object)string)) continue;
                v0 = t2;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    @Override
    public List b(@NotNull String string) {
        boolean bl;
        Collection collection;
        ModContainer modContainer;
        Iterable iterable = FabricLoader.getInstance().getAllMods();
        boolean bl2 = false;
        Iterable iterable2 = iterable;
        Collection collection2 = new ArrayList(ll.a(iterable, 10));
        boolean bl3 = false;
        for (Object t2 : iterable2) {
            modContainer = (ModContainer)t2;
            collection = collection2;
            bl = false;
            collection.add(modContainer.getMetadata());
        }
        iterable = (List)collection2;
        bl2 = false;
        iterable2 = iterable;
        collection2 = new ArrayList();
        bl3 = false;
        for (Object t2 : iterable2) {
            boolean bl4;
            block6: {
                modContainer = (ModMetadata)t2;
                bl = false;
                Iterable iterable3 = modContainer.getDependencies();
                boolean bl5 = false;
                if (iterable3 instanceof Collection && ((Collection)iterable3).isEmpty()) {
                    bl4 = false;
                } else {
                    for (Object t3 : iterable3) {
                        ModDependency modDependency = (ModDependency)t3;
                        boolean bl6 = false;
                        if (!ew.a((Object)modDependency.getModId(), (Object)string)) continue;
                        bl4 = true;
                        break block6;
                    }
                    bl4 = false;
                }
            }
            if (!bl4) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        bl2 = false;
        iterable2 = iterable;
        collection2 = new ArrayList(ll.a(iterable, 10));
        bl3 = false;
        for (Object t2 : iterable2) {
            modContainer = (ModMetadata)t2;
            collection = collection2;
            bl = false;
            collection.add(modContainer.getName());
        }
        return (List)collection2;
    }

    @Override
    public Collection a() {
        return ll.e();
    }

    @Override
    public String b() {
        return FabricLoader.getInstance().getModContainer("fabric-api").map(arg_0 -> a6.a(a6::a, arg_0)).orElse("null");
    }

    @Override
    public void a(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean bl, @NotNull String string2) {
        Object object2 = object;
        if (object2 instanceof lr_0) {
            ((lr_0)object).a(((Object)charSequence).toString());
        } else if (object2 instanceof c9) {
            ((c9)object).a(true);
        }
    }

    @Override
    public cp_0 a(@NotNull Object object, boolean bl) {
        if (!(object instanceof lr_0)) {
            throw new UnsupportedOperationException();
        }
        return ((lr_0)object).a();
    }

    public Void a(@NotNull Object object) {
        throw new UnsupportedOperationException();
    }

    public Void a(@NotNull Object object, @NotNull CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(@NotNull String string) {
        return il_0.a(this, string);
    }

    private static final String a(ModContainer modContainer) {
        return modContainer.getMetadata().getVersion().getFriendlyString();
    }

    private static final String a(eo_0 eo_02, Object object) {
        return (String)eo_02.a(object);
    }

    @Override
    public Object c(String string) {
        return this.a(string);
    }

    @Override
    public String a(Object object) {
        return (String)((Object)this.a(object));
    }

    @Override
    public void a(Object object, CharSequence charSequence) {
        this.a(object, charSequence);
    }

    private static final void a() {
        b = new String[]{"", "fabric-api", "null"};
    }

    static {
        a6.a();
    }
}

