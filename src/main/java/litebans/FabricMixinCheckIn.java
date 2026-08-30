package litebans;

import java.util.List;
import java.util.Set;
import litebans.hl;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public static class FabricMixinCheckIn
implements IMixinConfigPlugin {
    private String b;
    private static /* synthetic */ String[] a;

    public void onLoad(String string) {
        this.b = string;
    }

    public String getRefMapperConfig() {
        return a[0];
    }

    public boolean shouldApplyMixin(String string, String string2) {
        if (this.b != null && !string2.startsWith(this.b)) {
            return true;
        }
        if (string2.contains(a[1])) {
            String string3 = string2.substring(string2.indexOf(a[2]) + 1);
            String string4 = ((ModContainer)FabricLoader.getInstance().getModContainer(a[3]).get()).getMetadata().getVersion().getFriendlyString().split(a[4])[1].replace(a[5], a[6]);
            if (string3.endsWith(a[7])) {
                int n = Integer.parseInt(string4.split(a[8])[0]);
                return n >= Integer.parseInt(string3.replace(a[9], a[10]));
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
        a = new String[]{hl.a("", 567017638), hl.a("\u9389", -436169770), hl.a("\u576b", -1867425996), hl.a("\u0be7\u0be0\u0be3\u0bf3\u0be8\u0be2\u0bac\u0be0\u0bf1\u0be8", 1849691009), hl.a("\u2d80\u2df7", 1218457052), hl.a("\uf687", -634653015), hl.a("\u1f59", 1296441094), hl.a("\ua12c", -752836237), hl.a("\u1a3c", -1045751197), hl.a("\u4032", -26460051), hl.a("", -1681227815)};
    }

    static {
        FabricMixinCheckIn.a();
    }
}

