package task4;

import java.util.Random;

public final class RandomUtil {
    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getRandom(int value) {
        return RANDOM.nextInt(value);
    }
}
