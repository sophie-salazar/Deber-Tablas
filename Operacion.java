/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prymain;
abstract class Operacion {
    // Método abstracto que debe ser implementado para mostrar la tabla de multiplicar
    public abstract void realizarOperacion(int numero);
    
    // Método para sumar los resultados de la tabla de multiplicar
    public double sumarTabla(int numero) {
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += (numero * i);
        }
        return suma;
    }
    
    // Método para mostrar la tabla de multiplicar en orden descendente
    public void mostrarTablaInvertida(int numero) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}