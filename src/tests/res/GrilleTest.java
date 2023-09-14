package tests.res;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import res.exceptions.InvalidEntryException;
import res.exceptions.InvalidGridOuterBoundException;
import res.exceptions.LimitedGridLengthException;
import res.exceptions.MultipleOccuredNumberException;
import res.grille.Grille;
import tests.mocks.GrilleMock;

public class GrilleTest {


    private GrilleMock grilleMock;

    @Before
    public void setup() {
        grilleMock = new GrilleMock();
    }

    @Test(expected = InvalidEntryException.class)
    public void setNombresMises_nombresMisesNull_Ko() {
        new Grille(1, 0.15f, null);
    }

    @Test(expected = LimitedGridLengthException.class)
    public void setNombresMises_nombresMisesLengthDifferent_Ko() {
        new Grille(1, 0.15f, grilleMock.getNombresMisesLengthFive());
    }
    @Test(expected = MultipleOccuredNumberException.class)
    public void setNombresMises_nombresMisesMultipleOccured_Ko() {
        new Grille(1, 0.15f, grilleMock.getNombresMisesMultipleOccured());
    }

    @Test(expected = InvalidGridOuterBoundException.class)
    public void setNombresMises_nombresMisesInvalidGridOuterBound_Ko() {
        new Grille(1, 0.15f, grilleMock.getNombresMisesInvalidGridOuterBound());
    }

    @Test
    public void setNombresMises_Ok() {
        Assertions.assertDoesNotThrow(() -> new Grille(1, 0.15f, new int[] {1, 2, 3, 4}));
    }
}
