package daniel.szakacs.talkabothomework.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @GetMapping("/get_text")
    public JSONPObject getText(){
        return new DataBaseManager(this.helloWorldRepository).getText();
    }
}
