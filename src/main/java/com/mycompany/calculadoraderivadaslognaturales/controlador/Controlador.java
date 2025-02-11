package com.mycompany.calculadoraderivadaslognaturales.controlador;

import com.mycompany.calculadoraderivadaslognaturales.modelo.Modelo;
import com.mycompany.calculadoraderivadaslognaturales.vista.Vista2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    private Modelo modelo;
    private Vista2 vista;

    public Controlador(Modelo modelo, Vista2 vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Conectar el controlador con la vista
        this.vista.addCalculadoraListener(new ListenerParaBotonCalcular());
    }

    class ListenerParaBotonCalcular implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double x, resultado;

            // Obtener el valor de x desde la vista
            x = vista.getEntrada();

            // Calcular la derivada usando el modelo
            resultado = modelo.calcularDerivada(x);

            // Mostrar el resultado en la vista
            vista.setResultado(String.valueOf(resultado));
        }
    }
}
