package golfstatz.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Connect() {
		try {
			_conn = DriverManager.getConnection(_connectionString, _props);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
