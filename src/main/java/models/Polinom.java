package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Polinom {
    private List<Monom> Parts;

    public Polinom(List<Monom> Parts) {
        this.Parts = Parts;
    }

    public List<Monom> getParts() {
        return Parts;
    }

    public void setParts(List<Monom> parts) {
        Parts = parts;
    }

    @Override
    public String toString() {
        String output = "";
        for (Monom x : Parts) {
            if (x.getCoeficient() != 0) {
                if (x.getCoeficient() > 0) {
                    output = output + "+";
                }
                if (x.getCoeficient() == 1) {
                    if (x.getExponent() == 0) {
                        output = output + x.getCoeficient();
                    } else output = output + Parsare.getLitera() + "^" + x.getExponent();

                } else if (x.getCoeficient() == -1) {
                    if (x.getExponent() == 0) {
                        output = output + x.getCoeficient();
                    } else output = output + "-" + Parsare.getLitera() + "^" + x.getExponent();
                } else {
                    if (x.getExponent() == 0) {
                        output = output + x.getCoeficient();
                    } else output = output + x.getCoeficient() + Parsare.getLitera() + "^" + x.getExponent();
                }
            }
        }
        return output;
    }

    public void normalize() {
        int i = 0;
        while (i < this.getParts().size()) {
            int j = i + 1;
            while (j < this.getParts().size()) {
                if (this.getParts().get(i).getExponent() == this.getParts().get(j).getExponent()) {
                    this.getParts().get(i).setCoeficient(this.getParts().get(i).getCoeficient() + this.getParts().get(j).getCoeficient());
                    this.getParts().remove(this.getParts().get(j));
                    j--;
                }
                j++;
            }
            i++;
        }
    }
}
