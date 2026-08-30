package litebans;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class LiteBansModule_69
implements LiteBansModule_392 {
    private final YamlConfigProvider BaseCoreGenericHandler;
    private final NullHandler_4 LiteBansModule_31;

    public LiteBansModule_69(YamlConfigProvider gg_02, NullHandler_4 ie_02) {
        this.plugin = gg_02;
        this.LiteBansModule_31 = ie_02;
    }

    @Override
    public Collection BaseCoreGenericHandler(boolean flag) {
        if (this.LiteBansModule_31 == null) {
            return Collections.emptyList();
        }
        return this.LiteBansModule_31.LiteBansModule_31();
    }

    @Override
    public LiteBansModule_392 BaseCoreGenericHandler(String string) {
        NullHandler_4 ie_02;
        try {
            ie_02 = this.LiteBansModule_31.LiteBansModule_31(string);
        }
        catch (ClassCastException classCastException) {
            this.plugin.BaseCoreGenericHandler(string, classCastException);
            return null;
        }
        if (ie_02 == null) {
            return null;
        }
        return new LiteBansModule_69(this.plugin, ie_02);
    }

    @Override
    public DatabaseService LiteBansModule_31(String string, Object targetObj) {
        this.LiteBansModule_31.BaseCoreGenericHandler(string, targetObj);
        return this.plugin;
    }

    @Override
    public Object BaseCoreGenericHandler(String string, Object targetObj) {
        return this.LiteBansModule_31.LiteBansModule_31(string, targetObj);
    }

    @Override
    public Object LiteBansModule_31(String string) {
        return this.LiteBansModule_31.e(string);
    }

    @Override
    public int BaseCoreGenericHandler(String string, int n) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(string, n);
    }

    @Override
    public long BaseCoreGenericHandler(String string, long l3) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(string, l3);
    }

    @Override
    public double AsyncBackgroundTask_5(String string) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(string);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string) {
        return this.LiteBansModule_31.LiteBansModule_195(string);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(string, flag);
    }

    @Override
    public String e(String string) {
        return this.LiteBansModule_31.i(string);
    }

    @Override
    public String BaseCoreGenericHandler(String string, String string2) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(string, string2);
    }

    @Override
    public List g(String string) {
        return this.LiteBansModule_31.GnuSparseMapHandler(string);
    }
}

