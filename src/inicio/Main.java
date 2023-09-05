package inicio;


import logica.RecursividadRepaso;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RecursividadRepaso r = new RecursividadRepaso();
        // r.contarDiez(1);
        //r.factorial(7);
        // System.out.println("El factorial es: "+r.factorial(7));
        //int [] array = {1,2,3,4,5};
        //int indice2 =  r.buscarNumero(array,0 ,6);
        //System.out.println("El numero se encuentra en la posicion: "+indice2);
        //int digi = r.contarDigitos(123456);
        //System.out.println("El numero tiene: "+digi+" digitos");

        //Punto 1 - Recursividad
        //int suma = r.sumarPotencias(2,4);
        //System.out.println("La suma de las potencias es: "+suma);

        //Punto 2 - Recursividad
        //String word = r.invertirPalabra("");
        //System.out.println("La palabra invertida es: "+ word);

        //Punto 3 - Recursividad
        //int [] array1 = {1,2,3};
        //int [] array2 = {1,2,3};
        //int indice = 0;
        //boolean answer = r.validarArreglos(array1,array2,indice);
        //System.out.println("Los arreglos son iguales?: "+answer);

        //Punto 4 - Recursividad
        //int[][] matriz = {
        //      {1, 2, 3},
        //    {4, 5, 6},
        //  {7, 8, 9}
        //};
        //int fila = 0;
        //int columna = 0;
        //r.recorrerMatriz(matriz, fila, columna);

        // Punto 5 - Recursividad
        //int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
        //int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: "));
        //r.imprimirCuadrado(altura,base);

        // Punto 6 - Recursividad
        //int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        //r.invertirNumero(numero);
        //System.out.println("El numero invertido es: "+r.invertirNumero(numero));

        // Punto 7 - Recursividad
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        r.fibonacci(numero);
        System.out.println("El numero fibonacci es: "+r.fibonacci(numero));






    }

}
