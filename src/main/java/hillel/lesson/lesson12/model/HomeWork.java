package hillel.lesson.lesson12.model;



public class HomeWork {
    private Integer id;
    private Lesson lesson;
    private String description;
    private Task task;
    private Integer mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "id=" + id +
                ", lesson=" + lesson +
                ", description='" + description + '\'' +
                ", task=" + task +
                ", mark=" + mark +
                '}';
    }

    public HomeWork(Integer id, Lesson lesson, Task task) {
        this.id = id;
        this.lesson = lesson;
        this.task = task;
    }

    public HomeWork(Lesson lesson, Task task) {
        this.lesson = lesson;
        this.task = task;
    }
}
