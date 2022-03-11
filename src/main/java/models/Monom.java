package models;

public class Monom implements Comparable<Monom> {
    private int coeficient;
    private int exponent;

    public Monom(int coeficient, int exponent) {
        this.coeficient = coeficient;
        this.exponent = exponent;
    }

    public int getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public int compareTo(Monom x) {
        if (this.exponent > x.exponent) {
            return -1;
        }
        return 1;
    }
}
