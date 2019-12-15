package pl.projekt.springwithgit.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.projekt.springwithgit.model.Person;


@RestController
public class PersonRestController {

    @GetMapping("/person")
    public Person me(){
        return new Person("adrian", "krawczyk");
    }


}
