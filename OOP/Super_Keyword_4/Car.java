package Super_Keyword_4;

public class Car extends Vehicle {
    int gear;

    Car(String c, double w, int g) {
        super(c, w);
        gear = g;
    }

    void display() {
        super.display();
        System.out.println("Gear: " + gear);
    }
}
