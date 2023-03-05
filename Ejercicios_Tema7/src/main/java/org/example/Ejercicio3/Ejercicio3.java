package org.example.Ejercicio3;

import java.util.Random;
import java.util.Scanner;

import static org.example.Ejercicio3.Cuadricula.TAMAÑO;

public class Ejercicio3 {
    private static Scanner sc = new Scanner(System.in);
    private static Random r = new Random();


    public static void main(String[] args) {
        Cuadricula cuadricula = new Cuadricula();
        int filaB = r.nextInt(TAMAÑO);
        int columnaB = r.nextInt(TAMAÑO);
        cuadricula.depositarBarco(filaB, columnaB);
        boolean salir = false;
        do {
            cuadricula.visualizacion();
            System.out.println("Introduce una fila: ");
            int fila = cuadricula.introducirEnteroEntreLimites();
            System.out.println("Introduce una columna: ");
            int columna =  cuadricula.introducirEnteroEntreLimites();
            salir = cuadricula.disparar(filaB, columnaB, fila, columna);
        } while (!salir);
        System.out.println("Has ganado, felicidades!!");
    }
}
