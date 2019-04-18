package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.servlets.JdbcConnection;

public class EmployeeDAO {
	
	public static boolean validate(String userNme, String ePass){
		
		try(Connection conn = JdbcConnection.getConnection()){
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM project_1.employee WHERE userName = ? AND ePassword = ?");
			stmt.setString(1, userNme);
			stmt.setString(2, ePass);
			ResultSet rs = stmt.executeQuery();
			
			return rs.next();
			
		}catch(SQLException e)
		{
			
		}
		
		return false;
		
	}

}
