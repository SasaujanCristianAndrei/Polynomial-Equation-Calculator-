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
public class ControllerInmultire {

    private MainView mainView;
    private Polinom polinom1;
    private Polinom polinom2;
    private Polinom polinomFinal;

    public ControllerInmultire(MainView mainView) {
        this.mainView = mainView;

        this.mainView.addInmultireListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Monom> inputFinal = new ArrayList<>();
                List<Monom> adunareFinal = new ArrayList<>();
                try {
                    if (mainView.getPolinomUnu().isEmpty() || mainView.getPolinomDoi().isEmpty()) {
                        throw new Exception("Bad input");
                    }
                    String input1 = mainView.getPolinomUnu();
                    polinom1 = new Polinom(Parsare.parsarePolinom(input1));
                    String input2 = mainView.getPolinomDoi();
                    polinom2 = new Polinom(Parsare.parsarePolinom(input2));

                    for (Monom x : polinom1.getParts()) {
                        for (Monom y : polinom2.getParts()) {
                            adunareFinal.add(new Monom(x.getCoeficient() * y.getCoeficient(), x.getExponent() + y.getExponent()));
                        }
                    }
                    Collections.sort(adunareFinal);
                    polinomFinal = new Polinom(adunareFinal);
                    polinomFinal.normalize();
                    mainView.setRezultatFinal(polinomFinal.toString());

                } catch (Exception exception) {
                    if (exception.getMessage().equals("Bad input")) {
                        mainView.showMessage("Introduceti ambele polinoame.");
                    }
                }
            }
        });
    }
}
