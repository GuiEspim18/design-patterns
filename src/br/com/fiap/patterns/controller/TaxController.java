package br.com.fiap.patterns.controller;

import br.com.fiap.patterns.model.Tax;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaxController implements ActionListener {

    private Tax model;
    private br.com.fiap.patterns.view.Tax view;

    @Override
    public void actionPerformed(ActionEvent e) {
        model.calculate(view.getTax());
    }

    public TaxController (Tax model, br.com.fiap.patterns.view.Tax view) {
        this.model = model;
        this.view = view;
    }
}
