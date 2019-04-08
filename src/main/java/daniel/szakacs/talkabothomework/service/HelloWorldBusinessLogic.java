package daniel.szakacs.talkabothomework.service;

import daniel.szakacs.talkabothomework.repository.HelloWorldRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldBusinessLogic {

    private HelloWorldRepository helloWorldRepository;

    public HelloWorldBusinessLogic(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    public String getText(){
        return helloWorldRepository.getById(Long.parseLong("1")).getText();
    }

}
