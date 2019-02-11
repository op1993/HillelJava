package hillel.lesson.old.lesson12.model;

import java.util.List;

public class Lesson {
    private Integer id;
    private String description;
    private List<Topic>topics;

    public Lesson() {
    }

    public Lesson(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", topics=" + topics +
                '}';
    }
}
