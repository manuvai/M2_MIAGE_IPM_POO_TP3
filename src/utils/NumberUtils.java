package utils;

import res.exceptions.NoStackTraceRuntimeException;

public class NumberUtils {
    private NumberUtils() {
        throw new NoStackTraceRuntimeException("Cette classe est une classe utilitaire, elle ne peut être instanciée");
    }

    public static int random(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
