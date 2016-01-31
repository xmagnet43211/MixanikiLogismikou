
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.ProgressMonitor;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class TrackYourTruck {

	private JFrame frame;
	private JTextField textUsr;
	private JPasswordField passwordField;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textDriverId;
	private JTextField textLicenseNum;
	private JTextField textModel;
	private JTextField textType;
	private JTextField textPlate;
	private JTextField textTruckId;
	private JTextField textDriverNm;
	private JTextField textCargo;
	private JTextField textAmount;
	private JPanel panelLogin;
	private JPanel panelDriverMain;
	private JPanel panelCargo;
	private JPanel panelRoute;
	private JPanel panelTruck;
	private JPanel panelSecretaryMain;
	private JPanel panelDriverInfo;
	private String searchDr;
	public String UsrNm;
	public String pswd;
	public String UsNm;
	public int DrId;
	public int check=0;
	public String available;
	public String combobox;
	private JTextField textField_Name_DriverInfo;
	private JTextField textField__Age_DriverInfo;
	private JTextField textField__ID_DriverInfo;
	private JTextField textField__License_DriverInfo;
	private JTextField textPosition;
	private JTextField textDestination;
	private JTable table;
	private JTextField textSearch;
	private JTable table_1;
	private JTextField textFieldDestinationSc;
	private JTextField textFieldCargoScr;
	private JTextField textFieldAmountScr;
	private JTextField textFieldAvailable;
	private JTextField textFieldAvail;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrackYourTruck window = new TrackYourTruck();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public TrackYourTruck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelLogin = new JPanel();
		panelLogin.setBackground(SystemColor.textHighlight);
		frame.getContentPane().add(panelLogin, "name_166509571649463");
		panelLogin.setLayout(null);
		panelLogin.setVisible(true);
		
		final JPanel panelDriverMain = new JPanel();
		panelDriverMain.setBackground(new Color(102, 153, 204));
		frame.getContentPane().add(panelDriverMain, "name_166511487752770");
		panelDriverMain.setLayout(null);
		panelDriverMain.setVisible(false);
		
		final JPanel panelRoute = new JPanel();
		frame.getContentPane().add(panelRoute, "name_609297740626653");
		panelRoute.setVisible(false);
		
		final JPanel panelTruck = new JPanel();
		panelTruck.setBackground(new Color(51, 102, 255));
		frame.getContentPane().add(panelTruck, "name_166515915969916");
		panelTruck.setLayout(null);
		panelTruck.setVisible(false);
		
		final JPanel panelCargo = new JPanel();
		panelCargo.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(panelCargo, "name_606618215748327");
		panelCargo.setLayout(null);
		panelCargo.setVisible(false);
		
		final JPanel panelSecretaryMain = new JPanel();
		frame.getContentPane().add(panelSecretaryMain, "name_230462630522168");
		panelSecretaryMain.setVisible(false);
		
		final JPanel panelDriverInfo = new JPanel();
		frame.getContentPane().add(panelDriverInfo, "name_230859957090529");
		panelDriverInfo.setLayout(null);
		panelDriverInfo.setVisible(false);

		final JPanel panelAssignDuty = new JPanel();
		frame.getContentPane().add(panelAssignDuty, "name_238618684383210");
		panelAssignDuty.setLayout(null);
		panelAssignDuty.setVisible(false);
		
		
		JTextPane txtpnInformationForThe = new JTextPane();
		txtpnInformationForThe.setBounds(154, 63, 328, 165);
		txtpnInformationForThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnInformationForThe.setEditable(false);
		txtpnInformationForThe.setText("                       WELCOME\r\nTo enter the Service please type in your Username and Password!! If you don't have an account please contact the Manager's office!\r\n\r\n          Manufactured By Skynet");
		panelLogin.add(txtpnInformationForThe);
		
		JLabel lblNewLabel = new JLabel("TRACK YOUR TRUCK");
		lblNewLabel.setBounds(193, 11, 262, 40);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panelLogin.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setToolTipText("What are you?");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Driver", "Secretary"}));
		comboBox.setBounds(266, 262, 94, 20);
		panelLogin.add(comboBox);
		
		textUsr = new JTextField();
		textUsr.setToolTipText("Username");
		textUsr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUsr.setBounds(266, 293, 119, 20);
		panelLogin.add(textUsr);
		textUsr.setColumns(10);
		
		JLabel lblUsrNm = new JLabel("Username :");
		lblUsrNm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsrNm.setBounds(193, 297, 67, 14);
		panelLogin.add(lblUsrNm);
		
		JLabel lblPassword = new JLabel(" Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(193, 327, 74, 14);
		panelLogin.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(266, 324, 119, 20);
		panelLogin.add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelLogin.setVisible(false);
				String logch = (String)comboBox.getSelectedItem();
				String PasswordTyped = new String(passwordField.getPassword());
				UsrNm = textUsr.getText();
				pswd = passwordField.getText();
				combobox = (String)comboBox.getSelectedItem(); 
			
				login log=new login();
				log.login(UsrNm, pswd, combobox);
				
				
				if (log.check==1){
					
					panelLogin.setVisible(false);
					panelDriverMain.setVisible(true);
					
					DriverID logid=new DriverID();
					
					logid.LogId(UsrNm, pswd, combobox);
					DrId=logid.id;
					System.out.println(DrId);
					
					driverInfo info= new driverInfo();
					info.driverinfo(DrId);
					
					textName.setText(info.DriverName());
					textAge.setText(Integer.toString(info.age));
					textDriverId.setText(Integer.toString(DrId));
					textLicenseNum.setText(Integer.toString(info.License()));
					textFieldAvailable.setText(info.Availability());
					
			
					
				}else if(log.check==2){
					
					panelLogin.setVisible(false);
					panelSecretaryMain.setVisible(true);
					
				}
				
				
			}
		});
		btnLogIn.setBounds(266, 389, 94, 40);
		panelLogin.add(btnLogIn);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Driver Info");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(240, 11, 144, 31);
		panelDriverMain.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name :\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(87, 92, 52, 25);
		panelDriverMain.add(lblNewLabel_2);
		
		JLabel lblAge = new JLabel("Age :\r\n");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setBounds(102, 146, 37, 25);
		panelDriverMain.add(lblAge);
		
		JLabel lblDriverId = new JLabel("Driver ID :\r\n");
		lblDriverId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDriverId.setBounds(60, 198, 79, 25);
		panelDriverMain.add(lblDriverId);
		
		JLabel lblLicenseNumber = new JLabel("License Number :\r\n");
		lblLicenseNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLicenseNumber.setBounds(10, 248, 129, 25);
		panelDriverMain.add(lblLicenseNumber);
		
		textName = new JTextField();
		textName.setDisabledTextColor(new Color(0, 0, 0));
		textName.setEditable(false);
		textName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textName.setBounds(149, 96, 86, 20);
		panelDriverMain.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setDisabledTextColor(new Color(0, 0, 0));
		textAge.setEditable(false);
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAge.setColumns(10);
		textAge.setBounds(149, 150, 86, 20);
		panelDriverMain.add(textAge);
		
		textDriverId = new JTextField();
		textDriverId.setDisabledTextColor(new Color(0, 0, 0));
		textDriverId.setEditable(false);
		textDriverId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDriverId.setColumns(10);
		textDriverId.setBounds(149, 202, 86, 20);
		panelDriverMain.add(textDriverId);
		
		textLicenseNum = new JTextField();
		textLicenseNum.setDisabledTextColor(new Color(0, 0, 0));
		textLicenseNum.setEditable(false);
		textLicenseNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textLicenseNum.setColumns(10);
		textLicenseNum.setBounds(149, 252, 86, 20);
		panelDriverMain.add(textLicenseNum);
		
		JLabel lblNewLabel_3 = new JLabel("Availability");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(364, 92, 92, 24);
		panelDriverMain.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Christos Giannousis\\Documents\\Eclipse\\Images\\Transport-Driver-icon.png"));
		lblNewLabel_4.setBounds(364, 143, 129, 130);
		panelDriverMain.add(lblNewLabel_4);
		
		JButton btnRoute = new JButton("Route");
		btnRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDriverMain.setVisible(false);
				panelRoute.setVisible(true);
				
				RouteInfo route=new RouteInfo();
				route.Route(DrId);
				
				textPosition.setText(route.Position());
				textDestination.setText(route.Destination());
				
			}
		});
		btnRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRoute.setBounds(128, 377, 117, 79);
		panelDriverMain.add(btnRoute);
		
		JButton btnTruck = new JButton("Truck");
		btnTruck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDriverMain.setVisible(false);
				panelTruck.setVisible(true);
				
				truckinfo truck=new truckinfo();
				truck.Truck(DrId);
				
				textModel.setText(truck.model());
				textTruckId.setText(Integer.toString(truck.IDtruck));
				textDriverNm.setText(truck.Driver);
				textType.setText((truck.type()));
				textPlate.setText(truck.plate());
				
				
			}
		});
		btnTruck.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTruck.setBounds(255, 377, 117, 79);
		panelDriverMain.add(btnTruck);
		
		JButton btnCargo = new JButton("Cargo");
		btnCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDriverMain.setVisible(false);
				panelCargo.setVisible(true);
				
				Cargo cargoInfo=new Cargo();
				cargoInfo.Cargoinfo(DrId);
				
				textCargo.setText(cargoInfo.CargoType());
				textAmount.setText(Integer.toString(cargoInfo.Amount()));
	
			}
		});
		btnCargo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCargo.setBounds(382, 377, 117, 79);
		panelDriverMain.add(btnCargo);
		
		JButton btnLogout_1 = new JButton("LogOut");
		btnLogout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login log=new login();
				log.logOUT(UsrNm, pswd, combobox);
				
				textUsr.setText("");
				passwordField.setText("");
				
				panelDriverMain.setVisible(false);
				panelLogin.setVisible(true);
				
			}
		});
		btnLogout_1.setBounds(517, 21, 89, 23);
		panelDriverMain.add(btnLogout_1);
		
		textFieldAvailable = new JTextField();
		textFieldAvailable.setBackground(new Color(255, 255, 255));
		textFieldAvailable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldAvailable.setDisabledTextColor(Color.BLACK);
		textFieldAvailable.setColumns(10);
		textFieldAvailable.setBounds(466, 96, 44, 20);
		panelDriverMain.add(textFieldAvailable);
		
		
		
		
		
		JLabel lblTruckInfo = new JLabel("Truck Info");
		lblTruckInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTruckInfo.setBounds(237, 11, 162, 31);
		panelTruck.add(lblTruckInfo);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Christos Giannousis\\Documents\\Eclipse\\Images\\mack_home_tabbedmenu_tab1_titan.png"));
		lblNewLabel_5.setBounds(25, 54, 206, 226);
		panelTruck.add(lblNewLabel_5);
		
		JLabel lblModel = new JLabel("Model :");
		lblModel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModel.setBounds(300, 89, 54, 19);
		panelTruck.add(lblModel);
		
		textModel = new JTextField();
		textModel.setEditable(false);
		textModel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textModel.setBounds(364, 90, 135, 20);
		panelTruck.add(textModel);
		textModel.setColumns(10);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType.setBounds(309, 134, 45, 19);
		panelTruck.add(lblType);
		
		textType = new JTextField();
		textType.setEditable(false);
		textType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textType.setColumns(10);
		textType.setBounds(364, 135, 135, 20);
		panelTruck.add(textType);
		
		JLabel lblLycensePlate = new JLabel("Lycense Plate :");
		lblLycensePlate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLycensePlate.setBounds(241, 179, 113, 19);
		panelTruck.add(lblLycensePlate);
		
		textPlate = new JTextField();
		textPlate.setEditable(false);
		textPlate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPlate.setColumns(10);
		textPlate.setBounds(364, 180, 135, 20);
		panelTruck.add(textPlate);
		
		JLabel lblTruckId = new JLabel("Truck ID :");
		lblTruckId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTruckId.setBounds(281, 226, 73, 19);
		panelTruck.add(lblTruckId);
		
		textTruckId = new JTextField();
		textTruckId.setEditable(false);
		textTruckId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textTruckId.setColumns(10);
		textTruckId.setBounds(364, 227, 135, 20);
		panelTruck.add(textTruckId);
		
		JLabel lblDriver = new JLabel("Driver :");
		lblDriver.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDriver.setBounds(297, 271, 57, 19);
		panelTruck.add(lblDriver);
		
		textDriverNm = new JTextField();
		textDriverNm.setEditable(false);
		textDriverNm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDriverNm.setColumns(10);
		textDriverNm.setBounds(364, 272, 135, 20);
		panelTruck.add(textDriverNm);
		
		JButton btnRoute_1 = new JButton("Route");
		btnRoute_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTruck.setVisible(false);
				panelRoute.setVisible(true);
			}
		});
		btnRoute_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRoute_1.setBounds(382, 368, 117, 79);
		panelTruck.add(btnRoute_1);
		
		JButton btnCargo_1 = new JButton("Cargo");
		btnCargo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTruck.setVisible(false);
				panelCargo.setVisible(true);
				
				Cargo cargoInfo=new Cargo();
				cargoInfo.Cargoinfo(DrId);
				
				textCargo.setText(cargoInfo.CargoType());
				textAmount.setText(Integer.toString(cargoInfo.Amount()));
			}
		});
		btnCargo_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCargo_1.setBounds(255, 368, 117, 79);
		panelTruck.add(btnCargo_1);
		
		JButton btnDriver = new JButton("Driver");
		btnDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTruck.setVisible(false);
				panelDriverMain.setVisible(true);
			}
		});
		btnDriver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDriver.setBounds(128, 368, 117, 79);
		panelTruck.add(btnDriver);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(10, 47, 360, 272);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Christos Giannousis\\Documents\\Eclipse\\Images\\deco-crate-24bit1.png"));
		panelCargo.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cargo Info");
		lblNewLabel_7.setBounds(248, 10, 140, 31);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panelCargo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cargo :");
		lblNewLabel_8.setBounds(385, 86, 53, 19);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCargo.add(lblNewLabel_8);
		
		textCargo = new JTextField();
		textCargo.setEditable(false);
		textCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCargo.setBounds(444, 87, 147, 20);
		panelCargo.add(textCargo);
		textCargo.setColumns(10);
		
		textAmount = new JTextField();
		textAmount.setEditable(false);
		textAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmount.setBounds(444, 146, 147, 20);
		textAmount.setColumns(10);
		panelCargo.add(textAmount);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setBounds(373, 145, 65, 19);
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCargo.add(lblAmount);
		
		JButton btnDriver_1 = new JButton("Driver");
		btnDriver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCargo.setVisible(false);
				panelDriverMain.setVisible(true);
			}
		});
		btnDriver_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDriver_1.setBounds(138, 379, 117, 79);
		panelCargo.add(btnDriver_1);
		
		JButton btnTruck_1 = new JButton("Truck");
		btnTruck_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCargo.setVisible(false);
				panelTruck.setVisible(true);
			}
		});
		btnTruck_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTruck_1.setBounds(265, 379, 117, 79);
		panelCargo.add(btnTruck_1);
		
		JButton btnRoute_2 = new JButton("Route");
		btnRoute_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCargo.setVisible(false);
				panelRoute.setVisible(true);
			}
		});
		btnRoute_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRoute_2.setBounds(392, 379, 117, 79);
		panelCargo.add(btnRoute_2);
		panelRoute.setLayout(null);
		
		
		
		JLabel lblRouteInfo = new JLabel("Route Info");
		lblRouteInfo.setBounds(237, 10, 139, 31);
		lblRouteInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panelRoute.add(lblRouteInfo);
		
		JButton button_Driver_Route = new JButton("Driver");
		button_Driver_Route.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRoute.setVisible(false);
				panelDriverMain.setVisible(true);
			}
		});
		button_Driver_Route.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_Driver_Route.setBounds(125, 372, 117, 79);
		panelRoute.add(button_Driver_Route);
		
		JButton button_cargo_Route = new JButton("Cargo");
		button_cargo_Route.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRoute.setVisible(false);
				panelCargo.setVisible(true);
				
				Cargo cargoInfo=new Cargo();
				cargoInfo.Cargoinfo(DrId);
				
				textCargo.setText(cargoInfo.CargoType());
				textAmount.setText(Integer.toString(cargoInfo.Amount()));
			}
		});
		button_cargo_Route.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_cargo_Route.setBounds(252, 372, 117, 79);
		panelRoute.add(button_cargo_Route);
		
		JButton btnTruck_2 = new JButton("Truck");
		btnTruck_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRoute.setVisible(false);
				
				truckinfo truck=new truckinfo();
				truck.Truck(DrId);
				
				textModel.setText(truck.model());
				textTruckId.setText(Integer.toString(truck.IDtruck));
				textDriverNm.setText(truck.Driver);
				textType.setText((truck.type()));
				textPlate.setText(truck.plate());
				
				panelTruck.setVisible(true);
				
			}
		});
		btnTruck_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTruck_2.setBounds(379, 372, 117, 79);
		panelRoute.add(btnTruck_2);
		
		textPosition = new JTextField();
		textPosition.setBounds(298, 83, 198, 31);
		panelRoute.add(textPosition);
		textPosition.setColumns(10);
		
		textDestination = new JTextField();
		textDestination.setColumns(10);
		textDestination.setBounds(298, 175, 198, 31);
		panelRoute.add(textDestination);
		
		JLabel lblPosition = new JLabel("Position :");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPosition.setBounds(165, 83, 123, 31);
		panelRoute.add(lblPosition);
		
		JLabel lblDestination = new JLabel("Destination :");
		lblDestination.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDestination.setBounds(119, 175, 169, 31);
		panelRoute.add(lblDestination);
		panelSecretaryMain.setLayout(null);
		
		JLabel label_5 = new JLabel("Driver Search");
		label_5.setBounds(311, 10, -1, 31);
		label_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		panelSecretaryMain.add(label_5);
		
		JLabel lblEnterTheId = new JLabel("Enter the Id of the Driver");
		lblEnterTheId.setBounds(205, 31, 187, 19);
		lblEnterTheId.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelSecretaryMain.add(lblEnterTheId);
		
		JButton Secretary_search = new JButton("Search");
		Secretary_search.setBounds(297, 107, 134, 36);
		Secretary_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelSecretaryMain.setVisible(false);
				panelDriverInfo.setVisible(true);
				
				int Id_sectretaryDR=0;
				Id_sectretaryDR = Integer.parseInt(textSearch.getText());
				if(Id_sectretaryDR !=0){
					
					DriverSearch drvrSearch= new DriverSearch();
					drvrSearch.driverSearch(Id_sectretaryDR);
					
					panelDriverInfo.setVisible(true);
					
					textField_Name_DriverInfo.setText(drvrSearch.DrvrNm_Sec());
					textField__Age_DriverInfo.setText(Integer.toString(drvrSearch.drvrAge()));
					textField__License_DriverInfo.setText(Integer.toString(drvrSearch.drvrLicense()));
					textField__ID_DriverInfo.setText(Integer.toString(Id_sectretaryDR));
					textFieldAvail.setText(drvrSearch.drvrAvailable());
				}
			}
		});
		Secretary_search.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelSecretaryMain.add(Secretary_search);
		
		table = new JTable();
		table.setBounds(10, 180, 600, 296);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		panelSecretaryMain.add(table);
		
		textSearch = new JTextField();
		textSearch.setBounds(174, 76, 238, 20);
		panelSecretaryMain.add(textSearch);
		textSearch.setColumns(10);
		
		table_1 = new JTable();
		table_1.setBounds(10, 164, 600, 16);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Id", "Driver Name", "Age", "License", "Availability", "Id", "Cargo", "Amount", "Id", "Position", "Destination"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSecretaryMain.add(table_1);
		
		JButton btnDisplayDrivers = new JButton("Display Drivers");
		btnDisplayDrivers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					String connectionURL = "jdbc:mysql://localhost:3306/Trucks";
					String dbusername = "root";
					String dbpassword = "43211";
					
					Connection conn= DriverManager.getConnection(connectionURL,dbusername,dbpassword);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from driverinfo inner join cargoinfo on driverinfo.Id = cargoinfo.Id inner join routeinfo on cargoinfo.Id = routeinfo.Id");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					}catch (Exception e){
						e.printStackTrace();
					}
				
			}
		});
		btnDisplayDrivers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDisplayDrivers.setBounds(153, 107, 134, 36);
		panelSecretaryMain.add(btnDisplayDrivers);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login log=new login();
				log.logOUT(UsrNm, pswd, combobox);
				
				textUsr.setText("");
				passwordField.setText("");
				
				panelSecretaryMain.setVisible(false);
				panelLogin.setVisible(true);
				
			}
		});
		btnLogout.setBounds(521, 31, 89, 23);
		panelSecretaryMain.add(btnLogout);
		
		JLabel lblDriverSearch = new JLabel("Driver Info");
		lblDriverSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblDriverSearch.setBounds(237, 11, 146, 31);
		panelDriverInfo.add(lblDriverSearch);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelDriverInfo.setVisible(false);
				panelSecretaryMain.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(323, 361, 165, 50);
		panelDriverInfo.add(btnNewButton);
		
		JLabel label = new JLabel("Name :\r\n");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(123, 121, 52, 25);
		panelDriverInfo.add(label);
		
		textField_Name_DriverInfo = new JTextField();
		textField_Name_DriverInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_Name_DriverInfo.setEditable(false);
		textField_Name_DriverInfo.setDisabledTextColor(Color.BLACK);
		textField_Name_DriverInfo.setColumns(10);
		textField_Name_DriverInfo.setBounds(185, 125, 86, 20);
		panelDriverInfo.add(textField_Name_DriverInfo);
		
		JLabel label_1 = new JLabel("Age :\r\n");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(138, 175, 37, 25);
		panelDriverInfo.add(label_1);
		
		textField__Age_DriverInfo = new JTextField();
		textField__Age_DriverInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField__Age_DriverInfo.setEditable(false);
		textField__Age_DriverInfo.setDisabledTextColor(Color.BLACK);
		textField__Age_DriverInfo.setColumns(10);
		textField__Age_DriverInfo.setBounds(185, 179, 86, 20);
		panelDriverInfo.add(textField__Age_DriverInfo);
		
		JLabel label_2 = new JLabel("Driver ID :\r\n");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(96, 227, 79, 25);
		panelDriverInfo.add(label_2);
		
		textField__ID_DriverInfo = new JTextField();
		textField__ID_DriverInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField__ID_DriverInfo.setEditable(false);
		textField__ID_DriverInfo.setDisabledTextColor(Color.BLACK);
		textField__ID_DriverInfo.setColumns(10);
		textField__ID_DriverInfo.setBounds(185, 231, 86, 20);
		panelDriverInfo.add(textField__ID_DriverInfo);
		
		JLabel label_3 = new JLabel("License Number :\r\n");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(46, 277, 129, 25);
		panelDriverInfo.add(label_3);
		
		textField__License_DriverInfo = new JTextField();
		textField__License_DriverInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField__License_DriverInfo.setEditable(false);
		textField__License_DriverInfo.setDisabledTextColor(Color.BLACK);
		textField__License_DriverInfo.setColumns(10);
		textField__License_DriverInfo.setBounds(185, 281, 86, 20);
		panelDriverInfo.add(textField__License_DriverInfo);
		
		JLabel label_4 = new JLabel("Availability");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(310, 121, 92, 24);
		panelDriverInfo.add(label_4);
		
		JButton button = new JButton("Assign");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDriverInfo.setVisible(false);
				panelAssignDuty.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(148, 361, 165, 50);
		panelDriverInfo.add(button);		
		
		textFieldAvail = new JTextField();
		textFieldAvail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldAvail.setEditable(false);
		textFieldAvail.setDisabledTextColor(Color.BLACK);
		textFieldAvail.setColumns(10);
		textFieldAvail.setBounds(412, 125, 44, 20);
		panelDriverInfo.add(textFieldAvail);
		
		JLabel lblAssignDuties = new JLabel("ASSIGN DUTIES");
		lblAssignDuties.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAssignDuties.setBounds(171, 11, 258, 39);
		panelAssignDuty.add(lblAssignDuties);
		
		textFieldDestinationSc = new JTextField();
		textFieldDestinationSc.setBounds(171, 92, 86, 20);
		panelAssignDuty.add(textFieldDestinationSc);
		textFieldDestinationSc.setColumns(10);
		
		JLabel lblDestination_1 = new JLabel("Destination :");
		lblDestination_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDestination_1.setBounds(71, 90, 90, 20);
		panelAssignDuty.add(lblDestination_1);
		
		textFieldCargoScr = new JTextField();
		textFieldCargoScr.setColumns(10);
		textFieldCargoScr.setBounds(171, 145, 86, 20);
		panelAssignDuty.add(textFieldCargoScr);
		
		JLabel lblCargo = new JLabel("Cargo :");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCargo.setBounds(108, 143, 53, 20);
		panelAssignDuty.add(lblCargo);
		
		textFieldAmountScr = new JTextField();
		textFieldAmountScr.setColumns(10);
		textFieldAmountScr.setBounds(171, 200, 86, 20);
		panelAssignDuty.add(textFieldAmountScr);
		
		JLabel lblAmount_1 = new JLabel("Amount :");
		lblAmount_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAmount_1.setBounds(93, 198, 68, 20);
		panelAssignDuty.add(lblAmount_1);
		
		JButton btnNewButton_1 = new JButton("SUBMIT DUTY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id_sectretaryDR=0;
				id_sectretaryDR = Integer.parseInt(textSearch.getText());
				
				AssignDuty assignD= new AssignDuty();
				assignD.Assign(id_sectretaryDR, textFieldCargoScr.getText(), textFieldDestinationSc.getText(), Integer.parseInt(textFieldAmountScr.getText()));
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(71, 272, 186, 39);
		panelAssignDuty.add(btnNewButton_1);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelAssignDuty.setVisible(false);
				panelSecretaryMain.setVisible(true);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearch.setBounds(368, 272, 186, 39);
		panelAssignDuty.add(btnSearch);
	}
}
