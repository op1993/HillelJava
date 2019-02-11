package hillel.lesson.old.lesson14;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import hillel.lesson.old.lesson12.model.*;
import org.apache.commons.io.IOUtils;
import javax.xml.bind.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static void ioUtils() throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\plysk\\Desktop\\jen.txt");
        FileOutputStream out = new FileOutputStream("someText2.txt");
        BufferedInputStream bufferedInputStream = IOUtils.buffer(in);
        BufferedOutputStream bufferedOutputStream  = IOUtils.buffer(out);
        IOUtils.copy(bufferedInputStream,bufferedOutputStream);
        bufferedOutputStream.flush();
//        String some_text1 = "some text";
//        InputStream someText = IOUtils.toInputStream(some_text1, Charset.defaultCharset());
//        IOUtils.copy(someText,new FileOutputStream("someText.txt"));
    }

    public static void main(String[] args) throws IOException, JAXBException {
//        ioUtils();
//        jaxb();
        jacksonXml();
    }

    private static void jaxb() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Course.class);
//        Marshaller marshaller = jaxbContext.createMarshaller();
//        Course course =getCourse();
//        marshaller.marshal(course,new File("courseXML.xml"));

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object obj = unmarshaller.unmarshal(new File("courseXML.xml"));
        Course course = (Course) obj;
        System.out.println(course);
    }

    private static void jacksonXml() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());
        xmlMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        Course course =getCourse();
        System.out.println(course.toString());
        xmlMapper.writeValue(new File("courseJackson2.xml"),course);
//        Course course1 = xmlMapper.readValue(new File("courseJackson1.xml"),Course.class);
//        System.out.println(course1);
    }


    private static Course getCourse() {

        List<Task> tasks = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Task(x, "Task " + x)
                ).collect(Collectors.toList());

        List<Lesson> lessons = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Lesson(x, "Lesson " + x)
                ).collect(Collectors.toList());

        List<Student> students = IntStream.rangeClosed(1, 5)
                .mapToObj(x -> new Student(x, "Student " + x,
                        getHomeworks(lessons, tasks))
                ).collect(Collectors.toList());
        return new Course(1, "course " + 1, lessons,
                new Teacher(), students, tasks);
    }

    private static List<HomeWork> getHomeworks(
            List<Lesson> lessons,
            List<Task> tasks) {
        int id = 1;
        List<HomeWork> result = new ArrayList<>();
        for (Lesson lesson : lessons) {
            for (Task task : tasks) {
                result.add(new HomeWork(id++, lesson
                        , task));
            }
        }
        return result;
    }
}
