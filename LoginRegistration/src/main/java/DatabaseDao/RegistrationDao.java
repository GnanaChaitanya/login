package DatabaseDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class RegistrationDao 
{
	public void register(String UserName,String Password,String Name,String University,String PhoneNumber,String EmergencyNumber,String State,String Country)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","Nani15420904!");
			System.out.println("In registration page");
			PreparedStatement ps =con.prepareStatement("insert into RegistrationDetails (UserName, Password, Name, University, PhoneNumber, EmergencyNumber, State, Country )" + 
					" values (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1,UserName);
			ps.setString(2,Password);
			ps.setString(3, Name);
			ps.setString(4, University);
			ps.setString(5, PhoneNumber);
			ps.setString(6, EmergencyNumber);
			ps.setString(7, State);
			ps.setString(8,Country);
			ps.executeUpdate();
			System.out.println("Registration details done");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void userReg(String UserName,String Password)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","Nani15420904!");
			System.out.println("In login table");
			PreparedStatement ps =con.prepareStatement("insert into LoginDetails (UserName, Password)"+ " values (?, ?)");
			ps.setString(1,UserName);
			ps.setString(2,Password);
			ps.executeUpdate();
			System.out.println("Login details done");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
