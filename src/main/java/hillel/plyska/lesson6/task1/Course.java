package hillel.plyska.lesson6.task1;

import java.util.List;
import java.util.Map;

public class Course {
    private String name;
    private Teacher teacher;
    // TODO: 20-Dec-18 hmm, investigate  do i need here a list of students
    private List<Student> students;
    private List<Lecture> lectures;
    private Map<Student, List<Lecture>> lectureMap;

    public Course(String name, Teacher teacher, Map<Student, List<Lecture>> lectureMap) {
        this.name = name;
        this.teacher = teacher;
        this.lectureMap = lectureMap;
    }

    public Map<Student, List<Lecture>> getLectureMap() {
        return lectureMap;
    }

    public void setLectureMap(Map<Student, List<Lecture>> lectureMap) {
        this.lectureMap = lectureMap;
    }

    public Course(String name, Teacher teacher, List<Student> students, List<Lecture> lectures) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
        this.lectures = lectures;
    }

    public Course(String name, Teacher teacher, List<Lecture> lectures) {
        this.name = name;
        this.teacher = teacher;
        this.lectures = lectures;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }


}


