package litebans;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;
import java.sql.Wrapper;
import litebans.c2;
import litebans.j6;

public final class jd
extends j6
implements Wrapper,
DatabaseMetaData {
    public boolean isWrapperFor(Class clazz) {
        try {
            return this.a.isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean allProceduresAreCallable() {
        try {
            return this.a.allProceduresAreCallable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean allTablesAreSelectable() {
        try {
            return this.a.allTablesAreSelectable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getURL() {
        try {
            return this.a.getURL();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getUserName() {
        try {
            return this.a.getUserName();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isReadOnly() {
        try {
            return this.a.isReadOnly();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedHigh() {
        try {
            return this.a.nullsAreSortedHigh();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedLow() {
        try {
            return this.a.nullsAreSortedLow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedAtStart() {
        try {
            return this.a.nullsAreSortedAtStart();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean nullsAreSortedAtEnd() {
        try {
            return this.a.nullsAreSortedAtEnd();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getDatabaseProductName() {
        try {
            return this.a.getDatabaseProductName();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getDatabaseProductVersion() {
        try {
            return this.a.getDatabaseProductVersion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getDriverName() {
        try {
            return this.a.getDriverName();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getDriverVersion() {
        try {
            return this.a.getDriverVersion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getDriverMajorVersion() {
        return this.a.getDriverMajorVersion();
    }

    @Override
    public int getDriverMinorVersion() {
        return this.a.getDriverMinorVersion();
    }

    @Override
    public boolean usesLocalFiles() {
        try {
            return this.a.usesLocalFiles();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean usesLocalFilePerTable() {
        try {
            return this.a.usesLocalFilePerTable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsMixedCaseIdentifiers() {
        try {
            return this.a.supportsMixedCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean storesUpperCaseIdentifiers() {
        try {
            return this.a.storesUpperCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean storesLowerCaseIdentifiers() {
        try {
            return this.a.storesLowerCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean storesMixedCaseIdentifiers() {
        try {
            return this.a.storesMixedCaseIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsMixedCaseQuotedIdentifiers() {
        try {
            return this.a.supportsMixedCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean storesUpperCaseQuotedIdentifiers() {
        try {
            return this.a.storesUpperCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean storesLowerCaseQuotedIdentifiers() {
        try {
            return this.a.storesLowerCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean storesMixedCaseQuotedIdentifiers() {
        try {
            return this.a.storesMixedCaseQuotedIdentifiers();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getIdentifierQuoteString() {
        try {
            return this.a.getIdentifierQuoteString();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getSQLKeywords() {
        try {
            return this.a.getSQLKeywords();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getNumericFunctions() {
        try {
            return this.a.getNumericFunctions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getStringFunctions() {
        try {
            return this.a.getStringFunctions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getSystemFunctions() {
        try {
            return this.a.getSystemFunctions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getTimeDateFunctions() {
        try {
            return this.a.getTimeDateFunctions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getSearchStringEscape() {
        try {
            return this.a.getSearchStringEscape();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getExtraNameCharacters() {
        try {
            return this.a.getExtraNameCharacters();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsAlterTableWithAddColumn() {
        try {
            return this.a.supportsAlterTableWithAddColumn();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsAlterTableWithDropColumn() {
        try {
            return this.a.supportsAlterTableWithDropColumn();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsColumnAliasing() {
        try {
            return this.a.supportsColumnAliasing();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean nullPlusNonNullIsNull() {
        try {
            return this.a.nullPlusNonNullIsNull();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsConvert() {
        try {
            return this.a.supportsConvert();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsConvert(int n, int n2) {
        try {
            return this.a.supportsConvert(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsTableCorrelationNames() {
        try {
            return this.a.supportsTableCorrelationNames();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsDifferentTableCorrelationNames() {
        try {
            return this.a.supportsDifferentTableCorrelationNames();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsExpressionsInOrderBy() {
        try {
            return this.a.supportsExpressionsInOrderBy();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsOrderByUnrelated() {
        try {
            return this.a.supportsOrderByUnrelated();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsGroupBy() {
        try {
            return this.a.supportsGroupBy();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsGroupByUnrelated() {
        try {
            return this.a.supportsGroupByUnrelated();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsGroupByBeyondSelect() {
        try {
            return this.a.supportsGroupByBeyondSelect();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsLikeEscapeClause() {
        try {
            return this.a.supportsLikeEscapeClause();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsMultipleResultSets() {
        try {
            return this.a.supportsMultipleResultSets();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsMultipleTransactions() {
        try {
            return this.a.supportsMultipleTransactions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsNonNullableColumns() {
        try {
            return this.a.supportsNonNullableColumns();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsMinimumSQLGrammar() {
        try {
            return this.a.supportsMinimumSQLGrammar();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCoreSQLGrammar() {
        try {
            return this.a.supportsCoreSQLGrammar();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsExtendedSQLGrammar() {
        try {
            return this.a.supportsExtendedSQLGrammar();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsANSI92EntryLevelSQL() {
        try {
            return this.a.supportsANSI92EntryLevelSQL();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsANSI92IntermediateSQL() {
        try {
            return this.a.supportsANSI92IntermediateSQL();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsANSI92FullSQL() {
        try {
            return this.a.supportsANSI92FullSQL();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsIntegrityEnhancementFacility() {
        try {
            return this.a.supportsIntegrityEnhancementFacility();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsOuterJoins() {
        try {
            return this.a.supportsOuterJoins();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsFullOuterJoins() {
        try {
            return this.a.supportsFullOuterJoins();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsLimitedOuterJoins() {
        try {
            return this.a.supportsLimitedOuterJoins();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getSchemaTerm() {
        try {
            return this.a.getSchemaTerm();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getProcedureTerm() {
        try {
            return this.a.getProcedureTerm();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getCatalogTerm() {
        try {
            return this.a.getCatalogTerm();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isCatalogAtStart() {
        try {
            return this.a.isCatalogAtStart();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getCatalogSeparator() {
        try {
            return this.a.getCatalogSeparator();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInDataManipulation() {
        try {
            return this.a.supportsSchemasInDataManipulation();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInProcedureCalls() {
        try {
            return this.a.supportsSchemasInProcedureCalls();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInTableDefinitions() {
        try {
            return this.a.supportsSchemasInTableDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInIndexDefinitions() {
        try {
            return this.a.supportsSchemasInIndexDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() {
        try {
            return this.a.supportsSchemasInPrivilegeDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() {
        try {
            return this.a.supportsCatalogsInDataManipulation();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInProcedureCalls() {
        try {
            return this.a.supportsCatalogsInProcedureCalls();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInTableDefinitions() {
        try {
            return this.a.supportsCatalogsInTableDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInIndexDefinitions() {
        try {
            return this.a.supportsCatalogsInIndexDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCatalogsInPrivilegeDefinitions() {
        try {
            return this.a.supportsCatalogsInPrivilegeDefinitions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsPositionedDelete() {
        try {
            return this.a.supportsPositionedDelete();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsPositionedUpdate() {
        try {
            return this.a.supportsPositionedUpdate();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSelectForUpdate() {
        try {
            return this.a.supportsSelectForUpdate();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsStoredProcedures() {
        try {
            return this.a.supportsStoredProcedures();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInComparisons() {
        try {
            return this.a.supportsSubqueriesInComparisons();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInExists() {
        try {
            return this.a.supportsSubqueriesInExists();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInIns() {
        try {
            return this.a.supportsSubqueriesInIns();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSubqueriesInQuantifieds() {
        try {
            return this.a.supportsSubqueriesInQuantifieds();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsCorrelatedSubqueries() {
        try {
            return this.a.supportsCorrelatedSubqueries();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsUnion() {
        try {
            return this.a.supportsUnion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsUnionAll() {
        try {
            return this.a.supportsUnionAll();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsOpenCursorsAcrossCommit() {
        try {
            return this.a.supportsOpenCursorsAcrossCommit();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsOpenCursorsAcrossRollback() {
        try {
            return this.a.supportsOpenCursorsAcrossRollback();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsOpenStatementsAcrossCommit() {
        try {
            return this.a.supportsOpenStatementsAcrossCommit();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsOpenStatementsAcrossRollback() {
        try {
            return this.a.supportsOpenStatementsAcrossRollback();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxBinaryLiteralLength() {
        try {
            return this.a.getMaxBinaryLiteralLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxCharLiteralLength() {
        try {
            return this.a.getMaxCharLiteralLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxColumnNameLength() {
        try {
            return this.a.getMaxColumnNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInGroupBy() {
        try {
            return this.a.getMaxColumnsInGroupBy();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInIndex() {
        try {
            return this.a.getMaxColumnsInIndex();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInOrderBy() {
        try {
            return this.a.getMaxColumnsInOrderBy();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInSelect() {
        try {
            return this.a.getMaxColumnsInSelect();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxColumnsInTable() {
        try {
            return this.a.getMaxColumnsInTable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxConnections() {
        try {
            return this.a.getMaxConnections();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxCursorNameLength() {
        try {
            return this.a.getMaxCursorNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxIndexLength() {
        try {
            return this.a.getMaxIndexLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxSchemaNameLength() {
        try {
            return this.a.getMaxSchemaNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxProcedureNameLength() {
        try {
            return this.a.getMaxProcedureNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxCatalogNameLength() {
        try {
            return this.a.getMaxCatalogNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxRowSize() {
        try {
            return this.a.getMaxRowSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean doesMaxRowSizeIncludeBlobs() {
        try {
            return this.a.doesMaxRowSizeIncludeBlobs();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxStatementLength() {
        try {
            return this.a.getMaxStatementLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxStatements() {
        try {
            return this.a.getMaxStatements();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxTableNameLength() {
        try {
            return this.a.getMaxTableNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxTablesInSelect() {
        try {
            return this.a.getMaxTablesInSelect();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxUserNameLength() {
        try {
            return this.a.getMaxUserNameLength();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getDefaultTransactionIsolation() {
        try {
            return this.a.getDefaultTransactionIsolation();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsTransactions() {
        try {
            return this.a.supportsTransactions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsTransactionIsolationLevel(int n) {
        try {
            return this.a.supportsTransactionIsolationLevel(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsDataDefinitionAndDataManipulationTransactions() {
        try {
            return this.a.supportsDataDefinitionAndDataManipulationTransactions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsDataManipulationTransactionsOnly() {
        try {
            return this.a.supportsDataManipulationTransactionsOnly();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean dataDefinitionCausesTransactionCommit() {
        try {
            return this.a.dataDefinitionCausesTransactionCommit();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean dataDefinitionIgnoredInTransactions() {
        try {
            return this.a.dataDefinitionIgnoredInTransactions();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getProcedures(String string, String string2, String string3) {
        try {
            return super.getProcedures(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getProcedureColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getProcedureColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getTables(String string, String string2, String string3, String[] stringArray) {
        try {
            return super.getTables(string, string2, string3, stringArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getSchemas() {
        try {
            return super.getSchemas();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getCatalogs() {
        try {
            return super.getCatalogs();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getTableTypes() {
        try {
            return super.getTableTypes();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getColumnPrivileges(String string, String string2, String string3, String string4) {
        try {
            return super.getColumnPrivileges(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getTablePrivileges(String string, String string2, String string3) {
        try {
            return super.getTablePrivileges(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getBestRowIdentifier(String string, String string2, String string3, int n, boolean bl) {
        try {
            return super.getBestRowIdentifier(string, string2, string3, n, bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getVersionColumns(String string, String string2, String string3) {
        try {
            return super.getVersionColumns(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getPrimaryKeys(String string, String string2, String string3) {
        try {
            return super.getPrimaryKeys(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getImportedKeys(String string, String string2, String string3) {
        try {
            return super.getImportedKeys(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getExportedKeys(String string, String string2, String string3) {
        try {
            return super.getExportedKeys(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getCrossReference(String string, String string2, String string3, String string4, String string5, String string6) {
        try {
            return super.getCrossReference(string, string2, string3, string4, string5, string6);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getTypeInfo() {
        try {
            return super.getTypeInfo();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getIndexInfo(String string, String string2, String string3, boolean bl, boolean bl2) {
        try {
            return super.getIndexInfo(string, string2, string3, bl, bl2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsResultSetType(int n) {
        try {
            return this.a.supportsResultSetType(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsResultSetConcurrency(int n, int n2) {
        try {
            return this.a.supportsResultSetConcurrency(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean ownUpdatesAreVisible(int n) {
        try {
            return this.a.ownUpdatesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean ownDeletesAreVisible(int n) {
        try {
            return this.a.ownDeletesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean ownInsertsAreVisible(int n) {
        try {
            return this.a.ownInsertsAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean othersUpdatesAreVisible(int n) {
        try {
            return this.a.othersUpdatesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean othersDeletesAreVisible(int n) {
        try {
            return this.a.othersDeletesAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean othersInsertsAreVisible(int n) {
        try {
            return this.a.othersInsertsAreVisible(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean updatesAreDetected(int n) {
        try {
            return this.a.updatesAreDetected(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean deletesAreDetected(int n) {
        try {
            return this.a.deletesAreDetected(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean insertsAreDetected(int n) {
        try {
            return this.a.insertsAreDetected(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsBatchUpdates() {
        try {
            return this.a.supportsBatchUpdates();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getUDTs(String string, String string2, String string3, int[] nArray) {
        try {
            return super.getUDTs(string, string2, string3, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsSavepoints() {
        try {
            return this.a.supportsSavepoints();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsNamedParameters() {
        try {
            return this.a.supportsNamedParameters();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsMultipleOpenResults() {
        try {
            return this.a.supportsMultipleOpenResults();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsGetGeneratedKeys() {
        try {
            return this.a.supportsGetGeneratedKeys();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getSuperTypes(String string, String string2, String string3) {
        try {
            return super.getSuperTypes(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getSuperTables(String string, String string2, String string3) {
        try {
            return super.getSuperTables(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getAttributes(String string, String string2, String string3, String string4) {
        try {
            return super.getAttributes(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsResultSetHoldability(int n) {
        try {
            return this.a.supportsResultSetHoldability(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetHoldability() {
        try {
            return this.a.getResultSetHoldability();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getDatabaseMajorVersion() {
        try {
            return this.a.getDatabaseMajorVersion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getDatabaseMinorVersion() {
        try {
            return this.a.getDatabaseMinorVersion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getJDBCMajorVersion() {
        try {
            return this.a.getJDBCMajorVersion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getJDBCMinorVersion() {
        try {
            return this.a.getJDBCMinorVersion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getSQLStateType() {
        try {
            return this.a.getSQLStateType();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean locatorsUpdateCopy() {
        try {
            return this.a.locatorsUpdateCopy();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsStatementPooling() {
        try {
            return this.a.supportsStatementPooling();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public RowIdLifetime getRowIdLifetime() {
        try {
            return this.a.getRowIdLifetime();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getSchemas(String string, String string2) {
        try {
            return super.getSchemas(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsStoredFunctionsUsingCallSyntax() {
        try {
            return this.a.supportsStoredFunctionsUsingCallSyntax();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean autoCommitFailureClosesAllResultSets() {
        try {
            return this.a.autoCommitFailureClosesAllResultSets();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getClientInfoProperties() {
        try {
            return super.getClientInfoProperties();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getFunctions(String string, String string2, String string3) {
        try {
            return super.getFunctions(string, string2, string3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getFunctionColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getFunctionColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getPseudoColumns(String string, String string2, String string3, String string4) {
        try {
            return super.getPseudoColumns(string, string2, string3, string4);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean generatedKeyAlwaysReturned() {
        try {
            return this.a.generatedKeyAlwaysReturned();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getMaxLogicalLobSize() {
        try {
            return this.a.getMaxLogicalLobSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean supportsRefCursors() {
        try {
            return this.a.supportsRefCursors();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    jd(c2 c22, DatabaseMetaData databaseMetaData) {
        super(c22, databaseMetaData);
    }
}

