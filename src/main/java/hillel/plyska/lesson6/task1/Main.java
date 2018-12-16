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

//        courseController.printStudentProgressForCourse("3", "Math", courses);
        courseController.printStudentProgressPerTeacher("Denis", "1" , "Java", courses);


    }


}
