package Lektion08;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-06
 * Time: 11:06
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Circle implements IFigure {

    protected double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*(r*2);
    }

    @Override
    public double getCirc() {
        return Math.PI*(r+r);
    }

}
