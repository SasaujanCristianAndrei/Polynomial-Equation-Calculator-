import controllers.*;
import views.MainView;

public class Main {
    public static void main(String[] args) {

        MainView mainView = new MainView();
        ControllerAdunare controllerAdunare = new ControllerAdunare(mainView);
        ControllerScadere controllerScader = new ControllerScadere(mainView);
        ControllerInmultire controllerInmultire = new ControllerInmultire(mainView);
        ControllerDerivare controllerDerivare = new ControllerDerivare(mainView);
        ControllerIntegrare controllerIntegrare = new ControllerIntegrare(mainView);
    }
}
