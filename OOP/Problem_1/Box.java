package Problem_1;

public class Box {
    double height;
    double width;
    double depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol() {
        double vol = height * width * depth;

        System.out.println("Volume is: " + vol);
    }
}
