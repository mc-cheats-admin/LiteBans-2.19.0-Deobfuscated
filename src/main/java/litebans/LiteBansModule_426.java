package litebans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
public abstract class LiteBansModule_426
extends LiteBansModule_417
implements PreparedStatement {
    LiteBansModule_426(LiteBansModule_66 c22, PreparedStatement preparedStatement) {
        super(c22, preparedStatement);
    }

    @Override
    public boolean execute() {
        this.LiteBansModule_31.LiteBansModule_31();
        return ((PreparedStatement)this.plugin).execute();
    }

    @Override
    public ResultSet executeQuery() {
        this.LiteBansModule_31.LiteBansModule_31();
        ResultSet resultSet = ((PreparedStatement)this.plugin).executeQuery();
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, this, resultSet);
    }

    @Override
    public int executeUpdate() {
        this.LiteBansModule_31.LiteBansModule_31();
        return ((PreparedStatement)this.plugin).executeUpdate();
    }

    @Override
    public long executeLargeUpdate() {
        this.LiteBansModule_31.LiteBansModule_31();
        return ((PreparedStatement)this.plugin).executeLargeUpdate();
    }
}

