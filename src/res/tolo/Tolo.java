package res.tolo;

import res.exceptions.InvalidEntryException;
import res.exceptions.NoStackTraceRuntimeException;
import res.grille.Grille;
import res.validator.GrilleValidator;
import utils.NumberUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tolo {
    public static final int PERMITTED_NUMBERS = 4;
    public static final int UPPER_BOUND = 20;
    public static final int LOWER_BOUND = 1;
    protected int[] numerosTires;

    protected List<Grille> grillesJouees = new ArrayList<>();

    private GrilleValidator grilleValidator = new GrilleValidator();

    public void effectuerTirage() {
        setNumerosTires(generateRandomNumbers());
    }

    public void setNumerosTires(int[] inNumerosTires) {

        if (Objects.isNull(inNumerosTires)) {
            throw new InvalidEntryException();
        }

        grilleValidator.checkEntry(inNumerosTires);

        numerosTires = inNumerosTires;
    }

    public float obtenirGain(int codeGrille) {
        Grille grilleJouee = rechercherGrilleJouee(codeGrille);

        return Objects.isNull(grilleJouee)
                ? 0
                : obtenirGain(grilleJouee);

    }

    public float obtenirGain(Grille grille) {
        if (Objects.isNull(numerosTires)) {
            throw new NoStackTraceRuntimeException("Aucun tirage effectué");
        }

        float gain = 0;

        if (Objects.nonNull(grille)) {
            int[] numerosChoisis = grille.getNombresMises();

            int correspondingNumbers = getCorrespondingNumbers(numerosTires, numerosChoisis);

            gain = getCalculatedGain(grille.getMise(), correspondingNumbers);

        }

        return gain;
    }

    protected Grille rechercherGrilleJouee(int codeGrille) {
        return grillesJouees.stream()
                .filter(grille -> codeGrille == grille.getCode())
                .findFirst()
                .orElse(null);
    }

    public void ajouterGrille(Grille grille) {
        if (Objects.nonNull(grille)) {
            grillesJouees.add(grille);

        }
    }

    private float getCalculatedGain(float mise, int correspondingNumbers) {
        int multiplier = 0;

        if (correspondingNumbers == 4) {
            multiplier = 50;

        } else if (correspondingNumbers == 3) {
            multiplier = 5;

        }

        return multiplier * mise;
    }

    private int getCorrespondingNumbers(int[] numerosTires, int[] numerosChoisis) {
        int correspondingNumbers = 0;

        for (int numeroTire : numerosTires) {
            for (int numeroChoisi : numerosChoisis) {
                if (numeroChoisi == numeroTire) correspondingNumbers++;
            }
        }

        return correspondingNumbers;
    }

    private static int[] generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        int[] randomNumbers = new int[PERMITTED_NUMBERS];

        // Initialisation de la liste de nombre à prendre
        for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            int min = 0;
            int max = numbers.size() - 1;

            int randomIndex = NumberUtils.random(min, max);

            randomNumbers[i] = numbers.remove(randomIndex);
        }

        return randomNumbers;

    }

}
