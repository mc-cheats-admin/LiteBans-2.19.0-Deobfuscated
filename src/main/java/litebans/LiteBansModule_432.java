package litebans;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
public abstract class LiteBansModule_432 {
    LiteBansModule_432 BaseCoreGenericHandler;
    private LiteBansModule_368 g = new LiteBansModule_368();
    private String LiteBansModule_240;
    private List LiteBansModule_194;
    private LiteBansModule_377 AsyncBackgroundTask_5;
    private ActionHandler c;
    private transient boolean LiteBansModule_31;
    @Deprecated
    public LiteBansModule_432() {
    }

    LiteBansModule_432(LiteBansModule_432 v_02) {
        this.plugin(v_02, NoneHandler_4.LiteBansModule_194, true);
        if (v_02.CommandThrottleService() != null) {
            for (LiteBansModule_432 v_03 : v_02.CommandThrottleService()) {
                this.plugin(v_03.PunishmentTableService());
}

    public void BaseCoreGenericHandler(LiteBansModule_432 v_02, NoneHandler_4 io_02, boolean flag) {
        if (io_02 == NoneHandler_4.AsyncBackgroundTask_5 || io_02 == NoneHandler_4.LiteBansModule_194) {
            if (flag || this.AsyncBackgroundTask_5 == null) {
                this.plugin(v_02.LiteBansModule_194());
            }
            if (flag || this.c == null) {
                this.plugin(v_02.LiteBansModule_240());
}
        if (io_02 == NoneHandler_4.e || io_02 == NoneHandler_4.LiteBansModule_194) {
            if (flag || !this.g.LiteBansModule_240()) {
                this.plugin(v_02.Utf8Handler_2());
            }
            if (flag || !this.g.m()) {
                this.plugin(v_02.AsyncBackgroundTask_22());
            }
            if (flag || !this.g.r()) {
                this.plugin(v_02.q());
            }
            if (flag || this.g.q() == null) {
                this.AsyncBackgroundTask_5(v_02.LiteBansModule_401());
            }
            if (flag || this.g.Utf8Handler_2() == null) {
                this.c(v_02.BroadcastService());
            }
            if (flag || this.g.e() == null) {
                this.LiteBansModule_31(v_02.i());
            }
            if (flag || this.g.i() == null) {
                this.e(v_02.AsyncBackgroundTask_5());
            }
            if (flag || this.g.n() == null) {
                this.plugin(v_02.m());
            }
            if (flag || this.LiteBansModule_240 == null) {
                this.LiteBansModule_31(v_02.AsyncBackgroundTask_21());
}

    public abstract LiteBansModule_432 PunishmentTableService();

    public static String BaseCoreGenericHandler(LiteBansModule_432[] v_0Array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (LiteBansModule_432 v_02 : v_0Array) {
            stringBuilder.append(v_02.BaseCoreGenericHandler());
        }
        return stringBuilder.toString();
    }

    public void BaseCoreGenericHandler(LiteBansType gq2) {
        this.g.BaseCoreGenericHandler(gq2);
    }

    public LiteBansType ServerSyncService() {
        if (!this.g.LiteBansModule_240()) {
            if (this.plugin == null) {
                return LiteBansType.LiteBansModule_433;
            }
            return this.plugin.ServerSyncService();
        }
        return this.g.AsyncBackgroundTask_5();
    }

    public LiteBansType Utf8Handler_2() {
        return this.g.AsyncBackgroundTask_5();
    }

    public void BaseCoreGenericHandler(Color color) {
        this.g.BaseCoreGenericHandler(color);
    }

    public Color AsyncBackgroundTask_22() {
        return this.g.c();
    }

    public void BaseCoreGenericHandler(String string) {
        this.g.BaseCoreGenericHandler(string);
    }

    public String q() {
        return this.g.g();
    }

    public void AsyncBackgroundTask_5(Boolean flag) {
        this.g.LiteBansModule_31(flag);
    }

    public boolean e() {
        if (this.g.q() == null) {
            return this.plugin != null && this.plugin.e();
        }
        return this.g.BroadcastService();
    }

    public Boolean LiteBansModule_401() {
        return this.g.q();
    }

    public void c(Boolean flag) {
        this.g.AsyncBackgroundTask_5(flag);
    }

    public boolean GnuSparseMapHandler() {
        if (this.g.Utf8Handler_2() == null) {
            return this.plugin != null && this.plugin.GnuSparseMapHandler();
        }
        return this.g.GnuSparseMapHandler();
    }

    public Boolean BroadcastService() {
        return this.g.Utf8Handler_2();
    }

    public void LiteBansModule_31(Boolean flag) {
        this.g.c(flag);
    }

    public boolean g() {
        if (this.g.e() == null) {
            return this.plugin != null && this.plugin.g();
        }
        return this.g.LiteBansModule_401();
    }

    public Boolean i() {
        return this.g.e();
    }

    public void e(Boolean flag) {
        this.g.e(flag);
    }

    public boolean r() {
        if (this.g.i() == null) {
            return this.plugin != null && this.plugin.r();
        }
        return this.g.PunishmentTableService();
    }

    public Boolean AsyncBackgroundTask_5() {
        return this.g.i();
    }

    public void BaseCoreGenericHandler(Boolean flag) {
        this.g.BaseCoreGenericHandler(flag);
    }

    public boolean n() {
        if (this.g.n() == null) {
            return this.plugin != null && this.plugin.n();
        }
        return this.g.BaseCoreGenericHandler();
    }

    public Boolean m() {
        return this.g.n();
    }

    public void BaseCoreGenericHandler(LiteBansModule_368 ka_02) {
        if (ka_02.LiteBansModule_240()) {
            this.plugin(ka_02.AsyncBackgroundTask_5());
        }
        if (ka_02.m()) {
            this.plugin(ka_02.c());
        }
        if (ka_02.r()) {
            this.plugin(ka_02.g());
        }
        if (ka_02.q() != null) {
            this.AsyncBackgroundTask_5(ka_02.q());
        }
        if (ka_02.Utf8Handler_2() != null) {
            this.c(ka_02.Utf8Handler_2());
        }
        if (ka_02.e() != null) {
            this.LiteBansModule_31(ka_02.e());
        }
        if (ka_02.i() != null) {
            this.e(ka_02.i());
        }
        if (ka_02.n() != null) {
            this.plugin(ka_02.n());
}

    public void BaseCoreGenericHandler(List list) {
        for (LiteBansModule_432 v_02 : list) {
            v_02.BaseCoreGenericHandler = this;
        }
        this.LiteBansModule_194 = list;
    }

    public void BaseCoreGenericHandler(LiteBansModule_432 v_02) {
        if (this.LiteBansModule_194 == null) {
            this.LiteBansModule_194 = new ArrayList();
        }
        v_02.BaseCoreGenericHandler = this;
        this.LiteBansModule_194.add(v_02);
    }

    public String BaseCoreGenericHandler() {
        StringBuilder stringBuilder = new StringBuilder();
        this.plugin(stringBuilder);
        return stringBuilder.toString();
    }

    void BaseCoreGenericHandler(StringBuilder stringBuilder) {
        if (this.LiteBansModule_194 != null) {
            for (LiteBansModule_432 v_02 : this.LiteBansModule_194) {
                v_02.BaseCoreGenericHandler(stringBuilder);
}

    void LiteBansModule_31(StringBuilder stringBuilder) {
        stringBuilder.append(this.ServerSyncService());
        if (this.e()) {
            stringBuilder.append(LiteBansType.AsyncBackgroundTask_22);
        }
        if (this.GnuSparseMapHandler()) {
            stringBuilder.append(LiteBansType.Utf8Handler_2);
        }
        if (this.g()) {
            stringBuilder.append(LiteBansType.A);
        }
        if (this.r()) {
            stringBuilder.append(LiteBansType.c);
        }
        if (this.n()) {
            stringBuilder.append(LiteBansType.LiteBansModule_31);
}

    public void LiteBansModule_31(String string) {
        this.LiteBansModule_240 = string;
    }

    public void BaseCoreGenericHandler(LiteBansModule_377 kf_02) {
        this.AsyncBackgroundTask_5 = kf_02;
    }

    public void BaseCoreGenericHandler(ActionHandler eu_02) {
        this.c = eu_02;
    }

    public void BaseCoreGenericHandler(boolean flag) {
        this.LiteBansModule_31 = flag;
    }

    public String toString() {
        return "BaseComponent(style=" + this.LiteBansModule_31() + ", insertion=" + this.AsyncBackgroundTask_21() + ", extra=" + this.CommandThrottleService() + ", clickEvent=" + this.LiteBansModule_194() + ", hoverEvent=" + this.LiteBansModule_240() + ", reset=" + this.DatabaseMonitorService() + ")";
    }

    public boolean equals(Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_432)) {
            return false;
        }
        LiteBansModule_432 v_02 = (LiteBansModule_432)targetObj;
        if (!v_02.BaseCoreGenericHandler(this)) {
            return false;
        }
        LiteBansModule_368 ka_02 = this.LiteBansModule_31();
        LiteBansModule_368 ka_03 = v_02.LiteBansModule_31();
        if (ka_02 == null ? ka_03 != null : !(ka_02).equals(ka_03)) {
            return false;
        }
        String string = this.AsyncBackgroundTask_21();
        String string2 = v_02.AsyncBackgroundTask_21();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        List list = this.CommandThrottleService();
        List list2 = v_02.CommandThrottleService();
        if (list == null ? list2 != null : !(list).equals(list2)) {
            return false;
        }
        LiteBansModule_377 kf_02 = this.LiteBansModule_194();
        LiteBansModule_377 kf_03 = v_02.LiteBansModule_194();
        if (kf_02 == null ? kf_03 != null : !(kf_02).equals(kf_03)) {
            return false;
        }
        ActionHandler eu_02 = this.LiteBansModule_240();
        ActionHandler eu_03 = v_02.LiteBansModule_240();
        return !(eu_02 == null ? eu_03 != null : !(eu_02).equals(eu_03));
    }

    protected boolean BaseCoreGenericHandler(Object targetObj) {
        return targetObj instanceof LiteBansModule_432;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        LiteBansModule_368 ka_02 = this.LiteBansModule_31();
        n2 = n2 * 59 + (ka_02 == null ? 43 : (ka_02).hashCode());
        String string = this.AsyncBackgroundTask_21();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        List list = this.CommandThrottleService();
        n2 = n2 * 59 + (list == null ? 43 : (list).hashCode());
        LiteBansModule_377 kf_02 = this.LiteBansModule_194();
        n2 = n2 * 59 + (kf_02 == null ? 43 : (kf_02).hashCode());
        ActionHandler eu_02 = this.LiteBansModule_240();
        n2 = n2 * 59 + (eu_02 == null ? 43 : (eu_02).hashCode());
        return n2;
    }

    public LiteBansModule_368 LiteBansModule_31() {
        return this.g;
    }

    public String AsyncBackgroundTask_21() {
        return this.LiteBansModule_240;
    }

    public List CommandThrottleService() {
        return this.LiteBansModule_194;
    }

    public LiteBansModule_377 LiteBansModule_194() {
        return this.AsyncBackgroundTask_5;
    }

    public ActionHandler LiteBansModule_240() {
        return this.c;
    }

    public boolean DatabaseMonitorService() {
        return this.LiteBansModule_31;
    }

    private static final void c() {
        e = new String[]{"BaseComponent(style=", ", insertion=", ", extra=", ", clickEvent=", ", hoverEvent=", ", reset=", ")"};
}

