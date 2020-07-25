package cl.sulcansystem.restaurante.presentador;

import cl.sulcansystem.restaurante.modelo.IVerificador;

public class Presentador implements IPresenter {

    private IPresenterView view;
    private IVerificador verificador;

    public Presentador (IPresenterView view, IVerificador verificador) {
        this.view = view;
        this.verificador = verificador;
    }

    @Override
    public void evaluatePass(String password) {

        int resultado = this.verificador.verificar(password);

        switch (resultado) {
            case 0: //weak
                view.showWeak();
                break;

            case 1: //medium
                view.showMedium();
                break;

            case 2: //strong
                view.showStrong();
                break;

            case 3: // very strong
                view.showVeryStrong();
                break;
        }
    }
}


