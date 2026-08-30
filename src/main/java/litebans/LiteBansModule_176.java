package litebans;

import java.util.ArrayList;
import java.util.Collection;
public final class LiteBansModule_176
implements LiteBansModule_178 {
    final /* synthetic */ ArrayList LiteBansModule_31;
    final /* synthetic */ ServerSyncService BaseCoreGenericHandler;

    public LiteBansModule_176(ArrayList arrayList, ServerSyncService u2) {
        this.LiteBansModule_31 = arrayList;
        this.plugin = u2;
    }

    public final void BaseCoreGenericHandler(LiteBansModule_342 jg_02) {
        ((Collection)this.LiteBansModule_31).add(jg_02.c());
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        this.plugin((LiteBansModule_342)object);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }
}

