package litebans;

import java.util.function.Supplier;
public final class LiteBansModule_83
implements Supplier {
    final /* synthetic */ FabricNetworkHandler BaseCoreGenericHandler;
    final /* synthetic */ LiteBansModule_98 LiteBansModule_31;

    public LiteBansModule_83(FabricNetworkHandler t_02, LiteBansModule_98 cr_02) {
        this.plugin = t_02;
        this.LiteBansModule_31 = cr_02;
    }

    public final LiteBansModule_175[] BaseCoreGenericHandler() {
        LiteBansModule_260[] hjArray = new LiteBansModule_260[1];
        PlatformPlugin plugin = this.plugin.BaseCoreGenericHandler;
        LiteBansModule_98 cr_02 = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(cr_02);
        hjArray[0] = new LiteBansModule_260(plugin, cr_02);
        return hjArray;
    }

    public Object get() {
        return this.plugin();
}

