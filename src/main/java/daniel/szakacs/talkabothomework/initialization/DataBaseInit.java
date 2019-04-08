package daniel.szakacs.talkabothomework.initialization;

import daniel.szakacs.talkabothomework.model.HelloWorldModel;
import daniel.szakacs.talkabothomework.repository.HelloWorldRepository;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInit {

    public DataBaseInit(HelloWorldRepository helloWorldRepository) {
        helloWorldRepository.save(new HelloWorldModel("Hello World"));
    }
}
