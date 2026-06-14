package pixel.academy.thymeleaf_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //METODA PETRU A AFISA FORMULARUL HTML INITIAL

    @RequestMapping("/showForm")
    public String showForm() {

        return "helloworld-form";
    }

    //metoda care se ocupa de procerarea satelor din formularul HTML

    @GetMapping("/processForm")
    public  String processForm() {
        return "helloworld";
    }
}
