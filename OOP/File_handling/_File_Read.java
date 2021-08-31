package Test;

import java.io.File;
import java.util.Scanner;

public class _File_Read {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\GUB\\5th Semester\\CSE 202\\LAB_CLASS\\src\\Test\\person\\Student.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String id = input.next();
                String name = input.next();
                System.out.println("ID: " + id + "\tName: " + name);
            }
            input.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
