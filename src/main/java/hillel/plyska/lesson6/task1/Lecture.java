package hillel.plyska.lesson6.task1;

import java.util.List;
import java.util.Map;

public class Lecture {
    private  int lectureNumber;
    private  String lectureName;
    private List<Task> taskList;

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


    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Lecture(int lectureNumber, String lectureName, List<Task> taskList) {
        this.lectureNumber = lectureNumber;
        this.lectureName = lectureName;
        this.taskList = taskList;
    }
}
