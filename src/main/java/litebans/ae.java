package litebans;

import java.awt.Color;
import litebans.gq;
import litebans.ka_0;

public static final class ae {
    private gq e;
    private Color c;
    private String f;
    private Boolean a;
    private Boolean b;
    private Boolean h;
    private Boolean g;
    private Boolean d;

    public ae a(gq gq2) {
        this.e = gq2;
        return this;
    }

    public ae a(Color color) {
        this.c = color;
        return this;
    }

    public ae a(String string) {
        this.f = string;
        return this;
    }

    public ae c(Boolean bl) {
        this.a = bl;
        return this;
    }

    public ae a(Boolean bl) {
        this.b = bl;
        return this;
    }

    public ae e(Boolean bl) {
        this.h = bl;
        return this;
    }

    public ae b(Boolean bl) {
        this.g = bl;
        return this;
    }

    public ae d(Boolean bl) {
        this.d = bl;
        return this;
    }

    public ka_0 a() {
        return new ka_0(this.e, this.c, this.f, this.a, this.b, this.h, this.g, this.d);
    }
}

