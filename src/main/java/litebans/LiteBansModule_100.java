package litebans;

import java.sql.SQLException;
public interface LiteBansModule_100 {
    default public ContinueEvictHandler BaseCoreGenericHandler(SQLException a10) {
        return ContinueEvictHandler.LiteBansModule_31;
    }
}

