/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Pablo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) throws IOException {
        
        Lista nueva= new Lista();
//       NodoPersona buscar = new NodoPersona();
//        buscar.setCedula("3");
//        nueva.buscar(buscar);
        
        for (int i = 0; i < 3; i++) {
            NodoPersona persona = crearPersona();
            nueva.insertarPrimero(persona);
        }
        
        nueva.mostrar();
        
        
        NodoPersona elimina = new NodoPersona();
        elimina.setCedula("1");        
        nueva.eliminar(elimina);
        
        
        
        
//        NodoPersona buscar2 = new NodoPersona();
//        buscar2.setCedula("9");
//        nueva.buscar(buscar2);


        
//        System.out.println("_____________Vector Ordenado______________");
//        NodoPersona [] datosEnVector = nueva.ordenar(nueva);
//        for (int i = 0; i < datosEnVector.length; i++) {
//            System.out.println("Nombre: "+datosEnVector[i].getNombreCompleto());
//        }
//        
//        nueva = new Lista();
//        nueva=ordenarNodosPersona(datosEnVector);    
//        System.out.println("____________Lista Ordenada____________");
        nueva.mostrar();
                    
    }

    private static NodoPersona crearPersona() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        NodoPersona regresa = new NodoPersona();
//        System.out.println("¿Cúal es su nombre?: ");
//        regresa.setNombreCompleto(br.readLine());
        System.out.println("¿Cúal es su cédula: ?");
        regresa.setCedula(br.readLine());
        return regresa;
    }

    private static Lista ordenarNodosPersona(NodoPersona[] datosEnVector) {
       Lista ordenada = new Lista();
        for (int i = 0; i < datosEnVector.length; i++) {
			ordenada.insertarFinal(datosEnVector[i]);
        }
        return ordenada;
    }
}









