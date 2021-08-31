package Static_Variable;

public class Student {
    String name;
    int id;
    static String university_name = "GUB";

    static int count=0;

    Student(String n, int i) {
        name = n;
        id = i;
        count++;
    }

    void display_information() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + university_name);
    }

    String display1(){
        return "I am from non Static";
    }
    static String display2(){
        return "I am from Static";
    }

}
