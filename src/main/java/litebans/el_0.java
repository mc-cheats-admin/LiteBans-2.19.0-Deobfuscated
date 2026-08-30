package litebans;

import java.util.zip.ZipException;
import litebans.dq_0;
import litebans.fl_0;
import litebans.kw_0;

public class el_0
extends ZipException {
    private final fl_0 a;
    private final transient kw_0 c;
    private static final long b = 20161219L;

    public el_0(fl_0 fl_02, kw_0 kw_02) {
        super("Unsupported feature " + fl_02 + " used in entry " + kw_02.getName());
        this.a = fl_02;
        this.c = kw_02;
    }

    public el_0(dq_0 dq_02, kw_0 kw_02) {
        super("Unsupported compression method " + kw_02.getMethod() + " (" + dq_02.name() + ") used in entry " + kw_02.getName());
        this.a = fl_0.c;
        this.c = kw_02;
    }
}

