package litebans;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import litebans.hd;
import litebans.la_0;
import net.minecraft.class_2561;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.cF
 */
static class cf_0
implements hd {
    final /* synthetic */ la_0 a;

    cf_0(la_0 la_02) {
        this.a = la_02;
    }

    public class_2561 b(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public class_2561 a(CharSequence charSequence) {
        return class_2561.class_2562.method_10872((JsonElement)JsonParser.parseString((String)charSequence.toString()));
    }

    @Override
    public Object b(CharSequence charSequence) {
        return this.a(charSequence);
    }

    @Override
    public Object a(CharSequence charSequence) {
        return this.b(charSequence);
    }
}

