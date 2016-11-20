package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private double xPosition = 0.0;
    private double yPosition = 0.0;

    /**
     * Nach oben bewegen
     * @see tpe.oo.interfaces.api.AnalogController#up(double)
     */
    @Override
    public void up(double percentage) {
        yPosition -= percentage;
    }

    /**
     * Nach unten bewegen.
     * @see tpe.oo.interfaces.api.AnalogController#down(double)
     */
    @Override
    public void down(double percentage) {
        yPosition += percentage;
    }

    /**
     * Nach links bewegen
     * @see tpe.oo.interfaces.api.AnalogController#left(double)
     */
    @Override
    public void left(double percentage) {
        xPosition -= percentage;
    }

    /**
     * Nach rechts bewegen
     * @see tpe.oo.interfaces.api.AnalogController#right(double)
     */
    @Override
    public void right( double percentage) {
        xPosition += percentage;
    }

    /**
     *
     * @see tpe.oo.interfaces.api.AnalogController#getPosition()
     */
    @Override
    public Point getPosition() {
        return new Point((int)xPosition, (int)yPosition);
    }

}
