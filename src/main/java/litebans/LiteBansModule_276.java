package litebans;

import java.util.function.Supplier;
public final class LiteBansModule_276
implements Supplier {
    final /* synthetic */ FabricNetworkHandler BaseCoreGenericHandler;
    final /* synthetic */ LiteBansModule_99 LiteBansModule_31;

    public LiteBansModule_276(FabricNetworkHandler t_02, LiteBansModule_99 cr_02) {
        this.plugin = t_02;
        this.LiteBansModule_31 = cr_02;
    }

    public final LiteBansModule_176[] BaseCoreGenericHandler() {
        LiteBansModule_355[] jSArray = new LiteBansModule_355[1];
        PlatformPlugin plugin = this.plugin.BaseCoreGenericHandler;
        LiteBansModule_99 cr_02 = this.LiteBansModule_31;
        ObjectUtilities.BaseCoreGenericHandler(cr_02);
        jSArray[0] = new LiteBansModule_355(plugin, cr_02);
        return jSArray;
    }

    public Object get() {
        return this.plugin();
    }
}

