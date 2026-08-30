package litebans;

import java.util.UUID;
public final class LiteBansModule_46
implements CommandSenderWrapper {
    final /* synthetic */ String e;
    final /* synthetic */ String AsyncBackgroundTask_5;
    final /* synthetic */ UUID c;

    public LiteBansModule_46(String string, String string2, UUID uUID) {
        this.e = string;
        this.AsyncBackgroundTask_5 = string2;
        this.c = uUID;
    }

    public Void BaseCoreGenericHandler(String string) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    @Override
    public String g() {
        return this.e;
    }

    public Void BaseCoreGenericHandler() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    @Override
    public String LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    @Override
    public String i() {
        return this.e;
    }

    @Override
    public String LiteBansModule_241() {
        return null;
    }

    @Override
    public UUID AsyncBackgroundTask_5() {
        return this.c;
    }

    @Override
    public String BaseCoreGenericHandler() {
        return this.c.toString();
    }

    @Override
    public boolean e(String string) {
        return false;
    }

    @Override
    public boolean LiteBansModule_195() {
        return false;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void AsyncBackgroundTask_5(String string) {
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
    }

    @Override
    public void LiteBansModule_31(String string) {
    }

    @Override
    public void BaseCoreGenericHandler(String string, byte[] byArray) {
    }

    @Override
    public void c(String string) {
        this.plugin(string);
    }

    @Override
    public Object c() {
        return this.plugin();
    }
}

