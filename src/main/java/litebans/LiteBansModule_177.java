package litebans;

import java.util.ArrayList;
import java.util.Collection;
public final class LiteBansModule_177
implements LiteBansModule_179 {
    final /* synthetic */ ArrayList LiteBansModule_31;
    final /* synthetic */ ServerSyncService BaseCoreGenericHandler;

    public LiteBansModule_177(ArrayList arrayList, ServerSyncService u2) {
        this.LiteBansModule_31 = arrayList;
        this.plugin = u2;
    }

    public final void BaseCoreGenericHandler(LiteBansModule_343 jg_02) {
        ((Collection)this.LiteBansModule_31).add(jg_02.c());
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        this.plugin((LiteBansModule_343)targetObj);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }
}

