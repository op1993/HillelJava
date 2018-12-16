package hillel.plyska.lesson6.task1;

import java.util.List;

public class Lecture {
    private  int lectureNumber;
    private  String lectureName;
    private  List<Task> tasks;

    public Lecture(int lectureNumber, String lectureName, List<Task> homeWork) {
        this.lectureNumber = lectureNumber;
        this.lectureName = lectureName;
        this.tasks = homeWork;
    }

    public Lecture() {
    }

    public int getLectureNumber() {
        return lectureNumber;
    }

    public void setLectureNumber(int lectureNumber) {
        this.lectureNumber = lectureNumber;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureNumber=" + lectureNumber +
                ", lectureName='" + lectureName + '\'' +
                ", task=" + tasks +
                '}';
    }
}
