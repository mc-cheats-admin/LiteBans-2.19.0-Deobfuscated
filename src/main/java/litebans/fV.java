package litebans;

import java.util.Iterator;
import java.util.List;
import litebans.am;
import litebans.bF;
import litebans.bz;
import litebans.ch;
import litebans.cz;
import litebans.dZ;
import litebans.di_0;
import litebans.eM;
import litebans.et;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gn_0;
import litebans.hl;
import litebans.jv_0;
import litebans.kR;
import litebans.kk;
import litebans.ll;
import litebans.lo_0;
import litebans.q_0;
import litebans.v;
import org.jetbrains.annotations.NotNull;

public abstract class fV
extends fB {
    private static /* synthetic */ String[] i;

    public fV(@NotNull String string, @NotNull di_0 di_02) {
        super(string, di_02);
    }

    public final void a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull cz cz2) {
        cz cz3 = cz2;
        boolean bl = false;
        if (!cz3.E()) {
            return;
        }
        v v2 = (v)ch2.e().a(v.class);
        List list = ll.e();
        if (cz3.i() != null) {
            if (cz3.m()) {
                eM eM2 = cz3.i();
                ew.a(eM2);
                list = eM2.a(cz3.D()).d();
            }
        } else {
            list = cz3.g().a(cz3.D()).d();
            if (list.isEmpty()) {
                list = cz3.g().h().d();
            }
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            boolean bl2 = false;
            if (bz.b(string, "console:", false, 2, null)) {
                bl2 = true;
                string2 = bz.a(string2, "console:", null, 2, null);
            }
            if (bz.a((CharSequence)string2, '/', false, 2, null)) {
                string2 = string2.substring(1);
            }
            char[] cArray = new char[]{' '};
            String string3 = (String)ll.b(bz.a((CharSequence)string2, cArray, false, 0, 6, null));
            boolean bl3 = this.a(string3);
            if (bl2 && !bz.a((CharSequence)string2, (CharSequence)"--sender", false, 2, null) && bl3) {
                string2 = string2 + " --sender-uuid=" + cz3.a().a() + " --sender=" + cz3.a().i();
            }
            if (bl3) {
                string2 = string2 + " --stack=" + (cz2.r() + 1);
            }
            string2 = ((Object)kR.a(ch2, kR.a(ch2, (CharSequence)string2, dZ2, false, 2, null), cz3.t(), false, 2, null)).toString();
            string2 = bF.a(ch2, (CharSequence)string2, cz2);
            fV fV2 = this;
            ch ch3 = ch2;
            ew.a(v2);
            v v3 = v2;
            boolean bl4 = false;
            Object object = fV2;
            boolean bl5 = false;
            ((q_0)((fg_0)object).h().a(q_0.class)).a(10, (Object)string2);
            Object object2 = object = bl2 ? ch3.e().y() : fV2.d();
            if (object.e()) {
                v3.b((byte)3, object.a());
            }
            ch3.e().c(new kk((jv_0)object, string2));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean a(String string) {
        if (ew.a((Object)string, (Object)"ban")) return true;
        if (ew.a((Object)string, (Object)"kick")) return true;
        et et2 = fB.d;
        boolean bl = false;
        Object[] objectArray = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
        if (!lo_0.b(objectArray, string)) return false;
        return true;
    }

    public final void a(@NotNull cz cz2) {
        fg_0 fg_02 = this;
        boolean bl = false;
        gn_0 gn_02 = ((q_0)fg_02.h().a(q_0.class)).z().c();
        if ((gn_02 != null ? gn_02.b() : null) != null) {
            fo_0.a(fg_0.a, cz2.a(), am.bs, null, 4, null);
        }
        fg_0 fg_03 = this;
        boolean bl2 = false;
        if (((q_0)fg_03.h().a(q_0.class)).s().a() == null) {
            fo_0.a(fg_0.a, cz2.a(), am.aV, null, 4, null);
        }
    }

    private static final void a() {
        i = new String[]{"console:", "console:", "--sender", " --sender-uuid=", " --sender=", " --stack=", "ban", "kick", "mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
    }

    static {
        fV.a();
    }
}

