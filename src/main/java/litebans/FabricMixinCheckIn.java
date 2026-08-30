package litebans;

import java.util.List;
import java.util.Set;
import litebans.hl;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class FabricMixinCheckIn
implements IMixinConfigPlugin {
    private String b;
    private static /* synthetic */ String[] a;

    public void onLoad(String string) {
        this.b = string;
    }

    public String getRefMapperConfig() {
        return "";
    }

    public boolean shouldApplyMixin(String string, String string2) {
        if (this.b != null && !string2.startsWith(this.b)) {
            return true;
        }
        if (string2.contains("_")) {
            String string3 = string2.substring(string2.indexOf("_") + 1);
            String string4 = ((ModContainer)FabricLoader.getInstance().getModContainer("fabric-api").get()).getMetadata().getVersion().getFriendlyString().split("\\+")[1].replace(" + ", "_");
            if (string3.endsWith("_")) {
                int n = Integer.parseInt(string4.split("_")[0]);
                return n >= Integer.parseInt(string3.replace("_", ""));
            }
            return string4.contains(string3);
        }
        return true;
    }

    public void acceptTargets(Set set, Set set2) {
    }

    public List getMixins() {
        return null;
    }

    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    private static final void a() {
        a = new String[]{"", "_", "_", "fabric-api", "\\+", " + ", "_", "_", "_", "_", ""};
    }

    static {
        FabricMixinCheckIn.a();
    }
}

