package com.testspringmvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.testspringmvc.model.User;
import com.testspringmvc.service.UserService;
//this is your Second Controller 
@Controller
public class ContactController {

	// here i am usingService Layer method
	// iss usingService method ma aapne handelForm key aander use karunga
	@Autowired
    private UserService userService;

    @ModelAttribute
    public void commonDataForModel(Model m) {
        m.addAttribute("Header", "LearnCodewith Altaf");
        m.addAttribute("Desc", "Home for programmer");
        System.out.println("Adding common data to model");
    }

    @GetMapping("/")
    public String showIndex() {
        return "contect"; // Assuming you have an index.jsp
    }

    @RequestMapping("/contact")
    public String showForm(Model m) {
        System.out.println("Creating form for Altaf Malik");
        m.addAttribute("user", new User());
        return "contact";
    }
    //jaise aapka form submit huga waise hi aapka service layer call hu jayega
    //but yaha per eaak problem ki aapne kahi per database ka configration nahi kiya hai aaur saath saath ma jitne aapne 
    //annotation used kiya hai wo unable nahi kiya hai wo bhi karna padega xml file ma jakar
    @RequestMapping(path="/processform",method=RequestMethod.POST)
    public String handleForm(@ModelAttribute("user") User user, Model model) {
        System.out.println("User object data: " + user);
        //here i am getting message
         int  altaf_createUser= this.userService.createUser(user);
         model.addAttribute("message","User create with id"+altaf_createUser);
        return "success"; // Assuming you have a success.jsp
        //Step(1)userService ka create method call huga user lakar yaha sa jayega 
       // matlab ya UserService ma jayega
    }
}
