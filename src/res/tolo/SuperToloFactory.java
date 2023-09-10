package res.tolo;

import res.grille.GrilleFactory;
import res.mise.MiseSuperTolo;
import utils.NumberUtils;

public class SuperToloFactory {

    public static SuperTolo generateSuperTolo() {

        return new SuperTolo(
                GrilleFactory.generateGrille(),
                NumberUtils.random(MiseSuperTolo.LOWER_LUCK_NUMBER, MiseSuperTolo.UPPER_LUCK_NUMBER));
    }
}
