package litebans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import litebans.c0;
import litebans.c2;
import litebans.lJ;

public static abstract class lV
extends lJ
implements PreparedStatement {
    lV(c2 c22, PreparedStatement preparedStatement) {
        super(c22, preparedStatement);
    }

    @Override
    public boolean execute() {
        this.b.b();
        return ((PreparedStatement)this.a).execute();
    }

    @Override
    public ResultSet executeQuery() {
        this.b.b();
        ResultSet resultSet = ((PreparedStatement)this.a).executeQuery();
        return c0.a(this.b, this, resultSet);
    }

    @Override
    public int executeUpdate() {
        this.b.b();
        return ((PreparedStatement)this.a).executeUpdate();
    }

    @Override
    public long executeLargeUpdate() {
        this.b.b();
        return ((PreparedStatement)this.a).executeLargeUpdate();
    }
}

