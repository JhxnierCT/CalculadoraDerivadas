/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraderivadaslognaturales;

import com.mycompany.calculadoraderivadaslognaturales.controlador.Controlador;
import com.mycompany.calculadoraderivadaslognaturales.modelo.Modelo;
import com.mycompany.calculadoraderivadaslognaturales.vista.Vista2;

/**
 *
 * @author COTAYA
 */
public class CalculadoraDerivadasLogNaturales {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista2 vista = new Vista2();
        Controlador controlador = new Controlador(modelo, vista);
    }
}
