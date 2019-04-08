package daniel.szakacs.talkabothomework.controller;

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
    private HelloWorldRepository helloWorldRepository;

    @Autowired
    private HelloWorldBusinessLogic helloWorldBusinessLogic = new HelloWorldBusinessLogic(helloWorldRepository);

    @GetMapping("/")
    public String getText(){
        return helloWorldBusinessLogic.getText();
    }
}
