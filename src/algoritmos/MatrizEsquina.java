/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**xS   
 *
 * @author pablo
 */
public class MatrizEsquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = crearMatriz(2);
        System.out.println("\nMatriz orginal");
        mostrarMatriz(matriz);        
        int vec[] = insertionSort(pasaraVector(matriz));               
        matriz = asignarEsquinas(matriz, vec);       
        System.out.println("\n\nMatriz con esquinas con valores superiore");
        mostrarMatriz(matriz);

    }

    public static int[] insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }

        return array;
    }

    private static int[][] crearMatriz(int i) {

        int matriz[][] = new int[i][i];

        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[0].length; k++) {
                matriz[j][k] = (int) (Math.random() * 50);
            }
        }
        return matriz;
    }

    private static void mostrarMatriz(int[][] matriz) {

        for (int j = 0; j < matriz.length; j++) {
            System.out.println("");
            for (int k = 0; k < matriz[0].length; k++) {
                System.out.print(matriz[j][k] + "\t");
            }
        }

    }

    private static int[] pasaraVector(int[][] matriz) {
        int tam = matriz.length * matriz.length;
        int vec[] = new int[tam];
        int n = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[0].length; k++) {
                vec[n] = matriz[j][k];
                n++;
            }
        }
        return vec;
    }

    private static int[][] asignarEsquinas(int[][] matriz, int[] vec) {

        matriz[0][0] = vec[vec.length-1];
        matriz[0][matriz.length - 1] = vec[vec.length-2];
        matriz[matriz.length - 1][0] = vec[vec.length-3];
        matriz[matriz.length - 1][matriz.length - 1] = vec[vec.length-4];
        
        return matriz;

    }
}
