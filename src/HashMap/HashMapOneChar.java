package HashMap;
import java.util.regex.*;

public class HashMapOneChar {

    public static void main(String[] args) {

        String string = "asdwfacxz";

        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);

            System.out.print(c);
        }



        System.out.println(string.length());
    }

}
