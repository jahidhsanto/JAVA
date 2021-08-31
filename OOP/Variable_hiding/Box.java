package Variable_hiding;

public class Box {
    double height;
    double width;
    double depth;

    Box(double height, double width, double depth) {
//        In this case here hiding the instance variable
//        height = height;
//        width = width;
//        depth = depth;

//        To avoid hiding variable
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        double vol = height * width * depth;

        System.out.println("Volume is: " + vol);
    }


}
