package litebans;

import java.util.function.Supplier;
public final class LiteBansModule_84
implements Supplier {
    final /* synthetic */ FabricNetworkHandler BaseCoreGenericHandler;
    final /* synthetic */ LiteBansModule_99 LiteBansModule_31;

    public LiteBansModule_84(FabricNetworkHandler t_02, LiteBansModule_99 cr_02) {
        this.plugin = t_02;
        this.LiteBansModule_31 = cr_02;
    }

    public final LiteBansModule_176[] BaseCoreGenericHandler() {
        LiteBansModule_261[] hjArray = new LiteBansModule_261[1];
        PlatformPlugin plugin = this.plugin.BaseCoreGenericHandler;
        LiteBansModule_99 cr_02 = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(cr_02);
        hjArray[0] = new LiteBansModule_261(plugin, cr_02);
        return hjArray;
    }

    public Object get() {
        return this.plugin();
    }
}

