package golfstatz.dataaccess;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import golfstatz.webservice.Config;

public class ConnectionManager {
	
	private final String _connectionString;
	private final Properties _props;
	private Connection _conn;
	
	public ConnectionManager() {
		Properties props = Config.getProperties();
		_connectionString = props.getProperty("connectionstring");
		_props = new Properties();
		_props.setProperty("user", props.getProperty("user"));
		_props.setProperty("password", props.getProperty("password"));
		try {
			Class.forName("org.postgresql.Driver");
			connect();
			initDatabase();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connect() throws SQLException {
		_conn = DriverManager.getConnection(_connectionString, _props);
	}
	
	private void initDatabase() throws SQLException, IOException {
		PreparedStatement stmt = _conn.prepareStatement("SELECT * FROM information_schema.tables WHERE table_name=?");
		stmt.setString(1, "course");
		ResultSet result = stmt.executeQuery();
		if (!result.next()) {
			// tables haven't been created
			createTables();
		}
	}
	
	private void createTables() throws SQLException, IOException {
		Path path = Paths.get("", "createTables.sql");
		String createTablesText = String.join(" ", Files.readAllLines(path));
		Statement stmt = _conn.createStatement();
		stmt.executeQuery(createTablesText);

	}
}
