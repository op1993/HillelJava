package hillel.plyska.newFolder;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Jackson {


    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Employee> employees = new ArrayList<>();
        Employee employee1 =  new Employee("Alex", "B", 40);
        Employee employee2 =  new Employee("A", "B", 45);
        Employee employee3 =  new Employee("Alexandra", "B", 20);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        objectMapper.writeValue(new File("file.json"),employees);

    }




    private static class Employee {
    String name;
    String lastName;
    int age;

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public Employee(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
    }

}
