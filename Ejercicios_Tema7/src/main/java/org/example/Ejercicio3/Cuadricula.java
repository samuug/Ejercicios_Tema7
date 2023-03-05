package org.example.Ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class Cuadricula {
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();
    public static final int TAMAÑO = 10;

    public char[][] cuadricula;

    public Cuadricula() {
        this.cuadricula = new char[TAMAÑO][TAMAÑO];
        inicializarTablero();
    }

    public void inicializarTablero(){
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                cuadricula[i][j] = '~';
            }
        }
    }
    public void visualizacion(){
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < TAMAÑO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMAÑO; j++) {
                System.out.print(cuadricula[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void depositarBarco(int filaB, int columnaB){
        cuadricula[filaB][columnaB] = 'B';
    }

    public boolean disparar(int filaB, int columnaB, int fila, int columna){
        if (fila == filaB && columna == columnaB) {
            System.out.println("Tocado y hundido");
            return true;
        } else {
            cuadricula[fila][columna] = 'X';
            return false;
        }
    }
    public int introducirEnteroEntreLimites(){
        int numero;
        do {
            numero = sc.nextInt();
            if (numero < 0 || numero > TAMAÑO) {
                System.out.println("Introduce un número entre 0 y " + (TAMAÑO-1));
            }
        } while (numero < 0 || numero > TAMAÑO);
        return numero;
    }


}
