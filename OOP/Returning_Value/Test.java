package Returning_Value;

public class Test {
    public static void main(String[] args) {
        ReturningValue ob1=new ReturningValue();

        int result=ob1.square(5);
        System.out.println("Square of 5: "+result);

        System.out.println("Square of 10: "+ob1.square(10));
    }
}
