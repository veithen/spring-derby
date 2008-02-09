package net.sf.springderby.wrapper;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaDataWrapper implements DatabaseMetaData {
	private final WrapperFactory wrapperFactory;
	private final DatabaseMetaData parent;
	
	public DatabaseMetaDataWrapper(WrapperFactory wrapperFactory, DatabaseMetaData parent) {
		this.wrapperFactory = wrapperFactory;
		this.parent = parent;
	}

	public boolean allProceduresAreCallable() throws SQLException {
		return parent.allProceduresAreCallable();
	}

	public boolean allTablesAreSelectable() throws SQLException {
		return parent.allTablesAreSelectable();
	}

	public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
		return parent.dataDefinitionCausesTransactionCommit();
	}

	public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
		return parent.dataDefinitionIgnoredInTransactions();
	}

	public boolean deletesAreDetected(int type) throws SQLException {
		return parent.deletesAreDetected(type);
	}

	public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
		return parent.doesMaxRowSizeIncludeBlobs();
	}

	public ResultSet getAttributes(String catalog, String schemaPattern,
			String typeNamePattern, String attributeNamePattern)
			throws SQLException {
		return parent.getAttributes(catalog, schemaPattern, typeNamePattern,
				attributeNamePattern);
	}

	public ResultSet getBestRowIdentifier(String catalog, String schema,
			String table, int scope, boolean nullable) throws SQLException {
		return parent.getBestRowIdentifier(catalog, schema, table, scope,
				nullable);
	}

	public ResultSet getCatalogs() throws SQLException {
		return parent.getCatalogs();
	}

	public String getCatalogSeparator() throws SQLException {
		return parent.getCatalogSeparator();
	}

	public String getCatalogTerm() throws SQLException {
		return parent.getCatalogTerm();
	}

	public ResultSet getColumnPrivileges(String catalog, String schema,
			String table, String columnNamePattern) throws SQLException {
		return parent.getColumnPrivileges(catalog, schema, table,
				columnNamePattern);
	}

	public ResultSet getColumns(String catalog, String schemaPattern,
			String tableNamePattern, String columnNamePattern)
			throws SQLException {
		return parent.getColumns(catalog, schemaPattern, tableNamePattern,
				columnNamePattern);
	}

	public Connection getConnection() throws SQLException {
		return parent.getConnection();
	}

	public ResultSet getCrossReference(String primaryCatalog,
			String primarySchema, String primaryTable, String foreignCatalog,
			String foreignSchema, String foreignTable) throws SQLException {
		return parent.getCrossReference(primaryCatalog, primarySchema,
				primaryTable, foreignCatalog, foreignSchema, foreignTable);
	}

	public int getDatabaseMajorVersion() throws SQLException {
		return parent.getDatabaseMajorVersion();
	}

	public int getDatabaseMinorVersion() throws SQLException {
		return parent.getDatabaseMinorVersion();
	}

	public String getDatabaseProductName() throws SQLException {
		return parent.getDatabaseProductName();
	}

	public String getDatabaseProductVersion() throws SQLException {
		return parent.getDatabaseProductVersion();
	}

	public int getDefaultTransactionIsolation() throws SQLException {
		return parent.getDefaultTransactionIsolation();
	}

	public int getDriverMajorVersion() {
		return parent.getDriverMajorVersion();
	}

	public int getDriverMinorVersion() {
		return parent.getDriverMinorVersion();
	}

	public String getDriverName() throws SQLException {
		return parent.getDriverName();
	}

	public String getDriverVersion() throws SQLException {
		return parent.getDriverVersion();
	}

	public ResultSet getExportedKeys(String catalog, String schema, String table)
			throws SQLException {
		return parent.getExportedKeys(catalog, schema, table);
	}

	public String getExtraNameCharacters() throws SQLException {
		return parent.getExtraNameCharacters();
	}

	public String getIdentifierQuoteString() throws SQLException {
		return parent.getIdentifierQuoteString();
	}

	public ResultSet getImportedKeys(String catalog, String schema, String table)
			throws SQLException {
		return parent.getImportedKeys(catalog, schema, table);
	}

	public ResultSet getIndexInfo(String catalog, String schema, String table,
			boolean unique, boolean approximate) throws SQLException {
		return parent.getIndexInfo(catalog, schema, table, unique, approximate);
	}

	public int getJDBCMajorVersion() throws SQLException {
		return parent.getJDBCMajorVersion();
	}

	public int getJDBCMinorVersion() throws SQLException {
		return parent.getJDBCMinorVersion();
	}

	public int getMaxBinaryLiteralLength() throws SQLException {
		return parent.getMaxBinaryLiteralLength();
	}

	public int getMaxCatalogNameLength() throws SQLException {
		return parent.getMaxCatalogNameLength();
	}

	public int getMaxCharLiteralLength() throws SQLException {
		return parent.getMaxCharLiteralLength();
	}

	public int getMaxColumnNameLength() throws SQLException {
		return parent.getMaxColumnNameLength();
	}

	public int getMaxColumnsInGroupBy() throws SQLException {
		return parent.getMaxColumnsInGroupBy();
	}

	public int getMaxColumnsInIndex() throws SQLException {
		return parent.getMaxColumnsInIndex();
	}

	public int getMaxColumnsInOrderBy() throws SQLException {
		return parent.getMaxColumnsInOrderBy();
	}

	public int getMaxColumnsInSelect() throws SQLException {
		return parent.getMaxColumnsInSelect();
	}

	public int getMaxColumnsInTable() throws SQLException {
		return parent.getMaxColumnsInTable();
	}

	public int getMaxConnections() throws SQLException {
		return parent.getMaxConnections();
	}

	public int getMaxCursorNameLength() throws SQLException {
		return parent.getMaxCursorNameLength();
	}

	public int getMaxIndexLength() throws SQLException {
		return parent.getMaxIndexLength();
	}

	public int getMaxProcedureNameLength() throws SQLException {
		return parent.getMaxProcedureNameLength();
	}

	public int getMaxRowSize() throws SQLException {
		return parent.getMaxRowSize();
	}

	public int getMaxSchemaNameLength() throws SQLException {
		return parent.getMaxSchemaNameLength();
	}

	public int getMaxStatementLength() throws SQLException {
		return parent.getMaxStatementLength();
	}

	public int getMaxStatements() throws SQLException {
		return parent.getMaxStatements();
	}

	public int getMaxTableNameLength() throws SQLException {
		return parent.getMaxTableNameLength();
	}

	public int getMaxTablesInSelect() throws SQLException {
		return parent.getMaxTablesInSelect();
	}

	public int getMaxUserNameLength() throws SQLException {
		return parent.getMaxUserNameLength();
	}

	public String getNumericFunctions() throws SQLException {
		return parent.getNumericFunctions();
	}

	public ResultSet getPrimaryKeys(String catalog, String schema, String table)
			throws SQLException {
		return parent.getPrimaryKeys(catalog, schema, table);
	}

	public ResultSet getProcedureColumns(String catalog, String schemaPattern,
			String procedureNamePattern, String columnNamePattern)
			throws SQLException {
		return parent.getProcedureColumns(catalog, schemaPattern,
				procedureNamePattern, columnNamePattern);
	}

	public ResultSet getProcedures(String catalog, String schemaPattern,
			String procedureNamePattern) throws SQLException {
		return parent.getProcedures(catalog, schemaPattern,
				procedureNamePattern);
	}

	public String getProcedureTerm() throws SQLException {
		return parent.getProcedureTerm();
	}

	public int getResultSetHoldability() throws SQLException {
		return parent.getResultSetHoldability();
	}

	public ResultSet getSchemas() throws SQLException {
		return parent.getSchemas();
	}

	public String getSchemaTerm() throws SQLException {
		return parent.getSchemaTerm();
	}

	public String getSearchStringEscape() throws SQLException {
		return parent.getSearchStringEscape();
	}

	public String getSQLKeywords() throws SQLException {
		return parent.getSQLKeywords();
	}

	public int getSQLStateType() throws SQLException {
		return parent.getSQLStateType();
	}

	public String getStringFunctions() throws SQLException {
		return parent.getStringFunctions();
	}

	public ResultSet getSuperTables(String catalog, String schemaPattern,
			String tableNamePattern) throws SQLException {
		return parent.getSuperTables(catalog, schemaPattern, tableNamePattern);
	}

	public ResultSet getSuperTypes(String catalog, String schemaPattern,
			String typeNamePattern) throws SQLException {
		return parent.getSuperTypes(catalog, schemaPattern, typeNamePattern);
	}

	public String getSystemFunctions() throws SQLException {
		return parent.getSystemFunctions();
	}

	public ResultSet getTablePrivileges(String catalog, String schemaPattern,
			String tableNamePattern) throws SQLException {
		return parent.getTablePrivileges(catalog, schemaPattern,
				tableNamePattern);
	}

	public ResultSet getTables(String catalog, String schemaPattern,
			String tableNamePattern, String[] types) throws SQLException {
		return parent
				.getTables(catalog, schemaPattern, tableNamePattern, types);
	}

	public ResultSet getTableTypes() throws SQLException {
		return parent.getTableTypes();
	}

	public String getTimeDateFunctions() throws SQLException {
		return parent.getTimeDateFunctions();
	}

	public ResultSet getTypeInfo() throws SQLException {
		return parent.getTypeInfo();
	}

	public ResultSet getUDTs(String catalog, String schemaPattern,
			String typeNamePattern, int[] types) throws SQLException {
		return parent.getUDTs(catalog, schemaPattern, typeNamePattern, types);
	}

	public String getURL() throws SQLException {
		return parent.getURL();
	}

	public String getUserName() throws SQLException {
		return parent.getUserName();
	}

	public ResultSet getVersionColumns(String catalog, String schema,
			String table) throws SQLException {
		return parent.getVersionColumns(catalog, schema, table);
	}

	public boolean insertsAreDetected(int type) throws SQLException {
		return parent.insertsAreDetected(type);
	}

	public boolean isCatalogAtStart() throws SQLException {
		return parent.isCatalogAtStart();
	}

	public boolean isReadOnly() throws SQLException {
		return parent.isReadOnly();
	}

	public boolean locatorsUpdateCopy() throws SQLException {
		return parent.locatorsUpdateCopy();
	}

	public boolean nullPlusNonNullIsNull() throws SQLException {
		return parent.nullPlusNonNullIsNull();
	}

	public boolean nullsAreSortedAtEnd() throws SQLException {
		return parent.nullsAreSortedAtEnd();
	}

	public boolean nullsAreSortedAtStart() throws SQLException {
		return parent.nullsAreSortedAtStart();
	}

	public boolean nullsAreSortedHigh() throws SQLException {
		return parent.nullsAreSortedHigh();
	}

	public boolean nullsAreSortedLow() throws SQLException {
		return parent.nullsAreSortedLow();
	}

	public boolean othersDeletesAreVisible(int type) throws SQLException {
		return parent.othersDeletesAreVisible(type);
	}

	public boolean othersInsertsAreVisible(int type) throws SQLException {
		return parent.othersInsertsAreVisible(type);
	}

	public boolean othersUpdatesAreVisible(int type) throws SQLException {
		return parent.othersUpdatesAreVisible(type);
	}

	public boolean ownDeletesAreVisible(int type) throws SQLException {
		return parent.ownDeletesAreVisible(type);
	}

	public boolean ownInsertsAreVisible(int type) throws SQLException {
		return parent.ownInsertsAreVisible(type);
	}

	public boolean ownUpdatesAreVisible(int type) throws SQLException {
		return parent.ownUpdatesAreVisible(type);
	}

	public boolean storesLowerCaseIdentifiers() throws SQLException {
		return parent.storesLowerCaseIdentifiers();
	}

	public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
		return parent.storesLowerCaseQuotedIdentifiers();
	}

	public boolean storesMixedCaseIdentifiers() throws SQLException {
		return parent.storesMixedCaseIdentifiers();
	}

	public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
		return parent.storesMixedCaseQuotedIdentifiers();
	}

	public boolean storesUpperCaseIdentifiers() throws SQLException {
		return parent.storesUpperCaseIdentifiers();
	}

	public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
		return parent.storesUpperCaseQuotedIdentifiers();
	}

	public boolean supportsAlterTableWithAddColumn() throws SQLException {
		return parent.supportsAlterTableWithAddColumn();
	}

	public boolean supportsAlterTableWithDropColumn() throws SQLException {
		return parent.supportsAlterTableWithDropColumn();
	}

	public boolean supportsANSI92EntryLevelSQL() throws SQLException {
		return parent.supportsANSI92EntryLevelSQL();
	}

	public boolean supportsANSI92FullSQL() throws SQLException {
		return parent.supportsANSI92FullSQL();
	}

	public boolean supportsANSI92IntermediateSQL() throws SQLException {
		return parent.supportsANSI92IntermediateSQL();
	}

	public boolean supportsBatchUpdates() throws SQLException {
		return parent.supportsBatchUpdates();
	}

	public boolean supportsCatalogsInDataManipulation() throws SQLException {
		return parent.supportsCatalogsInDataManipulation();
	}

	public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
		return parent.supportsCatalogsInIndexDefinitions();
	}

	public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
		return parent.supportsCatalogsInPrivilegeDefinitions();
	}

	public boolean supportsCatalogsInProcedureCalls() throws SQLException {
		return parent.supportsCatalogsInProcedureCalls();
	}

	public boolean supportsCatalogsInTableDefinitions() throws SQLException {
		return parent.supportsCatalogsInTableDefinitions();
	}

	public boolean supportsColumnAliasing() throws SQLException {
		return parent.supportsColumnAliasing();
	}

	public boolean supportsConvert() throws SQLException {
		return parent.supportsConvert();
	}

	public boolean supportsConvert(int fromType, int toType)
			throws SQLException {
		return parent.supportsConvert(fromType, toType);
	}

	public boolean supportsCoreSQLGrammar() throws SQLException {
		return parent.supportsCoreSQLGrammar();
	}

	public boolean supportsCorrelatedSubqueries() throws SQLException {
		return parent.supportsCorrelatedSubqueries();
	}

	public boolean supportsDataDefinitionAndDataManipulationTransactions()
			throws SQLException {
		return parent.supportsDataDefinitionAndDataManipulationTransactions();
	}

	public boolean supportsDataManipulationTransactionsOnly()
			throws SQLException {
		return parent.supportsDataManipulationTransactionsOnly();
	}

	public boolean supportsDifferentTableCorrelationNames() throws SQLException {
		return parent.supportsDifferentTableCorrelationNames();
	}

	public boolean supportsExpressionsInOrderBy() throws SQLException {
		return parent.supportsExpressionsInOrderBy();
	}

	public boolean supportsExtendedSQLGrammar() throws SQLException {
		return parent.supportsExtendedSQLGrammar();
	}

	public boolean supportsFullOuterJoins() throws SQLException {
		return parent.supportsFullOuterJoins();
	}

	public boolean supportsGetGeneratedKeys() throws SQLException {
		return parent.supportsGetGeneratedKeys();
	}

	public boolean supportsGroupBy() throws SQLException {
		return parent.supportsGroupBy();
	}

	public boolean supportsGroupByBeyondSelect() throws SQLException {
		return parent.supportsGroupByBeyondSelect();
	}

	public boolean supportsGroupByUnrelated() throws SQLException {
		return parent.supportsGroupByUnrelated();
	}

	public boolean supportsIntegrityEnhancementFacility() throws SQLException {
		return parent.supportsIntegrityEnhancementFacility();
	}

	public boolean supportsLikeEscapeClause() throws SQLException {
		return parent.supportsLikeEscapeClause();
	}

	public boolean supportsLimitedOuterJoins() throws SQLException {
		return parent.supportsLimitedOuterJoins();
	}

	public boolean supportsMinimumSQLGrammar() throws SQLException {
		return parent.supportsMinimumSQLGrammar();
	}

	public boolean supportsMixedCaseIdentifiers() throws SQLException {
		return parent.supportsMixedCaseIdentifiers();
	}

	public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
		return parent.supportsMixedCaseQuotedIdentifiers();
	}

	public boolean supportsMultipleOpenResults() throws SQLException {
		return parent.supportsMultipleOpenResults();
	}

	public boolean supportsMultipleResultSets() throws SQLException {
		return parent.supportsMultipleResultSets();
	}

	public boolean supportsMultipleTransactions() throws SQLException {
		return parent.supportsMultipleTransactions();
	}

	public boolean supportsNamedParameters() throws SQLException {
		return parent.supportsNamedParameters();
	}

	public boolean supportsNonNullableColumns() throws SQLException {
		return parent.supportsNonNullableColumns();
	}

	public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
		return parent.supportsOpenCursorsAcrossCommit();
	}

	public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
		return parent.supportsOpenCursorsAcrossRollback();
	}

	public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
		return parent.supportsOpenStatementsAcrossCommit();
	}

	public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
		return parent.supportsOpenStatementsAcrossRollback();
	}

	public boolean supportsOrderByUnrelated() throws SQLException {
		return parent.supportsOrderByUnrelated();
	}

	public boolean supportsOuterJoins() throws SQLException {
		return parent.supportsOuterJoins();
	}

	public boolean supportsPositionedDelete() throws SQLException {
		return parent.supportsPositionedDelete();
	}

	public boolean supportsPositionedUpdate() throws SQLException {
		return parent.supportsPositionedUpdate();
	}

	public boolean supportsResultSetConcurrency(int type, int concurrency)
			throws SQLException {
		return parent.supportsResultSetConcurrency(type, concurrency);
	}

	public boolean supportsResultSetHoldability(int holdability)
			throws SQLException {
		return parent.supportsResultSetHoldability(holdability);
	}

	public boolean supportsResultSetType(int type) throws SQLException {
		return parent.supportsResultSetType(type);
	}

	public boolean supportsSavepoints() throws SQLException {
		return parent.supportsSavepoints();
	}

	public boolean supportsSchemasInDataManipulation() throws SQLException {
		return parent.supportsSchemasInDataManipulation();
	}

	public boolean supportsSchemasInIndexDefinitions() throws SQLException {
		return parent.supportsSchemasInIndexDefinitions();
	}

	public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
		return parent.supportsSchemasInPrivilegeDefinitions();
	}

	public boolean supportsSchemasInProcedureCalls() throws SQLException {
		return parent.supportsSchemasInProcedureCalls();
	}

	public boolean supportsSchemasInTableDefinitions() throws SQLException {
		return parent.supportsSchemasInTableDefinitions();
	}

	public boolean supportsSelectForUpdate() throws SQLException {
		return parent.supportsSelectForUpdate();
	}

	public boolean supportsStatementPooling() throws SQLException {
		return parent.supportsStatementPooling();
	}

	public boolean supportsStoredProcedures() throws SQLException {
		return parent.supportsStoredProcedures();
	}

	public boolean supportsSubqueriesInComparisons() throws SQLException {
		return parent.supportsSubqueriesInComparisons();
	}

	public boolean supportsSubqueriesInExists() throws SQLException {
		return parent.supportsSubqueriesInExists();
	}

	public boolean supportsSubqueriesInIns() throws SQLException {
		return parent.supportsSubqueriesInIns();
	}

	public boolean supportsSubqueriesInQuantifieds() throws SQLException {
		return parent.supportsSubqueriesInQuantifieds();
	}

	public boolean supportsTableCorrelationNames() throws SQLException {
		return parent.supportsTableCorrelationNames();
	}

	public boolean supportsTransactionIsolationLevel(int level)
			throws SQLException {
		return parent.supportsTransactionIsolationLevel(level);
	}

	public boolean supportsTransactions() throws SQLException {
		return parent.supportsTransactions();
	}

	public boolean supportsUnion() throws SQLException {
		return parent.supportsUnion();
	}

	public boolean supportsUnionAll() throws SQLException {
		return parent.supportsUnionAll();
	}

	public boolean updatesAreDetected(int type) throws SQLException {
		return parent.updatesAreDetected(type);
	}

	public boolean usesLocalFilePerTable() throws SQLException {
		return parent.usesLocalFilePerTable();
	}

	public boolean usesLocalFiles() throws SQLException {
		return parent.usesLocalFiles();
	}
	
	
}
