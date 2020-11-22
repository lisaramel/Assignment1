package Lektion05;

/**
 * Created by Lisa Ramel
 * Date: 2020-09-29
 * Time: 10:15
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */

    public enum Romersksiffra {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private final Integer number;

        Romersksiffra(int number) {
            this.number = number;
        }

    public Integer getNumber() {
        return number;
    }
}
