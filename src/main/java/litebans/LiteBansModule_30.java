package litebans;

public class LiteBansModule_30
extends LiteBansModule_24 {
    private int LiteBansModule_194;
    private NoneHandler e;

    public LiteBansModule_30() {
        super(new LiteBansModule_288(21));
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(4, n2);
        super.LiteBansModule_31(byArray, n, n2);
        this.LiteBansModule_194 = LiteBansModule_288.BaseCoreGenericHandler(byArray, n);
        this.e = NoneHandler.BaseCoreGenericHandler(LiteBansModule_288.BaseCoreGenericHandler(byArray, n + 2));
}

