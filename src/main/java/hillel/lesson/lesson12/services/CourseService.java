package hillel.lesson.lesson12.services;

import hillel.lesson.lesson12.dao.interfacates.CourseDao;
import hillel.lesson.lesson12.dao.staticDao.CourseDaoImp;
import hillel.lesson.lesson12.model.Course;
import hillel.lesson.lesson12.model.Lesson;
import hillel.lesson.lesson12.model.Student;

import java.util.List;

public class CourseService {
    private  static CourseDao courseDao = new CourseDaoImp();
    public static Course saveAllCources(Course course){
        List<Lesson> lessons = course.getLessons();
        List<Student> students = course.getStudents();
        return courseDao.create(course);
    }
}
