package daniel.szakacs.talkabothomework.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import daniel.szakacs.talkabothomework.repository.HelloWorldRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldBusinessLogic {

    private HelloWorldRepository helloWorldRepository;

    public HelloWorldBusinessLogic(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    public JSONPObject getText(){
//        return new JSONPObject("text",this.helloWorldRepository.getById(Long.parseLong("1")));
        return new JSONPObject("text", "Hello World");
    }

}
