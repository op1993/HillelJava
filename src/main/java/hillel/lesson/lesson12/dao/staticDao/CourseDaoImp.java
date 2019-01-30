package hillel.lesson.lesson12.dao.staticDao;

import hillel.lesson.lesson12.dao.interfacates.CourseDao;
import hillel.lesson.lesson12.model.Course;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CourseDaoImp  implements CourseDao {
   private static Map<Integer, Course> courses =new LinkedHashMap<>();
 private   static int i=0;
    @Override
    public Course create(Course course) {
        int id = i++;
        course.setId(i++);
        courses.put(id,course);
        return course;
    }

    @Override
    public void update(Course course) {
        Integer id = course.getId();
        courses.put(id,course);
    }

    @Override
    public void delete(Course course) {
       courses.remove(course.getId());
    }

    @Override
    public Course findById(Integer id) {
        return courses.get(id);
    }

    @Override
    public List<Course> getAll() {
//        List<Course> ret  = new ArrayList<>();
//       for (Map.Entry<Integer, Course> courseEntry : courses.entrySet()){
//            ret.add(courseEntry.getValue());
//        }
        return new ArrayList<>(courses.values());
    }
}
