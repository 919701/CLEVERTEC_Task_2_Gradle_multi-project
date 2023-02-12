package ru.clevertec;

import java.util.Arrays;

public class Utils {
    private Utils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isAllPositiveNumbers(String... strings) {
        return Arrays.stream(strings).allMatch(StringUtils::isPositiveNumber);
    }
}
