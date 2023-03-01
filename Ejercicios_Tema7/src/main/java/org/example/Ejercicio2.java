package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public String nombre;
    public int nCliente;
    public ArrayList<Ejercicio2> clientes = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public Ejercicio2(String nombre, int nCliente) {
        this.nombre = nombre;
        this.nCliente = nCliente;
    }

    public Ejercicio2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCliente() {
        return nCliente;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    public void crearCliente(int nCliente){
        System.out.println("Introduce el nombre del cliente");
        sc.nextLine(); // Según copilot este sc es para limpiar el buffer, pero realmente he añadido otro sc.nextLine() porque lo saltaba y no dejaba escribir un valor)
        String nombre = sc.nextLine();
        Ejercicio2 cliente = new Ejercicio2(nombre, nCliente);
        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Cliente n.º " + nCliente + " [" + nombre + "]";
    }

    public static void menu(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        boolean salir = false;
        int contador = 1;
        do {
            System.out.println("-- Menu --");
            System.out.println("1.- Mostrar clientes");
            System.out.println("2.- Crear cliente");
            System.out.println("3.- Salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("-- Clientes --");
                    ejercicio2.clientes.forEach(System.out::println);
                    break;
                case 2:
                    ejercicio2.crearCliente(contador);
                    System.out.println("Cliente n.º " + contador+" [" + ejercicio2.clientes.get(contador-1).getNombre() +"] añadido");
                    contador++;
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (!salir);
    }

    public static void main(String[] args) {
        menu();
    }
}
