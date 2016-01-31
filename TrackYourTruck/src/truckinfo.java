
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class truckinfo {
	public String model ;
	public int IDtruck ;
	public int Id;
	public String type;
	public String plate;
	public String Driver;
	
	public void Truck(int Id){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from truckinfo where Id='"+Id+"'");
			
			while(rs.next()){
				Driver = rs.getString("Driver");
				plate = rs.getString("Plate");
				IDtruck = rs.getInt("IDtruck");
				type = rs.getString("Type");
				model = rs.getString("Model");
			}
			
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public String Driver(){
		return Driver;
	}
	
	public String plate(){
		return plate;
	}
	
	public int IDtruck(){
		return IDtruck;
	}
	
	public String model(){
		return model;
	}
	
	public String type(){
		return type;
	}

}
