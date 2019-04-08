package daniel.szakacs.talkabothomework.repository;
import daniel.szakacs.talkabothomework.model.HelloWorldModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository <HelloWorldModel, Long>{

}
