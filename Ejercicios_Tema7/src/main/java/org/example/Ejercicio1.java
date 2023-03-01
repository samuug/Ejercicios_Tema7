package org.example;

public class Ejercicio1 {
    public int numeroCaras;
    public int ultimaCara;

    public Ejercicio1(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }
    public Ejercicio1(){
        this.numeroCaras = 6;
    }

    public int getNumeroCaras() {
        return numeroCaras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setNumeroCaras(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public int lanzarDado(){
        this.ultimaCara = (int) (Math.random() * numeroCaras) + 1;
        return ultimaCara;
    }

    public static void main(String[] args) {
        Ejercicio1 dado = new Ejercicio1();
        Ejercicio1 dado2 = new Ejercicio1(10);
        Ejercicio1 dado3 = new Ejercicio1(12);
        int suma = 0;
        int contador = 0;
        do {
            dado.lanzarDado();
            suma += dado.getUltimaCara();
            System.out.println("El primer dado: " + dado.getUltimaCara());
            dado2.lanzarDado();
            suma += dado2.getUltimaCara();
            System.out.println("El segundo dado: " + dado2.getUltimaCara());
            dado3.lanzarDado();
            suma += dado3.getUltimaCara();
            System.out.println("El tercer dado: " + dado3.getUltimaCara());
            contador++;
            System.out.println("El resultado de la tirada " + contador + " es: " + suma);
        }while (suma < 20);
        System.out.println("La fortuna favorece a los más audaces, eso dijo Alejandro Magno y lo dijo bien, porque en esta ocasión ha sido así. O pude q no.");
    }
}