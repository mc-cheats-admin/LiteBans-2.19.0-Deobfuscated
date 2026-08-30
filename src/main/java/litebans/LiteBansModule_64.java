package litebans;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public final class LiteBansModule_64 {
    static LiteBansModule_66 BaseCoreGenericHandler(InUseHandler kJ2, Connection connection, LiteBansModule_227 gk2, AsyncBackgroundTask_15 ja2, long l3, boolean flag, boolean flag2) {
        return new LiteBansModule_68(kJ2, connection, gk2, ja2, l3, flag, flag2);
    }

    static Statement BaseCoreGenericHandler(LiteBansModule_66 c22, Statement statement) {
        return new LiteBansModule_427(c22, statement);
    }

    static CallableStatement BaseCoreGenericHandler(LiteBansModule_66 c22, CallableStatement callableStatement) {
        return new LiteBansModule_414(c22, callableStatement);
    }

    static PreparedStatement BaseCoreGenericHandler(LiteBansModule_66 c22, PreparedStatement preparedStatement) {
        return new LiteBansModule_418(c22, preparedStatement);
    }

    static ResultSet BaseCoreGenericHandler(LiteBansModule_66 c22, LiteBansModule_417 lJ2, ResultSet resultSet) {
        return new LiteBansModule_211(c22, lJ2, resultSet);
    }

    static DatabaseMetaData BaseCoreGenericHandler(LiteBansModule_66 c22, DatabaseMetaData databaseMetaData) {
        return new LiteBansModule_340(c22, databaseMetaData);
    }
}

