package litebans;

public class LiteBansModule_2
extends LiteBansModule_24 {
    private int LiteBansModule_194;
    private NoneHandler e;

    public LiteBansModule_2() {
        super(new LiteBansModule_288(22));
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(4, n2);
        this.LiteBansModule_194 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n);
        this.e = NoneHandler.BaseCoreGenericHandler(LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 2));
}

