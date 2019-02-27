package DatabaseDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao 
{
	public boolean LoginDet(String UserName,String Pass)
	{
		boolean isAuthorized= false;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","Nani15420904!");
			PreparedStatement ps =con.prepareStatement("select * from LoginDetails where UserName=?");
			System.out.println("in login dao");
			ps.setString(1,UserName);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				isAuthorized= true;
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("going back to login controller");
		return isAuthorized;
	}
}
