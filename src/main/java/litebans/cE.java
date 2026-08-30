package litebans;

import java.util.Map;
import litebans.dZ;
import litebans.eo_0;
import litebans.ew;

public final class cE
implements eo_0 {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public cE(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public final Boolean a(Map.Entry entry) {
        return this.a != null && ew.a((Object)this.a, (Object)((dZ)entry.getValue()).w()) || this.b != null && ((CharSequence)this.b).length() > 0 && ew.a((Object)this.b, (Object)((dZ)entry.getValue()).p());
    }

    @Override
    public Object a(Object object) {
        return this.a((Map.Entry)object);
    }
}

