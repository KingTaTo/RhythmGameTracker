package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {
	private Connection connection;
	private Statement statement;

	public DatabaseHandler(String url) throws SQLException {
		connection = DriverManager.getConnection(url);
		statement = connection.createStatement();
	}

	public Connection getConnection() {
		return connection;
	}

	public Statement getStatement() {
		return statement;
	}

	// Add other methods for database operations
}