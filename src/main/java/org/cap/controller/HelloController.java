package org.cap.controller;

import org.cap.Service.IUserService;
import org.cap.entities.AppUser;
import org.cap.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {

	private IUserService service;
	public IUserService getService() {
		return service;
	}
	@Autowired
	public void setService(IUserService service) {
		this.service=service;
	}
		
	private AppUser appUser;

    public AppUser getAppUser() {
		return appUser;
	}
    @Autowired
	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}
	
	
	
	@GetMapping("/userinput")
    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
    public ModelAndView sayHello() {
        return new ModelAndView("userinput");
    }
@GetMapping("/userdetails")
public ModelAndView userdetails(@RequestParam("id") int id, @RequestParam("password") String password) {
	AppUser user = new AppUser(id,password);
	if(service.credentialsCorrect(id, password)) {
	ModelAndView mv = new ModelAndView("userdetails", "user", user);
	return mv;
	}else {
		return new ModelAndView("userinput");
	}
}


/*

@GetMapping("/logincheck")
public RedirectView loginCheck(@RequestParam("id") int id, @RequestParam("password") String password) {
appUser.setId(id);
appUser.setPassword(password);
if(service.credentialsCorrect(id, password)) {
	System.out.println("id="+ id+ "password"+password);
	return new RedirectView("/home");
}else {
	return new RedirectView("/userinput");
}
}

@GetMapping("/home")
public Object home() {
	if (appUser.getId()==0) {
		return new RedirectView("/userinput");
		
	}
	ModelAndView mv = new ModelAndView("home","user",appUser);
	return mv;
}*/
}
