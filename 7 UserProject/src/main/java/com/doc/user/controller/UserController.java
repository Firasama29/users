package com.doc.user.controller;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import com.doc.user.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.doc.user.rest.template.WebRestTemplate;

@Controller
public class UserController extends RestTemplate{
	
	WebRestTemplate webRestTemplate = new WebRestTemplate();
	
	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/users")
	public String init(HttpServletRequest req) {
		
		String url = "http://localhost:8080/users/";
		
		UserDTO[] userArray = null;
	
		try{
			userArray = webRestTemplate.getForObject(url, UserDTO[].class);
			
			Arrays.stream(userArray).forEach(user -> System.out.println(user));
			
			req.setAttribute("users", userArray);
			
		}
		catch (Exception e) {
			log.error(e.getMessage());
		}
		
		return "view";
	}
	
	
	//redirect to add-user.jsp
	@GetMapping("/add")
	public ModelAndView goToAddUser(@ModelAttribute UserDTO userDto) {
		
		ModelAndView mv = new ModelAndView("add-user");
		
		mv.addObject("users", userDto);
		
		return mv;
	}

	//add users
	@PostMapping("/add")
	public ModelAndView addUser(@ModelAttribute UserDTO userDto) {
		
		ModelAndView mv = new ModelAndView("add-user");
		
		String url = "http://localhost:8080/add";
		
		mv.addObject("userDto", userDto);
		
		userDto = webRestTemplate.postForObject(url, userDto, UserDTO.class);
		
		log.info("userDto: " + userDto);
		
		return mv;
		
	}
}
