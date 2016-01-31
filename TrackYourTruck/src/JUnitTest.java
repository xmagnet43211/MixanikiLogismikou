import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {
	
	public int DrId=0;
	
	@Test
	public void login() {
		login log=new login();
		String user="kyriakos";
		String pass="43088";
		String combo="Secretary";
		log.login(user, pass, combo);
	}

	@Test
	public void driverLogin() {
		DriverID logid=new DriverID();
		String user="xristos";
		String pass="43211";
		String combo="Driver";
		logid.LogId(user, pass, combo);
		
		DrId=logid.id;
		driverInfo info= new driverInfo();
		info.driverinfo(DrId);					
	}
	
	@Test
	public void TruckInfo() {
		truckinfo truck=new truckinfo();
		truck.Truck(DrId);				
	}
	
	@Test
	public void CargoInfo() {
		Cargo cargoInfo=new Cargo();
		cargoInfo.Cargoinfo(DrId);				
	}
	
	
}
