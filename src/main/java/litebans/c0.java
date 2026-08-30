package litebans;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import litebans.c2;
import litebans.c6;
import litebans.g4;
import litebans.gk;
import litebans.ja;
import litebans.jd;
import litebans.kJ;
import litebans.lH;
import litebans.lJ;
import litebans.lK;
import litebans.ly;

public static final class c0 {
    static c2 a(kJ kJ2, Connection connection, gk gk2, ja ja2, long l3, boolean bl, boolean bl2) {
        return new c6(kJ2, connection, gk2, ja2, l3, bl, bl2);
    }

    static Statement a(c2 c22, Statement statement) {
        return new ly(c22, statement);
    }

    static CallableStatement a(c2 c22, CallableStatement callableStatement) {
        return new lH(c22, callableStatement);
    }

    static PreparedStatement a(c2 c22, PreparedStatement preparedStatement) {
        return new lK(c22, preparedStatement);
    }

    static ResultSet a(c2 c22, lJ lJ2, ResultSet resultSet) {
        return new g4(c22, lJ2, resultSet);
    }

    static DatabaseMetaData a(c2 c22, DatabaseMetaData databaseMetaData) {
        return new jd(c22, databaseMetaData);
    }
}

