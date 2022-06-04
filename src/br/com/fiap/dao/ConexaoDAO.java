package br.com.fiap.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoDAO {

	private Connection connection;

	public ConexaoDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public Connection GetConnection() {
		OpenConnection();
		return this.connection;
	}

	private void OpenConnection() {
		try {
			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm92188", "080702");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void CloseConnection() {
		try {
			if (this.connection != null) {
				this.connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		public int ExecuteCommand(PreparedStatement stmt) {
			int j = 0;
			try {
				j = stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				CloseConnection();
			}
			return j;
		}

		public ResultSet GetData(PreparedStatement stmt) {
			ResultSet rs = null;
			try {
				rs = stmt.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}

		public int ExecuteProcedure(CallableStatement cs) {

			try {
				return cs.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 0;

		}
	}

