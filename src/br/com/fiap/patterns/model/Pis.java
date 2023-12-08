package br.com.fiap.patterns.model;

import br.com.fiap.patterns.config.ConfigSingleton;

import java.util.Observable;

public class Pis extends Observable implements Tax{

    private float aliquot;

    private float pisValue;

    public Pis() {
        aliquot = Float.parseFloat(ConfigSingleton.getInstance().getProperty("aliquot"));
    }

    @Override
    public void calculate (float value) {
        setChanged(); // avisar os componentes que foi modificado
        this.pisValue = value * this.aliquot;
        notifyObservers(this.pisValue); // notificar todos os componentes da mudança
    }

    public float getPisValue() {
        return this.pisValue;
    }

}
