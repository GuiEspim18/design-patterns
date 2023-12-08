package br.com.fiap.patterns.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class PisView implements Tax, Observer {

    private TextField textField;
    private Button calculate;

    public PisView () {
        Frame frame = new Frame("Calc Tax");
        frame.add("North", new Label("Valor para calcular"));
        textField = new TextField();
        frame.add("Center", textField);

        Panel panel = new Panel();

        calculate = new Button("Calcular");
        frame.add("South", calculate);

        frame.addWindowListener(new CloseListener());
        frame.setSize(200, 150);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

    @Override
    public void update(Observable model, Object state) {
        String message = model.getClass() + " " + state;
        JOptionPane.showMessageDialog(null, message);
     }

     public void addController (ActionListener controller) {
        calculate.addActionListener(controller);
     }

    public static class CloseListener extends WindowAdapter {
        public void windowCLosig(WindowEvent event) {
            event.getWindow().setVisible(false);
            System.exit(0);
        }
    }

    @Override
    public float getTax() {
        return Float.parseFloat(textField.getText());
    }
}
