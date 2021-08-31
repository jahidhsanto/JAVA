// There are 3 types of variable in Java
// 1. Local variable
// 2. Instance variable
// 3. Class / static variable

package Types_of_variable;

public class Main {
    String name;                        // Instance variable
    int id;                             // Instance variable
    static String universityName;       // Class / Static variable

    Main(String n, int i) {             // Local variable
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University: " + universityName);
    }
}
