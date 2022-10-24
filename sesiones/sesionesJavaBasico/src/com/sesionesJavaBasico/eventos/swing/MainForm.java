package com.sesionesJavaBasico.eventos.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Vamos a realizar, como ejemplo, una calculadora
 * de IVA para ver la librería de Swing y cómo se crea
 * una interfaz gráfica.
 *
 */

public class MainForm {

    private JTextPane panelSinIVA;
    private JTextPane IVA;
    private JTextPane panelConIVA;
    private JButton botonCalcular;
    private JPanel panelCalculadora;

    /*
        Esto es lo que decía en los apuntes que se suele hacer en un
        paso pero que nosotros haremos en dos:

            public MainForm() {
                botonCalcular.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }
    */

    public ActionListener botonPulsado() {
        ActionListener botonPulsado = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precioSinIVA = Double.parseDouble(panelSinIVA.getText());
                double impuesto = Double.parseDouble(IVA.getText());

                double resultado = precioSinIVA + (precioSinIVA / 100 * impuesto);
                panelConIVA.setText(Double.toString(resultado));
            }
        };
        return botonPulsado;
    }
    public MainForm() {
        botonCalcular.addActionListener(botonPulsado());
    }

    public static void main(String[] args) {

        JFrame verFormulario = new JFrame("Calculadora de IVA");
        verFormulario.setContentPane(new MainForm().panelCalculadora);
        verFormulario.setVisible(true);
        verFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
