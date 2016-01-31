

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RouteInfo {
	public String position ;
	public String destination ;
	
	
	public void Route(int Id){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from routeinfo where Id='"+Id+"'");
			
			while(rs.next()){
				position = rs.getString("Position");
				destination = rs.getString("Destination");
				
			}
			
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public String Position(){
		return position;
	}
	
	public String Destination(){
		return destination;
	}
	

}
