package tests.res;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import res.tolo.SuperTolo;
import tests.mocks.SuperToloMock;

public class SuperToloTest {
    private SuperToloMock superToloMock = new SuperToloMock();

    @Test
    public void obtenirGain_SuperGrilleNull_Ko() {
        // GIVEN
        SuperTolo superTolo = superToloMock.getSuperToloSample();

        // WHEN
        float mise = superTolo.obtenirGain(null);

        // THEN
        Assertions.assertEquals(0, mise);

    }
    @Test
    public void obtenirGain_SuperGrilleNumeroChanceNotSame_Ok() {
        // GIVEN
        SuperTolo superTolo = superToloMock.getSuperToloSample();

        // WHEN
        float mise = superTolo.obtenirGain(2);

        // THEN
        Assertions.assertEquals(50, mise);

    }
    @Test
    public void obtenirGain_SuperGrilleNumeroChanceSame_Ok() {
        // GIVEN
        SuperTolo superTolo = superToloMock.getSuperToloSample();

        // WHEN
        float mise = superTolo.obtenirGain(1);

        // THEN
        Assertions.assertEquals(250, mise);

    }
}
