package Static_Variable;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("Jahid",201002463);
        Student s2=new Student("Badhon",201002032);

        s1.display_information();

        s2.display_information();

        System.out.println("Total number of student: "+Student.count);


        // If we want to access a static variable then no need any object.
        // We can directly access using by class name.

        System.out.println("\nThis is from Static: "+Student.university_name);

        System.out.println(s1.display1());
        System.out.println(Student.display2());
    }
}
