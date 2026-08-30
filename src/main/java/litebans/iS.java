package litebans;

import java.util.ArrayList;
import java.util.List;
import litebans.am;
import litebans.ch;
import litebans.eo_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gG;
import litebans.h1;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.q_0;

public final class iS
implements eo_0 {
    final /* synthetic */ gG a;
    final /* synthetic */ jv_0 c;
    private static /* synthetic */ String[] b;

    public iS(gG gG2, jv_0 jv_02) {
        this.a = gG2;
        this.c = jv_02;
    }

    public final void a(ch ch2) {
        CharSequence charSequence;
        Object object;
        CharSequence charSequence2 = null;
        if (this.a.c() != null) {
            object = new CharSequence[]{"serverScope", this.a.a(), "reason", this.a.c()};
            charSequence = h1.a((CharSequence)am.bV, (CharSequence[])object);
        } else {
            charSequence = am.X;
        }
        charSequence2 = charSequence;
        object = this.c;
        ew.a(object);
        charSequence2 = ch2.b(charSequence2, (jv_0)object);
        object = ch2.e().q();
        gG gG2 = this.a;
        boolean bl = false;
        CharSequence[] object2 = object;
        Object object3 = new ArrayList();
        boolean bl2 = false;
        for (CharSequence charSequence3 : object2) {
            jv_0 jv_02 = (jv_0)((Object)charSequence3);
            boolean bl3 = false;
            String string = jv_02.h();
            if (string == null) {
                fg_0 fg_02 = gG2;
                boolean bl4 = false;
                fg_0 fg_03 = fg_02;
                boolean bl5 = false;
                string = ((q_0)fg_03.h().a(q_0.class)).f().aw();
            }
            if (!eq_0.f.a(string, gG2.a())) continue;
            object3.add(charSequence3);
        }
        object = (List)object3;
        boolean bl6 = false;
        Object object4 = object.iterator();
        while (object4.hasNext()) {
            Object t2 = object4.next();
            object3 = (jv_0)t2;
            bl2 = false;
            ew.a(object3);
            Object object5 = object3;
            CharSequence charSequence4 = charSequence2;
            boolean bl7 = false;
            fo_0.a(fg_0.a, (jv_0)object5, charSequence4, null, 4, null);
        }
        object = this.a;
        bl6 = false;
        object4 = object;
        boolean bl8 = false;
        if (((q_0)((fg_0)object4).h().a(q_0.class)).f().aJ()) {
            if (ch2.e().t() == 3) {
                ch2.e().getLogger().info(((Object)charSequence2).toString());
            } else {
                object = ch2.e().y();
                CharSequence charSequence5 = charSequence2;
                boolean bl9 = false;
                fo_0.a(fg_0.a, (jv_0)object, charSequence5, null, 4, null);
            }
        }
    }

    @Override
    public Object a(Object object) {
        this.a((ch)object);
        return iv_0.a;
    }

    private static final void a() {
        b = new String[]{"serverScope", "reason"};
    }

    static {
        iS.a();
    }
}

