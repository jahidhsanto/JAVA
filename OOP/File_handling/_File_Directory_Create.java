package Test;

import java.io.File;
import java.util.Scanner;

public class _File_Directory_Create {
    public static void main(String[] args) {
        File dir = new File("D:\\GUB\\5th Semester\\CSE 202\\LAB_CLASS\\src\\Test\\person");
        dir.mkdir();
        System.out.println(dir.getAbsolutePath());
        File file1 = new File(dir.getAbsolutePath() + "\\Student.txt");
        File file2 = new File(dir.getAbsolutePath() + "\\teacher.txt");

        if (file1.exists()) {
            System.out.println("File exist");
        } else {
            try {
                file1.createNewFile();
                file2.createNewFile();
                System.out.println("Files are created.");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
