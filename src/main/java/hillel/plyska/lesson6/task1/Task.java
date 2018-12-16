package hillel.plyska.lesson6.task1;

public class Task {
    private String name;
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String tasks) {
        this.name = tasks;
    }

    public Task(String tasks) {
        this.name = tasks;
    }

    public Task() {
    }


    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
