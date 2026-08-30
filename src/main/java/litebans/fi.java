package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import litebans.a8;
import litebans.am;
import litebans.as;
import litebans.di_0;
import litebans.eq_0;
import litebans.fB;
import litebans.fg_0;
import litebans.gG;
import litebans.hl;
import litebans.jG;
import litebans.jv_0;
import litebans.ll;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fi
extends fB {
    private static /* synthetic */ String[] i;

    public fi(@NotNull di_0 di_02) {
        super("lockdown", di_02);
    }

    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        Object object;
        ArrayList arrayList = ll.c(Arrays.copyOf(stringArray, stringArray.length));
        Object object2 = this;
        boolean bl = false;
        object2 = jG.a(eq_0.f, jv_02, arrayList, ((w)((fg_0)object2).h().a(w.class)).u(), false, 8, null);
        Object object3 = "local";
        Object object4 = this;
        boolean bl2 = false;
        object4 = ((w)((fg_0)object4).h().a(w.class)).u();
        bl2 = false;
        CharSequence charSequence = ((eq_0)object2).a();
        String string = charSequence == null || charSequence.length() == 0 ? eq_0.f.a((String)object3, (String)object4, jv_02) : ((eq_0)object2).a();
        String string2 = (String)ll.a((List)arrayList, 0);
        if (string2 == null || (string2 = ((String)(object = string2)).toLowerCase(Locale.ENGLISH)) == null) {
            fg_0.a.a(am.cG);
            throw new as();
        }
        object2 = string2;
        if (arrayList.size() == 1 && a8.a(object3 = new String[]{"stop", "end", "finish", "off", "disable"}).contains(object2)) {
            object = this;
            boolean bl3 = false;
            Object object5 = ((o)((fg_0)object).h().a(o.class)).e();
            if (object5 == null || (object5 = ((gG)object5).c()) == null) {
                fg_0.a.a(am.c);
                throw new as();
            }
            object3 = object5;
            object4 = this;
            boolean bl4 = false;
            object4 = (q_0)((fg_0)object4).h().a(q_0.class);
            bl4 = false;
            if (((q_0)object4).g()) {
                ((q_0)object4).a(object3);
            }
            object4 = this;
            bl4 = false;
            ((o)((fg_0)object4).h().a(o.class)).a(string, null, true);
            return;
        }
        object3 = am.a(ll.a(arrayList, " ", null, null, 0, null, null, 62, null), true);
        object4 = this;
        boolean bl5 = false;
        ((o)((fg_0)object4).h().a(o.class)).a(string, (CharSequence)object3, true);
    }

    private static final void a() {
        i = new String[]{"lockdown", "local", "stop", "end", "finish", "off", "disable", " "};
    }

    static {
        fi.a();
    }
}

