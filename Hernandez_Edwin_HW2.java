/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_hw2;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_HW2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int cicloMenu = 1;

        do {

            int opcion;

            System.out.println("--- MENU ---\n");
            System.out.println("1- Palabra en Piramide");
            System.out.println("2- Piramide de números");
            System.out.println("3- Palindromo");
            System.out.println("4- Salir\n");

            System.out.print("Ingrese su opción: ");
            opcion = scan.nextInt();

            //Ingreso de opción inválida
            if (opcion < 1 || opcion > 4) {
                System.out.println("Ingrese una opción válida");

                
                
                
                //1- Palabra en Piramide
            } else if (opcion == 1) {
                System.out.println("\n* Palabra en Piramide *");

                //Declaracion de variables
                String texto;
                String textoInvertido = "";
                char letra;
                String espacio = " ";
                int contador = 0;
                int contadorEspacio = 0;
                int otroContador = 0;

                //Ingreso de texto
                System.out.print("Ingrese su texto: ");
                texto = scan.next().toUpperCase();
                int length = (texto.length());
                int lengthInvertido = (texto.length());

                //Inversion del texto para su impresion posterior
                for (int contadorInvertido = 0; contadorInvertido < (texto.length()); contadorInvertido++) {
                    char letraInvertida = texto.charAt(contadorInvertido);
                    textoInvertido = letraInvertida + textoInvertido;

                }

                //Impresion de texto normal
                while (length > 0) {

                    while (otroContador > 0) {
                        System.out.print(espacio);

                        otroContador--;
                    }

                    System.out.print(texto.charAt(contador) + "\n");

                    contador++;
                    contadorEspacio += 2;
                    otroContador = contadorEspacio;
                    length--;
                }

                contador = 0;
                contadorEspacio = lengthInvertido;
                otroContador = (contadorEspacio * 2) - 2;

                //Impresion de texto invertido
                while (lengthInvertido > 0) {

                    while (otroContador > 0) {
                        System.out.print(espacio);

                        otroContador--;
                    }

                    System.out.print(textoInvertido.charAt(contador) + "\n");

                    contador++;
                    lengthInvertido--;
                    contadorEspacio = lengthInvertido;
                    otroContador = (contadorEspacio * 2) - 2;
                }
                System.out.println("");

                
                
                
                //2- Piramide de números
            } else if (opcion == 2) {
                System.out.println("\n* Piramide de números *");

                //Declaración de variables
                int numeroPiramide = 0;

                //Ingreso de datos
                System.out.print("Ingrese un número: ");
                numeroPiramide = scan.nextInt();
                System.out.println("");

                for (int cicloPiramide = 1; cicloPiramide <= numeroPiramide; cicloPiramide++) {

                    //Impresión de espacios
                    for (int espacio = 1; espacio < cicloPiramide; espacio++) {
                        System.out.print("  ");
                    }

                    // Impresión de números ascendentes
                    for (int numeroAscendente = cicloPiramide; numeroAscendente <= numeroPiramide; numeroAscendente++) {
                        System.out.print(numeroAscendente + " ");
                    }

                    // Impresión de números descendentes
                    for (int numeroDescendente = (numeroPiramide - 1); numeroDescendente >= cicloPiramide; numeroDescendente--) {
                        System.out.print(numeroDescendente + " ");
                    }

                    System.out.println("");
                }

                
                
                
                //3- Palindromo
            } else if (opcion == 3) {
                System.out.println("\nPalindromo");

                //Declaración de variables
                int contador = 0;
                String continuar = "";
                String palabra;
                String palabraInvertida = "";

                do {
                    //Ingreso de palabra
                    System.out.print("Ingrese una palabra: ");
                    palabra = scan.next().toUpperCase();
                    contador = palabra.length() - 1;

                    //Inversión de palabra
                    while (contador >= 0) {
                        char letra = palabra.charAt(contador);
                        palabraInvertida += letra;
                        contador--;

                    }

                    //Comparación e impresión de resultados
                    String resultado = (palabra.equals(palabraInvertida)) ? (palabra + " es un palindromo") : (palabra + " no es un palindromo");
                    System.out.println(resultado);

                    palabraInvertida = "";

                    //Volver a intentar?
                    do {
                        System.out.println("¿Desea intentar con otra palabra?");
                        continuar = scan.next().toLowerCase();
                    } while (!continuar.equals("si") && !continuar.equals("no"));

                } while (!continuar.equalsIgnoreCase("no"));

                System.out.println("");

                
                
                
                //Salir
            } else if (opcion == 4) {
                System.out.println("\nadios :)");
                cicloMenu = 0;

            }

        } while (cicloMenu > 0);
    }
}
