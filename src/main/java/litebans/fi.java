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

public static final class fi
extends fB {
    private static /* synthetic */ String[] i;

    public fi(@NotNull di_0 di_02) {
        super(i[0], di_02);
    }

    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        Object object;
        ArrayList arrayList = ll.c(Arrays.copyOf(stringArray, stringArray.length));
        Object object2 = this;
        boolean bl = false;
        object2 = jG.a(eq_0.f, jv_02, arrayList, ((w)((fg_0)object2).h().a(w.class)).u(), false, 8, null);
        Object object3 = i[1];
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
        if (arrayList.size() == 1 && a8.a(object3 = new String[]{i[2], i[3], i[4], i[5], i[6]}).contains(object2)) {
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
        object3 = am.a(ll.a(arrayList, i[7], null, null, 0, null, null, 62, null), true);
        object4 = this;
        boolean bl5 = false;
        ((o)((fg_0)object4).h().a(o.class)).a(string, (CharSequence)object3, true);
    }

    private static final void a() {
        i = new String[]{hl.a("\uddf9\uddfa\uddf6\uddfe\uddf1\uddfa\udde2\uddfb", 1606278549), hl.a("\u56a4\u56a7\u56ab\u56a9\u56a4", 1543722696), hl.a("\ue5a5\ue5a2\ue5b9\ue5a6", 453699030), hl.a("\uba7e\uba75\uba7f", -2076263909), hl.a("\ua0a4\ua0ab\ua0ac\ua0ab\ua0b1\ua0aa", 1695785154), hl.a("\ud968\ud961\ud961", -998778617), hl.a("\ub937\ub93a\ub920\ub932\ub931\ub93f\ub936", 1705294163), hl.a("\uce01", 434884129)};
    }

    static {
        fi.a();
    }
}

