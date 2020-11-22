package Lektion08;

import Lektion08.IFigure;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-06
 * Time: 10:47
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Triangle implements IFigure {
    protected int b;
    protected int h;

    public Triangle(int b, int h){
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (b*h)/2;
    }

    @Override
    public double getCirc() {
    return Math.sqrt((b/2)*(b/2)+h*h);
    }
}
