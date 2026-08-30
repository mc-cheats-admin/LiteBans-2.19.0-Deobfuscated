package litebans;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;
import java.sql.Wrapper;
public final class LiteBansModule_339
extends LiteBansModule_331
implements Wrapper,
DatabaseMetaData {
    public boolean isWrapperFor(Class clazz) {
        try {
            return this.plugin.isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean allProceduresAreCallable() {
        try {
            return this.plugin.allProceduresAreCallable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean allTablesAreSelectable() {
        try {
            return this.plugin.allTablesAreSelectable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getURL() {
        try {
            return this.plugin.getURL();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getUserName() {
        try {
            return this.plugin.getUserName();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isReadOnly() {
        try {
            return this.plugin.isReadOnly();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedHigh() {
        try {
            return this.plugin.nullsAreSortedHigh();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedLow() {
        try {
            return this.plugin.nullsAreSortedLow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedAtStart() {
        try {
            return this.plugin.nullsAreSortedAtStart();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedAtEnd() {
        try {
            return this.plugin.nullsAreSortedAtEnd();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getDatabaseProductName() {
        try {
            return this.plugin.getDatabaseProductName();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getDatabaseProductVersion() {
        try {
            return this.plugin.getDatabaseProductVersion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getDriverName() {
        try {
            return this.plugin.getDriverName();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getDriverVersion() {
        try {
            return this.plugin.getDriverVersion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getDriverMajorVersion() {
        return this.plugin.getDriverMajorVersion();
    }

    @Override
    public int getDriverMinorVersion() {
        return this.plugin.getDriverMinorVersion();
    }

    @Override
    public boolean usesLocalFiles() {
        try {
            return this.plugin.usesLocalFiles();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean usesLocalFilePerTable() {
        try {
            return this.plugin.usesLocalFilePerTable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsMixedCaseIdentifiers() {
        try {
            return this.plugin.supportsMixedCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean storesUpperCaseIdentifiers() {
        try {
            return this.plugin.storesUpperCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean storesLowerCaseIdentifiers() {
        try {
            return this.plugin.storesLowerCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean storesMixedCaseIdentifiers() {
        try {
            return this.plugin.storesMixedCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsMixedCaseQuotedIdentifiers() {
        try {
            return this.plugin.supportsMixedCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean storesUpperCaseQuotedIdentifiers() {
        try {
            return this.plugin.storesUpperCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean storesLowerCaseQuotedIdentifiers() {
        try {
            return this.plugin.storesLowerCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean storesMixedCaseQuotedIdentifiers() {
        try {
            return this.plugin.storesMixedCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getIdentifierQuoteString() {
        try {
            return this.plugin.getIdentifierQuoteString();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getSQLKeywords() {
        try {
            return this.plugin.getSQLKeywords();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getNumericFunctions() {
        try {
            return this.plugin.getNumericFunctions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getStringFunctions() {
        try {
            return this.plugin.getStringFunctions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getSystemFunctions() {
        try {
            return this.plugin.getSystemFunctions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getTimeDateFunctions() {
        try {
            return this.plugin.getTimeDateFunctions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getSearchStringEscape() {
        try {
            return this.plugin.getSearchStringEscape();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getExtraNameCharacters() {
        try {
            return this.plugin.getExtraNameCharacters();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsAlterTableWithAddColumn() {
        try {
            return this.plugin.supportsAlterTableWithAddColumn();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsAlterTableWithDropColumn() {
        try {
            return this.plugin.supportsAlterTableWithDropColumn();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsColumnAliasing() {
        try {
            return this.plugin.supportsColumnAliasing();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean nullPlusNonNullIsNull() {
        try {
            return this.plugin.nullPlusNonNullIsNull();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsConvert() {
        try {
            return this.plugin.supportsConvert();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsConvert(int n, int n2) {
        try {
            return this.plugin.supportsConvert(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsTableCorrelationNames() {
        try {
            return this.plugin.supportsTableCorrelationNames();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsDifferentTableCorrelationNames() {
        try {
            return this.plugin.supportsDifferentTableCorrelationNames();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsExpressionsInOrderBy() {
        try {
            return this.plugin.supportsExpressionsInOrderBy();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsOrderByUnrelated() {
        try {
            return this.plugin.supportsOrderByUnrelated();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsGroupBy() {
        try {
            return this.plugin.supportsGroupBy();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsGroupByUnrelated() {
        try {
            return this.plugin.supportsGroupByUnrelated();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsGroupByBeyondSelect() {
        try {
            return this.plugin.supportsGroupByBeyondSelect();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsLikeEscapeClause() {
        try {
            return this.plugin.supportsLikeEscapeClause();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsMultipleResultSets() {
        try {
            return this.plugin.supportsMultipleResultSets();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsMultipleTransactions() {
        try {
            return this.plugin.supportsMultipleTransactions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsNonNullableColumns() {
        try {
            return this.plugin.supportsNonNullableColumns();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsMinimumSQLGrammar() {
        try {
            return this.plugin.supportsMinimumSQLGrammar();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCoreSQLGrammar() {
        try {
            return this.plugin.supportsCoreSQLGrammar();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsExtendedSQLGrammar() {
        try {
            return this.plugin.supportsExtendedSQLGrammar();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsANSI92EntryLevelSQL() {
        try {
            return this.plugin.supportsANSI92EntryLevelSQL();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsANSI92IntermediateSQL() {
        try {
            return this.plugin.supportsANSI92IntermediateSQL();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsANSI92FullSQL() {
        try {
            return this.plugin.supportsANSI92FullSQL();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsIntegrityEnhancementFacility() {
        try {
            return this.plugin.supportsIntegrityEnhancementFacility();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsOuterJoins() {
        try {
            return this.plugin.supportsOuterJoins();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsFullOuterJoins() {
        try {
            return this.plugin.supportsFullOuterJoins();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsLimitedOuterJoins() {
        try {
            return this.plugin.supportsLimitedOuterJoins();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getSchemaTerm() {
        try {
            return this.plugin.getSchemaTerm();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getProcedureTerm() {
        try {
            return this.plugin.getProcedureTerm();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getCatalogTerm() {
        try {
            return this.plugin.getCatalogTerm();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isCatalogAtStart() {
        try {
            return this.plugin.isCatalogAtStart();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getCatalogSeparator() {
        try {
            return this.plugin.getCatalogSeparator();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInDataManipulation() {
        try {
            return this.plugin.supportsSchemasInDataManipulation();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInProcedureCalls() {
        try {
            return this.plugin.supportsSchemasInProcedureCalls();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInTableDefinitions() {
        try {
            return this.plugin.supportsSchemasInTableDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInIndexDefinitions() {
        try {
            return this.plugin.supportsSchemasInIndexDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() {
        try {
            return this.plugin.supportsSchemasInPrivilegeDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() {
        try {
            return this.plugin.supportsCatalogsInDataManipulation();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInProcedureCalls() {
        try {
            return this.plugin.supportsCatalogsInProcedureCalls();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInTableDefinitions() {
        try {
            return this.plugin.supportsCatalogsInTableDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInIndexDefinitions() {
        try {
            return this.plugin.supportsCatalogsInIndexDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInPrivilegeDefinitions() {
        try {
            return this.plugin.supportsCatalogsInPrivilegeDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsPositionedDelete() {
        try {
            return this.plugin.supportsPositionedDelete();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsPositionedUpdate() {
        try {
            return this.plugin.supportsPositionedUpdate();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSelectForUpdate() {
        try {
            return this.plugin.supportsSelectForUpdate();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsStoredProcedures() {
        try {
            return this.plugin.supportsStoredProcedures();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInComparisons() {
        try {
            return this.plugin.supportsSubqueriesInComparisons();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInExists() {
        try {
            return this.plugin.supportsSubqueriesInExists();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInIns() {
        try {
            return this.plugin.supportsSubqueriesInIns();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInQuantifieds() {
        try {
            return this.plugin.supportsSubqueriesInQuantifieds();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsCorrelatedSubqueries() {
        try {
            return this.plugin.supportsCorrelatedSubqueries();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsUnion() {
        try {
            return this.plugin.supportsUnion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsUnionAll() {
        try {
            return this.plugin.supportsUnionAll();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsOpenCursorsAcrossCommit() {
        try {
            return this.plugin.supportsOpenCursorsAcrossCommit();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsOpenCursorsAcrossRollback() {
        try {
            return this.plugin.supportsOpenCursorsAcrossRollback();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsOpenStatementsAcrossCommit() {
        try {
            return this.plugin.supportsOpenStatementsAcrossCommit();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsOpenStatementsAcrossRollback() {
        try {
            return this.plugin.supportsOpenStatementsAcrossRollback();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxBinaryLiteralLength() {
        try {
            return this.plugin.getMaxBinaryLiteralLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxCharLiteralLength() {
        try {
            return this.plugin.getMaxCharLiteralLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxColumnNameLength() {
        try {
            return this.plugin.getMaxColumnNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInGroupBy() {
        try {
            return this.plugin.getMaxColumnsInGroupBy();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInIndex() {
        try {
            return this.plugin.getMaxColumnsInIndex();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInOrderBy() {
        try {
            return this.plugin.getMaxColumnsInOrderBy();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInSelect() {
        try {
            return this.plugin.getMaxColumnsInSelect();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInTable() {
        try {
            return this.plugin.getMaxColumnsInTable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxConnections() {
        try {
            return this.plugin.getMaxConnections();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxCursorNameLength() {
        try {
            return this.plugin.getMaxCursorNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxIndexLength() {
        try {
            return this.plugin.getMaxIndexLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxSchemaNameLength() {
        try {
            return this.plugin.getMaxSchemaNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxProcedureNameLength() {
        try {
            return this.plugin.getMaxProcedureNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxCatalogNameLength() {
        try {
            return this.plugin.getMaxCatalogNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxRowSize() {
        try {
            return this.plugin.getMaxRowSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean doesMaxRowSizeIncludeBlobs() {
        try {
            return this.plugin.doesMaxRowSizeIncludeBlobs();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxStatementLength() {
        try {
            return this.plugin.getMaxStatementLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxStatements() {
        try {
            return this.plugin.getMaxStatements();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxTableNameLength() {
        try {
            return this.plugin.getMaxTableNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxTablesInSelect() {
        try {
            return this.plugin.getMaxTablesInSelect();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxUserNameLength() {
        try {
            return this.plugin.getMaxUserNameLength();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getDefaultTransactionIsolation() {
        try {
            return this.plugin.getDefaultTransactionIsolation();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsTransactions() {
        try {
            return this.plugin.supportsTransactions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsTransactionIsolationLevel(int n) {
        try {
            return this.plugin.supportsTransactionIsolationLevel(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsDataDefinitionAndDataManipulationTransactions() {
        try {
            return this.plugin.supportsDataDefinitionAndDataManipulationTransactions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsDataManipulationTransactionsOnly() {
        try {
            return this.plugin.supportsDataManipulationTransactionsOnly();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean dataDefinitionCausesTransactionCommit() {
        try {
            return this.plugin.dataDefinitionCausesTransactionCommit();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean dataDefinitionIgnoredInTransactions() {
        try {
            return this.plugin.dataDefinitionIgnoredInTransactions();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getProcedures(String string, String string2, String string3) {
        try {
            return super.getProcedures(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getProcedureColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getProcedureColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getTables(String string, String string2, String string3, String[] args) {
        try {
            return super.getTables(string, string2, string3, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getSchemas() {
        try {
            return super.getSchemas();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getCatalogs() {
        try {
            return super.getCatalogs();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getTableTypes() {
        try {
            return super.getTableTypes();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getColumnPrivileges(String string, String string2, String string3, String string4) {
        try {
            return super.getColumnPrivileges(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getTablePrivileges(String string, String string2, String string3) {
        try {
            return super.getTablePrivileges(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getBestRowIdentifier(String string, String string2, String string3, int n, boolean flag) {
        try {
            return super.getBestRowIdentifier(string, string2, string3, n, flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getVersionColumns(String string, String string2, String string3) {
        try {
            return super.getVersionColumns(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getPrimaryKeys(String string, String string2, String string3) {
        try {
            return super.getPrimaryKeys(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getImportedKeys(String string, String string2, String string3) {
        try {
            return super.getImportedKeys(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getExportedKeys(String string, String string2, String string3) {
        try {
            return super.getExportedKeys(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getCrossReference(String string, String string2, String string3, String string4, String string5, String string6) {
        try {
            return super.getCrossReference(string, string2, string3, string4, string5, string6);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getTypeInfo() {
        try {
            return super.getTypeInfo();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getIndexInfo(String string, String string2, String string3, boolean flag, boolean flag2) {
        try {
            return super.getIndexInfo(string, string2, string3, flag, flag2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsResultSetType(int n) {
        try {
            return this.plugin.supportsResultSetType(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsResultSetConcurrency(int n, int n2) {
        try {
            return this.plugin.supportsResultSetConcurrency(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean ownUpdatesAreVisible(int n) {
        try {
            return this.plugin.ownUpdatesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean ownDeletesAreVisible(int n) {
        try {
            return this.plugin.ownDeletesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean ownInsertsAreVisible(int n) {
        try {
            return this.plugin.ownInsertsAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean othersUpdatesAreVisible(int n) {
        try {
            return this.plugin.othersUpdatesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean othersDeletesAreVisible(int n) {
        try {
            return this.plugin.othersDeletesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean othersInsertsAreVisible(int n) {
        try {
            return this.plugin.othersInsertsAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean updatesAreDetected(int n) {
        try {
            return this.plugin.updatesAreDetected(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean deletesAreDetected(int n) {
        try {
            return this.plugin.deletesAreDetected(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean insertsAreDetected(int n) {
        try {
            return this.plugin.insertsAreDetected(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsBatchUpdates() {
        try {
            return this.plugin.supportsBatchUpdates();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getUDTs(String string, String string2, String string3, int[] nArray) {
        try {
            return super.getUDTs(string, string2, string3, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsSavepoints() {
        try {
            return this.plugin.supportsSavepoints();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsNamedParameters() {
        try {
            return this.plugin.supportsNamedParameters();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsMultipleOpenResults() {
        try {
            return this.plugin.supportsMultipleOpenResults();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsGetGeneratedKeys() {
        try {
            return this.plugin.supportsGetGeneratedKeys();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getSuperTypes(String string, String string2, String string3) {
        try {
            return super.getSuperTypes(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getSuperTables(String string, String string2, String string3) {
        try {
            return super.getSuperTables(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getAttributes(String string, String string2, String string3, String string4) {
        try {
            return super.getAttributes(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsResultSetHoldability(int n) {
        try {
            return this.plugin.supportsResultSetHoldability(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getResultSetHoldability() {
        try {
            return this.plugin.getResultSetHoldability();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getDatabaseMajorVersion() {
        try {
            return this.plugin.getDatabaseMajorVersion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getDatabaseMinorVersion() {
        try {
            return this.plugin.getDatabaseMinorVersion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getJDBCMajorVersion() {
        try {
            return this.plugin.getJDBCMajorVersion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getJDBCMinorVersion() {
        try {
            return this.plugin.getJDBCMinorVersion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getSQLStateType() {
        try {
            return this.plugin.getSQLStateType();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean locatorsUpdateCopy() {
        try {
            return this.plugin.locatorsUpdateCopy();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsStatementPooling() {
        try {
            return this.plugin.supportsStatementPooling();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public RowIdLifetime getRowIdLifetime() {
        try {
            return this.plugin.getRowIdLifetime();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getSchemas(String string, String string2) {
        try {
            return super.getSchemas(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsStoredFunctionsUsingCallSyntax() {
        try {
            return this.plugin.supportsStoredFunctionsUsingCallSyntax();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean autoCommitFailureClosesAllResultSets() {
        try {
            return this.plugin.autoCommitFailureClosesAllResultSets();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getClientInfoProperties() {
        try {
            return super.getClientInfoProperties();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getFunctions(String string, String string2, String string3) {
        try {
            return super.getFunctions(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getFunctionColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getFunctionColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getPseudoColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getPseudoColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean generatedKeyAlwaysReturned() {
        try {
            return this.plugin.generatedKeyAlwaysReturned();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getMaxLogicalLobSize() {
        try {
            return this.plugin.getMaxLogicalLobSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean supportsRefCursors() {
        try {
            return this.plugin.supportsRefCursors();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    LiteBansModule_339(HexEncodingHelper c22, DatabaseMetaData databaseMetaData) {
        super(c22, databaseMetaData);
    }
}

