package daniel.szakacs.talkabothomework.model;

import javax.persistence.*;

@Entity
public class HelloWorldModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "text")
    private String text;

    public HelloWorldModel(){}

    public HelloWorldModel(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}

