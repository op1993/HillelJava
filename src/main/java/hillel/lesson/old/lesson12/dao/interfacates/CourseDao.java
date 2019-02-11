package hillel.lesson.old.lesson12.dao.interfacates;

import hillel.lesson.old.lesson12.model.Course;

import java.util.List;

public interface CourseDao {
    Course create(Course course);
    void update(Course course);
    void delete(Course course);
    Course findById(Integer id);
    List<Course> getAll();
}
