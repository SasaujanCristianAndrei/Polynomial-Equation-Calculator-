package controllers;

import models.Monom;
import models.Parsare;
import models.Polinom;
import views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ControllerIntegrare {
    private MainView mainView;
    private Polinom polinom1;
    private Polinom polinom2;
    private Polinom polinomFinal;

    public ControllerIntegrare(MainView mainView) {
        this.mainView = mainView;
        this.mainView.addIntegrareListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Monom> inputFinal = new ArrayList<>();
                List<Monom> adunareFinal = new ArrayList<>();
                try {
                    if ((mainView.getPolinomUnu().isEmpty() || !mainView.getPolinomDoi().isEmpty()) && (!mainView.getPolinomUnu().isEmpty() || mainView.getPolinomDoi().isEmpty())) {
                        throw new Exception("Bad input");
                    }

                    String input1 = mainView.getPolinomUnu();
                    polinom1 = new Polinom(Parsare.parsarePolinom(input1));
                    String input2 = mainView.getPolinomDoi();
                    polinom2 = new Polinom(Parsare.parsarePolinom(input2));

                    for (Monom x : polinom1.getParts()) {
                        inputFinal.add(new Monom(x.getCoeficient(), x.getExponent() + 1));
                    }
                    for (Monom y : polinom2.getParts()) {
                        inputFinal.add(new Monom(y.getCoeficient(), y.getExponent() + 1));
                    }
                    Collections.sort(inputFinal);
                    String result = "";
                    for (Monom x : inputFinal) {
                        if (x.getCoeficient() > 0) {
                            result = result + "+";
                        }
                        result = result + "(" + x.getCoeficient() + Parsare.getLitera() + "^" + x.getExponent() + ")/" + x.getExponent();
                    }
                    mainView.setRezultatFinal("[" + result + "]" + "+C");
                } catch (Exception exceptie) {
                    if (exceptie.getMessage().equals("Bad input")) {
                        mainView.showMessage("Introduceti un singur polinom pentru integrare");
                    }
                }

            }
        });
    }
}
