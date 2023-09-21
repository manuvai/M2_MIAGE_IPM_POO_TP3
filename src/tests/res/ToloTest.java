package tests.res;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import res.exceptions.NoStackTraceRuntimeException;
import res.tolo.Tolo;
import tests.mocks.ToloMock;

public class ToloTest {

    private ToloMock toloMock = new ToloMock();


    @Test
    public void obtenirGain_codeGrilleInexistant_Ko() {
        // GIVEN
        Tolo tolo = toloMock.getToloSample();

        // WHEN
        float mise = tolo.obtenirGain(2);

        // THEN
        Assertions.assertEquals(0, mise);
    }

    @Test
    public void obtenirGain_GrilleNull_Ko() {
        // GIVEN
        Tolo tolo = toloMock.getToloSample();

        // WHEN
        float mise = tolo.obtenirGain(null);

        // THEN
        Assertions.assertEquals(0, mise);

    }

    @Test(expected = NoStackTraceRuntimeException.class)
    public void obtenirGain_numerosTiresInexistant_Ko() {
        // GIVEN
        Tolo tolo = toloMock.getToloWithoutTirage();

        // THEN
        tolo.obtenirGain(1);

    }

    @Test
    public void obtenirGain_Ok() {
        // GIVEN
        Tolo tolo = toloMock.getToloSample();

        // WHEN
        float mise = tolo.obtenirGain(1);

        // THEN
        Assertions.assertEquals(50, mise);

    }
}
