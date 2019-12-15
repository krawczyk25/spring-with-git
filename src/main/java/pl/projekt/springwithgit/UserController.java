package pl.projekt.springwithgit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {


    @GetMapping("/home")
public String getUser(){
    return "home";
}

}
