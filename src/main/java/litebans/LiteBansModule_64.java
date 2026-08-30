package litebans;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public final class LiteBansModule_64 {
    static HexEncodingHelper BaseCoreGenericHandler(InUseHandler kJ2, Connection connection, LiteBansModule_226 gk2, AsyncBackgroundTask_15 ja2, long l3, boolean flag, boolean flag2) {
        return new LiteBansModule_67(kJ2, connection, gk2, ja2, l3, flag, flag2);
    }

    static Statement BaseCoreGenericHandler(HexEncodingHelper c22, Statement statement) {
        return new LiteBansModule_425(c22, statement);
    }

    static CallableStatement BaseCoreGenericHandler(HexEncodingHelper c22, CallableStatement callableStatement) {
        return new LiteBansModule_412(c22, callableStatement);
    }

    static PreparedStatement BaseCoreGenericHandler(HexEncodingHelper c22, PreparedStatement preparedStatement) {
        return new LiteBansModule_416(c22, preparedStatement);
    }

    static ResultSet BaseCoreGenericHandler(HexEncodingHelper c22, LiteBansModule_415 lJ2, ResultSet resultSet) {
        return new LiteBansModule_210(c22, lJ2, resultSet);
    }

    static DatabaseMetaData BaseCoreGenericHandler(HexEncodingHelper c22, DatabaseMetaData databaseMetaData) {
        return new LiteBansModule_339(c22, databaseMetaData);
}

