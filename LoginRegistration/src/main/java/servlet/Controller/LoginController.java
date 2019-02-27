package servlet.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import DatabaseDao.loginDao;
@Controller
public class LoginController
{
	@RequestMapping("/login.htm")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res,
			@ModelAttribute("loginPojo") LoginPojo poj) throws Exception 
	{
		// TODO Auto-generated method stub
		String UserName = poj.getUs();
		String Password = poj.getPass();
		System.out.println("in logincontroller");
		loginDao dao = new loginDao();
		boolean cm = dao.LoginDet(UserName, Password);
		System.out.println(cm);
		ModelAndView mv = null;
		if(cm)
		{
			 System.out.println("going to home");
			 mv = new ModelAndView("Home");
			 mv.addObject("sam", UserName);
		}
		else
		{
			 System.out.println("Going to registration");
			 mv = new ModelAndView("Registration");
		}
		return mv;
	}
	@RequestMapping("/loginGet.htm")
	public ModelAndView loginGet(HttpServletRequest req, HttpServletResponse res,@ModelAttribute("loginPojo") LoginPojo poj) throws Exception 
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
}
