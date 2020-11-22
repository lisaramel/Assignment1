package Lektion08;

import Lektion08.IFigure;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-06
 * Time: 10:19
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Rectangle implements IFigure {

    protected int w;
    protected int h;

    public Rectangle(int w, int h){
        this.h = h;
        this.w = w;
    }
    public double getArea(){
        return w*h;
    }
    public double getCirc(){
        return (w*2) + (h*2);
    }
}
