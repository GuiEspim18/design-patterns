package br.com.fiap.patterns.main;

import br.com.fiap.patterns.controller.TaxController;
import br.com.fiap.patterns.model.Pis;
import br.com.fiap.patterns.view.PisView;

public class Main {

    public static void main(String[] args) {
        Pis model = new Pis();
        PisView view = new PisView();

        model.addObserver(view);

        TaxController controller = new TaxController(model, view);

        view.addController(controller);
    }

}
