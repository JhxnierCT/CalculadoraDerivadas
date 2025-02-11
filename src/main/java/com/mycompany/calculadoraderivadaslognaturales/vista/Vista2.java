/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraderivadaslognaturales.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Vista2 extends JFrame {

    private JTextField campoEntrada;
    private JButton botonCalcular;
    private JLabel etiquetaResultado;

    public Vista2() {
        // Configuración de la ventana
        setTitle("Calculadora de Derivada de Logaritmo Natural");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Inicialización de componentes
        campoEntrada = new JTextField(10);
        botonCalcular = new JButton("Calcular Derivada");
        etiquetaResultado = new JLabel("Resultado: ");

        // Añadir componentes a la ventana
        add(new JLabel("Introduce el valor de x: "));
        add(campoEntrada);
        add(botonCalcular);
        add(etiquetaResultado);

        // Centrar la ventana
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public double getEntrada() {
        try {
            return Double.parseDouble(campoEntrada.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entrada inválida. Introduce un número válido.");
            return 0;
        }
    }

    public void setResultado(String resultado) {
        etiquetaResultado.setText("Resultado: " + resultado);
    }

    public void addCalculadoraListener(ActionListener listenerParaBotonCalcular) {
        botonCalcular.addActionListener(listenerParaBotonCalcular);
    }
}

    

