/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prymain;

/**
 *
 * @author Sophie
 */
public class TablaMultiplicar extends Operacion {

    // Implementación de realizarOperacion, que muestra la tabla de multiplicar ascendente
    @Override
    public void realizarOperacion(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
   
