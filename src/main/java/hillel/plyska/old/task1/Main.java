package hillel.plyska.old.lesson6.task1;

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
        courses.add(new CourseController(teacher1 ,"Math"  ,20,3,4).createCourse());
        courses.add(new CourseController(teacher2 ,"Java",20,4,5).createCourse());
        courses.add(new CourseController(teacher3,"ololo",20,4,4).createCourse());
        CourseController courseController = new CourseController();
        courseController.setAnswerForLectureTask("3","Math", "Lecture 1" ,"Task 1", "MY FIRST ANSWER Lect 1 /1", courses);
        courseController.setAnswerForLectureTask("3","Math", "Lecture 1" ,"Task 2", "MY FIRST ANSWER Lect 1 /2", courses);
        courseController.setAnswerForLectureTask("3","Math", "Lecture 2" ,"Task 2", "MY FIRST ANSWER Lect 2 /2", courses);
        courseController.setAnswerForLectureTask("3","Math", "Lecture 3" ,"Task 2", "MY FIRST ANSWER Lect 3 /2", courses);
        courseController.setAnswerForLectureTask("2","Java", "Lecture 1" ,"Task 1", "MY FIRST ANSWER Lect 1 /1", courses);
        courseController.setAnswerForLectureTask("1","Java", "Lecture 1" ,"Task 1", "MY FIRST ANSWER Lect 1 /1", courses);

        courseController.printStudetnsAnswerForAllLectures("Math", "3" , courses);
        courseController.printStudetnsAnswerForAllLectures("Java", "2" , courses);

    }


}
