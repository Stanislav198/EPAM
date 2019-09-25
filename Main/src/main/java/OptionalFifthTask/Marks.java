package OptionalFifthTask;

import java.io.*;
import java.util.*;

public class Marks {

    public static void main(String[] args) throws IOException {

        String[] student;

        Scanner scanner = new Scanner(new File("Marks.txt"));
        PrintWriter printWriter = new PrintWriter(new File("Surname.txt"));


        while (scanner.hasNextLine()) {
            student = scanner.nextLine().split("\\s+");
            double sum = 0;
            for (int i = 0; i < student.length-1; i ++) {
                sum += Integer.parseInt(student[i]);
            }
            if (sum / (student.length - 1) > 7) {
                printWriter.println(student[0].toUpperCase());
            }
        }

        scanner.close();
        printWriter.close();

    }

}