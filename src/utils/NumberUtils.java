package utils;

public class NumberUtils {
    public static int random(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
