package res.exceptions;

import res.Grille;

import java.text.MessageFormat;

public class LimitedGridLengthException extends NoStackTraceRuntimeException {
    public LimitedGridLengthException() {
        super(MessageFormat.format(
                "La grille doit contenir {0} numéros",
                Grille.PERMITTED_NUMBERS));
    }
}
