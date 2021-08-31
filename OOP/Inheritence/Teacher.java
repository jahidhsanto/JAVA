package Inheritence;

public class Teacher extends Person {
/*
    Here all are hidden which is in person class

    String name;
    int age;
    void displayInformation1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
*/

    String qualification;

    void displayInformation2() {
        displayInformation1();
        System.out.println("Qualification: " + qualification);
    }
}
