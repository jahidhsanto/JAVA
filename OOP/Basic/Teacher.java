package Basic;

public class Teacher {
    String name, gender;
    int number;

    void getInformation(String nam, String gen, int num) {
        name = nam;
        gender = gen;
        number = num;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Number: " + number);
    }
}
