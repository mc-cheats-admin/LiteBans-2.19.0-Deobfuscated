package litebans;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_174 {
    private final String c;
    private final BanHandler LiteBansModule_31;
    private final Map BaseCoreGenericHandler;
    private final Map AsyncBackgroundTask_5;
    private final List g;
    private final long LiteBansModule_194;
    public LiteBansModule_174(@NotNull String string, @NotNull BanHandler a_2, @NotNull Map map, @NotNull Map map2, @NotNull List list, long l3) {
        this.c = string;
        this.LiteBansModule_31 = a_2;
        this.plugin = map;
        this.AsyncBackgroundTask_5 = map2;
        this.g = list;
        this.LiteBansModule_194 = l3;
    }

    public final String BaseCoreGenericHandler() {
        return this.c;
    }

    public final BanHandler c() {
        return this.LiteBansModule_31;
    }

    public final Map e() {
        return this.plugin;
    }

    public final Map LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    public final List LiteBansModule_194() {
        return this.g;
    }

    public final long AsyncBackgroundTask_5() {
        return this.LiteBansModule_194;
    }

    public final LiteBansModule_66 BaseCoreGenericHandler(int n) {
        return n >= this.g.size() ? (LiteBansModule_66)CollectionUtilities.BaseCoreGenericHandler(this.g) : (n < 0 ? (LiteBansModule_66)CollectionUtilities.LiteBansModule_31(this.g) : (LiteBansModule_66)this.g.get(n));
    }

    public String toString() {
        return "TemplateGroup(name=" + this.c + ", type=" + this.LiteBansModule_31 + ", weights=" + this.plugin + ", templates=" + this.AsyncBackgroundTask_5 + ", ladder=" + this.g + ", ladderExpiry=" + this.LiteBansModule_194 + ')';
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.LiteBansModule_31.hashCode();
        n = n * 31 + ((Object)this.plugin).hashCode();
        n = n * 31 + ((Object)this.AsyncBackgroundTask_5).hashCode();
        n = n * 31 + ((Object)this.g).hashCode();
        n = n * 31 + Long.hashCode(this.LiteBansModule_194);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_174)) {
            return false;
        }
        LiteBansModule_174 eM2 = (LiteBansModule_174)object;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.c, (Object)eM2.c)) {
            return false;
        }
        if (this.LiteBansModule_31 != eM2.LiteBansModule_31) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.plugin, eM2.BaseCoreGenericHandler)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.AsyncBackgroundTask_5, eM2.AsyncBackgroundTask_5)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.g, eM2.g)) {
            return false;
        }
        return this.LiteBansModule_194 == eM2.LiteBansModule_194;
    }

    private static final void g() {
        e = new String[]{"TemplateGroup(name=", ", type=", ", weights=", ", templates=", ", ladder=", ", ladderExpiry="};
}

