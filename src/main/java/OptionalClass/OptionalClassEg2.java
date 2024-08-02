package OptionalClass;

import java.util.Optional;
import java.util.OptionalInt;

class Student {

    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class OptionalClassEg2 {

    public static void main(String[] args) {

        Student student = new Student("Alice", 1);

        Optional<Student> studentOptional = Optional.ofNullable(student);

        studentOptional.ifPresent(s -> System.out.println("found : "+ s));

        //Assiging null values
        Student absentStudent = null;

        Optional<Student> AbsentStudentOptional = Optional.ofNullable(absentStudent);

        // IF-ELSE

        AbsentStudentOptional.ifPresentOrElse(
                s -> System.out.println("Student found: " + s),
                () -> System.out.println("Student not found")
        );
    }
}
