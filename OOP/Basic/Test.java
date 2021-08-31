package Basic;

public class Test {
    public static void main(String[] args) {

        //=====This for Teacher1 information=====//
        System.out.println("=====This for Teacher1 information=====");

        Teacher teacher1;          // Declaration an Object
        teacher1 = new Teacher();  // Create an Object

        teacher1.name = "Jahid Hassan Santo";
        teacher1.gender = "Male";
        teacher1.number = 1878959101;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Number: " + teacher1.number);


        //=====This for Teacher2 information=====//
        System.out.println("\n\n=====This for Teacher2 information=====");

        Teacher teacher2 = new Teacher();    // Declaration & Create an Object

        teacher2.name = "Jahid Hassan Santo";
        teacher2.gender = "Male";
        teacher2.number = 1878959101;

        teacher2.displayInformation();


        //=====This for Teacher3 information=====//
        System.out.println("\n\n=====This for Teacher3 information=====");

        Teacher teacher3 = new Teacher();   // Declaration & Create an Object

        teacher3.getInformation("Badhon", "Female", 1817621080);
        teacher3.displayInformation();


        //=====This for Teacher4 information=====//
        System.out.println("\n\n=====This for Teacher4 information=====");

        Constra teacher4 = new Constra("Joy", "Male", 1737980189);      // Parametrized Constructor
        teacher4.displayInformation();

        Constra teacher5=new Constra();     // Default Constructor
        teacher5.displayInformation();

    }
}
