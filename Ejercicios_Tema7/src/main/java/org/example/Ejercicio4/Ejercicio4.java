package org.example.Ejercicio4;


import java.util.Random;
import java.util.Scanner;

import static org.example.Ejercicio4.Cuadricula.TAMAÑO;
import static org.example.Ejercicio4.Cuadricula.turnos;

public class Ejercicio4 {
    private static Scanner sc = new Scanner(System.in);
    private static Random r = new Random();


    public static void main(String[] args) {
        Cuadricula humano = new Cuadricula();
        Cuadricula maquina = new Cuadricula();
        int filaM = r.nextInt(TAMAÑO);
        int columnaM = r.nextInt(TAMAÑO);
        maquina.depositarBarco(filaM, columnaM);
        humano.visualizacion();
        System.out.println("Introduce una fila: ");
        int filaH = sc.nextInt();
        System.out.println("Introduce una columna: ");
        int columnaH = sc.nextInt();
        humano.depositarBarco(filaH, columnaH);
        turnos(humano, maquina);
        System.out.println("Has ganado, felicidades!!");
    }
}
