package Basic;

public class Constra {
    String name, gender;
    int number;

    Constra(){
        System.out.println("NO VALUE");
    }

    Constra(String nam, String gen, int num) {
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
