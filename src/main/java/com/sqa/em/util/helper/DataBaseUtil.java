/**
 * File Name: DataBaseUtil.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 20, 2016
 */
package com.sqa.em.util.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * DataBaseUtil //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0l
 */
public class DataBaseUtil {

	// TODO: Change this to be a class... so it is universall or something like
	// that
	private Connection databaseConnection;

	private Statement statement;

	private ResultSet resultsSet;

	private String jdbcConnectors;

	private String queryStament;

	private String dbClassName;

	private String dbPassword;

	private String dbUser;

	DataBaseUtil() {
		setDbClassName("com.mysql.jdbc.Driver");
		setJdbcConnectors("jdbc:mysql://localhost:8889/shopping");
		setDbPassword("root");
		setDbUser("root");
		try {
			setStatement(getDatabaseConnection().createStatement());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setQueryStament("SELECT * FROM users");
	}

	DataBaseUtil(Connection dbconn, Statement stmt, String password, String userName) {
	}

	public String[] getData() {
		String[] userDetails = new String[2];
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.databaseConnection =
					DriverManager.getConnection("jdbc:mysql://localhost:8889/shopping", "root", "root");
			this.statement = this.databaseConnection.createStatement();
			this.resultsSet = this.statement.executeQuery("SELECT * FROM users");
			while (this.resultsSet.next()) {// resultsSet.getMetaData().getColumnCount();
											// //Will get the Count of rows
				userDetails[0] = this.resultsSet.getString(3);
				userDetails[1] = this.resultsSet.getString(2);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		try {
			this.resultsSet.close();
			this.statement.close();
			this.databaseConnection.close();
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		return userDetails;
	}

	/**
	 * @return the databaseConnection
	 */
	public Connection getDatabaseConnection() {
		return this.databaseConnection;
	}

	/**
	 * @return the dbClassName
	 */
	public String getDbClassName() {
		return this.dbClassName;
	}

	/**
	 * @return the dbPassword
	 */
	public String getDbPassword() {
		return this.dbPassword;
	}

	/**
	 * @return the dbUser
	 */
	public String getDbUser() {
		return this.dbUser;
	}

	/**
	 * @return the jdbcConnectors
	 */
	public String getJdbcConnectors() {
		return this.jdbcConnectors;
	}

	/**
	 * @return the queryStament
	 */
	public String getQueryStament() {
		return this.queryStament;
	}

	/**
	 * @return the resultsSet
	 */
	public ResultSet getResultsSet() {
		return this.resultsSet;
	}

	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return this.statement;
	}

	public void main(String[] args) {
		System.out.println(Arrays.deepToString(getData()));
	}

	/**
	 * @param databaseConnection
	 *            the databaseConnection to set
	 */
	public void setDatabaseConnection(Connection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	/**
	 * @param dbClassName
	 *            the dbClassName to set
	 */
	public void setDbClassName(String dbClassName) {
		this.dbClassName = dbClassName;
	}

	/**
	 * @param dbPassword
	 *            the dbPassword to set
	 */
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	/**
	 * @param dbUser
	 *            the dbUser to set
	 */
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	/**
	 * @param jdbcConnectors
	 *            the jdbcConnectors to set
	 */
	public void setJdbcConnectors(String jdbcConnectors) {
		this.jdbcConnectors = jdbcConnectors;
	}

	/**
	 * @param queryStament
	 *            the queryStament to set
	 */
	public void setQueryStament(String queryStament) {
		this.queryStament = queryStament;
	}

	/**
	 * @param resultsSet
	 *            the resultsSet to set
	 */
	public void setResultsSet(ResultSet resultsSet) {
		this.resultsSet = resultsSet;
	}

	/**
	 * @param statement
	 *            the statement to set
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
}
