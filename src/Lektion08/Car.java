package Lektion08;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-06
 * Time: 11:44
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Car {

    protected double meterToday;
    protected double meterLastYear;
    protected double gasThisYear;

    public Car(double meterToday, double meterLastYear, double gasThisYear){
        this.meterToday = meterToday;
        this.meterLastYear = meterLastYear;
        this.gasThisYear = gasThisYear;
    }

    public double getMeterToday() {
        return meterToday;
    }

    public void setMeterToday(double meterToday) {
        this.meterToday = meterToday;
    }

    public double getMeterLastYear() {
        return meterLastYear;
    }

    public void setMeterLastYear(double meterLastYear) {
        this.meterLastYear = meterLastYear;
    }

    public double getGasThisYear() {
        return gasThisYear;
    }

    public void setGasThisYear(double gasThisYear) {
        this.gasThisYear = gasThisYear;
    }

    public double milesYear(){
        return meterToday - meterLastYear;
    }
    public double gasYear(){
        return gasThisYear;
    }
    public double averageGas(){
        return gasThisYear/milesYear();
    }
}
