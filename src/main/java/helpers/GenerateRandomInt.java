package helpers;

import java.util.Random;

public class GenerateRandomInt {

    public static int getRandomInt(Random random, int size){
        return random.nextInt(size);
    }
}
