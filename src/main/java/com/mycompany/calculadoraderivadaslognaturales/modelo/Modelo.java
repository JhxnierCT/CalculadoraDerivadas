
package com.mycompany.calculadoraderivadaslognaturales.modelo;
public class Modelo {
    public double calcularDerivada(double x) {
        if (x <= 0) {
            return Double.NaN; // La derivada no está definida para x <= 0
        }
        return 1 / x;
    }
}
    


