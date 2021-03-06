package tpe.oo.constructor;

/**
 * Nachtelf aus der Allianz.
 */
public class Nachtelf extends Wesen  {

    /** Standardmäßige Stärke der Fähigkeit Naturwiderstand. */
    public static final int STANDARD_NATURWIDERSTAND = 5;

    /** Fähigkeit zum Widerstand gegen Naturmagie */
    private int naturwiderstand;

    // Konstruktoren fehlen. Bitte hier einfügen.

    public Nachtelf(String name, int naturwiderstand ){
        super(name);
       this.naturwiderstand = naturwiderstand;

    }
    public Nachtelf(String name){

        this(name, STANDARD_NATURWIDERSTAND);
    }

    /**
     * Stärke des Naturwiderstandes.
     *
     * @return the naturwiderstand
     */
    public int getNaturwiderstand() {
        return naturwiderstand;
    }
}
