
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class driverInfo {
	public String name ;
	public int age ;
	public int license;
	public String available;
	
	public void driverinfo(int Id){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from driverinfo where Id='"+Id+"'");
			
			while(rs.next()){
				name = rs.getString("DriverName");
				age = rs.getInt("Age");
				license = rs.getInt("License");
				available = rs.getString("availability");
			}
			
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public String DriverName(){
		return name;
	}
	
	public String Availability(){
		return available;
	}
	
	public int age(){
		return age;
	}
	
	public int License(){
		return license;
	}
	

}
