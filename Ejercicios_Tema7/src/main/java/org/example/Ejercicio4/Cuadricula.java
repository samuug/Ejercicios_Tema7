package org.example.Ejercicio4;

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

    public boolean disparar(int fila, int columna, Cuadricula cuadricula1){
        if (cuadricula1.cuadricula[fila][columna] == 'B') {
            System.out.println("Tocado y hundido");
            return true;
        } else {
            cuadricula1.cuadricula[fila][columna] = 'X';
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

    public  static void turnos(Cuadricula humano, Cuadricula maquina){
        int turno = 0;
        boolean salir = false;
        do {
        if (turno % 2 == 0) {
            System.out.println("Turno del jugador");
            maquina.visualizacion();
            System.out.println("Introduce una fila: ");
            int fila = humano.introducirEnteroEntreLimites();
            System.out.println("Introduce una columna: ");
            int columna =  humano.introducirEnteroEntreLimites();
            salir = humano.disparar(fila, columna, maquina);
        } else {
            System.out.println("Turno de la máquina");
            int fila=0;
            int columna = 0;
            salir = maquina.disparar(fila, columna, humano);
            fila++;
            columna++;
            humano.visualizacion();
        }
        turno++;
        } while (!salir);
    }

}
