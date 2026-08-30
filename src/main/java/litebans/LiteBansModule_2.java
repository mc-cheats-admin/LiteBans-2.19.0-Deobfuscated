package litebans;

public class LiteBansModule_2
extends LiteBansModule_24 {
    private int LiteBansModule_195;
    private NoneHandler e;

    public LiteBansModule_2() {
        super(new LiteBansModule_289(22));
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(4, n2);
        this.LiteBansModule_195 = LiteBansModule_289.BaseCoreGenericHandler(byArray, n);
        this.e = NoneHandler.BaseCoreGenericHandler(LiteBansModule_289.BaseCoreGenericHandler(byArray, n + 2));
    }
}

