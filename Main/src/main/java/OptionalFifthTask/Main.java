package OptionalFifthTask;

import java.io.*;

public class Main {
    public static final String PUBLIC = "public";
    public static final String PRIVATE = "private";
    String str;

    public void PublicToPrivate() throws IOException {
        File file = new File("Public.java");
        File ready = new File("Private.txt");

        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ready))) {

                while ((str =bufferedReader.readLine())!=null) {
                    bufferedWriter.append(str.replace(PUBLIC, PRIVATE)).append(System.lineSeparator());
                }
            }
        }

    }

}