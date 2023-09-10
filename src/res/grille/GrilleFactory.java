package res.grille;

import utils.NumberUtils;

import java.util.ArrayList;
import java.util.List;

public class GrilleFactory {

    public static Grille generateGrille() {
        int[] randomNumbers = generateRandomNumbers();

        return new Grille(randomNumbers);
    }

    private static int[] generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        int[] randomNumbers = new int[Grille.PERMITTED_NUMBERS];

        // Initialisation de la liste de nombre à prendre
        for (int i = Grille.LOWER_BOUND; i <= Grille.UPPER_BOUND; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            int min = 0;
            int max = numbers.size();

            int randomIndex = NumberUtils.random(min, max);

            randomNumbers[i] = numbers.remove(randomIndex);
        }

        return randomNumbers;

    }
}
