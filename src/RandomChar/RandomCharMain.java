package RandomChar;

import RandomNumber.RandomNumberC;

import java.util.HashSet;
import java.util.Set;

public class RandomCharMain {

    public static void main(String[] args) {
        RandomCharC rndc = new RandomCharC();

        Set<Character> characters = new HashSet<>();

        for(int i = 0; i < 50; i++) {
            char rndAlpha = rndc.generate();
            System.out.print(rndAlpha + " ");
            characters.add(rndAlpha);
        }

        System.out.print("\n랜덤한 알파벳 중복제거 : ");
        System.out.println(characters);
        }
    }

