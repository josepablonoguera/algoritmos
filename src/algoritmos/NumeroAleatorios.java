/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

/**
 *
 * @author admin
 */
public class NumeroAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] number = getRandomNumber(40);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }

    private static int[] getRandomNumber(int n) {
        int estudiantes[];
        estudiantes = new int[3];
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 40);            
            estudiantes[i] = number;
        }
        return estudiantes;
    }

}
