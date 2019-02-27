package servlet.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;


import DatabaseDao.RegistrationDao;

@Controller
public class RegistrationController {

	@RequestMapping("registration.htm")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res,@ModelAttribute("registrationPojo") RegistrationPojo poj) throws Exception {
		// TODO Auto-generated method stub
		String UserName = poj.getUserName();
		String Password = poj.getPassword();
		String Name = poj.getName();
		String University = poj.getUniversity();
		String Phone = poj.getPhone();
		String Emer = poj.getEmer();
		String State = poj.getState();
		String Country = poj.getCountry();
		
		RegistrationDao rd = new RegistrationDao();
		rd.register(UserName, Password, Name, University, Phone, Emer, State, Country);
		rd.userReg(UserName, Password);
		
		ModelAndView mv = new ModelAndView("Registration");
		mv.addObject("msg", "Registration Sucessfull");
		return mv;
	}
//	@RequestMapping("/registrationGet.htm")
//	public ModelAndView registrationGet(HttpServletRequest req, HttpServletResponse res,@ModelAttribute("registrationPojo") RegistrationPojo poj) throws Exception {
//		ModelAndView mv = new ModelAndView("Registration");
//		mv.addObject("msg", "Registration Sucessfull");
//		return mv;
//		
//	}

}
