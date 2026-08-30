package litebans;

import java.util.Objects;

public final class LiteBansModule_292 {
    private final long LiteBansModule_31;
    private final long BaseCoreGenericHandler;

    public LiteBansModule_292(long l3, long l5) {
        this.LiteBansModule_31 = l3;
        this.plugin = l5;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        LiteBansModule_292 i72 = (LiteBansModule_292)object;
        return this.LiteBansModule_31 == i72.LiteBansModule_31 && this.plugin == i72.BaseCoreGenericHandler;
    }

    public int hashCode() {
        return Objects.hash(this.LiteBansModule_31, this.plugin);
    }

    public String toString() {
        return "TarArchiveStructSparse{offset=" + this.LiteBansModule_31 + ", numbytes=" + this.plugin + '}';
    }

    public long BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public long LiteBansModule_31() {
        return this.plugin;
}

