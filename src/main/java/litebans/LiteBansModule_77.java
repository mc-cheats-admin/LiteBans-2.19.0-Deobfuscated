package litebans;

import java.util.Map;
public final class LiteBansModule_77
implements LiteBansModule_178 {
    final /* synthetic */ String BaseCoreGenericHandler;
    final /* synthetic */ String LiteBansModule_31;

    public LiteBansModule_77(String string, String string2) {
        this.plugin = string;
        this.LiteBansModule_31 = string2;
    }

    public final Boolean BaseCoreGenericHandler(Map.Entry entry) {
        return this.plugin != null && ObjectUtilities.BaseCoreGenericHandler(this.plugin, (Object)((SilentHandler)entry.getValue()).DatabaseMonitorService()) || this.LiteBansModule_31 != null && (this.LiteBansModule_31).length() > 0 && ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, (Object)((SilentHandler)entry.getValue()).PunishmentTableService());
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return this.plugin((Map.Entry)targetObj);
}

