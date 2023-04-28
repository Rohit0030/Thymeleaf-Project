package ThymeleafProject.ThymeleafProject.controller;

import org.springframework.core.ReactiveTypeDescriptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about()
    {
        System.out.println("inside about handler");
        return "about";

    }


}
