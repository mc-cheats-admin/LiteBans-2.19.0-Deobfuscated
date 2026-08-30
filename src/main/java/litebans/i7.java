package litebans;

import java.util.Objects;

public static final class i7 {
    private final long b;
    private final long a;

    public i7(long l3, long l5) {
        this.b = l3;
        this.a = l5;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        i7 i72 = (i7)object;
        return this.b == i72.b && this.a == i72.a;
    }

    public int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public String toString() {
        return "TarArchiveStructSparse{offset=" + this.b + ", numbytes=" + this.a + '}';
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }
}

