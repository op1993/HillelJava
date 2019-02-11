package hillel.plyska.old.lesson6.task1;

import java.util.Map;

public class Task {
    private String taskDescription;
    private String answer;
    private Map<Student,String> answers;

    public void setAnswers(Map<Student, String> answers) {
        this.answers = answers;
    }

    public Map<Student, String> getAnswers() {
        return answers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String tasks) {
        this.taskDescription = tasks;
    }

    public Task(String tasks) {
        this.taskDescription = tasks;
    }

    public Task() {
    }


    @Override
    public String toString() {
        return "Task{" +
                "taskDescription='" + taskDescription + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
