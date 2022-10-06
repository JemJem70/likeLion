package RandomChar;

import java.util.Random;

public class RandomCharC implements RandomCharI{

    @Override
    public char generate() {
        return (char) ((int) (Math.random() * 26) + 65);
    }
}
