package RandomNumber;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberMain {

    public static void main(String[] args) {
        RandomNumberC rdnc = new RandomNumberC();

        Set<Integer> noduple = new HashSet<>();

        for(int i=0;i<5;i++){
            int n = rdnc.generate(10);
            noduple.add(n);
        }
        System.out.println(noduple);

    }
}
