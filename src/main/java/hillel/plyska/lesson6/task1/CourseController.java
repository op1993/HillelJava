package hillel.plyska.lesson6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CourseController {
    Teacher  teacherName;
    private String courseName;
    private int amountOfAvailableTeachers;
    private int lectureAmount;
    private int tasksAmount;
    private int studentsAmount;


    public CourseController(String courseName, Teacher teacherName, int lectureAmount, int tasksAmount, int studentsAmount) {
       this.teacherName = teacherName;
       this.courseName = courseName;
        this.lectureAmount = lectureAmount;
        this.tasksAmount = tasksAmount;
        this.studentsAmount = studentsAmount;
    }

    private   List<Student> createStudents(){
        List<Student> students = new ArrayList<>();
        for (int a =0; a < this.studentsAmount;a++){
            String value = Integer.toString(a+1);
            students.add(new Student(value,"Student " + a+1));
        }
        return students;
    }

//    private Teacher createTeacher(){
//       List<String> availableTeacher =new ArrayList<>();
//       for (int a =1; a <= this.amountOfAvailableTeachers; a++){
//           availableTeacher.add("Teacher " +a);
//       }
//       int randomTeacher = new Random().nextInt(availableTeacher.size());
//       return new Teacher(availableTeacher.get(randomTeacher));
//    }

    private List<Task> createTasksForLecture(){
        List<Task> tasks = new ArrayList<>();
        for (int a =1; a <=this.tasksAmount; a++ ){
            tasks.add(new Task("Task " + a));
        }
        return tasks;
    }

    private List<Lecture> createLecturesWithTasks(){
        List<Lecture> lectures = new ArrayList<>();
        for (int  a =1; a<=this.lectureAmount ;a++){
            lectures.add(new Lecture(a,"Lecture "+ a, createTasksForLecture()));
        }
        return lectures;
    }

    public  Course createCourses(){
        return  new Course(this.courseName,this.teacherName,createStudents(),createLecturesWithTasks());
    }

    public  void setAnswerForLectureTask(String studentId, String courseName, String lectureName, String taskName, String answer, List<Course> courses){
        for (Course course : courses){
            if (course.getName().equals(courseName)){
                for (Student student1 :course.getStudents()){
                    if (student1.getId().equals(studentId)){
                        for (Lecture lecture1:course.getLectures()){
                            if (lecture1.getLectureName().equals(lectureName)){
                                for (Task task1:lecture1.getTasks()){
                                    if (task1.getName().equals(taskName)){
                                        task1.setAnswer(answer);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void printStudentProgressForCourse(String studentId, String courseName, List<Course> courses){
        for (Course course: courses){
            if (course.getName().equals(courseName)){
                for (Student student :course.getStudents()){
                    if (student.getId().equals(studentId)){
                        System.out.println(course.getLectures().toString());

                    }
                }
            }
        }
    }

    public void printStudentProgressPerTeacher(String teacherName,String studentId, String courseName, List<Course>courses ){
        for (Course course: courses){
            if (course.getName().equals(courseName) && course.getTeacher().teacherName.equals(teacherName)){
                for (Student student :course.getStudents()){
                    if (student.getId().equals(studentId)){
                        System.out.println(course.toString());
                    }
                }
            }
        }
    }

    public CourseController() {
    }
}
