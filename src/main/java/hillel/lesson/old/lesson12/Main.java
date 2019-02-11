package hillel.lesson.old.lesson12;

import hillel.lesson.old.lesson12.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Task> tasks = IntStream.rangeClosed(1, 2).mapToObj(x -> new Task(x, "task " + x))
                .collect(Collectors.toList());

        List<Lesson> lessons = IntStream.rangeClosed(1, 5).mapToObj(x -> new Lesson(x, "lesson " + x))
                .collect(Collectors.toList());

        List<Student> students = IntStream.rangeClosed(1, 5).mapToObj(x -> new Student(x, "student " + x, getHomeworks(lessons, tasks)))
                .collect(Collectors.toList());
        List<Course> courses = IntStream.rangeClosed(1, 2).mapToObj(
                x -> new Course(x, "lesson " + x, lessons, new Teacher(), students, tasks))
                .collect(Collectors.toList());


//        Set<Teacher> teachers =
//                courses.stream().map(Course::getTeacher).distinct().collect(Collectors.toSet());
//courses.forEach(course -> {Course course1 = CourseService.saveAllCources(course).);
//    System.out.println(course1);
//});

//        for (Course course:courses){
//            course.showHomework();
//            System.out.println("----------------------------");
//        }
    }

    private static List<HomeWork> getHomeworks(List<Lesson> lessons, List<Task> tasks) {
        List<HomeWork> result = new ArrayList<>();
        int id = 1;
        for (Lesson lesson : lessons) {
            for (Task task : tasks)
                result.add(new HomeWork(id++, lesson, task));
        }
        return result;
    }

    private static List<HomeWork> getHomeworks2(List<Lesson> lessons, List<Task> tasks) {

        int id = 1;
        List<HomeWork> collect = lessons.stream().flatMap(lesson -> tasks.stream().map(task -> new HomeWork(lesson, task))).collect(Collectors.toList());
        for (HomeWork homeWork : collect) {
            homeWork.setId(id++);
        }
        return collect;
    }
}


