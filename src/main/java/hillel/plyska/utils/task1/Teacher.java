package hillel.plyska.utils.task1;

public class Teacher {
    String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher='" + teacherName + '\'' +
                '}';
    }
}
