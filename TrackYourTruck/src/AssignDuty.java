
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AssignDuty {
	public String name ;
	public int age ;
	public int license;
	public String available;
	
	public void Assign(int Id, String CargoScr, String Destination, int Amount){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Update routeinfo set Destination='"+Destination+"' where Id='"+Id+"'");
			stmt.executeUpdate("Update cargoinfo set Cargo='"+CargoScr+"' where Id='"+Id+"'");
			stmt.executeUpdate("Update cargoinfo set Amount='"+Amount+"' where Id='"+Id+"'");
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	

}
