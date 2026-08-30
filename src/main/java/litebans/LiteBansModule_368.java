package litebans;

import java.awt.Color;
public final class LiteBansModule_368
implements Cloneable {
    private LiteBansType LiteBansModule_194;
    private Color g;
    private String AsyncBackgroundTask_5;
    private Boolean BaseCoreGenericHandler;
    private Boolean e;
    private Boolean LiteBansModule_240;
    private Boolean LiteBansModule_31;
    private Boolean c;

    public LiteBansType AsyncBackgroundTask_5() {
        return this.LiteBansModule_194;
    }

    public boolean LiteBansModule_240() {
        return this.LiteBansModule_194 != null;
    }

    public Color c() {
        return this.g;
    }

    public boolean m() {
        return this.g != null;
    }

    public String g() {
        return this.AsyncBackgroundTask_5;
    }

    public boolean r() {
        return this.AsyncBackgroundTask_5 != null;
    }

    public boolean BroadcastService() {
        return this.plugin != null && this.plugin != false;
    }

    public Boolean q() {
        return this.plugin;
    }

    public boolean GnuSparseMapHandler() {
        return this.e != null && this.e != false;
    }

    public Boolean Utf8Handler_2() {
        return this.e;
    }

    public boolean LiteBansModule_401() {
        return this.LiteBansModule_240 != null && this.LiteBansModule_240 != false;
    }

    public Boolean e() {
        return this.LiteBansModule_240;
    }

    public boolean PunishmentTableService() {
        return this.LiteBansModule_31 != null && this.LiteBansModule_31 != false;
    }

    public Boolean i() {
        return this.LiteBansModule_31;
    }

    public boolean BaseCoreGenericHandler() {
        return this.c != null && this.c != false;
    }

    public Boolean n() {
        return this.c;
    }

    public LiteBansModule_368 LiteBansModule_194() {
        return new LiteBansModule_368(this.LiteBansModule_194, this.g, this.AsyncBackgroundTask_5, this.plugin, this.e, this.LiteBansModule_240, this.LiteBansModule_31, this.c);
    }

    public static LiteBansModule_10 LiteBansModule_31() {
        return new LiteBansModule_10();
    }

    public void BaseCoreGenericHandler(LiteBansType gq2) {
        this.LiteBansModule_194 = gq2;
    }

    public void BaseCoreGenericHandler(Color color) {
        this.g = color;
    }

    public void BaseCoreGenericHandler(String string) {
        this.AsyncBackgroundTask_5 = string;
    }

    public void LiteBansModule_31(Boolean flag) {
        this.plugin = flag;
    }

    public void AsyncBackgroundTask_5(Boolean flag) {
        this.e = flag;
    }

    public void c(Boolean flag) {
        this.LiteBansModule_240 = flag;
    }

    public void e(Boolean flag) {
        this.LiteBansModule_31 = flag;
    }

    public void BaseCoreGenericHandler(Boolean flag) {
        this.c = flag;
    }

    public LiteBansModule_368(LiteBansType gq2, Color color, String string, Boolean flag, Boolean flag2, Boolean flag3, Boolean flag4, Boolean flag5) {
        this.LiteBansModule_194 = gq2;
        this.g = color;
        this.AsyncBackgroundTask_5 = string;
        this.plugin = flag;
        this.e = flag2;
        this.LiteBansModule_240 = flag3;
        this.LiteBansModule_31 = flag4;
        this.c = flag5;
    }

    public LiteBansModule_368() {
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof LiteBansModule_368)) {
            return false;
        }
        LiteBansModule_368 ka_02 = (LiteBansModule_368)object;
        Boolean flag = this.plugin;
        Boolean flag2 = ka_02.BaseCoreGenericHandler;
        if (flag == null ? flag2 != null : !((Object)flag).equals(flag2)) {
            return false;
        }
        Boolean flag3 = this.e;
        Boolean flag4 = ka_02.e;
        if (flag3 == null ? flag4 != null : !((Object)flag3).equals(flag4)) {
            return false;
        }
        Boolean flag5 = this.LiteBansModule_240;
        Boolean flag6 = ka_02.LiteBansModule_240;
        if (flag5 == null ? flag6 != null : !((Object)flag5).equals(flag6)) {
            return false;
        }
        Boolean flag7 = this.LiteBansModule_31;
        Boolean flag8 = ka_02.LiteBansModule_31;
        if (flag7 == null ? flag8 != null : !((Object)flag7).equals(flag8)) {
            return false;
        }
        Boolean bl9 = this.c;
        Boolean bl10 = ka_02.c;
        if (bl9 == null ? bl10 != null : !((Object)bl9).equals(bl10)) {
            return false;
        }
        LiteBansType gq2 = this.AsyncBackgroundTask_5();
        LiteBansType gq3 = ka_02.AsyncBackgroundTask_5();
        if (gq2 == null ? gq3 != null : !((Object)gq2).equals(gq3)) {
            return false;
        }
        Color color = this.c();
        Color color2 = ka_02.c();
        if (color == null ? color2 != null : !((Object)color).equals(color2)) {
            return false;
        }
        String string = this.g();
        String string2 = ka_02.g();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Boolean flag = this.plugin;
        n2 = n2 * 59 + (flag == null ? 43 : ((Object)flag).hashCode());
        Boolean flag2 = this.e;
        n2 = n2 * 59 + (flag2 == null ? 43 : ((Object)flag2).hashCode());
        Boolean flag3 = this.LiteBansModule_240;
        n2 = n2 * 59 + (flag3 == null ? 43 : ((Object)flag3).hashCode());
        Boolean flag4 = this.LiteBansModule_31;
        n2 = n2 * 59 + (flag4 == null ? 43 : ((Object)flag4).hashCode());
        Boolean flag5 = this.c;
        n2 = n2 * 59 + (flag5 == null ? 43 : ((Object)flag5).hashCode());
        LiteBansType gq2 = this.AsyncBackgroundTask_5();
        n2 = n2 * 59 + (gq2 == null ? 43 : ((Object)gq2).hashCode());
        Color color = this.c();
        n2 = n2 * 59 + (color == null ? 43 : ((Object)color).hashCode());
        String string = this.g();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public Object clone() {
        return this.LiteBansModule_194();
}

