package OptionalFifthTask;

import java.io.*;

public class Reverse {

    public static void main(String args[]) throws Exception {
        String str;

        FileReader fileReader = new FileReader("before.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("after.java");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while((str = bufferedReader.readLine()) != null) {
            for( int i = str.length() - 1 ; i >= 0; i--)
                bufferedWriter.write(str.charAt(i));
                bufferedWriter.write("\r\n");
        }
        fileReader.close();
        bufferedWriter.close();
    }
}