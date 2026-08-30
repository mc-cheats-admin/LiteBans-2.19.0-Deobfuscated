package litebans;

import java.sql.PreparedStatement;
public final class LiteBansModule_40
extends LiteBansModule_60 {
    private LiteBansModule_40(LiteBansModule_83 ch2, PreparedStatement preparedStatement, String string) {
        super(ch2, preparedStatement, string, null);
    }

    @Override
    public LiteBansModule_40 BaseCoreGenericHandler(boolean flag) {
        LiteBansModule_40 b92;
        LiteBansModule_40 b93 = b92 = this;
        LiteBansModule_60 bT2 = this;
        char c = flag ? (char)'1' : '0';
        bT2.BaseCoreGenericHandler(String.valueOf(c));
        return b92;
    }

    @Override
    public LiteBansModule_60 BaseCoreGenericHandler(boolean flag) {
        return this.plugin(flag);
    }

    public /* synthetic */ LiteBansModule_40(LiteBansModule_83 ch2, PreparedStatement preparedStatement, String string, LiteBansModule_14 aJ2) {
        this(ch2, preparedStatement, string);
    }
}

