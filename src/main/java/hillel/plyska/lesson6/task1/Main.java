package hillel.plyska.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
* Создать систему классов школы Hillel.
В системе должны присутсвовать курсы,студенты,преподаватели, уроки, темы уроков, задания .
Предусмотреть что преподаватель может вести несколько курсов и студент может посещать несколько курсов.
Также создать методы для просмотра
выполненых заданий для студента и для преподавателя по студентам.
*/

    public static List<Student> createStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("1","Student 1"));
        return students;
    }

    public static Teacher createTeacher(){
        return new Teacher("Pupkin");
    }

    public static List<Course> createCourse(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));

        List<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(1,"lecture 1", tasks));


        List<Course> courses = new ArrayList<>();
        Course course = new Course("course 1", createTeacher(),createStudents(),lectures);
        courses.add(course);
        return courses;
    }

    public static void  setHomeWork(String student, String course, String lecture,String task, List<Course> courses){
        for (Course course1 : courses){
            if (course1.getName().equals(course)){
              for (Student student1 :course1.getStudents()){ ;
                  if (student1.getId().equals(student)){
                      for (Lecture lecture1:course1.getLectures()){

                          if (lecture1.getLectureName().equals(lecture)){
                              for (Task task1:lecture1.getTasks()){
                                  if (task1.getName().equals(task)){
                                      System.out.println("sds");
                                      task1.setAnswer("first answer");
                                      System.out.println("ddfdfd");
                                  }
                              }
                          }
                      }
                  }
              }
            }

        }
    }


    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        Teacher teacher1 =  new Teacher("Oleh");
        Teacher teacher2 =  new Teacher("Denis");
        Teacher teacher3 =  new Teacher("Alex");
      courses.add(new CourseController("Math" , teacher1,10,2,20).createCourses());
      courses.add(new CourseController("Java", teacher2,20,3,5).createCourses());
      courses.add(new CourseController("Logistics",teacher3,14,4,4).createCourses());

      CourseController courseController = new CourseController();
      courseController.setAnswerForLectureTask("3","Math", "Lecture 1" ,"Task 1", "MY FIRST ANNSWER", courses);

      courseController.printStudentProgressForCourse("3", "Math", courses);


    }


}
