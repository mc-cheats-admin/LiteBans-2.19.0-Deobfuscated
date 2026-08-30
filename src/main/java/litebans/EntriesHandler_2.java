package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

static final class EntriesHandler_2
extends LiteBansModule_230
implements LiteBansModule_372,
Serializable {
    private final Enum[] e;
    public EntriesHandler_2(@NotNull Enum[] enumArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)enumArray, "entries");
        this.e = enumArray;
    }

    @Override
    public int BaseCoreGenericHandler() {
        return this.e.length;
    }

    public Enum BaseCoreGenericHandler(int n) {
        LiteBansModule_230.LiteBansModule_31.BaseCoreGenericHandler(n, this.e.length);
        return this.e[n];
    }

    public boolean c(@NotNull Enum enum_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)enum_, "element");
        Enum enum_2 = (Enum)ArrayUtilities.BaseCoreGenericHandler((Object[])this.e, enum_.ordinal());
        return enum_2 == enum_;
    }

    public int LiteBansModule_31(@NotNull Enum enum_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)enum_, "element");
        int n = enum_.ordinal();
        Enum enum_2 = (Enum)ArrayUtilities.BaseCoreGenericHandler((Object[])this.e, n);
        return enum_2 == enum_ ? n : -1;
    }

    public int BaseCoreGenericHandler(@NotNull Enum enum_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)enum_, "element");
        return this.indexOf(enum_);
    }

    private final Object AsyncBackgroundTask_5() {
        return new EntriesHandler(this.e);
    }

    @Override
    public Object get(int n) {
        return this.plugin(n);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Enum)) {
            return false;
        }
        return this.c((Enum)object);
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Enum)) {
            return -1;
        }
        return this.LiteBansModule_31((Enum)object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Enum)) {
            return -1;
        }
        return this.plugin((Enum)object);
}

