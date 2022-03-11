package controllers;

import models.Monom;
import models.Parsare;
import models.Polinom;
import views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ControllerAdunare {
    private MainView mainView;
    private Polinom polinom1;
    private Polinom polinom2;
    private Polinom polinomFinal;

    public ControllerAdunare(MainView mainView) {
        this.mainView = mainView;
        this.mainView.addAdunareListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                List<Monom> inputFinal = new ArrayList<>();
                try {
                    if (mainView.getPolinomUnu().isEmpty() || mainView.getPolinomDoi().isEmpty()) {
                        throw new Exception("Bad input");
                    }
                    String input1 = mainView.getPolinomUnu();
                    polinom1 = new Polinom(Parsare.parsarePolinom(input1));
                    String input2 = mainView.getPolinomDoi();
                    polinom2 = new Polinom(Parsare.parsarePolinom(input2));
                    int i = 0;
                    while (i < polinom1.getParts().size()) {
                        int j = 0;
                        while (j < polinom2.getParts().size()) {
                            if (polinom1.getParts().get(i).getExponent() == polinom2.getParts().get(j).getExponent()) {
                                inputFinal.add(new Monom(polinom1.getParts().get(i).getCoeficient() + polinom2.getParts().get(j).getCoeficient(), polinom1.getParts().get(i).getExponent()));
                                polinom1.getParts().remove(polinom1.getParts().get(i));
                                i--;
                                polinom2.getParts().remove(polinom2.getParts().get(j));
                                break;
                            }
                            j++;
                        }
                        i++;
                    }
                    inputFinal.addAll(polinom1.getParts());
                    inputFinal.addAll(polinom2.getParts());
                    Collections.sort(inputFinal);
                    polinomFinal = new Polinom(inputFinal);
                    polinomFinal.normalize();
                    mainView.setRezultatFinal(polinomFinal.toString());
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                    if (exception.getMessage().equals("Bad input")) {
                        mainView.showMessage("Introduceti ambele polinoame.");
                    }
                }
            }
        });

    }
}

