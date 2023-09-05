package logica;

public class RecursividadRepaso {
    //Constructor vacio
    public RecursividadRepaso() {
    }

    public void contarDiez(int n) {
        if (n >= 10) {
            System.out.println(n);

        } else {
            System.out.println(n);
            contarDiez(n + 1);
        }
    }

    public double factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void recorrerArray(int[] array, int[] array2, int indice) {
        if (indice == array.length - 1) {
            System.out.println(array[indice]);
        } else {
            System.out.println(array[indice]);
            recorrerArray(array, array2, indice + 1);
        }
    }

    //Metodo recursivo para buscar un numero en un array nos devuelva su posicion en la lista
    public int buscarNumero(int[] array, int indice, int numero) {
        if (indice == array.length - 1) {
            if (array[indice] == numero) {
                return indice;
            } else {
                return -1;
            }
        } else {
            if (array[indice] == numero) {
                return indice;
            } else {
                return buscarNumero(array, indice + 1, numero);
            }
        }
    }

    //Metodo recursivo para retornar cuantos digitos tiene un numero
    public int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    //Punto 1 - Metodo recursivo para sumar la potencia entre dos numeros
    public int sumarPotencias(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * sumarPotencias(base, exponente - 1);
        }
    }

    //Punto 2 - Metodo recursivo que tome una palarba y la devuelva al reves
    public String invertirPalabra(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        } else {
            return palabra.charAt(palabra.length() - 1) + invertirPalabra(palabra.substring(0, palabra.length() - 1));
        }
    }

    //Punto 3 - Metodo recursivo para validar si dos arreglos son iguales
    public boolean validarArreglos(int[] array1, int[] array2, int indice) {
        if (array1.length == array2.length) {

            if (array1[indice] != array2[indice]) {
                return false;
            }else if (array1[indice] == array2[indice] && indice == array1.length-1) {
                return true;
            }else if (array1[indice] == array2[indice]) {
                return validarArreglos(array1, array2, indice + 1);
                    }
        }
            return false;

        }


    //Punto 4 - Metodo recursivo para recorrer una matriz de n x m
    public static void recorrerMatriz(int[][] matriz, int fila, int columna) {
            // Caso base: si hemos llegado al final de la matriz
            if (fila == matriz.length) {
                return;
            }

            // Imprimir el valor actual
            System.out.print(matriz[fila][columna] + " ");

        // Moverse a la siguiente columna
            if (columna < matriz[fila].length - 1) {
                recorrerMatriz(matriz, fila, columna + 1);
            }
            // Si hemos llegado al final de la fila, pasar a la siguiente fila
            else {
                recorrerMatriz(matriz, fila + 1, 0);
            }

    }

    //Punto 5- Metodo recursivo para solicitar base y altura y nos muestre un cuadrado de asteriscos
    public static void imprimirCuadrado(int fila, int lado) {
        if (fila > 0) {
            dibujarFilaAsteriscos(lado);
            imprimirCuadrado(fila - 1, lado);
        }
    }

    public static void dibujarFilaAsteriscos(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    //Punto 6 - Metodo recursivo que solicite un numero y lo devuelva invertido y como cadena
    public int invertirNumero(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return Integer.parseInt(numero % 10 + "" + invertirNumero(numero / 10));
        }
    }

    //Punto 7 - Metodo recursivo que solicita un numero y calcula la serie fibonacci
    public int fibonacci(int numero){
        if (numero == 0 || numero == 1){
            return numero;
        }else{
            return fibonacci(numero-1)+fibonacci(numero-2);
        }
    }


}

