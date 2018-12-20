package hillel.plyska.lesson6.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseController {
    Teacher teacher;
    private String courseName;
    private int lectureAmount;
    private int tasksAmount;
    private int studentsAmount;


    public CourseController(Teacher teacher, String courseName, int lectureAmount, int tasksAmount, int studentsAmount) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.lectureAmount = lectureAmount;
        this.tasksAmount = tasksAmount;
        this.studentsAmount = studentsAmount;
    }

    public CourseController() {
    }

    public static void main(String[] args) {
        CourseController courseController = new CourseController(
                new Teacher("Dd"),
                "course 1",
                2,
                2,
                3);
        CourseController courseController2 = new CourseController(
                new Teacher("Ddddd"),
                "course 2",
                32,
                4,
                5);

        Course course = courseController.createCourse();
        Course course2 = courseController2.createCourse();
        System.out.println(course2.getLectures().toString());
        System.out.println(course.getLectures().toString());
        List<Course> courses = new ArrayList<>();
        courses.add(course);
        courses.add(course2);
        System.out.println("COURSE NAME = " + course.getName());
        System.out.println("COURSE TEACHER = " + course.getTeacher());


        courseController.setAnswerForLectureTask("1", "course 1", "Lecture 1", "Task 1", "Answer 1 ", courses);
        courseController.setAnswerForLectureTask("2", "course 1", "Lecture 1", "Task 1", "Answer 12 ", courses);
//        courseController.setAnswerForLectureTask("2","course 1", "Lecture 1", "Task 2","Answer 12 ", courses);


        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");

        for (Course course1 : courses) {
            System.out.println("COURSE NAME = " + course1.getName());
            System.out.println("COURSE TEACHER = " + course1.getTeacher());
            for (Lecture lecture : course1.getLectures()) {
                System.out.println(lecture.getLectureName());
                for (Task task : lecture.getTaskList()) {
                    System.out.println(task.getTaskDescription());
                    if (task.getAnswers() != null) {
                        for (Map.Entry<Student, String> m : task.getAnswers().entrySet()) {
                            System.out.println(m.getKey().getId() + "   " + m.getValue());

                        }


                    }
                }

            }
            System.out.println("--------------------");
        }
    }

    public void printStudetnsAnswerForAllLectures(String courseName, String  studentId,List<Course>courses){
        for (Course course:courses){
            if (course.getName().equals(courseName)){
                System.out.println("COURSE : " + course.getName());
                for (Lecture lecture: course.getLectures()){
                    for (Task task : lecture.getTaskList()){
                        if (task.getAnswers() != null){
                            for (Map.Entry<Student,String> answers :task.getAnswers().entrySet()){
                                if (answers.getKey().getId().equals(studentId)){
                                    System.out.print("LECTURE : " +lecture.getLectureName());
                                    System.out.print(" TASK : " + task.getTaskDescription());
                                    System.out.print(" " + answers.getValue());
                                }
                                System.out.println();
                            }

                        }
                    }
                }
            }
        }

    }

    private List<Task> createLectureTasks() {
        List<Task> tasks = new ArrayList<>();
        for (int a = 0; a < this.tasksAmount; a++) {
            tasks.add(new Task("Task " + (a + 1)));
        }
        return tasks;
    }

    public Course createCourse() {
        return new Course(courseName, teacher, createStudents(), createLectures());
    }



    private List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        for (int a = 0; a < this.studentsAmount; a++) {
            students.add(new Student(Integer.toString(a + 1), "student " + (a + 1)));
        }
        return students;
    }

    private List<Lecture> createLectures() {
        List<Lecture> lectures = new ArrayList<>();
        for (int a = 0; a < lectureAmount; a++) {
            lectures.add(new Lecture(a + 1, "Lecture " + (a + 1), createLectureTasks()));
        }
        return lectures;
    }

    public void setAnswerForLectureTask(String studentId, String courseName, String lectureName, String taskName, String answer, List<Course> courses) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                for (Student student : course.getStudents()) {
                    if (student.getId().equals(studentId)) {
                        for (Lecture lecture : course.getLectures()) {
                            if (lecture.getLectureName().equals(lectureName)) {
                                for (Task task : lecture.getTaskList()) {
                                    if (task.getTaskDescription().equals(taskName)) {
                                        Map<Student, String> answer1;
                                        if (task.getAnswers() == null) {
                                            answer1 = new HashMap<>();
                                        } else {
                                            answer1 = task.getAnswers();
                                        }
                                        answer1.put(student, answer);
                                        task.setAnswers(answer1);
                                        break;
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
      /*private Map<Student,List<Lecture>> lectureMap(List<Student> students,List<Lecture> lectures){
        Map<Student,List<Lecture>> map =  new HashMap<>();
        for (Student student:students){
            List<Lecture> lectures2 = new ArrayList<>();
            for (int a = 0; a < lectureAmount; a++) {
                lectures2.add(new Lecture(a + 1, "Lecture " + (a+1), createLectureTasks()));
            }
            map.put(student,lectures2);
        }
        return map;
    }*/

  /*  private Course createCourse2(){
        return new Course(courseName,teacher,lectureMap(createStudents(), createLectures()));
    }*/

/*    public  void setAnswerForLectureTask(String studentId, String courseName, String lectureName, String taskName, String answer, List<Course> courses){
        for (Course course: courses) {
            if (course.getName().equals(courseName)) {
                for (Map.Entry<Student,List<Lecture>> map : course.getLectureMap().entrySet()){
                    if (map.getKey().getId().equals(studentId)){
                        for (Lecture lecture: map.getValue()){
                            if (lecture.getLectureName().equals(lectureName)){
                                for (Task task: lecture.getTaskList()){
                                    if (task.getTaskDescription().equals(taskName)){
                                        task.setAnswer(answer);
                                    }
                                }
                            }
                        }
                    }
                }
            }


        }
    }*/
}
