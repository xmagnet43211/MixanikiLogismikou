
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DriverID {
	
	int id=0;
	
	
	public int LogId(String Username, String Password, String combobox){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			
			if(combobox=="Driver"){
				ResultSet rs = stmt.executeQuery("Select * from loginDrvr where Username='"+Username+"' and Password='"+Password+"'");	
			
				if(rs.next()){
					id=rs.getInt("Id");
				}
			}
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return id;
	}
	
}
