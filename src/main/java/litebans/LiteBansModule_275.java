package litebans;

import java.util.function.Supplier;
public final class LiteBansModule_275
implements Supplier {
    final /* synthetic */ FabricNetworkHandler BaseCoreGenericHandler;
    final /* synthetic */ LiteBansModule_98 LiteBansModule_31;

    public LiteBansModule_275(FabricNetworkHandler t_02, LiteBansModule_98 cr_02) {
        this.plugin = t_02;
        this.LiteBansModule_31 = cr_02;
    }

    public final LiteBansModule_175[] BaseCoreGenericHandler() {
        LiteBansModule_353[] jSArray = new LiteBansModule_353[1];
        PlatformPlugin plugin = this.plugin.BaseCoreGenericHandler;
        LiteBansModule_98 cr_02 = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(cr_02);
        jSArray[0] = new LiteBansModule_353(plugin, cr_02);
        return jSArray;
    }

    public Object get() {
        return this.plugin();
}

