package litebans;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import litebans.FabricPlugin;
import litebans.ai_0;
import litebans.cI;
import litebans.cp_0;
import litebans.cr_0;
import litebans.cy_0;
import litebans.di_0;
import litebans.eg_0;
import litebans.ew;
import litebans.g8;
import litebans.gG;
import litebans.h8;
import litebans.hb_0;
import litebans.hl;
import litebans.hu;
import litebans.ie;
import litebans.lr_0;
import litebans.o;
import litebans.p_0;
import litebans.q_0;
import litebans.w;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_3248;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.T
 */
@ai_0(a=3)
public static final class t_0
extends p_0
implements h8 {
    private static /* synthetic */ String[] b;

    public t_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        this.a.r();
    }

    @Override
    public boolean d() {
        return this.a.t() == 3 && hb_0.a(b[0]);
    }

    @Override
    public void e() {
    }

    @Override
    public void a() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.a();
        t_0 t_02 = this;
        boolean bl = false;
        di_0 di_02 = t_02.a;
        ew.b(di_02, b[1]);
        cr_0 cr_02 = ((FabricPlugin)di_02).g();
        if (!t_02.a.a(b[2], new hu(t_02, cr_02)) && !t_02.a.a(b[3], new cI(t_02, cr_02))) {
            di_0 di_03 = t_02.a;
            ew.a(cr_02);
            new ie(di_03, cr_02).c();
        }
        if (q_02.f().p()) {
            new cy_0(this.a).a();
        }
    }

    public final void b(@NotNull class_3248 class_32482, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @NotNull cp_0 cp_02, @NotNull class_2535 class_25352) {
        o o2 = (o)this.a.a(o.class);
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        w w2 = (w)this.a.a(w.class);
        di_0 di_02 = this.a;
        ew.b(di_02, b[7]);
        FabricPlugin fabricPlugin = (FabricPlugin)di_02;
        lr_0 lr_02 = new lr_0(cp_02, class_32482, null, 4, null);
        loginSynchronizer.waitFor((Future)CompletableFuture.runAsync(() -> t_0.a(q_02, o2, lr_02, fabricPlugin, class_32482, cp_02, w2)));
    }

    public void a(@Nullable class_3248 class_32482, @Nullable ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @Nullable cp_0 cp_02, @Nullable class_2535 class_25352) {
        class_3248 class_32483 = class_32482;
        ew.a(class_32483);
        ServerLoginNetworking.LoginSynchronizer loginSynchronizer2 = loginSynchronizer;
        ew.a(loginSynchronizer2);
        cp_0 cp_03 = cp_02;
        ew.a(cp_03);
        class_2535 class_25353 = class_25352;
        ew.a(class_25353);
        this.b(class_32483, loginSynchronizer2, cp_03, class_25353);
    }

    private static final void a(q_0 q_02, o o2, lr_0 lr_02, FabricPlugin fabricPlugin, class_3248 class_32482, cp_0 cp_02, w w2) {
        Object object = q_02;
        boolean bl = false;
        if (object.g()) {
            q_0 q_03 = object;
            boolean bl2 = false;
            q_03.a((Object)(b[8] + cp_02));
        }
        o2.c().b(lr_02);
        object = null;
        object = g8.a;
        if (fabricPlugin.b() < 770) {
            object = g8.c;
        }
        if (lr_02.c() != null) {
            Object object2 = fabricPlugin.g().d().b(eg_0.a(lr_02.c(), (g8)((Object)object)));
            ew.b(object2, b[9]);
            class_2561 class_25612 = (class_2561)object2;
            class_32482.method_14380(class_25612);
        } else {
            gG gG2;
            gG gG3 = o2.e();
            if (gG3 == null) {
                return;
            }
            gG gG4 = gG2 = gG3;
            boolean bl3 = false;
            if (gG4.c() != null && fabricPlugin.d() && !((Boolean)Permissions.check((UUID)UUID.fromString(cp_02.g()), (String)b[10]).get()).booleanValue()) {
                String string = gG2.a(w2.u(), false);
                Object object3 = fabricPlugin.g().d().b(eg_0.a(string, (g8)((Object)object)));
                ew.b(object3, b[11]);
                class_2561 class_25613 = (class_2561)object3;
                class_32482.method_14380(class_25613);
            }
        }
    }

    @Override
    public void a(Object object, Object object2, Object object3, Object object4) {
        this.a((class_3248)object, (ServerLoginNetworking.LoginSynchronizer)object2, (cp_0)object3, (class_2535)object4);
    }

    private static final void d() {
        b = new String[]{hl.a("\u5081\u508a\u509b\u50c1\u5082\u5086\u5081\u508a\u508c\u509d\u508e\u5089\u509b\u50c1\u508c\u5083\u508e\u509c\u509c\u50b0\u50dc\u50dd\u50db\u50d7", -749907729), hl.a("", -1746363449), hl.a("\ub91f\ub914\ub905\ub95f\ub917\ub910\ub913\ub903\ub918\ub912\ub91c\ub912\ub95f\ub917\ub910\ub913\ub903\ub918\ub912\ub95f\ub918\ub91c\ub901\ub91d\ub95f\ub916\ub910\ub91c\ub914\ub903\ub904\ub91d\ub914\ub95f\ub903\ub901\ub912\ub95f\ub937\ub910\ub913\ub903\ub918\ub912\ub925\ub908\ub901\ub914\ub915\ub923\ub904\ub91d\ub914", 1856551281), hl.a("\ucec3\ucec8\uced9\uce83\ucecb\ucecc\ucecf\ucedf\ucec4\ucece\ucec0\ucece\uce83\ucecb\ucecc\ucecf\ucedf\ucec4\ucece\uce83\ucecc\ucedd\ucec4\uce83\ucec3\ucec8\uced9\uceda\ucec2\ucedf\ucec6\ucec4\ucec3\uceca\uce83\ucedb\uce9c\uce83\ucee1\ucec2\uceca\ucec4\ucec3\ucefd\ucecc\ucece\ucec6\ucec8\uced9\ucefe\ucec8\ucec3\ucec9\ucec8\ucedf", 446484141), hl.a("", -1677767542), hl.a("\u7c5f\u7c54\u7c45\u7c1f\u7c57\u7c50\u7c53\u7c43\u7c58\u7c52\u7c5c\u7c52\u7c1f\u7c57\u7c50\u7c53\u7c43\u7c58\u7c52\u7c1f\u7c58\u7c5c\u7c41\u7c5d\u7c1f\u7c56\u7c50\u7c5c\u7c54\u7c43\u7c44\u7c5d\u7c54\u7c1f\u7c43\u7c41\u7c52\u7c1f\u7c77\u7c50\u7c53\u7c43\u7c58\u7c52\u7c65\u7c48\u7c41\u7c54\u7c55\u7c63\u7c44\u7c5d\u7c54", 2086501425), hl.a("\u3422\u3429\u3438\u3462\u342a\u342d\u342e\u343e\u3425\u342f\u3421\u342f\u3462\u342a\u342d\u342e\u343e\u3425\u342f\u3462\u342d\u343c\u3425\u3462\u3422\u3429\u3438\u343b\u3423\u343e\u3427\u3425\u3422\u342b\u3462\u343a\u347d\u3462\u3400\u3423\u342b\u3425\u3422\u341c\u342d\u342f\u3427\u3429\u3438\u341f\u3429\u3422\u3428\u3429\u343e", 1391146060), hl.a("", 1208265784), hl.a("\u113f\u111c\u1114\u111a\u111d\u1153", -533589645), hl.a("", -362801194), hl.a("\u38c6\u38c3\u38de\u38cf\u38c8\u38cb\u38c4\u38d9\u3884\u38c6\u38c5\u38c9\u38c1\u38ce\u38c5\u38dd\u38c4\u3884\u38c8\u38d3\u38da\u38cb\u38d9\u38d9", -1573242710), hl.a("", -867628605)};
    }

    static {
        t_0.d();
    }
}

