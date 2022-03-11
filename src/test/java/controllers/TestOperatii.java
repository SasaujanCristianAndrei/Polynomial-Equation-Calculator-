package controllers;
import views.MainView;
import static org.junit.jupiter.api.Assertions.*;

class TestOperatii {

    MainView mainView;
    ControllerAdunare controllerAdunare;
    ControllerInmultire controllerInmultire;
    ControllerScadere controllerScadere;
    ControllerDerivare controllerDerivare;
    ControllerIntegrare controllerIntegrare;

    @org.junit.jupiter.api.Test
    void adunare1() {
        mainView = new MainView();
        mainView.setPolinomUnu("x^2+2");
        mainView.setPolinomDoi("x^2-2");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("+2x^2", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare2() {
        mainView = new MainView();
        mainView.setPolinomUnu("3x+3x+3x+3x-3x");
        mainView.setPolinomDoi("3x+5");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("+12x^1+5", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare3() {
        mainView = new MainView();
        mainView.setPolinomUnu("0");
        mainView.setPolinomDoi("0");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare4() {
        mainView = new MainView();
        mainView.setPolinomUnu("x-2");
        mainView.setPolinomDoi("-x+2");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare5() {
        mainView = new MainView();
        mainView.setPolinomUnu("0x");
        mainView.setPolinomDoi("0");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare6() {
        mainView = new MainView();
        mainView.setPolinomUnu("0x^99");
        mainView.setPolinomDoi("0");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare7() {
        mainView = new MainView();
        mainView.setPolinomUnu("0x^155");
        mainView.setPolinomDoi("0x^0");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare8() {
        mainView = new MainView();
        mainView.setPolinomUnu("5x^0");
        mainView.setPolinomDoi("3x^0");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("+8", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare9() {
        mainView = new MainView();
        mainView.setPolinomUnu("-55x");
        mainView.setPolinomDoi("+55x^0");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("-55x^1+55", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare10() {
        mainView = new MainView();
        mainView.setPolinomUnu("x-x+x^2-x^2-x^5");
        mainView.setPolinomDoi("-x+x-x^2+x^2-x^5");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("-2x^5", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void adunare11() {
        mainView = new MainView();
        mainView.setPolinomUnu("x-x+x^2-x^2-x^5");
        mainView.setPolinomDoi("-x+x-x^2+x^2+x^5");
        controllerAdunare = new ControllerAdunare(mainView);
        mainView.getAdunareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }


    @org.junit.jupiter.api.Test
    void scadere1() {
        mainView = new MainView();
        mainView.setPolinomUnu("x-2");
        mainView.setPolinomDoi("x-2");
        controllerScadere = new ControllerScadere(mainView);
        mainView.getScadereBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void scadere2() {
        mainView = new MainView();
        mainView.setPolinomUnu("x^2-6x^9+25x^10-3x+2x-x^2");
        mainView.setPolinomDoi("-6x^7+23x^10+9x-6x^2");
        controllerScadere = new ControllerScadere(mainView);
        mainView.getScadereBtn().doClick();
        assertEquals("+2x^10-6x^9+6x^7+6x^2-10x^1", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void scadere3() {
        mainView = new MainView();
        mainView.setPolinomUnu("-x^6-x^3+x^7");
        mainView.setPolinomDoi("+x^6+x^3-x^7");
        controllerScadere = new ControllerScadere(mainView);
        mainView.getScadereBtn().doClick();
        assertEquals("+2x^7-2x^6-2x^3", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void inmultire1() {
        mainView = new MainView();
        mainView.setPolinomUnu("x-2");
        mainView.setPolinomDoi("x+2");
        controllerInmultire = new ControllerInmultire(mainView);
        mainView.getInmultireBtn().doClick();
        assertEquals("+x^2-4", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void inmultire2() {
        mainView = new MainView();
        mainView.setPolinomUnu("x   +   2");
        mainView.setPolinomDoi("x+            2");
        controllerInmultire = new ControllerInmultire(mainView);
        mainView.getInmultireBtn().doClick();
        assertEquals("+x^2+4x^1+4", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void inmultire3() {
        mainView = new MainView();
        mainView.setPolinomUnu("3x^2+6x+2x^3+4x^2");
        mainView.setPolinomDoi("3x+2x^2");
        controllerInmultire = new ControllerInmultire(mainView);
        mainView.getInmultireBtn().doClick();
        assertEquals("+4x^5+20x^4+33x^3+18x^2", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void inmultire4() {
        mainView = new MainView();
        mainView.setPolinomUnu("x-x");
        mainView.setPolinomDoi("3");
        controllerInmultire = new ControllerInmultire(mainView);
        mainView.getInmultireBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void inmultire5() {
        mainView = new MainView();
        mainView.setPolinomUnu("2x^0");
        mainView.setPolinomDoi("3x^0");
        controllerInmultire = new ControllerInmultire(mainView);
        mainView.getInmultireBtn().doClick();
        assertEquals("+6", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void derivare1() {
        mainView = new MainView();
        mainView.setPolinomUnu("3x^2+6x");
        //mainView.setPolinomDoi("3x+2x^2");
        controllerDerivare = new ControllerDerivare(mainView);
        mainView.getDerivareBtn().doClick();
        assertEquals("+6x^1+6", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void derivare2() {
        mainView = new MainView();
        mainView.setPolinomUnu("0");
        //mainView.setPolinomDoi("3x+2x^2");
        controllerDerivare = new ControllerDerivare(mainView);
        mainView.getDerivareBtn().doClick();
        assertEquals("0", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void derivare3() {
        mainView = new MainView();
        //mainView.setPolinomUnu("5x^-2+6");
        mainView.setPolinomDoi("5x^-2+6x^2+5x^2");
        controllerDerivare = new ControllerDerivare(mainView);
        mainView.getDerivareBtn().doClick();
        assertEquals("+22x^1-10x^-3", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void integrare1() {
        mainView = new MainView();
        //mainView.setPolinomUnu("5x^-2+6");
        mainView.setPolinomDoi("5x^2");
        controllerIntegrare = new ControllerIntegrare(mainView);
        mainView.getIntegrareBtn().doClick();
        assertEquals("[+(5x^3)/3]+C", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void integrare2() {
        mainView = new MainView();
        //mainView.setPolinomUnu("5x^-2+6");
        mainView.setPolinomDoi("5x^-2+6x^9+3x");
        controllerIntegrare = new ControllerIntegrare(mainView);
        mainView.getIntegrareBtn().doClick();
        assertEquals("[+(6x^10)/10+(3x^2)/2+(5x^-1)/-1]+C", mainView.getRezultatFinal());
    }

    @org.junit.jupiter.api.Test
    void integrare3() {
        mainView = new MainView();
        //mainView.setPolinomUnu("5x^-2+6");
        mainView.setPolinomDoi("x^2");
        controllerIntegrare = new ControllerIntegrare(mainView);
        mainView.getIntegrareBtn().doClick();
        assertEquals("[+(1x^3)/3]+C", mainView.getRezultatFinal());
    }


}