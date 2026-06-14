package pixel.academy.thymeleaf_app.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    //AICI VOM CREA MAPPING-UL PENTRU "/HELLO"

    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "helloworld";
    }

    @GetMapping("/greetingNewForm")
    public String generateGreeting(@RequestParam("studentName") String theName, Model model) {

        //TRANSFORM THE INPUT TO UPPERCASE

        //transform the input to uppercase
        theName = theName.toUpperCase();

        // build the response message
        String result = "sUBMISSION SUCCESSFUL. uSER^:" + theName;

        //add the message to the model
        model.addAttribute("message", result);
        return "helloworld";

    }



}
