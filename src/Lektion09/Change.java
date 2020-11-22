package Lektion09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-07
 * Time: 13:30
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Change {

    //protected int[] moneyValues = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public int amountBack(int paid, int price){
        return paid - price;
    }
    public int valueBack(int change, int value){
        return change/value;
    }
    public int subtractLargestValue(int change, int value, int valueAmount){
        return (valueAmount * value) - change;
    }


}
















    /*
    protected int paid;
    protected int price;
    protected int[] currencies = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public Change() {
        this.paid = paid;
        this.price = price;
    }

    public int amountBack(int paid, int price) {
        return paid - price;
    }

    public int currenciesBack(int change, int currenciesArrayNr) {
        return change / currencies[currenciesArrayNr];
    }

    public int subtractLargestCurrency(int change, int amount, int currency) {
        return change - amount * currency;

    }
}



    /*
    public int[] currenciesBack() {
        int[] changeBack = new int[10];
        int remain = amountBack(paid, price);
        for (int i = 0; i < currencies.length; i++) {
            changeBack[i] = remain / currencies[i];
            remain %= currencies[i];
        }
        return changeBack;
    }
     */




