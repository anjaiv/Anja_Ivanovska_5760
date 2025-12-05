import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    // Method for creating a student
    public static Student createStudent(String name, int indexNo, int age) {
        return new Student(name, indexNo, age);
    }

    // Method for printing student data
    public static void printValues(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("Index No: " + s.indexNo);
        System.out.println("Age: " + s.age);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

// List of 5 names
        List<String> names = Arrays.asList("Ana", "Stefan", "Elena", "Marko", "Jana");

        Random rnd = new Random();

// Using stream.map to create Student objects
        List<Student> students = names.stream()
                .map(name -> createStudent(
                        name,
                        rnd.nextInt(10000) + 1, // random index between 1–10000
                        rnd.nextInt(13) + 18 // random age between 18–30
                ))
                .collect(Collectors.toList());

// Print all student values
        students.forEach(Demo::printValues);
    }
}

