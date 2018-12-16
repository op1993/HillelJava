package hillel.plyska.lesson6.task1;

import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> students;
    private List<Lecture> lectures;

    public Course(String name, Teacher teacher, List<Student> students, List<Lecture> lectures) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
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

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                ", lectures=" + lectures +
                '}';
    }

}


