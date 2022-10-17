package File;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("d:\\file.txt")        );
        String str;        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();            }

}
