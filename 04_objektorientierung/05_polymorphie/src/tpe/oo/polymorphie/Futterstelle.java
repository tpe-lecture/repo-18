package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {


    /**
     *  Füttert alle Tiere.
     *
     * @param zootier ZooTiere, die gefüttert werden sollen
     */
    public void gibFutter(ZooTier zootier) {
        zootier.fuettern();

    }
}
