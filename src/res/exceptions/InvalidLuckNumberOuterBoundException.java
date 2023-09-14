package res.exceptions;

import res.tolo.SuperTolo;

import java.text.MessageFormat;

public class InvalidLuckNumberOuterBoundException extends NoStackTraceRuntimeException {

    public InvalidLuckNumberOuterBoundException() {
        super(MessageFormat.format(
                "Le numéro chance doit être compris entre {0} et {1}",
                SuperTolo.LOWER_LUCK_NUMBER,
                SuperTolo.UPPER_LUCK_NUMBER));
    }
}
