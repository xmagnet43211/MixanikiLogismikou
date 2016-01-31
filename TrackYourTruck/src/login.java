
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login {
	public int id;
	int check=0;
	
	
	public int login(String username, String password, String combobox){
		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
			
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
			
			if(combobox=="Driver"){
				ResultSet rs = stmt.executeQuery("Select * from loginDrvr where Username='"+username+"' and Password='"+password+"'");
				if(rs.next()){
					stmt.executeUpdate("Update loginDrvr set Online='1' where Username='"+username+"' and Password='"+password+"'");
					check=1;
				}
			}else if(combobox=="Secretary"){
				ResultSet rs = stmt.executeQuery("Select * from loginScr where Username='"+username+"' and Password='"+password+"'");
				if(rs.next()){
					stmt.executeUpdate("Update loginScr set Online='1' where Username='"+username+"' and Password='"+password+"'");
					check=2;
				}
			}else{
				System.out.println("Error");
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return check;
	}
	
	public int logOUT(String username, String password, String combobox){
	
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
			String dbusername = "root";
			String dbpassword = "43211";
		
			Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
			Statement stmt = conn.createStatement();
		
		
			if(combobox=="Driver"){
				ResultSet rs = stmt.executeQuery("Select * from loginDrvr where Username='"+username+"' and Password='"+password+"'");
				if(rs.next()){
					stmt.executeUpdate("Update loginDrvr set Online='0' where Username='"+username+"' and Password='"+password+"'");
					check=0;
				}
			}else if(combobox=="Secretary"){
				ResultSet rs = stmt.executeQuery("Select * from loginScr where Username='"+username+"' and Password='"+password+"'");
				if(rs.next()){
					stmt.executeUpdate("Update loginScr set Online='0' where Username='"+username+"' and Password='"+password+"'");
					check=0;
				}
			}else{
				System.out.println("Error");
		}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return check;
	}
	
}
