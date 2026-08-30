package litebans;

import litebans.am;
import litebans.jT;
import litebans.kc_0;
import litebans.q_0;

public static final class j5
extends ThreadLocal {
    final /* synthetic */ q_0 a;

    j5(q_0 q_02) {
        this.a = q_02;
    }

    protected jT a() {
        return kc_0.a(am.a0.toString(), q_0.a(this.a, am.a0, null, 2, null));
    }

    public Object initialValue() {
        return this.a();
    }
}

