package litebans;

import litebans.bk_0;
import litebans.c9;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.f8;
import litebans.jv_0;
import litebans.p;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.minecraft.class_2168;
import net.minecraft.class_2556;
import net.minecraft.class_3222;
import net.minecraft.class_7471;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.cY
 */
public static final class cy_0
implements bk_0 {
    private final di_0 a;
    private final p b;

    public cy_0(@NotNull di_0 di_02) {
        this.a = di_02;
        this.b = (p)this.a.a(p.class);
    }

    public final di_0 b() {
        return this.a;
    }

    @Override
    public cy_0 a() {
        cy_0 cy_02;
        cy_0 cy_03 = cy_02 = this;
        boolean bl = false;
        ServerMessageEvents.ALLOW_CHAT_MESSAGE.register(cy_03::a);
        ServerMessageEvents.ALLOW_COMMAND_MESSAGE.register(cy_03::a);
        return cy_02;
    }

    public final boolean a(@NotNull class_7471 class_74712, @NotNull class_3222 class_32222, @NotNull class_2556.class_7602 class_76022) {
        jv_0 jv_02 = this.a.a(class_32222);
        String string = class_74712.method_46291().getString();
        c9 c92 = new c9(class_74712, false, 2, null);
        f8 f82 = this.b.a();
        ew.a((Object)string);
        ew.a(jv_02);
        f82.a((Object)c92, string, jv_02, true);
        return !c92.a();
    }

    public final boolean a(@NotNull class_7471 class_74712, @NotNull class_2168 class_21682, @NotNull class_2556.class_7602 class_76022) {
        jv_0 jv_02 = this.a.a(class_21682);
        String string = class_74712.method_46291().getString();
        c9 c92 = new c9(class_74712, false, 2, null);
        f8 f82 = this.b.a();
        ew.a((Object)string);
        ew.a(jv_02);
        f8.a(f82, c92, string, jv_02, false, 8, null);
        return !c92.a();
    }

    @Override
    public em_0 a() {
        return this.a();
    }
}

