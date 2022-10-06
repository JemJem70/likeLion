package RandomNumber;

public class RandomNumberC implements RandomNumber{

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
