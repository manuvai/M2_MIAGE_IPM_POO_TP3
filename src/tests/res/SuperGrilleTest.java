package tests.res;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import res.exceptions.InvalidLuckNumberOuterBoundException;
import res.grille.SuperGrille;
import tests.mocks.SuperGrilleMock;

public class SuperGrilleTest {

    @Test(expected = InvalidLuckNumberOuterBoundException.class)
    public void setNumeroChance_numeroChanceOuterBound_Ko() {
        new SuperGrille(1, 0.25f, new int[] {1, 3, 4, 5}, 11);
    }
    @Test
    public void setNumeroChance_Ok() {
        Assertions.assertDoesNotThrow(() -> new SuperGrille(1, 0.25f, new int[] {1, 3, 4, 5}, 9));
    }
}
