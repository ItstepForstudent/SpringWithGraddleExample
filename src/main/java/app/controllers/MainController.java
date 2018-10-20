package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String actionMain(Model model){
        model.addAttribute("a","xxxxx");
        return "index";
    }
}
