package daniel.szakacs.talkabothomework.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import daniel.szakacs.talkabothomework.repository.HelloWorldRepository;
import daniel.szakacs.talkabothomework.service.HelloWorldBusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @GetMapping("/")
    public JSONPObject getText(){
        return new HelloWorldBusinessLogic(this.helloWorldRepository).getText();
    }
}
