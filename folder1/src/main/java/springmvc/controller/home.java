package springmvc.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class home {
	@RequestMapping("/")
	public String homePage(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Durgesh Tiwari");
		model.addAttribute("id","112");
		 List<String> friends=new ArrayList<String>();
		 friends.add("vandhana");
		 friends.add("roshni");
		 friends.add("ABC");
		 
		 model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/NewFile")
	public String callWelcomePage() {
		return "NewFile";
	}
	@RequestMapping("/login")   //ye routhe kuch bhi ho skta hai 
	public String callloginPage() {
		return "login";
	}
	@RequestMapping("/help")   //ye routhe kuch bhi ho skta hai 
	public ModelAndView callhelpPage() {
		System.out.println("this is help controller");
		//creating model and view object 
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Uttam Kumar");
		modelAndView.addObject("rollnumber",123456);

        LocalDateTime now= LocalDateTime.now();
        modelAndView.addObject("time",now);
     
        modelAndView.setViewName("help");
        
	       //masrk s  
	
	                                                                                                                                                                                                                 
	List<Integer> list=new ArrayList<Integer>();
	list.add(12); 
	list.add(1234);
	list.add(1235);
	list.add(1224);
	list.add(1224);
	modelAndView.addObject("marks",list);

	
	
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	
}
