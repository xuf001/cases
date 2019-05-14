package com.springboot.cases;

import com.springboot.cases.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({Person.class})
public class GreetingController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }



    @Value("${my.age}")
    private int age;

    @Value("${my.name}")
    private String name;

    @RequestMapping(value="/info")
    public String info(){
        return name+":"+age;
    }


    @Autowired
    @Qualifier(value = "person")
    Person persons;

    @RequestMapping(value="/lucy")
    public String search(){

        return persons.getGreering()+">>>>"+persons.getName()+">>>>>"+persons.getUuid()+">>>>>"+persons.getMax();
    }
}
