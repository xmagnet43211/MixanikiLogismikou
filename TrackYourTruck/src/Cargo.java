

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cargo {
	public String cargoType ;
	public int Idcargo ;
	public int amount;
	
	
	public void Cargoinfo(int Id){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from cargoinfo where Id='"+Id+"'");
			
			while(rs.next()){
				cargoType = rs.getString("Cargo");
				Idcargo = rs.getInt("Id");
				amount = rs.getInt("Amount");
				
			}
			
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public String CargoType(){
		return cargoType;
	}
	
	public int Amount(){
		return amount;
	}
	

}
