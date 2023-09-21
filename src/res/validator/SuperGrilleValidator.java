package res.validator;

import res.exceptions.InvalidLuckNumberOuterBoundException;
import res.tolo.SuperTolo;

public class SuperGrilleValidator {
    public void checkNumeroChance(int inNumeroChance) {
        if (inNumeroChance < SuperTolo.LOWER_LUCK_NUMBER || inNumeroChance > SuperTolo.UPPER_LUCK_NUMBER) {
            throw new InvalidLuckNumberOuterBoundException();
        }
    }
}
