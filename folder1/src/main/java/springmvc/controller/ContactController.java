package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	private static final String RequestMathod = null;

	@Autowired
	private UserService userService;
	
	

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("hii");
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handelForm(@ModelAttribute("user") User user,Model model) //ye user ke objet me apne aap fields ki values dal dega to user ka object create krne ki jrut nahi hai
	//and apne aap hi isne  user ka object model bhi set kr diya 
	{
		System.out.println(user);
		this.userService.createUser(user);
		//@RequestParam(name="email",required=false) String UserEmail,
		// handelForm(HttpServletRequest request)
	//like that we use in servlet String email= (String)request.getParameter("email");
//	System.out.println("this is email="+UserEmail);
//	System.out.println("this is name="+UserName);
//	System.out.println("this is password="+UserPassword);
//		
		//@ModelAttribute  out model is user and user 1 object hoga and usme hum email,nam,password ko al dege to user ki calss bhi bnegi and fir field bhi bnegi 
		
	//and then succeess pe hum jo model ke through multipal times data de rhe the us jgh hum simply object bhej dege 
	
	

//model.addAttribute("email", UserEmail);//isme key=field,obj=var
//model.addAttribute("name", UserName);
//model.addAttribute("password", UserPassword);
		return "success";
		}

}
/*
 @RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handelForm(
			@RequestParam("email") String UserEmail,
			@RequestParam("name") String UserName,
		    @RequestParam("password") String UserPassword,
			Model model		)
	{System.out.println("this is email="+UserEmail);
//	System.out.println("this is name="+UserName);
//	System.out.println("this is password="+UserPassword);
 * model.addAttribute("email", UserEmail);//isme key=field,obj=var
//model.addAttribute("name", UserName);
//model.addAttribute("password", UserPassword);
 User user=new User();
	user.setEmail(UserEmail);
	user.setName(UserName);
	user.setPassword(UserPassword);
	//and then succeess pe hum jo model ke through multipal times data de rhe the us jgh hum simply object bhej dege 
	
	model.addAttribute("user",user);
	
	 */
