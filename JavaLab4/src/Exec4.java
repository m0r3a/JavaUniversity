import java.util.Arrays;

// using the Person.java | Student.java | Professor.java classes


public class Exec4 {
    public static void main(String[] args) {
        Person person = new Person("Ion","ion@mail.com");
        Student student = new Student("Andrei","andrei@mail.com", new int[]{10,8,9});
        Teacher teacher = new Teacher("Angela","angela@mrail.com",new String[]{"Math","English"});

        System.out.println(person.getName());
        System.out.println(Arrays.toString(student.getGrades()));
        System.out.println(Arrays.toString(teacher.getCourses()));

    }
}